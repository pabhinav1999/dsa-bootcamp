#  Write a Python program to read an entire text file.
myfile = open('samplefile1.txt')
contents = myfile.read()
print(contents)
myfile.close()

with open('samplefile2.txt') as myfile2:
    print(myfile2.read())
myfile2.close()

# Write a Python program to read first n lines of a file.
numberOfLines = input('Enter the number of lines to be read:')
with open('samplefile1.txt', mode='r') as myfile3:
    for linenumber in range(0, int(numberOfLines)):
        print(myfile3.readline())
myfile3.close()

#Write a Python program to append text to a file and display the text.
myfile4 = open('samplefile3.txt', 'a')
myfile4.write('This is the third file \n and here is the content')
myfile4.close()

with open('samplefile3.txt') as myfile5:
    print(myfile5.read())
myfile5.close()

#Write a Python program to read last n lines of a file.
n = input('Enter n:')
with open('samplefile3.txt', mode='r') as myfile6:
    lines = myfile6.readlines()
    if len(lines) > int(n):
        lastlines = lines[-int(n):]
        print(lastlines)
myfile6.close()

# Write a Python program to count the frequency of words in a file.
frequencyCount = {}
with open('samplefile4.txt',mode='r') as myfile7:
    for index,line in enumerate(myfile7.readlines()):
        words = line.split()
        for word in words:
            if word in frequencyCount :
                frequencyCount[word]+=1
            else:
                frequencyCount[word] = 1
    
print(frequencyCount['of'])
myfile7.close()







