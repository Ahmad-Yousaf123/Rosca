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
                if(name.getText().length()==0){
                    name.setError("Please Enter your name");
                }else if(cnic.getText().length()==0){
                    cnic.setError("Please enter your cnic");
                }
                else if(phn.getText().length()==0){
                    phn.setError("Please enter your phone number");
                }else if(pin.getText().length()==0){
                    pin.setError("Please choose a pin");
                }else if(pin1.getText().length()==0){
                    pin1.setError("Please re-enter your pin");
                }
                else if(!pin.getText().toString().equals(pin1.getText().toString())){
                    pin1.setError("The pin do not match");
                }else {
                    SharedPrefs.setUserPin(pin.getText().toString());
                    Intent i = new Intent(getApplicationContext(), Sign_in.class);
                    startActivity(i);
                    finish();
                }
            }
        });

    }
}
