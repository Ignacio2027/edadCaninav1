
package es.davante.edadcanina;

import android.widget.TextView;

import androidx.databinding.BindingAdapter;

public class BindingAdapters {

    @BindingAdapter("resultadoEdad")
    public static void mostrarResultado(
            TextView textView,
            Integer resultado) {

        if (resultado == null) {
            textView.setText("");
        } else {
            textView.setText(
                    "Tu perro tiene " + resultado + " años caninos"
            );
        }
    }
}
