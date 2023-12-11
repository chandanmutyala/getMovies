package BanksOnISPrinciple;

public interface FundsValidation extends FundsTransfer {
    void otpValidation(int mPin, String userName);
}
