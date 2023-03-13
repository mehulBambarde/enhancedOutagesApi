package io.swagger.client.api;

import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.ExerciseApi;

import java.io.File;
import java.util.*;

public class ExerciseApiExample {

    public static List<EnhancedOutagesInner> sendOutages(String siteId,ExerciseApi apiInstance){
        
 
         
         // // String | Identifier for a site
         List<EnhancedOutagesInner> body = Arrays.asList(new EnhancedOutagesInner()); 
         // List<EnhancedOutagesInner> | 
 
         Outages otg;
         try {
             otg = apiInstance.outagesGet();
             SiteInfo sInf = apiInstance.siteInfoSiteIdGet(siteId);
             for (OutagesInner outagesInner : otg) {
                 for (SiteInfoDevices snf: sInf.getDevices() ) {
                     if(snf.getId().equals(outagesInner.getId())){
                       EnhancedOutagesInner enhancedOutages = new EnhancedOutagesInner();
                       enhancedOutages.setBegin(outagesInner.getBegin());
                       enhancedOutages.setEnd(outagesInner.getEnd());
                       enhancedOutages.setName(snf.getName());
                       enhancedOutages.setId(snf.getId());
 
                       body.add(enhancedOutages);
 
                     }
                 }
             }
 
         } catch (ApiException e1) {
             // TODO Auto-generated catch block
             e1.printStackTrace();
         }
                System.out.println("run done");

                return body;
         
 
    }

    public static ExerciseApi getApi(){
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        // ApiClient defaultClient = new ApiClient();
 
         // Configure API key authorization: api_key
         ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
         api_key.setApiKey("EltgJ5G8m44IzwE6UN2Y4B4NjPW77Zk6FJK3lL23");
         // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
         api_key.setApiKeyPrefix("Token");


        ExerciseApi apiInstance = new ExerciseApi();
        return apiInstance;
        
    }

    public static void main(String[] args) {
        String siteId = "kingfisher";
        ExerciseApi apiInstance = getApi();
        sendOutages(siteId, apiInstance);
        List<EnhancedOutagesInner> body = Arrays.asList(new EnhancedOutagesInner()); 

        try {
            apiInstance.siteOutagesSiteIdPost(siteId, body);
         } catch (ApiException e) {
             System.err.println("Exception when calling ExerciseApi#siteOutagesSiteIdPost");
             e.printStackTrace();
         }

        }
}
