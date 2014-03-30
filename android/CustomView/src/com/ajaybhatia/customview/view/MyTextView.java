package com.ajaybhatia.customview.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;

public class MyTextView extends View {

	Paint p = new Paint();
	Rect bounds = new Rect();

	public MyTextView(Context context, AttributeSet attrs) {
		super(context, attrs);

		p.setAntiAlias(true);
		p.setColor(Color.BLUE);

		p.setTextSize(dpToPixels(24.0f));
		p.setTextAlign(Paint.Align.LEFT);
	}

	private float dpToPixels(float dp) {
		return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp,
				getResources().getDisplayMetrics());
	}

	@Override
	protected void onDraw(Canvas canvas) {
		super.onDraw(canvas);

		String s = "Hello, World!";

		float viewHeight = getHeight();
		float viewWidth = getWidth();

		p.getTextBounds(s, 0, s.length(), bounds);

		canvas.drawText(s, (viewWidth - bounds.width()) / 2.0f,
				(viewHeight + bounds.height()) / 2.0f, p);
	}

	public void setColor(int c) {
		p.setColor(c);
		invalidate();
	}

	@Override
	public boolean onTouchEvent(MotionEvent event) {
		if (event.getAction() == MotionEvent.ACTION_DOWN) {
			setBackgroundColor(Color.RED);
			invalidate();
			return true;
		} else if (event.getAction() == MotionEvent.ACTION_MOVE) {
			this.setBackgroundColor(Color.YELLOW);
			this.invalidate();
			return true;
		} else if (event.getAction() == MotionEvent.ACTION_UP) {
			this.setBackgroundColor(Color.WHITE);
			this.invalidate();
			return true;
		} else {
			return super.onTouchEvent(event);
		}
	}

}
	