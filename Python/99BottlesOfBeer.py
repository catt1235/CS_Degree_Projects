for num_bottles in range(99,0,-1):
    print(f"{num_bottles} bottles of beer on the wall.")
    print(f"{num_bottles} bottles of beer.")

    if num_bottles == 1:
        print("No more bottles of beer on the wall.")
    else:
        print(f"Take one down and pass it around. {num_bottles -1} bottles or beer on the wall.")
        print("*" * 50)

#While look solution:
num_bottles = 99
while num_bottles > 0:
    print(f"{num_bottles} bottles of beer on the wall.")
    print(f"{num_bottles} bottles of beer.")

    if num_bottles == 1:
        print("No more bottles of beer on the wall.")
    else:
        print(f"Take one down and pass it around. {num_bottles -1} bottles or beer on the wall.")
    print("*" * 50)
    num_bottles -=1