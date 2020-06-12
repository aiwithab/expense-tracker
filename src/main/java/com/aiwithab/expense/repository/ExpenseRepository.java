package com.aiwithab.expense.repository;

import com.aiwithab.expense.model.Expense;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpenseRepository extends JpaRepository<Expense, Long> {

}