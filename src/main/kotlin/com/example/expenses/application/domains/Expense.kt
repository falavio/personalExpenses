package com.example.expenses.application.domains


import java.math.BigDecimal
import java.time.LocalDate

data class Expense(
    val id: Long? = null,
    val date: LocalDate, // Data
    val type: ExpenseType, // Tipo de despesa
    val paymentMethod: String, // Meio de pagamento
    val amount: BigDecimal, // Valor
    val note: String? = null // Observação (opcional)
)
