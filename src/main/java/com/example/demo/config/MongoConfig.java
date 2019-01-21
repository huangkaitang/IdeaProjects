package com.example.demo.config;

import com.mongodb.MongoClient;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.mongo.MongoProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MongoConfig {
    @Autowired
    private MongoClient mongoClient;

    // created from MongoProperties
    @Autowired
    private MongoProperties properties;

    @Bean(name = "dsForRW")
    public Datastore datastore() {
        Morphia morphia = new Morphia();

        Datastore datastore = morphia.createDatastore(mongoClient, properties.getDatabase());
        datastore.ensureIndexes();
        datastore.ensureCaps();
        return datastore;
    }
}
