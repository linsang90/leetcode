c class Solution {
    public int atoi(String str) {
        int result = 0;
        boolean isValid = false;
        boolean isNegative = false;
        if(str.length() >0) {
            int i = 0;
            for(;i<str.length();i++){
                if((int)str.charAt(i) != 20) {
                    if((int)str.charAt(i) == 43)isNegative = false;
                    if((int)str.charAt(i) == 45) isNegative = true;
                    if(47<(int)str.charAt(i) && (int)str.charAt(i)<60){
                        isValid = true;
                        result = result *10 + ((int)str.charAt(i)-48);
                        if(isNegative)
                            if(-1*result>0) return Integer.MIN_VALUE;
                        else if(result<0) return Integer.MAX_VALUE;
                    }
                    //if(isValid == false) return 0;
                }
            }
        }
        if(isNegative) return (-1*result);
        else return result;
     
    }
}
