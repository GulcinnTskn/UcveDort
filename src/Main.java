/*
Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen
sayıların ortalamasını hesaplayan programı yazınız.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sayi,toplam =0,bolunen=0;
        double ort = 0;

        Scanner inp=new Scanner(System.in);

        System.out.print("Sayı giriniz : ");
        sayi = inp.nextInt();

        System.out.println("3'e ve 4'e tam bölünen sayılar:");

        for(int i=0;i<=sayi;i++){
            if(i%4==0 && i%3==0 && i!=0) {
                System.out.println(i);
                bolunen++;
                toplam=(toplam+i);
            }
        }
        if(toplam==0){
            System.out.println("3'e ve 4'e tam bölünen hiç sayi yok");
        }
        System.out.println("3'e ve 4'e tam bölünen kaç sayi var: "+bolunen);
        ort=(toplam/bolunen);
        System.out.println("Ortalama: "+ort);

    }
}