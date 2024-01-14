package com.project.pgmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableJpaRepositories(basePackages="com.project.pgmanagement")
@EnableTransactionManagement
@EntityScan(basePackages="com.project.pgmanagement")
public class PgmanagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(PgmanagementApplication.class, args);
    }

}
