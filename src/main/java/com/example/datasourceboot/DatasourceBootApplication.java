package com.example.datasourceboot;

import com.example.datasourceboot.dao.EmployeeDao;
import com.example.datasourceboot.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RequiredArgsConstructor
public class DatasourceBootApplication implements CommandLineRunner {

    private final EmployeeService employeeService;

    public static void main(String[] args) {
        SpringApplication.run(DatasourceBootApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
//     employeeService.doAction();
    }
}
