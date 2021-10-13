### Dummy recursive method
```JAVA
        //recursive calling 
       // increment target by 1 at a time, check if it's ugly 
        //how to deterjine whether it's ugly? 
       // using 2,3,5 to divide, if result is 1 found
        //    if not increment 1
        //    else find ugly number
      //  keep tracking of ugly numbers: if result amoung stored ugly numbers then find ugly number
   class Solution {
    public int nthUglyNumber(int n) {
        if(n == 1){
            return 1;
        }
        int target = nthUglyNumber(n-1)+1;
        int result = target;

        while(true){
                     
            result = target;
           while(result/2 * 2 == result){
               result = result / 2;
             
           }
             while(result/3 * 3 == result){
               result = result / 3;
           }
             while(result/5 * 5 == result){
               result = result / 5;
           }
            if(result == 1){
                break;
            }
            else{
                target++;
            }
        
            
        }
       }
     }
```
### Priority  Queue
The ugly sequence is 1,2,3,4,5,6,8,9,10,12 ...\
Other elements in ugly list :\
1x2,2x2,3x2,4x2,5x2,6x2,8x2,9x2,10x2,12x2...\
1x3,2x3,3x3,4x3,5x3,6x3,8x3,9x3,10x3 ...\
1x5,2x5,3x5,4x5,5x5,6x5,8x5,9x5,10x5,12x5...\
Main goal is to find the next smallest number in all the three sorted list\
for Each number that is in the sequence, we find the number mutiply by 2,3,5, the result will be in the same list\
Sounds like a queue
#### like in 378. Kth Smallest Element in a Sorted Matrix
```JAVA
class Solution {
    public int nthUglyNumber(int n) {
PriorityQueue<Long> q = new PriorityQueue<Long>();
q.add(1);
int i = 0;
while(i<n){
  Long base = q. poll();
  i++;
  while(!q.isEmpty() && q.peek() == base){
    q.poll();
  }
  q.add(base*2);
  q.add(base*3);
  q.add(base*5);
}
return base.intValue();
}
}
```
### Three pointers
#### Remeber to check duplicate numbers added
```JAVA
class Solution {
    public int nthUglyNumber(int n) {
/sequence contains original sequence multiply 2, 3, 5
        //order the sequence by result of multipty from 3 lists
  
            
        
        int[] ugly = new int[n];
        int index2 = 0;
        int index3 = 0;
        int index5 = 0;
        int factor2 = 2;
        int factor3 = 3;
        int factor5 = 5;
        
        ugly[0] = 1;
        for(int i = 1; i < n; i++){
            
            int min = Math.min(Math.min(factor2,factor3),factor5);
            ugly[i] = min;
            if(factor2 == min){
                factor2 = ugly[++index2]*2;
            }
            if(factor3 == min){
                factor3 = ugly[++index3]*3;
                
            }
            if(factor5 == min){
                factor5 = ugly[++index5]*5;
                
            }
}
        return ugly[n-1];

}
}   
```
