public class bankaccount {

    public int accno;
    public String name;
    public double balance;
    public double amount;

    bankaccount( int accno,String name,double balance,double amount){
        this.accno=accno;
        this.name=name;
        this.balance=balance;
        this.amount=amount;

    }
    public void inputdata(){
        this.balance=this.amount+this.balance;

    }
    public void showdata(){
        System.out.println(this.balance);
    }

    public void transactions(long trans_value){
        if (this.balance>trans_value){
        this.balance=this.balance-trans_value;
        System.out.println(this.balance);}
        else{
            System.out.println("not enough money ");
        }
    }
    public static void main(String[] args) {
        bankaccount b = new bankaccount(101,"sanidhya",1000,400);
        b.inputdata();
        b.showdata();
        b.transactions(500);
        b.transactions(500);
        b.transactions(500);
    }
}
