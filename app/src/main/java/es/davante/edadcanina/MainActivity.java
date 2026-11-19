
package es.davante.edadcanina;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import es.davante.edadcanina.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private EdadCaninaControlador controlador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        EdgeToEdge.enable(this);

        binding = DataBindingUtil.setContentView(
                this,
                R.layout.activity_main
        );

        controlador = new EdadCaninaControlador(this, binding);
        binding.setControlador(controlador);
        binding.setLifecycleOwner(this);
    }
}
