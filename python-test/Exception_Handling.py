'''
Created on 04-Apr-2017

@author: Shriyesh
'''
def exceptionhandaling():
    try:
        a=2
        b=0
        c=a/b
        print(c)
    except:
        print('Not possible')
        raise Exception('This is an exception')
    else:
        print('No problem')
    finally:
        print('I always there')
exceptionhandaling()
        