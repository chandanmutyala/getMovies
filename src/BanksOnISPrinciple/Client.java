package BanksOnISPrinciple;

public class Client {
    public static void main(String [] args){
   CityBank city =new CityBank();
    //city.addBeneficiary(678489379,"Siva");
    //city.transfer(678489379,500);

    HdfcBank hdfc =new HdfcBank();

     hdfc.otpValidation(669,"hdfcclient@123");
         hdfc.transfer(878738,87);



    }
}
