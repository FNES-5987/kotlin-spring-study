package com.example.commerce

import jakarta.annotation.PostConstruct
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.openfeign.EnableFeignClients
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.context.annotation.Configuration
import org.springframework.data.redis.core.RedisTemplate
import org.springframework.scheduling.annotation.EnableScheduling
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable

@SpringBootApplication
@EnableFeignClients
@EnableScheduling
class CommerceApplication

fun main(args: Array<String>) {
	runApplication<CommerceApplication>(*args)
}

@Configuration
class RedisConfig(private val redisTemplate:RedisTemplate<String, String>){
	@PostConstruct
	fun getConnection() {

	}
}