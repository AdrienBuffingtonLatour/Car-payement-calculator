//The graphical user interface//
//Extract the data from textfields and send it to Calculator class//

package package1;
import java.util.Arrays;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class javafx extends Application{ 
	// Override the start method in the Application class//
	@Override
	public void start(Stage primaryStage) {
	
			// Create a pane and set its properties//
			GridPane grid = new GridPane();
	
			Scene scene = new Scene(grid, 700, 800);
			grid.setVgap(10);
			grid.setHgap(50);
			grid.setPadding(new Insets(20, 20, 20, 20));
			grid.setStyle("-fx-border-color: white; -fx-background-color: white;");
	
		   // DropDown Menu//
		   Label credit_score= new Label("What's your credit score ?");
		   credit_score.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
		   
		   String[] credit= {"Super Prime(781-850)", "Prime(661-780)", "NonPrime(601-660)", "SubPrime(501-600)", "Deep SubPrime(300-500)"};
		   
		   String[] credit_description = new String[5];
		   credit_description[0] = "Based on your score, the average rate is 3.47% (new) or 4.19% (used).";
		   credit_description[1] = "Based on your score, the average rate is 4.45% (new) or 5.94% (used).";
		   credit_description[2] = "Based on your score, the average rate is 7.55% (new) or 10.63% (used).";
		   credit_description[3] = "Based on your score, the average rate is 12.14% (new) or 16.72% (used).";
		   credit_description[4] = "Based on your score, the average rate is 14.93% (new) or 19.51% (used). Consider buying an inexpensive used car and refinancing in 6-12 months.";
		   
		   ComboBox<String> combobox = new ComboBox<String>(); 
		   combobox.setValue(credit[0]);
		   combobox.getItems().addAll(Arrays.asList(credit));
		   
		   Text description = new Text();
		   description.setWrappingWidth(300);
		   description.setText(credit_description[0]);
		   
		   //Event Handler for Combobox//
		   combobox.setOnAction(e ->
		   {
			   	if(combobox.getValue().equals(credit[0])) {
			   		description.setText(credit_description[0]);
			   	}
			   	else
			   		if(combobox.getValue().equals(credit[1])) {
			   		description.setText(credit_description[1]);
			   	}
			   	else
			   		if(combobox.getValue().equals(credit[2])) {
			   		description.setText(credit_description[2]);
			   	}
			   	else
			   		if(combobox.getValue().equals(credit[3])) {
			   		description.setText(credit_description[3]);
			   	}
			   	else
			   		description.setText(credit_description[4]);
			   		
		   });
		   
		   /// Labels, TextFields, Buttons, ComboBox Left Side//
		   Label price = new Label("Car price ($)");
		   price.setPrefWidth(300);	//set width for the other boxes as well//
		   price.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
		   
		   TextField car_price = new TextField();
		   
		   Label comment1 = new Label("After negotiations");
		   comment1.setFont(Font.font("Calibri", FontWeight.NORMAL, 14));
		   comment1.setTextFill(Color.GREY);
		   
		   Label payement = new Label("Trade-in / down payment ($)");
		   payement.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
		   TextField down_payement = new TextField();
		   
		   Label comment2 = new Label("Your trade-in can be all or part of a down payment");
		   comment2.setFont(Font.font("Calibri", FontWeight.NORMAL, 14));
		   comment2.setTextFill(Color.GREY);
		   
		   Label interest = new Label("Interest rate (%)");
		   interest.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
		   TextField int_rate = new TextField();
		   
		   Label comment3 = new Label("A higher credit score means lower interest rates");
		   comment3.setFont(Font.font("Calibri", FontWeight.NORMAL, 14));
		   comment3.setTextFill(Color.GREY);
		   
		   Label NumOfMonths = new Label("Number of months");
		   NumOfMonths.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
		   TextField num_months = new TextField();
		   
		   Label comment4 = new Label("Suggested max: 36 months for used cars, 60 for new");
		   comment4.setFont(Font.font("Calibri", FontWeight.NORMAL, 14));
		   comment4.setTextFill(Color.GREY);
		   
		   GridPane.setValignment(NumOfMonths, VPos.BOTTOM);
	
		   //Labels, TextFields, Buttons Right Side//
		   Label payementdetail = new Label("Payement Details:");
		   payementdetail.setFont(Font.font("Calibri", FontWeight.BOLD, 22));
		   
		   Label monthly = new Label("Monthly payement");
		   monthly.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
		   
		   Text monthly_payement = new Text();
		   monthly_payement.setFont(Font.font("Calibri", FontWeight.BOLD, 25));
		   monthly_payement.setFill(Color.BLUE);
		   
		   Label comment5 = new Label("(Before taxes & fees)");
		   comment5.setFont(Font.font("Calibri", FontWeight.NORMAL, 14));
		   comment5.setTextFill(Color.GREY);
		   
		   Label total = new Label("Total amount paid");
		   total.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
		   
		   Text total_amt = new Text();
		   total_amt.setFont(Font.font("Calibri", FontWeight.BOLD, 25));
		   total_amt.setFill(Color.BLUE);
		   
		   Label comment6 = new Label("(Over the life of the loan)");
		   comment6.setFont(Font.font("Calibri", FontWeight.NORMAL, 14));
		   comment6.setTextFill(Color.GREY);
		   
		   Label totalinterest = new Label("Total interest paid");
		   totalinterest.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
		   
		   Text total_int = new Text();
		   total_int.setFont(Font.font("Calibri", FontWeight.BOLD, 25));
		   total_int.setFill(Color.BLUE);
		   
		   Label lastPayement = new Label("Last Monthly Payement");
		   lastPayement.setFont(Font.font("Calibri", FontWeight.BOLD, 18));
		   
		   Label comment7 = new Label("(This will be your last payement)");
		   comment7.setFont(Font.font("Calibri", FontWeight.NORMAL, 14));
		   comment7.setTextFill(Color.GREY);
		   
		   Text last = new Text();
		   last.setFont(Font.font("Calibri", FontWeight.BOLD, 25));
		   last.setFill(Color.BLUE);
		   
		   Button button = new Button("Go!");
		  
		   // Adding everything//
		   
		   // To the left//
		   grid.add(credit_score,0 ,1);
		   grid.add(combobox, 0, 2);
		   grid.add(description, 0, 3);
		   grid.add(price, 0, 4);
		   grid.add(car_price, 0, 5);
		   grid.add(comment1, 0, 6);
		   grid.add(payement, 0, 7);
		   grid.add(down_payement, 0, 8);
		   grid.add(comment2, 0, 9);
		   grid.add(interest, 0, 10);
		   grid.add(int_rate, 0, 11);
		   grid.add(comment3, 0, 13);
		   grid.add(NumOfMonths, 0, 14);
		   grid.add(num_months, 0, 15);
		   grid.add(comment4, 0, 16);
 
		   // To the right//
		   grid.add(payementdetail, 1, 0);
		   grid.add(monthly, 1, 1);
		   grid.add(monthly_payement, 1, 2);
		   grid.add(comment5, 1, 3);
		   grid.add(lastPayement, 1, 4);
		   grid.add(last, 1, 5);
		   grid.add(comment7, 1, 6);
		   grid.add(total, 1, 7);
		   grid.add(total_amt, 1, 8);
		   grid.add(comment6, 1, 9);
		   grid.add(totalinterest, 1, 10);
		   grid.add(total_int, 1, 11);
		   grid.add(button, 1, 12);
		   
		   // Event Handler fo Go button//
		   button.setOnAction(e -> {
			   //Extract Data//
			   double dprice = Double.parseDouble(car_price.getText());
			   double ddownpayement = Double.parseDouble(down_payement.getText());
			   double dinterest = Double.parseDouble(int_rate.getText());
			   int dmonths = Integer.parseInt(num_months.getText());
			   //New Instance of Calculator//
			   Calculator calc = new Calculator(dprice, ddownpayement, dinterest, dmonths);
			   //Display Data//
			   monthly_payement.setText("$" + calc.monthly_payement());
			   last.setText("$" + calc.last_payement());
			   total_amt.setText("$" + calc.total());
			   total_int.setText("$" + calc.interest());
			   
		   		}
		   );
		   
		   // Display Stage//
		   primaryStage.setScene(scene);
		   primaryStage.setTitle("Car Payement Calculator"); // Set the stage title
		   primaryStage.show(); // Display the stage
   }
 
   public static void main(String args[]){          
      launch(args);     
   }       
} 