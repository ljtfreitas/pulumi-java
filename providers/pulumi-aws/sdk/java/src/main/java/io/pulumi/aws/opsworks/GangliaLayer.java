// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.opsworks;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.opsworks.GangliaLayerArgs;
import io.pulumi.aws.opsworks.inputs.GangliaLayerState;
import io.pulumi.aws.opsworks.outputs.GangliaLayerCloudwatchConfiguration;
import io.pulumi.aws.opsworks.outputs.GangliaLayerEbsVolume;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides an OpsWorks Ganglia layer resource.
 * 
 * ## Example Usage
 * 
 */
@ResourceType(type="aws:opsworks/gangliaLayer:GangliaLayer")
public class GangliaLayer extends io.pulumi.resources.CustomResource {
    /**
     * The Amazon Resource Name(ARN) of the layer.
     * 
     */
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The Amazon Resource Name(ARN) of the layer.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * Whether to automatically assign an elastic IP address to the layer's instances.
     * 
     */
    @OutputExport(name="autoAssignElasticIps", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> autoAssignElasticIps;

    /**
     * @return Whether to automatically assign an elastic IP address to the layer's instances.
     * 
     */
    public Output</* @Nullable */ Boolean> getAutoAssignElasticIps() {
        return this.autoAssignElasticIps;
    }
    /**
     * For stacks belonging to a VPC, whether to automatically assign a public IP address to each of the layer's instances.
     * 
     */
    @OutputExport(name="autoAssignPublicIps", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> autoAssignPublicIps;

    /**
     * @return For stacks belonging to a VPC, whether to automatically assign a public IP address to each of the layer's instances.
     * 
     */
    public Output</* @Nullable */ Boolean> getAutoAssignPublicIps() {
        return this.autoAssignPublicIps;
    }
    /**
     * Whether to enable auto-healing for the layer.
     * 
     */
    @OutputExport(name="autoHealing", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> autoHealing;

    /**
     * @return Whether to enable auto-healing for the layer.
     * 
     */
    public Output</* @Nullable */ Boolean> getAutoHealing() {
        return this.autoHealing;
    }
    @OutputExport(name="cloudwatchConfiguration", type=GangliaLayerCloudwatchConfiguration.class, parameters={})
    private Output</* @Nullable */ GangliaLayerCloudwatchConfiguration> cloudwatchConfiguration;

    public Output</* @Nullable */ GangliaLayerCloudwatchConfiguration> getCloudwatchConfiguration() {
        return this.cloudwatchConfiguration;
    }
    @OutputExport(name="customConfigureRecipes", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> customConfigureRecipes;

    public Output</* @Nullable */ List<String>> getCustomConfigureRecipes() {
        return this.customConfigureRecipes;
    }
    @OutputExport(name="customDeployRecipes", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> customDeployRecipes;

    public Output</* @Nullable */ List<String>> getCustomDeployRecipes() {
        return this.customDeployRecipes;
    }
    /**
     * The ARN of an IAM profile that will be used for the layer's instances.
     * 
     */
    @OutputExport(name="customInstanceProfileArn", type=String.class, parameters={})
    private Output</* @Nullable */ String> customInstanceProfileArn;

    /**
     * @return The ARN of an IAM profile that will be used for the layer's instances.
     * 
     */
    public Output</* @Nullable */ String> getCustomInstanceProfileArn() {
        return this.customInstanceProfileArn;
    }
    /**
     * Custom JSON attributes to apply to the layer.
     * 
     */
    @OutputExport(name="customJson", type=String.class, parameters={})
    private Output</* @Nullable */ String> customJson;

    /**
     * @return Custom JSON attributes to apply to the layer.
     * 
     */
    public Output</* @Nullable */ String> getCustomJson() {
        return this.customJson;
    }
    /**
     * Ids for a set of security groups to apply to the layer's instances.
     * 
     */
    @OutputExport(name="customSecurityGroupIds", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> customSecurityGroupIds;

    /**
     * @return Ids for a set of security groups to apply to the layer's instances.
     * 
     */
    public Output</* @Nullable */ List<String>> getCustomSecurityGroupIds() {
        return this.customSecurityGroupIds;
    }
    @OutputExport(name="customSetupRecipes", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> customSetupRecipes;

    public Output</* @Nullable */ List<String>> getCustomSetupRecipes() {
        return this.customSetupRecipes;
    }
    @OutputExport(name="customShutdownRecipes", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> customShutdownRecipes;

    public Output</* @Nullable */ List<String>> getCustomShutdownRecipes() {
        return this.customShutdownRecipes;
    }
    @OutputExport(name="customUndeployRecipes", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> customUndeployRecipes;

    public Output</* @Nullable */ List<String>> getCustomUndeployRecipes() {
        return this.customUndeployRecipes;
    }
    /**
     * Whether to enable Elastic Load Balancing connection draining.
     * 
     */
    @OutputExport(name="drainElbOnShutdown", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> drainElbOnShutdown;

    /**
     * @return Whether to enable Elastic Load Balancing connection draining.
     * 
     */
    public Output</* @Nullable */ Boolean> getDrainElbOnShutdown() {
        return this.drainElbOnShutdown;
    }
    /**
     * `ebs_volume` blocks, as described below, will each create an EBS volume and connect it to the layer's instances.
     * 
     */
    @OutputExport(name="ebsVolumes", type=List.class, parameters={GangliaLayerEbsVolume.class})
    private Output</* @Nullable */ List<GangliaLayerEbsVolume>> ebsVolumes;

    /**
     * @return `ebs_volume` blocks, as described below, will each create an EBS volume and connect it to the layer's instances.
     * 
     */
    public Output</* @Nullable */ List<GangliaLayerEbsVolume>> getEbsVolumes() {
        return this.ebsVolumes;
    }
    /**
     * Name of an Elastic Load Balancer to attach to this layer
     * 
     */
    @OutputExport(name="elasticLoadBalancer", type=String.class, parameters={})
    private Output</* @Nullable */ String> elasticLoadBalancer;

    /**
     * @return Name of an Elastic Load Balancer to attach to this layer
     * 
     */
    public Output</* @Nullable */ String> getElasticLoadBalancer() {
        return this.elasticLoadBalancer;
    }
    /**
     * Whether to install OS and package updates on each instance when it boots.
     * 
     */
    @OutputExport(name="installUpdatesOnBoot", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> installUpdatesOnBoot;

    /**
     * @return Whether to install OS and package updates on each instance when it boots.
     * 
     */
    public Output</* @Nullable */ Boolean> getInstallUpdatesOnBoot() {
        return this.installUpdatesOnBoot;
    }
    /**
     * The time, in seconds, that OpsWorks will wait for Chef to complete after triggering the Shutdown event.
     * 
     */
    @OutputExport(name="instanceShutdownTimeout", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> instanceShutdownTimeout;

    /**
     * @return The time, in seconds, that OpsWorks will wait for Chef to complete after triggering the Shutdown event.
     * 
     */
    public Output</* @Nullable */ Integer> getInstanceShutdownTimeout() {
        return this.instanceShutdownTimeout;
    }
    /**
     * A human-readable name for the layer.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return A human-readable name for the layer.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The password to use for Ganglia.
     * 
     */
    @OutputExport(name="password", type=String.class, parameters={})
    private Output<String> password;

    /**
     * @return The password to use for Ganglia.
     * 
     */
    public Output<String> getPassword() {
        return this.password;
    }
    /**
     * The id of the stack the layer will belong to.
     * 
     */
    @OutputExport(name="stackId", type=String.class, parameters={})
    private Output<String> stackId;

    /**
     * @return The id of the stack the layer will belong to.
     * 
     */
    public Output<String> getStackId() {
        return this.stackId;
    }
    /**
     * Names of a set of system packages to install on the layer's instances.
     * 
     */
    @OutputExport(name="systemPackages", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> systemPackages;

    /**
     * @return Names of a set of system packages to install on the layer's instances.
     * 
     */
    public Output</* @Nullable */ List<String>> getSystemPackages() {
        return this.systemPackages;
    }
    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @OutputExport(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll;
    }
    /**
     * The URL path to use for Ganglia. Defaults to "/ganglia".
     * 
     */
    @OutputExport(name="url", type=String.class, parameters={})
    private Output</* @Nullable */ String> url;

    /**
     * @return The URL path to use for Ganglia. Defaults to "/ganglia".
     * 
     */
    public Output</* @Nullable */ String> getUrl() {
        return this.url;
    }
    /**
     * Whether to use EBS-optimized instances.
     * 
     */
    @OutputExport(name="useEbsOptimizedInstances", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> useEbsOptimizedInstances;

    /**
     * @return Whether to use EBS-optimized instances.
     * 
     */
    public Output</* @Nullable */ Boolean> getUseEbsOptimizedInstances() {
        return this.useEbsOptimizedInstances;
    }
    /**
     * The username to use for Ganglia. Defaults to "opsworks".
     * 
     */
    @OutputExport(name="username", type=String.class, parameters={})
    private Output</* @Nullable */ String> username;

    /**
     * @return The username to use for Ganglia. Defaults to "opsworks".
     * 
     */
    public Output</* @Nullable */ String> getUsername() {
        return this.username;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public GangliaLayer(String name, GangliaLayerArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:opsworks/gangliaLayer:GangliaLayer", name, args == null ? GangliaLayerArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private GangliaLayer(String name, Input<String> id, @Nullable GangliaLayerState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:opsworks/gangliaLayer:GangliaLayer", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static GangliaLayer get(String name, Input<String> id, @Nullable GangliaLayerState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new GangliaLayer(name, id, state, options);
    }
}
