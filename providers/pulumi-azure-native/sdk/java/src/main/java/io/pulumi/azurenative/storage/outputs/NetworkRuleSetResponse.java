// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage.outputs;

import io.pulumi.azurenative.storage.outputs.IPRuleResponse;
import io.pulumi.azurenative.storage.outputs.ResourceAccessRuleResponse;
import io.pulumi.azurenative.storage.outputs.VirtualNetworkRuleResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class NetworkRuleSetResponse {
    /**
     * Specifies whether traffic is bypassed for Logging/Metrics/AzureServices. Possible values are any combination of Logging|Metrics|AzureServices (For example, "Logging, Metrics"), or None to bypass none of those traffics.
     * 
     */
    private final @Nullable String bypass;
    /**
     * Specifies the default action of allow or deny when no other rules match.
     * 
     */
    private final String defaultAction;
    /**
     * Sets the IP ACL rules
     * 
     */
    private final @Nullable List<IPRuleResponse> ipRules;
    /**
     * Sets the resource access rules
     * 
     */
    private final @Nullable List<ResourceAccessRuleResponse> resourceAccessRules;
    /**
     * Sets the virtual network rules
     * 
     */
    private final @Nullable List<VirtualNetworkRuleResponse> virtualNetworkRules;

    @CustomType.Constructor
    private NetworkRuleSetResponse(
        @CustomType.Parameter("bypass") @Nullable String bypass,
        @CustomType.Parameter("defaultAction") String defaultAction,
        @CustomType.Parameter("ipRules") @Nullable List<IPRuleResponse> ipRules,
        @CustomType.Parameter("resourceAccessRules") @Nullable List<ResourceAccessRuleResponse> resourceAccessRules,
        @CustomType.Parameter("virtualNetworkRules") @Nullable List<VirtualNetworkRuleResponse> virtualNetworkRules) {
        this.bypass = bypass;
        this.defaultAction = defaultAction;
        this.ipRules = ipRules;
        this.resourceAccessRules = resourceAccessRules;
        this.virtualNetworkRules = virtualNetworkRules;
    }

    /**
     * Specifies whether traffic is bypassed for Logging/Metrics/AzureServices. Possible values are any combination of Logging|Metrics|AzureServices (For example, "Logging, Metrics"), or None to bypass none of those traffics.
     * 
    */
    public Optional<String> getBypass() {
        return Optional.ofNullable(this.bypass);
    }
    /**
     * Specifies the default action of allow or deny when no other rules match.
     * 
    */
    public String getDefaultAction() {
        return this.defaultAction;
    }
    /**
     * Sets the IP ACL rules
     * 
    */
    public List<IPRuleResponse> getIpRules() {
        return this.ipRules == null ? List.of() : this.ipRules;
    }
    /**
     * Sets the resource access rules
     * 
    */
    public List<ResourceAccessRuleResponse> getResourceAccessRules() {
        return this.resourceAccessRules == null ? List.of() : this.resourceAccessRules;
    }
    /**
     * Sets the virtual network rules
     * 
    */
    public List<VirtualNetworkRuleResponse> getVirtualNetworkRules() {
        return this.virtualNetworkRules == null ? List.of() : this.virtualNetworkRules;
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

        public Builder bypass(@Nullable String bypass) {
            this.bypass = bypass;
            return this;
        }

        public Builder defaultAction(String defaultAction) {
            this.defaultAction = Objects.requireNonNull(defaultAction);
            return this;
        }

        public Builder ipRules(@Nullable List<IPRuleResponse> ipRules) {
            this.ipRules = ipRules;
            return this;
        }

        public Builder resourceAccessRules(@Nullable List<ResourceAccessRuleResponse> resourceAccessRules) {
            this.resourceAccessRules = resourceAccessRules;
            return this;
        }

        public Builder virtualNetworkRules(@Nullable List<VirtualNetworkRuleResponse> virtualNetworkRules) {
            this.virtualNetworkRules = virtualNetworkRules;
            return this;
        }
        public NetworkRuleSetResponse build() {
            return new NetworkRuleSetResponse(bypass, defaultAction, ipRules, resourceAccessRules, virtualNetworkRules);
        }
    }
}
