
public class Pattren4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5, j, i, m, k;
//		perulangan buat barisnya dulu
		for (i=1; i<=a; i++){
//			perulangan untuk mencetak jumlah i
//			mengikuti pada baris keberapa / i
            for(j=1; j<=i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
		
//		perulangan untuk mencetak angka sebanyak k
		for (k=(a-1); k>=1; k--){
//			perulangan untuk mencetak angka k
            for(m=1; m<=k; m++) {
                System.out.print(k);
            }
            System.out.println();
        }
	}

}
