# 1- Biggie Size

def biggie_size(arr):
    for x in range(0, len(arr), 1):
        if arr[x] > 0:
            arr[x] = "big"
    return arr


y = biggie_size([-1, 3, 5, -5])
print(y)

# 2- Count Positives


def count_positives(arr):
    counter = 0
    for x in range(0, len(arr), 1):
        if arr[x] > 0:
            counter += 1
    arr[len(arr)-1] = counter
    return arr


y = count_positives([1, 6, -4, -2, -7, -2])
print(y)

# 3-


def sum_total(arr):
    sum = 0
    for x in range(0, len(arr), 1):
        sum += arr[x]
    return sum


y = sum_total([6, 3, -2])
print(y)

# 4-


def average(arr):
    sum = 0
    for x in range(0,len(arr),1):
        sum+=arr[x]
    average=sum/len(arr)
    return average
y=average([1,2,3,4])
print(y)

# 5-

def length(arr):
    return len(arr)
y=length([1,2,3,4])
print(y)

# 6-

def minimum(arr):
    min=arr[0]
    if len(arr)==0:
        return false
    for i in range(len(arr)):
        if arr[i]<min:
            min=arr[i]
    return min
x=minimum([37,2,1,-9])
print(x)

# 7-

def maximum(arr):
    max=arr[0]
    if len(arr)==0:
        return false
    for i in range(len(arr)):
        if arr[i]>max:
            max=arr[i]
    return max
x=maximum([37,2,1,-9])
print(x)

# 8-

def ultimate_analysis(arr):
    max=arr[0]
    min=arr[0]
    sum=0
    length=len(arr)
    if len(arr)==0:
        return false
    for i in range(len(arr)):
        sum+=arr[i]
        if arr[i]>max:
            max=arr[i]
        if arr[i]<min:
            min=arr[i]
    average=sum/len(arr)
    ultimate_analysis={'sumTotal':sum, 'average':average,'minimum':min,'maximum':max,'length':length}
    return ultimate_analysis
x=ultimate_analysis([37,2,1,-9])
print(x)

# 9-
def reverse_list(arr):
    temp=0
    for i in range(int(len(arr)/2)):
        temp=arr[i]
        arr[i]=arr[len(arr)-1-i]
        arr[len(arr)-i-1]=temp
    return arr
x=reverse_list([ 37,2,1,-9])
print(x)



