// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage.inputs;

import io.pulumi.azurenative.storage.inputs.IPRuleResponse;
import io.pulumi.azurenative.storage.inputs.ResourceAccessRuleResponse;
import io.pulumi.azurenative.storage.inputs.VirtualNetworkRuleResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Network rule set
 * 
 */
public final class NetworkRuleSetResponse extends io.pulumi.resources.InvokeArgs {

    public static final NetworkRuleSetResponse Empty = new NetworkRuleSetResponse();

    /**
     * Specifies whether traffic is bypassed for Logging/Metrics/AzureServices. Possible values are any combination of Logging|Metrics|AzureServices (For example, "Logging, Metrics"), or None to bypass none of those traffics.
     * 
     */
    @InputImport(name="bypass")
        private final @Nullable String bypass;

    public Optional<String> getBypass() {
        return this.bypass == null ? Optional.empty() : Optional.ofNullable(this.bypass);
    }

    /**
     * Specifies the default action of allow or deny when no other rules match.
     * 
     */
    @InputImport(name="defaultAction", required=true)
        private final String defaultAction;

    public String getDefaultAction() {
        return this.defaultAction;
    }

    /**
     * Sets the IP ACL rules
     * 
     */
    @InputImport(name="ipRules")
        private final @Nullable List<IPRuleResponse> ipRules;

    public List<IPRuleResponse> getIpRules() {
        return this.ipRules == null ? List.of() : this.ipRules;
    }

    /**
     * Sets the resource access rules
     * 
     */
    @InputImport(name="resourceAccessRules")
        private final @Nullable List<ResourceAccessRuleResponse> resourceAccessRules;

    public List<ResourceAccessRuleResponse> getResourceAccessRules() {
        return this.resourceAccessRules == null ? List.of() : this.resourceAccessRules;
    }

    /**
     * Sets the virtual network rules
     * 
     */
    @InputImport(name="virtualNetworkRules")
        private final @Nullable List<VirtualNetworkRuleResponse> virtualNetworkRules;

    public List<VirtualNetworkRuleResponse> getVirtualNetworkRules() {
        return this.virtualNetworkRules == null ? List.of() : this.virtualNetworkRules;
    }

    public NetworkRuleSetResponse(
        @Nullable String bypass,
        String defaultAction,
        @Nullable List<IPRuleResponse> ipRules,
        @Nullable List<ResourceAccessRuleResponse> resourceAccessRules,
        @Nullable List<VirtualNetworkRuleResponse> virtualNetworkRules) {
        this.bypass = bypass == null ? "AzureServices" : bypass;
        this.defaultAction = defaultAction == null ? "Allow" : Objects.requireNonNull(defaultAction, "expected parameter 'defaultAction' to be non-null");
        this.ipRules = ipRules;
        this.resourceAccessRules = resourceAccessRules;
        this.virtualNetworkRules = virtualNetworkRules;
    }

    private NetworkRuleSetResponse() {
        this.bypass = null;
        this.defaultAction = null;
        this.ipRules = List.of();
        this.resourceAccessRules = List.of();
        this.virtualNetworkRules = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkRuleSetResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String bypass;
        private String defaultAction;
        private @Nullable List<IPRuleResponse> ipRules;
        private @Nullable List<ResourceAccessRuleResponse> resourceAccessRules;
        private @Nullable List<VirtualNetworkRuleResponse> virtualNetworkRules;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkRuleSetResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bypass = defaults.bypass;
    	      this.defaultAction = defaults.defaultAction;
    	      this.ipRules = defaults.ipRules;
    	      this.resourceAccessRules = defaults.resourceAccessRules;
    	      this.virtualNetworkRules = defaults.virtualNetworkRules;
        }

        public Builder setBypass(@Nullable String bypass) {
            this.bypass = bypass;
            return this;
        }

        public Builder setDefaultAction(String defaultAction) {
            this.defaultAction = Objects.requireNonNull(defaultAction);
            return this;
        }

        public Builder setIpRules(@Nullable List<IPRuleResponse> ipRules) {
            this.ipRules = ipRules;
            return this;
        }

        public Builder setResourceAccessRules(@Nullable List<ResourceAccessRuleResponse> resourceAccessRules) {
            this.resourceAccessRules = resourceAccessRules;
            return this;
        }

        public Builder setVirtualNetworkRules(@Nullable List<VirtualNetworkRuleResponse> virtualNetworkRules) {
            this.virtualNetworkRules = virtualNetworkRules;
            return this;
        }
        public NetworkRuleSetResponse build() {
            return new NetworkRuleSetResponse(bypass, defaultAction, ipRules, resourceAccessRules, virtualNetworkRules);
        }
    }
}
