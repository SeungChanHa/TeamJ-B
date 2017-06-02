package com.example.skill.call;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public void calling(View view){
        Intent intent=new Intent(Intent.ACTION_CALL);
        intent.setData(Uri.parse("tel:01012345678"));
        try {
        startActivity(intent);
        } catch (Exception e) {
        e.printStackTrace();
        }
        }






