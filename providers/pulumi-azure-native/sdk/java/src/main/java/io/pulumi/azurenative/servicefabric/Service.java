// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabric;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.servicefabric.ServiceArgs;
import io.pulumi.azurenative.servicefabric.outputs.NamedPartitionSchemeDescriptionResponse;
import io.pulumi.azurenative.servicefabric.outputs.ServiceCorrelationDescriptionResponse;
import io.pulumi.azurenative.servicefabric.outputs.ServiceLoadMetricDescriptionResponse;
import io.pulumi.azurenative.servicefabric.outputs.ServicePlacementPolicyDescriptionResponse;
import io.pulumi.azurenative.servicefabric.outputs.SingletonPartitionSchemeDescriptionResponse;
import io.pulumi.azurenative.servicefabric.outputs.UniformInt64RangePartitionSchemeDescriptionResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * The service resource.
 * API Version: 2020-03-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:servicefabric:Service myCluster /subscriptions/00000000-0000-0000-0000-000000000000/resourcegroups/resRg/providers/Microsoft.ServiceFabric/clusters/myCluster/applications/myApp/services/myService 
 * ```
 * 
 */
@ResourceType(type="azure-native:servicefabric:Service")
public class Service extends io.pulumi.resources.CustomResource {
    /**
     * A list that describes the correlation of the service with other services.
     * 
     */
    @OutputExport(name="correlationScheme", type=List.class, parameters={ServiceCorrelationDescriptionResponse.class})
    private Output</* @Nullable */ List<ServiceCorrelationDescriptionResponse>> correlationScheme;

    /**
     * @return A list that describes the correlation of the service with other services.
     * 
     */
    public Output</* @Nullable */ List<ServiceCorrelationDescriptionResponse>> getCorrelationScheme() {
        return this.correlationScheme;
    }
    /**
     * Specifies the move cost for the service.
     * 
     */
    @OutputExport(name="defaultMoveCost", type=String.class, parameters={})
    private Output</* @Nullable */ String> defaultMoveCost;

    /**
     * @return Specifies the move cost for the service.
     * 
     */
    public Output</* @Nullable */ String> getDefaultMoveCost() {
        return this.defaultMoveCost;
    }
    /**
     * Azure resource etag.
     * 
     */
    @OutputExport(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return Azure resource etag.
     * 
     */
    public Output<String> getEtag() {
        return this.etag;
    }
    /**
     * It will be deprecated in New API, resource location depends on the parent resource.
     * 
     */
    @OutputExport(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return It will be deprecated in New API, resource location depends on the parent resource.
     * 
     */
    public Output</* @Nullable */ String> getLocation() {
        return this.location;
    }
    /**
     * Azure resource name.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Azure resource name.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Describes how the service is partitioned.
     * 
     */
    @OutputExport(name="partitionDescription", type=Object.class, parameters={})
    private Output</* @Nullable */ Object> partitionDescription;

    /**
     * @return Describes how the service is partitioned.
     * 
     */
    public Output</* @Nullable */ Object> getPartitionDescription() {
        return this.partitionDescription;
    }
    /**
     * The placement constraints as a string. Placement constraints are boolean expressions on node properties and allow for restricting a service to particular nodes based on the service requirements. For example, to place a service on nodes where NodeType is blue specify the following: "NodeColor == blue)".
     * 
     */
    @OutputExport(name="placementConstraints", type=String.class, parameters={})
    private Output</* @Nullable */ String> placementConstraints;

    /**
     * @return The placement constraints as a string. Placement constraints are boolean expressions on node properties and allow for restricting a service to particular nodes based on the service requirements. For example, to place a service on nodes where NodeType is blue specify the following: "NodeColor == blue)".
     * 
     */
    public Output</* @Nullable */ String> getPlacementConstraints() {
        return this.placementConstraints;
    }
    /**
     * The current deployment or provisioning state, which only appears in the response
     * 
     */
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The current deployment or provisioning state, which only appears in the response
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Dns name used for the service. If this is specified, then the service can be accessed via its DNS name instead of service name.
     * 
     */
    @OutputExport(name="serviceDnsName", type=String.class, parameters={})
    private Output</* @Nullable */ String> serviceDnsName;

    /**
     * @return Dns name used for the service. If this is specified, then the service can be accessed via its DNS name instead of service name.
     * 
     */
    public Output</* @Nullable */ String> getServiceDnsName() {
        return this.serviceDnsName;
    }
    /**
     * The kind of service (Stateless or Stateful).
     * 
     */
    @OutputExport(name="serviceKind", type=String.class, parameters={})
    private Output<String> serviceKind;

    /**
     * @return The kind of service (Stateless or Stateful).
     * 
     */
    public Output<String> getServiceKind() {
        return this.serviceKind;
    }
    /**
     * The service load metrics is given as an array of ServiceLoadMetricDescription objects.
     * 
     */
    @OutputExport(name="serviceLoadMetrics", type=List.class, parameters={ServiceLoadMetricDescriptionResponse.class})
    private Output</* @Nullable */ List<ServiceLoadMetricDescriptionResponse>> serviceLoadMetrics;

    /**
     * @return The service load metrics is given as an array of ServiceLoadMetricDescription objects.
     * 
     */
    public Output</* @Nullable */ List<ServiceLoadMetricDescriptionResponse>> getServiceLoadMetrics() {
        return this.serviceLoadMetrics;
    }
    /**
     * The activation Mode of the service package
     * 
     */
    @OutputExport(name="servicePackageActivationMode", type=String.class, parameters={})
    private Output</* @Nullable */ String> servicePackageActivationMode;

    /**
     * @return The activation Mode of the service package
     * 
     */
    public Output</* @Nullable */ String> getServicePackageActivationMode() {
        return this.servicePackageActivationMode;
    }
    /**
     * A list that describes the correlation of the service with other services.
     * 
     */
    @OutputExport(name="servicePlacementPolicies", type=List.class, parameters={ServicePlacementPolicyDescriptionResponse.class})
    private Output</* @Nullable */ List<ServicePlacementPolicyDescriptionResponse>> servicePlacementPolicies;

    /**
     * @return A list that describes the correlation of the service with other services.
     * 
     */
    public Output</* @Nullable */ List<ServicePlacementPolicyDescriptionResponse>> getServicePlacementPolicies() {
        return this.servicePlacementPolicies;
    }
    /**
     * The name of the service type
     * 
     */
    @OutputExport(name="serviceTypeName", type=String.class, parameters={})
    private Output</* @Nullable */ String> serviceTypeName;

    /**
     * @return The name of the service type
     * 
     */
    public Output</* @Nullable */ String> getServiceTypeName() {
        return this.serviceTypeName;
    }
    /**
     * Azure resource tags.
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Azure resource tags.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * Azure resource type.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Azure resource type.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Service(String name, ServiceArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:servicefabric:Service", name, args == null ? ServiceArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Service(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:servicefabric:Service", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:servicefabric/v20170701preview:Service").build()),
                Input.of(Alias.builder().setType("azure-native:servicefabric/v20190301:Service").build()),
                Input.of(Alias.builder().setType("azure-native:servicefabric/v20190301preview:Service").build()),
                Input.of(Alias.builder().setType("azure-native:servicefabric/v20190601preview:Service").build()),
                Input.of(Alias.builder().setType("azure-native:servicefabric/v20191101preview:Service").build()),
                Input.of(Alias.builder().setType("azure-native:servicefabric/v20200301:Service").build()),
                Input.of(Alias.builder().setType("azure-native:servicefabric/v20201201preview:Service").build()),
                Input.of(Alias.builder().setType("azure-native:servicefabric/v20210601:Service").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Service get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Service(name, id, options);
    }
}
