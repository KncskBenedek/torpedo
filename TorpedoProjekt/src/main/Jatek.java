


package main;

import java.util.Random;
import java.util.Scanner;

public class Jatek {
   private int[] alapPalya;
   private int palyaHossz;
   private int[] holVan;
   private int[] holTalalt;
   private int hajoHossz;
   
   
   
   private void setHajo(){
       Random rnd = new Random();
       int hajoKezdet =  rnd.nextInt(palyaHossz-hajoHossz);
       for (int i = hajoKezdet; i < hajoKezdet+3; i++) {
           alapPalya[i] = 1;
       }
   }
   
   public int bemenet(){
       Scanner scr = new Scanner(System.in);
       System.out.println("Hova lövi a torpedót?(1-7)");
       int tipp = scr.nextInt()-1;
       
       return tipp;
   }
   
   public Boolean talalt_e(){
       return null;
       
   }
   
   public Boolean elsuljedt_e(){
       return null;
       
   }
   
    
    
}
