public boolean isPalindrome(String s) {
	    	int i = 0,j = s.length();
	    	while(i<j) {
	    		while(i<j&&!Character.isLetterOrDigit(i)) {
	    			i++;
	    		}
	    		while(i<j&&!Character.isLetterOrDigit(j)) {
	    			j--;
	    		}
	    		if(Character.toLowerCase(s.charAt(i))
	    				!=Character.toLowerCase(s.charAt(j)))
	    			return false;
	    		i++;j--;
	    	}
	    	return true;
	    }
