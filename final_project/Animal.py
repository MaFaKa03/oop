from abc import ABC, abstractmethod
class Animal(ABC):

    @abstractmethod
    def move(self):
        pass
    @abstractmethod
    def voice(self):
        pass
    @abstractmethod
    def feed(self, hunger):
        pass
    def getHunger(self):
        pass
    def __init__(self, isInGoodMood, name, age, hunger):
        self.isInGoodMood = isInGoodMood
        self.name = name
        self.age = age
        self.hunger = hunger
