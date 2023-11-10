from Animal import Animal
from Salmon import Salmon

class Cat(Animal):
    def move(self):
        pass

    def voice(self):
        print("myouu")
    def getHunger(self):
        return self.__hunger
    def feed(self, salmon):
        if isinstance(salmon, Salmon):
            if salmon.isCoocked:
                self.__hunger -=5
            else: self.__hunger -=1

    __isInGoodMood = True
    __name = ""
    __age = 0
    __hunger = 0

    def __init__(self, isInGoodMood, name, age, hunger):
        #super().__init__()
        self.__isInGoodMood = isInGoodMood
        self.__name = name
        self.__age = age
        self.__hunger = hunger