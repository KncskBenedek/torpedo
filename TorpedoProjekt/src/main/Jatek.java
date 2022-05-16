
package main;

public class Jatek {
   private int[] alapPalya;
   private int palyaHossz;
   private int[] holVan;
   private int[] holTalalt;
   
   
   Jatek(int palyahossz){
       this.palyaHossz = palyahossz;
       setAlapPalya();
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
   
    
    
}
