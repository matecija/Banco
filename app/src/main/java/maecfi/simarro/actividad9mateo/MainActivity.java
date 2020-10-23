package maecfi.simarro.actividad9mateo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private String nombre ="";
    private String passwd ="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inicio_layout);
    }

    public void iniciarApp(View view){

        setContentView(R.layout.login_layout);

    }

    public void onLogin(View v){

        EditText user = findViewById(R.id.userET);
        EditText password = findViewById(R.id.passwordET);

        if(user.getText().length()<6 || password.getText().length()<6){
            Toast.makeText(this, "No pueden haber campos vacios!!!", Toast.LENGTH_SHORT).show();
        }else {
            nombre = user.getText().toString();
            passwd = password.getText().toString();

            setContentView(R.layout.activity_main);
            TextView bv = findViewById(R.id.bienvenidoTV);
            bv.setText("Bienvenido " + nombre);

        }

    }

    public void irInicio(View v){
        setContentView(R.layout.inicio_layout);

    }

    public void cambiarDatos(View v){
        setContentView(R.layout.login_layout);


    }

}