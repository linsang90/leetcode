public int removeElement(int[] nums, int val) {
        if(nums == null || nums.length == 0) return 0;
        int left = 0, right = nums.length - 1;
        while(left < right) {
            if(nums[left] == val) { 
                while(right > left && nums[right] == val) right--;
                if(left < right) swap(nums, left, right);
            }
            left++;
        }
        return (nums[right] == val)?right : right + 1;
    }
    
    private void swap(int[] nums, int p, int q) {
        int tmp = nums[p];
        nums[p] = nums[q];
        nums[q] = tmp;
    }
