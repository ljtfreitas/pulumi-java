// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.eventgrid.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class InboundIpRuleResponse {
    /**
     * Action to perform based on the match or no match of the IpMask.
     * 
     */
    private final @Nullable String action;
    /**
     * IP Address in CIDR notation e.g., 10.0.0.0/8.
     * 
     */
    private final @Nullable String ipMask;

    @CustomType.Constructor
    private InboundIpRuleResponse(
        @CustomType.Parameter("action") @Nullable String action,
        @CustomType.Parameter("ipMask") @Nullable String ipMask) {
        this.action = action;
        this.ipMask = ipMask;
    }

    /**
     * Action to perform based on the match or no match of the IpMask.
     * 
    */
    public Optional<String> getAction() {
        return Optional.ofNullable(this.action);
    }
    /**
     * IP Address in CIDR notation e.g., 10.0.0.0/8.
     * 
    */
    public Optional<String> getIpMask() {
        return Optional.ofNullable(this.ipMask);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InboundIpRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String action;
        private @Nullable String ipMask;

        public Builder() {
    	      // Empty
        }

        public Builder(InboundIpRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.ipMask = defaults.ipMask;
        }

        public Builder action(@Nullable String action) {
            this.action = action;
            return this;
        }

        public Builder ipMask(@Nullable String ipMask) {
            this.ipMask = ipMask;
            return this;
        }
        public InboundIpRuleResponse build() {
            return new InboundIpRuleResponse(action, ipMask);
        }
    }
}
