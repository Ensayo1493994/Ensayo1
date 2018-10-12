package ragp.provicional.com.proyectoensayo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void mostrarDatos(){
        Toast.makeText(this, "HOLIWI", Toast.LENGTH_SHORT).show();
    }
}
