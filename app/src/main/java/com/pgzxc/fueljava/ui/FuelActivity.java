package com.pgzxc.fueljava.ui;

import android.text.method.ScrollingMovementMethod;
import com.github.kittinunf.fuel.Fuel;
import com.github.kittinunf.fuel.core.FuelError;
import com.github.kittinunf.fuel.core.Handler;
import com.github.kittinunf.fuel.core.Request;
import com.github.kittinunf.fuel.core.Response;
import com.pgzxc.fueljava.BuildConfig;
import com.pgzxc.fueljava.R;
import com.pgzxc.fueljava.base.BaseActivity;
import com.pgzxc.fueljava.databinding.ActivityFuleBinding;

public class FuelActivity extends BaseActivity<ActivityFuleBinding> {

    @Override
    public void setListener() {
        super.setListener();
        //get请求
        mDataBinding.btnFuelGet.setOnClickListener(view -> {
            try {
                Fuel.get(BuildConfig.baseUrl + "/get").responseString(new Handler<String>() {
                    @Override
                    public void success(Request request, Response response, String str) {
                        mDataBinding.tvContent.setText(str);
                    }

                    @Override
                    public void failure(Request request, Response response, FuelError fuelError) {
                    }
                });
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });
        //put请求
        mDataBinding.btnFuelPut.setOnClickListener(view -> {
            try {
                Fuel.put(BuildConfig.baseUrl + "/put").responseString(new Handler<String>() {
                    @Override
                    public void success(Request request, Response response, String str) {
                        mDataBinding.tvContent.setText(str);
                    }

                    @Override
                    public void failure(Request request, Response response, FuelError fuelError) {
                    }
                });
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });
        //post请求
        mDataBinding.btnFuelPost.setOnClickListener(view -> {
            try {
                Fuel.post(BuildConfig.baseUrl + "/post").responseString(new Handler<String>() {
                    @Override
                    public void success(Request request, Response response, String str) {
                        mDataBinding.tvContent.setText(str);
                    }

                    @Override
                    public void failure(Request request, Response response, FuelError fuelError) {
                    }
                });
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });
        //delete请求
        mDataBinding.btnFuelDel.setOnClickListener(view -> {
            try {
                Fuel.delete(BuildConfig.baseUrl + "/delete").responseString(new Handler<String>() {
                    @Override
                    public void success(Request request, Response response, String str) {
                        mDataBinding.tvContent.setText(str);
                    }

                    @Override
                    public void failure(Request request, Response response, FuelError fuelError) {
                    }
                });
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });
    }

    @Override
    public void initWidget() {
        super.initWidget();
        mDataBinding.tvContent.setMovementMethod(ScrollingMovementMethod.getInstance());
    }

    @Override
    protected int getActivityLayoutId() {
        return R.layout.activity_fule;
    }
}
