package mx.utng.lenrique.oxxito2019;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class NuevoProductoActivity extends AppCompatActivity {
    private EditText txtCodigo;
    private EditText txtProducto;
    private EditText txtPrecio;
    private EditText txtExistencias;
    private EditText texFechaCaducidad;
    private Button btnGuardar;
    private Button btnCancelar;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nuevo_producto);
        //Inflate
        txtCodigo=(EditText)findViewById(R.id.txt_codigo);
        txtProducto=(EditText)findViewById(R.id.txt_producto);
        txtPrecio=(EditText)findViewById(R.id.txt_precio);
        txtExistencias=(EditText)findViewById(R.id.txt_existencia);
        txtFechaCaducidad=(EditText)findViewById(R.id.txt_fecha_caducidad);
        btnGuardar=(Button)findViewById(R.id.btn_guardar);
        btnCancelar=(Button)findViewById(R.id.btn_cancelar);

        btnGuardar.setOnClickListener(new view.onClickListener()){
            public void onClick(view view){
                Toast.makeText(getApplicationContext(),
                        text:"Guardando", Toast.LENGTH_LONG).show();
                System.exit(status: 0);
            }
            }

        btnCancelar.setOnClickListener(new view.onClickListener()){
            public void onClick(view view){
                Toast.makeText(getApplicationContext(),
                        text:"Cancelando", Toast.LENGTH_LONG).show();
                System.exit(status:0);
            }
        }
        }
    }

