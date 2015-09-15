 public int[] plusOne(int[] digits) {
        int mark = 0;
        for(int i=digits.length-1;i>=0;i--){
            int initSum = 0;
            if(i==digits.length-1) initSum = digits[i]+1;
            else {
            initSum = digits[i]+mark;
            }
            mark = 0;
            if(initSum>9){
                initSum -=10;
                mark = 1;
                digits[i] = initSum;
                if(i==0){
                    int[] res = new int[digits.length+1];
                    res[0] = 1;
                    for(int j=0;j<digits.length-1;j++) {
                        res[j+1] = digits[j];
                    }
                    return res;
                }
            }
            digits[i] = initSum;
        }
        return digits;
    }
