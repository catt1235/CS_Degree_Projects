name = input('Whats your name? ')
age = int(input('How old are you ' + name + ' ? '))
color = input('Whats your favorite color? ')

print('*' * 100)
if age > 5:
    print(f'Wow {age} huh, but dont get it twisted, you still aint grown {name} !')
    print('*' * 100)
    if color == 'blue':
        print('Blue is cool, I guess')
    elif color == 'red':
        print('Red sucks ass, so basic.')
    elif color == 'yellow':
        print('Meh, so boring and sunny, barf!')
    elif color == 'purple':
        print('Hey, thats my favorite color, no copying!')
    elif color == 'green':
        print('Yum, like brocolli')
    elif color == 'pink':
        print('Yesssss queen!')
    elif color == 'orange':
        print('Eww orange like our idiot president! BARF TRUMP')
    elif color == 'white':
        print('Like my crazy dog Loki. Meh, not my favorite.')
else: 
    print(f'Aww you are still a baby')
print('*' * 100)
print('Just kidding, Love ya!')
    