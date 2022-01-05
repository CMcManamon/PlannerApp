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

    public Chore(String title, Date dateNext, boolean repeat, int priority, int rating) {
        this(UUID.randomUUID());
        mTitle = title;
        mDateNext = dateNext;
        mRepeat = repeat;
        mPriority = priority;
        mRating = rating;
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
