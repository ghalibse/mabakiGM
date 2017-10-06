package com.example.qzm4sy.jsonpractice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GsonBuilder gsonBuilder = new GsonBuilder()
                .registerTypeAdapter(Response.DrivingTip.class, new DrivingTipsDeserializer());

        Gson gson = gsonBuilder.create();

        Response.DrivingTip tiplist = gson.fromJson(JsonString.jsonString, Response.class);


    }


    public class DrivingTipsDeserializer implements JsonDeserializer<Response.DrivingTip>{

        @Override
        public Response.DrivingTip deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context) throws JsonParseException {
            Response.DrivingTip drivingTips = new Response.DrivingTip();
            drivingTips.tips = new ArrayList<>();

            if(jsonElement.isJsonObject()){
                Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
                for (Map.Entry<String, JsonElement> elementEntry : entries) {
                    Response.Tip tip = context.deserialize(elementEntry.getValue(), Response.Tip.class);
                    drivingTips.tips.add(tip);
                }
            }

            return drivingTips;
        }
    }
}
