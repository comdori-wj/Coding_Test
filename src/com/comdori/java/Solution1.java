package com.comdori.java;
import java.util.*;

public class Solution1 {
    public int solution(int n) {
        int answer = 0;
        int a = 0;

        while(true){
            a = n%10;
            n = n/10;
            answer += a;

            if(n==0) break;
        }
        return answer;
    }
    public static void main(String[] args){
        new Solution1();
    }
}