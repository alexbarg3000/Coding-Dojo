class BankAccount:
    def __init__(self, int_rate=1.01, balance=0):
        self.int_rate = int_rate
        self.balance = balance
        return None
    def deposit(self, amount):
        self.balance += amount
        return self
    def withdraw(self,amount):
        if amount>self.balance:
            self.balance -= amount+5
            print("Insufficient funds: Charging a $5 fee")
        else:
            self.balance -= amount
        return self
    def display_account_info(self):
        print("Your balance: $ ",self.balance)
        print("\n","*"*30)
        return self
    def yield_interest(self):
        if self.balance>0:
            self.balance*=1.01
        return self

account_1=BankAccount()
account_2=BankAccount()
account_2.deposit(300).deposit(600).withdraw(650).withdraw(210).withdraw(750).withdraw(500).yield_interest().display_account_info()
account_1.deposit(400).deposit(650).deposit(190).withdraw(250).yield_interest().display_account_info()