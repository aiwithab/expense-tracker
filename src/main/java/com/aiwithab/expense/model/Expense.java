package com.aiwithab.expense.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.time.Instant;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Table(name = "expense")
public class Expense {
    public Long getId () {
        return id;
    }

    public void setId (Long id) {
        this.id = id;
    }

    public Instant getExpenseDate () {
        return expenseDate;
    }

    public void setExpenseDate (Instant expenseDate) {
        this.expenseDate = expenseDate;
    }

    public String getDescription () {
        return description;
    }

    public void setDescription (String description) {
        this.description = description;
    }

    @Id
    private Long id;

    private Instant expenseDate;

    private String description;





}
