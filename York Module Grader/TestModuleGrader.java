/**
 * Class to test ModuleGrader class
 * @author (name goes here)
 * @version 15 May 2020
 * 
 */

public class TestModuleGrader {

	public static void main(String[] args) {
		
		//creating ModuleGrader object
		ModuleGrader grader = new ModuleGrader();
		
		//testing with the 1st method
		grader.gradeModule(9);
		grader.gradeModule(52);
		grader.gradeModule(64);
		grader.gradeModule(70);
		grader.gradeModule(100);
		grader.gradeModule(101);
		
		//testing with the 2nd method
		grader.getValidModuleMark();
		grader.getValidModuleMark();
		
		//testing with the 3rd method
		grader.startModuleGrading();
		
		

	}//end of main

}//end of class
