package BanksOnISPrinciple;

public class Client {
    public static void main(String [] args){


    HdfcBank hdfc =new HdfcBank();
         hdfc.addBeneficiary(87873,"Siva");
         hdfc.otpValidation(6669,"hdfcclient@123");
         hdfc.transfer(878738,87);



    }
}
