package Scenes;

import Application.GameLevel;
import Application.Main;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

public class LevelPickerScene extends Scene {

    public LevelPickerScene() {
        super(new Pane(), 900, 600);
        VBox mainLayout = new VBox();
        setRoot(mainLayout);

        Button level1 = new Button("Level 1");
        Button level2 = new Button("Level 2");
        Button back = new Button("Back");

        mainLayout.getChildren().addAll(level1, level2, back);

        level1.setOnAction(e -> {
            GameLevel l1 = new GameLevel(3, new int[] {1, 4, 5, 12, 1, 1}); // Change
            Main.mainStage.setScene(new GameScene(l1));
        });

        level2.setOnAction(e -> {
            GameLevel l2 = new GameLevel(15, new int[] {1, 4, 5, 12, 1, 1}); // Change
            Main.mainStage.setScene(new GameScene(l2));
        });

        back.setOnAction(e -> {
            Main.mainStage.setScene(new MainScene());
        });
    }
}
