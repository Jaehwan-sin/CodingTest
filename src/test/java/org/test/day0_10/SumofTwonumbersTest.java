package org.test.day0_10;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.test.day0_10.day0.SumofTwonumbers;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SumofTwonumbersTest {

    public SumofTwonumbersTest() {}

    @Test
    public void testSolution() {
        SumofTwonumbers sumofTwonumbers = new SumofTwonumbers();
        assertEquals(5, sumofTwonumbers.solution(2, 3));
        assertEquals(10, sumofTwonumbers.solution(5, 5));
        assertEquals(-1, sumofTwonumbers.solution(-5, 4));
    }

}