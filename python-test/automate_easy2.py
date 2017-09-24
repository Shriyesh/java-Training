'''
Created on 25-Apr-2017

@author: Shriyesh
'''
#if loop
'''print('Enter your name')
name=input()
if name:
    print('You have sucessfully entered the name')
else:
    print('null values are not accepted')
   ''' 
#while loop
'''a=0
while a<=5:
    print(a)
    a+=1
    if a==4:
        break
        '''
#while loop 2
'''print('please enter your name')
name=input()
while name == '':
    print('please enter your name')
    name=input()
print('hi '+name)
'''
#builtin functions
'''import random,sys
print(random.randint(1,10))
sys.exit()
print('bye')'''
#custom function
'''def custom1(name):
    print('Function 1'+''+name)
def custom2():
    print('Function 2')
def plusone(number):
        return number+1

        
custom1('as')
custom2()
print(plusone(3))
print('hi',end='')#end keyword
print(' world')'''

'''def spam():
    eggs=10
    return eggs
eggs= spam()
print(eggs)'''
#Iterating the nested list
list1=['a','s','d',11,['q','w','e',[1,2,3]]]
'''def looping(list1):
    for each_item in list1:
        if isinstance(each_item,list):
            looping(each_item)
        else:
            print(each_item)
looping(list1)'''
#Exception handling
'''print('Please enter the number')
number1=input()
try:
    
    division=42/int(number1)
    print(division)
except:
    print('Division by 0 is not possible')'''
'''for a in range(2):
    var1=12
print(var1)'''




#The guess game
import random
print('hi,Whats ur name?')
name=input()
print('Hi '+name+' Lets play a guess game')
secretnumber=random.randint(1,10)
print('Your secret no is'+str(secretnumber))
print('You have 3 chances')
for guesstaken in range(1,4):
    print('Take a guess')
    guess=input()
    if int(guess)<secretnumber:
        print('Your guess is a low')
    elif int(guess)>secretnumber:
        print('Your guess is high')
    else:
        break
if int(guess)==secretnumber:
    print("You got a right guess my friend in "+str(guesstaken)+' attempt')
else:
    print('Better luck next time')

#Reading the text from file
'''readfile=open('barca.txt')
for each_line in readfile:
    print(each_line,end='')
readfile.close()
'''
#list
'''spam=[]
for addno in range(10):
    spam.append(addno)
    print(spam)
for search1 in spam:
    print(search1,end='')
spam.remove(3)
print(spam,end='')'''
#LIST methods
'''
list2=[2,4,1,3,7,6]
list3=['Shriyesh','Ajinkya','Mithun','Dhruv','Prashant']
list3.sort(reverse=True)
print(list3)

list2.sort(reverse=True)
print(list2)
'''
#Writing in a file
'''try:
    inputfile=open('barca.txt')
    outputfile=open('op.txt', 'w')
    print(inputfile.readline(),file=outputfile)
except:
    print('There is some error')
    
finally:
    inputfile.close()
    outputfile.close()
print('File created')'''
#Writing a file using with
'''try:
    inputfile=open('barca.txt')
     
    with open('op1.txt','w') as outputfile:
        print(inputfile.readline(),file=outputfile)
except:
    print('Something wrong')
    
inputfile.close()
print('File created')'''

#Counting characters in a String
'''import pprint
print('Please enter the message')
message=input()
count={}
for character in message:
    count.setdefault(character,0)
    count[character]+=1
    pprint.pprint(count)
'''

#Program on reading the data from the file and displaying the best records of 4 players
#Ingesting the data
'''try:
    with open('james.txt', 'w')as james:
        print('2-34,3:21,2.34,2.45,3.01,2.01,2.01,3:10,2-22',file=james)
except:
    print('Something wrong in james file')
try:
    with open('mikey.txt', 'w')as mikey:
        print('2:22,3.01,3:01,3.02,3:02,3.02,3.22,2.49,2:38',file=mikey)
except:
    print('Something wrong in mikey file')
try:
    with open('sarah.txt', 'w')as sarah:
        print('2:58,2.58,2:39,2-25,2-55,2.54,2.18,2:55,2:55',file=sarah)
except:
    print('Something wrong in sarah file')
try:
    with open('julie.txt', 'w')as julie:
        print('2.59,2.11,2.11,2:23,3-10,2-23,3:10,3.21,3-21',file=julie)
except:
    print('Something wrong in julie file')'''

