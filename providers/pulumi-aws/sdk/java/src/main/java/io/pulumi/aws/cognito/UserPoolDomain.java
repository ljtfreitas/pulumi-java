// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cognito;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.cognito.UserPoolDomainArgs;
import io.pulumi.aws.cognito.inputs.UserPoolDomainState;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a Cognito User Pool Domain resource.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Cognito User Pool Domains can be imported using the `domain`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:cognito/userPoolDomain:UserPoolDomain main <domain>
 * ```
 * 
 */
@ResourceType(type="aws:cognito/userPoolDomain:UserPoolDomain")
public class UserPoolDomain extends io.pulumi.resources.CustomResource {
    /**
     * The AWS account ID for the user pool owner.
     * 
     */
    @Export(name="awsAccountId", type=String.class, parameters={})
    private Output<String> awsAccountId;

    /**
     * @return The AWS account ID for the user pool owner.
     * 
     */
    public Output<String> getAwsAccountId() {
        return this.awsAccountId;
    }
    /**
     * The ARN of an ISSUED ACM certificate in us-east-1 for a custom domain.
     * 
     */
    @Export(name="certificateArn", type=String.class, parameters={})
    private Output</* @Nullable */ String> certificateArn;

    /**
     * @return The ARN of an ISSUED ACM certificate in us-east-1 for a custom domain.
     * 
     */
    public Output</* @Nullable */ String> getCertificateArn() {
        return this.certificateArn;
    }
    /**
     * The URL of the CloudFront distribution. This is required to generate the ALIAS `aws.route53.Record`
     * 
     */
    @Export(name="cloudfrontDistributionArn", type=String.class, parameters={})
    private Output<String> cloudfrontDistributionArn;

    /**
     * @return The URL of the CloudFront distribution. This is required to generate the ALIAS `aws.route53.Record`
     * 
     */
    public Output<String> getCloudfrontDistributionArn() {
        return this.cloudfrontDistributionArn;
    }
    /**
     * The domain string.
     * 
     */
    @Export(name="domain", type=String.class, parameters={})
    private Output<String> domain;

    /**
     * @return The domain string.
     * 
     */
    public Output<String> getDomain() {
        return this.domain;
    }
    /**
     * The S3 bucket where the static files for this domain are stored.
     * 
     */
    @Export(name="s3Bucket", type=String.class, parameters={})
    private Output<String> s3Bucket;

    /**
     * @return The S3 bucket where the static files for this domain are stored.
     * 
     */
    public Output<String> getS3Bucket() {
        return this.s3Bucket;
    }
    /**
     * The user pool ID.
     * 
     */
    @Export(name="userPoolId", type=String.class, parameters={})
    private Output<String> userPoolId;

    /**
     * @return The user pool ID.
     * 
     */
    public Output<String> getUserPoolId() {
        return this.userPoolId;
    }
    /**
     * The app version.
     * 
     */
    @Export(name="version", type=String.class, parameters={})
    private Output<String> version;

    /**
     * @return The app version.
     * 
     */
    public Output<String> getVersion() {
        return this.version;
    }

    public interface BuilderApplicator {
        public void apply(UserPoolDomainArgs.Builder a);
    }
    private static io.pulumi.aws.cognito.UserPoolDomainArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.cognito.UserPoolDomainArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public UserPoolDomain(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public UserPoolDomain(String name) {
        this(name, UserPoolDomainArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public UserPoolDomain(String name, UserPoolDomainArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public UserPoolDomain(String name, UserPoolDomainArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:cognito/userPoolDomain:UserPoolDomain", name, args == null ? UserPoolDomainArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private UserPoolDomain(String name, Output<String> id, @Nullable UserPoolDomainState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:cognito/userPoolDomain:UserPoolDomain", name, state, makeResourceOptions(options, id));
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
    public static UserPoolDomain get(String name, Output<String> id, @Nullable UserPoolDomainState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new UserPoolDomain(name, id, state, options);
    }
}
