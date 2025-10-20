class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for (String wrd : operations)
        {
            if (isMinus(wrd))
            x--;
            else
            x++;
        }
        return x;
        
    }
    boolean isMinus (String str)
    {
        if (str.charAt(0) == '-' || str.charAt(str.length()-1) == '-')
        return true;
        return false;
    }
}