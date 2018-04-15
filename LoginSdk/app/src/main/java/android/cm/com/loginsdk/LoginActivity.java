package android.cm.com.loginsdk;

import android.content.ComponentName;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private final String Tag = this.getClass().getSimpleName();
    SharedPreferences share;
    Button btnLogin;
    private String className;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        className = getIntent().getStringExtra("extraIntent");
        if (className != null) {
            ((TextView) findViewById(R.id.text)).setText(" 跳转界面：" + className);
        }


        btnLogin = findViewById(R.id.login);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                share = LoginActivity.this.getSharedPreferences("david", MODE_PRIVATE);
                Log.d("INFO", share.getBoolean("login", false) + "--start");
                SharedPreferences.Editor editor = share.edit();
                editor.putBoolean("login", true);
                editor.commit();

                if (share.getBoolean("login", false)) {
                    btnLogin.setText(R.string.loginSuccess);
                    if (className != null) {
                        ComponentName componentName = new ComponentName(LoginActivity.this, className);
                        Intent intent = new Intent();
                        intent.setComponent(componentName);
                        startActivity(intent);
                        finish();
                    }
                } else {
                    btnLogin.setText(R.string.loginFailed);
                }
            }
        });

    }

    @Override
    protected void onResume() {
        super.onResume();


    }
}

