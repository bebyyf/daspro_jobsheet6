import java.util.Scanner;
 public class Pemilihan2Percobaan121{
    public static void main(String[] args) {
        Scanner input21 = new Scanner (System.in);
        int tahun;
        System.out.println("Masukkan Tahun: ");
        tahun=input21.nextInt();

        if ((tahun % 4 == 0 && tahun % 100 != 0) || (tahun % 400 == 0)){
            System.out.println("Tahun Kabiset");   
        } else{
            System.out.println("Bukan Tahun Kabiset");

        }
     }
    }
 