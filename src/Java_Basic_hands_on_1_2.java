
public class Java_Basic_hands_on_1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//---------------------------------------------------------------
//		kode awal
//		int x=5;        
//	     if (a==2)
//	        System.out.println("Nilai a = 0");
//	     else(a==1)
//	        System.out.println("Nilai a = 1");
//	     else(a==2)
//	        System.out.println("Nilai a = 2"); 
// -----------------------------------------------------------------
// kesalahan
//	1. variabel a tidak dideklarasikan,
//	2. statement else seharunsya tidak mempunyai parameter/kondisi
//	3. jika memiliki lebih dari 1 kondisi sebaiknya menggunakan else if atau switch case
//-----------------------------------------------------------------
//	kode yang sudah diperbaiki
//		inisiasi variable x =5 dengan tipe data integer
	int x=5;        
//	kondisi pertama 
    if (x==2)
//    	statement yang akan dilakukan jika kondisi 1 benar / TRUE / x=2
       System.out.println("Nilai x = 2");
//   kondisi ke 2
    else if(x==1)
//    	statement yang akan dilakukan jika kondisi 1 salah / FALSE dan kondisi 2 bernilai benar / TRUE
       System.out.println("Nilai x = 1");
    else
//    	statementyang akan dilkukan jika kondisi 1 dan 2 salah / FALSE
       System.out.println("Nilai x lebih dari 2"); 
  }

	}
