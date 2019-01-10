'''
Created on 08.01.2019

@author: Nimit
'''


def insertionSort(A): 
  
    for i in range(1, len(A)): 
  
        h = A[i] 
  
        j = i-1
        while j >=0 and A[j] > h: 
                A[j+1] = A[j] 
                j = j - 1
        A[j+1] = h
        
        A = [12, 11, 13, 5, 6] 
        insertionSort(A)
        for i in range(len(A)): 
            print ("%d" %A[i])