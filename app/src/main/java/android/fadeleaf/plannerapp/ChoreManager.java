package android.fadeleaf.plannerapp;

import android.content.Context;

public class ChoreManager {
    private static ChoreManager sChoreManager;
    private Context mContext;
    // private SQLiteDatabase mDatabase;

    private ChoreManager(Context context) {
        mContext = context.getApplicationContext();
        // TODO: get a reference to database
    }

    public static ChoreManager get(Context context) {
        if (sChoreManager == null)
            sChoreManager = new ChoreManager(context);
        return sChoreManager;
    }
}
