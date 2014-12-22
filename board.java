public class board{
    private char[][] board = new char[9][18];
    
    public board(){
	for (int i=0;i<board.length;i++){
	    for (int j=0;j<board[0].length;j++){
		if (i == 8){
		    if (j%2 == 1){
			board[i][j] = 'h';
		    }
		}
		else if (j == board[0].length-1){
		    if (i==0){
			board[i][j] = 'H';
		    }
		    else if (i==1){
			board[i][j] = 'G';
		    }
		    else if (i==2){
			board[i][j] = 'F';
		    }
		    else if (i==3){
			board[i][j] = 'E';
		    }
		    else if (i==4){
			board[i][j] = 'D';
		    }
		    else if (i==5){
			board[i][j] = 'C';
		    }
		    else if (i==6){
			board[i][j] = 'B';
		    }
		    else if (i==7){
			board[i][j] = 'A';
		    }
		}
		else if (i == 0 || i == 2){
		    if (j%2 == 0){
			board[i][j] = '|';
		    }
		    else if (j%4 == 1){
			board[i][j] = 'x';
		    }
		    else {
			board[i][j] = ' ';
		    }
		}
		else if (i == 1){
		    if (j%2 == 0){
			board[i][j] = '|';
		    }
		    else if (j%4 == 1){
			board[i][j] = ' ';
		    }
		    else{
			board[i][j] = 'x';
		    }
		}
		else if (i == 3 || i == 4){
		    if (j%2 == 0){
			board[i][j] = '|';
		    }
		    else{
			board[i][j] = ' ';
		    }
		}
		else if (i == 5 || i == 7){
		    if (j%2 == 0){
			board[i][j] = '|';
		    }
		    else if (j%4 == 1){
			board[i][j] = ' ';
		    }
		    else{
			board[i][j] = 'o';
		    }
		}
		else {
		    if (j%2 == 0){
			board[i][j] = '|';
		    }
		    else if (j%4 == 1){
			board[i][j] = 'o';
		    }
		    else {
			board[i][j] = ' ';
		    }
		}
	    }
	}
    }

    public String toString(){
	String s = "";
	for (int i=0;i<board.length;i++){
	    for (int j=0;j<board[0].length;j++){
		s += board[i][j];
	    }
	    s += "\n";
	}
	return s;
    }

    public static void main(String[] args){
	board x = new board();
	System.out.println(x);
    }
}
