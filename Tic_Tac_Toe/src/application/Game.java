package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.control.Alert.AlertType;

public class Game implements Initializable{
	
	int flag = 0;
	
	@FXML private Button b1,b2,b3,b4,b5,b6,b7,b8,b9;
	
	@FXML
    private ImageView exit;
	
	public void run_game(ActionEvent e) {
		if(flag == 0) {
			((Button)e.getSource()).setText("X");flag = 1;
		}else {
			((Button)e.getSource()).setText("O");flag = 0;
		}
		((Button)e.getSource()).setDisable(true);
		if(b1.getText().equals(b2.getText()) && b2.getText().equals(b3.getText())&& !(b1.getText().equals("")))
		{
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setContentText("WINNER IS   " +b1.getText());
		    alert.show();
		}
		else if(b4.getText().equals(b5.getText()) && b5.getText().equals(b6.getText())&& !(b4.getText().equals("")))
		{
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setContentText("WINNER IS   " +b4.getText());
			alert.show();
		}
		else if( b7.getText().equals(b8.getText()) && b8.getText().equals(b9.getText()) && !(b7.getText().equals("")))
		{
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setContentText("WINNER IS   " +b7.getText());
			alert.show();
		}
		else if( b1.getText().equals(b4.getText()) && b4.getText().equals(b7.getText()) && !(b1.getText().equals("")))
		{
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setContentText("WINNER IS   " +b1.getText());
			alert.show();
		}
		else if( b2.getText().equals(b5.getText()) && b5.getText().equals(b8.getText()) && !(b2.getText().equals("")))
		{
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setContentText("WINNER IS   " +b2.getText());
			alert.show();
		}
		else if( b3.getText().equals(b6.getText()) && b6.getText().equals(b9.getText()) && !(b3.getText().equals("")))
		{
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setContentText("WINNER IS   " +b3.getText());
			alert.show();
		}
		else if( b1.getText().equals(b5.getText()) && b5.getText().equals(b9.getText()) && !(b1.getText().equals("")))
		{
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setContentText("WINNER IS   " +b1.getText());
			alert.show();
		}
		else if( b3.getText().equals(b4.getText()) && b4.getText().equals(b7.getText()) && !(b3.getText().equals("")))
		{
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setContentText("WINNER IS   " +b3.getText());
			alert.show();
		}
		else if(!(b1.getText().equals("")) && !(b2.getText().equals("")) && !(b3.getText().equals("")) && !(b4.getText().equals("")) && !(b5.getText().equals("")) && !(b6.getText().equals("")) && !(b7.getText().equals("")) && !(b8.getText().equals("")) && !(b9.getText().equals("")))
		{
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setContentText("No one win");
			alert.show();
		}
	}
	public void reset() {
		flag = 0;
		b1.setText("");
		b1.setDisable(false);
		b2.setText("");
		b2.setDisable(false);
		b3.setText("");
		b3.setDisable(false);
		b4.setText("");
		b4.setDisable(false);
		b5.setText("");
		b5.setDisable(false);
		b6.setText("");
		b6.setDisable(false);
		b7.setText("");
		b7.setDisable(false);
		b8.setText("");
		b8.setDisable(false);
		b9.setText("");
		b9.setDisable(false);
	}
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		exit.setOnMouseClicked(event->{
			System.exit(0);
		});
	}
}
