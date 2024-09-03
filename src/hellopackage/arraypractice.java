package hellopackage;

public class arraypractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a[][]= {{1,3,4},{2,3,4,7}};
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print( a[i][j]+" ");
			}
			System.out.println();
			
		}
		
		// find count
		int b[][]= {{2,3,4},{3,2,5}};
		int count=0;
		for(int i=0;i<b.length;i++) {
			for(int j=0;j<b[i].length;j++) {
				if(b[i][j]==2) {
					count++;
					}		
				}
				}
		System.out.println(count++);
		
		
	}
}

