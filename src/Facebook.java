import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.collections.FXCollections;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Facebook extends Application{
     @Override
    public void start(Stage stage) {
     
        Text text1 = new Text("Facebook");
        Text text2 = new Text("Connect with friends and the");
        Text text3 = new Text("world around you on Facebook");
        Text text4 = new Text("See photos and updates From Friends in News Feed");
        //Text text5 = new Text("From friends in news feed");
        Text text6 = new Text("Share what's new in your life on your timeline");
        //Text text7 = new Text("in your life on your timeline");
        Text text8 = new Text("Find more");
        Text text9 = new Text("of what you are looking for with Facebook search");
        Text text10 = new Text("Email or Phone");
        Text text11 = new Text("password");
        
        TextField textField1 = new TextField();
        TextField textField2 = new TextField();
        Button button1 = new Button("Log in");
        
         Text text12 = new Text("sign up");
         Text text13 = new Text("it's free and always will be");
         
          TextField textField3 = new TextField();
          textField3.setPromptText("First Name");
          TextField textField4 = new TextField();
          textField4.setPromptText("Last Name");
          TextField textField5 = new TextField();
          textField5.setPromptText("Mobile Number or Email");
          TextField textField6 = new TextField();
          textField6.setPromptText("New Password");
          
          Text text14 = new Text("Birthday");
          
          DatePicker datePicker = new DatePicker();
          
          Text text15 = new Text("Gender");
          Text text16 = new Text("Female");
          Text text17 = new Text("male");
         
          
          Text text18 = new Text("By clicking Sign Up, you agree to our Terms, Data Policy and");
          Text text19 = new Text("Cookie Policy. You may receive SMS notifications from us and");
          Text text20 = new Text("can opt out at any time.");
          
          Button button2 = new Button("Create Account");
    
 

       
        //step 10: creating a grid pane and import relevant classes
        GridPane gridPane = new GridPane();

        //step 11: set up size for the pane
        gridPane.setMinSize(1000, 500);

        //step 12: Set padding
        gridPane.setPadding(new Insets(10, 10, 10, 10));

        //step 13: Set the vertical and horizontal gaps between the columns
        gridPane.setVgap(10);
        gridPane.setHgap(10);

        //step 14: Set Grid alignment
        gridPane.setAlignment(Pos.TOP_LEFT);
        
        //step 15: Arrange all the nodes in the grid
        gridPane.add(text1, 0, 0);
        gridPane.add(text10, 6, 0);
        
        gridPane.add(textField1, 6,1);

        gridPane.add(text11, 7, 0);
        gridPane.add(textField2, 7, 1);
        
        gridPane.add(button1, 8, 1);
        
        gridPane.add(text3, 0, 4);
        //gridPane.add(textField3, 1, 2);

        //gridPane.add(button1, 7, 2);
     
        gridPane.add(text2, 0, 2);
        //gridPane.add(text3, 0, 5);
        
        gridPane.add(text4, 0,7);
        //gridPane.add(text5, 0,7);
        gridPane.add(text6, 0,10);
        
        gridPane.add(text12, 6,2);
        gridPane.add(text13, 6,3);
        gridPane.add(textField3, 6,4);
        gridPane.add(textField4, 7,4);
        gridPane.add(textField5, 6,5);
        gridPane.add(textField6, 6,6);
        
        gridPane.add(text14, 6,7);
        
        gridPane.add(datePicker, 6,8);
        
        gridPane.add(text18, 6,9);
        gridPane.add(text19, 6,10);
        gridPane.add(text20, 6,11);
        gridPane.add(button2, 6,12);


        text1.setStyle("-fx-font: normal bold 50px 'serif' ");
        text2.setStyle("-fx-font: normal bold 30px 'serif' ");
        text3.setStyle("-fx-font: normal bold 30px 'serif' ");
        text4.setStyle("-fx-font: normal bold 20px 'serif' ");
        text6.setStyle("-fx-font: normal bold 20px 'serif' ");
        text12.setStyle("-fx-font: normal bold 40px 'serif' ");
        button2.setStyle("-fx-background-color: Green;");
        gridPane.setStyle("-fx-background-color: sky blue;");
        
        //setting the dimensions
        textField1.setMinSize(150,20);
        textField2.setMinSize(150,20);
        textField3.setMinSize(150,20);
        textField4.setMinSize(150,20);
        textField5.setMinSize(300,20);
        textField6.setMinSize(300,20);
        //button1.setMinSize(150,20);
        button2.setMinSize(150,20);
        
        //creating a scene object
        Scene scene = new Scene(gridPane);
        
        //setting title for the stage
        stage.setTitle("Facebook");
        
        //adding scene to the stage
        stage.setScene(scene);
       
        //displaying he contents of the stage
        stage.show();
        
        
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}





