
public class Pattren3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5,b,c,d,e;
        for (b=1; b<=a; b++){
        	for(c=4;c>=b;c--) {
        		System.out.print(" ");
        	}
            for(d=1; d<=b; d++) {
                System.out.print("*");
            }
            for(e=1; e<=(b-1); e++) {
                System.out.print("*");
            }
            System.out.println();
        }
	}

}
