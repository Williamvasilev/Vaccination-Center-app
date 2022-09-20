package com.example.vaccinationcenterca1.Controllers;

import com.example.vaccinationcenterca1.Booth;
import com.example.vaccinationcenterca1.GeneralList;
import static com.example.vaccinationcenterca1.Main.DATA;

import com.example.vaccinationcenterca1.Main;
import com.example.vaccinationcenterca1.VaccinationCenter;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import java.net.URL;
import java.util.ResourceBundle;

import static com.example.vaccinationcenterca1.Main.DATA;


public class BoothController implements Initializable {

    public static BoothController bCon;

    GeneralList boothList = new GeneralList();


    @FXML
    private TextField boothId, floorLevel, accessibility;

    @FXML
    public ListView boothListView;

    @FXML
    public ChoiceBox<VaccinationCenter> vcChoiceBox;


    public void addBooth(ActionEvent actionEvent) {
        if (vcChoiceBox.getSelectionModel().getSelectedItem() != null) {
            boothListView.getItems().add(vcChoiceBox.getSelectionModel().getSelectedItem() + "    " + " ID : " + boothId.getText() + " floor :  " + floorLevel.getText() + " accessibility :  " + accessibility.getText());                      //gets the elements
            Booth addBooth = new Booth(boothId.getText(), floorLevel.getText(), accessibility.getText());               //addbooth creates new booth
            DATA.getBoothList().add(addBooth);                            //added to linked list
            vcChoiceBox.getSelectionModel().getSelectedItem().boothList.add(addBooth);
            AppointmentController.aCon.boothChoiceBox.getItems().add(addBooth);

        }

    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        bCon = this;

    }

    public void deleteBooth(ActionEvent actionEvent) {

        int deleteBooth = boothListView.getSelectionModel().getSelectedIndex();
        boothListView.getItems().remove(boothListView.getSelectionModel().getSelectedIndex());
        DATA.getBoothList().delete(deleteBooth);

    }

}