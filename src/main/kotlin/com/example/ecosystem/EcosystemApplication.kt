package com.example.ecosystem

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration
import org.springframework.boot.runApplication

@SpringBootApplication(exclude =  [ DataSourceAutoConfiguration::class ])
class EcosystemApplication

fun main(args: Array<String>) {
	runApplication<EcosystemApplication>(*args)
}
