/**
 * GUI used for displaying, setting and calculating system properties
 * @author Monika Bronska
 * @version 7 June 2020
 * 
 */

package system;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button; 
import javafx.scene.control.Label; 
import javafx.scene.control.TextArea; 
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.VBox; 
import javafx.scene.paint.Color; 
import javafx.scene.text.Font;
import javafx.stage.Stage;


public class SystemTestGUI extends Application {
	
	//create new System object
	public System sys = new System("apple", "macbook", 100);

	@Override
	public void start(Stage stage) {
		
		
		//label with the title
		Label title = new Label("System Information"); 
		title.setTextFill(Color.BLUEVIOLET); 
		title.setFont(Font.font("Arial", 20));
		
		//text area will display text after different buttons are pressed
		TextArea output = new TextArea();
		output.setEditable(false);
		output.setMaxWidth(300);
		output.setMaxHeight(100);
		
		
		// create and configure a button to display details
		Button choiceOne = new Button(); 
		choiceOne.setText("Print System Details");
		choiceOne.setOnAction( e -> 
		{
			String s = sys.displayDetails();
			output.setText(s);
		}
		);
		
		//button for displaySystemProperties() method
		Button choiceTwo = new Button(); 
		choiceTwo.setText("Display System Properties");
		choiceTwo.setOnAction( e -> 
		{
			String t = sys.displaySystemProperties();
			output.setText(t);
		}	
		);
		
		//button for diagnoseSystem() method
		Button choiceThree = new Button(); 
		choiceThree.setText("Diagnose System");
		choiceThree.setOnAction( e -> 
		{
			String r = sys.diagnoseSystem();
			output.setText(r);
		}
		);
		
		//button option for setting memory and disk size by the user
		Button choiceFour = new Button(); 
		choiceFour.setText("Set Details");
		choiceFour.setOnAction(new EventHandler<ActionEvent>() {
			 
			//opening a pop up window with additional options
            @Override
            public void handle(ActionEvent event) {
 
            	//field will accept user input for memory size     		
        		TextField memoryField = new TextField();
        		memoryField.setMaxWidth(250);
        		
        		//label will display confirmation after the memory size has been set
        		Label memoryLabel = new Label();
        		memoryLabel.setTextFill(Color.YELLOW);
        		memoryLabel.setFont(Font.font("Arial", 16));
        		
        		//button to get and set the memory from user input
        		Button memoryButton = new Button();
        		memoryButton.setText("Please enter the size of memory above and press me");
        		memoryButton.setOnAction(e -> 
        		{
        		//convert input from text field to int type
        		int newMemory = Integer.parseInt(memoryField.getText());
        		
        			//statement validating if number entered by the user is greater than 0
        			if (newMemory > 0) {
        				sys.setMemory(newMemory);
        				memoryLabel.setText(memoryField.getText() + " set as memory size.");
        		}
        			else
        	    {
        				//alert window for value outside of range
        				Alert warning = new Alert(AlertType.ERROR);
        				warning.setContentText("Input value not valid!");
        				warning.showAndWait();
        	    }
        		}
        		);
        		
        		//field will accept user input for disk size
        		TextField diskField = new TextField();
        		diskField.setMaxWidth(250);
        		
        		//label will display confirmation after the disk size has been set
        		Label diskLabel = new Label();
        		diskLabel.setTextFill(Color.YELLOW);
        		diskLabel.setFont(Font.font("Arial", 16));
        		
        		//button to get and set disk size
        		Button diskButton = new Button();
        		diskButton.setText("Please enter the size of hard disk above and press me");
        		diskButton.setOnAction(e -> 
        		{
        	        //convert input to double type
        			double newDisk = Double.parseDouble(diskField.getText());
        	    
        			//statement validating if the number entered is not a negative number
        			if (newDisk > 0) {
        	    	
        	    	sys.setHardDisk(newDisk);
            	    diskLabel.setText(diskField.getText() + " set as hard disk size.");
        	    	
        	    } 
        	    else
        	    {
        	    	//warning alert
        	    	Alert warning = new Alert(AlertType.ERROR);
        	    	warning.setContentText("Input value not valid!");
        	    	warning.showAndWait();
        	    	
        	    }
        	    }
        	    );
 
                
                //vertical container to hold all elements of the second window
                VBox rootTwo = new VBox(25);
                rootTwo.setAlignment(Pos.CENTER); 
        		rootTwo.setBackground(new Background(new BackgroundFill(Color.FORESTGREEN, null, null)));
                rootTwo.getChildren().addAll(memoryField, memoryButton, memoryLabel, diskField, diskButton, diskLabel);
 
                Scene secondScene = new Scene(rootTwo, 600, 350);
 
                // New window (Stage)
                Stage popUp = new Stage();
                popUp.setTitle("Set Details");
                popUp.setScene(secondScene);
 
                // Set position of second window, related to primary window
                popUp.setX(stage.getX() + 200);
                popUp.setY(stage.getY() + 100);
 
                popUp.show();
            }
        });
 
			
		
		//create button to quit the program
		Button choiceFive = new Button(); 
		choiceFive.setText("Quit the program");
		choiceFive.setOnAction( e -> 
		{
			//display alert window before closing the program 
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setContentText("Thank you for using our program!");		
			alert.showAndWait();
			stage.close();
		}
		);
		
		// create and configure a vertical container to hold all the components
		VBox root = new VBox(25);
		root.setAlignment(Pos.CENTER); 
		root.setBackground(new Background(new BackgroundFill(Color.TRANSPARENT, null, null)));
		root.getChildren().addAll(title, output, choiceOne, choiceTwo, choiceThree, choiceFour, choiceFive);
		
		
		 
		// create a new scene and add it to the stage
		Scene scene = new Scene(root, 350, 500, Color.CORNFLOWERBLUE); 
		stage.setTitle("My GUI"); 
		stage.setScene(scene); 
		stage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}//end of class
