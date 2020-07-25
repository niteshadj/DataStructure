/**
 * 
 */
package mathematical;

/**
 * @author nadjriya
 *
 */
public class GCD {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println(findHCF(96, 56));

	}

	public static int findHCF(int i, int j) {
		int k = 1;
		if (i > j){
			if(i%j==0){
				return j;
			}
			k = i / j;
			return findHCF(j, i%j);
		}
		
		else{
			if(j%i==0){
				return j/i;
			}
			k = j / i;
			return findHCF(i, j%i);
		}
		
		
		
	}

}
