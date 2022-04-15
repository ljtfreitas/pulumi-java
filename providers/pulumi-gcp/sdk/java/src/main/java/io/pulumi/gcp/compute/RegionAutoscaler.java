// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.compute.RegionAutoscalerArgs;
import io.pulumi.gcp.compute.inputs.RegionAutoscalerState;
import io.pulumi.gcp.compute.outputs.RegionAutoscalerAutoscalingPolicy;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Represents an Autoscaler resource.
 * 
 * Autoscalers allow you to automatically scale virtual machine instances in
 * managed instance groups according to an autoscaling policy that you
 * define.
 * 
 * To get more information about RegionAutoscaler, see:
 * 
 * * [API documentation](https://cloud.google.com/compute/docs/reference/rest/v1/regionAutoscalers)
 * * How-to Guides
 *     * [Autoscaling Groups of Instances](https://cloud.google.com/compute/docs/autoscaler/)
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * RegionAutoscaler can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:compute/regionAutoscaler:RegionAutoscaler default projects/{{project}}/regions/{{region}}/autoscalers/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:compute/regionAutoscaler:RegionAutoscaler default {{project}}/{{region}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:compute/regionAutoscaler:RegionAutoscaler default {{region}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:compute/regionAutoscaler:RegionAutoscaler default {{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:compute/regionAutoscaler:RegionAutoscaler")
public class RegionAutoscaler extends io.pulumi.resources.CustomResource {
    /**
     * The configuration parameters for the autoscaling algorithm. You can
     * define one or more of the policies for an autoscaler: cpuUtilization,
     * customMetricUtilizations, and loadBalancingUtilization.
     * If none of these are specified, the default will be to autoscale based
     * on cpuUtilization to 0.6 or 60%.
     * Structure is documented below.
     * 
     */
    @Export(name="autoscalingPolicy", type=RegionAutoscalerAutoscalingPolicy.class, parameters={})
    private Output<RegionAutoscalerAutoscalingPolicy> autoscalingPolicy;

    /**
     * @return The configuration parameters for the autoscaling algorithm. You can
     * define one or more of the policies for an autoscaler: cpuUtilization,
     * customMetricUtilizations, and loadBalancingUtilization.
     * If none of these are specified, the default will be to autoscale based
     * on cpuUtilization to 0.6 or 60%.
     * Structure is documented below.
     * 
     */
    public Output<RegionAutoscalerAutoscalingPolicy> autoscalingPolicy() {
        return this.autoscalingPolicy;
    }
    /**
     * Creation timestamp in RFC3339 text format.
     * 
     */
    @Export(name="creationTimestamp", type=String.class, parameters={})
    private Output<String> creationTimestamp;

    /**
     * @return Creation timestamp in RFC3339 text format.
     * 
     */
    public Output<String> creationTimestamp() {
        return this.creationTimestamp;
    }
    /**
     * An optional description of this resource.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return An optional description of this resource.
     * 
     */
    public Output</* @Nullable */ String> description() {
        return this.description;
    }
    /**
     * The identifier for this object. Format specified above.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The identifier for this object. Format specified above.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Export(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    public Output<String> project() {
        return this.project;
    }
    /**
     * URL of the region where the instance group resides.
     * 
     */
    @Export(name="region", type=String.class, parameters={})
    private Output<String> region;

    /**
     * @return URL of the region where the instance group resides.
     * 
     */
    public Output<String> region() {
        return this.region;
    }
    /**
     * The URI of the created resource.
     * 
     */
    @Export(name="selfLink", type=String.class, parameters={})
    private Output<String> selfLink;

    /**
     * @return The URI of the created resource.
     * 
     */
    public Output<String> selfLink() {
        return this.selfLink;
    }
    /**
     * Fraction of backend capacity utilization (set in HTTP(s) load
     * balancing configuration) that autoscaler should maintain. Must
     * be a positive float value. If not defined, the default is 0.8.
     * 
     */
    @Export(name="target", type=String.class, parameters={})
    private Output<String> target;

    /**
     * @return Fraction of backend capacity utilization (set in HTTP(s) load
     * balancing configuration) that autoscaler should maintain. Must
     * be a positive float value. If not defined, the default is 0.8.
     * 
     */
    public Output<String> target() {
        return this.target;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public RegionAutoscaler(String name) {
        this(name, RegionAutoscalerArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public RegionAutoscaler(String name, RegionAutoscalerArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RegionAutoscaler(String name, RegionAutoscalerArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/regionAutoscaler:RegionAutoscaler", name, args == null ? RegionAutoscalerArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private RegionAutoscaler(String name, Output<String> id, @Nullable RegionAutoscalerState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/regionAutoscaler:RegionAutoscaler", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
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
    public static RegionAutoscaler get(String name, Output<String> id, @Nullable RegionAutoscalerState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new RegionAutoscaler(name, id, state, options);
    }
}
