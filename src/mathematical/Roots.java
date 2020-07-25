/**
 * 
 */
package mathematical;

/**
 * @author nadjriya
 *
 */
public class Roots {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		quadraticRoots(543,199,843);

	}

	private static void quadraticRoots(int a, int b, int c) {

			double discrimant= b*b -4*a*c;
			if(discrimant<0){
				System.out.println("Imaginary");
			}
			else {
				 double root1=((-1*b +Math.sqrt(discrimant))/(2*a));
			        double root2=((-1*b -Math.sqrt(discrimant))/(2*a));
			        System.out.print((int)Math.floor(root1)+" "+(int)Math.floor(root2));
			}
	}

}
