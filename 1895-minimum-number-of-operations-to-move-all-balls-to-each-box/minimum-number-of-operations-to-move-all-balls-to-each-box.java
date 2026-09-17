class Solution {
    public int[] minOperations(String boxes) {
        int[] res = new int[boxes.length()];
        int index = 0;
        for(int i = 0 ; i < boxes.length() ; i++)
        {
            int steps = 0;
            for(int j = i+1 ; j < boxes.length() ; j++)
            {
                if(boxes.charAt(j)=='1')
                {
                    steps += (j-i);
                }
            }
            for(int k = i-1 ; k >= 0 ; k--)
            {
                if(boxes.charAt(k)=='1')
                {
                    steps += (i-k);
                }
            }
            res[index++] = steps;
        }
        return res;
    }
}