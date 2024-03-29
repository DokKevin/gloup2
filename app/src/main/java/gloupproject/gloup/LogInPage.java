package gloupproject.gloup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LogInPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in_page);
    }

    public void login(View view){
        Intent intent = new Intent(this, HomePage.class);
        startActivity(intent);
    }

    public void signUp(View view){
        Intent intent = new Intent(this, SignUpPage.class);
        startActivity(intent);
    }
}
