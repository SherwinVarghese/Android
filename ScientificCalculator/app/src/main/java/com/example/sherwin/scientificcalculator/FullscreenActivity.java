package com.example.sherwin.scientificcalculator;

import android.annotation.TargetApi;
import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.sherwin.evalex.Expression;
import com.example.sherwin.scientificcalculator.util.SystemUiHider;

import java.math.BigDecimal;


/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 *
 * @see SystemUiHider
 */



public class FullscreenActivity extends Activity {
    /**
     * Whether or not the system UI should be auto-hidden after
     * {@link #AUTO_HIDE_DELAY_MILLIS} milliseconds.
     */
    private static final boolean AUTO_HIDE = true;
    private String temp="";
    BigDecimal result = null,oldresult;

    /**
     * If {@link #AUTO_HIDE} is set, the number of milliseconds to wait after
     * user interaction before hiding the system UI.
     */
    private static final int AUTO_HIDE_DELAY_MILLIS = 3000;

    /**
     * If set, will toggle the system UI visibility upon interaction. Otherwise,
     * will show the system UI visibility upon interaction.
     */
    private static final boolean TOGGLE_ON_CLICK = true;

    /**
     * The flags to pass to {@link SystemUiHider#getInstance}.
     */
    private static final int HIDER_FLAGS = SystemUiHider.FLAG_HIDE_NAVIGATION;

