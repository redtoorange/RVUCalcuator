import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * DataDriver.java - Description
 *
 * @author Andrew McGuiness
 * @version 4/13/2017
 */
public class DataDriver extends Application{

    @Override
    public void start( Stage primaryStage ) throws Exception {
        FXMLLoader loader = new FXMLLoader( getClass().getClassLoader().getResource( "RVUCoder.fxml" ) );
        Parent root = loader.load();
        Scene scene = new Scene( root );

        primaryStage.setScene( scene );
        primaryStage.setTitle( "RVU Coder" );

        primaryStage.show();
    }

    public static void main( String[] args ) {
        launch( args );
    }
}
