package android.fadeleaf.plannerapp;

import java.util.Date;
import java.util.UUID;

public class Chore {
    private String mTitle;
    private UUID mID;
    private Date mDateCreated;
    private Date mDateNext;
    private boolean mRepeat;
    private int mPriority;
    private int mRating;

    public Chore() { this(UUID.randomUUID()); }
    public Chore(UUID id) {
        mID = id;
        mDateCreated = new Date();
    }
    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public String getDueDate() {
        /*
        TODO: due date will read of the form "this week", "~1 month", "overdue"
         * */

        return mDateNext.toString();
    }


}
