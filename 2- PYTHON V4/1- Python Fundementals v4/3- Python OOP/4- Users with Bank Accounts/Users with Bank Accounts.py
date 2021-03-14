class User:
    def __init__(self, name, email_address):
        self.name = name
        self.email = email_address
        self.account=BankAccount(int_rate=1.01, balance=0)
    def make_deposit(self, amount):
        self.account.balance += amount
        return self
    def make_withdrawal(self,amount):
        if amount>self.account.balance:
            self.account.balance -= amount+5
            print("Insufficient funds: Charging a $5 fee")
        else:
            self.account.balance -= amount
        return self
    def display_user_balance(self):
        print(self.name, " ","balance: $ ",self.account.balance)
        print("\n","*"*30)
        return self
    def transfer_money(self, name, amount):
        self.make_withdrawal(amount)
        name.make_deposit(amount)
        print(self.name, " ","balance: $ ",self.account.balance)
        print(name.name, " ","balance: $ ",name.account.balance)
        return self
    def yield_interest(self):
        if self.account.balance>0:
            self.account.balance*=1.01
        return self

class BankAccount:
    def __init__(self, int_rate=1.01, balance=0):
        self.int_rate = int_rate
        self.balance = balance
        
    

guido=User("Guido van Rossum", "guido@python.com")
monty=User("Monty Python", "monty@python.com")
mike=User("Mike Literus", "mike_literus@python.com")

guido.make_deposit(1200).make_deposit(500).make_deposit(700).make_withdrawal(900).display_user_balance()

monty.make_deposit(231)
monty.make_deposit(1456)
monty.make_withdrawal(321)
monty.make_withdrawal(232)
monty.display_user_balance()

mike.make_deposit(5321)
mike.make_withdrawal(1656)
mike.make_withdrawal(1321)
mike.make_withdrawal(1632)
mike.display_user_balance()

guido.transfer_money(mike,500)


