package sg.edu.rp.c346.mymovies;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 16003749 on 23/7/2018.
 */

public class CustomAdapter extends ArrayAdapter {
    Context parent_context;
    int layout_id;
    ArrayList<movieItems> movieList;
    public CustomAdapter(@NonNull Context context, int resource, @NonNull ArrayList<movieItems> objects) {
        super(context, resource, objects);
        parent_context = context;
        layout_id=resource;
        movieList=objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) parent_context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(layout_id, parent, false);
        ImageView imgMovie =rowView.findViewById(R.id.imageView);
        movieItems currentItem = movieList.get(position);
        TextView tvName = rowView.findViewById(R.id.textViewName);
        TextView tvYear = rowView.findViewById(R.id.textViewYear);
        TextView tvGenre = rowView.findViewById(R.id.textViewGenre);
        tvName.setText(currentItem.getTitle());
        tvGenre.setText(currentItem.getGenre());
        tvYear.setText(String.valueOf(currentItem.getYear()));
        if(currentItem.getRate().equals("g")){
            imgMovie.setImageResource(R.drawable.rating_g);
        }else if (currentItem.getRate().equals("pg")){
            imgMovie.setImageResource(R.drawable.rating_pg);
        }else if (currentItem.getRate().equals("pg13")){
            imgMovie.setImageResource(R.drawable.rating_pg13);
        }else if (currentItem.getRate().equals("nc16")){
            imgMovie.setImageResource(R.drawable.rating_nc16);
        }else if (currentItem.getRate().equals("m18")){
            imgMovie.setImageResource(R.drawable.rating_m18);
        }else{
            imgMovie.setImageResource(R.drawable.rating_r21);
        }
        return rowView;

    }
}
