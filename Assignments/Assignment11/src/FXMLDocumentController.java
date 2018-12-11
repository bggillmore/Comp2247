
/*
* Author: Benjamin Gillmore
* Date: Dec 5, 2018
* Assignment: FXMLDocumentController
* Description: Controls actions set on the related FXML document
*/

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

/**
 *
 * @author Graham
 */
public class FXMLDocumentController implements Initializable {
    
    MyArrayListQueue<Ticket> queue = new MyArrayListQueue<>();
    int ticketNumber = 1;
    
    @FXML
    private Label label;
    @FXML
    private TextArea resultField;
    @FXML
    private TextField nameField;
    
    
    @FXML
    private void clearBtnClick(ActionEvent event) {
        nameField.setText("");
        resultField.setText("");
        queue = new MyArrayListQueue<>();
    }
    
    @FXML
    private void resetBtnClick(ActionEvent event) {
        nameField.setText("");
    }
    
    @FXML
    private void lineBtnClick(ActionEvent event) {
        if(queue.size() == 0){
            resultField.setText(resultField.getText() + "Line is empty.\n");
        }
        else{
            resultField.setText(resultField.getText() + "Line: " + queue.toString() + "\n");
        }
    }
    
    @FXML
    private void sizeBtnClick(ActionEvent event) {
        if(queue.size() == 0){
            resultField.setText(resultField.getText() + "Line is empty.\n");
        }
        else{
            resultField.setText(resultField.getText() + "Size: " + queue.size() + "\n");
        }
    }
    
    @FXML
    private void frontBtnClick(ActionEvent event) {
        try{
            resultField.setText(resultField.getText() + "Front Customer: " + queue.peek()+ "\n");
        }
        catch(EmptyQueueException e1){
            resultField.setText(resultField.getText() + e1.toString() + "\n");
            resultField.setText(resultField.getText() + "Queue is Currently Empty.\n");
        }
        catch(Exception e){
            resultField.setText(resultField.getText() + e.toString() + "\n");
        }
    }
    
    @FXML
    private void exitBtnClick(ActionEvent event) {
        System.exit(0);
    }
    
    @FXML
    private void nextBtnClick(ActionEvent event) {
        try{
            resultField.setText(resultField.getText() + queue.dequeue() + " is being served.\n");
        }
        catch(EmptyQueueException e1){
            resultField.setText(resultField.getText() + e1.toString() + "\n");
            resultField.setText(resultField.getText() + "Queue is Currently Empty.\n");
        }
        catch(Exception e){
            resultField.setText(resultField.getText() + e.toString() + "\n");
        }
    }
    
    @FXML
    private void signUpBtnClick(ActionEvent event) {
        if(!nameField.getText().equals("")){
            queue.enqueue(new Ticket(nameField.getText(), ticketNumber));
            ticketNumber++;
            resultField.setText(resultField.getText() + nameField.getText() + " has been added to the queue.\n");
            nameField.setText("");
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
