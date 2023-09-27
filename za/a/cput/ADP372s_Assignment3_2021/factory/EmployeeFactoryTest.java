package za.a.cput.ADP372s_Assignment3_2021.factory;

/**
 * Student Name: MARVIN RENATE LAMOHR
 * Student Number: 214273830
 **/

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import za.a.cput.ADP372s_Assignment3_2021.entity.Employee;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeFactoryTest {
    private Employee employee1;
    private Employee employee2;

    @BeforeEach
    void setUp(){
        Employee employee1 = new Employee.Builder().
                setEmployeeFirstName("").
                setEmployeeLastName("").
                setEmployeeID("").
                setEmployeeContactNumber("").
                setEmployeeAddress("").
                setEmployeeEmail("").
                setPosition("").
                build();
        Employee employee2 = employee1;
    }

    @Test
    void testEquality(){
        assertEquals(employee1,employee2);
        System.out.println("It is... Equal!");
    }

    @Test
    void testIdentity(){
        assertSame(employee2,employee1);
        System.out.println("It is... Identical!");
    }

    @Test
    @Timeout(2)
    void testTimeout() throws InterruptedException {
        Thread.sleep(200);
        System.out.println("Test timed out.... Please be patient test will pass soon...!");
    }

    @Test
    @Disabled
    void testDisable(){
        assertEquals(employee2,employee1);
    }
}