package com.example.demoherokudepliement;

import com.example.demoherokudepliement.employee.Employee;
import com.example.demoherokudepliement.employee.EmployeeRepository;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@SpringBootApplication
@RequiredArgsConstructor
public class DemoHerokuDepliementApplication {

    private final EmployeeRepository employeeRepository;

    public static void main(String[] args) {
        SpringApplication.run(DemoHerokuDepliementApplication.class, args);
    }

    @PostConstruct
    public void initDate(){
        Employee empl1 = new Employee("PMD162622", "Papa Matar", "Dieng", "papamatar123@gmail.com", "775567743","Yoff-Dakar-Sénégal");
        Employee empl2 = new Employee("RD3839339", "Rokhaya", "Diop", "dioprokhaya123@gmail.com", "772822282","Ouakam-Dakar-Sénégal");
        Employee empl3 = new Employee("BG6776557", "Balla", "Gningue", "balla123@gmail.com", "787778654","Keur Massar-Dakar-Sénégal");
        Employee empl4 = new Employee("MD1912200", "Mouhamed", "Diamanka", "diamanka123@gmail.com", "764321123","Dakar-Sénégal");
        Collection<Employee> employees = new ArrayList<>();
        employees.add(empl1); employees.add(empl2);employees.add(empl3);employees.add(empl4);
        employeeRepository.saveAll(employees);
    }

}
