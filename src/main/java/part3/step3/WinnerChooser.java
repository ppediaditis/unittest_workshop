package part3.step3;

/**
 * This class will determine if a hit count constitutes a win or not
 * based on a frequency parameter passed at the constructor.
 */
public class WinnerChooser {

	private int winnerFrequency;

	public WinnerChooser(int frequency){
		winnerFrequency = frequency;
	}

	public boolean isWinner(int hitCount) {
		return (hitCount % winnerFrequency == 0);
	}

}
