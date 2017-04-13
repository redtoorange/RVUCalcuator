package model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Scanner;

/**
 * RVUDataSet.java - Description
 *
 * @author Andrew McGuiness
 * @version 4/13/2017
 */
public class RVUDataSet implements Serializable {
    private HashMap< String, RVUCode > codeCollection = new HashMap<>();

    public static RVUDataSet factory( BufferedReader reader ) throws IOException {
        RVUDataSet dataSet = new RVUDataSet();

        //Dispose of first line
        reader.readLine();
        String line;

        //While the lines are not null, keep reading
        while ( ( line = reader.readLine() ) != null ) {
            Scanner lineScanner = new Scanner( line );
            lineScanner.useDelimiter( "," );

            //insert the new code
            dataSet.addCode( new RVUCode( lineScanner.next(), lineScanner.nextDouble(), null ) );
        }

        return dataSet;
    }

    public void addCode( RVUCode code ) {
        if ( codeCollection.containsKey( code.getCode() ) )
            codeCollection.replace( code.getCode(), code );
        else
            codeCollection.put( code.getCode(), code );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder( "RVUDataSet{\n" );

        for( RVUCode c : codeCollection.values()){
            sb.append( "\tCode: " + c.getCode() + "\tValue: " + c.getValue() + "\n" );
        }

        sb.append( "}\n" );

        return sb.toString();
    }
}
