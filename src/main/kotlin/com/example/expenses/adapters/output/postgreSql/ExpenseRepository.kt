package com.example.expenses.adapters.output.postgreSql

import com.example.expenses.application.domains.Expense
import com.example.expenses.application.ports.output.ExpenseRepositoryPort
import org.springframework.stereotype.Repository

@Repository
class ExpenseRepository (


): ExpenseRepositoryPort {
    override fun findAll(): List<Expense> {
        TODO("Not yet implemented")
    }

    override fun save(expense: Expense) {
        TODO("Not yet implemented")
    }

    override fun delete(expense: Expense) {
        TODO("Not yet implemented")
    }
}