package ahmed.umer.rosca;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class agreement extends AppCompatActivity {
    TextView amount,code;
    Button send;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agreement);
        send = (Button) findViewById(R.id.send_it);
        amount = (TextView) findViewById(R.id.textView17);
        code=(TextView)findViewById(R.id.textView18);
        code.setText(send_money.cCode);
        amount.setText(send_money.amount+"");



        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), MainMenu.class);
                startActivity(i);
            }
        });


    }
}
