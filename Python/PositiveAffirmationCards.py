print('For My Daughters: Reminder How to Love yourself Cards')
print('*'*55)

from tkinter import *

count = 0

def click():
    print("My growth comes to me in ways I don't quite expect. But I KNOW I am ALWAYS SAFE!")
    global count
    count+=1
    print(count)

window = Tk()

photo = PhotoImage(heart.jpg)
button = Button(window, 
                text="Click Here For a New Card",
                command=click,
                font=("Comic Sans", 40),
                fg="#FFFFFF",
                bg="#ffc0cb",
                activeforeground="#FFFFFF",
                activebackground="#ffc0cb",
                state=ACTIVE,
                image=photo,
                compound='top')
button.pack()