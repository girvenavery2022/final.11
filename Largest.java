
public class Largest {

	public static void main(String[] args) {

	}
	public Largest() {

	}
	public int largest(int[] list){
		int index;
		int max = 0;
		for (index = 0;index < list.length-1; index++){
			if (list[index]<0 || list[index] > max) {
				max = list[index];
				}
			}
		return max;
		}
}
