
import control.MainCrontroller;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import view.MainPanel;

public class App extends Application {
    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        MainCrontroller mainCrontroller = new MainCrontroller();
        MainPanel mainPanel = mainCrontroller.getMainPanel();
        Scene scene = new Scene(mainPanel, 400, 400);
        stage.setScene(scene);
        stage.show();
    }
}
