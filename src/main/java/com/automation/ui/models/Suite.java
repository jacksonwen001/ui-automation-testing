package com.automation.ui.models;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "suites")
public class Suite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
