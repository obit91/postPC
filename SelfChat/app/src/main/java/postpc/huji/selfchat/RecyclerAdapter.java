package postpc.huji.selfchat;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by User on 4/16/2018.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder>{
    private ArrayList<Message> mDataSource;

    public RecyclerAdapter(ArrayList<Message> dataSources) {
        mDataSource = dataSources;
    }

    @Override
    public int getItemCount() {
        return mDataSource.size();
    }

    @Override
    public RecyclerAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // create a new view
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.ri_msg, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        // get our custom object from our dataset at this position
        final Message msg = mDataSource.get(position);

        // Bind our views with our data!
        holder.name.setText(msg.getName());
        holder.msg.setText(msg.getText());

    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView name, msg;

        public ViewHolder(View view) {
            super(view);
            name = view.findViewById(R.id.ri_name);
            msg = view.findViewById(R.id.ri_text);
        }
    }
}