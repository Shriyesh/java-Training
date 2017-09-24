class Fruit(object):
    def __init__(self):
        print('Instance of fruit is been created')
    def nutrition(self):
        print("Nurition method of Fruit class")
    def fruit_shape(self):
        print('Fruit shape of Fruit class')
class Apple(Fruit):
    def __init__(self):
        super(Apple,self).__init__()
        print('Instance of Apple class is been created')
    def nutrition(self):
        super(Apple,self).nutrition()
        print('Nutrition method of Apple')
    def color(self):
        print('Color method of Apple class')
        
f=Fruit()

f.nutrition()
f.fruit_shape()
print('****************************************************')
a=Apple()

a.nutrition()
a.fruit_shape()
a.color()
