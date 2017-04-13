package controller;

import javafx.fxml.FXML;
import javafx.scene.layout.VBox;
import model.RVUDataSet;
import view.CodePane;

import java.io.*;

/**
 * ApplicationController.java - Description
 *
 * @author Andrew McGuiness
 * @version 4/13/2017
 */
public class ApplicationController {
    @FXML
    private VBox codeBox;

    private static final String CSV_FILE = "rvu_codes.csv";
    private static final String DAT_FILE = "rvu_codes.dat";
    private RVUDataSet dataSet;

    public ApplicationController() {
        try {
            verifyDataSet();
        } catch ( Exception e ) {
            System.err.println( "An Error has occured loading the data file." );
        }

        System.out.println( dataSet );
    }

    @FXML
    public void initialize() {
        codeBox.getChildren().add( new CodePane() );
    }

    private void verifyDataSet() throws Exception {
        File dataSet = new File( DAT_FILE );

        if ( dataSet.exists() )
            loadOldDataSet();
        else
            loadNewDataSet();
    }

    private void loadOldDataSet() throws Exception{
        System.out.println( "Data set found, loading..." );
        ObjectInputStream ois = new ObjectInputStream( new FileInputStream( DAT_FILE ) );
        dataSet = (RVUDataSet ) ois.readObject();
        ois.close();
    }

    private void loadNewDataSet() throws Exception {
        System.out.println( "Data set not found, searching..." );
        BufferedReader reader = new BufferedReader( new FileReader( CSV_FILE ) );

        dataSet = RVUDataSet.factory( reader );

        ObjectOutputStream oos = new ObjectOutputStream( new FileOutputStream( DAT_FILE ) );
        oos.writeObject( dataSet );
        oos.close();
    }

    @FXML public void addRVU(){
        codeBox.getChildren().add( new CodePane() );
    }
}
