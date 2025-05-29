package exceptionHandling5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//try-catch-finally
		//finally bloğu her durumda çalışır
		String[] dizi= {"1","2", null};
		try {
			int x=dizi[1].length();
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("array out of bounds");
		}catch(NullPointerException e) {
			System.out.println("null pointer");
		}	
		finally {
			System.out.println("finally");
		}
		
		//throw ile hata fırlatma
		Scanner scanner=new Scanner(System.in);
		System.out.println("bir yaş girin");
		int yas=scanner.nextInt();
		scanner.close();
		if(yas<0) {
			throw new IllegalArgumentException("Yaş negatif olamaz");	
			
		}
		System.out.println("yaşınız: "+yas);
		
		
		/* ArithmeticException önrek:int x=5/0;
		 * NullPointerException örnek: String str=null; str.length();
		 * ArrayIndexOutOfBoundsException örnek: int[] dizi=new int[5]; dizi[10]=5;
		 * NumberFormatException örnek: int sayi=Integer.parseInt("abc");
		 * ClassCastException örnek: Object obj=new String("merhaba"); Integer sayi=(Integer)obj;
		 * IllegalArgumentException örnek: Thread thread=new Thread(); thread.start();
		 * IllegalStateException örnek: Thread thread=new Thread(); thread.start(); thread.start();
		 * IOException örnek: FileInputStream fis=new FileInputStream("dosya.txt");
		 * FileNotFoundException örnek: FileInputStream fis=new FileInputStream("bulunamadi.txt");
		 * RuntimeException örnek: alt sınıfları: ArithmeticException, NullPointerException, ArrayIndexOutOfBoundsException, NumberFormatException, ClassCastException, IllegalArgumentException, IllegalStateException
		 * Throwable: tüm sınıfları kapsar: Error ve Exception
		 */
	   
		

	}

}
