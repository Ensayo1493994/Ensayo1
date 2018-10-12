package ragp.provicional.com.proyectoensayo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
<<<<<<< HEAD

        //hola mundo, peroon!!!!!!!
=======
        Toast.makeText(this, "saquen las cerveza Prroooooo", Toast.LENGTH_SHORT).show();
        //hola mundo!!!!!!!
>>>>>>> 92ae8950dd540906ca1cce7f917ed906d8fcdc99

    }

    public void Toast2(){
        Toast.makeText(this, "toast 2", Toast.LENGTH_SHORT).show();
    
    public void mostrarDatos(){
        Toast.makeText(this, "HOLIWI", Toast.LENGTH_SHORT).show();
    }
    public void mostrarToast(){
        Toast.makeText(this, "Hola", Toast.LENGTH_SHORT).show();

    }
    
}
