package org.bidule.web.rest;

import feign.Body;
import feign.Headers;
import feign.Param;
import feign.RequestLine;

public interface Wso2Client {
    @RequestLine("POST /oauth2/introspect")
    @Headers("Content-Type: application/x-www-form-urlencoded")
    @Body("token={token}")
    public String introspect(@Param("token") String token);
}
