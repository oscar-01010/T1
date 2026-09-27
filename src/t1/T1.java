/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t1;

import java.util.Scanner;

/**
 *
 * @author UCF20408
 */
public class T1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            if("123df6789".length()==9 ){
            Integer.parseInt("123d56789");
            System.out.println("ok");
        }
        }catch(NumberFormatException e){
            System.out.println("break");
        }
        
            
        System.out.println("");
    }
    
}
