// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudwatch;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.cloudwatch.LogStreamArgs;
import io.pulumi.aws.cloudwatch.inputs.LogStreamState;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a CloudWatch Log Stream resource.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Cloudwatch Log Stream can be imported using the stream's `log_group_name` and `name`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:cloudwatch/logStream:LogStream foo Yada:SampleLogStream1234
 * ```
 * 
 */
@ResourceType(type="aws:cloudwatch/logStream:LogStream")
public class LogStream extends io.pulumi.resources.CustomResource {
    /**
     * The Amazon Resource Name (ARN) specifying the log stream.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) specifying the log stream.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * The name of the log group under which the log stream is to be created.
     * 
     */
    @Export(name="logGroupName", type=String.class, parameters={})
    private Output<String> logGroupName;

    /**
     * @return The name of the log group under which the log stream is to be created.
     * 
     */
    public Output<String> getLogGroupName() {
        return this.logGroupName;
    }
    /**
     * The name of the log stream. Must not be longer than 512 characters and must not contain `:`
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the log stream. Must not be longer than 512 characters and must not contain `:`
     * 
     */
    public Output<String> getName() {
        return this.name;
    }

    public interface BuilderApplicator {
        public void apply(LogStreamArgs.Builder a);
    }
    private static io.pulumi.aws.cloudwatch.LogStreamArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.cloudwatch.LogStreamArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public LogStream(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public LogStream(String name) {
        this(name, LogStreamArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public LogStream(String name, LogStreamArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public LogStream(String name, LogStreamArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:cloudwatch/logStream:LogStream", name, args == null ? LogStreamArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private LogStream(String name, Output<String> id, @Nullable LogStreamState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:cloudwatch/logStream:LogStream", name, state, makeResourceOptions(options, id));
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
    public static LogStream get(String name, Output<String> id, @Nullable LogStreamState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new LogStream(name, id, state, options);
    }
}
