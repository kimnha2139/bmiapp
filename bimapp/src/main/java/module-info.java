module com.mycompany.bimapp {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.bimapp to javafx.fxml;
    exports com.mycompany.bimapp;
}
