import java.util.Scanner;

public class havaSicakligi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Hava sıcaklığını giriniz: ");
        int sicaklik = input.nextInt();

        switch(sicaklik / 5){
            case 0:
                System.out.println("Kayak yapaya gidebilirsiniz");
                break;
            case 1:
            case 2:
                System.out.println("Sinemaya gidebilirsiniz");
                break;
            case 3:
            case 4:
                System.out.println("Piknik yapmaya gidebilirsiniz");
                break;
            default:
                System.out.println("Yüzmeye gidebilirsiniz");
        }
    }

}
