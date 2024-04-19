/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package claasify;

/**
 *
 * @author EddiE
 */

import java.util.*;
 

public class Claasify {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        male Mo = new male();
        female Fo = new female();  
       
         System.out.print(" choose between male and female \n :"
                 + "1 : male \n"
                 + " 2 : female \n");
         
     
 
        
        int num;
        num =sc.nextInt();
      
        switch(num){
            case 1: Mo.display();
                    break ;
            case 2:Fo.display();
        }
        // TODO code application logic here
    }
     
}
