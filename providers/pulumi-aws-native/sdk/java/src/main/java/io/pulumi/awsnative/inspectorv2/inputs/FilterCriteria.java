// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.inspectorv2.inputs;

import io.pulumi.awsnative.inspectorv2.inputs.FilterDateFilter;
import io.pulumi.awsnative.inspectorv2.inputs.FilterMapFilter;
import io.pulumi.awsnative.inspectorv2.inputs.FilterNumberFilter;
import io.pulumi.awsnative.inspectorv2.inputs.FilterPackageFilter;
import io.pulumi.awsnative.inspectorv2.inputs.FilterPortRangeFilter;
import io.pulumi.awsnative.inspectorv2.inputs.FilterStringFilter;
import io.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FilterCriteria extends io.pulumi.resources.InvokeArgs {

    public static final FilterCriteria Empty = new FilterCriteria();

    @Import(name="awsAccountId")
      private final @Nullable List<FilterStringFilter> awsAccountId;

    public List<FilterStringFilter> getAwsAccountId() {
        return this.awsAccountId == null ? List.of() : this.awsAccountId;
    }

    @Import(name="componentId")
      private final @Nullable List<FilterStringFilter> componentId;

    public List<FilterStringFilter> getComponentId() {
        return this.componentId == null ? List.of() : this.componentId;
    }

    @Import(name="componentType")
      private final @Nullable List<FilterStringFilter> componentType;

    public List<FilterStringFilter> getComponentType() {
        return this.componentType == null ? List.of() : this.componentType;
    }

    @Import(name="ec2InstanceImageId")
      private final @Nullable List<FilterStringFilter> ec2InstanceImageId;

    public List<FilterStringFilter> getEc2InstanceImageId() {
        return this.ec2InstanceImageId == null ? List.of() : this.ec2InstanceImageId;
    }

    @Import(name="ec2InstanceSubnetId")
      private final @Nullable List<FilterStringFilter> ec2InstanceSubnetId;

    public List<FilterStringFilter> getEc2InstanceSubnetId() {
        return this.ec2InstanceSubnetId == null ? List.of() : this.ec2InstanceSubnetId;
    }

    @Import(name="ec2InstanceVpcId")
      private final @Nullable List<FilterStringFilter> ec2InstanceVpcId;

    public List<FilterStringFilter> getEc2InstanceVpcId() {
        return this.ec2InstanceVpcId == null ? List.of() : this.ec2InstanceVpcId;
    }

    @Import(name="ecrImageArchitecture")
      private final @Nullable List<FilterStringFilter> ecrImageArchitecture;

    public List<FilterStringFilter> getEcrImageArchitecture() {
        return this.ecrImageArchitecture == null ? List.of() : this.ecrImageArchitecture;
    }

    @Import(name="ecrImageHash")
      private final @Nullable List<FilterStringFilter> ecrImageHash;

    public List<FilterStringFilter> getEcrImageHash() {
        return this.ecrImageHash == null ? List.of() : this.ecrImageHash;
    }

    @Import(name="ecrImagePushedAt")
      private final @Nullable List<FilterDateFilter> ecrImagePushedAt;

    public List<FilterDateFilter> getEcrImagePushedAt() {
        return this.ecrImagePushedAt == null ? List.of() : this.ecrImagePushedAt;
    }

    @Import(name="ecrImageRegistry")
      private final @Nullable List<FilterStringFilter> ecrImageRegistry;

    public List<FilterStringFilter> getEcrImageRegistry() {
        return this.ecrImageRegistry == null ? List.of() : this.ecrImageRegistry;
    }

    @Import(name="ecrImageRepositoryName")
      private final @Nullable List<FilterStringFilter> ecrImageRepositoryName;

    public List<FilterStringFilter> getEcrImageRepositoryName() {
        return this.ecrImageRepositoryName == null ? List.of() : this.ecrImageRepositoryName;
    }

    @Import(name="ecrImageTags")
      private final @Nullable List<FilterStringFilter> ecrImageTags;

    public List<FilterStringFilter> getEcrImageTags() {
        return this.ecrImageTags == null ? List.of() : this.ecrImageTags;
    }

    @Import(name="findingArn")
      private final @Nullable List<FilterStringFilter> findingArn;

    public List<FilterStringFilter> getFindingArn() {
        return this.findingArn == null ? List.of() : this.findingArn;
    }

    @Import(name="findingStatus")
      private final @Nullable List<FilterStringFilter> findingStatus;

    public List<FilterStringFilter> getFindingStatus() {
        return this.findingStatus == null ? List.of() : this.findingStatus;
    }

    @Import(name="findingType")
      private final @Nullable List<FilterStringFilter> findingType;

    public List<FilterStringFilter> getFindingType() {
        return this.findingType == null ? List.of() : this.findingType;
    }

    @Import(name="firstObservedAt")
      private final @Nullable List<FilterDateFilter> firstObservedAt;

    public List<FilterDateFilter> getFirstObservedAt() {
        return this.firstObservedAt == null ? List.of() : this.firstObservedAt;
    }

    @Import(name="inspectorScore")
      private final @Nullable List<FilterNumberFilter> inspectorScore;

    public List<FilterNumberFilter> getInspectorScore() {
        return this.inspectorScore == null ? List.of() : this.inspectorScore;
    }

    @Import(name="lastObservedAt")
      private final @Nullable List<FilterDateFilter> lastObservedAt;

    public List<FilterDateFilter> getLastObservedAt() {
        return this.lastObservedAt == null ? List.of() : this.lastObservedAt;
    }

    @Import(name="networkProtocol")
      private final @Nullable List<FilterStringFilter> networkProtocol;

    public List<FilterStringFilter> getNetworkProtocol() {
        return this.networkProtocol == null ? List.of() : this.networkProtocol;
    }

    @Import(name="portRange")
      private final @Nullable List<FilterPortRangeFilter> portRange;

    public List<FilterPortRangeFilter> getPortRange() {
        return this.portRange == null ? List.of() : this.portRange;
    }

    @Import(name="relatedVulnerabilities")
      private final @Nullable List<FilterStringFilter> relatedVulnerabilities;

    public List<FilterStringFilter> getRelatedVulnerabilities() {
        return this.relatedVulnerabilities == null ? List.of() : this.relatedVulnerabilities;
    }

    @Import(name="resourceId")
      private final @Nullable List<FilterStringFilter> resourceId;

    public List<FilterStringFilter> getResourceId() {
        return this.resourceId == null ? List.of() : this.resourceId;
    }

    @Import(name="resourceTags")
      private final @Nullable List<FilterMapFilter> resourceTags;

    public List<FilterMapFilter> getResourceTags() {
        return this.resourceTags == null ? List.of() : this.resourceTags;
    }

    @Import(name="resourceType")
      private final @Nullable List<FilterStringFilter> resourceType;

    public List<FilterStringFilter> getPropResourceType() {
        return this.resourceType == null ? List.of() : this.resourceType;
    }

    @Import(name="severity")
      private final @Nullable List<FilterStringFilter> severity;

    public List<FilterStringFilter> getSeverity() {
        return this.severity == null ? List.of() : this.severity;
    }

    @Import(name="title")
      private final @Nullable List<FilterStringFilter> title;

    public List<FilterStringFilter> getTitle() {
        return this.title == null ? List.of() : this.title;
    }

    @Import(name="updatedAt")
      private final @Nullable List<FilterDateFilter> updatedAt;

    public List<FilterDateFilter> getUpdatedAt() {
        return this.updatedAt == null ? List.of() : this.updatedAt;
    }

    @Import(name="vendorSeverity")
      private final @Nullable List<FilterStringFilter> vendorSeverity;

    public List<FilterStringFilter> getVendorSeverity() {
        return this.vendorSeverity == null ? List.of() : this.vendorSeverity;
    }

    @Import(name="vulnerabilityId")
      private final @Nullable List<FilterStringFilter> vulnerabilityId;

    public List<FilterStringFilter> getVulnerabilityId() {
        return this.vulnerabilityId == null ? List.of() : this.vulnerabilityId;
    }

    @Import(name="vulnerabilitySource")
      private final @Nullable List<FilterStringFilter> vulnerabilitySource;

    public List<FilterStringFilter> getVulnerabilitySource() {
        return this.vulnerabilitySource == null ? List.of() : this.vulnerabilitySource;
    }

    @Import(name="vulnerablePackages")
      private final @Nullable List<FilterPackageFilter> vulnerablePackages;

    public List<FilterPackageFilter> getVulnerablePackages() {
        return this.vulnerablePackages == null ? List.of() : this.vulnerablePackages;
    }

    public FilterCriteria(
        @Nullable List<FilterStringFilter> awsAccountId,
        @Nullable List<FilterStringFilter> componentId,
        @Nullable List<FilterStringFilter> componentType,
        @Nullable List<FilterStringFilter> ec2InstanceImageId,
        @Nullable List<FilterStringFilter> ec2InstanceSubnetId,
        @Nullable List<FilterStringFilter> ec2InstanceVpcId,
        @Nullable List<FilterStringFilter> ecrImageArchitecture,
        @Nullable List<FilterStringFilter> ecrImageHash,
        @Nullable List<FilterDateFilter> ecrImagePushedAt,
        @Nullable List<FilterStringFilter> ecrImageRegistry,
        @Nullable List<FilterStringFilter> ecrImageRepositoryName,
        @Nullable List<FilterStringFilter> ecrImageTags,
        @Nullable List<FilterStringFilter> findingArn,
        @Nullable List<FilterStringFilter> findingStatus,
        @Nullable List<FilterStringFilter> findingType,
        @Nullable List<FilterDateFilter> firstObservedAt,
        @Nullable List<FilterNumberFilter> inspectorScore,
        @Nullable List<FilterDateFilter> lastObservedAt,
        @Nullable List<FilterStringFilter> networkProtocol,
        @Nullable List<FilterPortRangeFilter> portRange,
        @Nullable List<FilterStringFilter> relatedVulnerabilities,
        @Nullable List<FilterStringFilter> resourceId,
        @Nullable List<FilterMapFilter> resourceTags,
        @Nullable List<FilterStringFilter> resourceType,
        @Nullable List<FilterStringFilter> severity,
        @Nullable List<FilterStringFilter> title,
        @Nullable List<FilterDateFilter> updatedAt,
        @Nullable List<FilterStringFilter> vendorSeverity,
        @Nullable List<FilterStringFilter> vulnerabilityId,
        @Nullable List<FilterStringFilter> vulnerabilitySource,
        @Nullable List<FilterPackageFilter> vulnerablePackages) {
        this.awsAccountId = awsAccountId;
        this.componentId = componentId;
        this.componentType = componentType;
        this.ec2InstanceImageId = ec2InstanceImageId;
        this.ec2InstanceSubnetId = ec2InstanceSubnetId;
        this.ec2InstanceVpcId = ec2InstanceVpcId;
        this.ecrImageArchitecture = ecrImageArchitecture;
        this.ecrImageHash = ecrImageHash;
        this.ecrImagePushedAt = ecrImagePushedAt;
        this.ecrImageRegistry = ecrImageRegistry;
        this.ecrImageRepositoryName = ecrImageRepositoryName;
        this.ecrImageTags = ecrImageTags;
        this.findingArn = findingArn;
        this.findingStatus = findingStatus;
        this.findingType = findingType;
        this.firstObservedAt = firstObservedAt;
        this.inspectorScore = inspectorScore;
        this.lastObservedAt = lastObservedAt;
        this.networkProtocol = networkProtocol;
        this.portRange = portRange;
        this.relatedVulnerabilities = relatedVulnerabilities;
        this.resourceId = resourceId;
        this.resourceTags = resourceTags;
        this.resourceType = resourceType;
        this.severity = severity;
        this.title = title;
        this.updatedAt = updatedAt;
        this.vendorSeverity = vendorSeverity;
        this.vulnerabilityId = vulnerabilityId;
        this.vulnerabilitySource = vulnerabilitySource;
        this.vulnerablePackages = vulnerablePackages;
    }

    private FilterCriteria() {
        this.awsAccountId = List.of();
        this.componentId = List.of();
        this.componentType = List.of();
        this.ec2InstanceImageId = List.of();
        this.ec2InstanceSubnetId = List.of();
        this.ec2InstanceVpcId = List.of();
        this.ecrImageArchitecture = List.of();
        this.ecrImageHash = List.of();
        this.ecrImagePushedAt = List.of();
        this.ecrImageRegistry = List.of();
        this.ecrImageRepositoryName = List.of();
        this.ecrImageTags = List.of();
        this.findingArn = List.of();
        this.findingStatus = List.of();
        this.findingType = List.of();
        this.firstObservedAt = List.of();
        this.inspectorScore = List.of();
        this.lastObservedAt = List.of();
        this.networkProtocol = List.of();
        this.portRange = List.of();
        this.relatedVulnerabilities = List.of();
        this.resourceId = List.of();
        this.resourceTags = List.of();
        this.resourceType = List.of();
        this.severity = List.of();
        this.title = List.of();
        this.updatedAt = List.of();
        this.vendorSeverity = List.of();
        this.vulnerabilityId = List.of();
        this.vulnerabilitySource = List.of();
        this.vulnerablePackages = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FilterCriteria defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<FilterStringFilter> awsAccountId;
        private @Nullable List<FilterStringFilter> componentId;
        private @Nullable List<FilterStringFilter> componentType;
        private @Nullable List<FilterStringFilter> ec2InstanceImageId;
        private @Nullable List<FilterStringFilter> ec2InstanceSubnetId;
        private @Nullable List<FilterStringFilter> ec2InstanceVpcId;
        private @Nullable List<FilterStringFilter> ecrImageArchitecture;
        private @Nullable List<FilterStringFilter> ecrImageHash;
        private @Nullable List<FilterDateFilter> ecrImagePushedAt;
        private @Nullable List<FilterStringFilter> ecrImageRegistry;
        private @Nullable List<FilterStringFilter> ecrImageRepositoryName;
        private @Nullable List<FilterStringFilter> ecrImageTags;
        private @Nullable List<FilterStringFilter> findingArn;
        private @Nullable List<FilterStringFilter> findingStatus;
        private @Nullable List<FilterStringFilter> findingType;
        private @Nullable List<FilterDateFilter> firstObservedAt;
        private @Nullable List<FilterNumberFilter> inspectorScore;
        private @Nullable List<FilterDateFilter> lastObservedAt;
        private @Nullable List<FilterStringFilter> networkProtocol;
        private @Nullable List<FilterPortRangeFilter> portRange;
        private @Nullable List<FilterStringFilter> relatedVulnerabilities;
        private @Nullable List<FilterStringFilter> resourceId;
        private @Nullable List<FilterMapFilter> resourceTags;
        private @Nullable List<FilterStringFilter> resourceType;
        private @Nullable List<FilterStringFilter> severity;
        private @Nullable List<FilterStringFilter> title;
        private @Nullable List<FilterDateFilter> updatedAt;
        private @Nullable List<FilterStringFilter> vendorSeverity;
        private @Nullable List<FilterStringFilter> vulnerabilityId;
        private @Nullable List<FilterStringFilter> vulnerabilitySource;
        private @Nullable List<FilterPackageFilter> vulnerablePackages;

        public Builder() {
    	      // Empty
        }

        public Builder(FilterCriteria defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.awsAccountId = defaults.awsAccountId;
    	      this.componentId = defaults.componentId;
    	      this.componentType = defaults.componentType;
    	      this.ec2InstanceImageId = defaults.ec2InstanceImageId;
    	      this.ec2InstanceSubnetId = defaults.ec2InstanceSubnetId;
    	      this.ec2InstanceVpcId = defaults.ec2InstanceVpcId;
    	      this.ecrImageArchitecture = defaults.ecrImageArchitecture;
    	      this.ecrImageHash = defaults.ecrImageHash;
    	      this.ecrImagePushedAt = defaults.ecrImagePushedAt;
    	      this.ecrImageRegistry = defaults.ecrImageRegistry;
    	      this.ecrImageRepositoryName = defaults.ecrImageRepositoryName;
    	      this.ecrImageTags = defaults.ecrImageTags;
    	      this.findingArn = defaults.findingArn;
    	      this.findingStatus = defaults.findingStatus;
    	      this.findingType = defaults.findingType;
    	      this.firstObservedAt = defaults.firstObservedAt;
    	      this.inspectorScore = defaults.inspectorScore;
    	      this.lastObservedAt = defaults.lastObservedAt;
    	      this.networkProtocol = defaults.networkProtocol;
    	      this.portRange = defaults.portRange;
    	      this.relatedVulnerabilities = defaults.relatedVulnerabilities;
    	      this.resourceId = defaults.resourceId;
    	      this.resourceTags = defaults.resourceTags;
    	      this.resourceType = defaults.resourceType;
    	      this.severity = defaults.severity;
    	      this.title = defaults.title;
    	      this.updatedAt = defaults.updatedAt;
    	      this.vendorSeverity = defaults.vendorSeverity;
    	      this.vulnerabilityId = defaults.vulnerabilityId;
    	      this.vulnerabilitySource = defaults.vulnerabilitySource;
    	      this.vulnerablePackages = defaults.vulnerablePackages;
        }

        public Builder awsAccountId(@Nullable List<FilterStringFilter> awsAccountId) {
            this.awsAccountId = awsAccountId;
            return this;
        }

        public Builder componentId(@Nullable List<FilterStringFilter> componentId) {
            this.componentId = componentId;
            return this;
        }

        public Builder componentType(@Nullable List<FilterStringFilter> componentType) {
            this.componentType = componentType;
            return this;
        }

        public Builder ec2InstanceImageId(@Nullable List<FilterStringFilter> ec2InstanceImageId) {
            this.ec2InstanceImageId = ec2InstanceImageId;
            return this;
        }

        public Builder ec2InstanceSubnetId(@Nullable List<FilterStringFilter> ec2InstanceSubnetId) {
            this.ec2InstanceSubnetId = ec2InstanceSubnetId;
            return this;
        }

        public Builder ec2InstanceVpcId(@Nullable List<FilterStringFilter> ec2InstanceVpcId) {
            this.ec2InstanceVpcId = ec2InstanceVpcId;
            return this;
        }

        public Builder ecrImageArchitecture(@Nullable List<FilterStringFilter> ecrImageArchitecture) {
            this.ecrImageArchitecture = ecrImageArchitecture;
            return this;
        }

        public Builder ecrImageHash(@Nullable List<FilterStringFilter> ecrImageHash) {
            this.ecrImageHash = ecrImageHash;
            return this;
        }

        public Builder ecrImagePushedAt(@Nullable List<FilterDateFilter> ecrImagePushedAt) {
            this.ecrImagePushedAt = ecrImagePushedAt;
            return this;
        }

        public Builder ecrImageRegistry(@Nullable List<FilterStringFilter> ecrImageRegistry) {
            this.ecrImageRegistry = ecrImageRegistry;
            return this;
        }

        public Builder ecrImageRepositoryName(@Nullable List<FilterStringFilter> ecrImageRepositoryName) {
            this.ecrImageRepositoryName = ecrImageRepositoryName;
            return this;
        }

        public Builder ecrImageTags(@Nullable List<FilterStringFilter> ecrImageTags) {
            this.ecrImageTags = ecrImageTags;
            return this;
        }

        public Builder findingArn(@Nullable List<FilterStringFilter> findingArn) {
            this.findingArn = findingArn;
            return this;
        }

        public Builder findingStatus(@Nullable List<FilterStringFilter> findingStatus) {
            this.findingStatus = findingStatus;
            return this;
        }

        public Builder findingType(@Nullable List<FilterStringFilter> findingType) {
            this.findingType = findingType;
            return this;
        }

        public Builder firstObservedAt(@Nullable List<FilterDateFilter> firstObservedAt) {
            this.firstObservedAt = firstObservedAt;
            return this;
        }

        public Builder inspectorScore(@Nullable List<FilterNumberFilter> inspectorScore) {
            this.inspectorScore = inspectorScore;
            return this;
        }

        public Builder lastObservedAt(@Nullable List<FilterDateFilter> lastObservedAt) {
            this.lastObservedAt = lastObservedAt;
            return this;
        }

        public Builder networkProtocol(@Nullable List<FilterStringFilter> networkProtocol) {
            this.networkProtocol = networkProtocol;
            return this;
        }

        public Builder portRange(@Nullable List<FilterPortRangeFilter> portRange) {
            this.portRange = portRange;
            return this;
        }

        public Builder relatedVulnerabilities(@Nullable List<FilterStringFilter> relatedVulnerabilities) {
            this.relatedVulnerabilities = relatedVulnerabilities;
            return this;
        }

        public Builder resourceId(@Nullable List<FilterStringFilter> resourceId) {
            this.resourceId = resourceId;
            return this;
        }

        public Builder resourceTags(@Nullable List<FilterMapFilter> resourceTags) {
            this.resourceTags = resourceTags;
            return this;
        }

        public Builder resourceType(@Nullable List<FilterStringFilter> resourceType) {
            this.resourceType = resourceType;
            return this;
        }

        public Builder severity(@Nullable List<FilterStringFilter> severity) {
            this.severity = severity;
            return this;
        }

        public Builder title(@Nullable List<FilterStringFilter> title) {
            this.title = title;
            return this;
        }

        public Builder updatedAt(@Nullable List<FilterDateFilter> updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        public Builder vendorSeverity(@Nullable List<FilterStringFilter> vendorSeverity) {
            this.vendorSeverity = vendorSeverity;
            return this;
        }

        public Builder vulnerabilityId(@Nullable List<FilterStringFilter> vulnerabilityId) {
            this.vulnerabilityId = vulnerabilityId;
            return this;
        }

        public Builder vulnerabilitySource(@Nullable List<FilterStringFilter> vulnerabilitySource) {
            this.vulnerabilitySource = vulnerabilitySource;
            return this;
        }

        public Builder vulnerablePackages(@Nullable List<FilterPackageFilter> vulnerablePackages) {
            this.vulnerablePackages = vulnerablePackages;
            return this;
        }
        public FilterCriteria build() {
            return new FilterCriteria(awsAccountId, componentId, componentType, ec2InstanceImageId, ec2InstanceSubnetId, ec2InstanceVpcId, ecrImageArchitecture, ecrImageHash, ecrImagePushedAt, ecrImageRegistry, ecrImageRepositoryName, ecrImageTags, findingArn, findingStatus, findingType, firstObservedAt, inspectorScore, lastObservedAt, networkProtocol, portRange, relatedVulnerabilities, resourceId, resourceTags, resourceType, severity, title, updatedAt, vendorSeverity, vulnerabilityId, vulnerabilitySource, vulnerablePackages);
        }
    }
}
