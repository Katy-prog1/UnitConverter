package il.ac.tcb.unitconverter;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText inputValue;
    private Spinner spinner;
    private Button btnConvert;
    private TextView textResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputValue   = findViewById(R.id.inputValue);
        spinner      = findViewById(R.id.spinnerOperations);
        btnConvert   = findViewById(R.id.btnConvert);
        textResult   = findViewById(R.id.textResult);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
                this,
                R.array.operations_array,
                android.R.layout.simple_spinner_item
        );
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        btnConvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                performConversion();
            }
        });
    }

    private void performConversion() {
        String str = inputValue.getText().toString().trim();
        if (str.isEmpty()) {
            inputValue.setError(getString(R.string.hint_enter_value));
            return;
        }

        double value = Double.parseDouble(str);
        int    pos   = spinner.getSelectedItemPosition();
        double res   = 0;
        String unit  = "";

        switch (pos) {
            case 0: // cm → m
                res  = value / 100.0;
                unit = "m";
                break;
            case 1: // m → km
                res  = value / 1000.0;
                unit = "km";
                break;
            case 2: // °C → °F
                res  = (value * 9/5) + 32;
                unit = "°F";
                break;
            case 3: // °F → °C
                res  = (value - 32) * 5/9;
                unit = "°C";
                break;
            case 4: // g → kg
                res  = value / 1000.0;
                unit = "kg";
                break;
        }

        String out = String.format("%s %.2f %s", getString(R.string.result_prefix), res, unit);
        textResult.setText(out);
    }
}