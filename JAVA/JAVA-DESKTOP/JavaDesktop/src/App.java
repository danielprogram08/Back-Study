import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class App extends Application {
    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @Override
    public void start(Stage arg0) throws Exception {
        arg0.setTitle("Academia dos devs!");
        Button btn = new Button("Clique aqui!");
        btn.setOnAction(event -> System.out.println("Clicou!"));

        StackPane root = new StackPane();
        root.getChildren().addAll(btn);
        arg0.setScene(new Scene(root, 300, 300));
        arg0.show();
    }
}