package com.pgzxc.fueljava.base;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

public abstract class BaseActivity<T extends ViewDataBinding> extends AppCompatActivity {
    protected T mDataBinding;//ViewDataBinding引用
    protected BaseActivity activity;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activity = this;
        int layoutId = getActivityLayoutId();
        if (layoutId != 0) {//如果设置了布局Id
            mDataBinding = DataBindingUtil.setContentView(this, layoutId);//解析布局
        }
        initWidget();
        initData();
        setListener();
    }

    /**
     * 初始化控件属性
     */
    public void initWidget() {
    }

    /**
     * 初始化数据
     */
    public void initData() {

    }

    /**
     * 设置监听
     */
    public void setListener() {

    }

    protected abstract int getActivityLayoutId();
}
