package BanksOnISPrinciple;

public class Sbi implements FundsValidation{
    private boolean isOtpValidated = false;
    @Override
    public void addBeneficiary(int toAccNo, String beneficiaryName) {
        System.out.println("Beneficiary added in SBI. Beneficiary Account No: " + toAccNo + ", Beneficiary Name: " + beneficiaryName);

    }
    @Override
    public void transfer(int accNo, int amount) {
        if(isOtpValidated){
        System.out.println("Money is transferred to: "+ accNo+ "Amount  transferred: "+amount);
    }else{
            System.out.println("Sorry! First Enter your Credentials in otpValidation");
        }}
    @Override
    public void otpValidation(int mPin, String userName) {
        if(mPin == 6669 && userName.equals("sbiclient@123")){
            System.out.println("Valid User");
            isOtpValidated=true;
        }else{
            System.out.println("Not a Valid User");
        }
    }
}
