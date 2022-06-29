package accenture;

/*
3) create a class "BankAccount" with property "balance" (should be decimal number)
    * create empty default constructor for it
    * create a constructor with parameter for setting balance.
    * create a method "deposit" with one parameter "amount" (decimal number)
        which allows the user to increase the balance.
    * create a method "withdraw" with one parameter "amount"
        (decimal number) which allows the user to decrease the balance.
    * create a method "printBalance" which displays the current balance to user
    * method for transfer balance from one bank account to another

    4) update your solution:
        * Encapsulate the balance property so it is private
        * add to "withdraw" method, so it would be impossible to withdraw
          more money than exists in bank account. If there is an attempt to withdraw
          more money than exialidation tsts in bank account, output message:
            "There is not enough funds."
        * Modify "transferFrom" method so it would be impossible to transfer more
          money from the other account than it's balance.
                For example, if bank account A has 50 units and bank account B has 25 units
                and we try to transfer 30 units from B to A, then it should output:
                    "Transfer canceled. You are trying to transfer 30 units, but only 25 are available."
        * add a limit for depositing money. If the deposit is greater than 5000, then it should not
          do the deposit and output message:
              "Transaction canceled. Max deposit - 5000 | Your deposit: 6000"
        * call these methods and demonstrate how they work, for example:
            * write a code which tries to withdraw more money than there is in bank account
            * write a code which tries to deposit more than max limit
            * write a code which tries to transfer more money from one account to another account than possible

 */

public class Day3_Task3_4 {
    public static void main(String[] args) {

        BankAccount myBankAccount = new BankAccount(750);
        BankAccount newBankAccount = new BankAccount(550);

        myBankAccount.moneyTransaction(newBankAccount, 1000);
        newBankAccount.printBalance();
        myBankAccount.printBalance();

        myBankAccount.deposit(5555);
        myBankAccount.printBalance();
        myBankAccount.withdraw(555);
        myBankAccount.printBalance();
        myBankAccount.withdraw(10000);

    }

    static class BankAccount { //empty default constructor
        private double balance;
        public BankAccount() {
        }

        public BankAccount(double balance) {
            this.balance = balance;
        }
        public void setBalance(double balance) { //constructor with parameter for setting balance
            this.balance = balance;
        }

        public void deposit(double amount) { //method "deposit" with one parameter
            if (amount <= 5000)
                balance += amount;
            else
                System.out.printf("Maximum deposit amount = 5000 "
                        + "Your deposit amount = %.2f%n", balance);
        }

        public void withdraw(double amount) { // method "withdraw" with one parameter
            if (balance >= amount)
                balance -= amount;
            else {
                System.out.println("Insufficient amount!");
            }
        }

        public void printBalance() { //method "printBalance
            System.out.println("Your current balance is: " + balance);
        }

        public void moneyTransaction(BankAccount bankAccount, double amount) { //method for transfer balance
            if (this.balance > 0 && this.balance >= amount) {
                bankAccount.balance += amount;
                this.balance -= amount;
                System.out.printf(".2f amount has been transacted %n", amount);
            }
            else
                System.out.printf("Transaction cancelled. Insufficient funds. " +
                        "Your transaction = %.2f , available for transaction = %.2f . %n",
                        amount, this.balance);
        }

    }

}
