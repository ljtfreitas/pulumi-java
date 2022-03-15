// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.opsworks;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.opsworks.MemcachedLayerArgs;
import io.pulumi.aws.opsworks.inputs.MemcachedLayerState;
import io.pulumi.aws.opsworks.outputs.MemcachedLayerCloudwatchConfiguration;
import io.pulumi.aws.opsworks.outputs.MemcachedLayerEbsVolume;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides an OpsWorks memcached layer resource.
 * 
 * ## Example Usage
 * 
 */
@ResourceType(type="aws:opsworks/memcachedLayer:MemcachedLayer")
public class MemcachedLayer extends io.pulumi.resources.CustomResource {
    /**
     * Amount of memory to allocate for the cache on each instance, in megabytes. Defaults to 512MB.
     * 
     */
    @Export(name="allocatedMemory", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> allocatedMemory;

    /**
     * @return Amount of memory to allocate for the cache on each instance, in megabytes. Defaults to 512MB.
     * 
     */
    public Output</* @Nullable */ Integer> getAllocatedMemory() {
        return this.allocatedMemory;
    }
    /**
     * The Amazon Resource Name(ARN) of the layer.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
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
    @Export(name="autoAssignElasticIps", type=Boolean.class, parameters={})
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
    @Export(name="autoAssignPublicIps", type=Boolean.class, parameters={})
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
    @Export(name="autoHealing", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> autoHealing;

    /**
     * @return Whether to enable auto-healing for the layer.
     * 
     */
    public Output</* @Nullable */ Boolean> getAutoHealing() {
        return this.autoHealing;
    }
    @Export(name="cloudwatchConfiguration", type=MemcachedLayerCloudwatchConfiguration.class, parameters={})
    private Output</* @Nullable */ MemcachedLayerCloudwatchConfiguration> cloudwatchConfiguration;

    public Output</* @Nullable */ MemcachedLayerCloudwatchConfiguration> getCloudwatchConfiguration() {
        return this.cloudwatchConfiguration;
    }
    @Export(name="customConfigureRecipes", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> customConfigureRecipes;

    public Output</* @Nullable */ List<String>> getCustomConfigureRecipes() {
        return this.customConfigureRecipes;
    }
    @Export(name="customDeployRecipes", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> customDeployRecipes;

    public Output</* @Nullable */ List<String>> getCustomDeployRecipes() {
        return this.customDeployRecipes;
    }
    /**
     * The ARN of an IAM profile that will be used for the layer's instances.
     * 
     */
    @Export(name="customInstanceProfileArn", type=String.class, parameters={})
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
    @Export(name="customJson", type=String.class, parameters={})
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
    @Export(name="customSecurityGroupIds", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> customSecurityGroupIds;

    /**
     * @return Ids for a set of security groups to apply to the layer's instances.
     * 
     */
    public Output</* @Nullable */ List<String>> getCustomSecurityGroupIds() {
        return this.customSecurityGroupIds;
    }
    @Export(name="customSetupRecipes", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> customSetupRecipes;

    public Output</* @Nullable */ List<String>> getCustomSetupRecipes() {
        return this.customSetupRecipes;
    }
    @Export(name="customShutdownRecipes", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> customShutdownRecipes;

    public Output</* @Nullable */ List<String>> getCustomShutdownRecipes() {
        return this.customShutdownRecipes;
    }
    @Export(name="customUndeployRecipes", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> customUndeployRecipes;

    public Output</* @Nullable */ List<String>> getCustomUndeployRecipes() {
        return this.customUndeployRecipes;
    }
    /**
     * Whether to enable Elastic Load Balancing connection draining.
     * 
     */
    @Export(name="drainElbOnShutdown", type=Boolean.class, parameters={})
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
    @Export(name="ebsVolumes", type=List.class, parameters={MemcachedLayerEbsVolume.class})
    private Output</* @Nullable */ List<MemcachedLayerEbsVolume>> ebsVolumes;

    /**
     * @return `ebs_volume` blocks, as described below, will each create an EBS volume and connect it to the layer's instances.
     * 
     */
    public Output</* @Nullable */ List<MemcachedLayerEbsVolume>> getEbsVolumes() {
        return this.ebsVolumes;
    }
    /**
     * Name of an Elastic Load Balancer to attach to this layer
     * 
     */
    @Export(name="elasticLoadBalancer", type=String.class, parameters={})
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
    @Export(name="installUpdatesOnBoot", type=Boolean.class, parameters={})
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
    @Export(name="instanceShutdownTimeout", type=Integer.class, parameters={})
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
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return A human-readable name for the layer.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The id of the stack the layer will belong to.
     * 
     */
    @Export(name="stackId", type=String.class, parameters={})
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
    @Export(name="systemPackages", type=List.class, parameters={String.class})
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
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
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
    @Export(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll;
    }
    /**
     * Whether to use EBS-optimized instances.
     * 
     */
    @Export(name="useEbsOptimizedInstances", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> useEbsOptimizedInstances;

    /**
     * @return Whether to use EBS-optimized instances.
     * 
     */
    public Output</* @Nullable */ Boolean> getUseEbsOptimizedInstances() {
        return this.useEbsOptimizedInstances;
    }

    public interface BuilderApplicator {
        public void apply(MemcachedLayerArgs.Builder a);
    }
    private static io.pulumi.aws.opsworks.MemcachedLayerArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.opsworks.MemcachedLayerArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public MemcachedLayer(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public MemcachedLayer(String name) {
        this(name, MemcachedLayerArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public MemcachedLayer(String name, MemcachedLayerArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public MemcachedLayer(String name, MemcachedLayerArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:opsworks/memcachedLayer:MemcachedLayer", name, args == null ? MemcachedLayerArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private MemcachedLayer(String name, Output<String> id, @Nullable MemcachedLayerState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:opsworks/memcachedLayer:MemcachedLayer", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
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
    public static MemcachedLayer get(String name, Output<String> id, @Nullable MemcachedLayerState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new MemcachedLayer(name, id, state, options);
    }
}
