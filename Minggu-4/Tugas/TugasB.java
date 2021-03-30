package Tugas;

/**
 *
 * @inggridamaliasabrina
 */
public class TugasB {
    public static void main(String[] args) {
        int number = 1;

        System.out.println("         Do_While");
        System.out.println("Bilangan Kelipatan 2 (1-100)");
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
    }
}
    

