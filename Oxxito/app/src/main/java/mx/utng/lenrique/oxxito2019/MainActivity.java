package mx.utng.lenrique.oxxito2019;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button btnInicializar;
    private  Button btnRegistrar;
    //Inflate --Relacionar controles de la vista con la clase Java
    btnInicializar=(Button)findViewById(R.id.btn_iniciar_bd)
    btnRegistrar=(Button)


    btnIniciar.setoOnclickListener(this);
    btnRegistrar.setOnClickListener(this);

    if(view.getID()==R.id.btn_iniciar_bd){
        try{
            Toast.makeText(gettApplicationContext(), text "Error:"+e.getMessage(), Toast.LENGTH_SHORT).show;
        }
    }else if(view.getId()==R.id.btn_registrar)

    {
        Intetnt inProd = new Intent(
                getApplicationContext()
                ListaProductosActivity.class);
        //Se arranca la actividad
        starActivity(inProd);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onClick(View v) {

    }
}
