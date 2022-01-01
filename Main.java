import java.util.Scanner;
public class Main {
    public static void main(String[] args){
      // Değişkenleri tanımla
      double kenar1, kenar2, kenar3, alanxalan , u; 
      
      // Scanner sınıfını tanımla
      Scanner inp = new Scanner(System.in);

      // Kulanıcıdan dik kenar uzunluklarını al
      System.out.print("1.kenar uzunluğunu giriniz : ");
      kenar1 = inp.nextInt();
      System.out.print("2.kenar uzunluğunu giriniz : ");
      kenar2 = inp.nextInt();
      System.out.print("3.kenar uzunluğunu giriniz : ");
      kenar3 = inp.nextInt();
      
      // Üçgenin alanını bul ve ekrana yazdır
      u = (kenar1 + kenar2 + kenar3)/2;
      alanxalan = u * (u-kenar1) * (u-kenar2) * (u-kenar3);
      System.out.println("Üçgenin alanı = "+ alanxalan);
    }
}