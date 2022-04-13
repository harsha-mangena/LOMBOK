package com.DTO;

import org.springframework.lang.NonNull;

/*
This Employee class contains the boiler-plate code, 
The Boiler Plate code can be defined as a set of code block with various applicable patterns, includes normal Setters and Getters, Constructors, ToString and more..
*/
public class Employee {
    //Employee Variable
    private Integer Id;
    private boolean married;
    private Integer experience;
    private Long number;
    private Float salary;

    //Dependency of Employee on Address, we must create a object for Employee even though Null 
    private Address address;

    //No Args Constructor
    public Employee()
    {
        //No Def for Default Constructor
    }

    //Parameterized Constructor
    //With out lombok the class variables checking(NotNull) during assignments will be hefty 
    public Employee(Integer id, boolean married, Integer experience, Long number, Float salary) {
        if (id == null || experience == null || number == null || salary == null)
        {
            throw new NullPointerException("Please check if any or all arguments are passed are not null");
        }
        Id = id;
        this.married = married;
        this.experience = experience;
        this.number = number;
        this.salary = salary;
    }

    //Getters and Setters for class Variables
    public int getId() {
        return Id;
    }

    public void setId(@NonNull Integer id) {
        if (id == null)
        {
            throw new NullPointerException("setId : Id can't empty");
        }
        Id = id;
    }

    public boolean isMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(@NonNull Integer experience) {
        if(experience == null)
        {
            throw new NullPointerException("setExperience : Experience can't empty");
        }
        this.experience = experience;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(@NonNull Long number) {
        if(number == null)
        {
            throw new NullPointerException("setNumber : Number can't empty");

        }
        this.number = number;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(@NonNull Float salary) {
        if (salary == null)
        {
            throw new NullPointerException("setSalary : Salary can't empty");

        }
        this.salary = salary;
    }



    @Override
    public String toString() {
        return "Employee [Id=" + Id + ", experience=" + experience + ", married=" + married
                + ", number=" + number + ", salary=" + salary + "]";
    }



}
