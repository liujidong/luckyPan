package person.ljd.luckpan;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import person.ljd.luckypan.R;

public class MainActivity extends Activity {

	private LuckyPan mLuckyPan;
	private ImageView mStartBtn;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		mLuckyPan = (LuckyPan)findViewById(R.id.id_luckyPan);
		mStartBtn = (ImageView)findViewById(R.id.id_start_btn);
		
		mStartBtn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				if(!mLuckyPan.isStart()){
					mLuckyPan.luckyStart(2);
					mStartBtn.setImageResource(R.drawable.stop);
				}else{
					if(!mLuckyPan.isShouldEnd()){
						mLuckyPan.luckyEnd();
						mStartBtn.setImageResource(R.drawable.start);
					}
				}
				
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// TODO Auto-generated method stub
		return super.onCreateOptionsMenu(menu);
	}

}
