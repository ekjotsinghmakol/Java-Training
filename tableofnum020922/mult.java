package tableofnum;

public class mult {
	

		 static void mul_table(int N, int i)
		 {
		   
		     if (i > 10)
		     {
		         return ;
		     }
		    
		     System.out.println(N + " * " + i + " = " + N * i);

		     mul_table(N, i+1);
		 }
}
