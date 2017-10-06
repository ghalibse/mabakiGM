package com.example.qzm4sy.serializationdemo;


import com.activeandroid.serializer.TypeSerializer;
import com.activeandroid.util.SQLiteUtils;
import com.google.gson.Gson;

    public class CustomSerializer extends TypeSerializer {


    Gson gson = new Gson();

    @Override
    public Class<?> getDeserializedType() {
        return MyPojo.class;
    }

    @Override
    public SQLiteUtils.SQLiteType getSerializedType() {
        return SQLiteUtils.SQLiteType.TEXT;
    }

    @Override
    public Object serialize(Object o) {
        return gson.toJson(o);
    }

    @Override
    public Object deserialize(Object o) {
        return gson.fromJson(o.toString(), MyPojo.class);
    }
}
