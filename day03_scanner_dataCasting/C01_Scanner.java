package day03_scanner_dataCasting;

import java.util.Scanner;

public class C01_Scanner {

    public static void main(String[] args) {

        // Soru 5- Kullanicidan ismini, soyismini ve yasini alip
        //          asagidaki formatta yazdirin.
        //		    girilen bilgiler : J Doe, 44

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen isminizi giriniz");
        char isimIlkHarf = scanner.nextLine().charAt(0);

        System.out.println("Lutfen soyisminizi giriniz");
        String soyisim = scanner.nextLine();

        System.out.println("Yasinizi giriniz");
        int yas = scanner.nextInt();

        System.out.println("girilen bilgiler : "+ isimIlkHarf + " "+soyisim+", "+ yas);

    }
}
