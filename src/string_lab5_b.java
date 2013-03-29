import java.util.Scanner;
import java.util.regex.*;

public class string_lab5_b {
	public static void main(String[] args) {try{
		Scanner sin=new Scanner(System.in);
		System.out.print("Введите исходные данные: ");
		String str=sin.nextLine();
		Pattern pat = Pattern.compile("[1-9][0-9][0-9][0-9][0-9][0-9]");
		Matcher mat= pat.matcher(str);
		if(mat.matches())
		{
			System.out.println("Подходит под условие:)");
		}
		else
			System.out.println("Неверные данные!");
		sin.close();
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	}

}
