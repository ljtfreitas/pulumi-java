// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.monitoring_v3.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.monitoring_v3.outputs.BasicAuthenticationResponse;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class HttpCheckResponse {
    /**
     * The authentication information. Optional when creating an HTTP check; defaults to empty.
     * 
     */
    private final BasicAuthenticationResponse authInfo;
    /**
     * The request body associated with the HTTP POST request. If content_type is URL_ENCODED, the body passed in must be URL-encoded. Users can provide a Content-Length header via the headers field or the API will do so. If the request_method is GET and body is not empty, the API will return an error. The maximum byte size is 1 megabyte.Note: If client libraries aren't used (which performs the conversion automatically) base64 encode your body data since the field is of bytes type.
     * 
     */
    private final String body;
    /**
     * The content type header to use for the check. The following configurations result in errors: 1. Content type is specified in both the headers field and the content_type field. 2. Request method is GET and content_type is not TYPE_UNSPECIFIED 3. Request method is POST and content_type is TYPE_UNSPECIFIED. 4. Request method is POST and a "Content-Type" header is provided via headers field. The content_type field should be used instead.
     * 
     */
    private final String contentType;
    /**
     * The list of headers to send as part of the Uptime check request. If two headers have the same key and different values, they should be entered as a single header, with the value being a comma-separated list of all the desired values as described at https://www.w3.org/Protocols/rfc2616/rfc2616.txt (page 31). Entering two separate headers with the same key in a Create call will cause the first to be overwritten by the second. The maximum number of headers allowed is 100.
     * 
     */
    private final Map<String,String> headers;
    /**
     * Boolean specifying whether to encrypt the header information. Encryption should be specified for any headers related to authentication that you do not wish to be seen when retrieving the configuration. The server will be responsible for encrypting the headers. On Get/List calls, if mask_headers is set to true then the headers will be obscured with ******.
     * 
     */
    private final Boolean maskHeaders;
    /**
     * Optional (defaults to "/"). The path to the page against which to run the check. Will be combined with the host (specified within the monitored_resource) and port to construct the full URL. If the provided path does not begin with "/", a "/" will be prepended automatically.
     * 
     */
    private final String path;
    /**
     * Optional (defaults to 80 when use_ssl is false, and 443 when use_ssl is true). The TCP port on the HTTP server against which to run the check. Will be combined with host (specified within the monitored_resource) and path to construct the full URL.
     * 
     */
    private final Integer port;
    /**
     * The HTTP request method to use for the check. If set to METHOD_UNSPECIFIED then request_method defaults to GET.
     * 
     */
    private final String requestMethod;
    /**
     * If true, use HTTPS instead of HTTP to run the check.
     * 
     */
    private final Boolean useSsl;
    /**
     * Boolean specifying whether to include SSL certificate validation as a part of the Uptime check. Only applies to checks where monitored_resource is set to uptime_url. If use_ssl is false, setting validate_ssl to true has no effect.
     * 
     */
    private final Boolean validateSsl;

    @CustomType.Constructor
    private HttpCheckResponse(
        @CustomType.Parameter("authInfo") BasicAuthenticationResponse authInfo,
        @CustomType.Parameter("body") String body,
        @CustomType.Parameter("contentType") String contentType,
        @CustomType.Parameter("headers") Map<String,String> headers,
        @CustomType.Parameter("maskHeaders") Boolean maskHeaders,
        @CustomType.Parameter("path") String path,
        @CustomType.Parameter("port") Integer port,
        @CustomType.Parameter("requestMethod") String requestMethod,
        @CustomType.Parameter("useSsl") Boolean useSsl,
        @CustomType.Parameter("validateSsl") Boolean validateSsl) {
        this.authInfo = authInfo;
        this.body = body;
        this.contentType = contentType;
        this.headers = headers;
        this.maskHeaders = maskHeaders;
        this.path = path;
        this.port = port;
        this.requestMethod = requestMethod;
        this.useSsl = useSsl;
        this.validateSsl = validateSsl;
    }

    /**
     * The authentication information. Optional when creating an HTTP check; defaults to empty.
     * 
    */
    public BasicAuthenticationResponse getAuthInfo() {
        return this.authInfo;
    }
    /**
     * The request body associated with the HTTP POST request. If content_type is URL_ENCODED, the body passed in must be URL-encoded. Users can provide a Content-Length header via the headers field or the API will do so. If the request_method is GET and body is not empty, the API will return an error. The maximum byte size is 1 megabyte.Note: If client libraries aren't used (which performs the conversion automatically) base64 encode your body data since the field is of bytes type.
     * 
    */
    public String getBody() {
        return this.body;
    }
    /**
     * The content type header to use for the check. The following configurations result in errors: 1. Content type is specified in both the headers field and the content_type field. 2. Request method is GET and content_type is not TYPE_UNSPECIFIED 3. Request method is POST and content_type is TYPE_UNSPECIFIED. 4. Request method is POST and a "Content-Type" header is provided via headers field. The content_type field should be used instead.
     * 
    */
    public String getContentType() {
        return this.contentType;
    }
    /**
     * The list of headers to send as part of the Uptime check request. If two headers have the same key and different values, they should be entered as a single header, with the value being a comma-separated list of all the desired values as described at https://www.w3.org/Protocols/rfc2616/rfc2616.txt (page 31). Entering two separate headers with the same key in a Create call will cause the first to be overwritten by the second. The maximum number of headers allowed is 100.
     * 
    */
    public Map<String,String> getHeaders() {
        return this.headers;
    }
    /**
     * Boolean specifying whether to encrypt the header information. Encryption should be specified for any headers related to authentication that you do not wish to be seen when retrieving the configuration. The server will be responsible for encrypting the headers. On Get/List calls, if mask_headers is set to true then the headers will be obscured with ******.
     * 
    */
    public Boolean getMaskHeaders() {
        return this.maskHeaders;
    }
    /**
     * Optional (defaults to "/"). The path to the page against which to run the check. Will be combined with the host (specified within the monitored_resource) and port to construct the full URL. If the provided path does not begin with "/", a "/" will be prepended automatically.
     * 
    */
    public String getPath() {
        return this.path;
    }
    /**
     * Optional (defaults to 80 when use_ssl is false, and 443 when use_ssl is true). The TCP port on the HTTP server against which to run the check. Will be combined with host (specified within the monitored_resource) and path to construct the full URL.
     * 
    */
    public Integer getPort() {
        return this.port;
    }
    /**
     * The HTTP request method to use for the check. If set to METHOD_UNSPECIFIED then request_method defaults to GET.
     * 
    */
    public String getRequestMethod() {
        return this.requestMethod;
    }
    /**
     * If true, use HTTPS instead of HTTP to run the check.
     * 
    */
    public Boolean getUseSsl() {
        return this.useSsl;
    }
    /**
     * Boolean specifying whether to include SSL certificate validation as a part of the Uptime check. Only applies to checks where monitored_resource is set to uptime_url. If use_ssl is false, setting validate_ssl to true has no effect.
     * 
    */
    public Boolean getValidateSsl() {
        return this.validateSsl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HttpCheckResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BasicAuthenticationResponse authInfo;
        private String body;
        private String contentType;
        private Map<String,String> headers;
        private Boolean maskHeaders;
        private String path;
        private Integer port;
        private String requestMethod;
        private Boolean useSsl;
        private Boolean validateSsl;

        public Builder() {
    	      // Empty
        }

        public Builder(HttpCheckResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authInfo = defaults.authInfo;
    	      this.body = defaults.body;
    	      this.contentType = defaults.contentType;
    	      this.headers = defaults.headers;
    	      this.maskHeaders = defaults.maskHeaders;
    	      this.path = defaults.path;
    	      this.port = defaults.port;
    	      this.requestMethod = defaults.requestMethod;
    	      this.useSsl = defaults.useSsl;
    	      this.validateSsl = defaults.validateSsl;
        }

        public Builder authInfo(BasicAuthenticationResponse authInfo) {
            this.authInfo = Objects.requireNonNull(authInfo);
            return this;
        }

        public Builder body(String body) {
            this.body = Objects.requireNonNull(body);
            return this;
        }

        public Builder contentType(String contentType) {
            this.contentType = Objects.requireNonNull(contentType);
            return this;
        }

        public Builder headers(Map<String,String> headers) {
            this.headers = Objects.requireNonNull(headers);
            return this;
        }

        public Builder maskHeaders(Boolean maskHeaders) {
            this.maskHeaders = Objects.requireNonNull(maskHeaders);
            return this;
        }

        public Builder path(String path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }

        public Builder port(Integer port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }

        public Builder requestMethod(String requestMethod) {
            this.requestMethod = Objects.requireNonNull(requestMethod);
            return this;
        }

        public Builder useSsl(Boolean useSsl) {
            this.useSsl = Objects.requireNonNull(useSsl);
            return this;
        }

        public Builder validateSsl(Boolean validateSsl) {
            this.validateSsl = Objects.requireNonNull(validateSsl);
            return this;
        }
        public HttpCheckResponse build() {
            return new HttpCheckResponse(authInfo, body, contentType, headers, maskHeaders, path, port, requestMethod, useSsl, validateSsl);
        }
    }
}
