// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicebus.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class NWRuleSetIpRulesResponse {
    /**
     * The IP Filter Action
     * 
     */
    private final @Nullable String action;
    /**
     * IP Mask
     * 
     */
    private final @Nullable String ipMask;

    @OutputCustomType.Constructor({"action","ipMask"})
    private NWRuleSetIpRulesResponse(
        @Nullable String action,
        @Nullable String ipMask) {
        this.action = action;
        this.ipMask = ipMask;
    }

    /**
     * The IP Filter Action
     * 
     */
    public Optional<String> getAction() {
        return Optional.ofNullable(this.action);
    }
    /**
     * IP Mask
     * 
     */
    public Optional<String> getIpMask() {
        return Optional.ofNullable(this.ipMask);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NWRuleSetIpRulesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String action;
        private @Nullable String ipMask;

        public Builder() {
    	      // Empty
        }

        public Builder(NWRuleSetIpRulesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.ipMask = defaults.ipMask;
        }

        public Builder setAction(@Nullable String action) {
            this.action = action;
            return this;
        }

        public Builder setIpMask(@Nullable String ipMask) {
            this.ipMask = ipMask;
            return this;
        }

        public NWRuleSetIpRulesResponse build() {
            return new NWRuleSetIpRulesResponse(action, ipMask);
        }
    }
}
