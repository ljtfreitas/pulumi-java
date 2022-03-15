// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.monitoring.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.gcp.monitoring.outputs.UptimeCheckConfigHttpCheckAuthInfo;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class UptimeCheckConfigHttpCheck {
    /**
     * The authentication information. Optional when creating an HTTP check; defaults to empty.
     * Structure is documented below.
     * 
     */
    private final @Nullable UptimeCheckConfigHttpCheckAuthInfo authInfo;
    /**
     * The request body associated with the HTTP POST request. If contentType is URL_ENCODED, the body passed in must be URL-encoded. Users can provide a Content-Length header via the headers field or the API will do so. If the requestMethod is GET and body is not empty, the API will return an error. The maximum byte size is 1 megabyte. Note - As with all bytes fields JSON representations are base64 encoded. e.g. "foo=bar" in URL-encoded form is "foo%3Dbar" and in base64 encoding is "Zm9vJTI1M0RiYXI=".
     * 
     */
    private final @Nullable String body;
    /**
     * The content type to use for the check.
     * Possible values are `TYPE_UNSPECIFIED` and `URL_ENCODED`.
     * 
     */
    private final @Nullable String contentType;
    /**
     * The list of headers to send as part of the uptime check request. If two headers have the same key and different values, they should be entered as a single header, with the value being a comma-separated list of all the desired values as described at https://www.w3.org/Protocols/rfc2616/rfc2616.txt (page 31). Entering two separate headers with the same key in a Create call will cause the first to be overwritten by the second. The maximum number of headers allowed is 100.
     * 
     */
    private final @Nullable Map<String,String> headers;
    /**
     * Boolean specifying whether to encrypt the header information. Encryption should be specified for any headers related to authentication that you do not wish to be seen when retrieving the configuration. The server will be responsible for encrypting the headers. On Get/List calls, if mask_headers is set to True then the headers will be obscured with ******.
     * 
     */
    private final @Nullable Boolean maskHeaders;
    /**
     * The path to the page to run the check against. Will be combined with the host (specified within the MonitoredResource) and port to construct the full URL. Optional (defaults to "/").
     * 
     */
    private final @Nullable String path;
    /**
     * The port to the page to run the check against. Will be combined with host (specified within the MonitoredResource) to construct the full URL.
     * 
     */
    private final @Nullable Integer port;
    /**
     * The HTTP request method to use for the check. If set to METHOD_UNSPECIFIED then requestMethod defaults to GET.
     * Default value is `GET`.
     * Possible values are `METHOD_UNSPECIFIED`, `GET`, and `POST`.
     * 
     */
    private final @Nullable String requestMethod;
    /**
     * If true, use HTTPS instead of HTTP to run the check.
     * 
     */
    private final @Nullable Boolean useSsl;
    /**
     * Boolean specifying whether to include SSL certificate validation as a part of the Uptime check. Only applies to checks where monitoredResource is set to uptime_url. If useSsl is false, setting validateSsl to true has no effect.
     * 
     */
    private final @Nullable Boolean validateSsl;

    @CustomType.Constructor
    private UptimeCheckConfigHttpCheck(
        @CustomType.Parameter("authInfo") @Nullable UptimeCheckConfigHttpCheckAuthInfo authInfo,
        @CustomType.Parameter("body") @Nullable String body,
        @CustomType.Parameter("contentType") @Nullable String contentType,
        @CustomType.Parameter("headers") @Nullable Map<String,String> headers,
        @CustomType.Parameter("maskHeaders") @Nullable Boolean maskHeaders,
        @CustomType.Parameter("path") @Nullable String path,
        @CustomType.Parameter("port") @Nullable Integer port,
        @CustomType.Parameter("requestMethod") @Nullable String requestMethod,
        @CustomType.Parameter("useSsl") @Nullable Boolean useSsl,
        @CustomType.Parameter("validateSsl") @Nullable Boolean validateSsl) {
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
     * Structure is documented below.
     * 
    */
    public Optional<UptimeCheckConfigHttpCheckAuthInfo> getAuthInfo() {
        return Optional.ofNullable(this.authInfo);
    }
    /**
     * The request body associated with the HTTP POST request. If contentType is URL_ENCODED, the body passed in must be URL-encoded. Users can provide a Content-Length header via the headers field or the API will do so. If the requestMethod is GET and body is not empty, the API will return an error. The maximum byte size is 1 megabyte. Note - As with all bytes fields JSON representations are base64 encoded. e.g. "foo=bar" in URL-encoded form is "foo%3Dbar" and in base64 encoding is "Zm9vJTI1M0RiYXI=".
     * 
    */
    public Optional<String> getBody() {
        return Optional.ofNullable(this.body);
    }
    /**
     * The content type to use for the check.
     * Possible values are `TYPE_UNSPECIFIED` and `URL_ENCODED`.
     * 
    */
    public Optional<String> getContentType() {
        return Optional.ofNullable(this.contentType);
    }
    /**
     * The list of headers to send as part of the uptime check request. If two headers have the same key and different values, they should be entered as a single header, with the value being a comma-separated list of all the desired values as described at https://www.w3.org/Protocols/rfc2616/rfc2616.txt (page 31). Entering two separate headers with the same key in a Create call will cause the first to be overwritten by the second. The maximum number of headers allowed is 100.
     * 
    */
    public Map<String,String> getHeaders() {
        return this.headers == null ? Map.of() : this.headers;
    }
    /**
     * Boolean specifying whether to encrypt the header information. Encryption should be specified for any headers related to authentication that you do not wish to be seen when retrieving the configuration. The server will be responsible for encrypting the headers. On Get/List calls, if mask_headers is set to True then the headers will be obscured with ******.
     * 
    */
    public Optional<Boolean> getMaskHeaders() {
        return Optional.ofNullable(this.maskHeaders);
    }
    /**
     * The path to the page to run the check against. Will be combined with the host (specified within the MonitoredResource) and port to construct the full URL. Optional (defaults to "/").
     * 
    */
    public Optional<String> getPath() {
        return Optional.ofNullable(this.path);
    }
    /**
     * The port to the page to run the check against. Will be combined with host (specified within the MonitoredResource) to construct the full URL.
     * 
    */
    public Optional<Integer> getPort() {
        return Optional.ofNullable(this.port);
    }
    /**
     * The HTTP request method to use for the check. If set to METHOD_UNSPECIFIED then requestMethod defaults to GET.
     * Default value is `GET`.
     * Possible values are `METHOD_UNSPECIFIED`, `GET`, and `POST`.
     * 
    */
    public Optional<String> getRequestMethod() {
        return Optional.ofNullable(this.requestMethod);
    }
    /**
     * If true, use HTTPS instead of HTTP to run the check.
     * 
    */
    public Optional<Boolean> getUseSsl() {
        return Optional.ofNullable(this.useSsl);
    }
    /**
     * Boolean specifying whether to include SSL certificate validation as a part of the Uptime check. Only applies to checks where monitoredResource is set to uptime_url. If useSsl is false, setting validateSsl to true has no effect.
     * 
    */
    public Optional<Boolean> getValidateSsl() {
        return Optional.ofNullable(this.validateSsl);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UptimeCheckConfigHttpCheck defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable UptimeCheckConfigHttpCheckAuthInfo authInfo;
        private @Nullable String body;
        private @Nullable String contentType;
        private @Nullable Map<String,String> headers;
        private @Nullable Boolean maskHeaders;
        private @Nullable String path;
        private @Nullable Integer port;
        private @Nullable String requestMethod;
        private @Nullable Boolean useSsl;
        private @Nullable Boolean validateSsl;

        public Builder() {
    	      // Empty
        }

        public Builder(UptimeCheckConfigHttpCheck defaults) {
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

        public Builder authInfo(@Nullable UptimeCheckConfigHttpCheckAuthInfo authInfo) {
            this.authInfo = authInfo;
            return this;
        }

        public Builder body(@Nullable String body) {
            this.body = body;
            return this;
        }

        public Builder contentType(@Nullable String contentType) {
            this.contentType = contentType;
            return this;
        }

        public Builder headers(@Nullable Map<String,String> headers) {
            this.headers = headers;
            return this;
        }

        public Builder maskHeaders(@Nullable Boolean maskHeaders) {
            this.maskHeaders = maskHeaders;
            return this;
        }

        public Builder path(@Nullable String path) {
            this.path = path;
            return this;
        }

        public Builder port(@Nullable Integer port) {
            this.port = port;
            return this;
        }

        public Builder requestMethod(@Nullable String requestMethod) {
            this.requestMethod = requestMethod;
            return this;
        }

        public Builder useSsl(@Nullable Boolean useSsl) {
            this.useSsl = useSsl;
            return this;
        }

        public Builder validateSsl(@Nullable Boolean validateSsl) {
            this.validateSsl = validateSsl;
            return this;
        }
        public UptimeCheckConfigHttpCheck build() {
            return new UptimeCheckConfigHttpCheck(authInfo, body, contentType, headers, maskHeaders, path, port, requestMethod, useSsl, validateSsl);
        }
    }
}
