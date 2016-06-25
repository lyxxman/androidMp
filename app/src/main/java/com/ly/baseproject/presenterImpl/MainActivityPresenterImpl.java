package com.ly.baseproject.presenterImpl;

import android.content.Context;

import com.ly.baseproject.net.request.GetIndexNewTopV1Request;
import com.ly.baseproject.net.response.IndexNewTopResponse;
import com.ly.baseproject.presenter.MainActivityPresenter;


/**
 * Created date on 2016/4/29 0029.
 * describe :MainActivity业务处理类
 * author : ly
 * email : 839482621@qq.com
 */
public class MainActivityPresenterImpl implements MainActivityPresenter {
    private MainActivityLoadListener mMainActivityLoadListener;
    private  Context mContext;

    public MainActivityPresenterImpl(Context mContext,MainActivityLoadListener mMainActivityLoadListener) {
        this.mContext = mContext;
        setmMainActivityLoadListener(mMainActivityLoadListener);
    }

    @Override
    public void onResume() {

    }

    @Override
    public void onDestroy() {

    }

    @Override
    public void getTopData() {
        new GetIndexTopDataTask().request(mContext);
    }

    public MainActivityLoadListener getmMainActivityLoadListener() {
        return mMainActivityLoadListener;
    }

    public void setmMainActivityLoadListener(MainActivityLoadListener mMainActivityLoadListener) {
        this.mMainActivityLoadListener = mMainActivityLoadListener;
    }

    public interface MainActivityLoadListener{
        public void onLoadTopDataSuccess(IndexNewTopResponse indexNewTopResponse);
        public void   onLoadTopDataError(String error);
        public void onLoadMiddleDataSuccess();
        public void onLoadBottomDataError();
    }
    private class GetIndexTopDataTask extends GetIndexNewTopV1Request{
        @Override
        public void onPostExecute(IndexNewTopResponse indexNewTopResponse) {
            if(mMainActivityLoadListener!=null) {
                mMainActivityLoadListener.onLoadTopDataSuccess(indexNewTopResponse);
            }
        }

        @Override
        public void onErrorExecute(String error) {
            if(mMainActivityLoadListener!=null) {
                mMainActivityLoadListener.onLoadTopDataError(error);
            }
            }
    }

}
