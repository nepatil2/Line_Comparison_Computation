package com.bridgelabz.practice_problem;

import java.util.Scanner;

public class LineComparisonComputation1 {
    public LineComparisonComputation1(int x1, int y1, int x2, int y2){

    }

    public static void main(String[] args) {
        System.out.println("Length of Two CO-Ordinates are :");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Length of X1 Co-Ordinate :");
        int x1 = sc.nextInt();
        System.out.print("Enter Length of Y1 Co-Ordinate :");
        int y1 = sc.nextInt();
        System.out.print("Enter Length of X2 Co-Ordinate :");
        int x2 = sc.nextInt();
        System.out.print("Enter Length of Y2 Co-Ordinate :");
        int y2 = sc.nextInt();

        LineComparisonComputation1 a =new LineComparisonComputation1(x1,y1,x2,y2);
        double square = a.LengthOfLine(x1,y1,x2,y2);
        System.out.println("Length Of Line :"+square);

    }
    public double LengthOfLine(int x1, int y1, int x2, int y2){
        double length = Math.sqrt((x2-x1)*(x2-x2)+(y2-y1)*(y2-y1));
        return length;
    }
}
