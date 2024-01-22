module com.example.usabilidadmejorada {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.usabilidadmejorada to javafx.fxml;
    exports com.example.usabilidadmejorada;
}