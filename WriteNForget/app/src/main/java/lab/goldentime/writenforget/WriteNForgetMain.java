package lab.goldentime.writenforget;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class WriteNForgetMain extends AppCompatActivity {

    private WriteNForget mWriteNForget;

    private EditText mEditText;
    private Button mSaveButton;
    private Button mLoadButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_write_nforget_main);

        mSaveButton = (Button) findViewById(R.id.save_button);
        mLoadButton = (Button) findViewById(R.id.load_button);
        mEditText = (EditText) findViewById(R.id.edit_text);

        mSaveButton.setOnClickListener(mClickListener);
        mLoadButton.setOnClickListener(mClickListener);
    }

    @Override
    public void onResume() {
        mWriteNForget = WriteNForget.getInstance();
        super.onResume();
    }

    private View.OnClickListener mClickListener = new View.OnClickListener() {
        public void onClick(View v) {
            if(v == mSaveButton) {
                mWriteNForget.saveMemo(mEditText.getText().toString());
                Toast.makeText(getApplicationContext(), "Text saved.", Toast.LENGTH_SHORT).show();
            } else if(v == mLoadButton) {
                mEditText.setText(mWriteNForget.loadMemo());
                Toast.makeText(getApplicationContext(), "Text loaded.", Toast.LENGTH_SHORT).show();
            }
        }
    };
}
