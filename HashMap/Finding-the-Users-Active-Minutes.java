// You are given the logs for users' actions on LeetCode, and an integer k. The logs are represented by a 2D integer array logs where each logs[i] = [IDi, timei] indicates that the user with IDi performed an action at the minute timei.

// Multiple users can perform actions simultaneously, and a single user can perform multiple actions in the same minute.

// The user active minutes (UAM) for a given user is defined as the number of unique minutes in which the user performed an action on LeetCode. A minute can only be counted once, even if multiple actions occur during it.

// You are to calculate a 1-indexed array answer of size k such that, for each j (1 <= j <= k), answer[j] is the number of users whose UAM equals j.

// Return the array answer as described above.

class Solution {
    public int[] findingUsersActiveMinutes(int[][] logs, int k) {
        HashMap<Integer,HashSet<Integer>> userMinutes=new HashMap<Integer,HashSet<Integer>>();
        int[] answer=new int[k];
        for(int i=0;i<logs.length;i++){
            userMinutes.putIfAbsent(logs[i][0],new HashSet<> ());
            userMinutes.get(logs[i][0]).add(logs[i][1]);
        }
       for(HashSet<Integer> value : userMinutes.values()){
           answer[value.size()-1]++;
       }
        return answer;
    }
}

//HashMap Function: putIfAbsent(), values()
//HashSet Function: add(),size()

