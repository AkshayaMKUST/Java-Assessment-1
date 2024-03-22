package org.division;

import org.division.exception.IncorrectDataPassedException;

import java.util.Scanner;

public class Division {
    public void performDivision()throws IncorrectDataPassedException {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the divident : ");
            int divident = sc.nextInt();
            System.out.println("Enter the divisor : ");
            int divisor = sc.nextInt();
            if (divisor==0){
                throw new IncorrectDataPassedException("Divisor you have entered is zero");
            }
            else{
                System.out.println("Divident used : "+ divident);
                System.out.println("Divisor used : "+divisor);
                float result = (float) divident /divisor;
                System.out.println("Division result : "+result);
            }
        }
    }

