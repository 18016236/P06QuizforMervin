package sg.edu.rp.soi.p06_quiz;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvOperation, tvResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvOperation = findViewById(R.id.tvOperation);
        tvResult = findViewById(R.id.tvResult);

        registerForContextMenu(tvOperation);

        peeps = 0;
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v,
                                    ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        getMenuInflater().inflate(R.menu.main_menu, menu);
        if (v.getId() == R.id.tvOperation) {
            menu.add(0, 0, 0, "+");
            menu.add(0, 1, 1, "-");
        }
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        if (item.getItemId() == 0) {
            peeps++;
            tvResult.setText(Result + " ");
        }
        else if(item.getItemId()==1){
            peeps--;
            tvResult.setText(Result+" ");
        }
        return true;
    }
}

