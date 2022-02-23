// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.azurenative.network.outputs.AddressPrefixItemResponse;
import io.pulumi.azurenative.network.outputs.SystemDataResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetDefaultAdminRuleResult {
    /**
     * Indicates the access allowed for this particular rule
     * 
     */
    private final String access;
    /**
     * A description for this rule. Restricted to 140 chars.
     * 
     */
    private final String description;
    /**
     * The destination port ranges.
     * 
     */
    private final List<String> destinationPortRanges;
    /**
     * The destination address prefixes. CIDR or destination IP ranges.
     * 
     */
    private final List<AddressPrefixItemResponse> destinations;
    /**
     * Indicates if the traffic matched against the rule in inbound or outbound.
     * 
     */
    private final String direction;
    /**
     * A friendly name for the rule.
     * 
     */
    private final String displayName;
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    private final String etag;
    /**
     * Default rule flag.
     * 
     */
    private final @Nullable String flag;
    /**
     * Resource ID.
     * 
     */
    private final String id;
    /**
     * Whether the rule is custom or default.
     * Expected value is 'Default'.
     * 
     */
    private final String kind;
    /**
     * Resource name.
     * 
     */
    private final String name;
    /**
     * The priority of the rule. The value can be between 1 and 4096. The priority number must be unique for each rule in the collection. The lower the priority number, the higher the priority of the rule.
     * 
     */
    private final Integer priority;
    /**
     * Network protocol this rule applies to.
     * 
     */
    private final String protocol;
    /**
     * The provisioning state of the resource.
     * 
     */
    private final String provisioningState;
    /**
     * The source port ranges.
     * 
     */
    private final List<String> sourcePortRanges;
    /**
     * The CIDR or source IP ranges.
     * 
     */
    private final List<AddressPrefixItemResponse> sources;
    /**
     * The system metadata related to this resource.
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * Resource type.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"access","description","destinationPortRanges","destinations","direction","displayName","etag","flag","id","kind","name","priority","protocol","provisioningState","sourcePortRanges","sources","systemData","type"})
    private GetDefaultAdminRuleResult(
        String access,
        String description,
        List<String> destinationPortRanges,
        List<AddressPrefixItemResponse> destinations,
        String direction,
        String displayName,
        String etag,
        @Nullable String flag,
        String id,
        String kind,
        String name,
        Integer priority,
        String protocol,
        String provisioningState,
        List<String> sourcePortRanges,
        List<AddressPrefixItemResponse> sources,
        SystemDataResponse systemData,
        String type) {
        this.access = Objects.requireNonNull(access);
        this.description = Objects.requireNonNull(description);
        this.destinationPortRanges = Objects.requireNonNull(destinationPortRanges);
        this.destinations = Objects.requireNonNull(destinations);
        this.direction = Objects.requireNonNull(direction);
        this.displayName = Objects.requireNonNull(displayName);
        this.etag = Objects.requireNonNull(etag);
        this.flag = flag;
        this.id = Objects.requireNonNull(id);
        this.kind = Objects.requireNonNull(kind);
        this.name = Objects.requireNonNull(name);
        this.priority = Objects.requireNonNull(priority);
        this.protocol = Objects.requireNonNull(protocol);
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.sourcePortRanges = Objects.requireNonNull(sourcePortRanges);
        this.sources = Objects.requireNonNull(sources);
        this.systemData = Objects.requireNonNull(systemData);
        this.type = Objects.requireNonNull(type);
    }

    /**
     * Indicates the access allowed for this particular rule
     * 
     */
    public String getAccess() {
        return this.access;
    }
    /**
     * A description for this rule. Restricted to 140 chars.
     * 
     */
    public String getDescription() {
        return this.description;
    }
    /**
     * The destination port ranges.
     * 
     */
    public List<String> getDestinationPortRanges() {
        return this.destinationPortRanges;
    }
    /**
     * The destination address prefixes. CIDR or destination IP ranges.
     * 
     */
    public List<AddressPrefixItemResponse> getDestinations() {
        return this.destinations;
    }
    /**
     * Indicates if the traffic matched against the rule in inbound or outbound.
     * 
     */
    public String getDirection() {
        return this.direction;
    }
    /**
     * A friendly name for the rule.
     * 
     */
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    public String getEtag() {
        return this.etag;
    }
    /**
     * Default rule flag.
     * 
     */
    public Optional<String> getFlag() {
        return Optional.ofNullable(this.flag);
    }
    /**
     * Resource ID.
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * Whether the rule is custom or default.
     * Expected value is 'Default'.
     * 
     */
    public String getKind() {
        return this.kind;
    }
    /**
     * Resource name.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * The priority of the rule. The value can be between 1 and 4096. The priority number must be unique for each rule in the collection. The lower the priority number, the higher the priority of the rule.
     * 
     */
    public Integer getPriority() {
        return this.priority;
    }
    /**
     * Network protocol this rule applies to.
     * 
     */
    public String getProtocol() {
        return this.protocol;
    }
    /**
     * The provisioning state of the resource.
     * 
     */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The source port ranges.
     * 
     */
    public List<String> getSourcePortRanges() {
        return this.sourcePortRanges;
    }
    /**
     * The CIDR or source IP ranges.
     * 
     */
    public List<AddressPrefixItemResponse> getSources() {
        return this.sources;
    }
    /**
     * The system metadata related to this resource.
     * 
     */
    public SystemDataResponse getSystemData() {
        return this.systemData;
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

    public static Builder builder(GetDefaultAdminRuleResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String access;
        private String description;
        private List<String> destinationPortRanges;
        private List<AddressPrefixItemResponse> destinations;
        private String direction;
        private String displayName;
        private String etag;
        private @Nullable String flag;
        private String id;
        private String kind;
        private String name;
        private Integer priority;
        private String protocol;
        private String provisioningState;
        private List<String> sourcePortRanges;
        private List<AddressPrefixItemResponse> sources;
        private SystemDataResponse systemData;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDefaultAdminRuleResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.access = defaults.access;
    	      this.description = defaults.description;
    	      this.destinationPortRanges = defaults.destinationPortRanges;
    	      this.destinations = defaults.destinations;
    	      this.direction = defaults.direction;
    	      this.displayName = defaults.displayName;
    	      this.etag = defaults.etag;
    	      this.flag = defaults.flag;
    	      this.id = defaults.id;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.priority = defaults.priority;
    	      this.protocol = defaults.protocol;
    	      this.provisioningState = defaults.provisioningState;
    	      this.sourcePortRanges = defaults.sourcePortRanges;
    	      this.sources = defaults.sources;
    	      this.systemData = defaults.systemData;
    	      this.type = defaults.type;
        }

        public Builder setAccess(String access) {
            this.access = Objects.requireNonNull(access);
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

        public Builder setEtag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder setFlag(@Nullable String flag) {
            this.flag = flag;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPriority(Integer priority) {
            this.priority = Objects.requireNonNull(priority);
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

        public Builder setSourcePortRanges(List<String> sourcePortRanges) {
            this.sourcePortRanges = Objects.requireNonNull(sourcePortRanges);
            return this;
        }

        public Builder setSources(List<AddressPrefixItemResponse> sources) {
            this.sources = Objects.requireNonNull(sources);
            return this;
        }

        public Builder setSystemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetDefaultAdminRuleResult build() {
            return new GetDefaultAdminRuleResult(access, description, destinationPortRanges, destinations, direction, displayName, etag, flag, id, kind, name, priority, protocol, provisioningState, sourcePortRanges, sources, systemData, type);
        }
    }
}
