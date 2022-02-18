// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.m365securityandcompliance.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The settings for the CORS configuration of the service instance.
 * 
 */
public final class ServiceCorsConfigurationInfoArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceCorsConfigurationInfoArgs Empty = new ServiceCorsConfigurationInfoArgs();

    /**
     * If credentials are allowed via CORS.
     * 
     */
    @InputImport(name="allowCredentials")
    private final @Nullable Input<Boolean> allowCredentials;

    public Input<Boolean> getAllowCredentials() {
        return this.allowCredentials == null ? Input.empty() : this.allowCredentials;
    }

    /**
     * The headers to be allowed via CORS.
     * 
     */
    @InputImport(name="headers")
    private final @Nullable Input<List<String>> headers;

    public Input<List<String>> getHeaders() {
        return this.headers == null ? Input.empty() : this.headers;
    }

    /**
     * The max age to be allowed via CORS.
     * 
     */
    @InputImport(name="maxAge")
    private final @Nullable Input<Double> maxAge;

    public Input<Double> getMaxAge() {
        return this.maxAge == null ? Input.empty() : this.maxAge;
    }

    /**
     * The methods to be allowed via CORS.
     * 
     */
    @InputImport(name="methods")
    private final @Nullable Input<List<String>> methods;

    public Input<List<String>> getMethods() {
        return this.methods == null ? Input.empty() : this.methods;
    }

    /**
     * The origins to be allowed via CORS.
     * 
     */
    @InputImport(name="origins")
    private final @Nullable Input<List<String>> origins;

    public Input<List<String>> getOrigins() {
        return this.origins == null ? Input.empty() : this.origins;
    }

    public ServiceCorsConfigurationInfoArgs(
        @Nullable Input<Boolean> allowCredentials,
        @Nullable Input<List<String>> headers,
        @Nullable Input<Double> maxAge,
        @Nullable Input<List<String>> methods,
        @Nullable Input<List<String>> origins) {
        this.allowCredentials = allowCredentials;
        this.headers = headers;
        this.maxAge = maxAge;
        this.methods = methods;
        this.origins = origins;
    }

    private ServiceCorsConfigurationInfoArgs() {
        this.allowCredentials = Input.empty();
        this.headers = Input.empty();
        this.maxAge = Input.empty();
        this.methods = Input.empty();
        this.origins = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceCorsConfigurationInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> allowCredentials;
        private @Nullable Input<List<String>> headers;
        private @Nullable Input<Double> maxAge;
        private @Nullable Input<List<String>> methods;
        private @Nullable Input<List<String>> origins;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceCorsConfigurationInfoArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowCredentials = defaults.allowCredentials;
    	      this.headers = defaults.headers;
    	      this.maxAge = defaults.maxAge;
    	      this.methods = defaults.methods;
    	      this.origins = defaults.origins;
        }

        public Builder setAllowCredentials(@Nullable Input<Boolean> allowCredentials) {
            this.allowCredentials = allowCredentials;
            return this;
        }

        public Builder setAllowCredentials(@Nullable Boolean allowCredentials) {
            this.allowCredentials = Input.ofNullable(allowCredentials);
            return this;
        }

        public Builder setHeaders(@Nullable Input<List<String>> headers) {
            this.headers = headers;
            return this;
        }

        public Builder setHeaders(@Nullable List<String> headers) {
            this.headers = Input.ofNullable(headers);
            return this;
        }

        public Builder setMaxAge(@Nullable Input<Double> maxAge) {
            this.maxAge = maxAge;
            return this;
        }

        public Builder setMaxAge(@Nullable Double maxAge) {
            this.maxAge = Input.ofNullable(maxAge);
            return this;
        }

        public Builder setMethods(@Nullable Input<List<String>> methods) {
            this.methods = methods;
            return this;
        }

        public Builder setMethods(@Nullable List<String> methods) {
            this.methods = Input.ofNullable(methods);
            return this;
        }

        public Builder setOrigins(@Nullable Input<List<String>> origins) {
            this.origins = origins;
            return this;
        }

        public Builder setOrigins(@Nullable List<String> origins) {
            this.origins = Input.ofNullable(origins);
            return this;
        }

        public ServiceCorsConfigurationInfoArgs build() {
            return new ServiceCorsConfigurationInfoArgs(allowCredentials, headers, maxAge, methods, origins);
        }
    }
}
