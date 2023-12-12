package hust.soict.itep.javafx;
import javafx.fxml.FXML;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;

public class PainterController {
    @FXML
    private Pane drawingAreaPane;

    public void drawingAreaMouseDragged(javafx.scene.input.MouseEvent event) {
        Circle newCircle = new Circle(event.getX(), event.getY(), 4, Color.BLACK);
        drawingAreaPane.getChildren().add(newCircle);
    }
    public void clearButtonPressed(javafx.event.ActionEvent actionEvent) {
        drawingAreaPane.getChildren().clear();
    }

}

