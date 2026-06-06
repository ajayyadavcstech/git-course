import org.junit.jupiter.api.*;
import orgs.ajay.Calculate;

import static org.junit.jupiter.api.Assertions.*;

public class TestTrail {
    Calculate calculate;

    TestTrail(){
        System.out.println("Constructor Running");
    }

    @BeforeAll
    static void initializerSingleTime(){
        System.out.println("Before All");
    }
    @BeforeEach
    void init(){
        calculate = new Calculate();
        System.out.println("Before Each Test");
    }

    @Test
    void test() {

        assertNotEquals(23,calculate.calculateArea(4,5),"Area calculation is wrong");
    }

    @Test
    void test_Supplier() {
        assertEquals(20 ,calculate.calculateArea(4,5),()->"Area calculation is wrong");
    }
    @AfterEach
    void clear(){
        calculate = null;
        System.out.println("After Each Test");
    }
    @AfterAll
    static void initializerAfterAll(){
        System.out.println("After All");
    }
}