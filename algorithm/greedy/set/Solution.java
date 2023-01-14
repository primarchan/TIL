package algorithm.greedy.set;

import java.util.HashSet;

/**
 * 문제 : 프로그래머스 / 코딩테스트 연습 / 탐욕법 (Greedy) / 체육복용
 * 해결 방법 : HashSet 사용
 * 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/42862
 */

public class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        // 1. Set 을 만든다.
        HashSet<Integer> reserveSet = new HashSet<>();
        HashSet<Integer> lostSet = new HashSet<>();

        for (int i : reserve) {
            reserveSet.add(i);
        }

        for (int i : lost) {
            if (reserveSet.contains(i)) {
                reserveSet.remove(i);
            } else {
                lostSet.add(i);
            }
        }
        // 2. 여분을 기준으로 앞뒤로 확인하여 체육복을 빌려준다.
        for (int i : reserveSet) {
            if (lostSet.contains(i-1)) {
                lostSet.remove(i-1);
            } else if (lostSet.contains(i+1)) {
                lostSet.remove(i+1);
            }
        }

        // 3. 전체 학생 수에서 lostSet 에 남은 학생수를 빼준다.
        return n - lostSet.size();
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] lost = { 2, 4 };
        int[] reserve = { 1, 3, 5 };
        System.out.println(sol.solution(5, lost, reserve));
    }

}
