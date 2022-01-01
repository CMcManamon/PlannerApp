package android.fadeleaf.plannerapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

public class ChoreListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new ChoreListFragment();
    }

}