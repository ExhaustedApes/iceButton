package androidtown.ord.loopmanch;
//button -> ice breaking

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;
    private Button button;
    private TextView touchCountTextView;

    private int touchCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imageView);
        button = findViewById(R.id.button);
        touchCountTextView = findViewById(R.id.touchCountTextView);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 버튼이 클릭될 때마다 터치 횟수를 증가시키고 텍스트뷰에 출력
                touchCount++;
                touchCountTextView.setText("Touch Count: " + touchCount);

                // count == 5,10,15,20,일 때 얼음 사진을 변경하여 녹는 모습 연출
                if (touchCount == 5) {
                    imageView.setImageResource(R.drawable.ice2);
                }
                if (touchCount == 10) {
                    imageView.setImageResource(R.drawable.ice3);
                }
                if (touchCount == 15) {
                    imageView.setImageResource(R.drawable.ice4);
                }
                if (touchCount == 20) {
                    imageView.setImageResource(R.drawable.ice5);
                }
            }
        });
    }
}
