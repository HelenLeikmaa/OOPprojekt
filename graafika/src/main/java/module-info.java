module com.example.graafika {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.graafika to javafx.fxml;
    exports com.example.graafika;
}