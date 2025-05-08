package data_structures.twoDArrays;

import java.util.Arrays;

public class Example {
    public static void main(String[] args) {
        char[][] board = new char[3][3];
        for(int r =0;r<3; r++){
            for(int c=0; c<3;c++){
                board[r][c]='-';
            }
        }
        board[0][0]='O';
        board[1][1]='O';
        board[2][2]='O';
        System.out.println(Arrays.deepToString(board));
    }
}
