package Pewarisan;

/**
 *
 * @author inggridamaliasabrina
 */
public class B extends A{ // Mendeklarasikan Class B yang diturunkan
    int z;                // dari Class A
    
    void TampilkanJumlah(){
        // subclass dapat mengakses member dari superclass
        System.out.println("Jumlah :" + (x+y+z));
    }
    
}
