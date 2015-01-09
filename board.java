import java.io.*;
import java.util.*;
import java.util.Scanner;

public class board{
    private char[][] board = new char[9][18];
    public int moveRow = 0;
    public int moveCol = 0;
    public int pieceRow = 0;
    public int pieceCol = 0;
    public boolean gameOver = false;

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
    public void chooseMoveSpace(){
	System.out.println ("WHERE DO YOU WANT TO MOVE? (i.e. D5)");
	Scanner scanner= new Scanner(System.in);
	String Action = scanner.nextLine();
	if (Action.substring(0,1).equals("H")){
	    moveRow = 0;
	}
	else if (Action.substring(0,1).equals("G")){
	    moveRow = 1;
	}
	else if (Action.substring(0,1).equals("F")){
	    moveRow = 2;
	}
	else if (Action.substring(0,1).equals("E")){
	    moveRow = 3;
	}
	else if (Action.substring(0,1).equals("D")){
	    moveRow = 4;
	}
	else if (Action.substring(0,1).equals("C")){
	    moveRow = 5;
	}
	else if (Action.substring(0,1).equals("B")){
	    moveRow = 6;
	}
	else if (Action.substring(0,1).equals("A")){
	    moveRow = 7;
	}
	else {
	    System.out.println("Error");
	    choosePieceSpace();
	}
	if (Action.substring(1).equals("1")){
	    moveCol = 1;
	}
	else if (Action.substring(1).equals("2")){
	    moveCol = 3;
	}
	else if (Action.substring(1).equals("3")){
	    moveCol = 5;
	}
	else if (Action.substring(1).equals("4")){
	    moveCol = 7;
	}
	else if (Action.substring(1).equals("5")){
	    moveCol = 9;
	}
	else if (Action.substring(1).equals("6")){
	    moveCol = 11;
	}
	else if (Action.substring(1).equals("7")){
	    moveCol = 13;
	}
	else if (Action.substring(1).equals("8")){
	    moveCol = 15;
	}
	else {
	    System.out.println("Error");
	    choosePieceSpace();
	}
    }


    public void choosePieceSpace(){
        
	System.out.println("");
        System.out.println ("WHICH PIECE DO YOU WANT TO MOVE? (i.e. D5)");
	Scanner scanner= new Scanner(System.in);
	String Action = scanner.nextLine();
	if (Action.substring(0,1).equals("H")){
	    pieceRow = 0;
	}
	else if (Action.substring(0,1).equals("G")){
	    pieceRow = 1;
	}
	else if (Action.substring(0,1).equals("F")){
	    pieceRow = 2;
	}
	else if (Action.substring(0,1).equals("E")){
	    pieceRow = 3;
	}
	else if (Action.substring(0,1).equals("D")){
	    pieceRow = 4;
	}
	else if (Action.substring(0,1).equals("C")){
	    pieceRow = 5;
	}
	else if (Action.substring(0,1).equals("B")){
	    pieceRow = 6;
	}
	else if (Action.substring(0,1).equals("A")){
	    pieceRow = 7;
	}
	else {
	    System.out.println("Error");
	    choosePieceSpace();
	}
	if (Action.substring(1).equals("1")){
	    pieceCol = 1;
	}
	else if (Action.substring(1).equals("2")){
	    pieceCol = 3;
	}
	else if (Action.substring(1).equals("3")){
	    pieceCol = 5;
	}
	else if (Action.substring(1).equals("4")){
	    pieceCol = 7;
	}
	else if (Action.substring(1).equals("5")){
	    pieceCol = 9;
	}
	else if (Action.substring(1).equals("6")){
	    pieceCol = 11;
	}
	else if (Action.substring(1).equals("7")){
	    pieceCol = 13;
	}
	else if (Action.substring(1).equals("8")){
	    pieceCol = 15;
	}
	else {
	    System.out.println("Error");
	    choosePieceSpace();
	}
    }

   
    public void doMove(){
	//Here will be code for all of the possible move options

	//Basic moves
	if (moveRow == pieceRow - 1 && moveCol == pieceCol + 2){
	    if ( board[moveRow][moveCol]=='x'){
		    System.out.println ("Illegal move");
		    choosePieceSpace();
	    	}
	    else if ( board[moveRow][moveCol]=='o'){
		    System.out.println ("Illegal move");
		    choosePieceSpace();
	    	}
	    else {
		board[moveRow][moveCol] = 'o';
		board[pieceRow][pieceCol] = ' ';
	        
	    }
		
      	}
	else if (moveRow == pieceRow - 1 && moveCol == pieceCol - 2){
	    if ( board[moveRow][moveCol]=='x'){
		    System.out.println ("Illegal move");
		    choosePieceSpace();
	    	}
	    else if ( board[moveRow][moveCol]=='o'){
		    System.out.println ("Illegal move");
		    choosePieceSpace();
	    	}
	    else {
		board[moveRow][moveCol] = 'o';
		board[pieceRow][pieceCol] = ' ';
	        
	    }
		
      	}
	//-------------------------------------------------------------------
	//Capture moves
	if (moveRow == pieceRow - 2 && moveCol == pieceCol + 4){
	    if ( board[moveRow][moveCol]=='x'){
		    System.out.println ("Illegal move");
		    choosePieceSpace();
	    	}
	    else if ( board[moveRow][moveCol]=='o'){
		    System.out.println ("Illegal move");
		    choosePieceSpace();
	    	}
	    else if  (( board[moveRow][moveCol]==' ') && (board[moveRow + 1][moveCol - 2]=='x')){
		board[moveRow][moveCol] = 'o';
		board[pieceRow][pieceCol] = ' ';
		board[moveRow + 1][moveCol - 2] = ' ';
	    }
		
      	}
	if (moveRow == pieceRow - 2 && moveCol == pieceCol - 4){
	    if ( board[moveRow][moveCol]=='x'){
		    System.out.println ("Illegal move");
		    choosePieceSpace();
	    	}
	    else if ( board[moveRow][moveCol]=='o'){
		    System.out.println ("Illegal move");
		    choosePieceSpace();
	    	}
	    else if  (( board[moveRow][moveCol]==' ') && (board[moveRow + 1][moveCol + 2]=='x')){
		board[moveRow][moveCol] = 'o';
		board[pieceRow][pieceCol] = ' ';
		board[moveRow + 1][moveCol + 2] = ' ';
	    }
		
      	}
    }

