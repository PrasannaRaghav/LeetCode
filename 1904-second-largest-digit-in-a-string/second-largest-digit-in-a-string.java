class Solution {
    public int secondHighest(String s) {
    int largest = -1;
    int second = -1;
    for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        if(Character.isDigit(ch)){
            int digit=ch-'0';
            if (digit>largest) {
                second=largest;
                largest=digit;
            }
            else if(digit<largest && digit>second) {
                second=digit;
            }
        }
    }
    return second;   
    }
}