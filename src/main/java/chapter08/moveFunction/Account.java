package chapter08.moveFunction;

public class Account {
    protected int daysOverdrawn;
    private AccountType type;

    public Account(int daysOverdrawn, AccountType type) {
        this.daysOverdrawn = daysOverdrawn;
        this.type = type;
    }

    public double bankCharge(){
        double result = 4.5;
        if( this.daysOverdrawn > 0 ) result += this.type.overdraftCharge(this.daysOverdrawn);
        return result;
    }

//    private double overdraftCharge() {
//        return type.overdraftCharge(this.daysOverdrawn);
//    }
    public static void main(String[] args) {
        int daysOverdrawn = 8;
        AccountType type = new AccountType(true);
        Account account = new Account(daysOverdrawn, type);
        System.out.println(account.bankCharge());
    }

}
