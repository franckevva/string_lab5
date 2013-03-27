import java.util.Scanner;

public class string_lab5_a {

	public static void main(String[] args) {
		Scanner sin=new Scanner(System.in);
		String str,str_all="";
		System.out.println("¬ведите свой текст.\nƒл€ выхода из состо€ни€ ввода наберите exit\n");
		/*while((str=sin.nextLine())!="exit\n")
		{
			str_all+=str;			
		}*/
		str_all=sin.nextLine();
		str_all=str_all.replace(".", "");
		str_all=str_all.replace(",","");
		str_all=str_all.replace("!","");
		str_all=str_all.replace("?","");
		String str_mas[]= str_all.split(" ");
		String vowel_mas[]={"а","о","у","ю","€","э","и","ы","е","Є"};
		double ratio_mas[]=new double[str_mas.length];
	
		for(int i=0;i<str_mas.length;i++)
		{
			int n=str_mas[i].length();
			int vowel=0;
			for(int k=0;k<10;k++)
				if(str_mas[i].contains(vowel_mas[k]))
					{
						vowel++;
					}
			ratio_mas[i]=vowel/str_mas[i].length();
		}
	
		for(int i=0;i<str_mas.length-1;i++)
		  {
			for(int j=i+1;j<str_mas.length;j++)
			{
			  if(ratio_mas[i]>ratio_mas[j])
			  {
				  String t = str_mas[i];
				  str_mas[i]=str_mas[j];
				  str_mas[j]=t;
				  double t_d=ratio_mas[i];
				  ratio_mas[i]=ratio_mas[j];
				  ratio_mas[j]=t_d;				  
			  }
			}
		  }
		for(int i=0;i<str_mas.length;i++)
			System.out.println(str_mas[i] + " -- "+ ratio_mas[i]);
		sin.close();
		
	}

}
