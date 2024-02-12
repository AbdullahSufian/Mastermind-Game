/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mastermind;

import java.util.Scanner;

/**
 *
 * @author Abdula Sofian
 */
public class Mastermind {
static Scanner input = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        System.out.println("How Mani Do You Want Code length   (4/6/8)");
        
//        int l=input.nextInt();
        
        int arr[]=new int[4];
        
        
        for (int i = 0; i < arr.length; i++) {
            
            arr[i]=(1+(int)(Math.random()*8));
            System.out.println(arr[i]);
            
    }
        
        System.out.println("****************************************");
        
        boolean t=false;

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter your try");
            int a=input.nextInt();
            int b=input.nextInt();
            int c=input.nextInt();
            int d=input.nextInt();
            
            if(arr[0]==a)
                        System.out.println(arr[0]+" is find  in the  correct place");
                    else if(arr[0]==b)
                        System.out.println(arr[0]+" is find but not in the correct place");
                    else if(arr[0]==c)
                        System.out.println(arr[0]+" is find but not in the correct place");
                    else if(arr[0]==d)
                        System.out.println(arr[0]+" is find but not in the correct place");
                    
                    ///////////////////////////////////////////////////////////////////////////////
                    if(arr[1]==a)
                        System.out.println(arr[1]+" is find  but is not in the  correct place");
                    else if(arr[1]==b)
                        System.out.println(arr[1]+" is find  in the correct place");
                    else if(arr[1]==c)
                        System.out.println(arr[1]+" is find but not in the correct place");
                    else if(arr[1]==d)
                        System.out.println(arr[1]+" is find but not in the correct place");
                    
                    ////////////////////////////////////////////////////////////////////////////////
                    if(arr[2]==a)
                        System.out.println(arr[2]+" is find  but is not in the  correct place");
                    else if(arr[2]==b)
                        System.out.println(arr[2]+" is find but is not in the correct place");
                    else if(arr[2]==c)
                        System.out.println(arr[2]+" is find in the correct place");
                    else if(arr[2]==d)
                        System.out.println(arr[2]+" is find but is not in the correct place");
                    
                    /////////////////////////////////////////////////////////////////////////////////
                    if(arr[3]==a)
                        System.out.println(arr[3]+" is find but not in the  correct place");
                    else if(arr[3]==b)
                        System.out.println(arr[3]+" is find but not in the correct place");
                    else if(arr[3]==c)
                        System.out.println(arr[3]+" is find but not in the correct place");
                    else if(arr[3]==d)
                        System.out.println(arr[3]+" is find in the correct place");
            
           
                if(a==arr[0] && b==arr[1]&& c==arr[2]&& d==arr[3]){
                   t=true;
              
                }
                if (t) {
                        System.out.println("Congratulations! You guessed the code.");
                        break;
                    } else {
                        System.out.println("Sorry, you didn't guess the code.");
                    }
            
        }
    

                
            
            
        
}
        
}          
        