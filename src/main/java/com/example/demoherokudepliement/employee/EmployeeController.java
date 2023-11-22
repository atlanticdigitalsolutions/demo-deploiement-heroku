package com.example.demoherokudepliement.employee;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("employee")
public class EmployeeController {

    private final EmployeeRepository employeeRepository;

    // Add employee

    @PostMapping
    public ResponseEntity<Employee> add(@RequestBody Employee employee){
        return ResponseEntity.status(HttpStatus.CREATED).body(employeeRepository.save(employee));
    }
    // Update employee

    @PutMapping
    public ResponseEntity<Employee> update(@RequestBody Employee employee){
        return ResponseEntity.status(HttpStatus.CREATED).body(employeeRepository.save(employee));
    }
    // all employees

    @GetMapping
    public ResponseEntity<List<Employee>> findAll(){
        return ResponseEntity.ok(employeeRepository.findAll());
    }
    // Employee by id

    @GetMapping("/{id}")
    public ResponseEntity<Employee> findById(@PathVariable long id){
        return ResponseEntity.ok(employeeRepository.findById(id)
                .orElseThrow(() -> new RessourceNotFound("Lemployee avec cet identifiant n'existe pas !!!")));
    }

}
