// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudDialogflowV2FulfillmentGenericWebServiceResponse {
    /**
     * Optional. Indicates if generic web service is created through Cloud Functions integration. Defaults to false. is_cloud_function is deprecated. Cloud functions can be configured by its uri as a regular web service now.
     * 
     */
    private final Boolean isCloudFunction;
    /**
     * Optional. The password for HTTP Basic authentication.
     * 
     */
    private final String password;
    /**
     * Optional. The HTTP request headers to send together with fulfillment requests.
     * 
     */
    private final Map<String,String> requestHeaders;
    /**
     * The fulfillment URI for receiving POST requests. It must use https protocol.
     * 
     */
    private final String uri;
    /**
     * Optional. The user name for HTTP Basic authentication.
     * 
     */
    private final String username;

    @OutputCustomType.Constructor({"isCloudFunction","password","requestHeaders","uri","username"})
    private GoogleCloudDialogflowV2FulfillmentGenericWebServiceResponse(
        Boolean isCloudFunction,
        String password,
        Map<String,String> requestHeaders,
        String uri,
        String username) {
        this.isCloudFunction = Objects.requireNonNull(isCloudFunction);
        this.password = Objects.requireNonNull(password);
        this.requestHeaders = Objects.requireNonNull(requestHeaders);
        this.uri = Objects.requireNonNull(uri);
        this.username = Objects.requireNonNull(username);
    }

    /**
     * Optional. Indicates if generic web service is created through Cloud Functions integration. Defaults to false. is_cloud_function is deprecated. Cloud functions can be configured by its uri as a regular web service now.
     * 
     */
    public Boolean getIsCloudFunction() {
        return this.isCloudFunction;
    }
    /**
     * Optional. The password for HTTP Basic authentication.
     * 
     */
    public String getPassword() {
        return this.password;
    }
    /**
     * Optional. The HTTP request headers to send together with fulfillment requests.
     * 
     */
    public Map<String,String> getRequestHeaders() {
        return this.requestHeaders;
    }
    /**
     * The fulfillment URI for receiving POST requests. It must use https protocol.
     * 
     */
    public String getUri() {
        return this.uri;
    }
    /**
     * Optional. The user name for HTTP Basic authentication.
     * 
     */
    public String getUsername() {
        return this.username;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2FulfillmentGenericWebServiceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean isCloudFunction;
        private String password;
        private Map<String,String> requestHeaders;
        private String uri;
        private String username;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2FulfillmentGenericWebServiceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.isCloudFunction = defaults.isCloudFunction;
    	      this.password = defaults.password;
    	      this.requestHeaders = defaults.requestHeaders;
    	      this.uri = defaults.uri;
    	      this.username = defaults.username;
        }

        public Builder setIsCloudFunction(Boolean isCloudFunction) {
            this.isCloudFunction = Objects.requireNonNull(isCloudFunction);
            return this;
        }

        public Builder setPassword(String password) {
            this.password = Objects.requireNonNull(password);
            return this;
        }

        public Builder setRequestHeaders(Map<String,String> requestHeaders) {
            this.requestHeaders = Objects.requireNonNull(requestHeaders);
            return this;
        }

        public Builder setUri(String uri) {
            this.uri = Objects.requireNonNull(uri);
            return this;
        }

        public Builder setUsername(String username) {
            this.username = Objects.requireNonNull(username);
            return this;
        }
        public GoogleCloudDialogflowV2FulfillmentGenericWebServiceResponse build() {
            return new GoogleCloudDialogflowV2FulfillmentGenericWebServiceResponse(isCloudFunction, password, requestHeaders, uri, username);
        }
    }
}
