class Solution {
    public int[] twoSum(int[] nums, int tar) {
        int low=0;
        int high=nums.length-1;
        while(low<high){
        if(nums[low]+nums[high] == tar){return new int[]{low+1, high+1};
        }
            else if (nums[low] + nums[high]<tar){
                low++;       
            }
            else{
                high--;
            }
        }
            return null;
        }       
    }
