
package main;

public class TorpedoProgram {

    public static void main(String[] args) {
       Jatek j1 = new Jatek();
        for (int i = 0; i < 5; i++) {
            int tipp = j1.bemenet();
            if (j1.talalt_e(tipp)) {
                if (j1.elsuljedt_e()) {
                    System.out.println(Jatek.VALASZOK[2]);
                }else{
                    System.out.println(Jatek.VALASZOK[1]);
                }
            }else{
                System.out.println(Jatek.VALASZOK[0]);
            }
            
        }
    }
    
}
