// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.eventgrid.inputs;

import io.pulumi.azurenative.eventgrid.enums.IpActionType;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InboundIpRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final InboundIpRuleArgs Empty = new InboundIpRuleArgs();

    /**
     * Action to perform based on the match or no match of the IpMask.
     * 
     */
    @InputImport(name="action")
    private final @Nullable Input<Either<String,IpActionType>> action;

    public Input<Either<String,IpActionType>> getAction() {
        return this.action == null ? Input.empty() : this.action;
    }

    /**
     * IP Address in CIDR notation e.g., 10.0.0.0/8.
     * 
     */
    @InputImport(name="ipMask")
    private final @Nullable Input<String> ipMask;

    public Input<String> getIpMask() {
        return this.ipMask == null ? Input.empty() : this.ipMask;
    }

    public InboundIpRuleArgs(
        @Nullable Input<Either<String,IpActionType>> action,
        @Nullable Input<String> ipMask) {
        this.action = action;
        this.ipMask = ipMask;
    }

    private InboundIpRuleArgs() {
        this.action = Input.empty();
        this.ipMask = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InboundIpRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Either<String,IpActionType>> action;
        private @Nullable Input<String> ipMask;

        public Builder() {
    	      // Empty
        }

        public Builder(InboundIpRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.ipMask = defaults.ipMask;
        }

        public Builder setAction(@Nullable Input<Either<String,IpActionType>> action) {
            this.action = action;
            return this;
        }

        public Builder setAction(@Nullable Either<String,IpActionType> action) {
            this.action = Input.ofNullable(action);
            return this;
        }

        public Builder setIpMask(@Nullable Input<String> ipMask) {
            this.ipMask = ipMask;
            return this;
        }

        public Builder setIpMask(@Nullable String ipMask) {
            this.ipMask = Input.ofNullable(ipMask);
            return this;
        }

        public InboundIpRuleArgs build() {
            return new InboundIpRuleArgs(action, ipMask);
        }
    }
}
