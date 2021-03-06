package views;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;

import static constants.Constants.*;

public class HomeView {

    private BorderPane HomeWindow = new BorderPane();

    public HomeView(){
        HomeWindow.setStyle(STYLE_BG_LIGHT_BLUE_MAX);
    	HomeWindow.setPadding(new Insets(10));
        HomeWindow.setVisible(true);

        Label lblWelcome = new Label("Welcome to the Test Maker!");
        lblWelcome.setVisible(true);
        lblWelcome.setStyle(STYLE_BLUE_TEXT_BOLD);
        lblWelcome.setUnderline(true);
        HBox hbWelcome = new HBox(lblWelcome);
        hbWelcome.setAlignment(Pos.CENTER);
        Label lblWhatIsHere = new Label(" - You can look at our question bank. \n - You can create your own questions and add them to our bank. \n - You can update a qustion/answer as you like or even remove an answer. \n - You can create your own managed quiz and if you feel lazy you can create quiz randomly! \n - You Can copy a quiz from one that is already exist!");
        lblWhatIsHere.setStyle(STYLE_BLUE_TEXT_15);
        Label lblMadeBy = new Label("made by Guy Zvilich and Dimitry Gordon");
        lblMadeBy.setStyle(STYLE_BLUE_TEXT);
        lblMadeBy.setVisible(true);
        lblMadeBy.setPadding(new Insets(10));

        HomeWindow.setTop(hbWelcome);
        HomeWindow.setCenter(lblWhatIsHere);
        HomeWindow.setBottom(lblMadeBy);
    }

    public void visible(boolean val){
        this.HomeWindow.setVisible(val);
    }

    public BorderPane getHome() {
        return this.HomeWindow;
    }

}
