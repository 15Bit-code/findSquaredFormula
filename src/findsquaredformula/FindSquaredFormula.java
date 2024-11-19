/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package findsquaredformula;

import java.util.Scanner;

/**
 *
 * @author noahgillis
 */
public class FindSquaredFormula {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Input number: ");
        
        int num = scnr.nextInt();
        
        FindSquaredFormula squared = new FindSquaredFormula();
        
        var text = squared.printFormula(num);
        
        System.out.println(text);
    }
    
    public String printFormula(int num) {
        int i;
        int iSquared;
        
        boolean noPlus = true;
        
        String numString = num + " =";
        while (num > 0) {
            boolean isBigger = true;
            i = 1;
            while (isBigger) {
                iSquared = (int) Math.pow(i, 2);
                if (num > Math.pow(i, 2)) {
                    System.out.println(num + " > " + iSquared);
                    i++;
                }
                else if (num == Math.pow(i, 2)) {
                    System.out.println(num + " = " + iSquared);
                    isBigger = false;
                }
                else {
                    System.out.println(num + " < " + iSquared);
                    isBigger = false;
                    i--;
                }
            }
            
            if (noPlus) {
                numString += " " + i + "^2";
                noPlus = false;
            }
            else {
                numString += " + " + i + "^2";
            }
            
            num -= Math.pow(i, 2);
        }
        
        return numString;
    }
    
}
