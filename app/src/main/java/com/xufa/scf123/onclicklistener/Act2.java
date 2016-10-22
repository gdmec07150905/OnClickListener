package com.xufa.scf123.onclicklistener;

import android.support.annotation.Nullable;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.Toast;

public class Act2 extends AppCompatActivity {
    private Button btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act2);
        btn2= (Button) findViewById(R.id.button2);
        btn2.setText("内部类");
        btn2.setOnClickListener(new Neibu());
    }
    class Neibu implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            Toast.makeText(Act2.this,"内部类作为事件的监听",Toast.LENGTH_LONG).show();
        }
    }
}
