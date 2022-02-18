// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.inputs.AddressPrefixItemResponse;
import io.pulumi.azurenative.network.inputs.ConfigurationGroupResponse;
import io.pulumi.azurenative.network.inputs.NetworkManagerSecurityGroupItemResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Network security default user rule.
 * 
 */
public final class ActiveDefaultSecurityUserRuleResponse extends io.pulumi.resources.InvokeArgs {

    public static final ActiveDefaultSecurityUserRuleResponse Empty = new ActiveDefaultSecurityUserRuleResponse();

    /**
     * Deployment time string.
     * 
     */
    @InputImport(name="commitTime")
    private final @Nullable String commitTime;

    public Optional<String> getCommitTime() {
        return this.commitTime == null ? Optional.empty() : Optional.ofNullable(this.commitTime);
    }

    /**
     * A description of the security user configuration.
     * 
     */
    @InputImport(name="configurationDescription")
    private final @Nullable String configurationDescription;

    public Optional<String> getConfigurationDescription() {
        return this.configurationDescription == null ? Optional.empty() : Optional.ofNullable(this.configurationDescription);
    }

    /**
     * A display name of the security user configuration.
     * 
     */
    @InputImport(name="configurationDisplayName")
    private final @Nullable String configurationDisplayName;

    public Optional<String> getConfigurationDisplayName() {
        return this.configurationDisplayName == null ? Optional.empty() : Optional.ofNullable(this.configurationDisplayName);
    }

    /**
     * A description for this rule. Restricted to 140 chars.
     * 
     */
    @InputImport(name="description", required=true)
    private final String description;

    public String getDescription() {
        return this.description;
    }

    /**
     * The destination port ranges.
     * 
     */
    @InputImport(name="destinationPortRanges", required=true)
    private final List<String> destinationPortRanges;

    public List<String> getDestinationPortRanges() {
        return this.destinationPortRanges;
    }

    /**
     * The destination address prefixes. CIDR or destination IP ranges.
     * 
     */
    @InputImport(name="destinations", required=true)
    private final List<AddressPrefixItemResponse> destinations;

    public List<AddressPrefixItemResponse> getDestinations() {
        return this.destinations;
    }

    /**
     * Indicates if the traffic matched against the rule in inbound or outbound.
     * 
     */
    @InputImport(name="direction", required=true)
    private final String direction;

    public String getDirection() {
        return this.direction;
    }

    /**
     * A friendly name for the rule.
     * 
     */
    @InputImport(name="displayName", required=true)
    private final String displayName;

    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * Default rule flag.
     * 
     */
    @InputImport(name="flag")
    private final @Nullable String flag;

    public Optional<String> getFlag() {
        return this.flag == null ? Optional.empty() : Optional.ofNullable(this.flag);
    }

    /**
     * Resource ID.
     * 
     */
    @InputImport(name="id")
    private final @Nullable String id;

    public Optional<String> getId() {
        return this.id == null ? Optional.empty() : Optional.ofNullable(this.id);
    }

    /**
     * Whether the rule is custom or default.
     * Expected value is 'Default'.
     * 
     */
    @InputImport(name="kind", required=true)
    private final String kind;

    public String getKind() {
        return this.kind;
    }

    /**
     * Network protocol this rule applies to.
     * 
     */
    @InputImport(name="protocol", required=true)
    private final String protocol;

    public String getProtocol() {
        return this.protocol;
    }

    /**
     * The provisioning state of the security configuration user rule resource.
     * 
     */
    @InputImport(name="provisioningState", required=true)
    private final String provisioningState;

    public String getProvisioningState() {
        return this.provisioningState;
    }

    /**
     * Deployment region.
     * 
     */
    @InputImport(name="region")
    private final @Nullable String region;

    public Optional<String> getRegion() {
        return this.region == null ? Optional.empty() : Optional.ofNullable(this.region);
    }

    /**
     * Groups for rule collection
     * 
     */
    @InputImport(name="ruleCollectionAppliesToGroups")
    private final @Nullable List<NetworkManagerSecurityGroupItemResponse> ruleCollectionAppliesToGroups;

    public List<NetworkManagerSecurityGroupItemResponse> getRuleCollectionAppliesToGroups() {
        return this.ruleCollectionAppliesToGroups == null ? List.of() : this.ruleCollectionAppliesToGroups;
    }

    /**
     * A description of the rule collection.
     * 
     */
    @InputImport(name="ruleCollectionDescription")
    private final @Nullable String ruleCollectionDescription;

