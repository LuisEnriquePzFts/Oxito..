package mx.utng.lenrique.oxxito2019;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.ListView;

public class ListaProductosActivity extends AppCompatActivity
{   private Button btnNuevo;
    private ListView lsProductos;
    @Override
    protected void onCreate (Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_lista_producto);

        //Inflate
        btnNuevo=(Button)findViewById(R.id.btn_agregar_producto);
        lsProductos=(lis)
    }


}
