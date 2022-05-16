


package main;

import java.util.Random;
import java.util.Scanner;

public class Jatek {
   private int[] alapPalya;
   private int palyaHossz;
   private int[] holVan;
   private boolean[] holTalalt;
   public static final String[] VALASZOK = {"nem talált", "talált", "talált és süllyedt"};
   private int hajoHossz;
   

   
   Jatek(){
       this(7);
   }
   Jatek(int palyahossz){
       this.palyaHossz = palyahossz;
       setAlapPalya();
       //setHajo(); ebben van hogy hol vannak
      setHolTalalt();
   }   
   
   private void setHajo(){
       Random rnd = new Random();
       int hajoKezdet =  rnd.nextInt(palyaHossz-hajoHossz);
       for (int i = hajoKezdet; i < hajoKezdet+3; i++) {
           alapPalya[i] = 1;
       }
       for (int i = 0; i < hajoHossz; i++) {
           holVan[i] = hajoKezdet;
           hajoKezdet++;
       }
   }
   
   public int bemenet(){
       Scanner scr = new Scanner(System.in);
       System.out.println("Hova lövi a torpedót?(1-7)");
       int tipp = scr.nextInt()-1;
       
       return tipp;
   }
   
   public Boolean talalt_e(int tipp){
       
       
       
       return null;
       
   }
   
   public Boolean elsuljedt_e(){
       int i = 0;
       while(i < holTalalt.length && holTalalt[i] == true){
           i++;
       }
       if (i < holTalalt.length-1){
           return false;
       }else{
           return true;
       }
       
       
   }

    private void setAlapPalya() {
           this.alapPalya = new int[palyaHossz];
           for (int i = 0; i < palyaHossz; i++) {
               alapPalya[i] = 0;
            }
    }

    private void setHolTalalt() {
        this.holTalalt = new boolean[hajoHossz];
    }
   
    
    
}