#Function for formatting the data in the file
'''def sanitize(time_string):
    if '-' in time_string:
        splitter='-'
    elif ':' in time_string:
        splitter=':'
    else:
        return time_string
    (mins,secs)=time_string.split(splitter)
    return(mins+'.'+secs)
#Fetching the data from the files
def fetching_data(file_name):
    with open(file_name)as f:
        data=f.readline()
        return (data.strip().split(','))
james=fetching_data('james.txt')
julie=fetching_data('julie.txt')
mikey=fetching_data('mikey.txt')
sarah=fetching_data('sarah.txt')
'''
'''try:
    with open('james.txt')as jaf:
        data=jaf.readline()
        james=data.strip().split(',')
    with open('julie.txt')as jul:
        data=jul.readline()
        julie=data.strip().split(',')
    with open('mikey.txt')as mik:
        data=mik.readline()
        mikey=data.strip().split(',')
    with open('sarah.txt')as sar:
        data=sar.readline()
        sarah=data.strip().split(',')
except:
    print('Something went wrong')'''
       
#Printing the final data that contains best 3 records of each player
'''print('For James : '+str(sorted(set([sanitize(each_item) for each_item in james]),reverse=True)[0:3]))
print('For Mikey : '+str(sorted(set([sanitize(each_item) for each_item in mikey]),reverse=True)[0:3]))
print('For Sarah : '+str(sorted(set([sanitize(each_item) for each_item in sarah]),reverse=True)[0:3]))
print('For Julie : '+str(sorted(set([sanitize(each_item) for each_item in julie]),reverse=True)[0:3]))'''
#------------------------------------------------------------------------------------------------------------------------
#Same as above program but this time using dictionary
'''def sanitize(time_string):
    if '-' in time_string:
        splitter='-'
    elif ':' in time_string:
        splitter=':'
    else:
        return time_string
    (mins,secs)=time_string.split(splitter)
    return(mins+'.'+secs)

def fetching_data(file_name):
    try:
        with open(file_name)as f:
            data=f.readline()
            temp1=data.strip().split(',')
            return ({'Name':temp1.pop(0),'Birth-Date':temp1.pop(0),'Best-runs':str(sorted(set([sanitize(each_item) for each_item in temp1]),reverse=True)[0:3])})
    except:
        print('Something wrong in fetching the data')
        return(None)
james=fetching_data('james.txt')
julie=fetching_data('julie.txt')
mikey=fetching_data('mikey.txt')
sarah=fetching_data('sarah.txt')

print(james['Name']+' best 3 runs are'+str(james['Best-runs']))
print(julie['Name']+' best 3 runs are'+str(julie['Best-runs']))
print(sarah['Name']+' best 3 runs are'+str(sarah['Best-runs']))
print(mikey['Name']+' best 3 runs are'+str(mikey['Best-runs']))'''
#--------------------------------------------------------------------------
#Same as above 2 programs but this time using class
'''def sanitize(time_string):
        if '-' in time_string:
            splitter='-'
        elif ':' in time_string:
            splitter=':'
        else:
            return time_string
        (mins,secs)=time_string.split(splitter)
        return(mins+'.'+secs)




class Athlete:
    
    def __init__(self,a_name,a_dob=None,a_times=[]):
        self.name=a_name
        self.dob=a_dob
        self.times=a_times
    def add_time_value(self,time_value):
        self.times.append(time_value)
    def add_time_values(self,time_values):
        self.times.extend(time_values)
    
    def top3(self):
        return (sorted(set([sanitize(each_item) for each_item in self.times]),reverse=False)[0:3])
def fetching_data(file_name):
    try:
        with open(file_name)as f:
            data=f.readline()
            temp1=data.strip().split(',')
            return (Athlete(temp1.pop(0),temp1.pop(0),temp1))
    except:
        print('Something wrong in fetching the data')
        return(None)
vera=Athlete('Vera','02-20-1992')
vera.add_time_value('1.30')
print(vera.top3())
vera.add_time_values(['3:4','3.5'])
print(vera.top3())
print('-'*20)
james=fetching_data('james.txt')
julie=fetching_data('julie.txt')
sarah=fetching_data('sarah.txt')
mikey=fetching_data('mikey.txt')
print(james.name+" 's fastest times are: "+str(james.top3()))
print(julie.name+" 's fastest times are: "+str(julie.top3()))
print(sarah.name+" 's fastest times are: "+str(sarah.top3()))
print(mikey.name+" 's fastest times are: "+str(mikey.top3()))'''