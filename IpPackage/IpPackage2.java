Package IpPackage;

public class IpPackage2 {

	private o1;
	private o2;
	private o3;
	private o4;


	private IpPackage2(int o1,int  o2,int o3,int o4) {
		this.o1 = o1;
		this.o2 = o2;
		this.o3 = o3;
		this.o4 = o4;
	}

	public static IpPackage2 getInstance(int o1,int  o2,int o3,int o4){

		if((o1 >= 0 && o1 <= 255) && (o2 >= 0 && o2 <= 255) && (o3 >= 0 && o3 <= 255) && (o4 >= 0 && o4 <= 255)){
			return new IpPackage2(o1, o2, o3, o4);
		}
		else{
			System.out.println("L'adresse ip entrée est incorrecte");
		}

	}

	public char getClasse(){

		if(this.o1 <= 126){
			return "A";
		}
	}



}
