package kr.uk.dh.a20200317_02_java_first;


import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import kr.uk.dh.a20200317_02_java_first.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {


    ActivityMainBinding binding = null;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        Log.d("버튼클릭" ,"입력 버튼 눌림");
    binding.okBtn.setOnLongClickListener(new View.OnLongClickListener() {
        @Override
        public boolean onLongClick(View v) {
            String input = binding.inputEdt.getText().toString();

            binding.resultText.setText(input);
            binding.inputEdt.setText("");
        }
    });




    }
}