    public Optional<String> getRuleCollectionDescription() {
        return this.ruleCollectionDescription == null ? Optional.empty() : Optional.ofNullable(this.ruleCollectionDescription);
    }

    /**
     * A display name of the rule collection.
     * 
     */
    @InputImport(name="ruleCollectionDisplayName")
    private final @Nullable String ruleCollectionDisplayName;

    public Optional<String> getRuleCollectionDisplayName() {
        return this.ruleCollectionDisplayName == null ? Optional.empty() : Optional.ofNullable(this.ruleCollectionDisplayName);
    }

    /**
     * Effective configuration groups.
     * 
     */
    @InputImport(name="ruleGroups")
    private final @Nullable List<ConfigurationGroupResponse> ruleGroups;

    public List<ConfigurationGroupResponse> getRuleGroups() {
        return this.ruleGroups == null ? List.of() : this.ruleGroups;
    }

    /**
     * The source port ranges.
     * 
     */
    @InputImport(name="sourcePortRanges", required=true)
    private final List<String> sourcePortRanges;

    public List<String> getSourcePortRanges() {
        return this.sourcePortRanges;
    }

    /**
     * The CIDR or source IP ranges.
     * 
     */
    @InputImport(name="sources", required=true)
    private final List<AddressPrefixItemResponse> sources;

    public List<AddressPrefixItemResponse> getSources() {
        return this.sources;
    }

    public ActiveDefaultSecurityUserRuleResponse(
        @Nullable String commitTime,
        @Nullable String configurationDescription,
        @Nullable String configurationDisplayName,
        String description,
        List<String> destinationPortRanges,
        List<AddressPrefixItemResponse> destinations,
        String direction,
        String displayName,
        @Nullable String flag,
        @Nullable String id,
        String kind,
        String protocol,
        String provisioningState,
        @Nullable String region,
        @Nullable List<NetworkManagerSecurityGroupItemResponse> ruleCollectionAppliesToGroups,
        @Nullable String ruleCollectionDescription,
        @Nullable String ruleCollectionDisplayName,
        @Nullable List<ConfigurationGroupResponse> ruleGroups,
        List<String> sourcePortRanges,
        List<AddressPrefixItemResponse> sources) {
        this.commitTime = commitTime;
        this.configurationDescription = configurationDescription;
        this.configurationDisplayName = configurationDisplayName;
        this.description = Objects.requireNonNull(description, "expected parameter 'description' to be non-null");
        this.destinationPortRanges = Objects.requireNonNull(destinationPortRanges, "expected parameter 'destinationPortRanges' to be non-null");
        this.destinations = Objects.requireNonNull(destinations, "expected parameter 'destinations' to be non-null");
        this.direction = Objects.requireNonNull(direction, "expected parameter 'direction' to be non-null");
        this.displayName = Objects.requireNonNull(displayName, "expected parameter 'displayName' to be non-null");
        this.flag = flag;
        this.id = id;
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
        this.protocol = Objects.requireNonNull(protocol, "expected parameter 'protocol' to be non-null");
        this.provisioningState = Objects.requireNonNull(provisioningState, "expected parameter 'provisioningState' to be non-null");
        this.region = region;
        this.ruleCollectionAppliesToGroups = ruleCollectionAppliesToGroups;
        this.ruleCollectionDescription = ruleCollectionDescription;
        this.ruleCollectionDisplayName = ruleCollectionDisplayName;
        this.ruleGroups = ruleGroups;
        this.sourcePortRanges = Objects.requireNonNull(sourcePortRanges, "expected parameter 'sourcePortRanges' to be non-null");
        this.sources = Objects.requireNonNull(sources, "expected parameter 'sources' to be non-null");
    }

