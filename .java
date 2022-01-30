package javaEgitim.Projeler;

import java.util.Scanner;

public class atmProjesi {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int bakiye = 1000, input;
        String hesapNo , pasword; /*ağam bunları string yap adam hesap numarası diye uzun bir yazı girerse stackoverflow olur*/ 

        while (true) {
            System.out.println("Hesap Numaranızı Giriniz :");
            hesapNo = scan.nextLine(); /*string olarak oku*/

            System.out.println("Parolanızı Giriniz :");
            pasword = scan.nextLine();

            if (hesapNo == "112401" && pasword == "12361528") {
                System.out.println("Başarıyla Giriş Yaptınız !");

            } else {
                System.out.println("Kullanıcı Adı veya Parola Yanlış Tekrar Deneyiniz !");
                   break; /*ağam while döngüsü kullanmazsan program alttaki kodlarla ile çalışır*/
            }

            System.out.println("-------STAUNCH BANKA HOŞ GELDİNİZ-------");

            System.out.println();
            System.out.println("1-)Para Yatır");
            System.out.println("2-)Para Çek");
            System.out.println("3-)Bakiye Sorgula");
            System.out.println("4-)Çıkış Yap");
            System.out.println("Yapmak İstediğiniz İşlemi Seçiniz : ");
            input = scan.nextInt();

            if (input == 1) {
                System.out.println("Yatırmak İstediğiniz Miktarı Giriniz :");
                input = scan.nextInt();
                input = bakiye + input;
                System.out.println("Paranız Başarılı Bir Şekilde Yatırılmıştır !");
                System.out.println("Yeni Bakiyeniz :" + input);
                break;

            } else if (input == 2) {
                System.out.print("Çekmek İstediğiniz Para Miktarını Giriniz :");
                input = scan.nextInt();
                input = bakiye - input;
                System.out.println("Yeni Bakiyeniz : " + input);
                break;

            } else if (input == 3) {
                System.out.println("Bakiyeniz :" + bakiye);
                break;
            } else if (input == 4) {
                System.out.println("Başarılı bir şekilde çıkış yaptınız !");
                break;

            }

            System.out.println("Tekrar Bekleriz !");

        }
    }
}
