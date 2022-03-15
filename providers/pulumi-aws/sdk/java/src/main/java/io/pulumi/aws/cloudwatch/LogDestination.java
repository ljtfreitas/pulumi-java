// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudwatch;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.cloudwatch.LogDestinationArgs;
import io.pulumi.aws.cloudwatch.inputs.LogDestinationState;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a CloudWatch Logs destination resource.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * CloudWatch Logs destinations can be imported using the `name`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:cloudwatch/logDestination:LogDestination test_destination test_destination
 * ```
 * 
 */
@ResourceType(type="aws:cloudwatch/logDestination:LogDestination")
public class LogDestination extends io.pulumi.resources.CustomResource {
    /**
     * The Amazon Resource Name (ARN) specifying the log destination.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) specifying the log destination.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * A name for the log destination
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return A name for the log destination
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The ARN of an IAM role that grants Amazon CloudWatch Logs permissions to put data into the target
     * 
     */
    @Export(name="roleArn", type=String.class, parameters={})
    private Output<String> roleArn;

    /**
     * @return The ARN of an IAM role that grants Amazon CloudWatch Logs permissions to put data into the target
     * 
     */
    public Output<String> getRoleArn() {
        return this.roleArn;
    }
    /**
     * The ARN of the target Amazon Kinesis stream resource for the destination
     * 
     */
    @Export(name="targetArn", type=String.class, parameters={})
    private Output<String> targetArn;

    /**
     * @return The ARN of the target Amazon Kinesis stream resource for the destination
     * 
     */
    public Output<String> getTargetArn() {
        return this.targetArn;
    }

    public interface BuilderApplicator {
        public void apply(LogDestinationArgs.Builder a);
    }
    private static io.pulumi.aws.cloudwatch.LogDestinationArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.cloudwatch.LogDestinationArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public LogDestination(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public LogDestination(String name) {
        this(name, LogDestinationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public LogDestination(String name, LogDestinationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public LogDestination(String name, LogDestinationArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:cloudwatch/logDestination:LogDestination", name, args == null ? LogDestinationArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private LogDestination(String name, Output<String> id, @Nullable LogDestinationState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:cloudwatch/logDestination:LogDestination", name, state, makeResourceOptions(options, id));
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
    public static LogDestination get(String name, Output<String> id, @Nullable LogDestinationState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new LogDestination(name, id, state, options);
    }
}
