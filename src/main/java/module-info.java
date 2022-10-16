module com.example.java_intellij {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.java_intellij to javafx.fxml;
    exports com.example.java_intellij;
}