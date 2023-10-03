package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MathUtilTest {
    MathUtil util = new MathUtil();
    
    // test với bảng quyết định test1 -> test5
    @Test
    void test1(){
        assertEquals(util.calculateInterest(-5, 1, 1, 1), 0);
    }

    @Test
    void test2(){
        assertEquals(util.calculateInterest(1, 1, 1, 1), 2);
    }
}
