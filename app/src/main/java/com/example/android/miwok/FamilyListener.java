package com.example.android.miwok;

import android.content.Intent;
import android.view.View;
import android.widget.Toast;

public class FamilyListener implements View.OnClickListener {

    public void onClick(View view) {
        Intent familyIntent = new Intent(view.getContext(), FamilyActivity.class);
        view.getContext().startActivity(familyIntent);
//        Toast.makeText(view.getContext(), "Was geeeeeht", Toast.LENGTH_SHORT).show();
    }
}
