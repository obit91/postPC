package postpc.huji.buttoncounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int counter = 0;
    TextView textView;
    View button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        button = findViewById(R.id.counterButton);
        updateNumberOfTaps();

        button.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                counter++;
                updateNumberOfTaps();
            }
        });
    }

    private void updateNumberOfTaps() {
        if ((counter % 7 == 0 && counter != 0) || String.valueOf(counter).contains("7"))
            textView.setText("B O O M");
        else
            textView.setText(String.valueOf(counter));

    }


}
