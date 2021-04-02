package Tugas;

/**
 *
 * @inggridamaliasabrina
 */
public class TugasB {
    public static void main(String[] args) {
        //Case 1 : Perkalian 2
        int number = 2;

        System.out.println("         Case 1");
        System.out.println("    Perkalian 2 (1-100)");
        System.out.println("============================");

        System.out.print("     " + number + " ");
        do {
            number *= 2;
            if (number > 100){
                break;
            }
            System.out.print(number + " ");
        } while (number < 100);
        System.out.println("");
        
        //Case 2 : Kelipatan 2
        int bil;
        
        System.out.println("----------------------------");
        System.out.println("         Case 2");
        System.out.println("    Kelipatan 2 (1-100)");
        System.out.println("============================");
        for(bil=2;bil<=100;bil++)
            if(bil%2==0)
                System.out.print(" " + bil + " ");
        }
        
        
    }

    

