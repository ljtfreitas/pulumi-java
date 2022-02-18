// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.web.KubeEnvironmentArgs;
import io.pulumi.azurenative.web.outputs.AppLogsConfigurationResponse;
import io.pulumi.azurenative.web.outputs.ArcConfigurationResponse;
import io.pulumi.azurenative.web.outputs.ExtendedLocationResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * A Kubernetes cluster specialized for web workloads by Azure App Service
 * API Version: 2021-01-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:web:KubeEnvironment testkubeenv /subscriptions/34adfa4f-cedf-4dc0-ba29-b6d1a69ab345/resourceGroups/examplerg/providers/Microsoft.Web/kubeEnvironments/testkubeenv 
 * ```
 * 
 */
@ResourceType(type="azure-native:web:KubeEnvironment")
public class KubeEnvironment extends io.pulumi.resources.CustomResource {
    @OutputExport(name="aksResourceID", type=String.class, parameters={})
    private Output</* @Nullable */ String> aksResourceID;

    public Output</* @Nullable */ String> getAksResourceID() {
        return this.aksResourceID;
    }
    /**
     * Cluster configuration which enables the log daemon to export
     * app logs to a destination. Currently only "log-analytics" is
     * supported
     * 
     */
    @OutputExport(name="appLogsConfiguration", type=AppLogsConfigurationResponse.class, parameters={})
    private Output</* @Nullable */ AppLogsConfigurationResponse> appLogsConfiguration;

    /**
     * @return Cluster configuration which enables the log daemon to export
     * app logs to a destination. Currently only "log-analytics" is
     * supported
     * 
     */
    public Output</* @Nullable */ AppLogsConfigurationResponse> getAppLogsConfiguration() {
        return this.appLogsConfiguration;
    }
    /**
     * Cluster configuration which determines the ARC cluster
     * components types. Eg: Choosing between BuildService kind,
     * FrontEnd Service ArtifactsStorageType etc.
     * 
     */
    @OutputExport(name="arcConfiguration", type=ArcConfigurationResponse.class, parameters={})
    private Output</* @Nullable */ ArcConfigurationResponse> arcConfiguration;

    /**
     * @return Cluster configuration which determines the ARC cluster
     * components types. Eg: Choosing between BuildService kind,
     * FrontEnd Service ArtifactsStorageType etc.
     * 
     */
    public Output</* @Nullable */ ArcConfigurationResponse> getArcConfiguration() {
        return this.arcConfiguration;
    }
    /**
     * Default Domain Name for the cluster
     * 
     */
    @OutputExport(name="defaultDomain", type=String.class, parameters={})
    private Output<String> defaultDomain;

    /**
     * @return Default Domain Name for the cluster
     * 
     */
    public Output<String> getDefaultDomain() {
        return this.defaultDomain;
    }
    /**
     * Any errors that occurred during deployment or deployment validation
     * 
     */
    @OutputExport(name="deploymentErrors", type=String.class, parameters={})
    private Output<String> deploymentErrors;

    /**
     * @return Any errors that occurred during deployment or deployment validation
     * 
     */
    public Output<String> getDeploymentErrors() {
        return this.deploymentErrors;
    }
    /**
     * Extended Location.
     * 
     */
    @OutputExport(name="extendedLocation", type=ExtendedLocationResponse.class, parameters={})
    private Output</* @Nullable */ ExtendedLocationResponse> extendedLocation;

    /**
     * @return Extended Location.
     * 
     */
    public Output</* @Nullable */ ExtendedLocationResponse> getExtendedLocation() {
        return this.extendedLocation;
    }
    /**
     * Only visible within Vnet/Subnet
     * 
     */
    @OutputExport(name="internalLoadBalancerEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> internalLoadBalancerEnabled;

    /**
     * @return Only visible within Vnet/Subnet
     * 
     */
    public Output</* @Nullable */ Boolean> getInternalLoadBalancerEnabled() {
        return this.internalLoadBalancerEnabled;
    }
    /**
     * Kind of resource.
     * 
     */
    @OutputExport(name="kind", type=String.class, parameters={})
    private Output</* @Nullable */ String> kind;

    /**
     * @return Kind of resource.
     * 
     */
    public Output</* @Nullable */ String> getKind() {
        return this.kind;
    }
    /**
     * Resource Location.
     * 
     */
    @OutputExport(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return Resource Location.
     * 
     */
    public Output<String> getLocation() {
        return this.location;
    }
    /**
     * Resource Name.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource Name.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Provisioning state of the Kubernetes Environment.
     * 
     */
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return Provisioning state of the Kubernetes Environment.
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Static IP of the KubeEnvironment
     * 
     */
    @OutputExport(name="staticIp", type=String.class, parameters={})
    private Output</* @Nullable */ String> staticIp;

    /**
     * @return Static IP of the KubeEnvironment
     * 
     */
    public Output</* @Nullable */ String> getStaticIp() {
        return this.staticIp;
    }
    /**
     * Resource tags.
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Resource tags.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * Resource type.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type.
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
    public KubeEnvironment(String name, KubeEnvironmentArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:web:KubeEnvironment", name, args == null ? KubeEnvironmentArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private KubeEnvironment(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:web:KubeEnvironment", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:web/v20210101:KubeEnvironment").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20210115:KubeEnvironment").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20210201:KubeEnvironment").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20210301:KubeEnvironment").build())
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
    public static KubeEnvironment get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new KubeEnvironment(name, id, options);
    }
}
