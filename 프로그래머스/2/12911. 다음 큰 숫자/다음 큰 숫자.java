class Solution {
    public int solution(int n) {
        String binary = Integer.toBinaryString(n);
        int cnt = binary.length() - binary.replace("1","").length();
        
        while(true){
            n++;
            String nBinary = Integer.toBinaryString(n);
            int nCnt = nBinary.length() - nBinary.replace("1","").length();
            
            if(cnt == nCnt){
                return n;
            }
        }
    }
}