package com.example.suhnin.sample_proj;

import android.support.v4.app.Fragment;

        import android.os.Bundle;
        import android.support.v4.app.Fragment;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.ImageView;
        import android.widget.Toast;


public class FrameFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container,  Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.framelayouttst,container,false);

        ImageView simpleImageView = (ImageView) v.findViewById(R.id.frame_img);
        simpleImageView.setImageResource(R.mipmap.wp3);

        simpleImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity().getApplicationContext(),"Click on Frame Layout",Toast.LENGTH_SHORT).show();
            }
        });
//        new RotationAnimation(simpleImageView)
//                .setPivot(RotationAnimation.PIVOT_TOP_LEFT)
//                .setListener(new AnimationListener() {
//
//                    @Override
//                    public void onAnimationEnd(Animation animation) {
//                        //
//                        // mPlayView.setVisibility(View.VISIBLE);
//                    }
//                }).animate();

        return v;
    }
}