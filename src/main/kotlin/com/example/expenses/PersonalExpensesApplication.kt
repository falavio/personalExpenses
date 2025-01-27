package com.example.expenses

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ApiForPersonalExpensesApplication

fun main(args: Array<String>) {
	runApplication<ApiForPersonalExpensesApplication>(*args)
}
