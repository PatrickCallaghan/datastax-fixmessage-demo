Fix Message Demo
================

This is a small demo to insert fix messages used to exchange financial information. 

## Schema Setup
Note : This will drop the keyspace "datastax_session_management_demo" and create a new one. All existing data will be lost. 

To specify contact points use the contactPoints command line parameter e.g. 

	'-DcontactPoints=192.168.25.100,192.168.25.101'
	
The contact points can take mulitple points in the IP,IP,IP (no spaces).

To create the a single node cluster with replication factor of 1 for standard localhost setup, run the following

To create the schema, run the following

	mvn clean compile exec:java -Dexec.mainClass="com.datastax.demo.SchemaSetup" -DcontactPoints=localhost
		
To create a Solr code to allow it to be searchable, run

	dsetool create_core datastax_fixmessage_demo.messages generateResources=true 
	
To create some orders and updates, run the following 
	
	mvn clean compile exec:java -Dexec.mainClass="com.datastax.fixmessage.Main" -DcontactPoints=localhost
	
To remove the tables and the schema, run the following.

    mvn clean compile exec:java -Dexec.mainClass="com.datastax.demo.SchemaTeardown" -DcontactPoints=localhost
    
    
