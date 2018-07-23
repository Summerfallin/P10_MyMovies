package sg.edu.rp.c346.mymovies;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvMovie;
    CustomAdapter caMovie;
    ArrayList<movieItems> alMovie;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvMovie=findViewById(R.id.listViewMovie);
        alMovie = new ArrayList<>();
        final movieItems movie1 = new movieItems("The Avengers",2012,"pg13","Action | Sci-Fi","15/11/2014","Golden Village - Bishan","Nick Fury of S.H.I.E.L.D. assembles a team of superheroes to save the planet from Loki and his army.",4);
        movieItems movie2 = new movieItems("Planes",2013,"pg","Animation | Comedy","15/5/2015","Cathay-AMK Hub","A crop-dusting plane with a fear of heights lives his dream of competing in a famous around-the-world aerial race.",2);
        alMovie.add(movie1);
        alMovie.add(movie2);
        caMovie=new CustomAdapter(this,R.layout.movie_items,alMovie);
        lvMovie.setAdapter(caMovie);
        lvMovie.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                movieItems currentItem = alMovie.get(i);
                Intent intent = new Intent(getBaseContext(),MovieDetails.class);

                intent.putExtra("name",currentItem.getTitle());
                intent.putExtra("year",currentItem.getYear());
                intent.putExtra("date",currentItem.getDate());
                intent.putExtra("description",currentItem.getDescription());
                intent.putExtra("genre",currentItem.getGenre());
                intent.putExtra("thr",currentItem.getTheatre());
                intent.putExtra("rating",currentItem.getRating());
                intent.putExtra("rate",currentItem.getRate());
                startActivity(intent);

            }
        });


    }
}
