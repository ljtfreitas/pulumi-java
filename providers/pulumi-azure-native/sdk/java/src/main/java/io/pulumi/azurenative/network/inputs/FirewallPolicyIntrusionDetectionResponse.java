// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.inputs.FirewallPolicyIntrusionDetectionConfigurationResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Configuration for intrusion detection mode and rules.
 * 
 */
public final class FirewallPolicyIntrusionDetectionResponse extends io.pulumi.resources.InvokeArgs {

    public static final FirewallPolicyIntrusionDetectionResponse Empty = new FirewallPolicyIntrusionDetectionResponse();

    /**
     * Intrusion detection configuration properties.
     * 
     */
    @InputImport(name="configuration")
        private final @Nullable FirewallPolicyIntrusionDetectionConfigurationResponse configuration;

    public Optional<FirewallPolicyIntrusionDetectionConfigurationResponse> getConfiguration() {
        return this.configuration == null ? Optional.empty() : Optional.ofNullable(this.configuration);
    }

    /**
     * Intrusion detection general state.
     * 
     */
    @InputImport(name="mode")
        private final @Nullable String mode;

    public Optional<String> getMode() {
        return this.mode == null ? Optional.empty() : Optional.ofNullable(this.mode);
    }

    public FirewallPolicyIntrusionDetectionResponse(
        @Nullable FirewallPolicyIntrusionDetectionConfigurationResponse configuration,
        @Nullable String mode) {
        this.configuration = configuration;
        this.mode = mode;
    }

    private FirewallPolicyIntrusionDetectionResponse() {
        this.configuration = null;
        this.mode = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallPolicyIntrusionDetectionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable FirewallPolicyIntrusionDetectionConfigurationResponse configuration;
        private @Nullable String mode;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallPolicyIntrusionDetectionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configuration = defaults.configuration;
    	      this.mode = defaults.mode;
        }

        public Builder setConfiguration(@Nullable FirewallPolicyIntrusionDetectionConfigurationResponse configuration) {
            this.configuration = configuration;
            return this;
        }

        public Builder setMode(@Nullable String mode) {
            this.mode = mode;
            return this;
        }
        public FirewallPolicyIntrusionDetectionResponse build() {
            return new FirewallPolicyIntrusionDetectionResponse(configuration, mode);
        }
    }
}
