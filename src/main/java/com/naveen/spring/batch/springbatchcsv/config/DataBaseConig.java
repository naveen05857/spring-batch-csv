package com.naveen.spring.batch.springbatchcsv.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

import javax.sql.DataSource;

@Configuration
public class DataBaseConig {

    public DataSource dataSource() {
        EmbeddedDatabaseBuilder embeddedDatabaseBuilder = new
                EmbeddedDatabaseBuilder();
       return embeddedDatabaseBuilder.addScript("classpath:org/springframework/batch/core/" +
                "schema-drop-h2.sql")
                .addScript("classpath:org/springframework/batch/core/schema-h2.sql")
                .addScript("classpath:employee.sql")
                .setType(EmbeddedDatabaseType.H2)
                .build();
    }
}
