import java.util.Scanner;
import java.util.regex.*;

public class string_lab5_b {
	public static void main(String[] args) {try{
		Scanner sin=new Scanner(System.in);
		System.out.print("Введите входные данные: ");
		String str=sin.nextLine();
		Pattern pat = Pattern.compile("[1-9][0-9][0-9][0-9][0-9][0-9]");
		Matcher mat= pat.matcher(str);
		if(mat.matches())
		{
			System.out.println("Ваше число удовлетворяет условиям:)");
		}
		else
			System.out.println("Неправильное выражение!");
		sin.close();
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	}

}
