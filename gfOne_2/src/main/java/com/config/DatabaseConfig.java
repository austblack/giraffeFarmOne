package com.config;

import com.mongodb.Mongo;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;


/**
 * Created by ablackmo on 8/26/2016.
 */
@Configuration
@EnableMongoRepositories("com.bookshelf.repository")
@Import(value = MongoAutoConfiguration.class)
public class DatabaseConfig extends AbstractMongoConfiguration {


    private Mongo mongo;

    private MongoProperties mongoProperties;


    @Override
    protected String getDatabaseName() {
        return mongoProperties.getDatabase();
    }

    @Override
    public Mongo mongo() throws Exception {
       // return new MongoClient( + ":" + mongoPort);

        return null;
    }
}
