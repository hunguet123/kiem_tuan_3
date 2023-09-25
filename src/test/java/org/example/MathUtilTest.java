package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MathUtilTest {
    MathUtil util = new MathUtil();
    
    // test với bảng quyết định test1 -> test5
    @Test
    void test1(){
        assertEquals(util.calculateInterest(1000.0, 0.05, 1, 1), 1050.00);
    }

    @Test
    void test2(){
        assertEquals(util.calculateInterest(1000.0, -0.05, 1, -12), 0);
    }

    @Test
    void test3(){
        assertEquals(util.calculateInterest(1000.0, 0.05, -5, 1), 0);
    }

    @Test
    void test4(){
        assertEquals(util.calculateInterest(1000.0, 0.05, -5, -12), 0);
    }

    @Test
    void test5(){
        assertEquals(util.calculateInterest(-5000.0, 0.03, 1, 1), 0);
    }
    // test với phân hoạch tương đương test 6 -> test10

    @Test
    void test6(){
        assertEquals(util.calculateInterest(1000.0, 0.05, 5, 1), 1276.2815625000003);
    }

    @Test
    void test7(){
        assertEquals(util.calculateInterest(1000.0, -2, 5, 4), 0);
    }

    @Test
    void test8(){
        assertEquals(util.calculateInterest(1000.0, -2, -4, 7), 0);
    }

    @Test
    void test9(){
        assertEquals(util.calculateInterest(1000.0, -2, -4, -5), 0);
    }

    @Test
    void test10(){
        assertEquals(util.calculateInterest(-1333.0, -3, -4, -5), 0);
    }
}
