// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.keyvault.inputs;

import io.pulumi.azurenative.keyvault.enums.NetworkRuleAction;
import io.pulumi.azurenative.keyvault.enums.NetworkRuleBypassOptions;
import io.pulumi.azurenative.keyvault.inputs.MHSMIPRuleArgs;
import io.pulumi.azurenative.keyvault.inputs.MHSMVirtualNetworkRuleArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A set of rules governing the network accessibility of a managed hsm pool.
 * 
 */
public final class MHSMNetworkRuleSetArgs extends io.pulumi.resources.ResourceArgs {

    public static final MHSMNetworkRuleSetArgs Empty = new MHSMNetworkRuleSetArgs();

    /**
     * Tells what traffic can bypass network rules. This can be 'AzureServices' or 'None'.  If not specified the default is 'AzureServices'.
     * 
     */
    @InputImport(name="bypass")
        private final @Nullable Input<Either<String,NetworkRuleBypassOptions>> bypass;

    public Input<Either<String,NetworkRuleBypassOptions>> getBypass() {
        return this.bypass == null ? Input.empty() : this.bypass;
    }

    /**
     * The default action when no rule from ipRules and from virtualNetworkRules match. This is only used after the bypass property has been evaluated.
     * 
     */
    @InputImport(name="defaultAction")
        private final @Nullable Input<Either<String,NetworkRuleAction>> defaultAction;

    public Input<Either<String,NetworkRuleAction>> getDefaultAction() {
        return this.defaultAction == null ? Input.empty() : this.defaultAction;
    }

    /**
     * The list of IP address rules.
     * 
     */
    @InputImport(name="ipRules")
        private final @Nullable Input<List<MHSMIPRuleArgs>> ipRules;

    public Input<List<MHSMIPRuleArgs>> getIpRules() {
        return this.ipRules == null ? Input.empty() : this.ipRules;
    }

    /**
     * The list of virtual network rules.
     * 
     */
    @InputImport(name="virtualNetworkRules")
        private final @Nullable Input<List<MHSMVirtualNetworkRuleArgs>> virtualNetworkRules;

    public Input<List<MHSMVirtualNetworkRuleArgs>> getVirtualNetworkRules() {
        return this.virtualNetworkRules == null ? Input.empty() : this.virtualNetworkRules;
    }

    public MHSMNetworkRuleSetArgs(
        @Nullable Input<Either<String,NetworkRuleBypassOptions>> bypass,
        @Nullable Input<Either<String,NetworkRuleAction>> defaultAction,
        @Nullable Input<List<MHSMIPRuleArgs>> ipRules,
        @Nullable Input<List<MHSMVirtualNetworkRuleArgs>> virtualNetworkRules) {
        this.bypass = bypass;
        this.defaultAction = defaultAction;
        this.ipRules = ipRules;
        this.virtualNetworkRules = virtualNetworkRules;
    }

    private MHSMNetworkRuleSetArgs() {
        this.bypass = Input.empty();
        this.defaultAction = Input.empty();
        this.ipRules = Input.empty();
        this.virtualNetworkRules = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MHSMNetworkRuleSetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Either<String,NetworkRuleBypassOptions>> bypass;
        private @Nullable Input<Either<String,NetworkRuleAction>> defaultAction;
        private @Nullable Input<List<MHSMIPRuleArgs>> ipRules;
        private @Nullable Input<List<MHSMVirtualNetworkRuleArgs>> virtualNetworkRules;

        public Builder() {
    	      // Empty
        }

        public Builder(MHSMNetworkRuleSetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bypass = defaults.bypass;
    	      this.defaultAction = defaults.defaultAction;
    	      this.ipRules = defaults.ipRules;
    	      this.virtualNetworkRules = defaults.virtualNetworkRules;
        }

        public Builder setBypass(@Nullable Input<Either<String,NetworkRuleBypassOptions>> bypass) {
            this.bypass = bypass;
            return this;
        }

        public Builder setBypass(@Nullable Either<String,NetworkRuleBypassOptions> bypass) {
            this.bypass = Input.ofNullable(bypass);
            return this;
        }

        public Builder setDefaultAction(@Nullable Input<Either<String,NetworkRuleAction>> defaultAction) {
            this.defaultAction = defaultAction;
            return this;
        }

        public Builder setDefaultAction(@Nullable Either<String,NetworkRuleAction> defaultAction) {
            this.defaultAction = Input.ofNullable(defaultAction);
            return this;
        }

        public Builder setIpRules(@Nullable Input<List<MHSMIPRuleArgs>> ipRules) {
            this.ipRules = ipRules;
            return this;
        }

        public Builder setIpRules(@Nullable List<MHSMIPRuleArgs> ipRules) {
            this.ipRules = Input.ofNullable(ipRules);
            return this;
        }

        public Builder setVirtualNetworkRules(@Nullable Input<List<MHSMVirtualNetworkRuleArgs>> virtualNetworkRules) {
            this.virtualNetworkRules = virtualNetworkRules;
            return this;
        }

        public Builder setVirtualNetworkRules(@Nullable List<MHSMVirtualNetworkRuleArgs> virtualNetworkRules) {
            this.virtualNetworkRules = Input.ofNullable(virtualNetworkRules);
            return this;
        }
        public MHSMNetworkRuleSetArgs build() {
            return new MHSMNetworkRuleSetArgs(bypass, defaultAction, ipRules, virtualNetworkRules);
        }
    }
}
