package array;

public class Snippet {
	
	 static int d = 1;
	
	public static void main(String[] args) {
		int n=255;
		//count(3);//
		System.out.println(f(2.24));
	}
	static int fun (int n)
	{
	  int x=1, k;
	  if (n==1) return x;
	  for (k=1; k<n; ++k)
	     x = x + fun(k) * fun(n-k);
	  return x;
	}
	
	static void count(int n)
	{
	   
	 System.out.println(n);
	 System.out.println(d);
	    d++;
	    if(n > 1) count(n-1);
	    System.out.println(d);
	}
	
	static double f(double x){
		  if (Math.abs(x*x - 3) < 0.01) return x;
		  else return f(x/2 + 1.5/x);
		}
}

