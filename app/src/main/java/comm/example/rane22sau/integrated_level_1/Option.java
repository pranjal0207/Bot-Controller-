package comm.example.rane22sau.integrated_level_1;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Option extends MainActivity {
    Button voicebt,facebt,colorbt,ocrbt,movebt,pathbt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option);
        voicebt = (Button)findViewById(R.id.voice);
        facebt = (Button)findViewById(R.id.face);
        colorbt = (Button)findViewById(R.id.color);
        ocrbt = (Button) findViewById(R.id.ocr);
        pathbt = findViewById(R.id.path);
        movebt = findViewById(R.id.move);
        voicebt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Open_Voice = new Intent(getApplicationContext(),Voice_Control.class);
                startActivity(Open_Voice);
            }
        });
        facebt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Open_Face_Tracker = new Intent(getApplicationContext(),Face_Tracker.class);
                startActivity(Open_Face_Tracker);
            }
        });
        colorbt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Open_Color = new Intent(getApplicationContext(),Color_Detector.class);
                startActivity(Open_Color);
            }
        });
        ocrbt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Open_Ocr = new Intent(getApplicationContext(),OCR_activity.class);
                startActivity(Open_Ocr);
            }
        });
        movebt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Open_move = new Intent(getApplicationContext(),OCR_activity.class);
                startActivity(Open_move);
            }
        });
        /*pathbt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Open_path = new Intent(getApplicationContext(),OCR_activity.class);
                startActivity(Open_path);
            }
        });*/
    }
}
