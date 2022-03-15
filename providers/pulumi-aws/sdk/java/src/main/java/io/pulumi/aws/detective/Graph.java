// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.detective;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.detective.GraphArgs;
import io.pulumi.aws.detective.inputs.GraphState;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides a resource to manage an [AWS Detective Graph](https://docs.aws.amazon.com/detective/latest/APIReference/API_CreateGraph.html). As an AWS account may own only one Detective graph per region, provisioning multiple Detective graphs requires a separate provider configuration for each graph.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * `aws_detective_graph` can be imported using the ARN, e.g.
 * 
 * ```sh
 *  $ pulumi import aws:detective/graph:Graph example arn:aws:detective:us-east-1:123456789101:graph:231684d34gh74g4bae1dbc7bd807d02d
 * ```
 * 
 */
@ResourceType(type="aws:detective/graph:Graph")
public class Graph extends io.pulumi.resources.CustomResource {
    /**
     * Date and time, in UTC and extended RFC 3339 format, when the Amazon Detective Graph was created.
     * 
     */
    @Export(name="createdTime", type=String.class, parameters={})
    private Output<String> createdTime;

    /**
     * @return Date and time, in UTC and extended RFC 3339 format, when the Amazon Detective Graph was created.
     * 
     */
    public Output<String> getCreatedTime() {
        return this.createdTime;
    }
    /**
     * ARN of the Detective Graph.
     * 
     */
    @Export(name="graphArn", type=String.class, parameters={})
    private Output<String> graphArn;

    /**
     * @return ARN of the Detective Graph.
     * 
     */
    public Output<String> getGraphArn() {
        return this.graphArn;
    }
    /**
     * A map of tags to assign to the instance. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the instance. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    @Export(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll;
    }

    public interface BuilderApplicator {
        public void apply(@Nullable GraphArgs.Builder a);
    }
    private static io.pulumi.aws.detective.GraphArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.detective.GraphArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Graph(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Graph(String name) {
        this(name, GraphArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Graph(String name, @Nullable GraphArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Graph(String name, @Nullable GraphArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:detective/graph:Graph", name, args == null ? GraphArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private Graph(String name, Output<String> id, @Nullable GraphState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:detective/graph:Graph", name, state, makeResourceOptions(options, id));
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
    public static Graph get(String name, Output<String> id, @Nullable GraphState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Graph(name, id, state, options);
    }
}
