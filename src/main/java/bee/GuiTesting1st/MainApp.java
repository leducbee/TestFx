package bee.GuiTesting1st;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainApp extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		VBox root = new VBox();
		root.setSpacing(10);
		Label lb1 = new Label("Name: ");
		TextField txt1 = new TextField();
		txt1.setId("txtName");
		HBox row1 = new HBox(lb1, txt1);
		row1.setSpacing(10);
		Label lb2 = new Label("Age: ");
		TextField txt2 = new TextField();
		txt2.setId("txtAge");
		HBox row2 = new HBox(lb2, txt2);
		Button btn = new Button("lick me");
		btn.setId("btn");
		Label lbl3 = new Label();
		lbl3.setId("lbl3");

		btn.setOnAction(event -> {
			System.err.println("aaaaaaaaaaaaaaaa");
			lbl3.setText(txt1.getText() + " " + txt2.getText());
		});

		root.getChildren().addAll(row1, row2, lbl3, btn);
		// setup scene and stage.
		Scene scene = new Scene(root, 500, 250);
		stage.setScene(scene);
		stage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
