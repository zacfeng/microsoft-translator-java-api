package com.memetix.mst.translate;

import com.memetix.mst.language.Language;

public class MyTranslateTest {

    public static void main(String[] args) throws Exception {

        // String text = "資訊";
        // String text = "光碟";
        // String text = "零食/餅幹/巧克力/糖果/炒貨";
        String text = "自拍神器";
        String clientID = "ZacTranslationTest";
        String clientSecret = "xnWdynuOE09IW/DyOtl7XnYj0W4rTl8YlKsVrnkrg4Q=";

//        String clientID = "491310015";
//        String clientSecret = "8fOQZjn8xvWDGWdCOPeY/sLfEG/J+AhX9YDtS5PvT4U=";
        
        Translate.setClientId(clientID);
        Translate.setClientSecret(clientSecret);
        
        String translatedText = Translate.execute(text, Language.ENGLISH);

        System.out.println(translatedText);

        // System.out.println(MicrosoftTranslatorAPI.getToken(clientID,
        // clientSecret));

    }

}
