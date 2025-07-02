import java.util.Scanner;

public class hesap {

    public static void main(String[] args) {
        int a1,a2,process;

        Scanner input = new Scanner(System.in);

        System.out.println("1. sayıyı giriniz: ");
        a1 = input.nextInt();

        System.out.println("2. sayıyı giriniz: ");
        a2 = input.nextInt();

        System.out.println("1:Toplama \n2:Çıkarma \n3:Bölme \n4:Çarpma");
        System.out.println("");
        process = input.nextInt();

    
        switch (process) {
            case 1:
                int toplam = a1 + a2;
                System.out.println(toplam);
                break;
            case 2:
                int cikart = a1 - a2;
                System.out.println(cikart);
                break;
            case 3:
                switch (a2) {
                    case 0:                       
                        System.out.println("sayı sıfıra bölünemez");
                        break;
                    default:
                        double bolme = (double) a1 / a2;
                        System.out.println(bolme);
                        break;
                }
                break;
            case 4:
                int carpma = a1 * a2;
                System.out.println(carpma);
                break;
        }

    }
}