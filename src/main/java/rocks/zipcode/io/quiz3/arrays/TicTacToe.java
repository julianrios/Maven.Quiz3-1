package rocks.zipcode.io.quiz3.arrays;

import java.util.Arrays;

/**
 * @author leon on 09/12/2018.
 */
public class TicTacToe {
    private String[][] board;

    public TicTacToe(String[][] board) {
        this.board = board;
    }

    public TicTacToe() {
    }

    public String[] getRow(Integer value) {
        return board[value];
    }

    public String[] getColumn(Integer value) {
        String[] column = new String[3];

        for(int i = 0; i < column.length; i ++) {
            column[i] = getRow(i)[value];
            System.out.println(column[i]);
        }
        return column;
    }

    public Boolean isRowHomogenous(Integer rowIndex) {
        String[] row = board[rowIndex];

        for(int i = 0; i< row.length-1;i++){
            if(row[i].equals(row[i + 1])){
                return true;
            }
        }
        return false;
    }

    public Boolean isColumnHomogeneous(Integer columnIndex) {
        String[] column = getColumn(columnIndex);

        for(int i = 0; i< column.length-1;i++){
            if(!column[i].equals(column[i + 1])){
                return false;
            }
        }
        return true;
    }

    public String getWinner() {
        return null;
    }

    public String[][] getBoard() {
        return board;
    }
}
