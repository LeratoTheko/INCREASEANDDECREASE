module com.example.increaseanddecrease {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.increaseanddecrease to javafx.fxml;
    exports com.example.increaseanddecrease;
}