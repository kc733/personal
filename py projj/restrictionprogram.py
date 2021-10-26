def haha_game():
    print("What is your name?")
    name = input()
    print("     ")
    print("Welcome, " + name)
    print("___________________________")
    print("     ")
    print("Now enter your age, please: ")
    age = int(input())
    print("     ")
    print("So you are ", age, ", correct?")
    print("___________________________")
    print("     ")

    def game():
        print("Which game do you want to play? Choose one and write down it's number:")
        print("     ")
        print("1.Footwords 2.Fucking your mom 3.Play time with stepdad ")
        print("     ")

    def continue_program():
        print("So, what is your credit card number?")
        input()
        print("___________________________")
        print("     ")
        print("No need to be so rude! /./ Do you want to play a game? Enter y/n")
        print("     ")
        answer = input()
        if answer == "y": 
            print("     ")
            print("Let's get started then!")
            print("___________________________")
            print("     ")
            game()
        else:
            print("     ")
            print("Okay :(")

    
    if age > 16:
        print("Access granted")
        print("___________________________")
        print("     ")
        continue_program()
    else:
        print("Access denied")
        print("___________________________")
        print("     ")


haha_game()




