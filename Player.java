public class Player {

	// Instance variables
	private int health;
	private boolean isAlive;
	private int Class;
	private int die;
	private String name;

	// Constructor 
	public Player(int h, boolean isA, int c, int d, String n) {
		health = h;
		isAlive = isA;
		Class = c;
		die = d;
		name = n;
	}

	// Getter and setter methods for health
	public int getHealth() {
		return health;
	}

	public void setHealth(int h) {
		health = h;
	}
	
	// Getter and setter methods for isAlive
  public boolean getIsAlive() {
    return isAlive;
  }

  public void setIsAlive(boolean isA) {
    isAlive = isA;
  }

	// Roll dice method
	public int rollDie() {
		return (int) (Math.random() * die + 1);
	}
}