package ahmed.umer.rosca;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class members extends AppCompatActivity {

    Button send_code;
    CheckBox zohaib;
    CheckBox akram;
    CheckBox ismail;
    CheckBox irshad;
    CheckBox ahme;
    CheckBox ali;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_members);
        zohaib = (CheckBox)findViewById(R.id.zoh);
        akram = (CheckBox)findViewById(R.id.akr);
        ismail = (CheckBox)findViewById(R.id.isml);
        irshad = (CheckBox)findViewById(R.id.irsh);
        ahme = (CheckBox)findViewById(R.id.ahm);
        ali = (CheckBox) findViewById(R.id.al);

        send_code = (Button)findViewById(R.id.se_co);

        send_code.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),turns.class);
                startActivity(i);
            }
        });


    }
}
