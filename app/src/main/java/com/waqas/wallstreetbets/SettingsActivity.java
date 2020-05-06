package com.waqas.wallstreetbets;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.preference.Preference;
import androidx.preference.PreferenceFragmentCompat;
import androidx.preference.PreferenceManager;
import androidx.preference.SwitchPreference;

public class SettingsActivity extends AppCompatActivity {

    int position;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings_activity);
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.settings, new SettingsFragment())
                .commit();
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
    }

    public static class SettingsFragment extends PreferenceFragmentCompat {
        @Override
        public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
            setPreferencesFromResource(R.xml.root_preferences, rootKey);

            SwitchPreference switchLB = getPreferenceManager().findPreference("themeColor");
            switchLB.setSummaryOn("Dark Mode");
            switchLB.setSummaryOff("Light Mode");
            switchLB.setOnPreferenceChangeListener(new Preference.OnPreferenceChangeListener() {
                @Override
                public boolean onPreferenceChange(Preference preference, Object newValue) {
                    SharedPreferences sharedpref = getContext().getSharedPreferences("sharedPref", MODE_PRIVATE);
                    SharedPreferences.Editor editor = sharedpref.edit();
                    editor.putBoolean("Switch", true);
                    Toast.makeText(getContext(), "This is one now", Toast.LENGTH_SHORT).show();
                    return true;
                }
            });

            Preference logout = getPreferenceManager().findPreference("logout");
            logout.setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() {
                @Override
                public boolean onPreferenceClick(Preference preference) {
                    Intent intent = new Intent(getActivity(), LoginActivity.class);
                    startActivity(intent);
                    getActivity().finishAffinity();
                    return true;
                }
            });
        }
    }

    public void saveData(){

    }
}