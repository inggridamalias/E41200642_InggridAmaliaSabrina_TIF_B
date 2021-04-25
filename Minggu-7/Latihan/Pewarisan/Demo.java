package Pewarisan;

/**
 *
 * @author inggridamaliasabrina
 */
public class Demo {
    public static void main(String[] args) {
        A superOb = new A();
        B subOb = new B();
        
        System.out.println("SuperClass");
        superOb.x = 10;
        superOb.y = 20;
        superOb.TampilkanNilaiXY();
        
        System.out.println("SubClass");
        superOb.x = 5;
        superOb.y = 4;
        superOb.TampilkanNilaiXY();
        
        //member tambahan yang hanya ada pada subclass
        subOb.z = 50;
        subOb.TampilkanJumlah();
    }
}
