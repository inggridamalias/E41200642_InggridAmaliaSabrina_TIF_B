package AlgoritmaPengurutanDanPencarian;
import java.util.Scanner;

/**
 *
 * @author inggridamaliasabrina
 */
public class Descending {
    public static void main(String[] args) {
        int Data,N = 0;
        int i, j, a, temp;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah Data yang akan diinputkan : ");
        try{
            N=input.nextInt();
        }
        catch(Exception e){
            System.out.println("Data Harus Berupa angka!!!");
        }
        int angka[] = new int[N];
        int angka_desc[] = new int[N];
        for(i=0;i<N;i++){
            System.out.print("Input nilai data ke - " + (i+1) + " : ");
            try{
                Data = input.nextInt();
                angka[i]=Data;
                angka_desc[i]=Data;
            }
            catch(Exception e){
                System.out.println("Data Harus Berupa angka!!!");
            }
        }
        for(i=0;i<N-1;i++){
            for(j=i+1;j<N;j++){
                if(angka_desc[i]< angka_desc[j]){
                    temp=angka_desc[i];
                    angka_desc[i]=angka_desc[j];
                    angka_desc[j]=temp;
                }
            }
        }
        System.out.print("\n\nData sebelum diurutkan :                 \n");
        for(i=0;i<N;i++){
            System.out.print(angka[i] + "  ");
        }
        System.out.print("\nData setelah diurutkan Descending :             \n");
        for(i=0;i<N;i++){
            System.out.print(angka_desc[i] + "  ");
        }
        System.out.println("");

    }
}