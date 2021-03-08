package com.example.login;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;


public class HomeActivity extends AppCompatActivity {

    private BottomNavigationView bottomNavigationView;

    // define your fragments here
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        bottomNavigationView = findViewById(R.id.nav_view);
        bottomNavigationView.setOnNavigationItemSelectedListener(bottomNavigationListener);
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment, new HomeFragment()).commit();
    }

    // handle navigation selection
    private BottomNavigationView.OnNavigationItemSelectedListener bottomNavigationListener = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
            Fragment selectedFragment = null;
            switch(menuItem.getItemId()){
                case R.id.navigation_home:
                    selectedFragment = new HomeFragment();
                    break;
                case R.id.view:
                    selectedFragment = new ViewFragment();
                    break;
                case R.id.watch:
                    selectedFragment = new WatchFragment();
                    break;
                case R.id.profile:
                    selectedFragment = new ProfileFragment();
                    break;
            }

            // Set default selection
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment, selectedFragment).commit();
            return true;
        }
    };

}
