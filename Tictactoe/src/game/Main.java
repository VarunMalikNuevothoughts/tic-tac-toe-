package game;

import java.util.Scanner;

public class Main {
	public static boolean playerturn =true;
	public static boolean playerwon =false;
	public static boolean computerwon =false;
	
	public static boolean playing =true;
	public static boolean playagain =false;
	public static Scanner scan = new Scanner(System.in);
	
	public static tictactoe board=new tictactoe();	
	
	public static void main(String[] args) {
		if(board.isVisible() == false){
			board.setVisible(true);
		}
	}

	public static void checkforwin(){
		if(board.button1.getText().equals("X")){
			if(board.button4.getText().equals("X")){
				if(board.button7.getText().equals("X")){
					playerwon=true;
					computerwon=false;
					System.out.println("Player won!");
				}
			}
		}
		if(board.button1.getText().equals("X")){
			if(board.button5.getText().equals("X")){
				if(board.button9.getText().equals("X")){
					playerwon=true;
					computerwon=false;
					System.out.println("Player won!");
				}
			}
		}
		if(board.button1.getText().equals("X")){
			if(board.button2.getText().equals("X")){
				if(board.button3.getText().equals("X")){
					playerwon=true;
					computerwon=false;
					System.out.println("Player won!");
				}
			}
		}
		if(board.button3.getText().equals("X")){
			if(board.button5.getText().equals("X")){
				if(board.button7.getText().equals("X")){
					playerwon=true;
					computerwon=false;
					System.out.println("Player won!");
				}
			}
		}
		if(board.button3.getText().equals("X")){
			if(board.button6.getText().equals("X")){
				if(board.button9.getText().equals("X")){
					playerwon=true;
					computerwon=false;
					System.out.println("Player won!");
				}
			}
		}
		if(board.button7.getText().equals("X")){
			if(board.button8.getText().equals("X")){
				if(board.button9.getText().equals("X")){
					playerwon=true;
					computerwon=false;
					System.out.println("Player won!");
				}
			}
		}
		if(board.button4.getText().equals("X")){
			if(board.button5.getText().equals("X")){
				if(board.button6.getText().equals("X")){
					playerwon=true;
					computerwon=false;
					System.out.println("Player won!");
				}
			}
		}
		if(board.button2.getText().equals("X")){
			if(board.button5.getText().equals("X")){
				if(board.button8.getText().equals("X")){
					playerwon=true;
					computerwon=false;
					System.out.println("Player won!");
				}
			}
		}
		if(board.button1.getText().equals("O")){
			if(board.button4.getText().equals("O")){
				if(board.button7.getText().equals("O")){
					playerwon=false;
					computerwon=true;
					System.out.println("Player2 won");
				}
			}
		}
		if(board.button1.getText().equals("O")){
			if(board.button5.getText().equals("O")){
				if(board.button9.getText().equals("O")){
					playerwon=false;
					computerwon=true;
					System.out.println("Player2 won");
				}
			}
		}
		if(board.button1.getText().equals("O")){
			if(board.button2.getText().equals("O")){
				if(board.button3.getText().equals("O")){
					playerwon=false;
					computerwon=true;
					System.out.println("Player2 won");
				}
			}
		}
		if(board.button3.getText().equals("O")){
			if(board.button5.getText().equals("O")){
				if(board.button7.getText().equals("O")){
					playerwon=false;
					computerwon=true;
					System.out.println("Player2 won");
				}
			}
		}
		if(board.button3.getText().equals("O")){
			if(board.button6.getText().equals("O")){
				if(board.button9.getText().equals("O")){
					playerwon=false;
					computerwon=true;
					System.out.println("Player2 won");
				}
			}
		}
		if(board.button7.getText().equals("O")){
			if(board.button8.getText().equals("O")){
				if(board.button9.getText().equals("O")){
					playerwon=false;
					computerwon=true;
					System.out.println("Player2 won");
				}
			}
		}
		if(board.button4.getText().equals("O")){
			if(board.button5.getText().equals("O")){
				if(board.button6.getText().equals("O")){
					playerwon=false;
					computerwon=true;
					System.out.println("Player2 won");
				}
			}
		}
		if(board.button2.getText().equals("O")){
			if(board.button5.getText().equals("O")){
				if(board.button8.getText().equals("O")){
					playerwon=false;
					computerwon=true;
					System.out.println("Player2 won");
				}
			}
		}
		if(playerwon == true ||computerwon == true){
			
			System.out.println("Would you like to play again true or false");
			playagain = scan.nextBoolean();
			if(playagain == true) {
				board.setVisible(false);
				board.button1.setText("");
				board.button2.setText("");
				board.button3.setText("");
				board.button4.setText("");
				board.button5.setText("");
				board.button6.setText("");
				board.button7.setText("");
				board.button8.setText("");
				board.button9.setText("");
				
				playerturn = true;
				playerwon = false;
				computerwon = false;
				board.setVisible(true);
			} else {
				System.out.println("Thanks for playing");
			}
		}
	}
	
}
