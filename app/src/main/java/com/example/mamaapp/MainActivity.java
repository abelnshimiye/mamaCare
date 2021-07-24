package com.example.mamaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private long backPressedTime;
    private Toast backToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public void cardClicked(View view) {

        switch (view.getId())
        {
            case R.id.pregnancy_week:
                startActivity(new Intent(getApplicationContext(), WeeksActivity.class));
                break;

            case R.id.self_care:
                startActivity(new Intent(getApplicationContext(), SelfCareActivity.class));
                break;

            case R.id.diagnosis:
                startActivity(new Intent(getApplicationContext(), WebDiagnoseModel.class));
                break;

            case R.id.hygiene_during_pre:
                startActivity(new Intent(getApplicationContext(), HygieneActivity.class));
                break;

            case R.id.nutrition:
                startActivity(new Intent(getApplicationContext(), NutritionActivity.class));
                break;
            case R.id.prepare_for_labor:
                startActivity(new Intent(getApplicationContext(), LaborPreparationActivity.class));
                break;
            case R.id.substrances_to_avoid:
                startActivity(new Intent(getApplicationContext(), AvoidancyActivity.class));
                break;

//            case R.id.your_personal_notebook:
//                startActivity(new Intent(getApplicationContext(), NotebookActivity.class));
//                break;

        }

    }


    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }


}