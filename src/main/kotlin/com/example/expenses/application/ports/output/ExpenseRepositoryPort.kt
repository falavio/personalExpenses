package com.example.expenses.application.ports.output

import com.example.expenses.application.domains.Expense

interface ExpenseRepositoryPort {

    fun findAll(): List<Expense>

    fun save(expense: Expense)

    fun delete(expense: Expense)
}