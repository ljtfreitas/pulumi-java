// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabric;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.servicefabric.ManagedClusterArgs;
import io.pulumi.azurenative.servicefabric.outputs.AzureActiveDirectoryResponse;
import io.pulumi.azurenative.servicefabric.outputs.ClientCertificateResponse;
import io.pulumi.azurenative.servicefabric.outputs.LoadBalancingRuleResponse;
import io.pulumi.azurenative.servicefabric.outputs.SettingsSectionDescriptionResponse;
import io.pulumi.azurenative.servicefabric.outputs.SkuResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * The manged cluster resource
 * 
 * API Version: 2020-01-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:servicefabric:ManagedCluster myCluster /subscriptions/00000000-0000-0000-0000-000000000000/resourcegroups/resRg/providers/Microsoft.ServiceFabric/managedClusters/myCluster 
 * ```
 * 
 */
@ResourceType(type="azure-native:servicefabric:ManagedCluster")
public class ManagedCluster extends io.pulumi.resources.CustomResource {
    /**
     * client certificates for the cluster.
     * 
     */
    @Export(name="addonFeatures", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> addonFeatures;

    /**
     * @return client certificates for the cluster.
     * 
     */
    public Output</* @Nullable */ List<String>> getAddonFeatures() {
        return this.addonFeatures;
    }
    /**
     * vm admin user password.
     * 
     */
    @Export(name="adminPassword", type=String.class, parameters={})
    private Output</* @Nullable */ String> adminPassword;

    /**
     * @return vm admin user password.
     * 
     */
    public Output</* @Nullable */ String> getAdminPassword() {
        return this.adminPassword;
    }
    /**
     * vm admin user name.
     * 
     */
    @Export(name="adminUserName", type=String.class, parameters={})
    private Output<String> adminUserName;

    /**
     * @return vm admin user name.
     * 
     */
    public Output<String> getAdminUserName() {
        return this.adminUserName;
    }
    /**
     * Azure active directory.
     * 
     */
    @Export(name="azureActiveDirectory", type=AzureActiveDirectoryResponse.class, parameters={})
    private Output</* @Nullable */ AzureActiveDirectoryResponse> azureActiveDirectory;

    /**
     * @return Azure active directory.
     * 
     */
    public Output</* @Nullable */ AzureActiveDirectoryResponse> getAzureActiveDirectory() {
        return this.azureActiveDirectory;
    }
    /**
     * The port used for client connections to the cluster.
     * 
     */
    @Export(name="clientConnectionPort", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> clientConnectionPort;

    /**
     * @return The port used for client connections to the cluster.
     * 
     */
    public Output</* @Nullable */ Integer> getClientConnectionPort() {
        return this.clientConnectionPort;
    }
    /**
     * client certificates for the cluster.
     * 
     */
    @Export(name="clients", type=List.class, parameters={ClientCertificateResponse.class})
    private Output</* @Nullable */ List<ClientCertificateResponse>> clients;

    /**
     * @return client certificates for the cluster.
     * 
     */
    public Output</* @Nullable */ List<ClientCertificateResponse>> getClients() {
        return this.clients;
    }
    /**
     * The cluster certificate thumbprint used node to node communication.
     * 
     */
    @Export(name="clusterCertificateThumbprint", type=String.class, parameters={})
    private Output<String> clusterCertificateThumbprint;

    /**
     * @return The cluster certificate thumbprint used node to node communication.
     * 
     */
    public Output<String> getClusterCertificateThumbprint() {
        return this.clusterCertificateThumbprint;
    }
    /**
     * The Service Fabric runtime version of the cluster. This property can only by set the user when **upgradeMode** is set to 'Manual'. To get list of available Service Fabric versions for new clusters use [ClusterVersion API](./ClusterVersion.md). To get the list of available version for existing clusters use **availableClusterVersions**.
     * 
     */
    @Export(name="clusterCodeVersion", type=String.class, parameters={})
    private Output</* @Nullable */ String> clusterCodeVersion;

    /**
     * @return The Service Fabric runtime version of the cluster. This property can only by set the user when **upgradeMode** is set to 'Manual'. To get list of available Service Fabric versions for new clusters use [ClusterVersion API](./ClusterVersion.md). To get the list of available version for existing clusters use **availableClusterVersions**.
     * 
     */
    public Output</* @Nullable */ String> getClusterCodeVersion() {
        return this.clusterCodeVersion;
    }
    /**
     * A service generated unique identifier for the cluster resource.
     * 
     */
    @Export(name="clusterId", type=String.class, parameters={})
    private Output<String> clusterId;

    /**
     * @return A service generated unique identifier for the cluster resource.
     * 
     */
    public Output<String> getClusterId() {
        return this.clusterId;
    }
    /**
     * The current state of the cluster.
     * 
     */
    @Export(name="clusterState", type=String.class, parameters={})
    private Output<String> clusterState;

    /**
     * @return The current state of the cluster.
     * 
     */
    public Output<String> getClusterState() {
        return this.clusterState;
    }
    /**
     * The cluster dns name.
     * 
     */
    @Export(name="dnsName", type=String.class, parameters={})
    private Output<String> dnsName;

    /**
     * @return The cluster dns name.
     * 
     */
    public Output<String> getDnsName() {
        return this.dnsName;
    }
    /**
     * Azure resource etag.
     * 
     */
    @Export(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return Azure resource etag.
     * 
     */
    public Output<String> getEtag() {
        return this.etag;
    }
    /**
     * The list of custom fabric settings to configure the cluster.
     * 
     */
    @Export(name="fabricSettings", type=List.class, parameters={SettingsSectionDescriptionResponse.class})
    private Output</* @Nullable */ List<SettingsSectionDescriptionResponse>> fabricSettings;

    /**
     * @return The list of custom fabric settings to configure the cluster.
     * 
     */
    public Output</* @Nullable */ List<SettingsSectionDescriptionResponse>> getFabricSettings() {
        return this.fabricSettings;
    }
    /**
     * the cluster Fully qualified domain name.
     * 
     */
    @Export(name="fqdn", type=String.class, parameters={})
    private Output<String> fqdn;

    /**
     * @return the cluster Fully qualified domain name.
     * 
     */
    public Output<String> getFqdn() {
        return this.fqdn;
    }
    /**
     * The port used for http connections to the cluster.
     * 
     */
    @Export(name="httpGatewayConnectionPort", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> httpGatewayConnectionPort;

    /**
     * @return The port used for http connections to the cluster.
     * 
     */
    public Output</* @Nullable */ Integer> getHttpGatewayConnectionPort() {
        return this.httpGatewayConnectionPort;
    }
    /**
     * Describes load balancing rules.
     * 
     */
    @Export(name="loadBalancingRules", type=List.class, parameters={LoadBalancingRuleResponse.class})
    private Output</* @Nullable */ List<LoadBalancingRuleResponse>> loadBalancingRules;

    /**
     * @return Describes load balancing rules.
     * 
     */
    public Output</* @Nullable */ List<LoadBalancingRuleResponse>> getLoadBalancingRules() {
        return this.loadBalancingRules;
    }
    /**
     * Azure resource location.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return Azure resource location.
     * 
     */
    public Output<String> getLocation() {
        return this.location;
    }
    /**
     * Azure resource name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Azure resource name.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The provisioning state of the managed cluster resource.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The provisioning state of the managed cluster resource.
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The sku of the managed cluster
     * 
     */
    @Export(name="sku", type=SkuResponse.class, parameters={})
    private Output</* @Nullable */ SkuResponse> sku;

    /**
     * @return The sku of the managed cluster
     * 
     */
    public Output</* @Nullable */ SkuResponse> getSku() {
        return this.sku;
    }
    /**
     * Azure resource tags.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
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
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Azure resource type.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    public interface BuilderApplicator {
        public void apply(ManagedClusterArgs.Builder a);
    }
    private static io.pulumi.azurenative.servicefabric.ManagedClusterArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.servicefabric.ManagedClusterArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public ManagedCluster(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ManagedCluster(String name) {
        this(name, ManagedClusterArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ManagedCluster(String name, ManagedClusterArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ManagedCluster(String name, ManagedClusterArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:servicefabric:ManagedCluster", name, args == null ? ManagedClusterArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private ManagedCluster(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:servicefabric:ManagedCluster", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Output.of(Alias.builder().setType("azure-native:servicefabric/v20200101preview:ManagedCluster").build()),
                Output.of(Alias.builder().setType("azure-native:servicefabric/v20210101preview:ManagedCluster").build()),
                Output.of(Alias.builder().setType("azure-native:servicefabric/v20210501:ManagedCluster").build()),
                Output.of(Alias.builder().setType("azure-native:servicefabric/v20210701preview:ManagedCluster").build()),
                Output.of(Alias.builder().setType("azure-native:servicefabric/v20210901privatepreview:ManagedCluster").build()),
                Output.of(Alias.builder().setType("azure-native:servicefabric/v20211101preview:ManagedCluster").build())
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
    public static ManagedCluster get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ManagedCluster(name, id, options);
    }
}
