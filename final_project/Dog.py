from Animal import Animal
from Salmon import Salmon
class Dog(Animal):
    def move(self):
        pass

    def voice(self):
        print("Gougw")

    def feed(self, salmon):
        if isinstance(salmon, Salmon):
            if salmon.isCoocked:
                self.__hunger -=4
            else: self.__hunger -=1
    def __init__(self, breed, name, age, hunger):
        self.__breed = breed
        self.__name = name
        self.__age = age
        self.__hunger = hunger