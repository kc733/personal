# Hi, I'm kc733, a newbie programmist
# I'm not talented at all and don't know much yet
# But I'm really trying my best with this project
# Keep in mind that this is the first time I'm using Tkinter
# Thanks.

# main
from tkinter import Button, Canvas, Entry, Frame, Message, Tk, Label, Menu
root = Tk()
root['bg'] = "#423C42"
root.title('MyDrugs')
root.geometry('1000x700')
root.resizable(width=False, height=False)

# functions
def enter_fun():
    login = loginInput.get()
    password = passField.get()
    info = f'Information about the user: {str(login)}, {str(password)}'
    print(info)

# widgets

# canvases
canvas = Canvas(root, height=700, width=1000, bg='#423C42')
canvas.pack()

# frames
frame = Frame(root, bg='blue')
frame.place(relx=0.15, rely=0.15, relwidth=0.7, relheight=0.7)

# titles
title = Label(canvas, text='MyDrugs', bg='white', font=100) # make bigger and change font
title.pack()

# menu
menubar = Menu(root, bg="yellow", title="Buy drugs online", )
menubar.add_command(label="Meth")
menubar.add_command(label="MDMA")
menubar.add_command(label="Cocaine")
menubar.add_command(label="Deluxe Case")
menubar.add_separator()
menubar.add_command(label="FAQ")
root.config(menu=menubar)
menubar.place()

# login bar # needs replacing
passframe = Frame(root, bg='white')
passframe.place(relx=0.1, rely=0.1)
loginInput = Entry(passframe, bg='white')
loginInput.pack()

passField = Entry(passframe, bg='white', show='*')
passField.pack()

enter = Button(passframe, text='Login', command=enter_fun)
enter.pack()


root.mainloop()