# Hi, I'm kc733, a newbie programmist
# I'm not talented at all and don't know much yet
# But I'm really trying my best with this project
# No video or step-by-step tutorials were used
# Keep in mind that this is the first time I'm using Tkinter
# Thanks.

from tkinter import Button, Tk, Label, Menu
root = Tk(className = "MyDrugs")

# widgets
main_w = Button(root, text="MyDrugs", bg="#423C42", height=120, width=400)
menubar = Menu(root, bg="yellow", title="Buy drugs online", )
filemenu = Menu(menubar, tearoff=0)
filemenu.add_command(label="Meth")
filemenu.add_command(label="MDMA")
filemenu.add_command(label="Cocaine")
filemenu.add_command(label="Deluxe Case")
filemenu.add_separator()
filemenu.add_command(label="FAQ")
root.config(menu=menubar)
main_w.pack()
root.mainloop()