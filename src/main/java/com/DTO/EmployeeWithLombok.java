package com.DTO;

import java.beans.JavaBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Data
public class EmployeeWithLombok {
    //Class variables
    // @Getter
    // @Setter
    @NonNull
    private Integer Id;

    // @Getter
    // @Setter
    private boolean married;

    // @Getter
    // @Setter
    @NonNull
    private Integer experience;

    // @Getter
    // @Setter
    private Long number;

    // @Getter
    // @Setter
    @NonNull
    private Float salary;

    public EmployeeWithLombok(@NonNull Integer id, boolean married, @NonNull Integer experience, Long number, @NonNull Float salary) {
        Id = id;
        this.married = married;
        this.experience = experience;
        this.number = number;
        this.salary = salary;
    }


    //No Argument Constructor
    /* @NoArgsConstructor -> replaces/defines the conventional default constructor for class

        public EmployeeWithLombok(){}
     */

    //Parameterized Constructor Constructor
    /* @AllArgsConstructor -> replaces/defines the all arguments or parameterized constructor

        public EmployeeWithLombok(int id, boolean married, int experience, long number, float salary)
        {
            assignments
        }
    
    */

    //Setters & Getters
    /* @Setter, @Getter are used to replace/eliminate the conventional way of writing the setter(void setAge(int age)) & Getter(int getAge()) */

    //ToString
    /*@ToString is used to generate the ToString() method for class*/

    //NonNull
    /* 
    Checks for all the constructor , methods arguments are NonNull, If Null except a NullPointerException
    
    Normal Definition
    -----------------
    if (id == null || experience == null || number == null || salary == null)
        {
            throw new NullPointerException("Please check if any or all arguments are passed are not null");
        }
    
    Method
    ------
    calculateBonus(@NonNull int bonus)
    {
        if (bonus == null)
        {
            throw new Exception("Error : Bonus can't be empty")
        }
    }

    **@Data is shortcut combination for @ToString, @Getter, @Setter, @ReqArgsConstructor -> Creates for eah class variable
     */
   
}
