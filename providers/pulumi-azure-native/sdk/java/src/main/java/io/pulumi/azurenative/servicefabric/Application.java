// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabric;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.servicefabric.ApplicationArgs;
import io.pulumi.azurenative.servicefabric.outputs.ApplicationMetricDescriptionResponse;
import io.pulumi.azurenative.servicefabric.outputs.ApplicationUpgradePolicyResponse;
import io.pulumi.azurenative.servicefabric.outputs.ApplicationUserAssignedIdentityResponse;
import io.pulumi.azurenative.servicefabric.outputs.ManagedIdentityResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * The application resource.
 * API Version: 2020-03-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:servicefabric:Application myCluster /subscriptions/00000000-0000-0000-0000-000000000000/resourcegroups/resRg/providers/Microsoft.ServiceFabric/clusters/myCluster/applications/myApp 
 * ```
 * 
 */
@ResourceType(type="azure-native:servicefabric:Application")
public class Application extends io.pulumi.resources.CustomResource {
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
     * Describes the managed identities for an Azure resource.
     * 
     */
    @Export(name="identity", type=ManagedIdentityResponse.class, parameters={})
    private Output</* @Nullable */ ManagedIdentityResponse> identity;

    /**
     * @return Describes the managed identities for an Azure resource.
     * 
     */
    public Output</* @Nullable */ ManagedIdentityResponse> getIdentity() {
        return this.identity;
    }
    /**
     * It will be deprecated in New API, resource location depends on the parent resource.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return It will be deprecated in New API, resource location depends on the parent resource.
     * 
     */
    public Output</* @Nullable */ String> getLocation() {
        return this.location;
    }
    /**
     * List of user assigned identities for the application, each mapped to a friendly name.
     * 
     */
    @Export(name="managedIdentities", type=List.class, parameters={ApplicationUserAssignedIdentityResponse.class})
    private Output</* @Nullable */ List<ApplicationUserAssignedIdentityResponse>> managedIdentities;

    /**
     * @return List of user assigned identities for the application, each mapped to a friendly name.
     * 
     */
    public Output</* @Nullable */ List<ApplicationUserAssignedIdentityResponse>> getManagedIdentities() {
        return this.managedIdentities;
    }
    /**
     * The maximum number of nodes where Service Fabric will reserve capacity for this application. Note that this does not mean that the services of this application will be placed on all of those nodes. By default, the value of this property is zero and it means that the services can be placed on any node.
     * 
     */
    @Export(name="maximumNodes", type=Double.class, parameters={})
    private Output</* @Nullable */ Double> maximumNodes;

    /**
     * @return The maximum number of nodes where Service Fabric will reserve capacity for this application. Note that this does not mean that the services of this application will be placed on all of those nodes. By default, the value of this property is zero and it means that the services can be placed on any node.
     * 
     */
    public Output</* @Nullable */ Double> getMaximumNodes() {
        return this.maximumNodes;
    }
    /**
     * List of application capacity metric description.
     * 
     */
    @Export(name="metrics", type=List.class, parameters={ApplicationMetricDescriptionResponse.class})
    private Output</* @Nullable */ List<ApplicationMetricDescriptionResponse>> metrics;

    /**
     * @return List of application capacity metric description.
     * 
     */
    public Output</* @Nullable */ List<ApplicationMetricDescriptionResponse>> getMetrics() {
        return this.metrics;
    }
    /**
     * The minimum number of nodes where Service Fabric will reserve capacity for this application. Note that this does not mean that the services of this application will be placed on all of those nodes. If this property is set to zero, no capacity will be reserved. The value of this property cannot be more than the value of the MaximumNodes property.
     * 
     */
    @Export(name="minimumNodes", type=Double.class, parameters={})
    private Output</* @Nullable */ Double> minimumNodes;

    /**
     * @return The minimum number of nodes where Service Fabric will reserve capacity for this application. Note that this does not mean that the services of this application will be placed on all of those nodes. If this property is set to zero, no capacity will be reserved. The value of this property cannot be more than the value of the MaximumNodes property.
     * 
     */
    public Output</* @Nullable */ Double> getMinimumNodes() {
        return this.minimumNodes;
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
     * List of application parameters with overridden values from their default values specified in the application manifest.
     * 
     */
    @Export(name="parameters", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> parameters;

    /**
     * @return List of application parameters with overridden values from their default values specified in the application manifest.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getParameters() {
        return this.parameters;
    }
    /**
     * The current deployment or provisioning state, which only appears in the response
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The current deployment or provisioning state, which only appears in the response
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Remove the current application capacity settings.
     * 
     */
    @Export(name="removeApplicationCapacity", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> removeApplicationCapacity;

    /**
     * @return Remove the current application capacity settings.
     * 
     */
    public Output</* @Nullable */ Boolean> getRemoveApplicationCapacity() {
        return this.removeApplicationCapacity;
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
    /**
     * The application type name as defined in the application manifest.
     * 
     */
    @Export(name="typeName", type=String.class, parameters={})
    private Output</* @Nullable */ String> typeName;

    /**
     * @return The application type name as defined in the application manifest.
     * 
     */
    public Output</* @Nullable */ String> getTypeName() {
        return this.typeName;
    }
    /**
     * The version of the application type as defined in the application manifest.
     * 
     */
    @Export(name="typeVersion", type=String.class, parameters={})
    private Output</* @Nullable */ String> typeVersion;

    /**
     * @return The version of the application type as defined in the application manifest.
     * 
     */
    public Output</* @Nullable */ String> getTypeVersion() {
        return this.typeVersion;
    }
    /**
     * Describes the policy for a monitored application upgrade.
     * 
     */
    @Export(name="upgradePolicy", type=ApplicationUpgradePolicyResponse.class, parameters={})
    private Output</* @Nullable */ ApplicationUpgradePolicyResponse> upgradePolicy;

    /**
     * @return Describes the policy for a monitored application upgrade.
     * 
     */
    public Output</* @Nullable */ ApplicationUpgradePolicyResponse> getUpgradePolicy() {
        return this.upgradePolicy;
    }

    public interface BuilderApplicator {
        public void apply(ApplicationArgs.Builder a);
    }
    private static io.pulumi.azurenative.servicefabric.ApplicationArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.servicefabric.ApplicationArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Application(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Application(String name) {
        this(name, ApplicationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Application(String name, ApplicationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Application(String name, ApplicationArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:servicefabric:Application", name, args == null ? ApplicationArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private Application(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:servicefabric:Application", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Output.of(Alias.builder().setType("azure-native:servicefabric/v20170701preview:Application").build()),
                Output.of(Alias.builder().setType("azure-native:servicefabric/v20190301:Application").build()),
                Output.of(Alias.builder().setType("azure-native:servicefabric/v20190301preview:Application").build()),
                Output.of(Alias.builder().setType("azure-native:servicefabric/v20190601preview:Application").build()),
                Output.of(Alias.builder().setType("azure-native:servicefabric/v20191101preview:Application").build()),
                Output.of(Alias.builder().setType("azure-native:servicefabric/v20200301:Application").build()),
                Output.of(Alias.builder().setType("azure-native:servicefabric/v20201201preview:Application").build()),
                Output.of(Alias.builder().setType("azure-native:servicefabric/v20210601:Application").build())
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
    public static Application get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Application(name, id, options);
    }
}
