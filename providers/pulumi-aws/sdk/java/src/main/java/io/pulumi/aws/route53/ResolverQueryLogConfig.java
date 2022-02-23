// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.route53;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.route53.ResolverQueryLogConfigArgs;
import io.pulumi.aws.route53.inputs.ResolverQueryLogConfigState;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides a Route 53 Resolver query logging configuration resource.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 *  Route 53 Resolver query logging configurations can be imported using the Route 53 Resolver query logging configuration ID, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:route53/resolverQueryLogConfig:ResolverQueryLogConfig example rqlc-92edc3b1838248bf
 * ```
 * 
 */
@ResourceType(type="aws:route53/resolverQueryLogConfig:ResolverQueryLogConfig")
public class ResolverQueryLogConfig extends io.pulumi.resources.CustomResource {
    /**
     * The ARN (Amazon Resource Name) of the Route 53 Resolver query logging configuration.
     * 
     */
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The ARN (Amazon Resource Name) of the Route 53 Resolver query logging configuration.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * The ARN of the resource that you want Route 53 Resolver to send query logs.
     * You can send query logs to an S3 bucket, a CloudWatch Logs log group, or a Kinesis Data Firehose delivery stream.
     * 
     */
    @OutputExport(name="destinationArn", type=String.class, parameters={})
    private Output<String> destinationArn;

    /**
     * @return The ARN of the resource that you want Route 53 Resolver to send query logs.
     * You can send query logs to an S3 bucket, a CloudWatch Logs log group, or a Kinesis Data Firehose delivery stream.
     * 
     */
    public Output<String> getDestinationArn() {
        return this.destinationArn;
    }
    /**
     * The name of the Route 53 Resolver query logging configuration.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the Route 53 Resolver query logging configuration.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The AWS account ID of the account that created the query logging configuration.
     * 
     */
    @OutputExport(name="ownerId", type=String.class, parameters={})
    private Output<String> ownerId;

    /**
     * @return The AWS account ID of the account that created the query logging configuration.
     * 
     */
    public Output<String> getOwnerId() {
        return this.ownerId;
    }
    /**
     * An indication of whether the query logging configuration is shared with other AWS accounts, or was shared with the current account by another AWS account.
     * Sharing is configured through AWS Resource Access Manager (AWS RAM).
     * Values are `NOT_SHARED`, `SHARED_BY_ME` or `SHARED_WITH_ME`
     * 
     */
    @OutputExport(name="shareStatus", type=String.class, parameters={})
    private Output<String> shareStatus;

    /**
     * @return An indication of whether the query logging configuration is shared with other AWS accounts, or was shared with the current account by another AWS account.
     * Sharing is configured through AWS Resource Access Manager (AWS RAM).
     * Values are `NOT_SHARED`, `SHARED_BY_ME` or `SHARED_WITH_ME`
     * 
     */
    public Output<String> getShareStatus() {
        return this.shareStatus;
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
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ResolverQueryLogConfig(String name, ResolverQueryLogConfigArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:route53/resolverQueryLogConfig:ResolverQueryLogConfig", name, args == null ? ResolverQueryLogConfigArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private ResolverQueryLogConfig(String name, Input<String> id, @Nullable ResolverQueryLogConfigState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:route53/resolverQueryLogConfig:ResolverQueryLogConfig", name, state, makeResourceOptions(options, id));
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
    public static ResolverQueryLogConfig get(String name, Input<String> id, @Nullable ResolverQueryLogConfigState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ResolverQueryLogConfig(name, id, state, options);
    }
}
