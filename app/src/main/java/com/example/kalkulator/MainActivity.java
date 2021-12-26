package com.example.kalkulator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import org.json.JSONObject;
import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


//    SharedPreferences pref;
//    Gson gson;
//    ArrayList<Notes> notesList;
//    EditText txt1, txt2;
//    TextView Hasil;
//    RadioButton tambah, kali, bagi, kurang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        gson = new GsonBuilder().create();

    }

    public void KalkulasiButton(View view) {
        EditText Bilanganpertama = (EditText) findViewById(R.id.text1);
        EditText Bilangankedua = (EditText) findViewById(R.id.text2);

        int bilpertama = Integer.parseInt(Bilanganpertama.getText().toString());
        int bilkedua = Integer.parseInt(Bilangankedua.getText().toString());

        RadioButton Tambah = findViewById(R.id.tambah);
        RadioButton Kurang = findViewById(R.id.kurang);
        RadioButton Kali = findViewById(R.id.kali);
        RadioButton Bagi = findViewById(R.id.bagi);

        int hasil = 0;

        if (Tambah.isChecked()) {
            hasil = bilpertama + bilkedua;
        } else if (Kurang.isChecked()) {
            hasil = bilpertama - bilkedua;
        } else if (Kali.isChecked()) {
            hasil = bilpertama * bilkedua;
        } else if (Bagi.isChecked()) {
            hasil = bilpertama / bilkedua;
        }

        TextView HasilTextView = findViewById(R.id.hasil);
        HasilTextView.setText("Hasil:" + hasil);


//        String strListNotes = pref.getString(getString(R.string.notes_key), "[]");
//        notesList = gson.fromJson(strListNotes, new TypeToken<ArrayList<Notes>>() {
//        }.getType());
//        if (notesList == null) notesList = new ArrayList<>();
//
//        notesList.add(new Notes(txt1.getText().toString(), txt2.getText().toString(), tambah.getText().toString(), kali.getText().toString(), kurang.getText().toString(), bagi.getText().toString(), Hasil.getText().toString()));
//
//        strListNotes = gson.toJson(notesList);
//        pref.edit().putString(getString(R.string.notes_key), strListNotes).apply();
//
//        finish();
//    }

//    @Override
//    protected void onResume() {
//        super.onResume();
//
//        String strListNotes = pref.getString(getString(R.string.notes_key),"[]");
//        notesList = gson.fromJson(strListNotes, new TypeToken<ArrayList<Notes>>(){}.getType());
//
//        String contentText ="";
//
//        for(Notes notes : notesList){
//            contentText += notes.toString();
//        }
//
//        txt1.setText(contentText);
//    }
    }
}