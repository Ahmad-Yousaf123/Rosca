package ahmed.umer.rosca;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class activity_create_comm extends AppCompatActivity {


    EditText owner;
    EditText title;
    EditText mems;
    EditText months;
    EditText amount;
    EditText s_date;
    EditText d_date;
    EditText code;
    CheckBox count;
    Button nxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_comm);
        owner = (EditText)findViewById(R.id.owner);
        title = (EditText)findViewById(R.id.title);
        mems = (EditText) findViewById(R.id.mems);
        months = (EditText)findViewById(R.id.months);
        amount = (EditText)findViewById(R.id.amount);
        s_date = (EditText)findViewById(R.id.s_date);
        d_date = (EditText)findViewById(R.id.d_date);
        code = (EditText)findViewById(R.id.code);
        count = (CheckBox)findViewById(R.id.count);
        nxt = (Button)findViewById(R.id.next);

        nxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(amount.getText().length()==0){
                    amount.setError("Enter amount");
                }
                else if(mems.getText().length()==0){
                    mems.setError("Enter number of member");
                }
                else if(months.getText().length()==0){
                    months.setError("Enter months");
                }else {
                    String amnt = amount.getText().toString();
                    String numberOfmembers = mems.getText().toString();
                    String months = amount.getText().toString();
                    Intent i = new Intent(getApplicationContext(), confirmation.class);
                    i.putExtra("amount", amnt);
                    i.putExtra("months", months);
                    i.putExtra("people", numberOfmembers);
                    startActivity(i);
                }
            }
        });


    }
}
