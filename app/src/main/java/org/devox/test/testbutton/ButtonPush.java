
package org.devox.test.testbutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ButtonPush extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_push);

        final Button button_down = (Button) findViewById(R.id.button_down);
        final Button button_up = (Button) findViewById(R.id.button_up);
        final TextView count_label = (TextView) findViewById(R.id.count_label);

        button_down.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                int count;
                count = Integer.parseInt(count_label.getText().toString());
                count -= 1;
                count_label.setText(Integer.toString(count));
            }
        });

        button_up.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                int count;
                count = Integer.parseInt(count_label.getText().toString());
                count += 1;
                count_label.setText(Integer.toString(count));

            }
        });

    }
}
