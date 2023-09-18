class Solution {
    public int[] solution(int[] A, int K) {
        // Implement your solution here
        int N = A.length;

        if (N == 0 || N == 1) {
            return A;
        }

        int[] answer = new int[N];

        for (int idx = 0; idx < N; idx++) {
            if (idx + K < N) {
                answer[idx + K] = A[idx];
            } else {
                int rIdx = (idx + K) % N;
                answer[rIdx] = A[idx];
            }
        }

        return answer;
    }
}
