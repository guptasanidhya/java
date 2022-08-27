class account{
    private double balance;
    account(double balance){
        if(balance>0){
            this.balance=balance; }
    }

    public void credit(double add){
         this.balance=this.balance+add;
         System.out.println("amount credited to your account "+add);
         System.out.println("total balance is "+this.balance);
    }

    public double getBalance() {
        return balance;
    }
    public void debit (double sub){
        if(this.balance>sub && this.balance>0){
            this.balance=this.balance-sub;
            System.out.println("balance is debited from account "+sub);
        } else{
            System.out.println("Balance is less amount in the account should not be 0");
        }
    }
}

public class assignment_41_42_43_44 {
    public static void main(String[] args) {
        account a =new account(500);
        a.credit(200);
        a.debit(700);

    }
}