    private ActiveDefaultSecurityUserRuleResponse() {
        this.commitTime = null;
        this.configurationDescription = null;
        this.configurationDisplayName = null;
        this.description = null;
        this.destinationPortRanges = List.of();
        this.destinations = List.of();
        this.direction = null;
        this.displayName = null;
        this.flag = null;
        this.id = null;
        this.kind = null;
        this.protocol = null;
        this.provisioningState = null;
        this.region = null;
        this.ruleCollectionAppliesToGroups = List.of();
        this.ruleCollectionDescription = null;
        this.ruleCollectionDisplayName = null;
        this.ruleGroups = List.of();
        this.sourcePortRanges = List.of();
        this.sources = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ActiveDefaultSecurityUserRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String commitTime;
        private @Nullable String configurationDescription;
        private @Nullable String configurationDisplayName;
        private String description;
        private List<String> destinationPortRanges;
        private List<AddressPrefixItemResponse> destinations;
        private String direction;
        private String displayName;
        private @Nullable String flag;
        private @Nullable String id;
        private String kind;
        private String protocol;
        private String provisioningState;
        private @Nullable String region;
        private @Nullable List<NetworkManagerSecurityGroupItemResponse> ruleCollectionAppliesToGroups;
        private @Nullable String ruleCollectionDescription;
        private @Nullable String ruleCollectionDisplayName;
        private @Nullable List<ConfigurationGroupResponse> ruleGroups;
        private List<String> sourcePortRanges;
        private List<AddressPrefixItemResponse> sources;

        public Builder() {
    	      // Empty
        }

        public Builder(ActiveDefaultSecurityUserRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.commitTime = defaults.commitTime;
    	      this.configurationDescription = defaults.configurationDescription;
    	      this.configurationDisplayName = defaults.configurationDisplayName;
    	      this.description = defaults.description;
    	      this.destinationPortRanges = defaults.destinationPortRanges;
    	      this.destinations = defaults.destinations;
    	      this.direction = defaults.direction;
    	      this.displayName = defaults.displayName;
    	      this.flag = defaults.flag;
    	      this.id = defaults.id;
    	      this.kind = defaults.kind;
    	      this.protocol = defaults.protocol;
    	      this.provisioningState = defaults.provisioningState;
    	      this.region = defaults.region;
    	      this.ruleCollectionAppliesToGroups = defaults.ruleCollectionAppliesToGroups;
    	      this.ruleCollectionDescription = defaults.ruleCollectionDescription;
    	      this.ruleCollectionDisplayName = defaults.ruleCollectionDisplayName;
    	      this.ruleGroups = defaults.ruleGroups;
    	      this.sourcePortRanges = defaults.sourcePortRanges;
    	      this.sources = defaults.sources;
        }

        public Builder setCommitTime(@Nullable String commitTime) {
            this.commitTime = commitTime;
            return this;
        }

        public Builder setConfigurationDescription(@Nullable String configurationDescription) {
            this.configurationDescription = configurationDescription;
            return this;
        }

        public Builder setConfigurationDisplayName(@Nullable String configurationDisplayName) {
            this.configurationDisplayName = configurationDisplayName;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setDestinationPortRanges(List<String> destinationPortRanges) {
            this.destinationPortRanges = Objects.requireNonNull(destinationPortRanges);
            return this;
        }

        public Builder setDestinations(List<AddressPrefixItemResponse> destinations) {
            this.destinations = Objects.requireNonNull(destinations);
            return this;
        }

        public Builder setDirection(String direction) {
            this.direction = Objects.requireNonNull(direction);
            return this;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder setFlag(@Nullable String flag) {
            this.flag = flag;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setProtocol(String protocol) {
            this.protocol = Objects.requireNonNull(protocol);
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setRegion(@Nullable String region) {
            this.region = region;
            return this;
        }

        public Builder setRuleCollectionAppliesToGroups(@Nullable List<NetworkManagerSecurityGroupItemResponse> ruleCollectionAppliesToGroups) {
            this.ruleCollectionAppliesToGroups = ruleCollectionAppliesToGroups;
            return this;
        }

        public Builder setRuleCollectionDescription(@Nullable String ruleCollectionDescription) {
            this.ruleCollectionDescription = ruleCollectionDescription;
            return this;
        }

        public Builder setRuleCollectionDisplayName(@Nullable String ruleCollectionDisplayName) {
            this.ruleCollectionDisplayName = ruleCollectionDisplayName;
            return this;
        }

        public Builder setRuleGroups(@Nullable List<ConfigurationGroupResponse> ruleGroups) {
            this.ruleGroups = ruleGroups;
            return this;
        }

        public Builder setSourcePortRanges(List<String> sourcePortRanges) {
            this.sourcePortRanges = Objects.requireNonNull(sourcePortRanges);
            return this;
        }

        public Builder setSources(List<AddressPrefixItemResponse> sources) {
            this.sources = Objects.requireNonNull(sources);
            return this;
        }

        public ActiveDefaultSecurityUserRuleResponse build() {
            return new ActiveDefaultSecurityUserRuleResponse(commitTime, configurationDescription, configurationDisplayName, description, destinationPortRanges, destinations, direction, displayName, flag, id, kind, protocol, provisioningState, region, ruleCollectionAppliesToGroups, ruleCollectionDescription, ruleCollectionDisplayName, ruleGroups, sourcePortRanges, sources);
        }
    }
}
