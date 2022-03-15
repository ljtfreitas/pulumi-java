// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn.outputs;

import io.pulumi.azurenative.cdn.outputs.CdnEndpointResponse;
import io.pulumi.azurenative.cdn.outputs.CustomRuleListResponse;
import io.pulumi.azurenative.cdn.outputs.ManagedRuleSetListResponse;
import io.pulumi.azurenative.cdn.outputs.PolicySettingsResponse;
import io.pulumi.azurenative.cdn.outputs.RateLimitRuleListResponse;
import io.pulumi.azurenative.cdn.outputs.SkuResponse;
import io.pulumi.azurenative.cdn.outputs.SystemDataResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetPolicyResult {
    /**
     * Describes custom rules inside the policy.
     * 
     */
    private final @Nullable CustomRuleListResponse customRules;
    /**
     * Describes Azure CDN endpoints associated with this Web Application Firewall policy.
     * 
     */
    private final List<CdnEndpointResponse> endpointLinks;
    /**
     * Gets a unique read-only string that changes whenever the resource is updated.
     * 
     */
    private final @Nullable String etag;
    /**
     * Resource ID.
     * 
     */
    private final String id;
    /**
     * Resource location.
     * 
     */
    private final String location;
    /**
     * Describes managed rules inside the policy.
     * 
     */
    private final @Nullable ManagedRuleSetListResponse managedRules;
    /**
     * Resource name.
     * 
     */
    private final String name;
    /**
     * Describes  policySettings for policy
     * 
     */
    private final @Nullable PolicySettingsResponse policySettings;
    /**
     * Provisioning state of the WebApplicationFirewallPolicy.
     * 
     */
    private final String provisioningState;
    /**
     * Describes rate limit rules inside the policy.
     * 
     */
    private final @Nullable RateLimitRuleListResponse rateLimitRules;
    private final String resourceState;
    /**
     * The pricing tier (defines a CDN provider, feature list and rate) of the CdnWebApplicationFirewallPolicy.
     * 
     */
    private final SkuResponse sku;
    /**
     * Read only system data
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * Resource tags.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * Resource type.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetPolicyResult(
        @CustomType.Parameter("customRules") @Nullable CustomRuleListResponse customRules,
        @CustomType.Parameter("endpointLinks") List<CdnEndpointResponse> endpointLinks,
        @CustomType.Parameter("etag") @Nullable String etag,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("location") String location,
        @CustomType.Parameter("managedRules") @Nullable ManagedRuleSetListResponse managedRules,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("policySettings") @Nullable PolicySettingsResponse policySettings,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("rateLimitRules") @Nullable RateLimitRuleListResponse rateLimitRules,
        @CustomType.Parameter("resourceState") String resourceState,
        @CustomType.Parameter("sku") SkuResponse sku,
        @CustomType.Parameter("systemData") SystemDataResponse systemData,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("type") String type) {
        this.customRules = customRules;
        this.endpointLinks = endpointLinks;
        this.etag = etag;
        this.id = id;
        this.location = location;
        this.managedRules = managedRules;
        this.name = name;
        this.policySettings = policySettings;
        this.provisioningState = provisioningState;
        this.rateLimitRules = rateLimitRules;
        this.resourceState = resourceState;
        this.sku = sku;
        this.systemData = systemData;
        this.tags = tags;
        this.type = type;
    }

    /**
     * Describes custom rules inside the policy.
     * 
    */
    public Optional<CustomRuleListResponse> getCustomRules() {
        return Optional.ofNullable(this.customRules);
    }
    /**
     * Describes Azure CDN endpoints associated with this Web Application Firewall policy.
     * 
    */
    public List<CdnEndpointResponse> getEndpointLinks() {
        return this.endpointLinks;
    }
    /**
     * Gets a unique read-only string that changes whenever the resource is updated.
     * 
    */
    public Optional<String> getEtag() {
        return Optional.ofNullable(this.etag);
    }
    /**
     * Resource ID.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Resource location.
     * 
    */
    public String getLocation() {
        return this.location;
    }
    /**
     * Describes managed rules inside the policy.
     * 
    */
    public Optional<ManagedRuleSetListResponse> getManagedRules() {
        return Optional.ofNullable(this.managedRules);
    }
    /**
     * Resource name.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Describes  policySettings for policy
     * 
    */
    public Optional<PolicySettingsResponse> getPolicySettings() {
        return Optional.ofNullable(this.policySettings);
    }
    /**
     * Provisioning state of the WebApplicationFirewallPolicy.
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Describes rate limit rules inside the policy.
     * 
    */
    public Optional<RateLimitRuleListResponse> getRateLimitRules() {
        return Optional.ofNullable(this.rateLimitRules);
    }
    public String getResourceState() {
        return this.resourceState;
    }
    /**
     * The pricing tier (defines a CDN provider, feature list and rate) of the CdnWebApplicationFirewallPolicy.
     * 
    */
    public SkuResponse getSku() {
        return this.sku;
    }
    /**
     * Read only system data
     * 
    */
    public SystemDataResponse getSystemData() {
        return this.systemData;
    }
    /**
     * Resource tags.
     * 
    */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * Resource type.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPolicyResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable CustomRuleListResponse customRules;
        private List<CdnEndpointResponse> endpointLinks;
        private @Nullable String etag;
        private String id;
        private String location;
        private @Nullable ManagedRuleSetListResponse managedRules;
        private String name;
        private @Nullable PolicySettingsResponse policySettings;
        private String provisioningState;
        private @Nullable RateLimitRuleListResponse rateLimitRules;
        private String resourceState;
        private SkuResponse sku;
        private SystemDataResponse systemData;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPolicyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customRules = defaults.customRules;
    	      this.endpointLinks = defaults.endpointLinks;
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.managedRules = defaults.managedRules;
    	      this.name = defaults.name;
    	      this.policySettings = defaults.policySettings;
    	      this.provisioningState = defaults.provisioningState;
    	      this.rateLimitRules = defaults.rateLimitRules;
    	      this.resourceState = defaults.resourceState;
    	      this.sku = defaults.sku;
    	      this.systemData = defaults.systemData;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder customRules(@Nullable CustomRuleListResponse customRules) {
            this.customRules = customRules;
            return this;
        }

        public Builder endpointLinks(List<CdnEndpointResponse> endpointLinks) {
            this.endpointLinks = Objects.requireNonNull(endpointLinks);
            return this;
        }

        public Builder etag(@Nullable String etag) {
            this.etag = etag;
            return this;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder managedRules(@Nullable ManagedRuleSetListResponse managedRules) {
            this.managedRules = managedRules;
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder policySettings(@Nullable PolicySettingsResponse policySettings) {
            this.policySettings = policySettings;
            return this;
        }

        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder rateLimitRules(@Nullable RateLimitRuleListResponse rateLimitRules) {
            this.rateLimitRules = rateLimitRules;
            return this;
        }

        public Builder resourceState(String resourceState) {
            this.resourceState = Objects.requireNonNull(resourceState);
            return this;
        }

        public Builder sku(SkuResponse sku) {
            this.sku = Objects.requireNonNull(sku);
            return this;
        }

        public Builder systemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetPolicyResult build() {
            return new GetPolicyResult(customRules, endpointLinks, etag, id, location, managedRules, name, policySettings, provisioningState, rateLimitRules, resourceState, sku, systemData, tags, type);
        }
    }
}
