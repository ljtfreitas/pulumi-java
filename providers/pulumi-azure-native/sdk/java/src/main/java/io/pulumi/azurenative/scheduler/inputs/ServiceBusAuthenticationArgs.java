// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.scheduler.inputs;

import io.pulumi.azurenative.scheduler.enums.ServiceBusAuthenticationType;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServiceBusAuthenticationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceBusAuthenticationArgs Empty = new ServiceBusAuthenticationArgs();

    /**
     * Gets or sets the SAS key.
     * 
     */
    @InputImport(name="sasKey")
        private final @Nullable Input<String> sasKey;

    public Input<String> getSasKey() {
        return this.sasKey == null ? Input.empty() : this.sasKey;
    }

    /**
     * Gets or sets the SAS key name.
     * 
     */
    @InputImport(name="sasKeyName")
        private final @Nullable Input<String> sasKeyName;

    public Input<String> getSasKeyName() {
        return this.sasKeyName == null ? Input.empty() : this.sasKeyName;
    }

    /**
     * Gets or sets the authentication type.
     * 
     */
    @InputImport(name="type")
        private final @Nullable Input<ServiceBusAuthenticationType> type;

    public Input<ServiceBusAuthenticationType> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    public ServiceBusAuthenticationArgs(
        @Nullable Input<String> sasKey,
        @Nullable Input<String> sasKeyName,
        @Nullable Input<ServiceBusAuthenticationType> type) {
        this.sasKey = sasKey;
        this.sasKeyName = sasKeyName;
        this.type = type;
    }

    private ServiceBusAuthenticationArgs() {
        this.sasKey = Input.empty();
        this.sasKeyName = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceBusAuthenticationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> sasKey;
        private @Nullable Input<String> sasKeyName;
        private @Nullable Input<ServiceBusAuthenticationType> type;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceBusAuthenticationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sasKey = defaults.sasKey;
    	      this.sasKeyName = defaults.sasKeyName;
    	      this.type = defaults.type;
        }

        public Builder setSasKey(@Nullable Input<String> sasKey) {
            this.sasKey = sasKey;
            return this;
        }

        public Builder setSasKey(@Nullable String sasKey) {
            this.sasKey = Input.ofNullable(sasKey);
            return this;
        }

        public Builder setSasKeyName(@Nullable Input<String> sasKeyName) {
            this.sasKeyName = sasKeyName;
            return this;
        }

        public Builder setSasKeyName(@Nullable String sasKeyName) {
            this.sasKeyName = Input.ofNullable(sasKeyName);
            return this;
        }

        public Builder setType(@Nullable Input<ServiceBusAuthenticationType> type) {
            this.type = type;
            return this;
        }

        public Builder setType(@Nullable ServiceBusAuthenticationType type) {
            this.type = Input.ofNullable(type);
            return this;
        }
        public ServiceBusAuthenticationArgs build() {
            return new ServiceBusAuthenticationArgs(sasKey, sasKeyName, type);
        }
    }
}
