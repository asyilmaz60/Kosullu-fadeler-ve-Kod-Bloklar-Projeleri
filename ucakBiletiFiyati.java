import java.util.Scanner;

public class ucakBiletiFiyati {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int km, yas, tip;
        double ucret, indirimliTutar;

        System.out.print("Mesafeyi km türünden giriniz: ");
        km = input.nextInt();

        System.out.print("Yaşınızı giriniz: ");
        yas = input.nextInt();

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön, 2 => Gidiş Dönüş): ");
        tip = input.nextInt();

       if(yas >0 && km>0 && (tip==1 || tip==2)){

        ucret = km * 0.1;

        if(yas<12){
            ucret*=0.5;
        }
        else if(yas>=12 && yas<=24){
            ucret*=0.9;
        }
        else if(yas>65){
            ucret*=0.7;
        }

        if(tip==2){
            ucret*= 2*0.8;
        }
        System.out.println("Ücretiniz :"+ ucret+ " TL");
       }
       else{
        System.out.println("Hatalı bir giriş yaptınız");
       }
    }
}
