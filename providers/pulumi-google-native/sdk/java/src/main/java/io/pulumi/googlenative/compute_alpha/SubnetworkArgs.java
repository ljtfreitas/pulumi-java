// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.compute_alpha.enums.SubnetworkAggregationInterval;
import io.pulumi.googlenative.compute_alpha.enums.SubnetworkIpv6AccessType;
import io.pulumi.googlenative.compute_alpha.enums.SubnetworkMetadata;
import io.pulumi.googlenative.compute_alpha.enums.SubnetworkPrivateIpv6GoogleAccess;
import io.pulumi.googlenative.compute_alpha.enums.SubnetworkPurpose;
import io.pulumi.googlenative.compute_alpha.enums.SubnetworkRole;
import io.pulumi.googlenative.compute_alpha.enums.SubnetworkStackType;
import io.pulumi.googlenative.compute_alpha.inputs.SubnetworkLogConfigArgs;
import io.pulumi.googlenative.compute_alpha.inputs.SubnetworkSecondaryRangeArgs;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SubnetworkArgs extends io.pulumi.resources.ResourceArgs {

    public static final SubnetworkArgs Empty = new SubnetworkArgs();

    @InputImport(name="aggregationInterval")
    private final @Nullable Input<SubnetworkAggregationInterval> aggregationInterval;

    public Input<SubnetworkAggregationInterval> getAggregationInterval() {
        return this.aggregationInterval == null ? Input.empty() : this.aggregationInterval;
    }

    @InputImport(name="allowSubnetCidrRoutesOverlap")
    private final @Nullable Input<Boolean> allowSubnetCidrRoutesOverlap;

    public Input<Boolean> getAllowSubnetCidrRoutesOverlap() {
        return this.allowSubnetCidrRoutesOverlap == null ? Input.empty() : this.allowSubnetCidrRoutesOverlap;
    }

    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    @InputImport(name="enableFlowLogs")
    private final @Nullable Input<Boolean> enableFlowLogs;

    public Input<Boolean> getEnableFlowLogs() {
        return this.enableFlowLogs == null ? Input.empty() : this.enableFlowLogs;
    }

    @InputImport(name="enableL2")
    private final @Nullable Input<Boolean> enableL2;

    public Input<Boolean> getEnableL2() {
        return this.enableL2 == null ? Input.empty() : this.enableL2;
    }

    @InputImport(name="flowSampling")
    private final @Nullable Input<Double> flowSampling;

    public Input<Double> getFlowSampling() {
        return this.flowSampling == null ? Input.empty() : this.flowSampling;
    }

    @InputImport(name="ipCidrRange")
    private final @Nullable Input<String> ipCidrRange;

    public Input<String> getIpCidrRange() {
        return this.ipCidrRange == null ? Input.empty() : this.ipCidrRange;
    }

    @InputImport(name="ipv6AccessType")
    private final @Nullable Input<SubnetworkIpv6AccessType> ipv6AccessType;

    public Input<SubnetworkIpv6AccessType> getIpv6AccessType() {
        return this.ipv6AccessType == null ? Input.empty() : this.ipv6AccessType;
    }

    @InputImport(name="logConfig")
    private final @Nullable Input<SubnetworkLogConfigArgs> logConfig;

    public Input<SubnetworkLogConfigArgs> getLogConfig() {
        return this.logConfig == null ? Input.empty() : this.logConfig;
    }

    @InputImport(name="metadata")
    private final @Nullable Input<SubnetworkMetadata> metadata;

    public Input<SubnetworkMetadata> getMetadata() {
        return this.metadata == null ? Input.empty() : this.metadata;
    }

    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="network")
    private final @Nullable Input<String> network;

    public Input<String> getNetwork() {
        return this.network == null ? Input.empty() : this.network;
    }

    @InputImport(name="privateIpGoogleAccess")
    private final @Nullable Input<Boolean> privateIpGoogleAccess;

    public Input<Boolean> getPrivateIpGoogleAccess() {
        return this.privateIpGoogleAccess == null ? Input.empty() : this.privateIpGoogleAccess;
    }

    @InputImport(name="privateIpv6GoogleAccess")
    private final @Nullable Input<SubnetworkPrivateIpv6GoogleAccess> privateIpv6GoogleAccess;

    public Input<SubnetworkPrivateIpv6GoogleAccess> getPrivateIpv6GoogleAccess() {
        return this.privateIpv6GoogleAccess == null ? Input.empty() : this.privateIpv6GoogleAccess;
    }

    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    @InputImport(name="purpose")
    private final @Nullable Input<SubnetworkPurpose> purpose;

    public Input<SubnetworkPurpose> getPurpose() {
        return this.purpose == null ? Input.empty() : this.purpose;
    }

    @InputImport(name="region", required=true)
    private final Input<String> region;

    public Input<String> getRegion() {
        return this.region;
    }

    @InputImport(name="requestId")
    private final @Nullable Input<String> requestId;

    public Input<String> getRequestId() {
        return this.requestId == null ? Input.empty() : this.requestId;
    }

    @InputImport(name="reservedInternalRange")
    private final @Nullable Input<String> reservedInternalRange;

    public Input<String> getReservedInternalRange() {
        return this.reservedInternalRange == null ? Input.empty() : this.reservedInternalRange;
    }

    @InputImport(name="role")
    private final @Nullable Input<SubnetworkRole> role;

    public Input<SubnetworkRole> getRole() {
        return this.role == null ? Input.empty() : this.role;
    }

    @InputImport(name="secondaryIpRanges")
    private final @Nullable Input<List<SubnetworkSecondaryRangeArgs>> secondaryIpRanges;

    public Input<List<SubnetworkSecondaryRangeArgs>> getSecondaryIpRanges() {
        return this.secondaryIpRanges == null ? Input.empty() : this.secondaryIpRanges;
    }

    @InputImport(name="stackType")
    private final @Nullable Input<SubnetworkStackType> stackType;

    public Input<SubnetworkStackType> getStackType() {
        return this.stackType == null ? Input.empty() : this.stackType;
    }

    @InputImport(name="vlans")
    private final @Nullable Input<List<Integer>> vlans;

    public Input<List<Integer>> getVlans() {
        return this.vlans == null ? Input.empty() : this.vlans;
    }

    public SubnetworkArgs(
        @Nullable Input<SubnetworkAggregationInterval> aggregationInterval,
        @Nullable Input<Boolean> allowSubnetCidrRoutesOverlap,
        @Nullable Input<String> description,
        @Nullable Input<Boolean> enableFlowLogs,
        @Nullable Input<Boolean> enableL2,
        @Nullable Input<Double> flowSampling,
        @Nullable Input<String> ipCidrRange,
        @Nullable Input<SubnetworkIpv6AccessType> ipv6AccessType,
        @Nullable Input<SubnetworkLogConfigArgs> logConfig,
        @Nullable Input<SubnetworkMetadata> metadata,
        @Nullable Input<String> name,
        @Nullable Input<String> network,
        @Nullable Input<Boolean> privateIpGoogleAccess,
        @Nullable Input<SubnetworkPrivateIpv6GoogleAccess> privateIpv6GoogleAccess,
        @Nullable Input<String> project,
        @Nullable Input<SubnetworkPurpose> purpose,
        Input<String> region,
        @Nullable Input<String> requestId,
        @Nullable Input<String> reservedInternalRange,
        @Nullable Input<SubnetworkRole> role,
        @Nullable Input<List<SubnetworkSecondaryRangeArgs>> secondaryIpRanges,
        @Nullable Input<SubnetworkStackType> stackType,
        @Nullable Input<List<Integer>> vlans) {
        this.aggregationInterval = aggregationInterval;
        this.allowSubnetCidrRoutesOverlap = allowSubnetCidrRoutesOverlap;
        this.description = description;
        this.enableFlowLogs = enableFlowLogs;
        this.enableL2 = enableL2;
        this.flowSampling = flowSampling;
        this.ipCidrRange = ipCidrRange;
        this.ipv6AccessType = ipv6AccessType;
        this.logConfig = logConfig;
        this.metadata = metadata;
        this.name = name;
        this.network = network;
        this.privateIpGoogleAccess = privateIpGoogleAccess;
        this.privateIpv6GoogleAccess = privateIpv6GoogleAccess;
        this.project = project;
        this.purpose = purpose;
        this.region = Objects.requireNonNull(region, "expected parameter 'region' to be non-null");
        this.requestId = requestId;
        this.reservedInternalRange = reservedInternalRange;
        this.role = role;
        this.secondaryIpRanges = secondaryIpRanges;
        this.stackType = stackType;
        this.vlans = vlans;
    }

    private SubnetworkArgs() {
        this.aggregationInterval = Input.empty();
        this.allowSubnetCidrRoutesOverlap = Input.empty();
        this.description = Input.empty();
        this.enableFlowLogs = Input.empty();
        this.enableL2 = Input.empty();
        this.flowSampling = Input.empty();
        this.ipCidrRange = Input.empty();
        this.ipv6AccessType = Input.empty();
        this.logConfig = Input.empty();
        this.metadata = Input.empty();
        this.name = Input.empty();
        this.network = Input.empty();
        this.privateIpGoogleAccess = Input.empty();
        this.privateIpv6GoogleAccess = Input.empty();
        this.project = Input.empty();
        this.purpose = Input.empty();
        this.region = Input.empty();
        this.requestId = Input.empty();
        this.reservedInternalRange = Input.empty();
        this.role = Input.empty();
        this.secondaryIpRanges = Input.empty();
        this.stackType = Input.empty();
        this.vlans = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SubnetworkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<SubnetworkAggregationInterval> aggregationInterval;
        private @Nullable Input<Boolean> allowSubnetCidrRoutesOverlap;
        private @Nullable Input<String> description;
        private @Nullable Input<Boolean> enableFlowLogs;
        private @Nullable Input<Boolean> enableL2;
        private @Nullable Input<Double> flowSampling;
        private @Nullable Input<String> ipCidrRange;
        private @Nullable Input<SubnetworkIpv6AccessType> ipv6AccessType;
        private @Nullable Input<SubnetworkLogConfigArgs> logConfig;
        private @Nullable Input<SubnetworkMetadata> metadata;
        private @Nullable Input<String> name;
        private @Nullable Input<String> network;
        private @Nullable Input<Boolean> privateIpGoogleAccess;
        private @Nullable Input<SubnetworkPrivateIpv6GoogleAccess> privateIpv6GoogleAccess;
        private @Nullable Input<String> project;
        private @Nullable Input<SubnetworkPurpose> purpose;
        private Input<String> region;
        private @Nullable Input<String> requestId;
        private @Nullable Input<String> reservedInternalRange;
        private @Nullable Input<SubnetworkRole> role;
        private @Nullable Input<List<SubnetworkSecondaryRangeArgs>> secondaryIpRanges;
        private @Nullable Input<SubnetworkStackType> stackType;
        private @Nullable Input<List<Integer>> vlans;

        public Builder() {
    	      // Empty
        }

        public Builder(SubnetworkArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aggregationInterval = defaults.aggregationInterval;
    	      this.allowSubnetCidrRoutesOverlap = defaults.allowSubnetCidrRoutesOverlap;
    	      this.description = defaults.description;
    	      this.enableFlowLogs = defaults.enableFlowLogs;
    	      this.enableL2 = defaults.enableL2;
    	      this.flowSampling = defaults.flowSampling;
    	      this.ipCidrRange = defaults.ipCidrRange;
    	      this.ipv6AccessType = defaults.ipv6AccessType;
    	      this.logConfig = defaults.logConfig;
    	      this.metadata = defaults.metadata;
    	      this.name = defaults.name;
    	      this.network = defaults.network;
    	      this.privateIpGoogleAccess = defaults.privateIpGoogleAccess;
    	      this.privateIpv6GoogleAccess = defaults.privateIpv6GoogleAccess;
    	      this.project = defaults.project;
    	      this.purpose = defaults.purpose;
    	      this.region = defaults.region;
    	      this.requestId = defaults.requestId;
    	      this.reservedInternalRange = defaults.reservedInternalRange;
    	      this.role = defaults.role;
    	      this.secondaryIpRanges = defaults.secondaryIpRanges;
    	      this.stackType = defaults.stackType;
    	      this.vlans = defaults.vlans;
        }

        public Builder setAggregationInterval(@Nullable Input<SubnetworkAggregationInterval> aggregationInterval) {
            this.aggregationInterval = aggregationInterval;
            return this;
        }

        public Builder setAggregationInterval(@Nullable SubnetworkAggregationInterval aggregationInterval) {
            this.aggregationInterval = Input.ofNullable(aggregationInterval);
            return this;
        }

        public Builder setAllowSubnetCidrRoutesOverlap(@Nullable Input<Boolean> allowSubnetCidrRoutesOverlap) {
            this.allowSubnetCidrRoutesOverlap = allowSubnetCidrRoutesOverlap;
            return this;
        }

        public Builder setAllowSubnetCidrRoutesOverlap(@Nullable Boolean allowSubnetCidrRoutesOverlap) {
            this.allowSubnetCidrRoutesOverlap = Input.ofNullable(allowSubnetCidrRoutesOverlap);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setEnableFlowLogs(@Nullable Input<Boolean> enableFlowLogs) {
            this.enableFlowLogs = enableFlowLogs;
            return this;
        }

        public Builder setEnableFlowLogs(@Nullable Boolean enableFlowLogs) {
            this.enableFlowLogs = Input.ofNullable(enableFlowLogs);
            return this;
        }

        public Builder setEnableL2(@Nullable Input<Boolean> enableL2) {
            this.enableL2 = enableL2;
            return this;
        }

        public Builder setEnableL2(@Nullable Boolean enableL2) {
            this.enableL2 = Input.ofNullable(enableL2);
            return this;
        }

        public Builder setFlowSampling(@Nullable Input<Double> flowSampling) {
            this.flowSampling = flowSampling;
            return this;
        }

        public Builder setFlowSampling(@Nullable Double flowSampling) {
            this.flowSampling = Input.ofNullable(flowSampling);
            return this;
        }

        public Builder setIpCidrRange(@Nullable Input<String> ipCidrRange) {
            this.ipCidrRange = ipCidrRange;
            return this;
        }

        public Builder setIpCidrRange(@Nullable String ipCidrRange) {
            this.ipCidrRange = Input.ofNullable(ipCidrRange);
            return this;
        }

        public Builder setIpv6AccessType(@Nullable Input<SubnetworkIpv6AccessType> ipv6AccessType) {
            this.ipv6AccessType = ipv6AccessType;
            return this;
        }

        public Builder setIpv6AccessType(@Nullable SubnetworkIpv6AccessType ipv6AccessType) {
            this.ipv6AccessType = Input.ofNullable(ipv6AccessType);
            return this;
        }

        public Builder setLogConfig(@Nullable Input<SubnetworkLogConfigArgs> logConfig) {
            this.logConfig = logConfig;
            return this;
        }

        public Builder setLogConfig(@Nullable SubnetworkLogConfigArgs logConfig) {
            this.logConfig = Input.ofNullable(logConfig);
            return this;
        }

        public Builder setMetadata(@Nullable Input<SubnetworkMetadata> metadata) {
            this.metadata = metadata;
            return this;
        }

        public Builder setMetadata(@Nullable SubnetworkMetadata metadata) {
            this.metadata = Input.ofNullable(metadata);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setNetwork(@Nullable Input<String> network) {
            this.network = network;
            return this;
        }

        public Builder setNetwork(@Nullable String network) {
            this.network = Input.ofNullable(network);
            return this;
        }

        public Builder setPrivateIpGoogleAccess(@Nullable Input<Boolean> privateIpGoogleAccess) {
            this.privateIpGoogleAccess = privateIpGoogleAccess;
            return this;
        }

        public Builder setPrivateIpGoogleAccess(@Nullable Boolean privateIpGoogleAccess) {
            this.privateIpGoogleAccess = Input.ofNullable(privateIpGoogleAccess);
            return this;
        }

        public Builder setPrivateIpv6GoogleAccess(@Nullable Input<SubnetworkPrivateIpv6GoogleAccess> privateIpv6GoogleAccess) {
            this.privateIpv6GoogleAccess = privateIpv6GoogleAccess;
            return this;
        }

        public Builder setPrivateIpv6GoogleAccess(@Nullable SubnetworkPrivateIpv6GoogleAccess privateIpv6GoogleAccess) {
            this.privateIpv6GoogleAccess = Input.ofNullable(privateIpv6GoogleAccess);
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setPurpose(@Nullable Input<SubnetworkPurpose> purpose) {
            this.purpose = purpose;
            return this;
        }

        public Builder setPurpose(@Nullable SubnetworkPurpose purpose) {
            this.purpose = Input.ofNullable(purpose);
            return this;
        }

        public Builder setRegion(Input<String> region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }

        public Builder setRegion(String region) {
            this.region = Input.of(Objects.requireNonNull(region));
            return this;
        }

        public Builder setRequestId(@Nullable Input<String> requestId) {
            this.requestId = requestId;
            return this;
        }

        public Builder setRequestId(@Nullable String requestId) {
            this.requestId = Input.ofNullable(requestId);
            return this;
        }

        public Builder setReservedInternalRange(@Nullable Input<String> reservedInternalRange) {
            this.reservedInternalRange = reservedInternalRange;
            return this;
        }

        public Builder setReservedInternalRange(@Nullable String reservedInternalRange) {
            this.reservedInternalRange = Input.ofNullable(reservedInternalRange);
            return this;
        }

        public Builder setRole(@Nullable Input<SubnetworkRole> role) {
            this.role = role;
            return this;
        }

        public Builder setRole(@Nullable SubnetworkRole role) {
            this.role = Input.ofNullable(role);
            return this;
        }

        public Builder setSecondaryIpRanges(@Nullable Input<List<SubnetworkSecondaryRangeArgs>> secondaryIpRanges) {
            this.secondaryIpRanges = secondaryIpRanges;
            return this;
        }

        public Builder setSecondaryIpRanges(@Nullable List<SubnetworkSecondaryRangeArgs> secondaryIpRanges) {
            this.secondaryIpRanges = Input.ofNullable(secondaryIpRanges);
            return this;
        }

        public Builder setStackType(@Nullable Input<SubnetworkStackType> stackType) {
            this.stackType = stackType;
            return this;
        }

        public Builder setStackType(@Nullable SubnetworkStackType stackType) {
            this.stackType = Input.ofNullable(stackType);
            return this;
        }

        public Builder setVlans(@Nullable Input<List<Integer>> vlans) {
            this.vlans = vlans;
            return this;
        }

        public Builder setVlans(@Nullable List<Integer> vlans) {
            this.vlans = Input.ofNullable(vlans);
            return this;
        }

        public SubnetworkArgs build() {
            return new SubnetworkArgs(aggregationInterval, allowSubnetCidrRoutesOverlap, description, enableFlowLogs, enableL2, flowSampling, ipCidrRange, ipv6AccessType, logConfig, metadata, name, network, privateIpGoogleAccess, privateIpv6GoogleAccess, project, purpose, region, requestId, reservedInternalRange, role, secondaryIpRanges, stackType, vlans);
        }
    }
}