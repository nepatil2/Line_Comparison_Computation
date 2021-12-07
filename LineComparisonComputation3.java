package com.bridgelabz.practice_problem;

import java.util.Objects;
import java.util.Scanner;

public class LineComparisonComputation3 {
    public LineComparisonComputation3(int x1, int y1, int x2, int y2){

    }

    public static void main(String[] args) {
        System.out.println("Length of Two CO-Ordinates are :-");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Length of X1 Co-Ordinate :");
        int x1 = sc.nextInt();
        System.out.print("Enter Length of Y1 Co-Ordinate :");
        int y1 = sc.nextInt();
        System.out.print("Enter Length of X2 Co-Ordinate :");
        int x2 = sc.nextInt();
        System.out.print("Enter Length of Y2 Co-Ordinate :");
        int y2 = sc.nextInt();

        LineComparisonComputation3 a =new LineComparisonComputation3(x1,y1,x2,y2);
        double line1 = a.LengthOfLine1(x1,y1);
        System.out.println("Length Of Line1 : "+line1);
        double line2 = a.LengthOfLine1(x2,y2);
        System.out.println("Length Of Line2 : "+line2);

        System.out.println(Objects.equals(line1,line2));
        boolean l1 = a.compareTo((int) line1,(int) line2);
        boolean l2 = a.compareTo1((int) line1,(int) line2);;
        if(l1){
            System.out.println("Line One Is Greater Than Line Two");
        }
        else if (l2){
            System.out.println("Line One Is Lesser Than Line Two");
        }
        else{
            System.out.println("Both Lines Are Equal");
        }

    }
    public double LengthOfLine1(int x1, int y1){
        double length1 = Math.sqrt((x1-y1)*(x1-y1));
        return length1;
    }

    public double LengthOfLine2(int x2, int y2){
        double length2 = Math.sqrt((x2-y2)*(x2-y2));
        return length2;
    }
    public boolean compareTo(int line1 , int line2){
        boolean l1 =(line1 > line2);
        return l1;
    }
    public boolean compareTo1(int line1 , int line2){
        boolean l2 =(line1 < line2);
        return l2;
    }
}
