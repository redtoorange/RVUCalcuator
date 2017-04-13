package model;

import java.io.Serializable;

/**
 * RVUCode.java - Description
 *
 * @author Andrew McGuiness
 * @version 4/13/2017
 */
public class RVUCode implements Serializable{
    private String code;
    private double value;
    private String description;

    public RVUCode( String code, double value, String description ) {
        this.code = code;
        this.value = value;
        this.description = description;
    }

    public String getCode() {
        return code;
    }

    public double getValue() {
        return value;
    }

    public String getDescription() {
        return description;
    }
}
