package org.example;
import java.util.ArrayList;

public class BinaryGap {
    public static int solution(int N) {
        int binaryGap = 0;
        int maxGap = 0;
        String binaryString = Integer.toBinaryString(N);
        char[] characters = binaryString.toCharArray();
        System.out.println("Binary number of " + N + " is " );
        System.out.println(characters);

        ArrayList<Integer> charsIndex = new ArrayList<>();
        for(int i = 0; i < characters.length; i++){
            if(characters[i] == '1'){
                charsIndex.add(i);
            }
        }
        System.out.println("Index of the binary is " + charsIndex);
        for(int j = 1; j < charsIndex.size(); j++){
            binaryGap = charsIndex.get(j) - charsIndex.get(j-1) - 1;
            if(maxGap < binaryGap){
                maxGap = binaryGap;
            }
        }
        return maxGap;
    }
}
