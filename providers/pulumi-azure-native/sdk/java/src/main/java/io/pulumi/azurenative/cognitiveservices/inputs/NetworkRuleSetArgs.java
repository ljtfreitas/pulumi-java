// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cognitiveservices.inputs;

import io.pulumi.azurenative.cognitiveservices.enums.NetworkRuleAction;
import io.pulumi.azurenative.cognitiveservices.inputs.IpRuleArgs;
import io.pulumi.azurenative.cognitiveservices.inputs.VirtualNetworkRuleArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A set of rules governing the network accessibility.
 * 
 */
public final class NetworkRuleSetArgs extends io.pulumi.resources.ResourceArgs {

    public static final NetworkRuleSetArgs Empty = new NetworkRuleSetArgs();

    /**
     * The default action when no rule from ipRules and from virtualNetworkRules match. This is only used after the bypass property has been evaluated.
     * 
     */
    @Import(name="defaultAction")
      private final @Nullable Output<Either<String,NetworkRuleAction>> defaultAction;

    public Output<Either<String,NetworkRuleAction>> getDefaultAction() {
        return this.defaultAction == null ? Output.empty() : this.defaultAction;
    }

    /**
     * The list of IP address rules.
     * 
     */
    @Import(name="ipRules")
      private final @Nullable Output<List<IpRuleArgs>> ipRules;

    public Output<List<IpRuleArgs>> getIpRules() {
        return this.ipRules == null ? Output.empty() : this.ipRules;
    }

    /**
     * The list of virtual network rules.
     * 
     */
    @Import(name="virtualNetworkRules")
      private final @Nullable Output<List<VirtualNetworkRuleArgs>> virtualNetworkRules;

    public Output<List<VirtualNetworkRuleArgs>> getVirtualNetworkRules() {
        return this.virtualNetworkRules == null ? Output.empty() : this.virtualNetworkRules;
    }

    public NetworkRuleSetArgs(
        @Nullable Output<Either<String,NetworkRuleAction>> defaultAction,
        @Nullable Output<List<IpRuleArgs>> ipRules,
        @Nullable Output<List<VirtualNetworkRuleArgs>> virtualNetworkRules) {
        this.defaultAction = defaultAction;
        this.ipRules = ipRules;
        this.virtualNetworkRules = virtualNetworkRules;
    }

    private NetworkRuleSetArgs() {
        this.defaultAction = Output.empty();
        this.ipRules = Output.empty();
        this.virtualNetworkRules = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkRuleSetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Either<String,NetworkRuleAction>> defaultAction;
        private @Nullable Output<List<IpRuleArgs>> ipRules;
        private @Nullable Output<List<VirtualNetworkRuleArgs>> virtualNetworkRules;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkRuleSetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultAction = defaults.defaultAction;
    	      this.ipRules = defaults.ipRules;
    	      this.virtualNetworkRules = defaults.virtualNetworkRules;
        }

        public Builder defaultAction(@Nullable Output<Either<String,NetworkRuleAction>> defaultAction) {
            this.defaultAction = defaultAction;
            return this;
        }

        public Builder defaultAction(@Nullable Either<String,NetworkRuleAction> defaultAction) {
            this.defaultAction = Output.ofNullable(defaultAction);
            return this;
        }

        public Builder ipRules(@Nullable Output<List<IpRuleArgs>> ipRules) {
            this.ipRules = ipRules;
            return this;
        }

        public Builder ipRules(@Nullable List<IpRuleArgs> ipRules) {
            this.ipRules = Output.ofNullable(ipRules);
            return this;
        }

        public Builder virtualNetworkRules(@Nullable Output<List<VirtualNetworkRuleArgs>> virtualNetworkRules) {
            this.virtualNetworkRules = virtualNetworkRules;
            return this;
        }

        public Builder virtualNetworkRules(@Nullable List<VirtualNetworkRuleArgs> virtualNetworkRules) {
            this.virtualNetworkRules = Output.ofNullable(virtualNetworkRules);
            return this;
        }
        public NetworkRuleSetArgs build() {
            return new NetworkRuleSetArgs(defaultAction, ipRules, virtualNetworkRules);
        }
    }
}
