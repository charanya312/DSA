class Solution {
    public String intToRoman(int num) {
        final int[] Values={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        final String[] symbols={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<Values.length;i++){
            if(num==0){
                break;
            }
            while(num>=Values[i]){
                sb.append(symbols[i]);
                num-=Values[i];
            }
        }
        return sb.toString();
    }
}