// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.imagebuilder;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.imagebuilder.InfrastructureConfigurationArgs;
import io.pulumi.aws.imagebuilder.inputs.InfrastructureConfigurationState;
import io.pulumi.aws.imagebuilder.outputs.InfrastructureConfigurationLogging;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Manages an Image Builder Infrastructure Configuration.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * `aws_imagebuilder_infrastructure_configuration` can be imported using the Amazon Resource Name (ARN), e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:imagebuilder/infrastructureConfiguration:InfrastructureConfiguration example arn:aws:imagebuilder:us-east-1:123456789012:infrastructure-configuration/example
 * ```
 * 
 */
@ResourceType(type="aws:imagebuilder/infrastructureConfiguration:InfrastructureConfiguration")
public class InfrastructureConfiguration extends io.pulumi.resources.CustomResource {
    /**
     * Amazon Resource Name (ARN) of the configuration.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return Amazon Resource Name (ARN) of the configuration.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * Date when the configuration was created.
     * 
     */
    @Export(name="dateCreated", type=String.class, parameters={})
    private Output<String> dateCreated;

    /**
     * @return Date when the configuration was created.
     * 
     */
    public Output<String> getDateCreated() {
        return this.dateCreated;
    }
    /**
     * Date when the configuration was updated.
     * 
     */
    @Export(name="dateUpdated", type=String.class, parameters={})
    private Output<String> dateUpdated;

    /**
     * @return Date when the configuration was updated.
     * 
     */
    public Output<String> getDateUpdated() {
        return this.dateUpdated;
    }
    /**
     * Description for the configuration.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return Description for the configuration.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * Name of IAM Instance Profile.
     * 
     */
    @Export(name="instanceProfileName", type=String.class, parameters={})
    private Output<String> instanceProfileName;

    /**
     * @return Name of IAM Instance Profile.
     * 
     */
    public Output<String> getInstanceProfileName() {
        return this.instanceProfileName;
    }
    /**
     * Set of EC2 Instance Types.
     * 
     */
    @Export(name="instanceTypes", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> instanceTypes;

    /**
     * @return Set of EC2 Instance Types.
     * 
     */
    public Output</* @Nullable */ List<String>> getInstanceTypes() {
        return this.instanceTypes;
    }
    /**
     * Name of EC2 Key Pair.
     * 
     */
    @Export(name="keyPair", type=String.class, parameters={})
    private Output</* @Nullable */ String> keyPair;

    /**
     * @return Name of EC2 Key Pair.
     * 
     */
    public Output</* @Nullable */ String> getKeyPair() {
        return this.keyPair;
    }
    /**
     * Configuration block with logging settings. Detailed below.
     * 
     */
    @Export(name="logging", type=InfrastructureConfigurationLogging.class, parameters={})
    private Output</* @Nullable */ InfrastructureConfigurationLogging> logging;

    /**
     * @return Configuration block with logging settings. Detailed below.
     * 
     */
    public Output</* @Nullable */ InfrastructureConfigurationLogging> getLogging() {
        return this.logging;
    }
    /**
     * Name for the configuration.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name for the configuration.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Key-value map of resource tags to assign to infrastructure created by the configuration.
     * 
     */
    @Export(name="resourceTags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> resourceTags;

    /**
     * @return Key-value map of resource tags to assign to infrastructure created by the configuration.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getResourceTags() {
        return this.resourceTags;
    }
    /**
     * Set of EC2 Security Group identifiers.
     * 
     */
    @Export(name="securityGroupIds", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> securityGroupIds;

    /**
     * @return Set of EC2 Security Group identifiers.
     * 
     */
    public Output</* @Nullable */ List<String>> getSecurityGroupIds() {
        return this.securityGroupIds;
    }
    /**
     * Amazon Resource Name (ARN) of SNS Topic.
     * 
     */
    @Export(name="snsTopicArn", type=String.class, parameters={})
    private Output</* @Nullable */ String> snsTopicArn;

    /**
     * @return Amazon Resource Name (ARN) of SNS Topic.
     * 
     */
    public Output</* @Nullable */ String> getSnsTopicArn() {
        return this.snsTopicArn;
    }
    /**
     * EC2 Subnet identifier. Also requires `security_group_ids` argument.
     * 
     */
    @Export(name="subnetId", type=String.class, parameters={})
    private Output</* @Nullable */ String> subnetId;

    /**
     * @return EC2 Subnet identifier. Also requires `security_group_ids` argument.
     * 
     */
    public Output</* @Nullable */ String> getSubnetId() {
        return this.subnetId;
    }
    /**
     * Key-value map of resource tags to assign to the configuration. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Key-value map of resource tags to assign to the configuration. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
     * Enable if the instance should be terminated when the pipeline fails. Defaults to `false`.
     * 
     */
    @Export(name="terminateInstanceOnFailure", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> terminateInstanceOnFailure;

    /**
     * @return Enable if the instance should be terminated when the pipeline fails. Defaults to `false`.
     * 
     */
    public Output</* @Nullable */ Boolean> getTerminateInstanceOnFailure() {
        return this.terminateInstanceOnFailure;
    }

    public interface BuilderApplicator {
        public void apply(InfrastructureConfigurationArgs.Builder a);
    }
    private static io.pulumi.aws.imagebuilder.InfrastructureConfigurationArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.imagebuilder.InfrastructureConfigurationArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public InfrastructureConfiguration(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public InfrastructureConfiguration(String name) {
        this(name, InfrastructureConfigurationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public InfrastructureConfiguration(String name, InfrastructureConfigurationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public InfrastructureConfiguration(String name, InfrastructureConfigurationArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:imagebuilder/infrastructureConfiguration:InfrastructureConfiguration", name, args == null ? InfrastructureConfigurationArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private InfrastructureConfiguration(String name, Output<String> id, @Nullable InfrastructureConfigurationState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:imagebuilder/infrastructureConfiguration:InfrastructureConfiguration", name, state, makeResourceOptions(options, id));
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
    public static InfrastructureConfiguration get(String name, Output<String> id, @Nullable InfrastructureConfigurationState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new InfrastructureConfiguration(name, id, state, options);
    }
}
