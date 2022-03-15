// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.scheduler.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServiceBusAuthenticationResponse {
    /**
     * Gets or sets the SAS key.
     * 
     */
    private final @Nullable String sasKey;
    /**
     * Gets or sets the SAS key name.
     * 
     */
    private final @Nullable String sasKeyName;
    /**
     * Gets or sets the authentication type.
     * 
     */
    private final @Nullable String type;

    @CustomType.Constructor
    private ServiceBusAuthenticationResponse(
        @CustomType.Parameter("sasKey") @Nullable String sasKey,
        @CustomType.Parameter("sasKeyName") @Nullable String sasKeyName,
        @CustomType.Parameter("type") @Nullable String type) {
        this.sasKey = sasKey;
        this.sasKeyName = sasKeyName;
        this.type = type;
    }

    /**
     * Gets or sets the SAS key.
     * 
    */
    public Optional<String> getSasKey() {
        return Optional.ofNullable(this.sasKey);
    }
    /**
     * Gets or sets the SAS key name.
     * 
    */
    public Optional<String> getSasKeyName() {
        return Optional.ofNullable(this.sasKeyName);
    }
    /**
     * Gets or sets the authentication type.
     * 
    */
    public Optional<String> getType() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceBusAuthenticationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String sasKey;
        private @Nullable String sasKeyName;
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceBusAuthenticationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sasKey = defaults.sasKey;
    	      this.sasKeyName = defaults.sasKeyName;
    	      this.type = defaults.type;
        }

        public Builder sasKey(@Nullable String sasKey) {
            this.sasKey = sasKey;
            return this;
        }

        public Builder sasKeyName(@Nullable String sasKeyName) {
            this.sasKeyName = sasKeyName;
            return this;
        }

        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }
        public ServiceBusAuthenticationResponse build() {
            return new ServiceBusAuthenticationResponse(sasKey, sasKeyName, type);
        }
    }
}
