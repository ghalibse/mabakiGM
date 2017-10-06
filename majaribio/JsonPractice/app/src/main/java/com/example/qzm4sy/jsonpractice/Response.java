package com.example.qzm4sy.jsonpractice;


import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Response {


    @SerializedName("getVehicleDataServiceQueryResponseType")
    public GetVehicleDataServiceQueryResponseType getVehicleDataServiceQueryResponseType;


    public static class DrivingTip {
        List<Tip> tips;

    }

    public static class Tip {
        @SerializedName("code")
        public String code;
        @SerializedName("description")
        public String description;
    }

    public static class GetVehicleDataServiceQueryResponseType {
        @SerializedName("vehicleDrivingBehaviour")
        public VehicleDrivingBehaviour vehicleDrivingBehaviour;

        public static class VehicleDrivingBehaviour {
            @SerializedName("getDailyVehicleDrivingBehaviorResponse")
            public GetDailyVehicleDrivingBehaviorResponse getDailyVehicleDrivingBehaviorResponse;

            public static class GetDailyVehicleDrivingBehaviorResponse {
                @SerializedName("dailyDrivingBehaviorResults")
                public DailyDrivingBehaviorResults dailyDrivingBehaviorResults;

                public static class DailyDrivingBehaviorResults {
                    @SerializedName("dailyDrivingBehaviorResultsData")
                    public DailyDrivingBehaviorResultsData dailyDrivingBehaviorResultsData;
                    @SerializedName("vin")
                    public String vin;
                    @SerializedName("notificationID")
                    public String notificationID;

                    public static class DailyDrivingBehaviorResultsData {
                        @SerializedName("summaryVehicleDrivingBehavior")
                        public SummaryVehicleDrivingBehavior summaryVehicleDrivingBehavior;
                        @SerializedName("dailyDetailedVehicleDrivingBehavior")
                        public List<DailyDetailedVehicleDrivingBehavior> dailyDetailedVehicleDrivingBehavior;

                        public static class SummaryVehicleDrivingBehavior {
                        }

                        public static class DailyDetailedVehicleDrivingBehavior {
                            @SerializedName("vehicleDrivingBehavior")
                            public VehicleDrivingBehavior vehicleDrivingBehavior;
                            @SerializedName("TripDetail")
                            public TripDetail TripDetail;

                            public static class VehicleDrivingBehavior {
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
                                @SerializedName("startDate")
                                public String startDate;
                                @SerializedName("endDate")
                                public String endDate;

                                public static class ScoreValue {
                                }

                            }

                            public static class TripDetail {
                            }
                        }
                    }
                }
            }
        }
    }
}
