/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package billetes;


import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Billetes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
          float division=0;  
          float residuo=0;
          int forzar;
          
          Scanner numero= new Scanner (System.in);
         float monto=numero.nextFloat();
         
         
         
        if(monto>500){
          division=monto/500;
          residuo=monto%500;
          forzar=(int)division;
          if(forzar!=0)
         System.out.println("Billetes de 500: "+ forzar);
            monto=residuo;
            residuo=0;
        } 
    
        
        if(monto>0){
          division=monto/200;
          residuo=monto%200;
          forzar=(int)division;
         if(forzar!=0)
         System.out.println("Billetes de 200: "+forzar);
         monto=residuo;
        residuo=0;
        } 
          
        if(monto>0){
          division=monto/100;
          residuo=monto%100;
          forzar=(int)division;
          if(forzar!=0)
         System.out.println("Billetes de 100: "+forzar);
         monto=residuo;
        residuo=0;
        } 
         if(monto>0){
          division=monto/20;
          residuo=monto%20;
          forzar=(int)division;
          if(forzar!=0)
         System.out.println("Monedas de 20: "+forzar);
         monto=residuo;
        residuo=0;
        } 
           if(monto>0){
          division=monto/10;
          residuo=monto%10;
          forzar=(int)division;
          if(forzar!=0)
         System.out.println("Monedas de 10: "+forzar);
         monto=residuo;
        residuo=0;
        } 
              if(monto>0){
          division=monto/5;
          residuo=monto%5;
          forzar=(int)division;
          if(forzar!=0)
         System.out.println("Monedas de 5: "+forzar);
         monto=residuo;
        residuo=0;
        } 
                if(monto>0){
          division=monto/1;
          residuo=monto%1;
          forzar=(int)division;
          if(forzar!=0)
         System.out.println("Monedas de 1: "+forzar);
         monto=residuo;
        residuo=0;
        } 
               if(monto>0){
          division=(float) (monto/0.5);
          residuo=(float) (monto%0.5);
          forzar=(int)division;
          if(forzar!=0)
         System.out.println("Monedas de 0.50: "+division);
         monto=residuo;
        residuo=0;
        }        
        }
       
    }
    

