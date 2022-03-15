// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabric;

import io.pulumi.azurenative.servicefabric.enums.ArmServicePackageActivationMode;
import io.pulumi.azurenative.servicefabric.enums.MoveCost;
import io.pulumi.azurenative.servicefabric.enums.ServiceKind;
import io.pulumi.azurenative.servicefabric.inputs.NamedPartitionSchemeDescriptionArgs;
import io.pulumi.azurenative.servicefabric.inputs.ServiceCorrelationDescriptionArgs;
import io.pulumi.azurenative.servicefabric.inputs.ServiceLoadMetricDescriptionArgs;
import io.pulumi.azurenative.servicefabric.inputs.ServicePlacementPolicyDescriptionArgs;
import io.pulumi.azurenative.servicefabric.inputs.SingletonPartitionSchemeDescriptionArgs;
import io.pulumi.azurenative.servicefabric.inputs.UniformInt64RangePartitionSchemeDescriptionArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServiceArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceArgs Empty = new ServiceArgs();

    /**
     * The name of the application resource.
     * 
     */
    @Import(name="applicationName", required=true)
      private final Output<String> applicationName;

    public Output<String> getApplicationName() {
        return this.applicationName;
    }

    /**
     * The name of the cluster resource.
     * 
     */
    @Import(name="clusterName", required=true)
      private final Output<String> clusterName;

    public Output<String> getClusterName() {
        return this.clusterName;
    }

    /**
     * A list that describes the correlation of the service with other services.
     * 
     */
    @Import(name="correlationScheme")
      private final @Nullable Output<List<ServiceCorrelationDescriptionArgs>> correlationScheme;

    public Output<List<ServiceCorrelationDescriptionArgs>> getCorrelationScheme() {
        return this.correlationScheme == null ? Output.empty() : this.correlationScheme;
    }

    /**
     * Specifies the move cost for the service.
     * 
     */
    @Import(name="defaultMoveCost")
      private final @Nullable Output<Either<String,MoveCost>> defaultMoveCost;

    public Output<Either<String,MoveCost>> getDefaultMoveCost() {
        return this.defaultMoveCost == null ? Output.empty() : this.defaultMoveCost;
    }

    /**
     * It will be deprecated in New API, resource location depends on the parent resource.
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Output.empty() : this.location;
    }

    /**
     * Describes how the service is partitioned.
     * 
     */
    @Import(name="partitionDescription")
      private final @Nullable Output<Object> partitionDescription;

    public Output<Object> getPartitionDescription() {
        return this.partitionDescription == null ? Output.empty() : this.partitionDescription;
    }

    /**
     * The placement constraints as a string. Placement constraints are boolean expressions on node properties and allow for restricting a service to particular nodes based on the service requirements. For example, to place a service on nodes where NodeType is blue specify the following: "NodeColor == blue)".
     * 
     */
    @Import(name="placementConstraints")
      private final @Nullable Output<String> placementConstraints;

    public Output<String> getPlacementConstraints() {
        return this.placementConstraints == null ? Output.empty() : this.placementConstraints;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Dns name used for the service. If this is specified, then the service can be accessed via its DNS name instead of service name.
     * 
     */
    @Import(name="serviceDnsName")
      private final @Nullable Output<String> serviceDnsName;

    public Output<String> getServiceDnsName() {
        return this.serviceDnsName == null ? Output.empty() : this.serviceDnsName;
    }

    /**
     * The kind of service (Stateless or Stateful).
     * 
     */
    @Import(name="serviceKind", required=true)
      private final Output<Either<String,ServiceKind>> serviceKind;

    public Output<Either<String,ServiceKind>> getServiceKind() {
        return this.serviceKind;
    }

    /**
     * The service load metrics is given as an array of ServiceLoadMetricDescription objects.
     * 
     */
    @Import(name="serviceLoadMetrics")
      private final @Nullable Output<List<ServiceLoadMetricDescriptionArgs>> serviceLoadMetrics;

    public Output<List<ServiceLoadMetricDescriptionArgs>> getServiceLoadMetrics() {
        return this.serviceLoadMetrics == null ? Output.empty() : this.serviceLoadMetrics;
    }

    /**
     * The name of the service resource in the format of {applicationName}~{serviceName}.
     * 
     */
    @Import(name="serviceName")
      private final @Nullable Output<String> serviceName;

    public Output<String> getServiceName() {
        return this.serviceName == null ? Output.empty() : this.serviceName;
    }

    /**
     * The activation Mode of the service package
     * 
     */
    @Import(name="servicePackageActivationMode")
      private final @Nullable Output<Either<String,ArmServicePackageActivationMode>> servicePackageActivationMode;

    public Output<Either<String,ArmServicePackageActivationMode>> getServicePackageActivationMode() {
        return this.servicePackageActivationMode == null ? Output.empty() : this.servicePackageActivationMode;
    }

    /**
     * A list that describes the correlation of the service with other services.
     * 
     */
    @Import(name="servicePlacementPolicies")
      private final @Nullable Output<List<ServicePlacementPolicyDescriptionArgs>> servicePlacementPolicies;

    public Output<List<ServicePlacementPolicyDescriptionArgs>> getServicePlacementPolicies() {
        return this.servicePlacementPolicies == null ? Output.empty() : this.servicePlacementPolicies;
    }

    /**
     * The name of the service type
     * 
     */
    @Import(name="serviceTypeName")
      private final @Nullable Output<String> serviceTypeName;

    public Output<String> getServiceTypeName() {
        return this.serviceTypeName == null ? Output.empty() : this.serviceTypeName;
    }

    /**
     * Azure resource tags.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    public ServiceArgs(
        Output<String> applicationName,
        Output<String> clusterName,
        @Nullable Output<List<ServiceCorrelationDescriptionArgs>> correlationScheme,
        @Nullable Output<Either<String,MoveCost>> defaultMoveCost,
        @Nullable Output<String> location,
        @Nullable Output<Object> partitionDescription,
        @Nullable Output<String> placementConstraints,
        Output<String> resourceGroupName,
        @Nullable Output<String> serviceDnsName,
        Output<Either<String,ServiceKind>> serviceKind,
        @Nullable Output<List<ServiceLoadMetricDescriptionArgs>> serviceLoadMetrics,
        @Nullable Output<String> serviceName,
        @Nullable Output<Either<String,ArmServicePackageActivationMode>> servicePackageActivationMode,
        @Nullable Output<List<ServicePlacementPolicyDescriptionArgs>> servicePlacementPolicies,
        @Nullable Output<String> serviceTypeName,
        @Nullable Output<Map<String,String>> tags) {
        this.applicationName = Objects.requireNonNull(applicationName, "expected parameter 'applicationName' to be non-null");
        this.clusterName = Objects.requireNonNull(clusterName, "expected parameter 'clusterName' to be non-null");
        this.correlationScheme = correlationScheme;
        this.defaultMoveCost = defaultMoveCost;
        this.location = location;
        this.partitionDescription = partitionDescription;
        this.placementConstraints = placementConstraints;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.serviceDnsName = serviceDnsName;
        this.serviceKind = Objects.requireNonNull(serviceKind, "expected parameter 'serviceKind' to be non-null");
        this.serviceLoadMetrics = serviceLoadMetrics;
        this.serviceName = serviceName;
        this.servicePackageActivationMode = servicePackageActivationMode;
        this.servicePlacementPolicies = servicePlacementPolicies;
        this.serviceTypeName = serviceTypeName;
        this.tags = tags;
    }

    private ServiceArgs() {
        this.applicationName = Output.empty();
        this.clusterName = Output.empty();
        this.correlationScheme = Output.empty();
        this.defaultMoveCost = Output.empty();
        this.location = Output.empty();
        this.partitionDescription = Output.empty();
        this.placementConstraints = Output.empty();
        this.resourceGroupName = Output.empty();
        this.serviceDnsName = Output.empty();
        this.serviceKind = Output.empty();
        this.serviceLoadMetrics = Output.empty();
        this.serviceName = Output.empty();
        this.servicePackageActivationMode = Output.empty();
        this.servicePlacementPolicies = Output.empty();
        this.serviceTypeName = Output.empty();
        this.tags = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> applicationName;
        private Output<String> clusterName;
        private @Nullable Output<List<ServiceCorrelationDescriptionArgs>> correlationScheme;
        private @Nullable Output<Either<String,MoveCost>> defaultMoveCost;
        private @Nullable Output<String> location;
        private @Nullable Output<Object> partitionDescription;
        private @Nullable Output<String> placementConstraints;
        private Output<String> resourceGroupName;
        private @Nullable Output<String> serviceDnsName;
        private Output<Either<String,ServiceKind>> serviceKind;
        private @Nullable Output<List<ServiceLoadMetricDescriptionArgs>> serviceLoadMetrics;
        private @Nullable Output<String> serviceName;
        private @Nullable Output<Either<String,ArmServicePackageActivationMode>> servicePackageActivationMode;
        private @Nullable Output<List<ServicePlacementPolicyDescriptionArgs>> servicePlacementPolicies;
        private @Nullable Output<String> serviceTypeName;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationName = defaults.applicationName;
    	      this.clusterName = defaults.clusterName;
    	      this.correlationScheme = defaults.correlationScheme;
    	      this.defaultMoveCost = defaults.defaultMoveCost;
    	      this.location = defaults.location;
    	      this.partitionDescription = defaults.partitionDescription;
    	      this.placementConstraints = defaults.placementConstraints;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.serviceDnsName = defaults.serviceDnsName;
    	      this.serviceKind = defaults.serviceKind;
    	      this.serviceLoadMetrics = defaults.serviceLoadMetrics;
    	      this.serviceName = defaults.serviceName;
    	      this.servicePackageActivationMode = defaults.servicePackageActivationMode;
    	      this.servicePlacementPolicies = defaults.servicePlacementPolicies;
    	      this.serviceTypeName = defaults.serviceTypeName;
    	      this.tags = defaults.tags;
        }

        public Builder applicationName(Output<String> applicationName) {
            this.applicationName = Objects.requireNonNull(applicationName);
            return this;
        }

        public Builder applicationName(String applicationName) {
            this.applicationName = Output.of(Objects.requireNonNull(applicationName));
            return this;
        }

        public Builder clusterName(Output<String> clusterName) {
            this.clusterName = Objects.requireNonNull(clusterName);
            return this;
        }

        public Builder clusterName(String clusterName) {
            this.clusterName = Output.of(Objects.requireNonNull(clusterName));
            return this;
        }

        public Builder correlationScheme(@Nullable Output<List<ServiceCorrelationDescriptionArgs>> correlationScheme) {
            this.correlationScheme = correlationScheme;
            return this;
        }

        public Builder correlationScheme(@Nullable List<ServiceCorrelationDescriptionArgs> correlationScheme) {
            this.correlationScheme = Output.ofNullable(correlationScheme);
            return this;
        }

        public Builder defaultMoveCost(@Nullable Output<Either<String,MoveCost>> defaultMoveCost) {
            this.defaultMoveCost = defaultMoveCost;
            return this;
        }

        public Builder defaultMoveCost(@Nullable Either<String,MoveCost> defaultMoveCost) {
            this.defaultMoveCost = Output.ofNullable(defaultMoveCost);
            return this;
        }

        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }

        public Builder location(@Nullable String location) {
            this.location = Output.ofNullable(location);
            return this;
        }

        public Builder partitionDescription(@Nullable Output<Object> partitionDescription) {
            this.partitionDescription = partitionDescription;
            return this;
        }

        public Builder partitionDescription(@Nullable Object partitionDescription) {
            this.partitionDescription = Output.ofNullable(partitionDescription);
            return this;
        }

        public Builder placementConstraints(@Nullable Output<String> placementConstraints) {
            this.placementConstraints = placementConstraints;
            return this;
        }

        public Builder placementConstraints(@Nullable String placementConstraints) {
            this.placementConstraints = Output.ofNullable(placementConstraints);
            return this;
        }

        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder serviceDnsName(@Nullable Output<String> serviceDnsName) {
            this.serviceDnsName = serviceDnsName;
            return this;
        }

        public Builder serviceDnsName(@Nullable String serviceDnsName) {
            this.serviceDnsName = Output.ofNullable(serviceDnsName);
            return this;
        }

        public Builder serviceKind(Output<Either<String,ServiceKind>> serviceKind) {
            this.serviceKind = Objects.requireNonNull(serviceKind);
            return this;
        }

        public Builder serviceKind(Either<String,ServiceKind> serviceKind) {
            this.serviceKind = Output.of(Objects.requireNonNull(serviceKind));
            return this;
        }

        public Builder serviceLoadMetrics(@Nullable Output<List<ServiceLoadMetricDescriptionArgs>> serviceLoadMetrics) {
            this.serviceLoadMetrics = serviceLoadMetrics;
            return this;
        }

        public Builder serviceLoadMetrics(@Nullable List<ServiceLoadMetricDescriptionArgs> serviceLoadMetrics) {
            this.serviceLoadMetrics = Output.ofNullable(serviceLoadMetrics);
            return this;
        }

        public Builder serviceName(@Nullable Output<String> serviceName) {
            this.serviceName = serviceName;
            return this;
        }

        public Builder serviceName(@Nullable String serviceName) {
            this.serviceName = Output.ofNullable(serviceName);
            return this;
        }

        public Builder servicePackageActivationMode(@Nullable Output<Either<String,ArmServicePackageActivationMode>> servicePackageActivationMode) {
            this.servicePackageActivationMode = servicePackageActivationMode;
            return this;
        }

        public Builder servicePackageActivationMode(@Nullable Either<String,ArmServicePackageActivationMode> servicePackageActivationMode) {
            this.servicePackageActivationMode = Output.ofNullable(servicePackageActivationMode);
            return this;
        }

        public Builder servicePlacementPolicies(@Nullable Output<List<ServicePlacementPolicyDescriptionArgs>> servicePlacementPolicies) {
            this.servicePlacementPolicies = servicePlacementPolicies;
            return this;
        }

        public Builder servicePlacementPolicies(@Nullable List<ServicePlacementPolicyDescriptionArgs> servicePlacementPolicies) {
            this.servicePlacementPolicies = Output.ofNullable(servicePlacementPolicies);
            return this;
        }

        public Builder serviceTypeName(@Nullable Output<String> serviceTypeName) {
            this.serviceTypeName = serviceTypeName;
            return this;
        }

        public Builder serviceTypeName(@Nullable String serviceTypeName) {
            this.serviceTypeName = Output.ofNullable(serviceTypeName);
            return this;
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }
        public ServiceArgs build() {
            return new ServiceArgs(applicationName, clusterName, correlationScheme, defaultMoveCost, location, partitionDescription, placementConstraints, resourceGroupName, serviceDnsName, serviceKind, serviceLoadMetrics, serviceName, servicePackageActivationMode, servicePlacementPolicies, serviceTypeName, tags);
        }
    }
}
