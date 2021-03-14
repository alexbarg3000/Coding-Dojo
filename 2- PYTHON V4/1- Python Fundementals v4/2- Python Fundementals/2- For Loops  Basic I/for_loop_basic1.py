1-

for x in range(0,151,1):
    print(x)

2-

for x in range(5,1000,5):
    print(x)

3-

for x in range(1,101,1):
    if x%10==0:
            print("Coding Dojo")
    elif x%5==0:
            print("Coding")
    else:
        print(x)

4- 

sum=0
for x in range(1,500001,2):
    sum+=x
print(sum)

5- 

x=2018
while x>0:
    print(x)
    x-=4

6- 

lowNum=2
highNum=9
mult=3
for x in range(lowNum,highNum+1,1):
    if x%mult==0:
        print(x)