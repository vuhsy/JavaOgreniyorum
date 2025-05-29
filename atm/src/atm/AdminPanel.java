package atm;

import java.util.Scanner;

public class AdminPanel {
    private Admin admin;
    private Scanner sc;

    public AdminPanel(Admin admin, Scanner sc) {
        this.admin = admin;
        this.sc = sc;
    }

    public void run() {
        boolean loop = true;

        while (loop) {
            System.out.println("\n--- Admin Menüsü ---");
            System.out.println("1. Kullanıcı Ekle");
            System.out.println("2. Kullanıcı Sil");
            System.out.println("3. Bakiye Düzenle");
            System.out.println("4. Tüm Kullanıcıları Göster");
            System.out.println("5. Geri Dön");
            System.out.print("Seçiminiz: ");
            int secim = sc.nextInt();
            sc.nextLine();

            switch (secim) {
                case 1:
                    System.out.print("Yeni kullanıcı adı: ");
                    String uname = sc.nextLine();
                    System.out.print("Şifre: ");
                    String pass = sc.nextLine();
                    System.out.print("Başlangıç bakiyesi: ");
                    int bal = sc.nextInt();
                    sc.nextLine();
                    admin.addUser(uname, pass, bal);
                    System.out.println("Kullanıcı eklendi.");
                    break;
                case 2:
                    System.out.print("Silinecek kullanıcı adı: ");
                    String delUser = sc.nextLine();
                    admin.deleteUser(delUser);
                    break;
                case 3:
                    System.out.print("Kullanıcı adı: ");
                    String unameEdit = sc.nextLine();
                    System.out.print("Yeni bakiye: ");
                    int newBal = sc.nextInt();
                    sc.nextLine();
                    admin.editBalance(unameEdit, newBal);
                    break;
                case 4:
                    admin.showAllUsers();
                    break;
                case 5:
                    loop = false;
                    break;
                default:
                    System.out.println("Geçersiz seçim.");
            }
        }
    }
}
