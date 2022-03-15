// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.s3;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.s3.AccessPointArgs;
import io.pulumi.aws.s3.inputs.AccessPointState;
import io.pulumi.aws.s3.outputs.AccessPointPublicAccessBlockConfiguration;
import io.pulumi.aws.s3.outputs.AccessPointVpcConfiguration;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides a resource to manage an S3 Access Point.
 * 
 * > **NOTE on Access Points and Access Point Policies:** This provider provides both a standalone Access Point Policy resource and an Access Point resource with a resource policy defined in-line. You cannot use an Access Point with in-line resource policy in conjunction with an Access Point Policy resource. Doing so will cause a conflict of policies and will overwrite the access point's resource policy.
 * 
 * > Advanced usage: To use a custom API endpoint for this resource, use the `s3control` endpoint provider configuration), not the `s3` endpoint provider configuration.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * For Access Points associated with an AWS Partition S3 Bucket, this resource can be imported using the `account_id` and `name` separated by a colon (`:`), e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:s3/accessPoint:AccessPoint example 123456789012:example
 * ```
 * 
 *  For Access Points associated with an S3 on Outposts Bucket, this resource can be imported using the Amazon Resource Name (ARN), e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:s3/accessPoint:AccessPoint example arn:aws:s3-outposts:us-east-1:123456789012:outpost/op-1234567890123456/accesspoint/example
 * ```
 * 
 */
@ResourceType(type="aws:s3/accessPoint:AccessPoint")
public class AccessPoint extends io.pulumi.resources.CustomResource {
    /**
     * AWS account ID for the owner of the bucket for which you want to create an access point. Defaults to automatically determined account ID of the AWS provider.
     * 
     */
    @Export(name="accountId", type=String.class, parameters={})
    private Output<String> accountId;

    /**
     * @return AWS account ID for the owner of the bucket for which you want to create an access point. Defaults to automatically determined account ID of the AWS provider.
     * 
     */
    public Output<String> getAccountId() {
        return this.accountId;
    }
    /**
     * The alias of the S3 Access Point.
     * 
     */
    @Export(name="alias", type=String.class, parameters={})
    private Output<String> alias;

    /**
     * @return The alias of the S3 Access Point.
     * 
     */
    public Output<String> getAlias() {
        return this.alias;
    }
    /**
     * Amazon Resource Name (ARN) of the S3 Access Point.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return Amazon Resource Name (ARN) of the S3 Access Point.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * Name of an AWS Partition S3 Bucket or the Amazon Resource Name (ARN) of S3 on Outposts Bucket that you want to associate this access point with.
     * 
     */
    @Export(name="bucket", type=String.class, parameters={})
    private Output<String> bucket;

    /**
     * @return Name of an AWS Partition S3 Bucket or the Amazon Resource Name (ARN) of S3 on Outposts Bucket that you want to associate this access point with.
     * 
     */
    public Output<String> getBucket() {
        return this.bucket;
    }
    /**
     * The DNS domain name of the S3 Access Point in the format _`name`_-_`account_id`_.s3-accesspoint._region_.amazonaws.com.
     * Note: S3 access points only support secure access by HTTPS. HTTP isn't supported.
     * 
     */
    @Export(name="domainName", type=String.class, parameters={})
    private Output<String> domainName;

