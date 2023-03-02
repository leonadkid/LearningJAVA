package org.example;

public class Main
{
    private Main()
    {
    }

    public static void main(final String[] args)
    {
        boolean check = true;
        final String text = "abc ";
        for (int counter = 0; counter < text.length(); counter++) {
            final boolean currentCheck = Character.isLetter(text.charAt(counter));
            check = !currentCheck ? false : true;
        }
        System.out.println("xxxxxxxx: " + check);
    }
}
