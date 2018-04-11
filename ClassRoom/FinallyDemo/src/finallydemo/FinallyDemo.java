/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finallydemo;

import java.io.IOException;

/**
 *
 * @author Home
 */
public class FinallyDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        java.io.PrintWriter output = null;
        
        try{
            //create a file
            output = new java.io.PrintWriter("text.txt");
            //Write formatted output to the file
            output.println("Welcome to java");
            
        }catch(IOException ex){
            ex.printStackTrace();//tambien se puede implementar  e.getMessage
        }finally{
            //Close the file
            if(output != null){
                output.close();
            }
            System.out.println("End of program");
        }
    }
}
