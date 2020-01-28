package android.bignerdranch.locatr;


import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;




/**
 * Created by Александр on 18.01.2018.
 */

public abstract class SingleFragmentActivity extends AppCompatActivity {
    protected abstract Fragment createFragment();
    @LayoutRes
    protected int getLayoutResId() {
        return R.layout.activity_fragment;
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutResId());
        Log.d("FRAG","OnCreate SingleFragmentActivity call");
        FragmentManager fm = getSupportFragmentManager();
        Fragment fragment = fm.findFragmentById(R.id.fragment_container);
            if (fragment == null) {
                fragment = createFragment();
                fm.beginTransaction()
                    .add(R.id.fragment_container, fragment)
                    .commit();
                Log.d("FRAG","Fragment: null; Create fragment call");
        }
    }


}

