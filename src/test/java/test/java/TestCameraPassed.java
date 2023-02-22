package test.java;

import org.example.CameraPassed;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class TestCameraPassed {
    private CameraPassed cameraPassed = new CameraPassed();

    @Test
    public void testSample(){
        String inPutString = ".<.><.";
        int actual = cameraPassed.solution(inPutString);
        int expected = 4;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSingleCharsDot(){
        String inPutString = ".";
        int actual = cameraPassed.solution(inPutString);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSingleCharsRight(){
        String inPutString = ">";
        int actual = cameraPassed.solution(inPutString);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSingleCharsLeft(){
        String inPutString = "<";
        int actual = cameraPassed.solution(inPutString);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testTwoCharsDot(){
        String inPutString = "..";
        int actual = cameraPassed.solution(inPutString);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testTwoCharsRight(){
        String inPutString = ">>";
        int actual = cameraPassed.solution(inPutString);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testTwoCharsLeft(){
        String inPutString = "<<";
        int actual = cameraPassed.solution(inPutString);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testThreeCharsDot(){
        String inPutString = "...";
        int actual = cameraPassed.solution(inPutString);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testThreeCharsRight(){
        String inPutString = ">>>";
        int actual = cameraPassed.solution(inPutString);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testThreeCharsLeft(){
        String inPutString = "<<<";
        int actual = cameraPassed.solution(inPutString);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testThreeChars1(){
        String inPutString = ".<<";
        int actual = cameraPassed.solution(inPutString);
        int expected = 2;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testThreeChars2(){
        String inPutString = ".>>";
        int actual = cameraPassed.solution(inPutString);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testThreeChars3(){
        String inPutString = ">..";
        int actual = cameraPassed.solution(inPutString);
        int expected = 2;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testThreeChars4(){
        String inPutString = "><<";
        int actual = cameraPassed.solution(inPutString);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testThreeChars5(){
        String inPutString = "<..";
        int actual = cameraPassed.solution(inPutString);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testThreeChars6(){
        String inPutString = "<>>";
        int actual = cameraPassed.solution(inPutString);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }
}
