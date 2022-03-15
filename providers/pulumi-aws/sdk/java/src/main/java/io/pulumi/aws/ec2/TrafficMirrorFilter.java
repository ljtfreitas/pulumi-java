// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.ec2.TrafficMirrorFilterArgs;
import io.pulumi.aws.ec2.inputs.TrafficMirrorFilterState;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides an Traffic mirror filter.\
 * Read [limits and considerations](https://docs.aws.amazon.com/vpc/latest/mirroring/traffic-mirroring-considerations.html) for traffic mirroring
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Traffic mirror filter can be imported using the `id`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:ec2/trafficMirrorFilter:TrafficMirrorFilter foo tmf-0fbb93ddf38198f64
 * ```
 * 
 */
@ResourceType(type="aws:ec2/trafficMirrorFilter:TrafficMirrorFilter")
public class TrafficMirrorFilter extends io.pulumi.resources.CustomResource {
    /**
     * The ARN of the traffic mirror filter.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The ARN of the traffic mirror filter.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * A description of the filter.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return A description of the filter.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * List of amazon network services that should be mirrored. Valid values: `amazon-dns`.
     * 
     */
    @Export(name="networkServices", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> networkServices;

    /**
     * @return List of amazon network services that should be mirrored. Valid values: `amazon-dns`.
     * 
     */
    public Output</* @Nullable */ List<String>> getNetworkServices() {
        return this.networkServices;
    }
    /**
     * Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @Export(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll;
    }

    public interface BuilderApplicator {
        public void apply(@Nullable TrafficMirrorFilterArgs.Builder a);
    }
    private static io.pulumi.aws.ec2.TrafficMirrorFilterArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.ec2.TrafficMirrorFilterArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public TrafficMirrorFilter(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public TrafficMirrorFilter(String name) {
        this(name, TrafficMirrorFilterArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public TrafficMirrorFilter(String name, @Nullable TrafficMirrorFilterArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public TrafficMirrorFilter(String name, @Nullable TrafficMirrorFilterArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2/trafficMirrorFilter:TrafficMirrorFilter", name, args == null ? TrafficMirrorFilterArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private TrafficMirrorFilter(String name, Output<String> id, @Nullable TrafficMirrorFilterState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2/trafficMirrorFilter:TrafficMirrorFilter", name, state, makeResourceOptions(options, id));
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
    public static TrafficMirrorFilter get(String name, Output<String> id, @Nullable TrafficMirrorFilterState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new TrafficMirrorFilter(name, id, state, options);
    }
}
