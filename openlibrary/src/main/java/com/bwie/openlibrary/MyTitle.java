package com.bwie.openlibrary;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MyTitle extends LinearLayout implements View.OnClickListener {

    private TextView leftTextTv;
    private TextView centerTextTv;
    private TextView rightTextTV;

    public MyTitle(Context context) {
        super(context);
    }

    public MyTitle(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);


        TypedArray typedArray = context.getTheme().obtainStyledAttributes(attrs, R.styleable.MyTitle, 0, 0);
        String centerText_Tv = typedArray.getString(R.styleable.MyTitle_center_text_TV);
        String leftText_Tv = typedArray.getString(R.styleable.MyTitle_left_tetx_TV);
        String rightText_Tv = typedArray.getString(R.styleable.MyTitle_right_tetx_TV);

        int leftTextColor_TV = typedArray.getColor(R.styleable.MyTitle_left_color_TV, Color.BLACK);
        int rightTextColor_TV = typedArray.getColor(R.styleable.MyTitle_right_color_TV, Color.BLACK);
        int centerTextColor_TV = typedArray.getColor(R.styleable.MyTitle_center_color_TV, Color.BLACK);

        float leftTextSize_TV = typedArray.getDimension(R.styleable.MyTitle_left_size_TV, 16);
        float rightTextSize_TV = typedArray.getDimension(R.styleable.MyTitle_right_size_TV, 16);
        float centerTextSize_TV = typedArray.getDimension(R.styleable.MyTitle_center_size_TV, 16);


        View view = inflate(context, R.layout.mytitle_view, this);
        leftTextTv = view.findViewById(R.id.left_text);
        centerTextTv = view.findViewById(R.id.center_text);
        rightTextTV = view.findViewById(R.id.right_text);


        leftTextTv.setText(leftText_Tv);
        rightTextTV.setText(rightText_Tv);
        centerTextTv.setText(centerText_Tv);


        leftTextTv.setTextColor(leftTextColor_TV);
        rightTextTV.setTextColor(rightTextColor_TV);
        centerTextTv.setTextColor(centerTextColor_TV);

        leftTextTv.setTextSize(leftTextSize_TV);
        rightTextTV.setTextSize(rightTextSize_TV);
        centerTextTv.setTextSize(centerTextSize_TV);

        leftTextTv.setOnClickListener(this);
        centerTextTv.setOnClickListener(this);
        rightTextTV.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int i = v.getId();
        if (i == R.id.left_text) {
            if (onClickCallBack != null) {
                onClickCallBack.LeftText();
            }

        } else if (i == R.id.center_text) {
            if (onClickCallBack != null) {
                onClickCallBack.CenterText();
            }

        } else if (i == R.id.right_text) {
            if (onClickCallBack != null) {
                onClickCallBack.RightText();
            }

        }
    }

    public void setOnClickCallBack(setOnClickCallBack onClickCallBack) {
        this.onClickCallBack = onClickCallBack;
    }

    private setOnClickCallBack onClickCallBack;

    public interface setOnClickCallBack {
        void LeftText();
        void CenterText();
        void RightText();
    }
}
