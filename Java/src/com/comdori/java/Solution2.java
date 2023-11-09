package com.comdori.java;

import java.util.Arrays;
import java.lang.Math;

class Solution2 {
    public int solution2(int [][]board)
    {
        int answer = 0;
        int [][] a = new int[board.length+1][board[0].length+1];

        for(int []row :a){ Arrays.fill(row,0);
        }

        for(int i=1;i<a.length;i++){
            for(int j=1;j<a[i].length;j++){
                a[i][j] = board[i-1][j-1];
                if(a[i][j] == 1){
                    a[i][j] = Math.min(Math.min(a[i-1][j-1],a[i-1][j]),a[i][j-1])+1;
                }
            }
        }

        for(int b=1; b<a.length; b++){
            for(int c=1; c<a[b].length; c++){
                if(answer < a[b][c]){
                    answer = a[b][c];
                }
            }
        }

        answer *= answer;
        return answer;
    }
    public static void main(String[] args){
        new Solution2();
    }
}