/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.adventureGame.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author vladbalashov
 */
public class Map implements Serializable{
    
    private int noOfRows;
    private int noOfColumns;
    public Location[][] locations;
    

    public Map() {
    }

    public Map(int noOfRows, int noOfColumns) {
        
        if (noOfRows<1 || noOfColumns<1) {
            System.out.println("The number of rows and columns must be greater than zero");
            return;
        }
        
        this.noOfRows = noOfRows;
        this.noOfColumns = noOfColumns;
        
        this.locations = new Location[noOfRows] [noOfColumns];
        
        for (int row = 0; row < noOfRows; row++) {
            for (int column = 0; column < noOfColumns; column++){
            Location location = new Location();
            location.setColumn(column);
            location.setRow(row);
            location.setVisited(false);
            
            locations[row][column] = location;
            }
        }
    }
    
    

    public int getNoOfRows() {
        return noOfRows;
    }

    public void setNoOfRows(int noOfRows) {
        this.noOfRows = noOfRows;
    }

    public int getNoOfColumns() {
        return noOfColumns;
    }

    public void setNoOfColumns(int noOfColumns) {
        this.noOfColumns = noOfColumns;
    }

    public Location[][] getLocations() {
        return locations;
    }

    public void setLocations(Location[][] locations) {
        this.locations = locations;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + this.noOfRows;
        hash = 23 * hash + this.noOfColumns;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Map other = (Map) obj;
        if (this.noOfRows != other.noOfRows) {
            return false;
        }
        if (this.noOfColumns != other.noOfColumns) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Map{" + "noOfRows=" + noOfRows + ", noOfColumns=" + noOfColumns + '}';
    }
    
    
    
//
    
    
    
}
