## Heap
Definition: A compete tree (each node have two children except for last level, last level can have one children but all to the left), with root value the smallest or biggest
### Data structure
Stored in a array with levelwise order\
for each parent node with index i\
left node = 2*i+1\
right node = 2*i+2\
fro each node except for root\
Parent node = (i-1)/2\
### Insertion
From bottom to top root, replace parent node if bigger
### Delete
