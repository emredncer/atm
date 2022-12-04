import java.util.Scanner;

public class atm {
    public static void main(String[] args) {
        String userName, password;
        int right = 3, balance = 1500, select;

        Scanner inp = new Scanner(System.in);

        while (right > 0) {
            System.out.print("Kullanıcı adınızı giriniz: ");
            userName = inp.nextLine();

            System.out.print("Parolanızı giriniz: ");
            password = inp.nextLine();

            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("PatiBank'a hoşgeldiniz!");
                do {

                    System.out.println("1- Para yatır\n" + "2- Para çek\n" + "3- Bakiye sorgula\n" + "4- Çıkış");
                    System.out.println("Yapılacak işlemi seçiniz: ");
                    select = inp.nextInt();

                    switch (select) {
                        case 1:
                            System.out.println("Yatırılacak miktarı giriniz : ");
                            int price = inp.nextInt();
                            balance += price;
                            System.out.println("Güncel bakiyeniz : " + balance);
                            break;
                        case 2:
                            System.out.println("Çekilecek miktarı giriniz : ");
                            price = inp.nextInt();
                            if (price > balance) {
                                System.out.println("Yetersiz bakiye! ");
                            } else {
                                balance -= price;
                            }
                        case 3:
                            System.out.println("Bakiyeniz : " + balance);
                    }
                } while (select != 4);
                System.out.println("Görüşmek üzere!");
                break;

            } else {
                right--;
                System.out.println("Yanlış kullanıcı adı ya da şifre girdiniz. Lütfen tekrar deneyiniz! ");
                if (right == 0) {
                    System.out.println("Hesabınız bloke oldu! Müşteri hizmetleri ile iletişime geçiniz.");
                } else {
                    System.out.println("Kalan deneme hakkınız : " + right);
                }
            }
        }
    }
}