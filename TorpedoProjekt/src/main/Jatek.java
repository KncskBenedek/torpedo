
package main;

public class Jatek {
   private int[] alapPalya;
   private int palyaHossz;
   private int[] holVan;
   private boolean[] holTalalt;
   public static final String[] VALASZOK = {"nem talált", "talált", "talált és süllyedt"}; 
   
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
       
   }
   public Boolean talalt_e(){
       return null;
       
   }
   
   public Boolean elsuljedt_e(){
       return null;
       
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
