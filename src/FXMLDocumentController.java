/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.jfoenix.controls.JFXPasswordField;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author SMK TELKOM
 */
public class FXMLDocumentController implements Initializable {
    
    String pinn = "";
    String PIN = "1234";
    int kesempatan = 3;
    int tmp;
    
    @FXML
    private Label label;
    @FXML
    private Button btn2;
    @FXML
    private Button btn3;
    @FXML
    private Button btn4;
    @FXML
    private Button btn5;
    @FXML
    private Button btn6;
    @FXML
    private Button btn7;
    @FXML
    private Button btn8;
    @FXML
    private Button btnok;
    @FXML
    private Button btn9;
    @FXML
    private Button btn0;
    @FXML
    private Button btnc;
    @FXML
    private Button btn1;
    
    @FXML
    private JFXPasswordField ppin;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
     void b2(ActionEvent event) {
        pinn += "2";
        ppin.setText(pinn);
    }

    @FXML
     void b3(ActionEvent event) {
        pinn += "3";
        ppin.setText(pinn);
    }

    @FXML
     void b4(ActionEvent event) {
        pinn += "4";
        ppin.setText(pinn);
    }

    @FXML
     void b5(ActionEvent event) {
        pinn += "5";
        ppin.setText(pinn);
    }

    @FXML
     void b6(ActionEvent event) {
        pinn += "6";
        ppin.setText(pinn);
    }

    @FXML
     void b7(ActionEvent event) {
        pinn += "7";
        ppin.setText(pinn);
    }

    @FXML
     void b8(ActionEvent event) {
        pinn += "8";
        ppin.setText(pinn);
    }

    @FXML
     void bok(ActionEvent event) {
        if(pinn.equals(PIN)){
            try{
                
            ((Node)(event.getSource())).getScene().getWindow().hide();
            FXMLLoader fxmlLoader=new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("FXMLMenuAwal.fxml"));
            Scene scene=new Scene(fxmlLoader.load(),600,450);
            Stage stage=new Stage();
            stage.setScene(scene);
            stage.setTitle("MenuAwal");
            stage.show();
            }catch(IOException e){
                System.out.println("Failed To Create New Window."+e);
            }
        }else{
            kesempatan -= 1;
            JOptionPane.showMessageDialog(null, "PIN Salah \nTersisa "+ kesempatan
            + "Kesempatan Lagi ");
            ppin.setText("");
            pinn="";
            if(kesempatan == 0){
                System.exit(0);
            }
        }
       
    }

    @FXML
     void b9(ActionEvent event) {
        pinn += "9";
        ppin.setText(pinn);
    }

    @FXML
     void b0(ActionEvent event) {
        pinn += "0";
        ppin.setText(pinn);
    }

    @FXML
     void bc(ActionEvent event) {
        pinn = "";
        ppin.setText(pinn);
    }

    @FXML
     void b1(ActionEvent event) {
        pinn += "1";
        ppin.setText(pinn);
    }

    

        private void setText(String pinn) {
            
        }
    }
    

