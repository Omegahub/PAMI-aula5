package br.com.etec_viagem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText txtTempo;
    EditText txtMedia;
    EditText txtVeiculo;
    TextView lblResulD;
    TextView lblResulC;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtTempo = findViewById(R.id.txtTempo);
        txtMedia = findViewById(R.id.txtMedia);
        txtVeiculo = findViewById(R.id.txtVeiculo);
        lblResulD = findViewById(R.id.lblResulD);
        lblResulC = findViewById(R.id.lblResulC);
    }

    public void  onCalcular (View v)
    {
        if (txtTempo.getText().toString().isEmpty() || txtMedia.getText().toString().isEmpty() || txtVeiculo.getText().toString().isEmpty() )
        {
            Toast.makeText(this, "digite um valor", Toast.LENGTH_LONG).show();

        }

        else
        {
            double tempo = Double.parseDouble(txtTempo.getText().toString());
            double media = Double.parseDouble(txtMedia.getText().toString());
            double veiculo = Double.parseDouble(txtVeiculo.getText().toString());

            double distancia = tempo * media;
            double consumo = distancia / veiculo;


            lblResulD.setText(String.valueOf(distancia));
            lblResulC.setText(String.valueOf(consumo));
        }
    }


}
