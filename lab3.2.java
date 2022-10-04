import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
	   Scanner str = new Scanner (System.in);
	   String q;
	   System.out.print("Введите строку: ");
	   q = str.nextLine();
	   char[] w = q.toCharArray(); 
	   String res = "";
	   for (int i = w.length - 1; i >= 0; i--){
	        res = res + w[i];
	   }
	   System.out.println ("Обратная строка: "+ res);
	   System.out.println (res.equals (q));
    }
}