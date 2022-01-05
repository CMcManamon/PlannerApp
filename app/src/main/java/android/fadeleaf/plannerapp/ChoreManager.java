package android.fadeleaf.plannerapp;

import android.content.Context;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ChoreManager {
    private static ChoreManager sChoreManager;
    private Context mContext;
    private List<Chore> mChores;
    // private SQLiteDatabase mDatabase;

    private ChoreManager(Context context) {
        mContext = context.getApplicationContext();

        mChores = new ArrayList<Chore>();
        mChores.add(new Chore("Vacuum carpet", new Date(), true, 2, 4));
        mChores.add(new Chore("Wash dog", new Date(), true, 5, 1));
        mChores.add(new Chore("Mow lawn", new Date(), true, 3, 6));
        mChores.add(new Chore("Wash car", new Date(), true, 1, 5));
        mChores.add(new Chore("Schedule water heater maintenance", new Date(), true, 2, 10));
        // TODO: get a reference to database
    }

    public static ChoreManager get(Context context) {
        if (sChoreManager == null)
            sChoreManager = new ChoreManager(context);
        return sChoreManager;
    }

    public List<Chore> getChores() {
        return mChores;
    }

}
