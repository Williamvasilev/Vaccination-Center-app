package com.example.vaccinationcenterca1.Controllers;

import com.example.vaccinationcenterca1.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import java.net.URL;
import java.util.ResourceBundle;
import static com.example.vaccinationcenterca1.Main.DATA;


public class AppointmentController implements Initializable {

    public static AppointmentController aCon;


    GeneralList appointmentList = new GeneralList();

    @FXML
    private TextField date, time, type, batchNumber, vaccinatorDetails, patientId;

    @FXML
    public ListView <String> appointmentListView;

    @FXML
    public ListView <String> completedAppointmentListView;

    @FXML
    public ChoiceBox<Booth> boothChoiceBox;
    public ChoiceBox<Patient> patientChoiceBox;


    public void addAppointment(ActionEvent actionEvent) {
        appointmentListView.getItems().add( patientChoiceBox.getSelectionModel().getSelectedItem() +" Date : " + date.getText() + " Time : " + time.getText() + " Vaccination type :  " + type.getText() + " Batch number :  " + batchNumber.getText() + " Vaccinator details : " + vaccinatorDetails.getText() + " Patient ID : " + patientId.getText());                      //gets the elements
        Appointment addAppointment = new Appointment(date.getText(), time.getText(), type.getText(), batchNumber.getText(), vaccinatorDetails.getText(), patientId.getText());               //addAppointment creates new booth
        DATA.getAppointmentList().add(addAppointment);
        patientChoiceBox.getSelectionModel().getSelectedItem().patientList.add(addAppointment);
        boothChoiceBox.getSelectionModel().getSelectedItem().appointmentList.add(addAppointment);
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        aCon=this;

    }

    public void deleteAppointment(ActionEvent actionEvent) {
        int deleteAppointment = appointmentListView.getSelectionModel().getSelectedIndex();
        appointmentListView.getItems().remove(appointmentListView.getSelectionModel().getSelectedIndex());
        DATA.getAppointmentList().delete(deleteAppointment);
    }

    public void completeAppointment(ActionEvent actionEvent) {

        String appointment = appointmentListView.getSelectionModel().getSelectedItem();                  //selects the appointment from the listview
        completedAppointmentListView.getItems().add(appointment);                                        // addes the selected appointment to the completed appoibtments list view
        PatientController.pCon.patientRecordListView.getItems().add(appointment);                     // adds to the patient records listview
        int deleteAppointment = appointmentListView.getSelectionModel().getSelectedIndex();                // deletes the pending appointment
        appointmentListView.getItems().remove(appointmentListView.getSelectionModel().getSelectedIndex());
        DATA.getPatientRecordList().add(appointment);
        DATA.getAppointmentList().delete(deleteAppointment);
    }


}

