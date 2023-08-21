/* This program prompts the user to create their character and fight against a wolf in this RPG Dungeons and Dragons inspired game
@author Vincent Ton
@date October 27, 2022
*/

import java.util.Scanner;

class Main {

	// Output each character in the sentence method
	public static void printSentence(String sentence) throws InterruptedException {
		char character;

		for (int i = 0; i < sentence.length(); i++) {
			character = sentence.charAt(i);

			System.out.print(character);
			Thread.sleep(40);
		}

		Thread.sleep(1500);
	}
	
	// Main code
  public static void main(String[] args) throws InterruptedException {
		Scanner console = new Scanner(System.in);
		System.out.print("\033\143"); // clear console

		// ASCII (They look poorly formatted in code but the output is correct)
		String wolfMiss = """
	 						,    ,
                          |\\--/|
                         /  , ,|
                    __.-'|  / \\/
           __ ___.-'        ._0|
        .-'  '        :      _/
       / ,    .        .     |
      :  ;    :        :   _/
      |  |   .'     __:   /
      |  :   /'----'| \\   |
      \\  |  |      	|/| |
       | '| /       	| | |
       | /|.'       	'.\\ |_
  	 || ||             '-'
       '-''-'
		""";
		String wolfAttack = """
	 			,,/( ,,,,,,,,,,___,,
              )b     ,,,           "`,_,
             /(     /                   `,
            L/7_/\\,,|            /        \\
             ,`      `,  \\     ,|          \\
              ,      /  /``````||      |\\,  \\__,)))
                    /  / |      \\    \\  \\,,,,,,/
                   |  /  |       \\   )/
                    \\ (| )     ,,//  /
                    `_)_/     ((___/"'
		""";
		String wolfHit = """
	 			_     ___
            #_~`--'__ `===-,
            `.`.     `#.,//
            ,_\\_\\     ## #\\
            `__.__    `####\\          
                 ~~\\ ,###'~
                    \\##'
		""";

		String fighter = """
					   		 _,.
  	  				,` -.)
 						( _/-\\\\-._
						  /,|`--._,-^|           ,
					 	  \\_| |`-._/||         ,'|
							|  `-, / |        /  /
 				  	 	|     || |       /  /
							 `r-._||/   __  /  /   
						__,-<_     )`-/  `./  /  
						'  \\   `---'   \\  /  /    
						|  |           |./  /    
 					|  /           //  /    
						\\_/' \\        |/  /       
 					|    |   _,^-'/  /      
						|    , ``  (\\/  /_
						 \\,.->._    \\X-=/^
 					 (  /   `-._//^`  
 					  `Y-.____(__}
 					   |     {__)
   					     ()
		""";

		String sword = """
		         />_________________________________				
		[########[]_________________________________>				
        	 \\>				
		""";

		String ranger = """
		                                                |
                                                        \\.
                                                        /|.
                                                      /  `|.
                                                    /     |.
                                                  /       |.
                                                /         `|.
                                              /            |.
                                            /              |.
                                          /                |.
     __                                 /                  `|.
      -\\                              /                     |.
        \\\\                          /                       |.
          \\\\                      /                         |.
           \\|                   /                           |\\
    		\\#####\\           /                             ||
         ==###########>     /                               ||
          \\##==      \\    /                                 ||
     ______ =       =|__/___                                ||
 ,--' ,----`-,__ ___/'  --,-`-==============================##==========>
\\               '        ##_______ ______   ______,--,____,=##,__
 `,    __==    ___,-,__,--'#'  ==='      `-'              | ##,-/
   `-,____,---'       \\####\\              |        ____,--\\_##,/
       #_              |##   \\  _____,---==,__,---'         ##
        #              ]===--==\\                            ||
        #,             ]         \\                          ||
         #_            |           \\                        ||
          ##_       __/'             \\                      ||
           ####='     |                \\                    |/
            ###       |                  \\                  |.
            ##       _'                    \\                |.
           ###=======]                       \\              |.
          ///        |                         \\           ,|.
          //         |                           \\         |.
                                                   \\      ,|.
                                                     \\    |.
                                                       \\  |.
                                                         \\|.
                                                         /.
                                                        |
		""";

		String arrow = """
		>>>>>>>_____________________\\`-._
		>>>>>>>                     /.-'
		""";

		String die1 = """
			 .-------.  
      /       /|   
     /_______/ |  
     |       | | 
     |       | / 
     |       |/   
	    '-------'    
		""";

		String die2 = """
		   	   ______
        /\\     \\
       /  \\     \\
      /    \\_____\\
      \\    /     /
   	 \\  /     /
  	  \\/_____/
		""";

		String dieTop = """
		____________
		|           |
		|           |
		""";

		String dieBottom = """
		|           |
		|           |
		-------------
		""";

		String potion = """
		    _____
     `.___,'
      (___)
      <   >
       ) (
      /`-.\\
     /     \\
    / _    _\\
   :,' `-.' `:
   |         |
   :         ;
    \\       /
     `.___.' 
		""";
		
		// Variables
		boolean play = true;
		String playAgain;
		String name;
		int pHealth;
		int wHealth;
		int Class;
		int die;
		int pDamage;
		int wDamage;
		int action;
		int numPotions = 1;
		
		while (play) {
			printSentence("You will battle against a wolf in this Dungeons and Dragons style game.");
			System.out.print("\033\143");

			// User chooses the class for their character
			printSentence("First, you need to create your character.\n\nChoose your class:");
			System.out.println("\n1. Fighter - Does melee attacks; good damage and good health\n2. Ranger - Does long range attacks; high damage but lower health"); 

			Class = 0;
			while (Class < 1) {
			// Get valid integer input
				if (console.hasNextInt()) {
					Class = console.nextInt();
				}
				else {
					System.out.println("\nInvalid input! Try again!");
				}

				if (Class < 1 || Class > 2) {
					System.out.println("\nYou must choose one of the options!");
					Class = 0;
				}

				console.nextLine();
			}

			Thread.sleep(1000);
			printSentence("\nGood choice!");
			System.out.print("\033\143");

			// User names their character
			printSentence("Choose a name for your character: ");
			name = console.nextLine();

			Thread.sleep(1000);
			printSentence("\nHello " + name + "!");
			System.out.print("\033\143");
			
			// Fighter has 20 health and its hit dice is 1-D8
			if (Class == 1) {
				pHealth = 20;
				die = 8;
			}
			// Ranger has 15 health and its hit dice is 1-D12
			else {
				pHealth = 15;
				die = 12;
			}

			Player player = new Player(pHealth, true, 1, die, name);
			
			// Wolf has same stats as a fighter
			Player wolf = new Player(20, true, 1, 8, "wolf");
			wHealth = wolf.getHealth();

			while (player.getIsAlive() && wolf.getIsAlive()) {
				// Your turn
				printSentence("It is your turn to act: What will you do?");
				System.out.println("\n1. Use your main attack\n2. Drink your health potion (heals 5 hp)\n3. Yell at the wolf\n4. Run away");
				
				action = 0;
				while (action < 1) {
					// Get valid integer input
					if (console.hasNextInt()) {
						action = console.nextInt();
					}
					else {
						System.out.println("\nInvalid input! Try again!");
					}

					if (action < 1 || action > 4) {
						System.out.println("\nYou must choose one of the options!");
						action = 0;
					}
					else if (action == 2 && numPotions == 0) {
						System.out.println("\nYou have no more potions left to use! Do something else.");
						action = 0;
					}
	
					console.nextLine();
				}
				
				Thread.sleep(1000);
				System.out.print("\033\143");

				// Main attack
				if (action == 1) {
					// Roll the die
					printSentence("Let's roll the die to see " + name + "'s attack.\n");
					die = player.rollDie();
						
					System.out.println(die1);
					Thread.sleep(1500);
					System.out.print("\033\143");

					System.out.println(die2);
					Thread.sleep(1500);
					System.out.print("\033\143");
					
					System.out.println(dieTop + "|     " + die + "     |\n" + dieBottom);
					Thread.sleep(2000);
					printSentence("You rolled a " + die + "!");
					System.out.print("\033\143");

					// Player's damage is their roll divided by 2
					pDamage = die / 2;

					// Output character attack
					if (Class == 1) {
						System.out.println(fighter);
						Thread.sleep(2000);
						System.out.print("\033\143");

						System.out.println("\n\n\n\n" + sword);
						Thread.sleep(2000);
						System.out.print("\033\143");
					}
					else {
						System.out.println(ranger);
						Thread.sleep(2000);
						System.out.print("\033\143");

						System.out.println("\n\n\n\n" + arrow);
						Thread.sleep(2000);
						System.out.print("\033\143");
					}

					// A roll of 4 or greater is a hit, 3 or less is a miss
					if (pDamage > 1) {
						wolf.setHealth(wHealth - pDamage);
						wHealth = wolf.getHealth();
						System.out.println("\n\n\n" + wolfHit);
						Thread.sleep(2000);

						if (wHealth > 0) {
							printSentence("You hit the wolf for " + pDamage + " damage!\nThe wolf has " + wHealth + " health left.");
						}
						else {
							printSentence("You hit the wolf for " + pDamage + " damage!\nYou have killed the wolf!");
							wolf.setIsAlive(false);
						}
					}
					else {
						System.out.println(wolfMiss);
						Thread.sleep(2000);
						printSentence("Your roll was too low and your attack missed the wolf! The wolf has " + wHealth + " health left.");
					}
				}
				// Use health potion
				else if (action == 2) {
					numPotions--;
					System.out.println(potion);
					Thread.sleep(1500);

					// Fighter
					if (Class == 1) {
						// Shame the user if they drink the health potion on full health
						if (pHealth == 20) {
							printSentence("You drank the health potion when you were already full health! You just wasted your only health potion!");
						} 
						else {
							if (pHealth <= 15) {
								player.setHealth(pHealth + 5);
							}
							// Ensure player doesn't heal over full health
							else {
								player.setHealth(pHealth + (20 - pHealth));		
							}

							pHealth = player.getHealth();
							printSentence("You healed to " + pHealth + " health! You have no more health potions.");
						}
					}
					// Ranger
					else {
						// Shame the user if they drink the health potion on full health
						if (pHealth == 15) {
							printSentence("You drank the health potion when you were already full health! You just wasted your only health potion!");
						}
						else {
							if (pHealth <= 10) {
								player.setHealth(pHealth + 5);
							}
							// Ensure player doesn't heal over full health
							else {
								player.setHealth(pHealth + (15 - pHealth));		
							}

							pHealth = player.getHealth();
							printSentence("You healed to " + pHealth + " health! You have no more health potions.");
						}
					}
				}
				// Yell at the wolf
				else if (action == 3) {
					System.out.println(wolfMiss);
					Thread.sleep(1500);
					printSentence("The wolf was unfazed by your yelling. What did you expect?");
				}
				// Running away
				else {
					printSentence("You ran away from the wolf. Guess the wolf was too scary for you.");
					System.out.print("\033\143");
					break;
				}

				System.out.print("\033\143");
				
				// If the wolf dies, it cannot attack
				if (!wolf.getIsAlive()) {
					break;
				}

				// Wolf's turn
				printSentence("It's the wolf's turn. It goes in for an attack.");
				System.out.print("\033\143");

				// Roll the die
				printSentence("Let's roll the die to see the wolf's attack.\n");
				die = wolf.rollDie();
						
				System.out.println(die1);
				Thread.sleep(1500);
				System.out.print("\033\143");

				System.out.println(die2);
				Thread.sleep(1500);
				System.out.print("\033\143");
				
				System.out.println(dieTop + "|     " + die + "     |\n" + dieBottom);
				Thread.sleep(2000);
				printSentence("The wolf rolled a " + die + "!");
				System.out.print("\033\143");

				// Wolf's damage is their roll divided by 2
				wDamage = die / 2;

				// A roll of 4 or greater is a hit, 3 or less is a miss
				if (wDamage > 1) {
					player.setHealth(pHealth - wDamage);
					pHealth = player.getHealth();
					System.out.println(wolfAttack);
					Thread.sleep(2000);

					if (pHealth > 0) {
						printSentence("The wolf hit you for " + wDamage + " damage!\nYou have " + pHealth + " health left.");
					}
					else {
						printSentence("The wolf hit you for " + wDamage + " damage!\nYou have been killed by the wolf!");
						player.setIsAlive(false);
					}
				}
				else {
					System.out.println(wolfMiss);
					Thread.sleep(2000);
					printSentence("The wolf's roll was too low and it missed its attack! You have " + pHealth + " health left.");
				}

				System.out.print("\033\143");
			}

			// Ask user if they want to play again
			printSentence("Do you want to play again? (yes/no)\n");
			playAgain = console.nextLine();

			if (playAgain.equalsIgnoreCase("yes")) {
				Thread.sleep(1500);
				System.out.print("\033\143");
			}
			else if (playAgain.equalsIgnoreCase("no")) {
				printSentence("\nGoodbye!");
				play = false;
			}
			else {
				printSentence("\nYou did not enter a valid answer. Exitting the program...");
				play = false;
			}
		}

		console.close();
  }
}