    //Computer move functions-------------------------------------------------------------------------------------
   public boolean blockMove(){
       boolean blocked = false;
       for (int i=1;i<board.length-2;i++){
	   for (int j=3;j<board[0].length-4;j++){
	       if (board[i][j] == 'x') {
		   if (board[i + 1][j + 2] == 'o') {
		       if (board[i - 1][j - 2] == ' '){
			   if (board[i -2][j - 4] == 'x'){
			       blocked = true;
			       board[i-2][j-4] = ' ';
			       board [i -1][j - 2] = 'x';
			       return true;
			   }
			   else if (board[i -2][j] == 'x'){
			       blocked = true;
			       board[i-2][j] = ' ';
			       board [i -1][j -2] = 'x';
			       return true;
			   }
		       }
		
		   }
		   else if (board[i + 1][j - 2] == 'o'){
		       if (board[i - 1][j + 2] == ' '){
			   if (board[i -2][j + 4] == 'x'){
			       blocked = true;
			       board[i-2][j+4] = ' ';
			       board [i -1][j + 2] = 'x';
			       return true;
			   }
			   else if (board[i -2][j] == 'x'){
			       blocked = true;
			       board[i-2][j] = ' ';
			       board [i -1][j + 2] = 'x';
			       return true;
			   }
		       }
		   }
	       }
	   }
       }
       return false;
   }

    public boolean escape(){
	boolean escaped = false;
	for (int i=1;i<board.length-2;i++){
	    for (int j=3;j<board[0].length-4;j++){
		if (board[i][j] == 'x') {
		    if (board[i + 1][j + 2] == 'o') {
			if (board[i - 1][j - 2] == ' '){ //IN DANGER
			    if (board[i+1][j-2] == ' '){
				escaped = true;
				board[i][j] = ' ';
				board[i+1][j-2] = 'x';
				return true;
			    }
			}
		
		    }
		    else if (board[i + 1][j - 2] == 'o'){
			if (board[i - 1][j + 2] == ' '){ //IN DANGER
			    if (board[i+1][j+2] == ' '){
				escaped = true;
				board[i][j] = ' ';
				board[i+1][j+2] = 'x';
				return true;
			    }
			}
		    }
		}
	    }
	}
	return false;
    }
    
