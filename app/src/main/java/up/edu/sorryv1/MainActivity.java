package up.edu.sorryv1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button buttonDrawCards;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonDrawCards = findViewById(R.id.buttonDrawCards);
        buttonDrawCards.setOnClickListener(view -> drawCard());
    }

    private void drawCard() {
        // Your logic to draw a card goes here
        Toast.makeText(this, "Card drawn!", Toast.LENGTH_SHORT).show();
    }
}
