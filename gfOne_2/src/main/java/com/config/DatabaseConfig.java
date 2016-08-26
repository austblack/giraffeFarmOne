package com.config;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;

/**
 * Created by ablackmo on 8/26/2016.
 */
public class DatabaseConfig extends AbstractMongoConfiguration {
    @Override
    protected String getDatabaseName() {
        return null;
    }

    @Override
    public Mongo mongo() throws Exception {
       // return new MongoClient( + ":" + mongoPort);

        return null;
    }
}
