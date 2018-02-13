package chopper;

import java.util.List;

public class IterativeChop implements IKarateChop {

	public int chop(int target, List<Integer> intsArray) {		
		int startPos = 0;
		int endPos = intsArray.size() - 1;	
		
		while (startPos <= endPos) {
			int midPos = (startPos + endPos) / 2;
			if (intsArray.get(midPos) == target) {
				return midPos;
			}
			
			if (target > intsArray.get(midPos)) {
				startPos = midPos + 1;
			} else {
				endPos = midPos - 1;
			}
		}
		
		return -1;
	}
}
