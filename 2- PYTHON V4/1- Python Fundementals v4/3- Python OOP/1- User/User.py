class User:
    def __init__(self, name, email_address):
        self.name = name
        self.email = email_address
        self.account_balance = 0
        return None
    def make_deposit(self, amount):
        self.account_balance += amount
        return self
    def make_withdrawal(self,amount):
        self.account_balance -= amount
        return self
    def display_user_balance(self):
        print(self.name, " ","balance: $ ",self.account_balance)
        print("\n","*"*30)
        return self
    def transfer_money(self, name, amount):
        self.make_withdrawal(amount)
        name.make_deposit(amount)
        print(self.name, " ","balance: $ ",self.account_balance)
        print(name.name, " ","balance: $ ",name.account_balance)
        return self

guido=User("Guido van Rossum", "guido@python.com")
monty=User("Monty Python", "monty@python.com")
mike=User("Mike Literus", "mike_literus@python.com")

guido.make_deposit(1200)
guido.make_deposit(500)
guido.make_deposit(700)
guido.make_withdrawal(900)
guido.display_user_balance()

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