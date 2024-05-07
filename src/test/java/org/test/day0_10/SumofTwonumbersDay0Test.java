package org.test.day0_10;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SumofTwonumbersDay0Test {

    public SumofTwonumbersDay0Test() {}

    @Test
    public void testSolution() {
        SumofTwonumbers_day0 sumofTwonumbersDay0 = new SumofTwonumbers_day0();
        assertEquals(5, sumofTwonumbersDay0.solution(2, 3));
        assertEquals(10, sumofTwonumbersDay0.solution(5, 5));
        assertEquals(-1, sumofTwonumbersDay0.solution(-5, 4));
    }

}