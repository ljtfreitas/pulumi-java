// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devices.inputs;

import io.pulumi.azurenative.devices.inputs.NetworkRuleSetIpRuleResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Network Rule Set Properties of IotHub
 * 
 */
public final class NetworkRuleSetPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final NetworkRuleSetPropertiesResponse Empty = new NetworkRuleSetPropertiesResponse();

    /**
     * If True, then Network Rule Set is also applied to BuiltIn EventHub EndPoint of IotHub
     * 
     */
    @InputImport(name="applyToBuiltInEventHubEndpoint", required=true)
    private final Boolean applyToBuiltInEventHubEndpoint;

    public Boolean getApplyToBuiltInEventHubEndpoint() {
        return this.applyToBuiltInEventHubEndpoint;
    }

    /**
     * Default Action for Network Rule Set
     * 
     */
    @InputImport(name="defaultAction")
    private final @Nullable String defaultAction;

    public Optional<String> getDefaultAction() {
        return this.defaultAction == null ? Optional.empty() : Optional.ofNullable(this.defaultAction);
    }

    /**
     * List of IP Rules
     * 
     */
    @InputImport(name="ipRules", required=true)
    private final List<NetworkRuleSetIpRuleResponse> ipRules;

    public List<NetworkRuleSetIpRuleResponse> getIpRules() {
        return this.ipRules;
    }

    public NetworkRuleSetPropertiesResponse(
        Boolean applyToBuiltInEventHubEndpoint,
        @Nullable String defaultAction,
        List<NetworkRuleSetIpRuleResponse> ipRules) {
        this.applyToBuiltInEventHubEndpoint = Objects.requireNonNull(applyToBuiltInEventHubEndpoint, "expected parameter 'applyToBuiltInEventHubEndpoint' to be non-null");
        this.defaultAction = defaultAction == null ? "Deny" : defaultAction;
        this.ipRules = Objects.requireNonNull(ipRules, "expected parameter 'ipRules' to be non-null");
    }

    private NetworkRuleSetPropertiesResponse() {
        this.applyToBuiltInEventHubEndpoint = null;
        this.defaultAction = null;
        this.ipRules = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkRuleSetPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean applyToBuiltInEventHubEndpoint;
        private @Nullable String defaultAction;
        private List<NetworkRuleSetIpRuleResponse> ipRules;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkRuleSetPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applyToBuiltInEventHubEndpoint = defaults.applyToBuiltInEventHubEndpoint;
    	      this.defaultAction = defaults.defaultAction;
    	      this.ipRules = defaults.ipRules;
        }

        public Builder setApplyToBuiltInEventHubEndpoint(Boolean applyToBuiltInEventHubEndpoint) {
            this.applyToBuiltInEventHubEndpoint = Objects.requireNonNull(applyToBuiltInEventHubEndpoint);
            return this;
        }

        public Builder setDefaultAction(@Nullable String defaultAction) {
            this.defaultAction = defaultAction;
            return this;
        }

        public Builder setIpRules(List<NetworkRuleSetIpRuleResponse> ipRules) {
            this.ipRules = Objects.requireNonNull(ipRules);
            return this;
        }

        public NetworkRuleSetPropertiesResponse build() {
            return new NetworkRuleSetPropertiesResponse(applyToBuiltInEventHubEndpoint, defaultAction, ipRules);
        }
    }
}
