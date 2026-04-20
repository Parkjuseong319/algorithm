import java.util.*;

class Solution {
     public int solution(int N, int number) {
        if (N == number) return 1;

        List< Set<Integer> > list = new ArrayList<>();
        for (int i = 0; i <= 8; i++) {
            list.add(new HashSet<Integer>());
        }
        list.get(1).add(N);
        int NN = N;

        int count = -1;
        for (int i = 2; i <= 8; i++) {
           for (int j = 1; j <= i; j++) {
               Set<Integer> set = list.get(i);
               for( int k : list.get(j)) {
                   for( int l : list.get(i-j)) {
                       set.add(k + l);
                       set.add(k - l);
                       set.add(k * l);
                       if(l != 0) set.add(k / l);
                   }
               }
           list.add(set);
           }
           NN = NN*10 + N;
           list.get(i).add(NN);
           if(list.get(i).contains(number)) return i;
        }

        return count;
    }
}