package cardoza.uic.edu.ph.plantprototype;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.graphics.drawable.*;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        ImageView mIcDownloadAnimator = (ImageView)findViewById(R.id.ic_pro_circle);
        Drawable drawable = mIcDownloadAnimator.getDrawable();
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).start();}
}}
