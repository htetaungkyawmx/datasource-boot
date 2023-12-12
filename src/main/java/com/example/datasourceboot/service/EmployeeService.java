package com.example.datasourceboot.service;

import com.example.datasourceboot.dao.EmployeeDao;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.sql.Date;

@Service
@RequiredArgsConstructor
public class EmployeeService {
    private final EmployeeDao employeeDao;

    public void doAction(){
        System.out.println("FindAllEmails");
        employeeDao.findAllEmails().forEach(System.out::println);
        System.out.println();
        System.out.println("ListAllEmployees:");
        employeeDao.findALlEmployee().forEach(System.out::println);
        System.out.println();
        System.out.println("Find Employee ById::");
        System.out.println(employeeDao.findEmployeeById(2));
        System.out.println();
//        System.out.println("create new employee:");
//        employeeDao.createEmployee(4,"MX7","Peter",
//                "MX7@gmail.com","55-555-55", Date.valueOf("2023-12-12"),
//                3500
//            );
        System.out.println();
        System.out.println("ListAllEmployee:");
        employeeDao.findALlEmployee().forEach(System.out::println);
        employeeDao.changeFirstName(2,"MX7");
        System.out.println();
        System.out.println("ListAllEmployee:");
        employeeDao.findALlEmployee().forEach(System.out::println);
        System.out.println();
        System.out.println("High Salary Employee:");
        System.out.println(employeeDao.highSalaryEmployee());
        System.out.println();
        System.out.println("AvgNativeWay::");
        System.out.println(
                String.format("AVG: %3.f",employeeDao.avgSalary())
        );
        System.out.println("AvgModernWay::");
        System.out.println(
                String.format("AVGModern:: %3.f"
                         ,employeeDao.avgSalaryModernWay())
        );
    }
}
