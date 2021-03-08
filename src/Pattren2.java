
public class Pattren2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		inisiasi variabel dengan tipe data integer
		int a=5, i, j, k;
        for (i=1; i<=a; i++){
        	for(j=a-1; j>=i; j--) {
        		System.out.print(" ");
        	}
            for(k=1; k<=i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
	}

}
