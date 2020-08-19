package runtimepractice;

import java.util.HashMap;

public class RunTimePractice {

    public static int findNumsOfRepetitions(String s, char c) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                sum++;
            }
        }
        return sum;
    }

    public static int[] findNumsOfRepetitionsv1(String s, char[] c) {
        int[] sums = new int[c.length];
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < c.length; j++) {
                if (s.charAt(i) == c[j]) {
                    sums[j] = sums[j] + 1;
                }
            }
        }
        return sums;
    }

    public static int[] findNumsOfRepetitionsV2(String s, char[] c) {
        int[] sums = new int[c.length];
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), 1);
            } else {
                int sum = map.get(s.charAt(i));
                map.put(s.charAt(i), sum + 1);
            }
        }

        for (int j = 0; j < c.length; j++) {
            int sum;
            if (!map.containsKey(c[j])) {
                sums[j] = 0;
            } else {
                sums[j] = map.get(c[j]);
            }
        }
        return sums;
    }

    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();
        System.out.println("# Repetitions: " + findNumsOfRepetitions("abca", 'a'));
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        System.out.println("Execution time: " + duration + "ms");

        char [] a = {'a', 'b'};
        startTime = System.currentTimeMillis();
        System.out.println("# Repetitions: " + findNumsOfRepetitionsv1("abcasjskakskjajskasjajksakjjsajjsjakjssakfJHUICLQULGD ubcl vwdlWLLLLLL DTSGAH JSgGS", a));
        endTime = System.currentTimeMillis();
        duration = endTime - startTime;
        System.out.println("Execution time: " + duration + "ms");

        startTime = System.currentTimeMillis();
        System.out.println("# Repetitions: " + findNumsOfRepetitionsV2("abcasjskakskjajskasjajksakjjsajjsjakjssakfJHUICLQULGD ubcl vwdlWLLLLLL DTSGAH JSgGS", a));
        endTime = System.currentTimeMillis();
        duration = endTime - startTime;
        System.out.println("Execution time: " + duration + "ms");
    }
}
