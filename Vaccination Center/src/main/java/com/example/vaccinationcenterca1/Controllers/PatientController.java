package com.example.vaccinationcenterca1.Controllers;

import com.example.vaccinationcenterca1.Patient;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

import static com.example.vaccinationcenterca1.Main.DATA;

public class PatientController implements Initializable {


    public static PatientController pCon;


    @FXML
    private TextField patientId, patientName, dateOfBirth,eircode , patientAccessibility;

    @FXML
    public ListView patientListView,patientRecordListView;






    public void addPatient(ActionEvent actionEvent) {

            patientListView.getItems().add(" Patient ID : " + patientId.getText() + " Name :  " + patientName.getText() + " Date of birth :  " + dateOfBirth.getText() + " Eircode : " + eircode.getText() + " Patient Accessibility : " + patientAccessibility.getText());                      //gets the elements
            Patient addPatient = new Patient(patientId.getText(), patientName.getText(), dateOfBirth.getText(), eircode.getText(), patientAccessibility.getText());               //addAppointment creates new booth
            DATA.getPatientList().add(addPatient);            //added to linked list
            AppointmentController.aCon.patientChoiceBox.getItems().add(addPatient);

    }


    public void deletePatient(ActionEvent actionEvent) {
        int deletePatient = patientListView.getSelectionModel().getSelectedIndex() ;
        patientListView.getItems().remove(patientListView.getSelectionModel().getSelectedIndex());
        DATA.getPatientList().delete(deletePatient);
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        pCon=this;
    }
}
