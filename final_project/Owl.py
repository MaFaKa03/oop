from Animal import Animal
from Salmon import Salmon
class Owl(Animal):
    def move(self):
        pass

    def voice(self):
        print("wow")

    def feed(self, salmon):
        if isinstance(salmon, Salmon):
            if salmon.isCoocked:
                self.__hunger -=6
            else: self.__hunger -=2
    def __init__(self, isDomesticated, name, age, hunger):
        self.__isDomesticated = isDomesticated
        self.__name = name
        self.__age = age
        self.__hunger = hunger