package part3.step4;

import java.util.HashMap;
import java.util.Map;

/**
 * This class simply counts the number of visits by user Agent.
 */
public class VisitCounter {

    private Map<String, Integer> visitCount = new HashMap<>();

	public int getVisitCount(String userAgent) {
        if(!visitCount.containsKey(userAgent))
            return 0;
		return visitCount.get(userAgent);
	}

	public void addVisit(String userAgent) {
        int count = 0;
        if(visitCount.containsKey(userAgent))
            count = visitCount.get(userAgent);
		visitCount.put(userAgent, count + 1);
	}

    public void setVisitCount(int visitCount,String userAgent) {
        this.visitCount.put(userAgent, visitCount);
    }
}
