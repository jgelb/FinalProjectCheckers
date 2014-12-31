import java.io.*;
import java.util.*;
import java.util.Scanner;

public class board{
    private Character[][] board = new Character[9][18];
    public int moveRow = 0;
    public int moveCol = 0;
    public int pieceRow = 0;
    public int pieceCol = 0;

    public board(){
	int k = 1;
	for (int i=0;i<board.length;i++){
	    for (int j=0;j<board[0].length;j++){
		if (i == 8){
		    if (j < 17){
			if (j%2 == 1){
			    board[i][j] = (char)(((int)'0')+k);
			    k++;
			}
			else {
			    board[i][j] = ' ';
			}
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
    //Here will be the code that takes the user move input, and converts it to a spot in the array (for example, H8 is board[0][15])
    public int getMoveRow(){
        
	System.out.println("");
        System.out.println ("First enter a valid letter of the row to which you want to move");
	Scanner scanner= new Scanner(System.in);
	String Action = scanner.nextLine();
	if (Action.equals("H")){
	    moveRow = 0;
	}
	else if (Action.equals("G")){
	    moveRow = 1;
	}
	else if (Action.equals("F")){
	    moveRow = 2;
	}
	else if (Action.equals("E")){
	    moveRow = 3;
	}
	else if (Action.equals("D")){
	    moveRow = 4;
	}
	else if (Action.equals("C")){
	    moveRow = 5;
	}
	else if (Action.equals("B")){
	    moveRow = 6;
	}
	else if (Action.equals("A")){
	    moveRow = 7;
	}
	else getMoveRow();
	return moveRow;
    }

     public int getMoveCol(){
        
	System.out.println("");
        System.out.println ("Now enter a valid number of the column to which you want to move");
	Scanner scanner= new Scanner(System.in);
	String Action = scanner.nextLine();
	if (Action.equals("1")){
	    moveCol = 1;
	}
	else if (Action.equals("2")){
	    moveCol = 3;
	}
	else if (Action.equals("3")){
	    moveCol = 5;
	}
	else if (Action.equals("4")){
	    moveCol = 7;
	}
	else if (Action.equals("5")){
	    moveCol = 9;
	}
	else if (Action.equals("6")){
	    moveCol = 11;
	}
	else if (Action.equals("7")){
	    moveCol = 13;
	}
	else if (Action.equals("8")){
	    moveCol = 15;
	}
	else getMoveCol();
	return moveCol;
    }

    public int choosePieceRow(){
        
	System.out.println("");
        System.out.println ("Enter a valid letter of the row of the piece you want to move");
	Scanner scanner= new Scanner(System.in);
	String Action = scanner.nextLine();
	if (Action.equals("H")){
	    pieceRow = 0;
	}
	else if (Action.equals("G")){
	    pieceRow = 1;
	}
	else if (Action.equals("F")){
	    pieceRow = 2;
	}
	else if (Action.equals("E")){
	    pieceRow = 3;
	}
	else if (Action.equals("D")){
	    pieceRow = 4;
	}
	else if (Action.equals("C")){
	    pieceRow = 5;
	}
	else if (Action.equals("B")){
	    pieceRow = 6;
	}
	else if (Action.equals("A")){
	    pieceRow = 7;
	}
	else choosePieceRow();
	return pieceRow;
    }

     public int choosePieceCol(){
        
	System.out.println("");
        System.out.println ("Enter the column of the piece you want to move");
	Scanner scanner= new Scanner(System.in);
	String Action = scanner.nextLine();
	if (Action.equals("1")){
	    pieceCol = 1;
	}
	else if (Action.equals("2")){
	    pieceCol = 3;
	}
	else if (Action.equals("3")){
	    pieceCol = 5;
	}
	else if (Action.equals("4")){
	    pieceCol = 7;
	}
	else if (Action.equals("5")){
	    pieceCol = 9;
	}
	else if (Action.equals("6")){
	    pieceCol = 11;
	}
	else if (Action.equals("7")){
	    pieceCol = 13;
	}
	else if (Action.equals("8")){
	    pieceCol = 15;
	}
	else choosePieceCol();
	return pieceCol;
    }

    public void doMove(){
	//Here will be code for all of the possible move options

	//Basic moves
	if (moveRow == pieceRow + 1 && moveCol == pieceCol + 2){
	    if ( board[moveRow][moveCol].equals("x")){
		    System.out.println ("Illegal move");
		    getMoveRow();
		    getMoveCol();
	    	}
	    else if ( board[moveRow][moveCol].equals("o")){
		    System.out.println ("Illegal move");
		    getMoveRow();
		    getMoveCol();
	    	}
	    else {
		board[moveRow][moveCol] = 'o';
		board[pieceRow][pieceCol] = ' ';
	    }
		
      	}
	else if (moveRow == pieceRow + 1 && moveCol == pieceCol - 2){
	    if ( board[moveRow][moveCol].equals("x")){
		    System.out.println ("Illegal move");
		    getMoveRow();
		    getMoveCol();
	    	}
	    else if ( board[moveRow][moveCol].equals("o")){
		    System.out.println ("Illegal move");
		    getMoveRow();
		    getMoveCol();
	    	}
	    else {
		board[moveRow][moveCol] = 'o';
		board[pieceRow][pieceCol] = ' ';
	    }
		
      	}
	//-------------------------------------------------------------------
	//Capture moves
	if (moveRow == pieceRow + 2 && moveCol == pieceCol + 4){
	    if ( board[moveRow][moveCol].equals("x")){
		    System.out.println ("Illegal move");
		    getMoveRow();
		    getMoveCol();
	    	}
	    else if ( board[moveRow][moveCol].equals("o")){
		    System.out.println ("Illegal move");
		    getMoveRow();
		    getMoveCol();
	    	}
	    else if  ( board[moveRow][moveCol].equals(" ") && board[moveRow - 1][moveCol - 2].equals("x")){
		board[moveRow][moveCol] = 'x';
		board[pieceRow][pieceCol] = ' ';
		board[moveRow - 1][moveCol - 2] = ' ';
	    }
		
      	}
	if (moveRow == pieceRow + 2 && moveCol == pieceCol - 4){
	    if ( board[moveRow][moveCol].equals("x")){
		    System.out.println ("Illegal move");
		    getMoveRow();
		    getMoveCol();
	    	}
	    else if ( board[moveRow][moveCol].equals("o")){
		    System.out.println ("Illegal move");
		    getMoveRow();
		    getMoveCol();
	    	}
	    else if  ( board[moveRow][moveCol].equals(" ") && board[moveRow - 1][moveCol + 2].equals("x")){
		board[moveRow][moveCol] = 'x';
		board[pieceRow][pieceCol] = ' ';
		board[moveRow - 1][moveCol + 2] = ' ';
	    }
		
      	}
    }
	
    
    public static void main(String[] args){
	board x = new board();
	System.out.println(x);
	x.getMoveRow();
	x.getMoveCol();
	x.choosePieceRow();
	x.choosePieceCol();
	x.doMove();

    }
}
