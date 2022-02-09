package IpPackage2;

public class IpPackage2 {

    private int o1;
    private int o2;
    private int o3;
    private int o4;


    private IpPackage2(int o1,int  o2,int o3,int o4) {
        this.o1 = o1;
        this.o2 = o2;
        this.o3 = o3;
        this.o4 = o4;
    }

    public static IpPackage2 getInstance(int o1,int  o2,int o3,int o4){

        try{

            if((o1 > 0 && o1 <= 255) && o2 <= 255 && o3 <= 255 && o4 <= 255){
                return new IpPackage2(o1, o2, o3, o4);
            }
            else{
                throw new Exception();
            }

        } catch (Exception e) {
            System.out.println("L'adresse ip entree est incorrecte");
            return null;
        }

    }

    public int getOctet1(){
        return this.o1;
    }

    public int getOctet2(){
        return this.o2;
    }

    public int getOctet3(){
        return this.o3;
    }

    public int getOctet4(){
        return this.o4;
    }


    public char getClasse(){

        if(this.o1 <= 126){
            return 'A';
        }else if(this.o1 <= 191){
            return 'B';
        }else if(this.o1 <= 223){
            return 'C';
        }else{
            return 'X';
        }
    }

    public IpPackage2 adresseReseau(){
        if(this.getClasse() == 'A'){
            return new IpPackage2(this.o1, 0, 0, 0);
        }else if(this.getClasse() == 'B'){
            return new IpPackage2(this.o1, this.o2, 0, 0);
        }else if(this.getClasse() == 'C'){
            return new IpPackage2(this.o1, this.o2, this.o3, 0);
        }else{
            return new IpPackage2(this.o1, 0, 0, 0);
        }
    }

    public boolean estMemeReseau(IpPackage2 addr){

        if(this.adresseReseau().ToString().equals(addr.adresseReseau().ToString())){
            return true;
        }
        return false;
    }

    public String ToString(){

        String retour = this.o1 + "." + this.o2 + "." + this.o3 + "." + this.o4;
        return retour;
    }



}
