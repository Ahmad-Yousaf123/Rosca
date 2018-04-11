package ahmed.umer.rosca;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class select_committee extends AppCompatActivity {

    Button x;
    Button a;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_committee);
        x = (Button)findViewById(R.id.xy);
        a = (Button)findViewById(R.id.ab);

        x.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),XYZ.class);
                startActivity(i);
                x.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i = new Intent(getApplicationContext(),XYZ.class);
                        startActivity(i);



            }
        });


    }
}
    );
        a.setOnClickListener(new View.OnClickListener() {
                                 @Override
                                 public void onClick(View view) {
                                     Intent i = new Intent(getApplicationContext(),XYZ.class);
                                     startActivity(i);
                                     a.setOnClickListener(new View.OnClickListener() {
                                         @Override
                                         public void onClick(View view) {
                                             Intent i = new Intent(getApplicationContext(),XYZ.class);
                                             startActivity(i);



                                         }
                                     });


                                 }
                             }
        );


    }
}