import java.util.Scanner;
public class VKI {
    public static void main(String[] args) {
        Scanner veri = new Scanner(System.in);
        double kilo, boy, VKI;
        System.out.print("Lütfen boyunuzu (metre cinsinden) giriniz : ");
        boy = veri.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz : ");
        kilo = veri.nextDouble();
        VKI = kilo / (boy * boy);
        System.out.println("Vücut Kitle İndexiniz : " +VKI);
    }
}
