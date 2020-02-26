
public class Hello {

	public static void main(String[] args) {
		int [][] n = {{2,4,6},{4,7,9},{4,12,9}};
		
		for(int i= 0;i<3;i++) {
			for(int j= 0;j<3;j++) {
				System.out.print(n[i][j]);
			}
			System.out.println();
		}
		for(int i =0; i<3;i++) {
			int max =  n[i][i];
			int tmp =  n[i][i];
			for(int j =0; j<3;j++) {
				if(n[i][j]>max) {
					max = n[i][j];
					n[i][j]=tmp;
					tmp = max;
				}
			}
			n[i][i]=max;
		}
		for(int i= 0;i<3;i++) {
			for(int j= 0;j<3;j++) {
				System.out.print(n[i][j]+"  ");
			}
			System.out.println();
		}

	}

}
