/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author User
 */
public class FXMLController implements Initializable {

	@FXML
	private TextField BeratBadanTextField;
	@FXML
	private TextField TinggiBadanTextField;
	@FXML
	private TextField BMITextField;
	@FXML
	private TextField KondisiTextField;

	/**
	 * Initializes the controller class.
	 */
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		// TODO
	}

	@FXML
	private void hitungButtonPressed(ActionEvent event) {
		double tinggiBadan = Double.parseDouble(TinggiBadanTextField.getText());
		double beratBadan = Double.parseDouble(BeratBadanTextField.getText());

		double BMI = beratBadan / (tinggiBadan * tinggiBadan);

		BMITextField.setText(String.format("%.1f", BMI));

		if (BMI < 18.5) {
			KondisiTextField.setText("Underweight");
		} else if (BMI >= 18.5 && BMI <= 24.9) {
			KondisiTextField.setText("Normal");
		} else if (BMI >= 25 && BMI <= 29.9) {
			KondisiTextField.setText("Overweight");
		} else if (BMI > 30) {
			KondisiTextField.setText("Obese");
		}
	}

}
