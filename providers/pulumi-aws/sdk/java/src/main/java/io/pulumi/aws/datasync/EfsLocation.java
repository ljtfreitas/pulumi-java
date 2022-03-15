// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.datasync;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.datasync.EfsLocationArgs;
import io.pulumi.aws.datasync.inputs.EfsLocationState;
import io.pulumi.aws.datasync.outputs.EfsLocationEc2Config;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Manages an AWS DataSync EFS Location.
 * 
 * > **NOTE:** The EFS File System must have a mounted EFS Mount Target before creating this resource.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * `aws_datasync_location_efs` can be imported by using the DataSync Task Amazon Resource Name (ARN), e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:datasync/efsLocation:EfsLocation example arn:aws:datasync:us-east-1:123456789012:location/loc-12345678901234567
 * ```
 * 
 */
@ResourceType(type="aws:datasync/efsLocation:EfsLocation")
public class EfsLocation extends io.pulumi.resources.CustomResource {
    /**
     * Amazon Resource Name (ARN) of the DataSync Location.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return Amazon Resource Name (ARN) of the DataSync Location.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * Configuration block containing EC2 configurations for connecting to the EFS File System.
     * 
     */
    @Export(name="ec2Config", type=EfsLocationEc2Config.class, parameters={})
    private Output<EfsLocationEc2Config> ec2Config;

    /**
     * @return Configuration block containing EC2 configurations for connecting to the EFS File System.
     * 
     */
    public Output<EfsLocationEc2Config> getEc2Config() {
        return this.ec2Config;
    }
    /**
     * Amazon Resource Name (ARN) of EFS File System.
     * 
     */
    @Export(name="efsFileSystemArn", type=String.class, parameters={})
    private Output<String> efsFileSystemArn;

    /**
     * @return Amazon Resource Name (ARN) of EFS File System.
     * 
     */
    public Output<String> getEfsFileSystemArn() {
        return this.efsFileSystemArn;
    }
    /**
     * Subdirectory to perform actions as source or destination. Default `/`.
     * 
     */
    @Export(name="subdirectory", type=String.class, parameters={})
    private Output</* @Nullable */ String> subdirectory;

    /**
     * @return Subdirectory to perform actions as source or destination. Default `/`.
     * 
     */
    public Output</* @Nullable */ String> getSubdirectory() {
        return this.subdirectory;
    }
    /**
     * Key-value pairs of resource tags to assign to the DataSync Location. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Key-value pairs of resource tags to assign to the DataSync Location. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
    @Export(name="uri", type=String.class, parameters={})
    private Output<String> uri;

    public Output<String> getUri() {
        return this.uri;
    }

    public interface BuilderApplicator {
        public void apply(EfsLocationArgs.Builder a);
    }
    private static io.pulumi.aws.datasync.EfsLocationArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.datasync.EfsLocationArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public EfsLocation(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public EfsLocation(String name) {
        this(name, EfsLocationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public EfsLocation(String name, EfsLocationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public EfsLocation(String name, EfsLocationArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:datasync/efsLocation:EfsLocation", name, args == null ? EfsLocationArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private EfsLocation(String name, Output<String> id, @Nullable EfsLocationState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:datasync/efsLocation:EfsLocation", name, state, makeResourceOptions(options, id));
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
    public static EfsLocation get(String name, Output<String> id, @Nullable EfsLocationState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new EfsLocation(name, id, state, options);
    }
}
