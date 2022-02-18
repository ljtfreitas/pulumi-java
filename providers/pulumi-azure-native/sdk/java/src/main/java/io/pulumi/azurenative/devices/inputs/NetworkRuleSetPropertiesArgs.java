// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devices.inputs;

import io.pulumi.azurenative.devices.enums.DefaultAction;
import io.pulumi.azurenative.devices.inputs.NetworkRuleSetIpRuleArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Network Rule Set Properties of IotHub
 * 
 */
public final class NetworkRuleSetPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final NetworkRuleSetPropertiesArgs Empty = new NetworkRuleSetPropertiesArgs();

    /**
     * If True, then Network Rule Set is also applied to BuiltIn EventHub EndPoint of IotHub
     * 
     */
    @InputImport(name="applyToBuiltInEventHubEndpoint", required=true)
    private final Input<Boolean> applyToBuiltInEventHubEndpoint;

    public Input<Boolean> getApplyToBuiltInEventHubEndpoint() {
        return this.applyToBuiltInEventHubEndpoint;
    }

    /**
     * Default Action for Network Rule Set
     * 
     */
    @InputImport(name="defaultAction")
    private final @Nullable Input<Either<String,DefaultAction>> defaultAction;

    public Input<Either<String,DefaultAction>> getDefaultAction() {
        return this.defaultAction == null ? Input.empty() : this.defaultAction;
    }

    /**
     * List of IP Rules
     * 
     */
    @InputImport(name="ipRules", required=true)
    private final Input<List<NetworkRuleSetIpRuleArgs>> ipRules;

    public Input<List<NetworkRuleSetIpRuleArgs>> getIpRules() {
        return this.ipRules;
    }

    public NetworkRuleSetPropertiesArgs(
        Input<Boolean> applyToBuiltInEventHubEndpoint,
        @Nullable Input<Either<String,DefaultAction>> defaultAction,
        Input<List<NetworkRuleSetIpRuleArgs>> ipRules) {
        this.applyToBuiltInEventHubEndpoint = Objects.requireNonNull(applyToBuiltInEventHubEndpoint, "expected parameter 'applyToBuiltInEventHubEndpoint' to be non-null");
        this.defaultAction = defaultAction == null ? Input.ofLeft("Deny") : defaultAction;
        this.ipRules = Objects.requireNonNull(ipRules, "expected parameter 'ipRules' to be non-null");
    }

    private NetworkRuleSetPropertiesArgs() {
        this.applyToBuiltInEventHubEndpoint = Input.empty();
        this.defaultAction = Input.empty();
        this.ipRules = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkRuleSetPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Boolean> applyToBuiltInEventHubEndpoint;
        private @Nullable Input<Either<String,DefaultAction>> defaultAction;
        private Input<List<NetworkRuleSetIpRuleArgs>> ipRules;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkRuleSetPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applyToBuiltInEventHubEndpoint = defaults.applyToBuiltInEventHubEndpoint;
    	      this.defaultAction = defaults.defaultAction;
    	      this.ipRules = defaults.ipRules;
        }

        public Builder setApplyToBuiltInEventHubEndpoint(Input<Boolean> applyToBuiltInEventHubEndpoint) {
            this.applyToBuiltInEventHubEndpoint = Objects.requireNonNull(applyToBuiltInEventHubEndpoint);
            return this;
        }

        public Builder setApplyToBuiltInEventHubEndpoint(Boolean applyToBuiltInEventHubEndpoint) {
            this.applyToBuiltInEventHubEndpoint = Input.of(Objects.requireNonNull(applyToBuiltInEventHubEndpoint));
            return this;
        }

        public Builder setDefaultAction(@Nullable Input<Either<String,DefaultAction>> defaultAction) {
            this.defaultAction = defaultAction;
            return this;
        }

        public Builder setDefaultAction(@Nullable Either<String,DefaultAction> defaultAction) {
            this.defaultAction = Input.ofNullable(defaultAction);
            return this;
        }

        public Builder setIpRules(Input<List<NetworkRuleSetIpRuleArgs>> ipRules) {
            this.ipRules = Objects.requireNonNull(ipRules);
            return this;
        }

        public Builder setIpRules(List<NetworkRuleSetIpRuleArgs> ipRules) {
            this.ipRules = Input.of(Objects.requireNonNull(ipRules));
            return this;
        }

        public NetworkRuleSetPropertiesArgs build() {
            return new NetworkRuleSetPropertiesArgs(applyToBuiltInEventHubEndpoint, defaultAction, ipRules);
        }
    }
}
