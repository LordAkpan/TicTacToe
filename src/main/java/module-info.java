module com.nuuwski.tictactoe {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.nuuwski.tictactoe to javafx.fxml;
    exports com.nuuwski.tictactoe;
}