class Car(object):
    def __init__(self):
        print('Instance of car has been created')
    def start(self):
        print('Car has been started')
    def stop(self):
        print('Car has been stopped')
class BMW(Car):
    def __init__(self):
        Car.__init__(self)
        print('Instance of BMW is been created')
c=Car()
c.start()
c.stop()

b=BMW()
b.start()
b.stop()