    /**
     * @return The DNS domain name of the S3 Access Point in the format _`name`_-_`account_id`_.s3-accesspoint._region_.amazonaws.com.
     * Note: S3 access points only support secure access by HTTPS. HTTP isn't supported.
     * 
     */
    public Output<String> getDomainName() {
        return this.domainName;
    }
    /**
     * The VPC endpoints for the S3 Access Point.
     * 
     */
    @Export(name="endpoints", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> endpoints;

    /**
     * @return The VPC endpoints for the S3 Access Point.
     * 
     */
    public Output<Map<String,String>> getEndpoints() {
        return this.endpoints;
    }
    /**
     * Indicates whether this access point currently has a policy that allows public access.
     * 
     */
    @Export(name="hasPublicAccessPolicy", type=Boolean.class, parameters={})
    private Output<Boolean> hasPublicAccessPolicy;

    /**
     * @return Indicates whether this access point currently has a policy that allows public access.
     * 
     */
    public Output<Boolean> getHasPublicAccessPolicy() {
        return this.hasPublicAccessPolicy;
    }
    /**
     * Name you want to assign to this access point.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name you want to assign to this access point.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Indicates whether this access point allows access from the public Internet. Values are `VPC` (the access point doesn't allow access from the public Internet) and `Internet` (the access point allows access from the public Internet, subject to the access point and bucket access policies).
     * 
     */
    @Export(name="networkOrigin", type=String.class, parameters={})
    private Output<String> networkOrigin;

    /**
     * @return Indicates whether this access point allows access from the public Internet. Values are `VPC` (the access point doesn't allow access from the public Internet) and `Internet` (the access point allows access from the public Internet, subject to the access point and bucket access policies).
     * 
     */
    public Output<String> getNetworkOrigin() {
        return this.networkOrigin;
    }
    /**
     * Valid JSON document that specifies the policy that you want to apply to this access point. Removing `policy` from your configuration or setting `policy` to null or an empty string (i.e., `policy = ""`) _will not_ delete the policy since it could have been set by `aws.s3control.AccessPointPolicy`. To remove the `policy`, set it to `"{}"` (an empty JSON document).
     * 
     */
    @Export(name="policy", type=String.class, parameters={})
    private Output<String> policy;

    /**
     * @return Valid JSON document that specifies the policy that you want to apply to this access point. Removing `policy` from your configuration or setting `policy` to null or an empty string (i.e., `policy = ""`) _will not_ delete the policy since it could have been set by `aws.s3control.AccessPointPolicy`. To remove the `policy`, set it to `"{}"` (an empty JSON document).
     * 
     */
    public Output<String> getPolicy() {
        return this.policy;
    }
    /**
     * Configuration block to manage the `PublicAccessBlock` configuration that you want to apply to this Amazon S3 bucket. You can enable the configuration options in any combination. Detailed below.
     * 
     */
    @Export(name="publicAccessBlockConfiguration", type=AccessPointPublicAccessBlockConfiguration.class, parameters={})
    private Output</* @Nullable */ AccessPointPublicAccessBlockConfiguration> publicAccessBlockConfiguration;

    /**
     * @return Configuration block to manage the `PublicAccessBlock` configuration that you want to apply to this Amazon S3 bucket. You can enable the configuration options in any combination. Detailed below.
     * 
     */
    public Output</* @Nullable */ AccessPointPublicAccessBlockConfiguration> getPublicAccessBlockConfiguration() {
        return this.publicAccessBlockConfiguration;
    }
    /**
     * Configuration block to restrict access to this access point to requests from the specified Virtual Private Cloud (VPC). Required for S3 on Outposts. Detailed below.
     * 
     */
    @Export(name="vpcConfiguration", type=AccessPointVpcConfiguration.class, parameters={})
    private Output</* @Nullable */ AccessPointVpcConfiguration> vpcConfiguration;

    /**
     * @return Configuration block to restrict access to this access point to requests from the specified Virtual Private Cloud (VPC). Required for S3 on Outposts. Detailed below.
     * 
     */
    public Output</* @Nullable */ AccessPointVpcConfiguration> getVpcConfiguration() {
        return this.vpcConfiguration;
    }

    public interface BuilderApplicator {
        public void apply(AccessPointArgs.Builder a);
    }
    private static io.pulumi.aws.s3.AccessPointArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.s3.AccessPointArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public AccessPoint(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AccessPoint(String name) {
        this(name, AccessPointArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AccessPoint(String name, AccessPointArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AccessPoint(String name, AccessPointArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:s3/accessPoint:AccessPoint", name, args == null ? AccessPointArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private AccessPoint(String name, Output<String> id, @Nullable AccessPointState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:s3/accessPoint:AccessPoint", name, state, makeResourceOptions(options, id));
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
    public static AccessPoint get(String name, Output<String> id, @Nullable AccessPointState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new AccessPoint(name, id, state, options);
    }
}
