// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.scheduler.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceBusAuthenticationResponse extends io.pulumi.resources.InvokeArgs {

    public static final ServiceBusAuthenticationResponse Empty = new ServiceBusAuthenticationResponse();

    /**
     * Gets or sets the SAS key.
     * 
     */
    @InputImport(name="sasKey")
        private final @Nullable String sasKey;

    public Optional<String> getSasKey() {
        return this.sasKey == null ? Optional.empty() : Optional.ofNullable(this.sasKey);
    }

    /**
     * Gets or sets the SAS key name.
     * 
     */
    @InputImport(name="sasKeyName")
        private final @Nullable String sasKeyName;

    public Optional<String> getSasKeyName() {
        return this.sasKeyName == null ? Optional.empty() : Optional.ofNullable(this.sasKeyName);
    }

    /**
     * Gets or sets the authentication type.
     * 
     */
    @InputImport(name="type")
        private final @Nullable String type;

    public Optional<String> getType() {
        return this.type == null ? Optional.empty() : Optional.ofNullable(this.type);
    }

    public ServiceBusAuthenticationResponse(
        @Nullable String sasKey,
        @Nullable String sasKeyName,
        @Nullable String type) {
        this.sasKey = sasKey;
        this.sasKeyName = sasKeyName;
        this.type = type;
    }

    private ServiceBusAuthenticationResponse() {
        this.sasKey = null;
        this.sasKeyName = null;
        this.type = null;
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

        public Builder setSasKey(@Nullable String sasKey) {
            this.sasKey = sasKey;
            return this;
        }

        public Builder setSasKeyName(@Nullable String sasKeyName) {
            this.sasKeyName = sasKeyName;
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = type;
            return this;
        }
        public ServiceBusAuthenticationResponse build() {
            return new ServiceBusAuthenticationResponse(sasKey, sasKeyName, type);
        }
    }
}
