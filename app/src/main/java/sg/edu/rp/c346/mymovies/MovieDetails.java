package sg.edu.rp.c346.mymovies;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

/**
 * Created by 16003749 on 23/7/2018.
 */

public class MovieDetails extends AppCompatActivity {
    TextView tvName;
    TextView tvYear;
    TextView tvGenre;
    TextView tvDescription;
    TextView tvDate;
    TextView tvTh;
    ImageView imgMovie;
    RatingBar rt;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.movie_details);
        tvName=findViewById(R.id.textViewName);
        tvDescription=findViewById(R.id.textViewDescription);
        tvGenre=findViewById(R.id.textViewGenre);
        tvYear=findViewById(R.id.textViewYear);
        tvDate=findViewById(R.id.textViewDate);
        tvTh=findViewById(R.id.textViewTh);
        rt = findViewById(R.id.ratingBar);
        imgMovie = findViewById(R.id.imageView);

        Intent intentReceived = getIntent();
        int year = intentReceived.getIntExtra("year",0);
        String name = intentReceived.getStringExtra("name");
        String genre = intentReceived.getStringExtra("genre");
        String description = intentReceived.getStringExtra("description");
        String date = intentReceived.getStringExtra("date");
        String thr = intentReceived.getStringExtra("thr");
        String rate = intentReceived.getStringExtra("rate");
        int stars = intentReceived.getIntExtra("rating",0);

        rt.setNumStars(5);
        rt.setRating(stars);
        rt.setIsIndicator(true);
        tvName.setText(name);
        tvYear.setText(year+"");
        tvGenre.setText(genre);
        tvDescription.setText(description);
        tvDate.setText("Watch On: "+date);
        tvTh.setText("In Theatre: "+thr);
        if(rate.equals("g")){
            imgMovie.setImageResource(R.drawable.rating_g);
        }else if (rate.equals("pg")){
            imgMovie.setImageResource(R.drawable.rating_pg);
        }else if (rate.equals("pg13")){
            imgMovie.setImageResource(R.drawable.rating_pg13);
        }else if (rate.equals("nc16")){
            imgMovie.setImageResource(R.drawable.rating_nc16);
        }else if (rate.equals("m18")){
            imgMovie.setImageResource(R.drawable.rating_m18);
        }else{
            imgMovie.setImageResource(R.drawable.rating_r21);
        }
    }
}
