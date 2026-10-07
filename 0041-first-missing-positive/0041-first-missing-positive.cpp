class Solution {
public:
    int firstMissingPositive(vector<int>& nums) {
        unordered_set <int> st;
        int n = nums.size();
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