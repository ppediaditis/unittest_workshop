package part3.step3;

/**
 * This class simply counts the number of visits. This is perhaps to trivial to have in
 * a separate class but at a later stage we might want to differentiate what we are counting.
 */
public class VisitCounter {

    private int visitCount = 0;

	public int getVisitCount() {
		return visitCount;
	}

	public void addVisit() {
		visitCount = visitCount + 1;
	}

    public void setVisitCount(int visitCount) {
        this.visitCount = visitCount;
    }
}
