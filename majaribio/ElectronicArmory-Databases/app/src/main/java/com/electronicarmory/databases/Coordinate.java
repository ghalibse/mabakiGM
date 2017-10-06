package com.electronicarmory.databases;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;
import com.activeandroid.query.Select;

import java.util.List;

@Table(name = "Coordinates")
public class Coordinate extends Model{
    @Column(name = "latitude")
    public double latitude;

    @Column(name = "longitude")
    public double longitude;

    public static List<Coordinate> getAllCoordinates(){
        return new Select().from(Coordinate.class).execute();
    }
}
