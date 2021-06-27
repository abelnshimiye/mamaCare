package com.example.mamaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;



public class DiagnosisActivity extends AppCompatActivity {

//    CheckBox fever,headache, diarhea, fatigue,nausea_vomiting, muscle_pain, chills, abdominal_pain,blu_vision;
//    CheckBox swollen,dif_urinating, pain_ribs,heartburn,rapid_heartbeat,vaginal_bleeding,abdominal_cramps,back_pain,clotted_vaginal,pain_right_abdominal;

    Button diagnosis;
//    ArrayList selchkboxlist;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diagnosis);

        // initiate views

//        fever = findViewById(R.id.chek_fever);
//        headache = findViewById(R.id.chek_headache);
//        diarhea = findViewById(R.id.chek_diarhea);
//        fatigue = findViewById(R.id.chek_fatigue);
//        nausea_vomiting = findViewById(R.id.chek_vomiting);
//        muscle_pain = findViewById(R.id.chek_muscle_pain);
//        chills = findViewById(R.id.chek_chills);
//        abdominal_pain = findViewById(R.id.chek_abdominal_pain);
//        blu_vision = findViewById(R.id.chek_vision);
//        swollen = findViewById(R.id.chek_swollen_face);
//        dif_urinating = findViewById(R.id.chek_urinating);
//        pain_ribs = findViewById(R.id.chek_pain_below_ribs);
//        heartburn = findViewById(R.id.chek_heartburn);
//        rapid_heartbeat = findViewById(R.id.chek_rapid_heartbeat);
//        vaginal_bleeding = findViewById(R.id.chek_vaginal_bleeding);
//        abdominal_cramps = findViewById(R.id.chek_abdominal_cramps);
//        back_pain = findViewById(R.id.chek_back_pain);
//        clotted_vaginal= findViewById(R.id.chek_clotted_discharge_vaginal);
//        pain_right_abdominal= findViewById(R.id.chek_pain_right_side_abdominal);

            diagnosis = findViewById(R.id.btn_diagnosis);

            diagnosis.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new  Intent(DiagnosisActivity.this, DiagnosisResult.class);

