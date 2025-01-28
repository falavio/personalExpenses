package com.example.expenses

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.openfeign.EnableFeignClients

@SpringBootApplication
@EnableFeignClients
class ApiForPersonalExpensesApplication

fun main(args: Array<String>) {
	runApplication<ApiForPersonalExpensesApplication>(*args)
}
