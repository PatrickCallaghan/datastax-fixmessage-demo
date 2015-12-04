package com.datastax.session.dao;

import com.datastax.driver.mapping.annotations.Accessor;
import com.datastax.driver.mapping.annotations.Param;
import com.datastax.driver.mapping.annotations.Query;
import com.datastax.fixmessage.model.FixMessage;

@Accessor
public interface UserAccessor {
	
    @Query("SELECT * FROM datastax_fixmessage_demo.messages WHERE clientsClOrdId = :id")
    FixMessage getMessage(@Param("clientsClOrdId") String clientsClOrdId);

}