package BanksOnISPrinciple;

public interface FundsTransfer {
    void addBeneficiary(int toAccNo, String beneficiaryName);
    void transfer(int accNo, int amount);
}
