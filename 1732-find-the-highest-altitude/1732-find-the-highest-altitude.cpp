class Solution {
public:
    int largestAltitude(vector<int>& gain) {
        int altitude = 0;
        int maxal = 0;
        for(int i = 0; i < gain.size(); i++){
            altitude+= gain[i];
            maxal = max(altitude,maxal);
        }
        return maxal;
    }
};