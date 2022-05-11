// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.operationalinsights;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.operationalinsights.ClusterArgs;
import com.pulumi.azurenative.operationalinsights.outputs.AssociatedWorkspaceResponse;
import com.pulumi.azurenative.operationalinsights.outputs.CapacityReservationPropertiesResponse;
import com.pulumi.azurenative.operationalinsights.outputs.ClusterSkuResponse;
import com.pulumi.azurenative.operationalinsights.outputs.IdentityResponse;
import com.pulumi.azurenative.operationalinsights.outputs.KeyVaultPropertiesResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * The top level Log Analytics cluster resource container.
 * API Version: 2020-10-01.
 * 
 * ## Example Usage
 * ### ClustersCreate
 * 
 * ```java
 * package generated_program;
 * 
 * import java.util.*;
 * import java.io.*;
 * import java.nio.*;
 * import com.pulumi.*;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var cluster = new Cluster(&#34;cluster&#34;, ClusterArgs.builder()        
 *             .clusterName(&#34;oiautorest6685&#34;)
 *             .location(&#34;australiasoutheast&#34;)
 *             .resourceGroupName(&#34;oiautorest6685&#34;)
 *             .sku(Map.ofEntries(
 *                 Map.entry(&#34;capacity&#34;, 1000),
 *                 Map.entry(&#34;name&#34;, &#34;CapacityReservation&#34;)
 *             ))
 *             .tags(Map.of(&#34;tag1&#34;, &#34;val1&#34;))
 *             .build());
 * 
 *         }
 * }
 * 
 * ```
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:operationalinsights:Cluster oiautorest6685 /subscriptions/594038b5-1093-476e-a366-482775671c11/resourcegroups/oiautorest6685/providers/microsoft.operationalinsights/clusters/oiautorest6685 
 * ```
 * 
 */
@ResourceType(type="azure-native:operationalinsights:Cluster")
public class Cluster extends com.pulumi.resources.CustomResource {
    /**
     * The list of Log Analytics workspaces associated with the cluster
     * 
     */
    @Export(name="associatedWorkspaces", type=List.class, parameters={AssociatedWorkspaceResponse.class})
    private Output</* @Nullable */ List<AssociatedWorkspaceResponse>> associatedWorkspaces;

    /**
     * @return The list of Log Analytics workspaces associated with the cluster
     * 
     */
    public Output<Optional<List<AssociatedWorkspaceResponse>>> associatedWorkspaces() {
        return Codegen.optional(this.associatedWorkspaces);
    }
    /**
     * The cluster&#39;s billing type.
     * 
     */
    @Export(name="billingType", type=String.class, parameters={})
    private Output</* @Nullable */ String> billingType;

    /**
     * @return The cluster&#39;s billing type.
     * 
     */
    public Output<Optional<String>> billingType() {
        return Codegen.optional(this.billingType);
    }
    /**
     * Additional properties for capacity reservation
     * 
     */
    @Export(name="capacityReservationProperties", type=CapacityReservationPropertiesResponse.class, parameters={})
    private Output</* @Nullable */ CapacityReservationPropertiesResponse> capacityReservationProperties;

    /**
     * @return Additional properties for capacity reservation
     * 
     */
    public Output<Optional<CapacityReservationPropertiesResponse>> capacityReservationProperties() {
        return Codegen.optional(this.capacityReservationProperties);
    }
    /**
     * The ID associated with the cluster.
     * 
     */
    @Export(name="clusterId", type=String.class, parameters={})
    private Output<String> clusterId;

    /**
     * @return The ID associated with the cluster.
     * 
     */
    public Output<String> clusterId() {
        return this.clusterId;
    }
    /**
     * The cluster creation time
     * 
     */
    @Export(name="createdDate", type=String.class, parameters={})
    private Output<String> createdDate;

    /**
     * @return The cluster creation time
     * 
     */
    public Output<String> createdDate() {
        return this.createdDate;
    }
    /**
     * The identity of the resource.
     * 
     */
    @Export(name="identity", type=IdentityResponse.class, parameters={})
    private Output</* @Nullable */ IdentityResponse> identity;

    /**
     * @return The identity of the resource.
     * 
     */
    public Output<Optional<IdentityResponse>> identity() {
        return Codegen.optional(this.identity);
    }
    /**
     * Sets whether the cluster will support availability zones. This can be set as true only in regions where Azure Data Explorer support Availability Zones. This Property can not be modified after cluster creation. Default value is &#39;true&#39; if region supports Availability Zones.
     * 
     */
    @Export(name="isAvailabilityZonesEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> isAvailabilityZonesEnabled;

    /**
     * @return Sets whether the cluster will support availability zones. This can be set as true only in regions where Azure Data Explorer support Availability Zones. This Property can not be modified after cluster creation. Default value is &#39;true&#39; if region supports Availability Zones.
     * 
     */
    public Output<Optional<Boolean>> isAvailabilityZonesEnabled() {
        return Codegen.optional(this.isAvailabilityZonesEnabled);
    }
    /**
     * The associated key properties.
     * 
     */
    @Export(name="keyVaultProperties", type=KeyVaultPropertiesResponse.class, parameters={})
    private Output</* @Nullable */ KeyVaultPropertiesResponse> keyVaultProperties;

    /**
     * @return The associated key properties.
     * 
     */
    public Output<Optional<KeyVaultPropertiesResponse>> keyVaultProperties() {
        return Codegen.optional(this.keyVaultProperties);
    }
    /**
     * The last time the cluster was updated.
     * 
     */
    @Export(name="lastModifiedDate", type=String.class, parameters={})
    private Output<String> lastModifiedDate;

    /**
     * @return The last time the cluster was updated.
     * 
     */
    public Output<String> lastModifiedDate() {
        return this.lastModifiedDate;
    }
    /**
     * The geo-location where the resource lives
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return The geo-location where the resource lives
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * The name of the resource
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the resource
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The provisioning state of the cluster.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The provisioning state of the cluster.
     * 
     */
    public Output<String> provisioningState() {
        return this.provisioningState;
    }
    /**
     * The sku properties.
     * 
     */
    @Export(name="sku", type=ClusterSkuResponse.class, parameters={})
    private Output</* @Nullable */ ClusterSkuResponse> sku;

    /**
     * @return The sku properties.
     * 
     */
    public Output<Optional<ClusterSkuResponse>> sku() {
        return Codegen.optional(this.sku);
    }
    /**
     * Resource tags.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Resource tags.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * The type of the resource. E.g. &#34;Microsoft.Compute/virtualMachines&#34; or &#34;Microsoft.Storage/storageAccounts&#34;
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource. E.g. &#34;Microsoft.Compute/virtualMachines&#34; or &#34;Microsoft.Storage/storageAccounts&#34;
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Cluster(String name) {
        this(name, ClusterArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Cluster(String name, ClusterArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Cluster(String name, ClusterArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:operationalinsights:Cluster", name, args == null ? ClusterArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Cluster(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:operationalinsights:Cluster", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:operationalinsights/v20190801preview:Cluster").build()),
                Output.of(Alias.builder().type("azure-native:operationalinsights/v20200301preview:Cluster").build()),
                Output.of(Alias.builder().type("azure-native:operationalinsights/v20200801:Cluster").build()),
                Output.of(Alias.builder().type("azure-native:operationalinsights/v20201001:Cluster").build()),
                Output.of(Alias.builder().type("azure-native:operationalinsights/v20210601:Cluster").build())
            ))
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Cluster get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Cluster(name, id, options);
    }
}
