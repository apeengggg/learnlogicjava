
public class Pattren5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=3,i,j;
        for (i=1; i<=a; i++){
        	for(j=1; j<=a; j++) {
        		if(j%2 == 0){
        			System.out.print("O");
        		}
        		else{
        			System.out.print("#");
        		}
        	}             
        	System.out.println(); 
        }            
	}
}
