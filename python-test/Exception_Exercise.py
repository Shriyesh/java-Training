'''
Created on 04-Apr-2017

@author: Shriyesh
'''
car={'Aston Martin':'R6','BMW':'R7','Audi':'R8'}
try:
    print(car['Bentley'])
except:
    print('Bentley key is not present in the dictionary')
    raise Exception
finally:
    print('Finally')

