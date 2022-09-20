module com.example.vaccinationcenterca1 {
    requires javafx.controls;
    requires javafx.fxml;
    requires xstream;


    opens com.example.vaccinationcenterca1 to javafx.fxml, xstream;
    opens com.example.vaccinationcenterca1.Controllers to javafx.fxml, xstream;

    exports com.example.vaccinationcenterca1.Controllers;
    exports com.example.vaccinationcenterca1;
}