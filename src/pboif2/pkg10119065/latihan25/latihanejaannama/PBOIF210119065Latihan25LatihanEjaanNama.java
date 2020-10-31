package pboif2.pkg10119065.latihan25.latihanejaannama;

import java.util.Scanner;

/*
 * @author
 * NAMA                 : Fachriansyah Muhammad Nur Ihsan
 * KELAS                : PBOIF2
 * NIM                  : 10119065
 * Deskripsi Program    : Program ini menampilkan penggejaan nama
 */
public class PBOIF210119065Latihan25LatihanEjaanNama {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nama yang ingin di eja: ");
        String nama = sc.nextLine();
        
        System.out.println("Ejaan untuk \"" + nama + "\" adalah : ");
        char[] huruf = nama.toCharArray();
         for (int i = 0; i < huruf.length; i++) {  
            System.out.println("Huruf ke-"+ (i+1) + " : " + huruf[i]);  
        } 
        System.out.println("(Developed by : Fachriansyah Muhammad Nur Ihsan)");  
    }
    
}
