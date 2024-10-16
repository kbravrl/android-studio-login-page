package com.example.loginpageinandroidstudio;


import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.example.loginpageinandroidstudio.databinding.ActivityMainBinding;
import com.google.android.material.snackbar.Snackbar;


public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());

        setContentView(binding.getRoot());

        binding.loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(binding.username.getText().toString().equals("user") && binding.password.getText().toString().equals("1234")){
                    Snackbar.make(view, "Login Succesfully", Snackbar.LENGTH_SHORT).show();
                } else {
                    Snackbar.make(view, "Login Failed", Snackbar.LENGTH_SHORT).show();
                }


            }
        });
    }
}
