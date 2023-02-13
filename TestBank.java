//Create an abstract class 'Bank' with an abstract method 'getBalance'.
// $100, $150 and $200 are deposited in banks A, B and C respectively. 
//'BankA', 'BankB' and 'BankC' are subclasses of class 'Bank', each having a method named 'getBalance'. 
//Call this method by creating an object of each of the three classes.

abstract class Bank {
    abstract void getBalance();
}

class BankA extends Bank{
    void getBalance(){
        System.out.println("$100 got deposited");
    }


} 
class BankB extends Bank{
    void getBalance(){
        System.out.println("$150 got deposited");
    }
}
class BankC extends Bank{
    void getBalance(){
        System.out.println("$200 got deposited");

    }
}
class TestBank{
    public static void main(String args[]){
        BankA BA = new BankA();
        BA.getBalance();
        BankB BB = new BankB();
        BB.getBalance();
        BankC BC= new BankC();
        BC.getBalance();
    }
}
