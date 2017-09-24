class Car(object):
    wheels=4
    def __init__(self,make,model):
        self.make=make
        self.model=model
    def info(self):
        print('Manufacturer of the car: '+self.make)
        print('Model of the car: '+self.model)
        print('No of wheels: '+str(Car.wheels))
    def test1(self):
        print('Hi i have been imported from other class ')

c1=Car('bmw','Z50')
c1.info()
c2=Car('Aston Martin','C23')
c2.info()


