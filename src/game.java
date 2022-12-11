import java.util.Arrays;
import java.util.Scanner;

public class game {
	 public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 
		 int []wrong  =new int [5];
		 int number = (int) (Math.random()*100);
		 System.out.println(number);
		 int right = 0;
		 boolean isWrong = false;
		 
		 
		 while(right<5) {
			 System.out.println("Tahmininizi giriniz: ");
			 int userNumber = input.nextInt();
			 if(userNumber < 0 || userNumber >99 ) {
				 System.out.println("0-100 arasında bir değer giriniz.");
				 if(!isWrong) {
					 isWrong = true;
					 System.out.println("Tekrar hata yaparsan can hakkın 1 eksikelecek.");
				 }else {
					 right++;
					 System.out.println("Fazla hatalı giriş yaptın" + (5 - right));
				 }
				 continue;
			 }
			 if(userNumber == number) {
				 System.out.println("Tebrikler!");
				 break;
			 }else {
				 wrong[right] = userNumber;
				 right++;
				 System.out.print("Yanlış sayı!");
				 if(userNumber < number) {
					 System.out.println("Daha büyük bir sayı gir");
				 }else if (number < userNumber) {
					 System.out.println("Daha küçük bir sayı gir");
				}else if(right == 5) {
					break;
				}
				 
			 }
			 
			 
			 int a = 5 - right ;
			 System.out.println("Kalan hakkın: " + a);
			 if( a == 0) {
				 System.out.println("Kaybettin. Girdiğin değerler: " + Arrays.toString(wrong));
				 System.out.println("Doğru cevap: " + number);
			 }
		 }
		
		 
	    }

}
