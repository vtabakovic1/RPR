module com.example.digitron {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.digitron to javafx.fxml;
    exports com.example.digitron;
}