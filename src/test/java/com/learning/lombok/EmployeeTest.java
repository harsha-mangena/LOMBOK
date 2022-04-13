package com.learning.lombok;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.DTO.Employee;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EmployeeTest {
    //Object for Emplyee Class
    private Employee emp;
    @BeforeEach
        void EmplyeeSet()
        {
            emp = new Employee();
        }

        //Test for setName
        @Test
        void testName()
        {
            emp.setId(101);
            int id = emp.getId();
            assertEquals(101, id);
        }

        //Test for setMarried
        @Test
        void testMarried()
        {
            emp.setMarried(true);
            boolean isMarried = emp.isMarried();
            assertEquals(true, isMarried);
        }

        //Test for setSalary
        @Test
        void testSalary()
        {
            float originalSalary = (float)10000;
            emp.setSalary((float)originalSalary);
            float salary =emp.getSalary();
            assertEquals(originalSalary, salary);
        }

        //Test for setExperience
        @Test
        void testExperience()
        {
            int exp = 10;
            emp.setExperience(exp);
            assertEquals(exp, emp.getExperience());
        }

}
