class Motor { //nama kelas
//deklarasi variabel
	String Nama; //mendeklarasikan variabel Nama yang bertipe data string
	String Merek; //mendeklarasikan variabel Merek yang bertipe data string
	
	public String getNama(){ //inisialisasi nilai Nama
		return Nama; //mengembalikan nilai Nama
	}
	public void setNama(String x){ //deklarasi set untuk atribut Nama
		this.Nama=x;
	}
	
	public String getMerek(){ //inisialisasi nilai Merek
		return Merek; //mengembalikan nilai Merek
	}
	public void setMerek(String y){ //deklarasi set untuk atribut Merek
		this.Merek=y;
	}
	
	
	public static void main(String [] args){
		Motor dhoer = new Motor();
		dhoer.setNama("Satria FU"); //mengisi nilai setter Nama 
		System.out.print("\nNama Motor : "); //output kalimat
		System.out.print(dhoer.getNama()); //memanggil setter Nama dengan getter
		
		dhoer.setMerek("SUZUKI"); //mengisi nilai setter Merek
		System.out.print("\nMerek adalah : "); //output kalimat
		System.out.print(dhoer.getMerek()); //memanggil setter Merek dengan getter
		
	}
}