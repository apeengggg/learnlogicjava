
public class Java_Basic_hands_on_1_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char index = 'B';
		String ket="";
		switch (index) {
		  case 'A' :
			ket = "Sangat Baik";
			break;
		  case 'B' :
			ket = "Baik";
			break;
		  case 'C' :
			ket = "Cukup";
			break;
		  case 'D' :
			ket = "Buruk";
			break;
		  case 'E' :
			ket = "Sangat Buruk";
			break;
		  default:
			System.out.println("Input Salah");
			break;
		}
			 System.out.println(ket);
             System.out.println("Nilai kamu " + index);

	}	

}
