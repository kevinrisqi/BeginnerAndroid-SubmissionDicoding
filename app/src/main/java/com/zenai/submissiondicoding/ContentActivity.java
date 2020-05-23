package com.zenai.submissiondicoding;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.google.android.material.appbar.CollapsingToolbarLayout;

public class ContentActivity extends AppCompatActivity {

    private String name, category, rating, detail, explanation;
    private int photo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content);

        getSupportActionBar().hide();

        TextView nameText = findViewById(R.id.tv_name);
        TextView categoryText = findViewById(R.id.tv_category);
        TextView ratingText = findViewById(R.id.tv_rating);
        TextView detailText = findViewById(R.id.tv_detail);
        TextView explanationText = findViewById(R.id.tv_explanation);
        ImageView photoImg = findViewById(R.id.iv_photo);
        CollapsingToolbarLayout collapsingToolbarLayout = findViewById(R.id.collapsing_toolbar);

        collapsingToolbarLayout.setEnabled(true);

        Bundle bundle = getIntent().getExtras();
        name = bundle.getString("NAME_KEY");
        category = bundle.getString("CATEGORY_KEY");
        rating = bundle.getString("RATING_KEY");
        detail = bundle.getString("DETAIL_KEY");
        explanation = bundle.getString("EXPLANATION_KEY");
        photo = bundle.getInt("PHOTO_KEY");

        nameText.setText(name);
        categoryText.setText(category);
        ratingText.setText(rating);
        detailText.setText(detail);
        explanationText.setText(explanation);

        // Set photo with glide
        Glide.with(this).load(photo).into(photoImg);

        // Set CollapsingToolbarLayout
        collapsingToolbarLayout.setTitle(name);
    }
}
