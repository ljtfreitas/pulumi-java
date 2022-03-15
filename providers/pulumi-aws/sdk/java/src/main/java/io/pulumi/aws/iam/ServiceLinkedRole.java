// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.iam;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.iam.ServiceLinkedRoleArgs;
import io.pulumi.aws.iam.inputs.ServiceLinkedRoleState;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides an [IAM service-linked role](https://docs.aws.amazon.com/IAM/latest/UserGuide/using-service-linked-roles.html).
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * IAM service-linked roles can be imported using role ARN, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:iam/serviceLinkedRole:ServiceLinkedRole elasticbeanstalk arn:aws:iam::123456789012:role/aws-service-role/elasticbeanstalk.amazonaws.com/AWSServiceRoleForElasticBeanstalk
 * ```
 * 
 */
@ResourceType(type="aws:iam/serviceLinkedRole:ServiceLinkedRole")
public class ServiceLinkedRole extends io.pulumi.resources.CustomResource {
    /**
     * The Amazon Resource Name (ARN) specifying the role.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) specifying the role.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * The AWS service to which this role is attached. You use a string similar to a URL but without the `http://` in front. For example: `elasticbeanstalk.amazonaws.com`. To find the full list of services that support service-linked roles, check [the docs](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_aws-services-that-work-with-iam.html).
     * 
     */
    @Export(name="awsServiceName", type=String.class, parameters={})
    private Output<String> awsServiceName;

    /**
     * @return The AWS service to which this role is attached. You use a string similar to a URL but without the `http://` in front. For example: `elasticbeanstalk.amazonaws.com`. To find the full list of services that support service-linked roles, check [the docs](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_aws-services-that-work-with-iam.html).
     * 
     */
    public Output<String> getAwsServiceName() {
        return this.awsServiceName;
    }
    /**
     * The creation date of the IAM role.
     * 
     */
    @Export(name="createDate", type=String.class, parameters={})
    private Output<String> createDate;

    /**
     * @return The creation date of the IAM role.
     * 
     */
    public Output<String> getCreateDate() {
        return this.createDate;
    }
    /**
     * Additional string appended to the role name. Not all AWS services support custom suffixes.
     * 
     */
    @Export(name="customSuffix", type=String.class, parameters={})
    private Output</* @Nullable */ String> customSuffix;

    /**
     * @return Additional string appended to the role name. Not all AWS services support custom suffixes.
     * 
     */
    public Output</* @Nullable */ String> getCustomSuffix() {
        return this.customSuffix;
    }
    /**
     * The description of the role.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of the role.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * The name of the role.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the role.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The path of the role.
     * 
     */
    @Export(name="path", type=String.class, parameters={})
    private Output<String> path;

    /**
     * @return The path of the role.
     * 
     */
    public Output<String> getPath() {
        return this.path;
    }
    /**
     * Key-value mapping of tags for the IAM role. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Key-value mapping of tags for the IAM role. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
    /**
     * The stable and unique string identifying the role.
     * 
     */
    @Export(name="uniqueId", type=String.class, parameters={})
    private Output<String> uniqueId;

    /**
     * @return The stable and unique string identifying the role.
     * 
     */
    public Output<String> getUniqueId() {
        return this.uniqueId;
    }

    public interface BuilderApplicator {
        public void apply(ServiceLinkedRoleArgs.Builder a);
    }
    private static io.pulumi.aws.iam.ServiceLinkedRoleArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.iam.ServiceLinkedRoleArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public ServiceLinkedRole(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ServiceLinkedRole(String name) {
        this(name, ServiceLinkedRoleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ServiceLinkedRole(String name, ServiceLinkedRoleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ServiceLinkedRole(String name, ServiceLinkedRoleArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:iam/serviceLinkedRole:ServiceLinkedRole", name, args == null ? ServiceLinkedRoleArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private ServiceLinkedRole(String name, Output<String> id, @Nullable ServiceLinkedRoleState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:iam/serviceLinkedRole:ServiceLinkedRole", name, state, makeResourceOptions(options, id));
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
    public static ServiceLinkedRole get(String name, Output<String> id, @Nullable ServiceLinkedRoleState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ServiceLinkedRole(name, id, state, options);
    }
}
