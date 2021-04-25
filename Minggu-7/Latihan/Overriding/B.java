package Overriding;

/**
 *
 * @author inggridamaliasabrina
 */
public class B extends A{
    public void tampilkanKelayar(){
        super.tampilkanKelayar(); // Memanggil method milik dari superclassnya
        System.out.println("Method milik class B dipanggil");
    }
}
