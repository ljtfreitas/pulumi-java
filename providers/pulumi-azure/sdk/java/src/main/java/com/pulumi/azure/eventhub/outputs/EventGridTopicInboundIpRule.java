// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.eventhub.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EventGridTopicInboundIpRule {
    /**
     * @return The action to take when the rule is matched. Possible values are `Allow`.
     * 
     */
    private final @Nullable String action;
    /**
     * @return The IP mask (CIDR) to match on.
     * 
     */
    private final String ipMask;

    @CustomType.Constructor
    private EventGridTopicInboundIpRule(
        @CustomType.Parameter("action") @Nullable String action,
        @CustomType.Parameter("ipMask") String ipMask) {
        this.action = action;
        this.ipMask = ipMask;
    }

    /**
     * @return The action to take when the rule is matched. Possible values are `Allow`.
     * 
     */
    public Optional<String> action() {
        return Optional.ofNullable(this.action);
    }
    /**
     * @return The IP mask (CIDR) to match on.
     * 
     */
    public String ipMask() {
        return this.ipMask;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventGridTopicInboundIpRule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String action;
        private String ipMask;

        public Builder() {
    	      // Empty
        }

        public Builder(EventGridTopicInboundIpRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.ipMask = defaults.ipMask;
        }

        public Builder action(@Nullable String action) {
            this.action = action;
            return this;
        }
        public Builder ipMask(String ipMask) {
            this.ipMask = Objects.requireNonNull(ipMask);
            return this;
        }        public EventGridTopicInboundIpRule build() {
            return new EventGridTopicInboundIpRule(action, ipMask);
        }
    }
}
