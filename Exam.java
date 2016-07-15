/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exam;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Exam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        if(n>0)
            System.out.println("it is positive number");
        else
            if(n<0)
            System.out.println("it is negative number");
            else
                System.out.println("it is zero");
    }
}
