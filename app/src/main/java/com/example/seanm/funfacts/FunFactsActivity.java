package com.example.seanm.funfacts;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class FunFactsActivity extends AppCompatActivity {
    public static final String TAG = FunFactsActivity.class.getSimpleName();
    private FactBook mFactBook = new FactBook();
    private ColorWheel mColorWheel = new ColorWheel();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        //Declare our view variables and assign views
        final TextView factLabel = (TextView) findViewById(R.id.funFact);
        final Button showFactButton = (Button) findViewById(R.id.funFactButton);
        final RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
                    public void onClick(View view) {
                        String fact = mFactBook.getFact();
                        factLabel.setText(fact);

                        int color = mColorWheel.getColor();
                        relativeLayout.setBackgroundColor(color);
                        showFactButton.setTextColor(color);
            }
        };
        showFactButton.setOnClickListener(listener);
        //Toast.makeText(this, "Welcome!", Toast.LENGTH_LONG).show();
        Log.d("FunFactsActivity", "Logging from main class!");
    }
}
