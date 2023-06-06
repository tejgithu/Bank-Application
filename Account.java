package SBI; 


public class Account {
    private String Number;
    private double Balance;
    private String Name;
    private String Email;
    private String PhoneNumber;
    public String com;




    public Account(String Number,double Balance,String Name,String Email,String PhoneNumber) {
        this.Number = Number;
        this.Balance = Balance;
        this.Name = Name;
        this.Email = Email;
        this.PhoneNumber = PhoneNumber;
    }

    public void DepositMoney(double DepositedMoney) {
        this.Balance+=DepositedMoney;
        System.out.println("Deposit is Successfully, new Balance is " +this.Balance);
    }

    public void withDrawMoney(double withdrawlMoney) {
        if(this.Balance - withdrawlMoney < 0) {
            System.out.println("withDraw Unsuccessful only " + this.Balance+" is left");

        }else {
            this.Balance-=withdrawlMoney;
            System.out.println("withdraw successful, current Balance is "+this.Balance);
        }

        

    }






    public String getNumber() {
        return Number;

    }
    public void setNumber(String number) {
        Number = number;

    }
    public double getBalance() {
        return Balance;

    }
    public void setBalance(double balance) {
        Balance = balance;
    }
    public String getName() {
        return Name;

    }
    public void setName(String name) {
        Name = name;
    }
    public String getEmail() {
        return Email;
    }
    public void setEmail(String email) {
        Email = email;
    }
    public String getPhoneNumber() {
        return PhoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }
    
}
