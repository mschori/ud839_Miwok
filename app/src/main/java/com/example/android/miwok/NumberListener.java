package com.example.android.miwok;

import android.view.View;
import android.widget.Toast;

public class NumberListener implements View.OnClickListener {

    public void onClick(View view) {

        Toast.makeText(view.getContext(), "Hellölele.", Toast.LENGTH_SHORT).show();
    }

}
