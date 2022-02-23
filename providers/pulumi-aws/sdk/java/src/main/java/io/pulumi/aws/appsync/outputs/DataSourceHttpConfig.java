// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appsync.outputs;

import io.pulumi.aws.appsync.outputs.DataSourceHttpConfigAuthorizationConfig;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DataSourceHttpConfig {
    /**
     * The authorization configuration in case the HTTP endpoint requires authorization. See Authorization Config.
     * 
     */
    private final @Nullable DataSourceHttpConfigAuthorizationConfig authorizationConfig;
    /**
     * HTTP URL.
     * 
     */
    private final String endpoint;

    @OutputCustomType.Constructor({"authorizationConfig","endpoint"})
    private DataSourceHttpConfig(
        @Nullable DataSourceHttpConfigAuthorizationConfig authorizationConfig,
        String endpoint) {
        this.authorizationConfig = authorizationConfig;
        this.endpoint = Objects.requireNonNull(endpoint);
    }

    /**
     * The authorization configuration in case the HTTP endpoint requires authorization. See Authorization Config.
     * 
     */
    public Optional<DataSourceHttpConfigAuthorizationConfig> getAuthorizationConfig() {
        return Optional.ofNullable(this.authorizationConfig);
    }
    /**
     * HTTP URL.
     * 
     */
    public String getEndpoint() {
        return this.endpoint;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceHttpConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable DataSourceHttpConfigAuthorizationConfig authorizationConfig;
        private String endpoint;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceHttpConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authorizationConfig = defaults.authorizationConfig;
    	      this.endpoint = defaults.endpoint;
        }

        public Builder setAuthorizationConfig(@Nullable DataSourceHttpConfigAuthorizationConfig authorizationConfig) {
            this.authorizationConfig = authorizationConfig;
            return this;
        }

        public Builder setEndpoint(String endpoint) {
            this.endpoint = Objects.requireNonNull(endpoint);
            return this;
        }
        public DataSourceHttpConfig build() {
            return new DataSourceHttpConfig(authorizationConfig, endpoint);
        }
    }
}
