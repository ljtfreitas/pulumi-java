// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerservice.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Settings for upgrading an agentpool
 * 
 */
public final class AgentPoolUpgradeSettingsResponse extends io.pulumi.resources.InvokeArgs {

    public static final AgentPoolUpgradeSettingsResponse Empty = new AgentPoolUpgradeSettingsResponse();

    /**
     * Count or percentage of additional nodes to be added during upgrade. If empty uses AKS default
     * 
     */
    @Import(name="maxSurge")
      private final @Nullable String maxSurge;

    public Optional<String> getMaxSurge() {
        return this.maxSurge == null ? Optional.empty() : Optional.ofNullable(this.maxSurge);
    }

    public AgentPoolUpgradeSettingsResponse(@Nullable String maxSurge) {
        this.maxSurge = maxSurge;
    }

    private AgentPoolUpgradeSettingsResponse() {
        this.maxSurge = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AgentPoolUpgradeSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String maxSurge;

        public Builder() {
    	      // Empty
        }

        public Builder(AgentPoolUpgradeSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxSurge = defaults.maxSurge;
        }

        public Builder maxSurge(@Nullable String maxSurge) {
            this.maxSurge = maxSurge;
            return this;
        }
        public AgentPoolUpgradeSettingsResponse build() {
            return new AgentPoolUpgradeSettingsResponse(maxSurge);
        }
    }
}