    public boolean attack(){
	boolean attacked = false;
	for (int i=0;i<board.length;i++){
	    for (int j=0;j<board[0].length;j++){
		if (j == 1){
		    if (board[i][j] == 'x'){
			if (board[i+1][j+2] == 'o'){
			    if (board[i+2][j+4] == ' '){
				attacked = true;
				board[i][j] = ' ';
				board[i+1][j+2] = ' ';
				board[i+2][j+4] = 'x';
				return true;
			    }
			}
		    }
		}
		else if (j == 15){
		    if (board[i][j] == 'x'){
			if (board[i+1][j-2] == 'o'){
			    if (board[i+2][j-4] == ' '){
				attacked = true;
				board[i][j] = ' ';
				board[i+1][j-2] = ' ';
				board[i+2][j-4] = 'x';
				return true;
			    }
			}
		    }
		}
		else {
		    if (board[i][j] == 'x'){
			if (board[i+1][j+2] == 'o'){
			    if (board[i+2][j+4] == ' '){
				attacked = true;
				board[i][j] = ' ';
				board[i+1][j+2] = ' ';
				board[i+2][j+4] = 'x';
				return true;
			    }
			}
			else if (board[i+1][j-2] == 'o'){
			    if (board[i+2][j-4] == ' '){
				attacked = true;
				board[i][j] = ' ';
				board[i+1][j-2] = ' ';
				board[i+2][j-4] = 'x';
				return true;
			    }
			}
		    }
		}
	    }
	}
	return false;
    }

    public boolean moveEdge(){
	boolean moved = false;
	for (int i=0;i<board.length;i++){
	    if (board[i][3] == 'x'){
		if (board[i+1][1] == ' '){
		    moved = true;
		    board[i][3] = ' ';
		    board[i+1][1] = 'x';
		    return true;
		}
	    }
	    else if (board[i][13] == 'x'){
		if (board[i+1][15] == ' '){
		    moved = true;
		    board[i][13] = ' ';
		    board[i+1][15] = 'x';
		    return true;
		}
	    }
	}
	return false;
    }

    public void randomMove(){
	Random r = new Random();
	boolean moved = false;
	for (int i=0;i<board.length;i++){
	    for (int j=0;j<board[0].length;j++){
		if (board[i][j] == 'x'){
		    if (j == 1){
			if (board[i+1][j+2] == ' '){
			    if (r.nextInt(2) == 0){
				moved = true;
				board[i][j] = ' ';
				board[i+1][j+2] = 'x';
				return;
			    }
			}
		    }
		    else if (j == 15){
			if (board[i+1][j-2] == ' '){
			    if (r.nextInt(2) == 0){
				moved = true;
				board[i][j] = ' ';
				board[i+1][j-2] = 'x';
				return;
			    }
			}
		    }
		    else{
	        	if (board[i+1][j+2] == ' '){
			    if (r.nextInt(2) == 0){
				moved = true;
				board[i][j] = ' ';
				board[i+1][j+2] = 'x';
				return;
			    }
			}
			else if (board[i+1][j-2] == ' '){
			    if (r.nextInt(2) == 0){
				moved = true;
				board[i][j] = ' ';
				board[i+1][j-2] = 'x';
				return;
			    }
			}
		    }
		}
	    }
	}
	if (moved == false){
	    randomMove(); 
	}
    }
    
    public void computerMove(){
	boolean move = blockMove();
	if (move == false){
	    move = escape();
	    if (move == false){
		move = attack();
		if (move == false){
		    move = moveEdge();
		    if (move == false){
			randomMove();
		    }
		}
	    }
	}
	//checkBlockMove
 	//dangerCheck + Escape
	//Attack
	//moveEdge
	//randomMove
    }
    
    
    public void Gameover(){
	int counter = 0;
	for (int i=0;i<board.length;i++){
	    for (int j=0;j<board[0].length;j++){
		if (board[i][j]=='x'){
		    counter++;
		}
	    }
	}
	if (counter<1){
	    gameOver=true;
	}
    }
    
    public static void main(String[] args){
	board x = new board();
	System.out.println(x);
	while (x.gameOver == false){
	    x.choosePieceSpace();
	    x.chooseMoveSpace();
	    x.doMove();
	    x.Gameover();
	    System.out.println(x);
	    x.computerMove();
	    x.Gameover();
	    System.out.println(x);
	}
	// x.Computermove;
	//System.out.println(x);
	
	//}
	//if (gameOver = true){
	//System.out.println("Congratulations");}
	
    }
}
