package ahmed.umer.rosca;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class send_money extends AppCompatActivity {

    Button go;
    public static String amount,cCode;
    EditText amnt,code,name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_money);
        go = (Button)findViewById(R.id.go_next);
        amnt=(EditText)findViewById(R.id.amount);
        code=(EditText)findViewById(R.id.comitecode);



        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                amount=amnt.getText().toString();
                cCode=code.getText().toString();
                Intent i = new Intent(getApplicationContext(),pin_code.class);
                startActivity(i);
            }
        });

    }

}
