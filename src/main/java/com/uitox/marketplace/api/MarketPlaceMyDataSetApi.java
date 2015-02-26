package com.uitox.marketplace.api;

import java.net.URL;

import com.memetix.mst.MicrosoftTranslatorAPI;

public final class MarketPlaceMyDataSetApi extends MicrosoftTranslatorAPI{
    
    private static final String SERVICE_URL = "https://api.datamarket.azure.com/Services/My/Datasets";
    
    //prevent instantiation
    private MarketPlaceMyDataSetApi(){};
    
    public static long getMonthlyUsage() throws Exception{
        long out = 0;
        final URL url = new URL(SERVICE_URL);
        final String response = azureRetrieveString(url);
        
        //TODO: parse response to acquire monthly usage
        int startIndex = response.indexOf("<d:ResourceBalance");
        int endIndex = response.lastIndexOf("</d:ResourceBalance>");
        
        String monthlyUsage = response.substring(startIndex+38, endIndex);
        out = Long.valueOf(monthlyUsage);

        return out;
    }

    
}
