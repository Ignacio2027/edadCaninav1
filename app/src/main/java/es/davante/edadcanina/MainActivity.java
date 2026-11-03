package es.davante.edadcanina;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

private static final int FACTOR_CANINO = 7;
private static final int EDAD_MINIMA = 1;
private static final int EDAD_MAXIMA = 30; // ningún perro supera esta edad

private EditText ageEdit;
private TextView resultText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        // Declaramos variables
        EditText ageEdit = findViewById(R.id.age_input);
        TextView resultText = findViewById(R.id.result_text);
        Button button1 = findViewById(R.id.btn_calc);


        ageEdit = findViewById(R.id.age_input);
        resultText = findViewById(R.id.result_text);
        Button button1 = findViewById(R.id.button1);

        private void mostrarError(String mensaje) {
            // 1. Mostrar el mensaje en el EditText
            ageEdit.setError(mensaje);
            // 2. Poner el foco en el EditText
            ageEdit.requestFocus();
            // 3. Borrar el resultado anterior
            resultText.setText("");
        }

        private void calcularEdad() {
            // 1. Leer el texto sin espacios
            String texto = ageEdit.getText().toString().trim();

            // 2. ¿Vacío?
            if (texto.isEmpty()) {
                mostrarError(getString(R.string.error_vacio));
                return;
            }

            // 3. Convertir a int
            int age;
            try {
                age = Integer.parseInt(texto);
            } catch (NumberFormatException e) {
                mostrarError(getString(R.string.error_no_numero));
                return;
            }

            // 4. ¿En rango?
            if (age < EDAD_MINIMA || age > EDAD_MAXIMA) {
                mostrarError(getString(R.string.error_rango, EDAD_MINIMA, EDAD_MAXIMA));
                return;
            }

            // 5. Todo correcto
            ageEdit.setError(null);
            int humanAge = age * FACTOR_CANINO;
            resultText.setText(getString(R.string.tu_edad_format, humanAge));
        }
        button1.setOnClickListener(view -> calcularEdad());
    }

        // Implementar el boton (setOnClickListener)
        button1.setOnClickListener(view -> {

            String ageString = ageEdit.getText().toString();
            int age = Integer.parseInt(ageString);
            int dogAge = age * 7;
            resultText.setText(getString(R.string.tu_edad_format, dogAge));
        });


    }
}
