package java_DSA.arrays.hard;

public class PascalTriangle1 {

	
	public static int findElement(int n,int r) {
		
		
		int res=1;
		
		for(int i=0;i<r;i++) {
			res=res*(n-i);
			res=res/(i+1);
		}
		
		return res;
	}
	
	public static void main(String[] args) {
		
	//	int R=5;
	//	int C=4;
		
		int R=6;
		int C=4;
		
		System.out.println(findElement(R-1,C-1));
	}
}
