package view;

import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.RowConstraints;
import javafx.scene.text.Font;

/**
 * CodePane.java - Description
 *
 * @author Andrew McGuiness
 * @version 4/13/2017
 */
public class CodePane extends GridPane {
    private static final int ROW = 0;

    public CodePane() {
        setHgap( 10 );
        setPadding( new Insets( 5 ) );

        initRowsCols();
        initText();
        initButtons();
    }

    private void initButtons() {
        CheckBox selectBox = new CheckBox();
        selectBox.setFocusTraversable( false );
        add( selectBox, 0, ROW );

        Button upArrow = new Button( "^" );
        upArrow.setFocusTraversable( false );
        upArrow.setAlignment( Pos.CENTER_RIGHT );
        add( upArrow, 5, ROW );
        setHalignment( upArrow, HPos.RIGHT );

        Button downArrow = new Button( "v" );
        downArrow.setFocusTraversable( false );
        downArrow.setAlignment( Pos.CENTER_RIGHT );
        add( downArrow, 6, ROW );
        setHalignment( downArrow, HPos.LEFT );

        Button closeButton = new Button( "X" );
        closeButton.setFocusTraversable( false );
        closeButton.setAlignment( Pos.CENTER_RIGHT );
        add( closeButton, 7, ROW );
        setHalignment( closeButton, HPos.RIGHT );
    }

    private void initText() {
        TextField code = new TextField( "Test" );
        code.setAlignment( Pos.CENTER );
        add( code, 1, ROW );

        TextField count = new TextField( "Test" );
        count.setAlignment( Pos.CENTER );
        add( count, 2, ROW );

        Label valueLabel = new Label( "$##.00" );
        valueLabel.setAlignment( Pos.CENTER );
        valueLabel.setFont( Font.font( 14 ) );
        add( valueLabel, 3, ROW );
    }

    private void initRowsCols() {
        getColumnConstraints().add( new ColumnConstraints( 50, 50, 50, Priority.SOMETIMES, HPos.CENTER, true ) );
        getColumnConstraints().add( new ColumnConstraints( 150, 150, 150, Priority.SOMETIMES, HPos.CENTER, true ) );
        getColumnConstraints().add( new ColumnConstraints( 150, 150, 150, Priority.SOMETIMES, HPos.CENTER, true ) );
        getColumnConstraints().add( new ColumnConstraints( 150, 150, 150, Priority.SOMETIMES, HPos.CENTER, true ) );
        getColumnConstraints().add( new ColumnConstraints( 150, 150, 150, Priority.SOMETIMES, HPos.CENTER, true ) );
        getColumnConstraints().add( new ColumnConstraints( 50, 50, 50, Priority.SOMETIMES, HPos.CENTER, true ) );
        getColumnConstraints().add( new ColumnConstraints( 50, 50, 50, Priority.SOMETIMES, HPos.CENTER, true ) );
        getColumnConstraints().add( new ColumnConstraints( 50, 50, 50, Priority.SOMETIMES, HPos.CENTER, true ) );

        getRowConstraints().add( new RowConstraints( 10, 30, 30, Priority.SOMETIMES, VPos.CENTER, true ) );
    }

}
