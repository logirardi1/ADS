n=int (input("Tabuada até qual?"))
for i in range(1,n+1,1):
    print("Tabuada do %d " %i)
    for cont in range(1,11,1):
        tab=i*cont
        print("%d * %d = %d" %(i,cont,tab))