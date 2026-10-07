class Solution {
public:
    int firstMissingPositive(vector<int>& nums) {
        int n = nums.size();
        unordered_set < int> st ;
        for(int i = 0; i < n; i++){
            st.insert(nums[i]);
        }
        int small = 1; 
        while(st.find(small) != st.end()){
            small++;
        }
        return small;
    }
};