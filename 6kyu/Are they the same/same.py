# Given two arrays a and b write a function comp(a, b) (orcompSame(a, b)) that checks whether the two arrays have the "same" elements, with the same multiplicities (the multiplicity of a member is the number of times it appears). "Same" means, here, that the elements in b are the elements in a squared, regardless of the order.

def comp(array1, array2):
    if array1 == None or array2 == None:
        return False
    elif len(array1) != len(array2):
        return False
    else:
        resault = list(map(lambda x:x*x, array1))
        resault.sort()
        array2.sort()
        
        stringArray1 = "".join(map(str, resault))
        stringArray2 = "".join(map(str, array2))

        return stringArray1 == stringArray2




# comp([121, 144, 19, 161, 19, 144, 19, 11], None);
# comp([121, 144, 19, 161, 19, 144, 19, 11], [121, 14641, 20736, 361, 25921, 361, 20736, 361]);
# comp([121, 144, 19, 161, 19, 144, 19, 11], [121, 14641, 20736, 361, 25921, 3615, 20736, 361]);