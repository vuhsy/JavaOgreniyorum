package atm;

import java.util.Scanner;

public class UserPanel {
    private User user;
    private Scanner sc;

    public UserPanel(User user, Scanner sc) {
        this.user = user;
        this.sc = sc;
    }

    public void run() {
        boolean loop = true;

        while (loop) {
            System.out.println("\n--- Kullanıcı Menüsü ---");
            System.out.println("1. Bakiye Görüntüle");
            System.out.println("2. Para Yatır");
            System.out.println("3. Para Çek");
            System.out.println("4. Geri Dön");
            System.out.print("Seçiminiz: ");
            int secim = sc.nextInt();

            switch (secim) {
                case 1:
                    System.out.println("Bakiyeniz: " + user.getBalance() + "₺");
                    break;
                case 2:
                    System.out.print("Yatırılacak miktar: ");
                    int yatir = sc.nextInt();
                    user.deposit(yatir);
                    System.out.println("Yeni bakiye: " + user.getBalance() + "₺");
                    break;
                case 3:
                    System.out.print("Çekilecek miktar: ");
                    int cek = sc.nextInt();
                    if (cek > user.getBalance()) {
                        System.out.println("Yetersiz bakiye.");
                    } else {
                        user.withdraw(cek);
                        System.out.println("Yeni bakiye: " + user.getBalance() + "₺");
                    }
                    break;
                case 4:
                    loop = false;
                    break;
                default:
                    System.out.println("Geçersiz seçim.");
            }
        }
    }
}
