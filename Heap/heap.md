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
Always replace deleted node with right most node in last level to keep the tree complete\
Then either look up or look down the tree (only one way because tree has lebel order)\
if look up: fix the heap by swapping with parent like insertion\
if look down : swap with the larger of left and right children to keep the order\
