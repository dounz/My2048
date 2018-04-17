package lecnam.nfa024.akassard.my2048;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class Game2048 extends AppCompatActivity {

    LinearLayout globalLayout;
    RelativeLayout scoreLayout;
    RelativeLayout boardLayout;
    RelativeLayout controlLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game2048);
    }

    //exercice 16 onWindowsFocusChanged remplacé par l'utilisation de la class Dynamique SquareLayout









}
