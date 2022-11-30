package operatorExamples;

public class UnrayOpEx {
	//20 20 20 21 20 20 22 21 21 22 22 21 21 21 22 22 21 21 22 21
	public static void main(String args[]) 
	
	// Postfix >> a++ a--        --- Print + Operation
	// Prefix >> ++a --a         --- Operation + Print
	
	{
	  int a=20;
	  
	  System.out.println(a);   //a=20
	  System.out.println(a++);//a=20 >> a=20+1 >>a=21
	  System.out.println(--a);//a=21>> a=21-1 >> a=20
	  System.out.println(++a); //a=20 >> a=20+1 >> a= 21
	  System.out.println(--a); //a=21 >> a=21-1 >> a=20
	  System.out.println(a++); //a=20 >> a=20+1 >>a=21
	  System.out.println(++a); //a=21>> a=21+1 >>a=22
	  System.out.println(--a); //a=22>> a=22-1 >> a= 21
	  System.out.println(a++); //a=21 >> a=21+1 >> a=22
	  System.out.println(a--); //a=22 >> a=22-1 >> a=21
	  System.out.println(++a); //a=21 >> a=21+1 >> a=22
	  System.out.println(--a); //a=22 >> a= 22-1 >> a=21
	  System.out.println(a++); //a=21 >> a= 21+1 >> a=22
	  System.out.println(--a); //a=22 >> a= 22-1 >> a=21
	  System.out.println(a++); //a=21 >> a= 21+1 >> a=22
	  System.out.println(a--); //a=22 >> a= 22-1 >> a=21
	  System.out.println(++a); //a=21 >> a= 21+1 >> a=22
	  System.out.println(--a); //a=22 >> a=22-1 >> a=21
	  System.out.println(a++); //a=21 >> a= 21+1>> a=22
	  System.out.println(a--);//a=22>> a=22-1 >> a=21
	  System.out.println(a);//a=21
	    
	  
	}
	
	
	
	
	
	

}
