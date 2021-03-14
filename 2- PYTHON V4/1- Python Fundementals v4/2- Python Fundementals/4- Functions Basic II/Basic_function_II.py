# 1-
def countdown(num):
    for i in range(num, 0, -1):
        print(i)    

# 2-
def print_and_return(arr):
    print(arr[0])
    return arr[1]

# 3- 
def first_plus_length(arr):
    return arr[0]+len(arr)

x=first_plus_length([1,2,3,4,5])
print(x)

# 4-

def values_greater_than_second(arr):
    arr_new=[]
    counter=0
    if len(arr)<3:
        return false
    for x in range (0,len(arr),1):
        if arr[x]>arr[1]:
            arr_new.append(arr[x])
            counter+=1
    print(counter)
    return arr_new
    
    
  
y=values_greater_than_second([5,2,3,2,1,4])
print(y)  

# 5-
def length_and_value(size,value):
    arr=[]
    for x in range(0,size,1):
        arr.append(value)
    return arr
print(length_and_value(6,2))
