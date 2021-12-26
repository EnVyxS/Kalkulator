//package com.example.kalkulator;
//
//import android.content.Context;
//import android.content.SharedPreferences;
//import android.preference.PreferenceManager;
//
//import com.google.gson.Gson;
//import com.google.gson.reflect.TypeToken;
//
//import java.lang.reflect.Type;
//import java.util.ArrayList;
//import java.util.List;
//
//public class Prefconfig {
//    private static final String LIST_KEY = "list_key";
//
//    public static void writeListInPref(Context context, List<TaskModel> list){
//        Gson gson =new Gson();
//        String jsonstring = gson.toJson(list);
//
//        SharedPreferences pref = PreferenceManager.getDefaultSharedPreferences(context);
//        SharedPreferences.Editor editor = pref.edit();
//        editor.putString(LIST_KEY, jsonstring);
//        editor.apply();
//    }
//    public static List<TaskModel> readListFromPref(Context context){
//        SharedPreferences pref = PreferenceManager.getDefaultSharedPreferences(context);
//        String jsonString = pref.getString(LIST_KEY,"");
//
//        Type type = new TypeToken<ArrayList<TaskModel>>() {}.getType();
//        Gson gson = new Gson();
//        List<TaskModel> list = gson.fromJson(jsonString, type);
//
//        return list;
//    }
//}
