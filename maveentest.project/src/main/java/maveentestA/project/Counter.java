package maveentestA.project;

public class Counter {
	public static void main(String[] args)
    {
        UseCompute u=new UseCompute();//Create instance variable
        u.useCom(new add(),12,12);
        u.useCom(new subtract(),13,2);
        u.useCom(new multiply(),13,2);
        u.useCom(new Division(),10,2);
  }
}
interface Compute{
   public int computer(int n,int m);
}
class add implements Compute{
   public int computer(int m,int n)
   {
	   System.out.println("sum  is:");
       return m+n;
   }
}
class subtract implements Compute{
   public int computer(int m,int n)
{
	   System.out.println("substraction of two no is:");
       if(m>n)
       return m-n;                                                         
       else
           return n-m;
   }
}   
class multiply implements Compute{
   public int computer(int m,int n)
   {
	   System.out.println("product is:");
       return m*n;
   }
}   
class Division implements Compute{
   public int computer(int m,int n)
   {
	   System.out.println("Division of two no is:");
       if(m>n)
    	   
       return  (m/n);
       else
       return n/m;
   }
}  
class UseCompute{
   public void useCom(Compute com,int one,int two)
   {
       System.out.println(com.computer(one,two));//Use the computer variable in the compute through Interface access to 4 algorithms 
   }

}
