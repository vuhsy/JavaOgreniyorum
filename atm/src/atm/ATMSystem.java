package atm;

import java.util.Scanner;

public class ATMSystem {
    private Admin admin;
    private Scanner sc;

    public ATMSystem() {
        sc = new Scanner(System.in);
        admin = new Admin();
        admin.addUser("emre", "1234", 1000);
        admin.addUser("ayse", "4321", 500);
    }

    public void start() {
        while (true) {
            System.out.println("\n===== ATM SİSTEMİ =====");
            System.out.println("1. Admin Girişi");
            System.out.println("2. Kullanıcı Girişi");
            System.out.println("3. Çıkış");
            System.out.print("Seçiminiz: ");
            int secim = sc.nextInt();
            sc.nextLine();

            switch (secim) {
                case 1:
                    adminLogin();
                    break;
                case 2:
                    userLogin();
                    break;
                case 3:
                    System.out.println("Çıkış yapılıyor.");
                    return;
                default:
                    System.out.println("Geçersiz seçim.");
            }
        }
    }

    private void adminLogin() {
        System.out.print("Kullanıcı adı: ");
        String username = sc.nextLine();
        System.out.print("Şifre: ");
        String password = sc.nextLine();

        if (username.equals(admin.username) && password.equals(admin.password)) {
            AdminPanel adminPanel = new AdminPanel(admin, sc);
            adminPanel.run();
        } else {
            System.out.println("Hatalı admin bilgileri.");
        }
    }

    private void userLogin() {
        System.out.print("Kullanıcı adı: ");
        String uname = sc.nextLine();
        System.out.print("Şifre: ");
        String pass = sc.nextLine();

        User girisYapan = null;
        for (User user : admin.users) {
            if (user.getUsername().equals(uname) && user.getPassword().equals(pass)) {
                girisYapan = user;
                break;
            }
        }

        if (girisYapan != null) {
            UserPanel userPanel = new UserPanel(girisYapan, sc);
            userPanel.run();
        } else {
            System.out.println("Hatalı kullanıcı adı ya da şifre.");
        }
    }
}
