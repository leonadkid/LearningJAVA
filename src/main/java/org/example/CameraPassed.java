package org.example;

import java.util.ArrayList;
import java.util.List;

public class CameraPassed
{
    public int solution(String s)
    {
        if (s == null || s.isEmpty()) {
            return 0;
        }
        final int length = s.length();
        final List<String> camerasPassed = new ArrayList<>();
        for (int count = 0; count < s.length(); count++) {
            final char current = s.charAt(count);
            if (current == '<') {
                camerasPassed.add(s.substring(0, count));
            }
            else if (current == '>') {
                camerasPassed.add(s.substring(count, length));
            }
        }
        return camerasPassed.stream().mapToInt(x -> x.replaceAll("<", "")
                .replaceAll(">", "").length()).sum();
    }
}
