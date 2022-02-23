// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * DDoS custom policy properties.
 * 
 */
public final class ProtocolCustomSettingsFormatResponse extends io.pulumi.resources.InvokeArgs {

    public static final ProtocolCustomSettingsFormatResponse Empty = new ProtocolCustomSettingsFormatResponse();

    /**
     * The protocol for which the DDoS protection policy is being customized.
     * 
     */
    @InputImport(name="protocol")
        private final @Nullable String protocol;

    public Optional<String> getProtocol() {
        return this.protocol == null ? Optional.empty() : Optional.ofNullable(this.protocol);
    }

    /**
     * The customized DDoS protection source rate.
     * 
     */
    @InputImport(name="sourceRateOverride")
        private final @Nullable String sourceRateOverride;

    public Optional<String> getSourceRateOverride() {
        return this.sourceRateOverride == null ? Optional.empty() : Optional.ofNullable(this.sourceRateOverride);
    }

    /**
     * The customized DDoS protection trigger rate.
     * 
     */
    @InputImport(name="triggerRateOverride")
        private final @Nullable String triggerRateOverride;

    public Optional<String> getTriggerRateOverride() {
        return this.triggerRateOverride == null ? Optional.empty() : Optional.ofNullable(this.triggerRateOverride);
    }

    /**
     * The customized DDoS protection trigger rate sensitivity degrees. High: Trigger rate set with most sensitivity w.r.t. normal traffic. Default: Trigger rate set with moderate sensitivity w.r.t. normal traffic. Low: Trigger rate set with less sensitivity w.r.t. normal traffic. Relaxed: Trigger rate set with least sensitivity w.r.t. normal traffic.
     * 
     */
    @InputImport(name="triggerSensitivityOverride")
        private final @Nullable String triggerSensitivityOverride;

    public Optional<String> getTriggerSensitivityOverride() {
        return this.triggerSensitivityOverride == null ? Optional.empty() : Optional.ofNullable(this.triggerSensitivityOverride);
    }

    public ProtocolCustomSettingsFormatResponse(
        @Nullable String protocol,
        @Nullable String sourceRateOverride,
        @Nullable String triggerRateOverride,
        @Nullable String triggerSensitivityOverride) {
        this.protocol = protocol;
        this.sourceRateOverride = sourceRateOverride;
        this.triggerRateOverride = triggerRateOverride;
        this.triggerSensitivityOverride = triggerSensitivityOverride;
    }

    private ProtocolCustomSettingsFormatResponse() {
        this.protocol = null;
        this.sourceRateOverride = null;
        this.triggerRateOverride = null;
        this.triggerSensitivityOverride = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProtocolCustomSettingsFormatResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String protocol;
        private @Nullable String sourceRateOverride;
        private @Nullable String triggerRateOverride;
        private @Nullable String triggerSensitivityOverride;

        public Builder() {
    	      // Empty
        }

        public Builder(ProtocolCustomSettingsFormatResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.protocol = defaults.protocol;
    	      this.sourceRateOverride = defaults.sourceRateOverride;
    	      this.triggerRateOverride = defaults.triggerRateOverride;
    	      this.triggerSensitivityOverride = defaults.triggerSensitivityOverride;
        }

        public Builder setProtocol(@Nullable String protocol) {
            this.protocol = protocol;
            return this;
        }

        public Builder setSourceRateOverride(@Nullable String sourceRateOverride) {
            this.sourceRateOverride = sourceRateOverride;
            return this;
        }

        public Builder setTriggerRateOverride(@Nullable String triggerRateOverride) {
            this.triggerRateOverride = triggerRateOverride;
            return this;
        }

        public Builder setTriggerSensitivityOverride(@Nullable String triggerSensitivityOverride) {
            this.triggerSensitivityOverride = triggerSensitivityOverride;
            return this;
        }
        public ProtocolCustomSettingsFormatResponse build() {
            return new ProtocolCustomSettingsFormatResponse(protocol, sourceRateOverride, triggerRateOverride, triggerSensitivityOverride);
        }
    }
}
