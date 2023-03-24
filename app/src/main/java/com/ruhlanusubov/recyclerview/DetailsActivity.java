package com.ruhlanusubov.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.renderscript.ScriptGroup;
import android.view.View;

import com.ruhlanusubov.recyclerview.databinding.ActivityDetailsAcitivityBinding;

public class DetailsActivity extends AppCompatActivity {

    private ActivityDetailsAcitivityBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailsAcitivityBinding.inflate(getLayoutInflater());
        //inflate-xml &code ->supply connection between them
        View view = binding.getRoot();
        setContentView(view);


       Intent intent=getIntent();
       //Casting->convertor

       //landmark selectedlandmark=(landmark) intent.getSerializableExtra("landmark");

        Singleton singleton=Singleton.getInstance();
        landmark selectedlandmark=singleton.getSentlandmark();
       binding.nameText.setText(selectedlandmark.name);
       binding.countryText.setText(selectedlandmark.country);
       binding.imageView.setImageResource(selectedlandmark.image);











    }
}