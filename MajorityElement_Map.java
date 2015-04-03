public int majorityElement(int[] num) {
        if(num.length==1) return num[0];
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i:num) {
            if(map.containsKey(i)) {
                if(map.get(i)+1>num.length/2) return i;
                else map.put(i,map.get(i)+1);
            }
            else {
                map.put(i,1);
            }
        }
        return 0;
}
