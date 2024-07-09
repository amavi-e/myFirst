module com.example.myfirst {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.myfirst to javafx.fxml;
    exports com.example.myfirst;
}