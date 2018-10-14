package com.pgzxc.fueljava;

import android.content.Intent;

import com.pgzxc.fueljava.base.BaseActivity;
import com.pgzxc.fueljava.databinding.ActivityMainBinding;
import com.pgzxc.fueljava.ui.FuelActivity;
import com.pgzxc.fueljava.ui.FuelManagerActivity;

public class MainActivity extends BaseActivity<ActivityMainBinding> {

    @Override
    public void setListener() {
        super.setListener();
        mDataBinding.bunFuel.setOnClickListener(view -> startActivity(new Intent(this, FuelActivity.class)));
        mDataBinding.bunFuelManager.setOnClickListener(view -> startActivity(new Intent(this, FuelManagerActivity.class)));

    }

    @Override
    protected int getActivityLayoutId() {
        return R.layout.activity_main;
    }
}
