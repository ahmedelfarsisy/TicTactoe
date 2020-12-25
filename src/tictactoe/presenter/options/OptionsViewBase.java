package tictactoe.presenter.options;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import tictactoe.presenter.home.HomeViewBase;

public class OptionsViewBase extends Pane {

    protected final ImageView backgroundIV;
    protected final VBox VBox;
    protected final Label homeLbl;
    protected final Button recordedGamesBtn;
    protected final Button themesBtn;
    protected final Button soundOptionsBtn;
    protected final Button levelsBtn;
    protected  Button backOptionsBtn;
    protected final Label gameNameLbl;
    protected final Label letUsPlayLbl;
    protected final Label ticTacToeLbl;
    OptionsController optionsController; 
    public OptionsViewBase() {
        backgroundIV = new ImageView();
        VBox = new VBox();
        homeLbl = new Label();
        recordedGamesBtn = new Button();
        themesBtn = new Button();
        soundOptionsBtn = new Button();
        levelsBtn = new Button();
        backOptionsBtn = new Button();
        gameNameLbl = new Label();
        letUsPlayLbl = new Label();
        ticTacToeLbl = new Label();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(400.0);
        setPrefWidth(600.0);
        setStyle("-fx-background-color: #ffffff;");

        backgroundIV.setFitHeight(400.0);
        backgroundIV.setFitWidth(300.0);
        backgroundIV.setPickOnBounds(true);
        backgroundIV.setImage(new Image(getClass().getResource("/tictactoe/resource/images/background.jpeg").toExternalForm()));

        VBox.setLayoutX(300.0);
        VBox.setPrefHeight(400.0);
        VBox.setPrefWidth(300.0);
        VBox.setSpacing(10.0);
        VBox.setStyle("-fx-background-color: #FFFFFF;");

        homeLbl.setAlignment(javafx.geometry.Pos.CENTER);
        homeLbl.setPrefHeight(17.0);
        homeLbl.setPrefWidth(293.0);
        homeLbl.setText("Options");
        homeLbl.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        homeLbl.setTextFill(javafx.scene.paint.Color.valueOf("#00b8d0"));
        homeLbl.setFont(new Font("Cooper Black", 30.0));
        VBox.setMargin(homeLbl, new Insets(10.0, 0.0, 0.0, 0.0));

        recordedGamesBtn.setMnemonicParsing(false);
        recordedGamesBtn.setPrefHeight(25.0);
        recordedGamesBtn.setPrefWidth(303.0);
        recordedGamesBtn.setStyle("-fx-background-color: #00B8D0;");
        recordedGamesBtn.setText("Recorded Games");
        recordedGamesBtn.setTextFill(javafx.scene.paint.Color.WHITE);
        VBox.setMargin(recordedGamesBtn, new Insets(48.0, 0.0, 0.0, 0.0));
        recordedGamesBtn.setFont(new Font("Cooper Black", 20.0));

        themesBtn.setMnemonicParsing(false);
        themesBtn.setPrefHeight(25.0);
        themesBtn.setPrefWidth(303.0);
        themesBtn.setStyle("-fx-background-color: #00B8D0;");
        themesBtn.setText("Themes");
        themesBtn.setTextFill(javafx.scene.paint.Color.WHITE);
        themesBtn.setFont(new Font("Cooper Black", 20.0));

        soundOptionsBtn.setMnemonicParsing(false);
        soundOptionsBtn.setPrefHeight(25.0);
        soundOptionsBtn.setPrefWidth(303.0);
        soundOptionsBtn.setStyle("-fx-background-color: #00B8D0;");
        soundOptionsBtn.setText("Sound Options ");
        soundOptionsBtn.setTextFill(javafx.scene.paint.Color.WHITE);
        soundOptionsBtn.setFont(new Font("Cooper Black", 20.0));

        levelsBtn.setMnemonicParsing(false);
        levelsBtn.setPrefHeight(25.0);
        levelsBtn.setPrefWidth(303.0);
        levelsBtn.setStyle("-fx-background-color: #00B8D0;");
        levelsBtn.setText("Levels");
        levelsBtn.setTextFill(javafx.scene.paint.Color.WHITE);
        levelsBtn.setFont(new Font("Cooper Black", 20.0));

        backOptionsBtn.setMnemonicParsing(false);
        backOptionsBtn.setStyle("-fx-background-color: #00B8D0;");
        backOptionsBtn.setText("Back");
        backOptionsBtn.setTextFill(javafx.scene.paint.Color.WHITE);
        VBox.setMargin(backOptionsBtn, new Insets(48.0, 0.0, 0.0, 230.0));
        backOptionsBtn.setFont(new Font("Cooper Black", 10.0));
        VBox.setPadding(new Insets(10.0));

        gameNameLbl.setAlignment(javafx.geometry.Pos.CENTER);
        gameNameLbl.setLayoutX(4.0);
        gameNameLbl.setLayoutY(20.0);
        gameNameLbl.setPrefHeight(17.0);
        gameNameLbl.setPrefWidth(293.0);
        gameNameLbl.setText("X CANDY O");
        gameNameLbl.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        gameNameLbl.setTextFill(javafx.scene.paint.Color.valueOf("#00b8d0"));
        gameNameLbl.setFont(new Font("Cooper Black", 30.0));

        letUsPlayLbl.setAlignment(javafx.geometry.Pos.CENTER);
        letUsPlayLbl.setLayoutX(4.0);
        letUsPlayLbl.setLayoutY(145.0);
        letUsPlayLbl.setPrefHeight(17.0);
        letUsPlayLbl.setPrefWidth(293.0);
        letUsPlayLbl.setText("Let �s play ");
        letUsPlayLbl.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        letUsPlayLbl.setTextFill(javafx.scene.paint.Color.valueOf("#00b8d0"));
        letUsPlayLbl.setFont(new Font("Cooper Black", 20.0));

        ticTacToeLbl.setAlignment(javafx.geometry.Pos.CENTER);
        ticTacToeLbl.setLayoutX(4.0);
        ticTacToeLbl.setLayoutY(176.0);
        ticTacToeLbl.setPrefHeight(17.0);
        ticTacToeLbl.setPrefWidth(293.0);
        ticTacToeLbl.setText("Tic-Tac-Toe");
        ticTacToeLbl.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        ticTacToeLbl.setTextFill(javafx.scene.paint.Color.valueOf("#00b8d0"));
        ticTacToeLbl.setFont(new Font("Cooper Black", 30.0));

        getChildren().add(backgroundIV);
        VBox.getChildren().add(homeLbl);
        VBox.getChildren().add(recordedGamesBtn);
        VBox.getChildren().add(themesBtn);
        VBox.getChildren().add(soundOptionsBtn);
        VBox.getChildren().add(levelsBtn);
        VBox.getChildren().add(backOptionsBtn);
        getChildren().add(VBox);
        getChildren().add(gameNameLbl);
        getChildren().add(letUsPlayLbl);
        getChildren().add(ticTacToeLbl);
    }

    
}
