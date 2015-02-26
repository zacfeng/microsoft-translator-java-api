package com.uitox.marketplace.api;


public class MyDataSetApiTest {

    public static void main(String[] args) throws Exception {
   
        String userID = "f7ec62ad-ce58-4147-93ce-4850bbc85318";
        String userSecret = "wbmHyGPT5ez2TUk+fexklwRWlkDRTIBsvjjH9m8G/Iw";
        
        MarketPlaceMyDataSetApi.setUserId(userID);
        MarketPlaceMyDataSetApi.setUserSecret(userSecret);
        
        System.out.println(MarketPlaceMyDataSetApi.getMonthlyUsage());
        
    }
}


