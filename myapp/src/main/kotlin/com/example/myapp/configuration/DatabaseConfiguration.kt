package com.example.myapp.configuration

import org.jetbrains.exposed.sql.Database
import org.jetbrains.exposed.sql.DatabaseConfig
import org.springframework.context.annotation.Bean
import javax.sql.DataSource

class DatabaseConfiguration (val dataSource: DataSource) {

    @Bean
    fun databaseConffig() : DatabaseConfig {
        return DatabaseConfig { useNestedTransactions = true }
    }

    @Bean
    fun database() : Database {
        return Database.connect(dataSource)
    }
}