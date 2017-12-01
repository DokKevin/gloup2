package gloupproject.gloup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SignUpPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_page);
    }

    public void signIn(View view){
        Intent intent = new Intent(this, LogInPage.class);
        startActivity(intent);
    }

    public void submit(View view){
        Intent intent = new Intent(this, HomePage.class);
        startActivity(intent);
    }
}
