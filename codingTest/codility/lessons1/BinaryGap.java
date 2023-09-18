public class BinaryGap {
    public static int solution(int N) {
        int start = -1;
        int count = 0;
        int answer = 0;
        String binary = Integer.toBinaryString(N);

        for (int i = 0; i < binary.length(); i++) {
            if (start < i && "1".equals(String.valueOf(binary.charAt(i)))) {
                answer = Math.max(count, answer);
                start = i;
                count = 0;
            }

            if ("0".equals(String.valueOf(binary.charAt(i)))) {
                count++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(String.format("Expect=%d, solution answer=%d", 2, solution(9)));
        System.out.println(String.format("Expect=%d, solution answer=%d", 4, solution(529)));
        System.out.println(String.format("Expect=%d, solution answer=%d", 1, solution(20)));
        System.out.println(String.format("Expect=%d, solution answer=%d", 0, solution(15)));
        System.out.println(String.format("Expect=%d, solution answer=%d", 0, solution(32)));
        System.out.println(String.format("Expect=%d, solution answer=%d", 5, solution(1041)));
    }
}
