class Solution {
    public int[] solution(int[] num_list) {
        int odd_cnt = 0;
        int even_cnt = 0;
        
        for(int i = 0; i < num_list.length; i++) {
            if(num_list[i] % 2 == 0) even_cnt++;
            else odd_cnt++;
        }
        
        int[] answer = {even_cnt, odd_cnt};
        
        return answer;
    }
}