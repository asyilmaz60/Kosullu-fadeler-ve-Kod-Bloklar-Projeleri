import java.util.ArrayList;
import java.util.Scanner;

public class sinifGecmeDurumu {
    public static void main(String[] args) {
            
            int not, sayac;
            double ortalama, toplam;
            Scanner input = new Scanner(System.in);

            String[] dersler = {"Matematik", "Fizik", "Turkce", "Kimya", "Muzik"};
            ArrayList<Integer> gecerliNotlar = new ArrayList<>();

            for(String ders : dersler){
                System.out.println(ders + " Notunuzu giriniz: ");
                not = input.nextInt();

                if(not<=100 && not>=0){
                    gecerliNotlar.add(not);
                }
                else{
                    System.out.println("geçersiz not girdiniz notunuz ortalamaya dahil değildir");                  
                }
            }


            if(gecerliNotlar.isEmpty()){
                System.out.println("Listede hiç geçerli not yok ortalamanız hesaplanamadı");
            }
            else{
               toplam = 0;
               sayac = 0;
               for(int notlar : gecerliNotlar){
                    toplam+= notlar;
                    sayac+= 1;
               }
               ortalama = toplam/sayac;
               System.out.println("Ortalamanız: "+ ortalama);

               if(ortalama >=55){
                    System.out.println("Dersi geçtiniz");
               }
               else{
                    System.out.println("Dersten kaldınız ");
               }
            }




    }
}
