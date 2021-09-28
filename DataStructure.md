# String 
## String Method
```Java
 string s="ssdsd";
//length of string
s.length();
//get char from index
s.charAt(i);
 ```
# LinkedList
## LinkedList Method
```Java
//define a linkedlist
  LinkedList<String> ll = new LinkedList<String>();
  //add to end of a linkedlist
  ll.add("A");
  //remove a specific element
  ll.remove("B");
  //remove an element based on position
  ll.remove(2);
  //change of an element
   ll.set(1, "For"); 
   //Using the Get method and the 
        // for loop 
        for (int i = 0; i < ll.size(); i++) { 
    
            System.out.print(ll.get(i) + " "); 
        } 
    
        System.out.println(); 
    
        // Using the for each loop 
        for (String str : ll) 
            System.out.print(str + " "); 
    } 
  //number of elements
  ll.size();
  //To array
  ll.toArray();
```
## Algorithm
### delete a node 
set last node of the node's next node to the node's next node
```Java
ListNode nodeToDel,LastNode;
LastNode.next =  nodeToDel.next;
```
###
