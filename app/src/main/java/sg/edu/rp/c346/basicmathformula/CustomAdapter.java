package sg.edu.rp.c346.basicmathformula;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by 16019641 on 16/7/2018.
 */

public class CustomAdapter extends ArrayAdapter {
    Context parent_context;
    int layout_id;
    ArrayList<MathItem> itemList;

    public CustomAdapter(@NonNull Context context, int resource, @NonNull ArrayList<MathItem> objects) {
        super(context, resource, objects);

        parent_context = context;
        layout_id = resource;
        itemList = objects;
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {


        LayoutInflater inflater =(LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(layout_id,parent,false);


        TextView tvArea =rowView.findViewById(R.id.textViewArea);
        TextView tvVolume =rowView.findViewById(R.id.textViewVolume);




        //return movieitem object
        MathItem currentItem = itemList.get(position);


        //string value
        String area = currentItem.getArea();

       String volume = currentItem.getVolume();

        tvArea.setText(area );
        tvVolume.setText(volume);










        return rowView;

    }

}


