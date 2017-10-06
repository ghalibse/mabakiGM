package com.example.qzm4sy.daggerapp.data;


import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class Deserialiser implements JsonDeserializer<List<Response.Tip>> {

    @Override
    public List<Response.Tip> deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context) throws JsonParseException {

        Response.DrivingTip drivingTips = new Response.DrivingTip();

        Response.DrivingTip.drivingTips = new ArrayList<Response.Tip>();

        if(jsonElement.isJsonObject()){
            Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
            for (Map.Entry<String, JsonElement> elementEntry : entries) {
                Response.Tip tip = context.deserialize(elementEntry.getValue(), Response.Tip.class);
                Response.DrivingTip.drivingTips.add(tip);
            }
        }

        return Response.DrivingTip.drivingTips;
    }
}
