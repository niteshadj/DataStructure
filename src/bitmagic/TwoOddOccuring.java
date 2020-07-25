/**
 * 
 */
package bitmagic;

/**
 * @author nadjriya
 *
 */
public class TwoOddOccuring {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[] array = { 4, 3, 4, 4, 4, 5, 4, 5, 4,7 };
		findTwoOddOccuringNo(array);

	}

	private static void findTwoOddOccuringNo(int[] array) {

		int fullArrayXOR=0;
		for (int i = 0; i < array.length; i++) {
			fullArrayXOR=fullArrayXOR^array[i];
		}
		//find first rightmost set bit
		// More efficient method int setBitNumber= fullArrayXOR &~(fullArrayXOR-1)
		int count=0;
		while(fullArrayXOR>0){
			if((fullArrayXOR&1)==1){
				break;
			}
			count++;
			fullArrayXOR=fullArrayXOR>>1;
		}
		int setBitNumber=(int) Math.pow(2, count);
		int XORHalf1=0,XORHalf2=0;
		
		for (int i = 0; i < array.length; i++) {
			if((setBitNumber&array[i])==0){
			XORHalf1=XORHalf1^array[i];
			}else{
				XORHalf2=XORHalf2^array[i];
			}
		}
		
		System.out.println(XORHalf1+"  "+XORHalf2);
		
	}

}
