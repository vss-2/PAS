package com.example.jogodavelha;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button[] botoes = new Button[6];
    private boolean vezJogador1 = true;
    private int quantPartidas = 0;
    private int pontosJogador1;
    private int pontosJogador2;

    private TextView TVJogador1;
    private TextView TVJogador2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TVJogador1 = findViewById(R.id.text_view_j1);
        TVJogador2 = findViewById(R.id.text_view_j2);

        for (int f = 0; f < 6; f++){
            String IDbotao = "botao_"+ f;
            int IDresources = getResources().getIdentifier(IDbotao, "id", getPackageName());
            botoes[f] = findViewById(IDresources);
            botoes[f].setOnClickListener(this);
        }

        Button reiniciar = findViewById(R.id.button_reset);
        reiniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){

            }
        });
    }

    @Override
    public void onClick(View view) {
        if (!((Button) v).getText().toString().equals("")) {
            return;
        }
        if (vezJogador1) {
            ((Button) v).setText("x");
        } else {
            ((Button) v).setText("o");
        }

        quantPartidas++;
    }

    private boolean verificarVencedor() {
        String[] tabuleiro = new String[6];

        for(int f = 0; f < 6; f++){
            tabuleiro[f] = botoes[f].getText().toString();
        }

        for(int f = 0; f < 6; f++){
//            if()
        }
        return false;
    }
}
