
public class Pattren1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5, j, i;
//		perulangan buat barisnya dulu
		for (i=1; i<=a; i++){
//			perulangan untuk mencetak jumlah '*'
//			mengikuti pada baris keberapa / i
            for(j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
	}

}
