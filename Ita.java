import java.util.Arrays;

public class Ita {

	public static void main(String[] args) {

        int[] Ita1 = {1,2000,60,15};
	int[] Ita2 = {2020,500,766,1};
	Arrays.sort(Ita1); 
	for(int array: Ita1){
		System.out.print(array+" ");
        }
	if(Arrays.equals(Ita1,Ita2)){
	System.out.print("\n Perbandingan Sama"); }
	else {
	System.out.println("\nPerbandingan berbeda"); }
	
	Arrays.fill(Ita1,8);
	for(int array: Ita1){
		System.out.print(array+" ");
        }

	String a = Arrays.toString(Ita1); 
	System.out.println("\n" + a);
	}
}