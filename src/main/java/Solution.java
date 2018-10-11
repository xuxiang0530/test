import java.util.ArrayList;
import java.util.List;

/**
 * Created by xuxiang on 2018/10/11.
 */
public class Solution {
    public Solution()
    {

    }

    /*
    给定一个int数组nums,寻找里面所有的A,B,C集合,使A + B + C = 0.
    例如: nums = {-1,0,1,2,-1,-1},
    结果:[[-1,0,1],[-1,-1,2]]
     */
    public List<List<Integer>> threeSum(int[] nums)
    {
        ArrayList<List<Integer>> outList = new ArrayList<List<Integer>>();

        return outList;
    }
    /*
    给定一组非负整数，重新排列它们的顺序使之组成一个最大的整数
     */
    public String largestNumber(int[] nums)
    {
        Integer x = 0;
        Integer y = 0;
        StringBuffer strBuff = new StringBuffer();

        for(int i = 0;i < nums.length; i++)
        {
            for(int j = i+1;j< nums.length; j++)
            {
                x = nums[i];
                y = nums[j];

                if(Integer.parseInt(x.toString() + y.toString()) > Integer.parseInt(y.toString() + x.toString()))
                {
                    nums[i] = x;
                    nums[j] = y;
                }
                else
                {
                    nums[i] = y;
                    nums[j] = x;
                }
            }
        }

        for(Integer i : nums)
        {
            strBuff.append(i.toString());
        }

        return  strBuff.toString();
    }
}
