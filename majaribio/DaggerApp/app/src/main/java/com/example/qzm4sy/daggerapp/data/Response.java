package com.example.qzm4sy.daggerapp.data;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;


public class Response {

    @SerializedName("scoreValue")
    public ScoreValue scoreValue;
    @SerializedName("hardAccelarationCount")
    public String hardAccelarationCount;
    @SerializedName("hardBrakeCount")
    public String hardBrakeCount;
    @SerializedName("tripCount")
    public String tripCount;
    @SerializedName("averageSpeed")
    public String averageSpeed;
    @SerializedName("totalMilesDriven")
    public String totalMilesDriven;
    @SerializedName("speedThreshold")
    public String speedThreshold;
    @SerializedName("lateMileDriven")
    public String lateMileDriven;
    @SerializedName("averageMiles")
    public String averageMiles;
    @SerializedName("idleTime")
    public String idleTime;
    @SerializedName("averageFuelEconomy")
    public String averageFuelEconomy;
    @SerializedName("averageTripDuration")
    public String averageTripDuration;
    @SerializedName("drivingTip")
    public DrivingTip drivingTip;
    @SerializedName("startDate")
    public String startDate;
    @SerializedName("endDate")
    public String endDate;

    public static class ScoreValue {
        @SerializedName("overAllDrivingScore")
        public String overAllDrivingScore;
        @SerializedName("hardBrakeDrivingScore")
        public String hardBrakeDrivingScore;
        @SerializedName("hardAccelerationDrivingScore")
        public String hardAccelerationDrivingScore;
        @SerializedName("speedOverThrshldDrivingScore")
        public String speedOverThrshldDrivingScore;
        @SerializedName("lateMileDrivenDrivingScore")
        public String lateMileDrivenDrivingScore;
        @SerializedName("averageMilesDrivingScore")
        public String averageMilesDrivingScore;
    }

    public static class DrivingTip implements Serializable{

        public static List<Tip> drivingTips;
    }

    public static class Tip implements Serializable{
        @SerializedName("code")
        public String code;
        @SerializedName("description")
        public String description;
    }
}
