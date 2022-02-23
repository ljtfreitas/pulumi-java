// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ses.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ConfigurationSetDeliveryOptionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConfigurationSetDeliveryOptionsArgs Empty = new ConfigurationSetDeliveryOptionsArgs();

    /**
     * Specifies whether messages that use the configuration set are required to use Transport Layer Security (TLS). If the value is `Require`, messages are only delivered if a TLS connection can be established. If the value is `Optional`, messages can be delivered in plain text if a TLS connection can't be established. Valid values: `Require` or `Optional`. Defaults to `Optional`.
     * 
     */
    @InputImport(name="tlsPolicy")
    private final @Nullable Input<String> tlsPolicy;

    public Input<String> getTlsPolicy() {
        return this.tlsPolicy == null ? Input.empty() : this.tlsPolicy;
    }

    public ConfigurationSetDeliveryOptionsArgs(@Nullable Input<String> tlsPolicy) {
        this.tlsPolicy = tlsPolicy;
    }

    private ConfigurationSetDeliveryOptionsArgs() {
        this.tlsPolicy = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConfigurationSetDeliveryOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> tlsPolicy;

        public Builder() {
    	      // Empty
        }

        public Builder(ConfigurationSetDeliveryOptionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.tlsPolicy = defaults.tlsPolicy;
        }

        public Builder setTlsPolicy(@Nullable Input<String> tlsPolicy) {
            this.tlsPolicy = tlsPolicy;
            return this;
        }

        public Builder setTlsPolicy(@Nullable String tlsPolicy) {
            this.tlsPolicy = Input.ofNullable(tlsPolicy);
            return this;
        }
        public ConfigurationSetDeliveryOptionsArgs build() {
            return new ConfigurationSetDeliveryOptionsArgs(tlsPolicy);
        }
    }
}