package com.zenai.submissiondicoding;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ContentActivity extends AppCompatActivity {

    private String name,detail,explanation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content);

        TextView nameText = findViewById(R.id.tv_name);
        TextView detailText = findViewById(R.id.tv_detail);
        TextView explanationText = findViewById(R.id.tv_explanation);

        Bundle bundle = getIntent().getExtras();
        name = bundle.getString("NAME_KEY");
        detail = bundle.getString("DETAIL_KEY");
        explanation = bundle.getString("EXPLANATION_KEY");

        nameText.setText(name);
        detailText.setText(detail);
        explanationText.setText(explanation);
    }
}
