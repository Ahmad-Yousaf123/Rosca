package ahmed.umer.rosca;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class sign_up extends AppCompatActivity {

    Button d;
    EditText name;
    EditText cnic;
    EditText phn;
    EditText pin;
    EditText pin1;
    CheckBox ag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        name = (EditText)findViewById(R.id.ent_name);
        cnic = (EditText)findViewById(R.id.ent_cnic);
        phn = (EditText)findViewById(R.id.ent_phn);
        pin = (EditText)findViewById(R.id.ent_pin);
        pin1 = (EditText)findViewById(R.id.ent_pin1);

        d = (Button)findViewById(R.id.done);
        ag = (CheckBox)findViewById(R.id.agree);

        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),Sign_in.class);
                startActivity(i);
            }
        });

    }
}
