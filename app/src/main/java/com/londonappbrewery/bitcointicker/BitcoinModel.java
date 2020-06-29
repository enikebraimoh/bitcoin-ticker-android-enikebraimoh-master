package com.londonappbrewery.bitcointicker;

import org.json.JSONException;
import org.json.JSONObject;

public class BitcoinModel {

    String mBitcoinPrice;

    public static  BitcoinModel fromjson (JSONObject responce){

        try {

            BitcoinModel bitcoinModel = new BitcoinModel();
            bitcoinModel.mBitcoinPrice = responce.getString("ask");
            return bitcoinModel;

        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }

    }



    public String getBitcoinPrice() {
        return mBitcoinPrice;
    }

    public void setBitcoinPrice(String bitcoinPrice) {
        mBitcoinPrice = bitcoinPrice;
    }
}
