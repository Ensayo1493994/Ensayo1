package ragp.provicional.com.proyectoensayo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        //hola mundo!!!!!!!

    }

    public void Toast2(){
        Toast.makeText(this, "toast 2", Toast.LENGTH_SHORT).show();

    }

    public void mostrarToast(){
        Toast.makeText(this, "Hola", Toast.LENGTH_SHORT).show();

    }
    public void mostrarToast2(){
        Toast.makeText(this, "Hola weyes", Toast.LENGTH_SHORT).show();

    }

}