                    startActivity(intent);
                }
            });








    }


    public void onCheckboxClicked(View view){

        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked
        switch(view.getId()) {
            case R.id.chek_fever:
                if (checked) {
 //                   selchkboxlist.add("fever");
                    Toast.makeText(getApplicationContext(), "fever", Toast.LENGTH_LONG).show();
                }else {
 //                   selchkboxlist.remove("fever");
                    Toast.makeText(getApplicationContext(), "", Toast.LENGTH_LONG).show();
                }
                break;

            case R.id.chek_headache:
                if (checked) {
//                    selchkboxlist.add("severe headache");
                    Toast.makeText(getApplicationContext(), "severe headache", Toast.LENGTH_LONG).show();
                }else {
//                    selchkboxlist.remove("severe headache");
                    Toast.makeText(getApplicationContext(), "", Toast.LENGTH_LONG).show();
                }
                break;
            case R.id.chek_diarhea:
                if (checked) {
//                    selchkboxlist.add("diarhea");
                    Toast.makeText(getApplicationContext(), "diarhea", Toast.LENGTH_LONG).show();
                }else {
//                    selchkboxlist.remove("diarhea");
                    Toast.makeText(getApplicationContext(), "", Toast.LENGTH_LONG).show();
                }
                break;
            case R.id.chek_fatigue:
                if (checked) {
//                    selchkboxlist.add("fatigue");
                    Toast.makeText(getApplicationContext(), "fatigue", Toast.LENGTH_LONG).show();
                }else {
//                    selchkboxlist.remove("fatigue");
                    Toast.makeText(getApplicationContext(), "", Toast.LENGTH_LONG).show();
                }
                break;

            case R.id.chek_vomiting:
                if (checked) {
//                    selchkboxlist.add("nausea and vomiting");
                    Toast.makeText(getApplicationContext(), "nausea and vomiting", Toast.LENGTH_LONG).show();
                }else {
//                    selchkboxlist.remove("nausea and vomiting");
                    Toast.makeText(getApplicationContext(), "", Toast.LENGTH_LONG).show();
                }
                break;

            case R.id.chek_muscle_pain:
                if (checked) {
//                    selchkboxlist.add("muscle pain");
                    Toast.makeText(getApplicationContext(), "muscle pain", Toast.LENGTH_LONG).show();
                }else {
//                    selchkboxlist.remove("muscle pain");
                    Toast.makeText(getApplicationContext(), "", Toast.LENGTH_LONG).show();
                }
                break;

            case R.id.chek_chills:
                if (checked) {
//                    selchkboxlist.add("chills");
                    Toast.makeText(getApplicationContext(), "chills", Toast.LENGTH_LONG).show();
                }else {
//                    selchkboxlist.remove("chills");
                    Toast.makeText(getApplicationContext(), "", Toast.LENGTH_LONG).show();
                }
                break;

            case R.id.chek_abdominal_pain:
                if (checked) {
//                    selchkboxlist.add("abdominal pain");
                    Toast.makeText(getApplicationContext(), "abdominal pain", Toast.LENGTH_LONG).show();
                }else {
//                    selchkboxlist.remove("abdominal pain");
                    Toast.makeText(getApplicationContext(), "", Toast.LENGTH_LONG).show();
                }
                break;

            case R.id.chek_vision:
                if (checked) {
//                    selchkboxlist.add("blurred_vision");
                    Toast.makeText(getApplicationContext(), "blurred_vision", Toast.LENGTH_LONG).show();
                }else {
//                    selchkboxlist.remove("blurred_vision");
                    Toast.makeText(getApplicationContext(), "", Toast.LENGTH_LONG).show();
                }
                break;
            case R.id.chek_swollen_face:
                if (checked) {
//                    selchkboxlist.add("swollen feet hands and face");
                    Toast.makeText(getApplicationContext(), "swollen feet hands and face", Toast.LENGTH_LONG).show();
                }else {
//                    selchkboxlist.remove("swollen feet hands and face");
                    Toast.makeText(getApplicationContext(), "", Toast.LENGTH_LONG).show();
                }
                break;
            case R.id.chek_urinating:
                if (checked) {
//                    selchkboxlist.add("difficulty urinating");
                    Toast.makeText(getApplicationContext(), "difficulty urinating", Toast.LENGTH_LONG).show();
                }else {
//                    selchkboxlist.remove("difficulty urinating");
                    Toast.makeText(getApplicationContext(), "", Toast.LENGTH_LONG).show();
                }
                break;
            case R.id.chek_pain_below_ribs:
                if (checked) {
//                    selchkboxlist.add("pain below the ribs");
                    Toast.makeText(getApplicationContext(), "pain below the ribs", Toast.LENGTH_LONG).show();
                }else {
//                    selchkboxlist.remove("pain below the ribs");
                    Toast.makeText(getApplicationContext(), "", Toast.LENGTH_LONG).show();
                }
                break;

            case R.id.chek_heartburn:
                if (checked) {
//                    selchkboxlist.add("heartburn");
                    Toast.makeText(getApplicationContext(), "heartburn", Toast.LENGTH_LONG).show();
                }else {
//                    selchkboxlist.remove("heartburn");
                    Toast.makeText(getApplicationContext(), "", Toast.LENGTH_LONG).show();
                }
                break;
            case R.id.chek_rapid_heartbeat:
                if (checked) {
//                    selchkboxlist.add("rapid heartbeat");
                    Toast.makeText(getApplicationContext(), "rapid heartbeat", Toast.LENGTH_LONG).show();
                }else {
//                    selchkboxlist.remove("rapid heartbeat");
                    Toast.makeText(getApplicationContext(), "", Toast.LENGTH_LONG).show();
                }
                break;

            case R.id.chek_vaginal_bleeding:
                if (checked) {
//                    selchkboxlist.add("vaginal bleeding at 20 weeks");
                    Toast.makeText(getApplicationContext(), "vaginal bleeding at 20 weeks", Toast.LENGTH_LONG).show();
                }else {
//                    selchkboxlist.remove("vaginal bleeding at 20 weeks");
                    Toast.makeText(getApplicationContext(), "", Toast.LENGTH_LONG).show();
                }
                break;

            case R.id.chek_abdominal_cramps:
                if (checked) {
//                    selchkboxlist.add("abdominal cramps");
                    Toast.makeText(getApplicationContext(), "abdominal cramps", Toast.LENGTH_LONG).show();
                }else {
//                    selchkboxlist.remove("abdominal cramps");
                    Toast.makeText(getApplicationContext(), "", Toast.LENGTH_LONG).show();
                }
                break;

            case R.id.chek_back_pain:
                if (checked) {
//                    selchkboxlist.add("back pain");
                    Toast.makeText(getApplicationContext(), "back pain", Toast.LENGTH_LONG).show();
                }else {
//                    selchkboxlist.remove("back pain");
                    Toast.makeText(getApplicationContext(), "", Toast.LENGTH_LONG).show();
                }
                break;


            case R.id.chek_clotted_discharge_vaginal:
                if (checked) {
//                    selchkboxlist.add("clotted discharge from the vaginal");
                    Toast.makeText(getApplicationContext(), "clotted discharge from the vaginal", Toast.LENGTH_LONG).show();
                }else {
//                    selchkboxlist.remove("clotted discharge from the vaginal");
                    Toast.makeText(getApplicationContext(), "", Toast.LENGTH_LONG).show();
                }
                break;

            case R.id.chek_pain_right_side_abdominal:
                if (checked) {
//                    selchkboxlist.add("pain on the right side of the abdominal");
                    Toast.makeText(getApplicationContext(), "pain on the right side of the abdominal", Toast.LENGTH_LONG).show();
                }else {
//                    selchkboxlist.remove("pain on the right side of the abdominal");
                    Toast.makeText(getApplicationContext(), "", Toast.LENGTH_LONG).show();
                }
                break;
        }

    }


}