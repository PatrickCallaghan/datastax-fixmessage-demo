package com.datastax.session.dao;

import static com.datastax.driver.core.querybuilder.QueryBuilder.eq;
import static com.datastax.driver.core.querybuilder.QueryBuilder.set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.ConsistencyLevel;
import com.datastax.driver.core.Session;
import com.datastax.driver.core.Statement;
import com.datastax.driver.core.policies.DCAwareRoundRobinPolicy;
import com.datastax.driver.core.policies.DowngradingConsistencyRetryPolicy;
import com.datastax.driver.core.policies.Policies;
import com.datastax.driver.core.policies.TokenAwarePolicy;
import com.datastax.driver.core.querybuilder.QueryBuilder;
import com.datastax.driver.mapping.Mapper;
import com.datastax.driver.mapping.MappingManager;
import com.datastax.fixmessage.model.FixMessage;

public class FixMessageDao {

	private static final String TABLE = "messages";
	private static final String KEYSPACE = "datastax_fixmessage_demo";
	private static Logger logger = LoggerFactory.getLogger(FixMessageDao.class);
	private Session session;

	private Mapper<FixMessage> mapper;


	public FixMessageDao(String[] contactPoints) {

		Cluster cluster = Cluster.builder().addContactPoints(contactPoints)
				  .withLoadBalancingPolicy(new TokenAwarePolicy(new DCAwareRoundRobinPolicy()))
				  .withReconnectionPolicy(Policies.defaultReconnectionPolicy())
				  .withRetryPolicy(DowngradingConsistencyRetryPolicy.INSTANCE)
				.build();

		this.session = cluster.connect();
		mapper = new MappingManager(this.session).mapper(FixMessage.class);
	}	
	
	public void saveMessage(FixMessage message){		
		mapper.save(message);		
	}
	
	public void updateField(String field, Object value, int id){
		Statement statement = QueryBuilder.update(KEYSPACE, TABLE).with(set(field, value)).where(eq("id", id)).setConsistencyLevel(ConsistencyLevel.LOCAL_QUORUM);
		session.execute(statement);		
	}	
}
