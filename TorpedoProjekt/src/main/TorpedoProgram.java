
package main;

public class TorpedoProgram {

    public static void main(String[] args) {
       Jatek j1 = new Jatek();
       boolean nemNyert = true; 
       
        do{
            int tipp = j1.bemenet();
            if (j1.talalt_e(tipp)) {
                
                if (j1.elsuljedt_e()) {
                    nemNyert = false;
                    System.out.println(Jatek.VALASZOK[2]);
                }else{
                    System.out.println(Jatek.VALASZOK[1]);
                }
            }else{
                System.out.println(Jatek.VALASZOK[0]);
            }
            
        }while(nemNyert);
    }
    
}
