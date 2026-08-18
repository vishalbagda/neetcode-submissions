class Solution {
    public int findJudge(int n, int[][] trust) {

        int[] score = new int[n + 1];

        for (int[] t : trust) {
            int a = t[0];
            int b = t[1];

            score[a]--;  // a trusts someone
            score[b]++;  // b is trusted by someone
        }

        for (int person = 1; person <= n; person++) {
            if (score[person] == n - 1) {
                return person;
            }
        }

        return -1;
    }
}