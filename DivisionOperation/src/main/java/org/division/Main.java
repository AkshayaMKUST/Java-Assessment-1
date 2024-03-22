package org.division;

import org.division.exception.IncorrectDataPassedException;

public class Main {
    public static void main(String[] args) throws IncorrectDataPassedException {
        try {
            Division division = new Division();
            division.performDivision();
        }
        catch (IncorrectDataPassedException e){
            e.printStackTrace(System.out);
        }
    }
}