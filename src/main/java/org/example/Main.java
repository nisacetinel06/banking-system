package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        Customer customer=new Customer("Nisa","Çetinel", "1234567890",90000.0);
        Account account=new Account(customer);

        while (true) {
            System.out.println("\n1- Bakiye Görüntüle");
            System.out.println("2- Para Yatır");
            System.out.println("3- Para Çek");
            System.out.println("4- Çıkış");
            System.out.print("Seçiminiz: ");
            int secim = oku.nextInt();
            switch (secim) {
                case 1:
                    account.viewBalance();
                    break;
                case 2:
                    System.out.print("Yatırılacak miktarı girin: ");
                    double yatirMiktar = oku.nextDouble();
                    account.payInto(yatirMiktar);
                    break;
                case 3:
                    System.out.print("Çekilecek miktarı girin: ");
                    double cekMiktar = oku.nextDouble();
                    account.takeMoney(cekMiktar);
                    break;
                case 4:
                    System.out.println("Çıkış yapılıyor...");
                    oku.close();
                    return;
                default:
                    System.out.println("Geçersiz seçim!");
            }
        }
    }
}