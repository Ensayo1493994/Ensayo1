package ragp.provicional.com.proyectoensayo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "saquen las cerveza Prroooooo", Toast.LENGTH_SHORT).show();
        //hola mundo!!!!!!!

    }

    public void Toast2(){
        Toast.makeText(this, "toast 2", Toast.LENGTH_SHORT).show();


<<<<<<< HEAD
    public void mostrarDatos(){
        Toast.makeText(this, "HOLIWI", Toast.LENGTH_SHORT).show();
    }

=======
    }
>>>>>>> c1d64682004025d92d4c99205a9d913d0e7a1524
    public void mostrarToast(){
        Toast.makeText(this, "Hola", Toast.LENGTH_SHORT).show();

    }
    
}
