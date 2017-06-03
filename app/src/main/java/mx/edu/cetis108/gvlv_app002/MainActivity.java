package mx.edu.cetis108.gvlv_app002;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnSumar_onCLick(View v)
    {
        EditText numero1, numero2;
        numero1= (EditText) findViewById(R.id.txtNumero1);
        numero2= (EditText) findViewById(R.id.txtNumero2);
        TextView lblResultado= (TextView) findViewById(R.id.lblResultado);

        double n1= Double.valueOf(numero1.getText().toString());
        double n2= Double.valueOf(numero2.getText().toString());
        double result= n1 + n2;
        lblResultado.setText("EL resultado de la suma es: "+result);
    }

    public void btnRestar_onCLick(View v)
    {
        EditText numero1, numero2;
        numero1= (EditText) findViewById(R.id.txtNumero1);
        numero2= (EditText) findViewById(R.id.txtNumero2);
        TextView lblResultado= (TextView) findViewById(R.id.lblResultado);

        double n1= Double.valueOf(numero1.getText().toString());
        double n2= Double.valueOf(numero2.getText().toString());
        double result= n1 - n2;
        lblResultado.setText("EL resultado de la resta es: "+result);
    }

    public void btnMultiplicar_onCLick(View v)
    {
        EditText numero1, numero2;
        numero1= (EditText) findViewById(R.id.txtNumero1);
        numero2= (EditText) findViewById(R.id.txtNumero2);
        TextView lblResultado= (TextView) findViewById(R.id.lblResultado);

        double n1= Double.valueOf(numero1.getText().toString());
        double n2= Double.valueOf(numero2.getText().toString());
        double result= n1 * n2;
        lblResultado.setText("EL resultado de la multiplicacion es: "+result);
    }

    public void btnDividir_onCLick(View v)
    {
        EditText numero1, numero2;
        numero1= (EditText) findViewById(R.id.txtNumero1);
        numero2= (EditText) findViewById(R.id.txtNumero2);
        TextView lblResultado= (TextView) findViewById(R.id.lblResultado);

        double n1= Double.valueOf(numero1.getText().toString());
        double n2= Double.valueOf(numero2.getText().toString());
        double result= n1 / n2;
        lblResultado.setText("EL resultado de la division es: "+result);
    }
}
