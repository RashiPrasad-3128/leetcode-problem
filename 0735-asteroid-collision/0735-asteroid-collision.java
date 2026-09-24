class Solution {
    public int[] asteroidCollision(int[] as) {
      Stack<Integer> st = new Stack<>();

        for (int i = 0; i < as.length; i++) {

            if (as[i] >= 0) {
                st.push(as[i]);
            }
            else {

                while (!st.isEmpty() &&
                       st.peek() > 0 &&
                       Math.abs(as[i]) > st.peek()) {

                    st.pop();
                }

                if (!st.isEmpty() &&
                    st.peek() == Math.abs(as[i])) {

                    st.pop();
                    continue;
                }

                if (st.isEmpty() || st.peek() < 0) {
                    st.push(as[i]);
                }
            }
        }

        int ans[] = new int[st.size()];

        for (int i = ans.length - 1; i >= 0; i--) {
            ans[i] = st.pop();
        }

        return ans;
}
}