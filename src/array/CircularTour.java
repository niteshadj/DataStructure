/**
 * 
 */
package array;

/**
 * @author nadjriya
 * 
 *         Suppose there is a circle. There are N petrol pumps on that circle.
 *         You will be given two sets of data. 1. The amount of petrol that
 *         every petrol pump has. 2. Distance from that petrol pump to the next
 *         petrol pump. Find a starting point where the truck can start to get
 *         through the complete circle without exhausting its petrol in between.
 *         Note : Assume for 1 litre petrol, the truck can go 1 unit of
 *         distance.
 *
 */
public class CircularTour {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int petrol[] = { 87,40,71,79,2,3,93,57,81,42,90,20,30};
		int distance[]={27,95,96,35,68,98,18,53,2,87,66,45,41};
		System.out.println(tour(petrol, distance));

	}

	static int tour(int petrol[], int distance[]) {
		int currPetrol = 0;
		int prevPetrol = 0;
		int start = 0;
		for (int i = 0; i < petrol.length; i++) {
			currPetrol = currPetrol + (petrol[i] - distance[i]);

			if (currPetrol < 0) {
				prevPetrol += currPetrol;
				start = i + 1;
				currPetrol = 0;
			}
		}

		if (currPetrol + prevPetrol > 0)
			return (start);

		return -1;
	}

}
