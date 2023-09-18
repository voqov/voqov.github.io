class Solution {
    public int[] solution(int[] A, int K) {
        // Implement your solution here
        int length = A.length;

        if (length == 0 || length == 1 || length == K) {
            return A;
        }

        int[] answer = new int[A.length];

        for (int idx = 0; idx < length; idx++) {
            if (idx + K < length) {
                answer[idx + K] = A[idx];
            } else {
                answer[idx + K - length] = A[idx];
            }
        }
        return answer;
    }
}
