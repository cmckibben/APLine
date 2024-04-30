package org.example;

public class Main {
    public static void main(String[] args) {
        APLine line1 = new APLine(5,4,-17);
        System.out.println("line1 slope should be -1.25. It is: " + line1.getSlope());
        System.out.println("(5,-2) should be on line1. We get " + line1.isOnLine(5,-2));

        APLine line2 = new APLine(-25,40,30);
        System.out.println("line2 slope should be 0.625. It is: " + line2.getSlope());
        System.out.println("(5,-2) should not be on line2. We get " + line2.isOnLine(5,-2));
    }
}