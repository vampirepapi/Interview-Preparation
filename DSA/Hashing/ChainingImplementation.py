# Creating a MyHash class
class MyHash:
    # Creating a default constructor 
    def __init__(self,b):
        self.bucket = b
        self.table = [[] for x in range(b)]
    
    # Insert Method
    def insert(self,x):
        i = x % self.bucket
        self.table[i].append(x)

    # Remove Method
    def remove(self,x):
        i = x % self.bucket
        if x in self.table[i]:
            self.table[i].remove(x)
    
    # Search Method
    def search(self,x):
        i = x % self.bucket
        return x in self.table[i]