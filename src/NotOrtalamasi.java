import java.util.Scanner;

public class NotOrtalamasi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matematik, fizik, kimya, turkce, tarih, muzik;

        System.out.print("Matematik Notunuz : ");
        matematik = sc.nextInt();
        System.out.print("Fizik Notunuz : ");
        fizik=sc.nextInt();
        System.out.print("Kimya Notunuz : ");
        kimya = sc.nextInt();
        System.out.print("Türlçe Notunuz : ");
        turkce = sc.nextInt();
        System.out.print("Tarih Notunuz : ");
        tarih = sc.nextInt();
        System.out.print("Müzik Noyunuz : ");
        muzik = sc.nextInt();

        int toplam = matematik+fizik+kimya+tarih+turkce+matematik;
        double ortalama = toplam / 6;

        String sonuc = ortalama>=60.0 ? "Sınıfı Geçti" : "Sınıfta Kaldı";

        System.out.println("-------------------------------------------");
        System.out.println("Not Ortalamanız : "+ortalama);
        System.out.println("Geçme Durumunuz : " + sonuc);
    }
}
