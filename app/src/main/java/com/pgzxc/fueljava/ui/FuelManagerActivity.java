package com.pgzxc.fueljava.ui;

import android.text.method.ScrollingMovementMethod;

import com.github.kittinunf.fuel.Fuel;
import com.github.kittinunf.fuel.core.FuelError;
import com.github.kittinunf.fuel.core.FuelManager;
import com.github.kittinunf.fuel.core.Handler;
import com.github.kittinunf.fuel.core.Request;
import com.github.kittinunf.fuel.core.Response;
import com.pgzxc.fueljava.BuildConfig;
import com.pgzxc.fueljava.R;
import com.pgzxc.fueljava.base.BaseActivity;
import com.pgzxc.fueljava.databinding.ActivityFulemanagerBinding;

public class FuelManagerActivity extends BaseActivity<ActivityFulemanagerBinding> {

    static {
        FuelManager.Companion.getInstance().setBasePath(BuildConfig.baseUrl);
    }

    @Override
    public void setListener() {
        super.setListener();
        /**Fuel-get请求 */
        mDataBinding.btnFuelManagerGet.setOnClickListener(view -> {

            try {
                Fuel.get("/get").responseString(new Handler<String>() {
                    @Override
                    public void success(Request request, Response response, String str) {
                        mDataBinding.tvContent.setText(str);
                        //mDataBinding.tvContent.append(str);
                    }

                    @Override
                    public void failure(Request request, Response response, FuelError fuelError) {
                        mDataBinding.tvContent.setText(fuelError.getException().getMessage());
                    }
                });

            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });
        /** Fuel-put请求*/
        mDataBinding.btnFuelManagerPut.setOnClickListener(view -> {
            try {
                Fuel.put("/put").responseString(new Handler<String>() {
                    @Override
                    public void success(Request request, Response response, String str) {
                        mDataBinding.tvContent.setText(str);
                        //mDataBinding.tvContent.append(str);
                    }

                    @Override
                    public void failure(Request request, Response response, FuelError fuelError) {
                        mDataBinding.tvContent.setText(fuelError.getException().getMessage());
                    }
                });

            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });
        /** Fuel-post请求*/
        mDataBinding.btnFuelManagerPost.setOnClickListener(view -> {
            try {
                Fuel.post("/post").responseString(new Handler<String>() {
                    @Override
                    public void success(Request request, Response response, String str) {
                        mDataBinding.tvContent.setText(str);
                        //mDataBinding.tvContent.append(str);
                    }

                    @Override
                    public void failure(Request request, Response response, FuelError fuelError) {
                        mDataBinding.tvContent.setText(fuelError.getException().getMessage());
                    }
                });

            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });
        /** Fuel-del请求*/
        mDataBinding.btnFuelManagerDel.setOnClickListener(view -> {
            try {
                Fuel.delete("/delete").responseString(new Handler<String>() {
                    @Override
                    public void success(Request request, Response response, String str) {
                        mDataBinding.tvContent.setText(str);
                        //mDataBinding.tvContent.append(str);
                    }

                    @Override
                    public void failure(Request request, Response response, FuelError fuelError) {
                        mDataBinding.tvContent.setText(fuelError.getException().getMessage());
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
        return R.layout.activity_fulemanager;
    }
}
