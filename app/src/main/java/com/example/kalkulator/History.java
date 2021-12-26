//package com.example.kalkulator;
//
//import androidx.appcompat.app.AppCompatActivity;
//
//import android.content.SharedPreferences;
//import android.os.Bundle;
//import android.view.View;
//import android.widget.EditText;
//import android.widget.RadioButton;
//import android.widget.TextView;
//
//import com.google.gson.Gson;
//import com.google.gson.reflect.TypeToken;
//
//import java.util.ArrayList;
//
//public class History extends AppCompatActivity {
//
//    SharedPreferences pref;
//    Gson gson;
//    ArrayList<Notes> notesList;
//    EditText txt1,txt2;
//    TextView hasil;
//    RadioButton tambah,kali,bagi,kurang;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_history);
//
//        txt1 = findViewById(R.id.text1);
//        txt2 = findViewById(R.id.text2);
//        tambah = findViewById(R.id.tambah);
//        kali = findViewById(R.id.kali);
//        kurang = findViewById(R.id.kurang);
//        bagi = findViewById(R.id.bagi);
//        hasil = findViewById(R.id.hasil);
//    }
//
//    public void Kalkulasikan(View v){
//        String strListNotes = pref.getString(getString(R.string.notes_key), "[]");
//        notesList = gson.fromJson(strListNotes, new TypeToken<ArrayList<Notes>>(){}.getType());
//        if (notesList == null) notesList = new ArrayList<>();
//
//        notesList.add(new Notes(txt1.getText().toString(), txt2.getText().toString(), tambah.getText().toString(),kali.getText().toString(),kurang.getText().toString(),bagi.getText().toString(),hasil.getText().toString()));
//
//        strListNotes = gson.toJson(notesList);
//        pref.edit().putString(getString(R.string.notes_key), strListNotes).apply();
//
//        finish();
//    };
//}