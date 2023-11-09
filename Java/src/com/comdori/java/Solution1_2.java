package com.comdori.java;

import java.util.*;

public class Solution1_2 {
    public int solution(int n) {
        int answer = 0;
        while(n>0) {
            answer += n%10;
            n = n/10;
        }

        return answer;
    }
    public static void main(String[] args){
        new Solution1_2();
    }

}