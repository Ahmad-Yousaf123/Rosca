package ahmed.umer.rosca;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class pin_code extends AppCompatActivity {

    Button go_next;
    EditText pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pin_code);
      go_next = (Button)findViewById(R.id.go_to_next_p);
        pass = (EditText)findViewById(R.id.pin);


        go_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(pass.getText().length()==0){
                    pass.setError("Please enter your pin");
                }else if (pass.getText().toString().equals(SharedPrefs.getUserPin())){
                    Intent i = new Intent(getApplicationContext(),agreement.class);
                    startActivity(i);
                }
                else {
                    Toast.makeText(pin_code.this, "Wrong pin", Toast.LENGTH_SHORT).show();
                }

            }
        });


    }
}
