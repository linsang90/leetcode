public boolean containsDuplicate(int[] nums) {
        if(nums.length < 2) return false;
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i : nums) set.add(i);
        return set.size() != nums.length;
    }
