
public class Connect4Grid2DArray implements Connect4Grid{
	public static final int NUMBER_OF_ROWS = 6;
	public static final int NUMBER_OF_COLUMNS = 7;
	char[][] board = new char[NUMBER_OF_ROWS][NUMBER_OF_COLUMNS];
	public static final char EMPTY =' ';
	@Override
	public void emptyGrid() {
		for (int row = 0; (row < board.length); row++)
		{
			for (int column = 0; (column < board[row].length); column++)
			{
				board[row][column] = EMPTY;	
			}
		}
	}
	@Override
	public String toString() { 
		String gameBoard =" ——— ——— ——— ——— ——— ——— ——— "+ "\n" ;
		for (int row = 0; (row < board.length); row++)
		{	
			gameBoard += "|";
			for (int column = 0; (column < board[row].length); column++)
			{
				gameBoard += " "+ board[row][column] + " |" ;
			}
			gameBoard += "\n" + " ——— ——— ——— ——— ——— ——— ——— "  +"\n";

		}		
		return gameBoard;
	}

	@Override
	public boolean isValidColumn(int column) { 
		if (column<7 && column>=0)
		{
			return true ;
		}
		return false;
	}

	@Override
	public boolean isColumnFull(int column) {
		if(board[0][column] == EMPTY)
		{
			return false;
		}		
		return true;
	}

	@Override
	public void dropPiece(ConnectPlayer player, int column) {  
		char pieceValue = player.getcounterType();
		int piecesDropped =0;
		for (int row = 5; (row >= 0); row--) 
		{
			if (piecesDropped< 1)
			{
				if (board[row][column]==EMPTY)
				{
					board[row][column]= pieceValue;
					piecesDropped++;
				}
			}
		}
	}

	@Override
	public boolean didLastPieceConnect4() { 

		for (int row = 0; (row < board.length); row++)
		{
			for (int column = 0; (column < board[row].length-3); column++)
			{
				if ((board[row][column]==board[row][column+1] )&& (board[row][column+2] ==board[row][column+3]) && (board[row][column]==board[row][column+3]))
				{		
					if (board[row][column]!=EMPTY)
					{
						return true;
					}			
				}
			}
		}

		for (int column = 0; (column < board[0].length); column++)
		{
			for (int row = 0; (row < board.length-3); row++)
			{
				if ((board[row][column]==board[row+1][column] )&& (board[row+2][column] ==board[row+3][column]) && (board[row][column]==board[row+3][column]))
				{
					if (board[row][column]!=EMPTY)
					{
						return true;
					}
				}
			}
		}


		for (int row = 3; (row < board.length); row++)
		{
			for (int column = 0; (column < board[0].length-3); column++)
			{
				if ((board[row][column]==board[row-1][column+1] )&& (board[row-2][column+2] ==board[row-3][column+3]) && (board[row][column]==board[row-3][column+3]))
				{
					if (board[row][column]!=EMPTY)
					{
						return true;
					}
				}
			}
		}

		for (int row = 0; (row < board.length-3); row++)
		{
			for (int column = 0; (column < board.length-3); column++)
			{
				if ((board[row][column]==board[row+1][column+1] )&& (board[row+2][column+2] ==board[row+3][column+3]) && (board[row][column]==board[row+3][column+3]))
				{
					if (board[row][column]!=EMPTY)
					{
						return true;
					}
				}
			}
		}
		return false;
	}

	@Override
	public boolean isGridFull() {
		for (int row = 0; (row < board.length); row++)
		{
			for (int column = 0; (column < board[row].length); column++)
			{
				if(board[row][column] == EMPTY)
					return false ;
			}
		}	
		return true;
	}	
}
