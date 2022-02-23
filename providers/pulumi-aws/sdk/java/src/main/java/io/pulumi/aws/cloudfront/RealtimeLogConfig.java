// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudfront;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.cloudfront.RealtimeLogConfigArgs;
import io.pulumi.aws.cloudfront.inputs.RealtimeLogConfigState;
import io.pulumi.aws.cloudfront.outputs.RealtimeLogConfigEndpoint;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Provides a CloudFront real-time log configuration resource.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * CloudFront real-time log configurations can be imported using the ARN, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:cloudfront/realtimeLogConfig:RealtimeLogConfig example arn:aws:cloudfront::111122223333:realtime-log-config/ExampleNameForRealtimeLogConfig
 * ```
 * 
 */
@ResourceType(type="aws:cloudfront/realtimeLogConfig:RealtimeLogConfig")
public class RealtimeLogConfig extends io.pulumi.resources.CustomResource {
    /**
     * The ARN (Amazon Resource Name) of the CloudFront real-time log configuration.
     * 
     */
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The ARN (Amazon Resource Name) of the CloudFront real-time log configuration.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * The Amazon Kinesis data streams where real-time log data is sent.
     * 
     */
    @OutputExport(name="endpoint", type=RealtimeLogConfigEndpoint.class, parameters={})
    private Output<RealtimeLogConfigEndpoint> endpoint;

    /**
     * @return The Amazon Kinesis data streams where real-time log data is sent.
     * 
     */
    public Output<RealtimeLogConfigEndpoint> getEndpoint() {
        return this.endpoint;
    }
    /**
     * The fields that are included in each real-time log record. See the [AWS documentation](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/real-time-logs.html#understand-real-time-log-config-fields) for supported values.
     * 
     */
    @OutputExport(name="fields", type=List.class, parameters={String.class})
    private Output<List<String>> fields;

    /**
     * @return The fields that are included in each real-time log record. See the [AWS documentation](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/real-time-logs.html#understand-real-time-log-config-fields) for supported values.
     * 
     */
    public Output<List<String>> getFields() {
        return this.fields;
    }
    /**
     * The unique name to identify this real-time log configuration.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The unique name to identify this real-time log configuration.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The sampling rate for this real-time log configuration. The sampling rate determines the percentage of viewer requests that are represented in the real-time log data. An integer between `1` and `100`, inclusive.
     * 
     */
    @OutputExport(name="samplingRate", type=Integer.class, parameters={})
    private Output<Integer> samplingRate;

    /**
     * @return The sampling rate for this real-time log configuration. The sampling rate determines the percentage of viewer requests that are represented in the real-time log data. An integer between `1` and `100`, inclusive.
     * 
     */
    public Output<Integer> getSamplingRate() {
        return this.samplingRate;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RealtimeLogConfig(String name, RealtimeLogConfigArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:cloudfront/realtimeLogConfig:RealtimeLogConfig", name, args == null ? RealtimeLogConfigArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private RealtimeLogConfig(String name, Input<String> id, @Nullable RealtimeLogConfigState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:cloudfront/realtimeLogConfig:RealtimeLogConfig", name, state, makeResourceOptions(options, id));
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
    public static RealtimeLogConfig get(String name, Input<String> id, @Nullable RealtimeLogConfigState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new RealtimeLogConfig(name, id, state, options);
    }
}
