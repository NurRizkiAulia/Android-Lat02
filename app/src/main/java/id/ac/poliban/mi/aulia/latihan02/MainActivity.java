package id.ac.poliban.mi.aulia.latihan02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //hubungkan masing2 view yang ingin dimanipulasi
        //dengan object yang kita buat
        Button btKrisna = findViewById(R.id.btKrisna);
        Button btBisma = findViewById(R.id.btBismaDewaBrata);
        Button btBasudewa = findViewById(R.id.btBasudewa);

        //pasang event listener & handler
        //menggunakan kelas anonim yang mengimplementasikan interface
        //View.OnClickListener
        btKrisna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "I'am Krisna, Advisor of Arjuna", Toast.LENGTH_SHORT).show();
            }
        });

        btBisma.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "I'm Bisma Dewa Bharata, The godfather of Hastina", Toast.LENGTH_SHORT).show();

            }
        }));

        btBasudewa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "The Brother of Krisna", Toast.LENGTH_SHORT).show();

            }
        });
    }

}
