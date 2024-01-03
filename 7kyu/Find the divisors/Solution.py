def divisors(integer):
    res = []
    for x in range(2, integer):
        if integer % x == 0:
            res.append(x)
    
    return res if len(res) > 0 else str(integer) + " is prime"