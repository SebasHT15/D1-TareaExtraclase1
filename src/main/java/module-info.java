module com.example.tareaextraclase1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tareaextraclase1 to javafx.fxml;
    exports com.example.tareaextraclase1;
}