    /**
     * The instance of the {@link SystemUiHider} for this activity.
     */
    private SystemUiHider mSystemUiHider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_fullscreen);

        final View controlsView = findViewById(R.id.fullscreen_content_controls);
        final View contentView = findViewById(R.id.fullscreen_content);

        //Result Box
        final EditText res= (EditText)findViewById(R.id.textBox);



        //Buttons in the Calculator
        final Button b0 = (Button) findViewById(R.id.but0);

        b0.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                temp = res.getText().toString();
                if (temp.equals("0")) {
                    res.setText("0");

                } else {
                    res.setText(temp+ "0");
                }
            }
        });


        final Button b1 = (Button) findViewById(R.id.but1);
        b1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                temp = res.getText().toString();
                if (temp.equals("0")) {
                    res.setText("1");

                } else {
                    res.setText(temp+ "1");
                }
            }
        });

        final Button b2 = (Button) findViewById(R.id.but2);
        b2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                temp = res.getText().toString();
                if (temp.equals("0")) {
                    res.setText("2");

                } else {
                    res.setText(temp+ "2");
                }
            }
        });


        final Button b3 = (Button) findViewById(R.id.but3);
        b3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                temp = res.getText().toString();
                if (temp.equals("0")) {
                    res.setText("3");

                } else {
                    res.setText(temp+ "3");
                }
            }
        });


        final Button b4 = (Button) findViewById(R.id.but4);
        b4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                temp = res.getText().toString();
                if (temp.equals("0")) {
                    res.setText("4");

                } else {
                    res.setText(temp+ "4");
                }
            }
        });

        final Button b5 = (Button) findViewById(R.id.but5);
        b5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                temp = res.getText().toString();
                if (temp.equals("0")) {
                    res.setText("5");

                } else {
                    res.setText(temp+ "5");
                }
            }
        });

        final Button b6 = (Button) findViewById(R.id.but6);
        b6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                temp = res.getText().toString();
                if (temp.equals("0")) {
                    res.setText("6");

                } else {
                    res.setText(temp+ "6");
                }
            }
        });

        final Button b7 = (Button) findViewById(R.id.but7);
        b7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                temp = res.getText().toString();
                if (temp.equals("0")) {
                    res.setText("7");

                } else {
                    res.setText(temp+ "7");
                }
            }
        });

        final Button b8 = (Button) findViewById(R.id.but8);
        b8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                temp = res.getText().toString();
                if (temp.equals("0")) {
                    res.setText("8");

                } else {
                    res.setText(temp+ "8");
                }
            }
        });

        final Button b9 = (Button) findViewById(R.id.but9);
        b9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                temp = res.getText().toString();
                if (temp.equals("0")) {
                    res.setText("9");

                } else {
                    res.setText(temp+ "9");
                }
            }
        });

        final Button bans= (Button) findViewById(R.id.butans);
        bans.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String te = res.getText().toString();
                if (te.contains("zero") || te.contains("parentheses") || te.contains("operator") || (te.equals("0") && result != null)) {
                    res.setText(String.valueOf(oldresult));

                }
                else if ( (te.equals("0")||te.contains("null")) && oldresult == null) {

                    res.setText("0");
                }
                else {
                    res.setText(te + oldresult.toString());
                }
            }

        });

        final Button bdec = (Button) findViewById(R.id.butdec);
        bdec.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                temp = res.getText().toString();
                if (temp.equals("0")) {
                    res.setText(".");

                } else {
                    res.setText(temp+ ".");
                }
            }
        });




        final Button bsin = (Button) findViewById(R.id.butsin);
        bsin.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                temp = res.getText().toString();
                if (temp.equals("0")) {
                    res.setText("sin(");

                } else {
                    res.setText(temp+ "sin(");
                }
            }
        });

        final Button bcos = (Button) findViewById(R.id.butcos);
        bcos.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                temp = res.getText().toString();
                if (temp.equals("0")) {
                    res.setText("cos(");

                } else {
                    res.setText(temp+ "cos(");
                }
            }
        });

        final Button btan = (Button) findViewById(R.id.buttan);
        btan.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                temp = res.getText().toString();
                if (temp.equals("0")) {
                    res.setText("tan(");

                } else {
                    res.setText(temp+ "tan(");
                }
            }
        });

        final Button bsq = (Button) findViewById(R.id.butsq);
        bsq.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                temp = res.getText().toString();
                if (temp.equals("0")) {
                    res.setText("sqrt(");

                } else {
                    res.setText(temp+ "sqrt(");
                }
            }
        });

        final Button bce = (Button) findViewById(R.id.butce);
        bce.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                temp=res.getText().toString();
                res.setText("0");

            }
        });

        final Button binv = (Button) findViewById(R.id.butinv);
        binv.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                temp = res.getText().toString();
                if (temp.equals("0")) {
                    res.setText("0");

                } else {
                    res.setText("1/("+temp+")");
                }
            }
        });

        final Button blb = (Button) findViewById(R.id.butlb);
        blb.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                temp = res.getText().toString();
                if (temp.equals("0")) {
                    res.setText("0");

                } else {
                    res.setText(temp+ "(");
                }
            }
        });

        final Button brb = (Button) findViewById(R.id.butrb);
        brb.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                temp = res.getText().toString();
                if (temp.equals("0")) {
                    res.setText("0");

                } else {
                    res.setText(temp+ ")");
                }
            }
        });

        final Button bbks = (Button) findViewById(R.id.butbks);
        bbks.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String temp;
                temp=res.getText().toString();
          ;
                if (temp.length()>1)
                {
                    temp = temp.replace(temp.substring(temp.length()-1), "");

                }
                else
                {
                    temp="0";
                }

                res.setText(temp);

            }
        });

        final Button badd = (Button) findViewById(R.id.butadd);
        badd.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                temp = res.getText().toString();
                if (temp.equals("0")) {
                    res.setText("0");

                } else {
                    res.setText(temp+ "+");
                }
            }
        });

        final Button bsub = (Button) findViewById(R.id.butsub);
        bsub.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                temp = res.getText().toString();
                if (temp.equals("0")) {
                    res.setText("0");

                } else {
                    res.setText(temp+ "-");
                }
            }
        });

        final Button bmul = (Button) findViewById(R.id.butmul);
        bmul.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                temp = res.getText().toString();
                if (temp.equals("0")) {
                    res.setText("0");

                } else {
                    res.setText(temp+ "*");
                }
            }
        });

        final Button bdiv = (Button) findViewById(R.id.butdiv);
        bdiv.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                temp = res.getText().toString();
                if (temp.equals("0")) {
                    res.setText("0");

                } else {
                    res.setText(temp+ "/");
                }
            }
        });

        final Button beq = (Button) findViewById(R.id.buteq);
        beq.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                temp = res.getText().toString();
                String err="";
                result=null;

                if (temp.equals("0")) {
                    res.setText("0");

                } else {

                    try {
                        Expression e = new Expression(temp);
                        result = e.eval();
                        res.setText(result.toString());
                        oldresult=result;
                    }
                    catch (Expression.ExpressionException e) {
                        err = e.getMessage();
                        res.setText(err);
                    }
                    catch (Exception e) {
                        err = e.getMessage();
                        res.setText(err);
                    }
                }
            }
        });





        // Set up an instance of SystemUiHider to control the system UI for
        // this activity.
        mSystemUiHider = SystemUiHider.getInstance(this, contentView, HIDER_FLAGS);
        mSystemUiHider.setup();
        mSystemUiHider
                .setOnVisibilityChangeListener(new SystemUiHider.OnVisibilityChangeListener() {
                    // Cached values.
                    int mControlsHeight;
                    int mShortAnimTime;

                    @Override
                    @TargetApi(Build.VERSION_CODES.HONEYCOMB_MR2)
                    public void onVisibilityChange(boolean visible) {
                        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB_MR2) {
                            // If the ViewPropertyAnimator API is available
                            // (Honeycomb MR2 and later), use it to animate the
                            // in-layout UI controls at the bottom of the
                            // screen.
                            if (mControlsHeight == 0) {
                                mControlsHeight = controlsView.getHeight();
                            }
                            if (mShortAnimTime == 0) {
                                mShortAnimTime = getResources().getInteger(
                                        android.R.integer.config_shortAnimTime);
                            }
                            controlsView.animate()
                                    .translationY(visible ? 0 : mControlsHeight)
                                    .setDuration(mShortAnimTime);
                        } else {
                            // If the ViewPropertyAnimator APIs aren't
                            // available, simply show or hide the in-layout UI
                            // controls.
                            controlsView.setVisibility(visible ? View.VISIBLE : View.GONE);
                        }

                        if (visible && AUTO_HIDE) {
                            // Schedule a hide().
                            delayedHide(AUTO_HIDE_DELAY_MILLIS);
                        }
                    }
                });

        // Set up the user interaction to manually show or hide the system UI.
        contentView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TOGGLE_ON_CLICK) {
                    mSystemUiHider.toggle();
                } else {
                    mSystemUiHider.show();
                }
            }
        });

        // Upon interacting with UI controls, delay any scheduled hide()
        // operations to prevent the jarring behavior of controls going away
        // while interacting with the UI.
        findViewById(R.id.buteq).setOnTouchListener(mDelayHideTouchListener);
    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);

        // Trigger the initial hide() shortly after the activity has been
        // created, to briefly hint to the user that UI controls
        // are available.
        delayedHide(100);
    }


    /**
     * Touch listener to use for in-layout UI controls to delay hiding the
     * system UI. This is to prevent the jarring behavior of controls going away
     * while interacting with activity UI.
     */
    View.OnTouchListener mDelayHideTouchListener = new View.OnTouchListener() {
        @Override
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (AUTO_HIDE) {
                delayedHide(AUTO_HIDE_DELAY_MILLIS);
            }
            return false;
        }
    };

    Handler mHideHandler = new Handler();
    Runnable mHideRunnable = new Runnable() {
        @Override
        public void run() {
            mSystemUiHider.hide();
        }
    };

    /**
     * Schedules a call to hide() in [delay] milliseconds, canceling any
     * previously scheduled calls.
     */
    private void delayedHide(int delayMillis) {
        mHideHandler.removeCallbacks(mHideRunnable);
        mHideHandler.postDelayed(mHideRunnable, delayMillis);
    }
}
