// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.accessanalyzer;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.accessanalyzer.AnalyzerArgs;
import io.pulumi.aws.accessanalyzer.inputs.AnalyzerState;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Manages an Access Analyzer Analyzer. More information can be found in the [Access Analyzer User Guide](https://docs.aws.amazon.com/IAM/latest/UserGuide/what-is-access-analyzer.html).
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Access Analyzer Analyzers can be imported using the `analyzer_name`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:accessanalyzer/analyzer:Analyzer example example
 * ```
 * 
 */
@ResourceType(type="aws:accessanalyzer/analyzer:Analyzer")
public class Analyzer extends io.pulumi.resources.CustomResource {
    /**
     * Name of the Analyzer.
     * 
     */
    @OutputExport(name="analyzerName", type=String.class, parameters={})
    private Output<String> analyzerName;

    /**
     * @return Name of the Analyzer.
     * 
     */
    public Output<String> getAnalyzerName() {
        return this.analyzerName;
    }
    /**
     * The Amazon Resource Name (ARN) of the Analyzer.
     * 
     */
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) of the Analyzer.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
     * Type of Analyzer. Valid values are `ACCOUNT` or `ORGANIZATION`. Defaults to `ACCOUNT`.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output</* @Nullable */ String> type;

    /**
     * @return Type of Analyzer. Valid values are `ACCOUNT` or `ORGANIZATION`. Defaults to `ACCOUNT`.
     * 
     */
    public Output</* @Nullable */ String> getType() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Analyzer(String name, AnalyzerArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:accessanalyzer/analyzer:Analyzer", name, args == null ? AnalyzerArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Analyzer(String name, Input<String> id, @Nullable AnalyzerState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:accessanalyzer/analyzer:Analyzer", name, state, makeResourceOptions(options, id));
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
    public static Analyzer get(String name, Input<String> id, @Nullable AnalyzerState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Analyzer(name, id, state, options);
    }
}