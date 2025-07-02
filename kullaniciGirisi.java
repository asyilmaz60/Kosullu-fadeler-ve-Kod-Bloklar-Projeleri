import java.util.Scanner;

public class kullaniciGirisi {
    
    public static void main(String[] args) {
        String userName, password, newPassword;
        int sifirlama;
        Scanner input = new Scanner(System.in);

        System.out.println("username: ");
        userName = input.nextLine();

        System.out.println("password");
        password = input.nextLine();

        if(userName.equals("samet") && password.equals("1453")){
            System.out.println("giriş başarılı");
        }
        else{
            System.out.println("giriş hatalı! şifrenizi sıfırlamak istermisiniz\n1)EVET\n2)HAYIR");
            sifirlama = input.nextInt();
            input.nextLine();

            switch (sifirlama) {
                case 1:
                    System.out.println("yeni şifrenizi giriniz");
                    newPassword = input.nextLine();

                    while(newPassword.equals("1453" ) || newPassword.isEmpty()){
                        System.out.println("hatalı şifre girişi lütfen tekrar deneyiniz");
                        newPassword = input.nextLine();
                    }
                    System.out.println("şifreniz başarıyla oluşturuldu");
                    break;
            
                case 2:
                    System.out.println("şifre oluşturulmadı");
                    break;

                default:
                        System.out.println("HATALI GİRİŞTE BULUNDUNUZ");
                    break;

            }
        }

        input.close();
    
    }
}
