package br.edu.insper.whatsmorse;

import android.content.ClipData;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int aperto;
    List<Integer> x =  new ArrayList<Integer>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button botaoEnviar = (Button) findViewById(R.id.botaoEnviar);

        assert botaoEnviar != null;

        botaoEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Parabéns, você fez um ponto", Toast.LENGTH_LONG).show();
                aperto = 1;
                System.out.print(aperto);
            }
        });

        botaoEnviar.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Toast.makeText(MainActivity.this, "Parabéns, você fez um traço", Toast.LENGTH_LONG).show();
                aperto= 2;
                System.out.print(aperto);
                return true;
            }
        });
    }
}
