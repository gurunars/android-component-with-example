package com.{{cookiecutter.java_group_name}}.{{cookiecutter.java_name}};

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;

public class {{cookiecutter.class_name}} extends LinearLayout {

    private TextView text;

    public {{cookiecutter.class_name}}(Context context) {
        this(context, null);
    }

    public {{cookiecutter.class_name}}(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public {{cookiecutter.class_name}}(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        inflate(context, R.layout.{{cookiecutter.java_name}}, this);

        text = (TextView) findViewById(R.id.text);

        TypedArray a = context.getTheme().obtainStyledAttributes(
                attrs,
                R.styleable.{{cookiecutter.class_name}},
                0, 0);

        try {
            String text = a.getString(R.styleable.{{cookiecutter.class_name}}_text);
            if (text == null) {
                text = context.getString(R.string.default_text);
            }
            this.text.setText("TEST TEXT:" + text);
        } finally {
            a.recycle();
        }

    }

}
