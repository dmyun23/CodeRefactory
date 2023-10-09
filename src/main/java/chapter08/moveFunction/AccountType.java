package chapter08.moveFunction;

public class AccountType {
    protected boolean isPreminum;

    public AccountType(boolean isPreminum) {
        this.isPreminum = isPreminum;
    }

    public double overdraftCharge(int daysOverdrawn) {
        if( this.isPreminum ){
            int bankCharge = 10;
            if( daysOverdrawn <= 7){
                return bankCharge;
            }else {
                return bankCharge * (daysOverdrawn-7) * 0.85;
            }
        }else{
            return daysOverdrawn * 1.75;
        }
    }
}
