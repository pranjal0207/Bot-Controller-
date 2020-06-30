package comm.example.rane22sau.integrated_level_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;



import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Manual extends MainActivity {
    Button right,left,forward,backward,stop;
    TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manual);
        right=(Button)findViewById(R.id.right);
        left=(Button)findViewById(R.id.left);
        stop=(Button)findViewById(R.id.stop);
        forward=(Button)findViewById(R.id.forward);
        backward=(Button)findViewById(R.id.backward);
        t=(TextView) findViewById(R.id.STT);
        right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(global_variables.getBT()==1) {
                    sendMessage("R");
                    t.setText("R");
                }
            }
        });
        left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(global_variables.getBT()==1){
                sendMessage("L");}
                t.setText("L");
            }
        });
        forward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(global_variables.getBT()==1){
                sendMessage("F");}
                t.setText("F");
            }
        });
        backward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(global_variables.getBT()==1){
                sendMessage("B");}
                t.setText("B");
            }
        });
        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(global_variables.getBT()==1){
                sendMessage("S");}
                t.setText("S");
            }
        });

    }
}