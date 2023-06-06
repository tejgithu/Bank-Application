package SBI;


public class Main {
   

    public static void main(String[] args) {
         Account VedantAccount = new Account("12345",0.0, "Vedant", "vedant@abc.com","121321");


        VedantAccount.DepositMoney(100);
        VedantAccount.DepositMoney(150);
        VedantAccount.withDrawMoney(200);
    }
}
