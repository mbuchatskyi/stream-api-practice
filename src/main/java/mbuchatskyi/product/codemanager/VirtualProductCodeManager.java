package mbuchatskyi.product.codemanager;

import java.util.HashSet;
import java.util.Set;

public class VirtualProductCodeManager {
	public static VirtualProductCodeManager instance;
	
	private final Set<String> usedCodes = new HashSet<>();
	
	private VirtualProductCodeManager() {
	}
	
	public static VirtualProductCodeManager getInstance() {
		if (instance == null) {
			instance = new VirtualProductCodeManager();
		}
		
		return instance;
	}
	
	public void useCode(String code) {
		//Before adding to the set the strings already exist in a heap. 
		// So all we need is an array big enough to hold the references.
		usedCodes.add(code);
	}
	
	public boolean isCodeUsed(String code) {
		return usedCodes.contains(code);
	}
}
