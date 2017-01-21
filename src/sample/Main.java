package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.Arrays;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("JavaFX ch549");
        primaryStage.show();

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(15, 15, 15, 15));

        Scene scene = new Scene(grid, 700, 375);
        primaryStage.setScene(scene);


        Text scenetitle = new Text("Please enter a string:");
        scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        grid.add(scenetitle, 0, 0, 2, 1);


        TextField inputtemp = new TextField();
        grid.add(inputtemp, 1, 1);


        Button btn = new Button("Count the vowel and consonants");
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn.getChildren().add(btn);
        grid.add(hbBtn, 1, 2);

        final Text result1 = new Text();
        grid.add(result1, 1, 5);
        final Text result2 = new Text();
        grid.add(result2, 1, 6);


        btn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent e) {
                String input = inputtemp.getText().trim();

                int j = input.length() - 1;
                int vowels = 0;
                int cans = 0;


                for (int i = 0; i <= j; i++) {
                    if (input.substring(i, (i + 1)).equalsIgnoreCase("a")) {
                        vowels++;
                    } else if (input.substring(i, (i + 1)).equalsIgnoreCase("e")) {
                        vowels++;
                    } else if (input.substring(i, (i + 1)).equalsIgnoreCase("i")) {
                        vowels++;
                    } else if (input.substring(i, (i + 1)).equalsIgnoreCase("o")) {
                        vowels++;
                    } else if (input.substring(i, (i + 1)).equalsIgnoreCase("u")) {
                        vowels++;
                    } else if (input.substring(i, (i + 1)).equalsIgnoreCase(" ")) {

                    } else {
                        cans++;
                    }

                }


                result1.setFill(Color.FIREBRICK);
                result2.setFill(Color.FIREBRICK);
                result1.setText("The number of vowels is " + vowels);
                result2.setText("The number of consonants is " + cans);

            }
        });
    }

}