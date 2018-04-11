package ahmed.umer.rosca;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Sign_in extends AppCompatActivity {


    Button done;
    EditText pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        done = (Button)findViewById(R.id.GO);
        pass = (EditText)findViewById(R.id.PIN);

        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(pass.getText().length()==0){
                    pass.setError("Please enter your pin");
                }else if (pass.getText().toString().equals(SharedPrefs.getUserPin())){
                    Intent i = new Intent(getApplicationContext(),MainMenu.class);
                    startActivity(i);
                    finish();
                }
                else {
                    Toast.makeText(Sign_in.this, "Wrong pin", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
