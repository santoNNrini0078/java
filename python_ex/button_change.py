from tkinter import *

def myFunc():
    if var.get()==1:
        label1.configure(image=photo1)
    elif var.get()==2:
        label1.configure(image=photo2)
    else:
        label1.configure(image=photo3)
        
window=Tk()
window.title("애완동물 선택하기")
window.geometry("500x400")
label2=Label(window,text="좋아하는 동물 투표",font=("궁서체",30), fg="blue")

var=IntVar()
rb1=Radiobutton(window,text="강아지",variable=var, value=1)
rb2=Radiobutton(window,text="고양이",variable=var, value=2)
rb3=Radiobutton(window,text="토끼",variable=var, value=3)

photo1=PhotoImage(file="gif/dog.gif")
photo2=PhotoImage(file="gif/cat.gif")
photo3=PhotoImage(file="gif/rabbit.gif")

button1=Button(window,text="사진보기", command=myFunc)


label1=Label(window, image="")

label2.pack()
rb1.pack()
rb2.pack()
rb3.pack()
button1.pack()
label1.pack()


window.mainloop()