/**
 * Class used for setting and calculating system properties
 * @author Monika Bronska
 * @version 7 June 2020
 * 
 */
package system;


import java.util.Scanner;

public class System {
	
	//class attributes
	private String make;
	private String model;
	private int speed;
	private int memorySize; //in MB
	private double hardDiskSize; //in GB
	private double purchaseCost;
	

	//constructor for custom System class with 3 parameters
	public System (String makeIn, String modelIn, int speedIn) {
		make = makeIn;
		model = modelIn;
		speed = speedIn;
		
	}
	
	//setter for memory size
	public void setMemory (int memoryIn) {
		
		memorySize = memoryIn;
	}
	
	//setter for the size of hard disk
	public void setHardDisk (double hardDiskIn) {
		
		hardDiskSize = hardDiskIn;
	}
	
	//getter for cost 
	public void setPurchaseCost (double purchaseCostIn) {
		
		purchaseCost = purchaseCostIn;
	}
	
	//getter for make
	public String getMake() {
		
		return make;
	}
	
	//getter for model
	public String getModel() {
		
		return model;
	}
	
	//getter for processor speed
	public int getProcessorSpeed() {
		
		return speed;
	}
	
	//displays all the details of the system as a String
	public String displayDetails() {
		
		return make + "\n" + model + "\n" + speed + "\n" + memorySize + "\n" + hardDiskSize + "\n" + purchaseCost;
	}
	
	
	// check if the hard disk size is below 2 (GB). If so, it should return “low”, otherwise “OK”
	public String checkHDStatus() {
		
		
		
		if (hardDiskSize < 2.0) {
			return "low";
		}
		
			return "OK";
			
		}
	
	//checks if the ram memory size is below 128 (MB). If so it should return false, otherwise true
	public boolean goodMemorySize() {
		
		if (memorySize < 128.0) {
			return false;
	}   
			else 
			return true;
		
	}
	
	//This method uses checkHDStatus() and goodMemorySize() methods to return a String displaying appropriate message
	public String diagnoseSystem() {
		
		return "Hard disk size = " + this.checkHDStatus() + "\nMemory size OK = " + this.goodMemorySize();
	}//end of class
	
	//method to display system properties
	public String displaySystemProperties() {
		
		//statements for returning properties of OS on which the method is run
		String arch = java.lang.System.getProperty("os.arch");
		String name = java.lang.System.getProperty("os.name");
		String osVer = java.lang.System.getProperty("os.version");
		String user = java.lang.System.getProperty("user.name");
		String javaVer = java.lang.System.getProperty("java.version");
	
		//displays system properties
		String props = "System properties: \nOS Architecture: " + arch + "\nOS Name: " + name + "\nOS Version: " + osVer + "\nUser Account Name: " + user + "Java Version: " + javaVer;
		
			//statement which generates appropriate message depending on the OS
			if (name == "Windows 10") {
				
				return props + "\n\nHi! \nI am positive :-)";
		}
			else if (name == "Linux") {
			
				return props + "\n\nHi! \nI am negative :-(";
		}
			else 
				return props + "\n\nHi! \nI am neutral :-|";
		
	
	}//end of class
	
	//method which presents the user with textual menu for displaying and setting system properties
	public void choiceMenu() {
		
		//initializing choice and printing menu options and instructions	
		int choice = 0;
		java.lang.System.out.println("*** U S E R  M E N U ***");
		java.lang.System.out.println("\n1 – Print System Details");
		java.lang.System.out.println("2 - Display System Properties");
		java.lang.System.out.println("3 – Diagnose System");
		java.lang.System.out.println("4 – Set Details");
		java.lang.System.out.println("5 – Quit the program");
		java.lang.System.out.println();
		java.lang.System.out.println("Please enter a number between 1 and 5 and press Enter:");
		
		//while loop so the menu is repeated until the user quits
		while (choice != 5) {
		Scanner sc = new Scanner(java.lang.System.in);
		choice = sc.nextInt();
		
			
			//switch statement with 5 options
				switch (choice) {
				
				case 1:
					java.lang.System.out.println("System details are as follows:");
					java.lang.System.out.println();
					java.lang.System.out.println(displayDetails());
					break;
				case 2:
					java.lang.System.out.println("Operating System properties:");
					java.lang.System.out.println();
					java.lang.System.out.println(displaySystemProperties());
					break;
				case 3:
					java.lang.System.out.println("System diagnosis has been run:");
					java.lang.System.out.println();
					java.lang.System.out.println(diagnoseSystem());
					break;
				case 4:
					java.lang.System.out.println("Please enter value for memory size:");
					int memory = sc.nextInt();
					setMemory(memory);
					java.lang.System.out.println("Set! Now, please enter value for hard disk size:");
					double disk = sc.nextDouble();
					setHardDisk(disk);
					java.lang.System.out.println("Thank you! Your changes have been saved!");	
					break;
				case 5:
					java.lang.System.out.print("Cheers and bye!");
	                break;
	            default:
	            	java.lang.System.out.println("Please enter number between 1 and 5 and press Enter:");
	            						
				}
			}
	}//end of choiceMenu method

}//end of System class
