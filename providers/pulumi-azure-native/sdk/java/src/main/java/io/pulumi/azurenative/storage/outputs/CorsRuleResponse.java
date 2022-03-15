// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class CorsRuleResponse {
    /**
     * Required if CorsRule element is present. A list of headers allowed to be part of the cross-origin request.
     * 
     */
    private final List<String> allowedHeaders;
    /**
     * Required if CorsRule element is present. A list of HTTP methods that are allowed to be executed by the origin.
     * 
     */
    private final List<String> allowedMethods;
    /**
     * Required if CorsRule element is present. A list of origin domains that will be allowed via CORS, or "*" to allow all domains
     * 
     */
    private final List<String> allowedOrigins;
    /**
     * Required if CorsRule element is present. A list of response headers to expose to CORS clients.
     * 
     */
    private final List<String> exposedHeaders;
    /**
     * Required if CorsRule element is present. The number of seconds that the client/browser should cache a preflight response.
     * 
     */
    private final Integer maxAgeInSeconds;

    @CustomType.Constructor
    private CorsRuleResponse(
        @CustomType.Parameter("allowedHeaders") List<String> allowedHeaders,
        @CustomType.Parameter("allowedMethods") List<String> allowedMethods,
        @CustomType.Parameter("allowedOrigins") List<String> allowedOrigins,
        @CustomType.Parameter("exposedHeaders") List<String> exposedHeaders,
        @CustomType.Parameter("maxAgeInSeconds") Integer maxAgeInSeconds) {
        this.allowedHeaders = allowedHeaders;
        this.allowedMethods = allowedMethods;
        this.allowedOrigins = allowedOrigins;
        this.exposedHeaders = exposedHeaders;
        this.maxAgeInSeconds = maxAgeInSeconds;
    }

    /**
     * Required if CorsRule element is present. A list of headers allowed to be part of the cross-origin request.
     * 
    */
    public List<String> getAllowedHeaders() {
        return this.allowedHeaders;
    }
    /**
     * Required if CorsRule element is present. A list of HTTP methods that are allowed to be executed by the origin.
     * 
    */
    public List<String> getAllowedMethods() {
        return this.allowedMethods;
    }
    /**
     * Required if CorsRule element is present. A list of origin domains that will be allowed via CORS, or "*" to allow all domains
     * 
    */
    public List<String> getAllowedOrigins() {
        return this.allowedOrigins;
    }
    /**
     * Required if CorsRule element is present. A list of response headers to expose to CORS clients.
     * 
    */
    public List<String> getExposedHeaders() {
        return this.exposedHeaders;
    }
    /**
     * Required if CorsRule element is present. The number of seconds that the client/browser should cache a preflight response.
     * 
    */
    public Integer getMaxAgeInSeconds() {
        return this.maxAgeInSeconds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CorsRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> allowedHeaders;
        private List<String> allowedMethods;
        private List<String> allowedOrigins;
        private List<String> exposedHeaders;
        private Integer maxAgeInSeconds;

        public Builder() {
    	      // Empty
        }

        public Builder(CorsRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedHeaders = defaults.allowedHeaders;
    	      this.allowedMethods = defaults.allowedMethods;
    	      this.allowedOrigins = defaults.allowedOrigins;
    	      this.exposedHeaders = defaults.exposedHeaders;
    	      this.maxAgeInSeconds = defaults.maxAgeInSeconds;
        }

        public Builder allowedHeaders(List<String> allowedHeaders) {
            this.allowedHeaders = Objects.requireNonNull(allowedHeaders);
            return this;
        }

        public Builder allowedMethods(List<String> allowedMethods) {
            this.allowedMethods = Objects.requireNonNull(allowedMethods);
            return this;
        }

        public Builder allowedOrigins(List<String> allowedOrigins) {
            this.allowedOrigins = Objects.requireNonNull(allowedOrigins);
            return this;
        }

        public Builder exposedHeaders(List<String> exposedHeaders) {
            this.exposedHeaders = Objects.requireNonNull(exposedHeaders);
            return this;
        }

        public Builder maxAgeInSeconds(Integer maxAgeInSeconds) {
            this.maxAgeInSeconds = Objects.requireNonNull(maxAgeInSeconds);
            return this;
        }
        public CorsRuleResponse build() {
            return new CorsRuleResponse(allowedHeaders, allowedMethods, allowedOrigins, exposedHeaders, maxAgeInSeconds);
        }
    }
}
