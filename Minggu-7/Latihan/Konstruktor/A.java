package Konstruktor;

/**
 *
 * @author inggridamaliasabrina
 */
public class A {
    A(){} // Konstruktor default, diperlukan hanya agar program dapat
          //dikompilasi
    A (String param1){
        System.out.println("Konstruktor class A dengan Parameter " +param1 + "dieksekusi ...");
    }
    
}