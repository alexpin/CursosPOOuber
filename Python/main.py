from car import Car
from account import Account
from uberX import UberX
from user import user

if __name__ == "__main__":
    print("Iniciando informacion de la base Uber")    
    car = Car("AMS234", Account("Andres Herrera", "ANDA876"))
    print(vars(car))
    print(vars(car.driver))
    