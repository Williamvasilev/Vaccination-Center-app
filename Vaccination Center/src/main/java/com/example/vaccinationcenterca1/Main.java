package com.example.vaccinationcenterca1;


import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import com.thoughtworks.xstream.security.AnyTypePermission;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.*;

public class Main extends Application{

    public static class Data {
        public GeneralList<VaccinationCenter> VCList = new GeneralList<>();
        public GeneralList<Patient> patientList = new GeneralList<>();
        public GeneralList<Booth> boothList = new GeneralList<>();
        public GeneralList<Appointment> appointmentList = new GeneralList<>();
        public GeneralList<String>patientRecordList = new GeneralList<>();

        public GeneralList<VaccinationCenter> getVCList() {
            return VCList;
        }

        public GeneralList<Patient> getPatientList() {
            return patientList;
        }

        public GeneralList<Booth> getBoothList() {
            return boothList;
        }

        public GeneralList<Appointment> getAppointmentList() {
            return appointmentList;
        }

        public GeneralList<String> getPatientRecordList() {
            return patientRecordList;
        }

    }

    public static Main.Data DATA;


    @Override
    public void start(Stage stage) throws IOException {
        DATA = new Main.Data();

        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("Main.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 800, 800);
        stage.setTitle("Vaccination Management System!");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {

        launch(args);



    }

    public static void load() throws Exception
    {
        XStream xstream = new XStream(new DomDriver());
        xstream.addPermission(AnyTypePermission.ANY);                                                               //https://stackoverflow.com/questions/30812293/com-thoughtworks-xstream-security-forbiddenclassexception
        ObjectInputStream is = xstream.createObjectInputStream(new FileReader("VaccinationCenter.xml"));
        DATA = (Main.Data) is.readObject();
        is.close();


    }

    public static void save() throws Exception
    {
        XStream xstream = new XStream(new DomDriver());
        ObjectOutputStream out = xstream.createObjectOutputStream(new FileWriter("VaccinationCenter.xml"));
        out.writeObject(DATA);
        out.close();
    }


}
