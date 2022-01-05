package android.fadeleaf.plannerapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ChoreListFragment extends Fragment {
    private RecyclerView mChoreRecyclerView;
    private ChoreAdapter mAdapter;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_chore_list, container, false);
        mChoreRecyclerView = view.findViewById(R.id.chore_recycler_view);
        mChoreRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        updateUI();

        return view;
    }

    public void updateUI() {
        ChoreManager choreManager = ChoreManager.get(getActivity());
        List<Chore> chores = choreManager.getChores();
        if(mAdapter == null) {
            mAdapter = new ChoreAdapter(chores);
            mChoreRecyclerView.setAdapter(mAdapter);
        }
    }

    private class ChoreHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView mTitleTextView;
        TextView mDateTextView;
        private Chore mChore;

        public ChoreHolder(LayoutInflater inflater, ViewGroup parent) {
            super(inflater.inflate(R.layout.list_item_chore, parent, false));
            mTitleTextView = (TextView)itemView.findViewById(R.id.chore_title);
            mDateTextView = (TextView)itemView.findViewById(R.id.chore_due_date);
            itemView.setOnClickListener(this);
        }

        public void bind(Chore chore) {
            mChore = chore;
            mTitleTextView.setText(mChore.getTitle());
            mDateTextView.setText(mChore.getDueDate());
        }

        @Override
        public void onClick(View v) {

        }
    }

    private class ChoreAdapter extends RecyclerView.Adapter<ChoreHolder> {
        private List<Chore> mChores;

        public ChoreAdapter(List<Chore> chores) { mChores = chores; }
        @NonNull
        @Override
        public ChoreHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            LayoutInflater layoutInflater = LayoutInflater.from(getActivity());
            return new ChoreHolder(layoutInflater, parent);
        }

        @Override
        public void onBindViewHolder(@NonNull ChoreHolder holder, int position) {
            Chore chore = mChores.get(position);
            holder.bind(chore);
        }

        @Override
        public int getItemCount() {
            return mChores.size();
        }
    }
}
