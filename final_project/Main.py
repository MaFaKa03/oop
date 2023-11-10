from Cat import Cat
from Salmon import Salmon

boris = Cat(1, True, "boris", 4)
salmon = Salmon(True)
boris.feed(salmon)
print(boris.getHunger())
