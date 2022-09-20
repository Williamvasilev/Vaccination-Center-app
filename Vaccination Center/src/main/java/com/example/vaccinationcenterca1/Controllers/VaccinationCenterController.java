package com.example.vaccinationcenterca1.Controllers;
import com.example.vaccinationcenterca1.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import static com.example.vaccinationcenterca1.Main.DATA;

public class VaccinationCenterController {


    @FXML
    private TextField Name, Address, Eircode, ParkingSpaces;

    @FXML
    private ListView<String> VCListView;


    public void addVaC(ActionEvent actionEvent) {
        VCListView.getItems().add("Vaccination center : " + Name.getText() + " Address :  " + Address.getText() + " Eircode :  " + Eircode.getText() + " Parking spaces :  " + ParkingSpaces.getText());                      //gets the elements
        VaccinationCenter addVC = new VaccinationCenter(Name.getText(), Address.getText(), Eircode.getText(), ParkingSpaces.getText());               //addVC creates new vaccination center
        DATA.getVCList().add(addVC);                            //added to linked list
        System.out.println(DATA.getVCList().size());    //prints size of vcs
        BoothController.bCon.vcChoiceBox.getItems().add(addVC); //adds to vcchoicebox


    }


    public void deleteVC(ActionEvent actionEvent) {

        int deleteVC = VCListView.getSelectionModel().getSelectedIndex();                            //gets the selected item
        VCListView.getItems().remove(VCListView.getSelectionModel().getSelectedIndex());                      //deletes the item
        DATA.getVCList().delete(deleteVC);   //deletes from list
        System.out.println(DATA.getVCList().size()); //prints size of vclist
    }


    public void clear(ActionEvent actionEvent) {

        DATA.getVCList().clear();
        DATA.getPatientList().clear();                                                  //clears lists and listviews and choice boxes
        VCListView.getItems().clear();
        BoothController.bCon.vcChoiceBox.getItems().clear();
        BoothController.bCon.boothList.clear();
        BoothController.bCon.boothListView.getItems().clear();
        PatientController.pCon.patientListView.getItems().clear();
        PatientController.pCon.patientRecordListView.getItems().clear();
        AppointmentController.aCon.patientChoiceBox.getItems().clear();
        AppointmentController.aCon.appointmentList.clear();
        AppointmentController.aCon.boothChoiceBox.getItems().clear();
        AppointmentController.aCon.completedAppointmentListView.getItems().clear();
        AppointmentController.aCon.appointmentListView.getItems().clear();

    }


    public void save(ActionEvent actionEvent) throws Exception {
        Main.save();
    }

    public void load(ActionEvent actionEvent) throws Exception {
        Main.load();

        for (int i = 0; i < DATA.getVCList().size(); i++) {
            GeneralList<VaccinationCenter>.Node<VaccinationCenter> temp = DATA.getVCList().get(i);      //node of type vaccinationCenter in Generallist is temp and gets the index of the VCList
            if (temp != null) {
                VCListView.getItems().add(temp.getContents().toString());   // adds contents of the listView

            }
        }

        for (int i = 0; i < DATA.getPatientList().size(); i++) {
            GeneralList<Patient>.Node<Patient> temp = DATA.getPatientList().get(i);
            if (temp != null) {
                PatientController.pCon.patientListView.getItems().add(temp.getContents().toString());
            }
        }

        for (int i = 0; i < DATA.getBoothList().size(); i++) {

            GeneralList<Booth>.Node<Booth> temp = DATA.getBoothList().get(i);

            if (temp != null) {
                BoothController.bCon.boothListView.getItems().add(temp.getContents().toString());
            }
        }

        for (int i = 0; i < DATA.getAppointmentList().size(); i++) {
            GeneralList<Appointment>.Node<Appointment> temp = DATA.getAppointmentList().get(i);
            if (temp != null) {
                AppointmentController.aCon.appointmentListView.getItems().add(temp.getContents().toString());

            }
        }


        for (int i = 0; i < DATA.getPatientRecordList().size(); i++) {
            GeneralList<String>.Node<String> temp = DATA.getPatientRecordList().get(i);
            if (temp != null) {
                AppointmentController.aCon.completedAppointmentListView.getItems().add(temp.getContents());
                PatientController.pCon.patientRecordListView.getItems().add(temp.getContents());
            }
        }
    }



}


