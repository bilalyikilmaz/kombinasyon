import java.util.Scanner;

public class kombinasyon {
    public static void main(String[] args) {
        // Değişkenler
        int n, r, sonuc, nfak = 1, rfak = 1, nekisrfak = 1;
        Scanner input;

        //Hesaplama Bloğu

        System.out.print("C(n,r) için Lütfen n Değerini Girin : ");
        input = new Scanner(System.in);
        n = input.nextInt();
        System.out.print("C(n,r) için Lütfen r Değerini Girin : ");
        input = new Scanner(System.in);
        r = input.nextInt();

        //Hesaplama Bloğu
        // n! Hesabı
        if (n != r) {
            for (int i = 1; i <= n; i++) {
                nfak = nfak * i;
            }
            for (int i = 1; i <= r; i++) {
                rfak = rfak * i;
            }
            for (int i = 1; i <= (n - r); i++) {
                rfak = rfak * i;
            }

            sonuc = nfak / (rfak * (nekisrfak));

            System.out.println("Sonuç : " + sonuc);

        } else {
            System.out.println("Lütfen n değerini r'den farklı bir değer giriniz!");
        }
    }
}
