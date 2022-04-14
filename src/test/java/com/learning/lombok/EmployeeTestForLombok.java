package com.learning.lombok;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.DTO.EmployeeWithLombok;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EmployeeTestForLombok {

    private EmployeeWithLombok employee;

    @BeforeEach
    void setEmployee()
    {
        employee = new EmployeeWithLombok();
    }

    //Test for setId
    @Test
    void setId()
    {
        int id = 120;
        employee.setId(id);
        assertEquals(id, employee.getId());
    }

    //Test for setExperience
    @Test
    void setExp()
    {
        int experience = 10;
        employee.setExperience(experience);
        assertEquals(experience, employee.getExperience());
    }

    //Test for setSalary
    @Test
    void setSalary()
    {
        float salary = 10000;
        employee.setSalary(salary);
        assertEquals(salary, employee.getSalary());
    }

    //Test for setNumber
    @Test
    void setNumber()
    {
        Long number = null;
        employee.setNumber(number);
        assertEquals(number, employee.getNumber());
    }

    //Test for setMarried
    @Test
    void isMarried()
    {
        boolean married = true;
        employee.setMarried(married);
        assertEquals(married, employee.isMarried());
    }
    
}
