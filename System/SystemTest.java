/**
 * Class used for testing System class
 * @author Monika Bronska
 * @version 7 June 2020
 * 
 */

package system;


public class SystemTest {

	public static void main(String[] args) {
		
		
		System theSystem = new System("Apple", "MacBook Pro", 999);
				
		theSystem.setMemory(127);
		//theSystem.setMemory(160);
		
		theSystem.setHardDisk(1.5);
		//theSystem.setHardDisk(3);
		
		theSystem.setPurchaseCost(1119.99);
		
		java.lang.System.out.println(theSystem.getMake());
		java.lang.System.out.println(theSystem.getModel());
		java.lang.System.out.println(theSystem.getProcessorSpeed());
		java.lang.System.out.println();
		
		java.lang.System.out.println(theSystem.displayDetails());
		java.lang.System.out.println();
		
		java.lang.System.out.println(theSystem.checkHDStatus());
		java.lang.System.out.println();
		
		java.lang.System.out.println(theSystem.goodMemorySize());
		java.lang.System.out.println();
		
		java.lang.System.out.println(theSystem.diagnoseSystem());
		
		
		java.lang.System.out.println(theSystem.displaySystemProperties());
		
		
		theSystem.choiceMenu();

	}

}
