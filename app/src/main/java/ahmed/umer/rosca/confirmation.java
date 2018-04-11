package ahmed.umer.rosca;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class confirmation extends AppCompatActivity {

    EditText mount;
    EditText peop;
    EditText montly;
    Button kay;
    Button canc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmation);
        mount = (EditText)findViewById(R.id.amount);
        peop = (EditText)findViewById(R.id.people);
        montly = (EditText)findViewById(R.id.monthly);
        kay = (Button)findViewById(R.id.ok);
        canc = (Button)findViewById(R.id.no);

        kay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),members.class);
                startActivity(i);
            }
        });
        canc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),activity_create_comm.class);
                startActivity(i);
            }
        });


    }
}
