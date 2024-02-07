package tombokhasznalata;

public class TombokHasznalata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //indexek:         0      1       2
        //python lista = ["alma","körte","barack"];
        String[] tomb = {"egy", "kettő", "három"};
        //memória cimet irja ki, nem a tartalmat.
        System.out.println("tomb  " + tomb);
        //a tömb mérete nem változtatható!
        
        for (int i=0; i<tomb.length; i++){
            System.out.printf("[%d, index] = %s\n", i, tomb[i]);
        }
        
        //mérete nem változhat, de uj tömb lehet
        tomb = new String[4];//megadom az új méretét, minden elem értéke:
        for (int i = 0; i < tomb.length; i++) {
            System.out.printf(" [%d, index] = %s\n", i, tomb[i]);
        }
        tomb[2] = "zwei";
        System.out.println("részben - németül- feltöltött tömb: ");
        for (int i = 0; i < tomb.length; i++) {
            System.out.printf(" [%d, index] = %s\n", i, tomb[i]);
        }
        System.out.println("teljesen angolul feltöltött tömb: ");
        tomb[0] = "null";
        tomb[1] = "one";
        tomb[2] = "two";
        tomb[3] = "thre";
        for (int i = 0; i < tomb.length; i++) {
            System.out.printf(" [%d, index] = %s\n", i, tomb[i]);
        }
    }

}
