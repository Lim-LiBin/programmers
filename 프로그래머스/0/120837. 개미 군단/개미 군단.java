class Solution {
    public int solution(int hp) {
        int answer = 0;
        
        int ant1 = hp / 5;
        int ant2 = (hp % 5) / 3;
        int ant3 = ((hp % 5) % 3) / 1;
        
        answer = ant1 + ant2 + ant3;
        
        return answer;
    }
}