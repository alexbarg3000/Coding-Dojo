# 1-
import random
def randInt(min=0   , max=100   ):
    num = random.random()*(max-min)
    return int(num)
print(randInt())

# 2-
import random
def randInt(min=0   , max=100   ):
    num = random.random()*(max-min)+min
    return int(num)

print(randInt(min=50))

# 3-
import random
def randInt(min=0   , max=100   ):
    num = random.random()*(max-min)+min
    return int(num)

print(randInt(max=50))

# 4=
import random
def randInt(min=0   , max=100   ):
    num = random.random()*(max-min)+min
    return int(num)

print(randInt(min=50, max=500))

