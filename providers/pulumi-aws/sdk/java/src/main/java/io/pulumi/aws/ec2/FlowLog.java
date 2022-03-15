// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.ec2.FlowLogArgs;
import io.pulumi.aws.ec2.inputs.FlowLogState;
import io.pulumi.aws.ec2.outputs.FlowLogDestinationOptions;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides a VPC/Subnet/ENI Flow Log to capture IP traffic for a specific network
 * interface, subnet, or VPC. Logs are sent to a CloudWatch Log Group or a S3 Bucket.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Flow Logs can be imported using the `id`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:ec2/flowLog:FlowLog test_flow_log fl-1a2b3c4d
 * ```
 * 
 */
@ResourceType(type="aws:ec2/flowLog:FlowLog")
public class FlowLog extends io.pulumi.resources.CustomResource {
    /**
     * The ARN of the Flow Log.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The ARN of the Flow Log.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * Describes the destination options for a flow log. More details below.
     * 
     */
    @Export(name="destinationOptions", type=FlowLogDestinationOptions.class, parameters={})
    private Output</* @Nullable */ FlowLogDestinationOptions> destinationOptions;

    /**
     * @return Describes the destination options for a flow log. More details below.
     * 
     */
    public Output</* @Nullable */ FlowLogDestinationOptions> getDestinationOptions() {
        return this.destinationOptions;
    }
    /**
     * Elastic Network Interface ID to attach to
     * 
     */
    @Export(name="eniId", type=String.class, parameters={})
    private Output</* @Nullable */ String> eniId;

    /**
     * @return Elastic Network Interface ID to attach to
     * 
     */
    public Output</* @Nullable */ String> getEniId() {
        return this.eniId;
    }
    /**
     * The ARN for the IAM role that's used to post flow logs to a CloudWatch Logs log group
     * 
     */
    @Export(name="iamRoleArn", type=String.class, parameters={})
    private Output</* @Nullable */ String> iamRoleArn;

    /**
     * @return The ARN for the IAM role that's used to post flow logs to a CloudWatch Logs log group
     * 
     */
    public Output</* @Nullable */ String> getIamRoleArn() {
        return this.iamRoleArn;
    }
    /**
     * The ARN of the logging destination.
     * 
     */
    @Export(name="logDestination", type=String.class, parameters={})
    private Output<String> logDestination;

    /**
     * @return The ARN of the logging destination.
     * 
     */
    public Output<String> getLogDestination() {
        return this.logDestination;
    }
    /**
     * The type of the logging destination. Valid values: `cloud-watch-logs`, `s3`. Default: `cloud-watch-logs`.
     * 
     */
    @Export(name="logDestinationType", type=String.class, parameters={})
    private Output</* @Nullable */ String> logDestinationType;

    /**
     * @return The type of the logging destination. Valid values: `cloud-watch-logs`, `s3`. Default: `cloud-watch-logs`.
     * 
     */
    public Output</* @Nullable */ String> getLogDestinationType() {
        return this.logDestinationType;
    }
    /**
     * The fields to include in the flow log record, in the order in which they should appear.
     * 
     */
    @Export(name="logFormat", type=String.class, parameters={})
    private Output<String> logFormat;

    /**
     * @return The fields to include in the flow log record, in the order in which they should appear.
     * 
     */
    public Output<String> getLogFormat() {
        return this.logFormat;
    }
    /**
     * *Deprecated:* Use `log_destination` instead. The name of the CloudWatch log group.
     * 
     * @Deprecated
     * use 'log_destination' argument instead
     * 
     */
    @Deprecated /* use 'log_destination' argument instead */
    @Export(name="logGroupName", type=String.class, parameters={})
    private Output<String> logGroupName;

    /**
     * @return *Deprecated:* Use `log_destination` instead. The name of the CloudWatch log group.
     * 
     */
    public Output<String> getLogGroupName() {
        return this.logGroupName;
    }
    /**
     * The maximum interval of time
     * during which a flow of packets is captured and aggregated into a flow
     * log record. Valid Values: `60` seconds (1 minute) or `600` seconds (10
     * minutes). Default: `600`.
     * 
     */
    @Export(name="maxAggregationInterval", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> maxAggregationInterval;

    /**
     * @return The maximum interval of time
     * during which a flow of packets is captured and aggregated into a flow
     * log record. Valid Values: `60` seconds (1 minute) or `600` seconds (10
     * minutes). Default: `600`.
     * 
     */
    public Output</* @Nullable */ Integer> getMaxAggregationInterval() {
        return this.maxAggregationInterval;
    }
    /**
     * Subnet ID to attach to
     * 
     */
    @Export(name="subnetId", type=String.class, parameters={})
    private Output</* @Nullable */ String> subnetId;

    /**
     * @return Subnet ID to attach to
     * 
     */
    public Output</* @Nullable */ String> getSubnetId() {
        return this.subnetId;
    }
    /**
     * Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
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
     * The type of traffic to capture. Valid values: `ACCEPT`,`REJECT`, `ALL`.
     * 
     */
    @Export(name="trafficType", type=String.class, parameters={})
    private Output<String> trafficType;

    /**
     * @return The type of traffic to capture. Valid values: `ACCEPT`,`REJECT`, `ALL`.
     * 
     */
    public Output<String> getTrafficType() {
        return this.trafficType;
    }
    /**
     * VPC ID to attach to
     * 
     */
    @Export(name="vpcId", type=String.class, parameters={})
    private Output</* @Nullable */ String> vpcId;

    /**
     * @return VPC ID to attach to
     * 
     */
    public Output</* @Nullable */ String> getVpcId() {
        return this.vpcId;
    }

    public interface BuilderApplicator {
        public void apply(FlowLogArgs.Builder a);
    }
    private static io.pulumi.aws.ec2.FlowLogArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.ec2.FlowLogArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public FlowLog(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public FlowLog(String name) {
        this(name, FlowLogArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public FlowLog(String name, FlowLogArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public FlowLog(String name, FlowLogArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2/flowLog:FlowLog", name, args == null ? FlowLogArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private FlowLog(String name, Output<String> id, @Nullable FlowLogState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2/flowLog:FlowLog", name, state, makeResourceOptions(options, id));
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
    public static FlowLog get(String name, Output<String> id, @Nullable FlowLogState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new FlowLog(name, id, state, options);
    }
}
