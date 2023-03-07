import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        char[][] board = {{'5', '3', '.', '.', '7', '.', '.', '.', '.'},{'6','.','.','1','9','5','.','.','.'},{'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},{'4','.','.','8','.','3','.','.','1'},{'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},{'.','.','.','4','1','9','.','.','5'},{'.','.','.','.','8','.','.','7','9'}};


        String[] t = new String[27];
        Arrays.fill(t,"");
        boolean result = true;
        char tc = '.';
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++) {
                tc = board[i][j];
                if(t[i].contains(Character.toString(tc))){result = false; break;} else if (tc == '.') {t[i]+="";}else {t[i]+=tc;}
                tc = board[j][i];
                if(t[i+9].contains(Character.toString(tc))){result = false; break;} else if (tc == '.') {t[i+9]+="";}else {t[i+9]+=tc;}
                tc = board[j/3+(i/3*3)][j%3+(i%3*3)];
                if(t[i+18].contains(Character.toString(tc))){result = false; break;} else if (tc == '.') {t[i+18]+="";}else {t[i+18]+=tc;}
            }
        }

        //    public boolean isValidSudoku(char[][] board) {
//        String[] t = new String[27];
//        Arrays.fill(t,"");
//        Set<String> test;
//        for(int i=0;i<9;i++){
//            for(int j=0;j<9;j++) {
//                t[i] += (board[i][j] != '.') ? board[i][j]:"";
//                t[i+9] += (board[j][i] != '.') ? board[j][i]:"";
//                t[i+18] += (board[j/3+(i/3*3)][j%3+(i%3*3)] != '.') ? board[j/3+(i/3*3)][j%3+(i%3*3)]:"";
//            }
//        }
//
//        boolean result = true;
//        for(int i=0;i<t.length;i++){
//            String[] testArray = t[i].split("");
//            int b = testArray.length;
//            test = new HashSet<>(Arrays.asList(testArray));
//            int a = test.size();
//            if(b != a){result = false;}
//        }
//        return result;
//    }

    }
}