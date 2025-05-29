package atm; 
import java.util.*;


public class Admin {
	List<User>  users;
	String username="admin";
	String password="123";
	
	public Admin() {
		 users=new ArrayList<>();
	}
	
	public void addUser(String username,String password,int balance) {
	 		User user=new User(username,password,balance);
		users.add(user);
	}
	public void deleteUser(String username) {
	    for (User user : users) {
	        if (user.getUsername().equals(username)) {
	            users.remove(user);
	            System.out.println("Kullanıcı silindi.");
	            return;
	        }
	    }
	    System.out.println("Kullanıcı bulunamadı.");
	}
	public void showAllUsers() {
		for(User user:users) {
			System.out.println("Kullanıcı Adı: " + user.getUsername() + ", Bakiye: " + user.getBalance()+ " Şifre: " + user.getPassword());
		}
	}
	public void editBalance(String username,int newBalance) {
		for(User user:users) {
			if(user.getUsername().equals(username)) {
				user.setBalance(newBalance);
				System.out.println("Kullanıcının bakiyesi güncellendi.Eski bakiye="+user.getBalance()+ "Yeni bakiye: " + newBalance);
				}
			}
		}
		
}
	

