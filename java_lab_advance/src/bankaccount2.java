class ATM implements Runnable{
    int amount;
    bankaccount2 accountx;
    ATM(bankaccount2 x, int amount){
        accountx=x;
        this.amount=amount;
        //new Thread(this).start();
    }
    synchronized public void run(){
        accountx.deposit(amount);
        System.out.println("deposited from atm");
    }
}
class netb implements Runnable{
    int amount;
    bankaccount2 accountx;
    netb(bankaccount2 x, int amount){
        accountx=x;
        this.amount=amount;
        //new Thread(this).start();
    }
   synchronized public void run(){
        accountx.deposit(amount);
       System.out.println("deposited from netb");
    }

}

public class bankaccount2 {
    public int balance;
    public int accountNo;
    void displayBalance(){
        System.out.println("Account No:" + accountNo +"Balance:"+balance);

    }

    void deposit(int amount){
        balance = balance+amount;
        System.out.println(amount+" is deposited");
        displayBalance();
    }
    void withdraw(int amount){
        balance = balance-amount;
        System.out.println(amount+" is withdrawn");
        displayBalance();
    }

    public static void main(String[] args) {
        bankaccount2 b = new bankaccount2();
        b.balance=1000;
        b.accountNo=101;
        Thread object1 = new Thread(new ATM(b,200));
        object1.start();
        Thread object2 = new Thread(new netb(b,200));
        object2.start();
    }
}
