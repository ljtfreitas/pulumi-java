// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.events.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ConnectionApiKeyAuthParameters {
    private final String apiKeyName;
    private final String apiKeyValue;

    @CustomType.Constructor
    private ConnectionApiKeyAuthParameters(
        @CustomType.Parameter("apiKeyName") String apiKeyName,
        @CustomType.Parameter("apiKeyValue") String apiKeyValue) {
        this.apiKeyName = apiKeyName;
        this.apiKeyValue = apiKeyValue;
    }

    public String getApiKeyName() {
        return this.apiKeyName;
    }
    public String getApiKeyValue() {
        return this.apiKeyValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionApiKeyAuthParameters defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String apiKeyName;
        private String apiKeyValue;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectionApiKeyAuthParameters defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiKeyName = defaults.apiKeyName;
    	      this.apiKeyValue = defaults.apiKeyValue;
        }

        public Builder apiKeyName(String apiKeyName) {
            this.apiKeyName = Objects.requireNonNull(apiKeyName);
            return this;
        }

        public Builder apiKeyValue(String apiKeyValue) {
            this.apiKeyValue = Objects.requireNonNull(apiKeyValue);
            return this;
        }
        public ConnectionApiKeyAuthParameters build() {
            return new ConnectionApiKeyAuthParameters(apiKeyName, apiKeyValue);
        }
    }
}
