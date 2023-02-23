package test.java;

import org.example.BinaryGap;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestBinaryGap
{
    @Test
    public void test()
    {
        BinaryGap binaryGap = new BinaryGap();

        //main function validation
        Assertions.assertEquals(2, binaryGap.solution(9)); //1001
        Assertions.assertEquals(4, binaryGap.solution(529)); //1000010001
        Assertions.assertEquals(1, binaryGap.solution(20)); //10100
        Assertions.assertEquals(0, binaryGap.solution(15)); //1111
        Assertions.assertEquals(0, binaryGap.solution(32)); //100000

        //Check boundary
        Assertions.assertEquals(0, binaryGap.solution(1)); //1
        Assertions.assertEquals(0, binaryGap.solution(2147483647)); //1111111111111111111111111111111
        Assertions.assertEquals(0, binaryGap.solution(0)); //0

        Assertions.assertEquals(0, binaryGap.solution(2)); //2
        Assertions.assertEquals(0, binaryGap.solution(-2)); //-2
    }
}
