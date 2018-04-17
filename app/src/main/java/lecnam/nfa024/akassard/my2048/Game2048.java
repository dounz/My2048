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

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);

        globalLayout = findViewById(R.id.globalLO);
        scoreLayout = findViewById(R.id.scoreLO);
        boardLayout = findViewById(R.id.boardLO);
        controlLayout = findViewById(R.id.controlLO);

        float Hauteur =(float)globalLayout.getHeight();
        float largeur = (float)globalLayout.getWidth();

        float weight = 100*largeur/Hauteur;

        float weightScore = (float)0.25*(100-weight);
        float weightControl = (float)0.75*(100-weight);

        //récuperer les layouts parameters
        RelativeLayout.LayoutParams scoreParams = (RelativeLayout.LayoutParams) scoreLayout.getLayoutParams();
        RelativeLayout.LayoutParams controlParams = (RelativeLayout.LayoutParams) scoreLayout.getLayoutParams();






    }
}
