package day6;

enum Difficulty { EASY, MEDIUM, HARD } 
class Game {
	private int bulletCount;
	private Difficulty difficulty;
	public Game(Difficulty difficulty) {
		this.difficulty = difficulty; setupGame();
		}
	private void setupGame() {
		switch (difficulty) { 
		case EASY:
			bulletCount = 3000; 
			break; 
			case MEDIUM:
				bulletCount = 2000;
				break;
case HARD: 
	bulletCount = 1000;
	break;
	}
		}
	public void printGameSetup() { 
		System.out.println("Difficulty: " + difficulty);
		System.out.println("Bullet count: " + bulletCount); 
		System.out.println("Enemy strength: " + getEnemyStrength());
		}
	private String getEnemyStrength() { 
		return switch (difficulty) {
		case EASY -> "Weak";
		case MEDIUM -> "Moderate"; 
		case HARD -> "Strong"; }; } }
public class gammeee { 
	public static void main(String[] args) { 
		Game easyGame = new Game(Difficulty.EASY); 
		Game mediumGame = new Game(Difficulty.MEDIUM);
		Game hardGame = new Game(Difficulty.HARD);
		System.out.println("=== Easy Game ==="); 
		easyGame.printGameSetup();
		System.out.println("\n=== Medium Game ==="); 
		mediumGame.printGameSetup(); 
		System.out.println("\n=== Hard Game ===");
		hardGame.printGameSetup(); } }