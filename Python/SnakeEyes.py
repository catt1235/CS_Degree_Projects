from random import randint

roll1 = randint(1,6)
roll2 = randint(0,1)

# KEEP ROLLING AS LONG AS ONE OF THESE IS NOT 1
while roll1 !=1 or roll2 !=1:
    print(roll1, roll2)
    
    # ROLL AGAIN
    roll1 = randint(1,6)
    roll2 = randint(0,1)
print('Yay, SNAKE EYES!')