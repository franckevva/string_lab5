import java.util.Scanner;

public class string_lab5_a {

	public static void main(String[] args) {try{
		Scanner sin=new Scanner(System.in);
		String str,str_all="";
		System.out.println("Введите свой текст.\nДля выхода из состояния ввода наберите exit\n");
		str=sin.nextLine();
		while(str.compareToIgnoreCase("exit")!=0)
		{
			str_all+=str;			
			str=sin.nextLine();
		}
		if(!str_all.isEmpty()){
			
		str_all=str_all.replace(".", " ");
		str_all=str_all.replace(","," ");
		str_all=str_all.replace("!"," ");
		str_all=str_all.replace("?"," ");
		str_all=str_all.toLowerCase();
		String str_mas[]= str_all.split(" ");
		String vowel_mas[]={"а","о","у","ю","я","э","и","ы","е","ё"};
		double ratio_mas[]=new double[str_mas.length];
	
		for(int i=0;i<str_mas.length;i++)
		{
			double vowel=0;
			if(!str_mas[i].equals("")){
			str_mas[i]+=" ";
			for(int k=0;k<10;k++)
				vowel += str_mas[i].split(vowel_mas[k]).length - 1;
			str_mas[i]=str_mas[i].trim();
			ratio_mas[i]= vowel/str_mas[i].length();
			}
			else
				ratio_mas[i]=0;
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
		System.out.println("\nУпорядоченные слова:");
			for(int i=0;i<str_mas.length;i++)
				if(!str_mas[i].equals(""))
					System.out.println("\t"+str_mas[i]);
		}
		else
			System.out.println("\nВы не ввели слова");
	
		sin.close();
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	}

}
