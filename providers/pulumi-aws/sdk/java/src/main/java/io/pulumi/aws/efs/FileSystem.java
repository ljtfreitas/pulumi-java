// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.efs;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.efs.FileSystemArgs;
import io.pulumi.aws.efs.inputs.FileSystemState;
import io.pulumi.aws.efs.outputs.FileSystemLifecyclePolicy;
import io.pulumi.aws.efs.outputs.FileSystemSizeInByte;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides an Elastic File System (EFS) File System resource.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * The EFS file systems can be imported using the `id`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:efs/fileSystem:FileSystem foo fs-6fa144c6
 * ```
 * 
 */
@ResourceType(type="aws:efs/fileSystem:FileSystem")
public class FileSystem extends io.pulumi.resources.CustomResource {
    /**
     * Amazon Resource Name of the file system.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return Amazon Resource Name of the file system.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * The identifier of the Availability Zone in which the file system's One Zone storage classes exist.
     * 
     */
    @Export(name="availabilityZoneId", type=String.class, parameters={})
    private Output<String> availabilityZoneId;

    /**
     * @return The identifier of the Availability Zone in which the file system's One Zone storage classes exist.
     * 
     */
    public Output<String> getAvailabilityZoneId() {
        return this.availabilityZoneId;
    }
    /**
     * the AWS Availability Zone in which to create the file system. Used to create a file system that uses One Zone storage classes. See [user guide](https://docs.aws.amazon.com/efs/latest/ug/storage-classes.html) for more information.
     * 
     */
    @Export(name="availabilityZoneName", type=String.class, parameters={})
    private Output<String> availabilityZoneName;

    /**
     * @return the AWS Availability Zone in which to create the file system. Used to create a file system that uses One Zone storage classes. See [user guide](https://docs.aws.amazon.com/efs/latest/ug/storage-classes.html) for more information.
     * 
     */
    public Output<String> getAvailabilityZoneName() {
        return this.availabilityZoneName;
    }
    /**
     * A unique name (a maximum of 64 characters are allowed)
     * used as reference when creating the Elastic File System to ensure idempotent file
     * system creation. By default generated by this provider. See [Elastic File System]
     * (http://docs.aws.amazon.com/efs/latest/ug/) user guide for more information.
     * 
     */
    @Export(name="creationToken", type=String.class, parameters={})
    private Output<String> creationToken;

    /**
     * @return A unique name (a maximum of 64 characters are allowed)
     * used as reference when creating the Elastic File System to ensure idempotent file
     * system creation. By default generated by this provider. See [Elastic File System]
     * (http://docs.aws.amazon.com/efs/latest/ug/) user guide for more information.
     * 
     */
    public Output<String> getCreationToken() {
        return this.creationToken;
    }
    /**
     * The DNS name for the filesystem per [documented convention](http://docs.aws.amazon.com/efs/latest/ug/mounting-fs-mount-cmd-dns-name.html).
     * 
     */
    @Export(name="dnsName", type=String.class, parameters={})
    private Output<String> dnsName;

    /**
     * @return The DNS name for the filesystem per [documented convention](http://docs.aws.amazon.com/efs/latest/ug/mounting-fs-mount-cmd-dns-name.html).
     * 
     */
    public Output<String> getDnsName() {
        return this.dnsName;
    }
    /**
     * If true, the disk will be encrypted.
     * 
     */
    @Export(name="encrypted", type=Boolean.class, parameters={})
    private Output<Boolean> encrypted;

    /**
     * @return If true, the disk will be encrypted.
     * 
     */
    public Output<Boolean> getEncrypted() {
        return this.encrypted;
    }
    /**
     * The ARN for the KMS encryption key. When specifying kms_key_id, encrypted needs to be set to true.
     * 
     */
    @Export(name="kmsKeyId", type=String.class, parameters={})
    private Output<String> kmsKeyId;

    /**
     * @return The ARN for the KMS encryption key. When specifying kms_key_id, encrypted needs to be set to true.
     * 
     */
    public Output<String> getKmsKeyId() {
        return this.kmsKeyId;
    }
    /**
     * A file system [lifecycle policy](https://docs.aws.amazon.com/efs/latest/ug/API_LifecyclePolicy.html) object (documented below).
     * 
     */
    @Export(name="lifecyclePolicy", type=FileSystemLifecyclePolicy.class, parameters={})
    private Output</* @Nullable */ FileSystemLifecyclePolicy> lifecyclePolicy;

    /**
     * @return A file system [lifecycle policy](https://docs.aws.amazon.com/efs/latest/ug/API_LifecyclePolicy.html) object (documented below).
     * 
     */
    public Output</* @Nullable */ FileSystemLifecyclePolicy> getLifecyclePolicy() {
        return this.lifecyclePolicy;
    }
    /**
     * The current number of mount targets that the file system has.
     * 
     */
    @Export(name="numberOfMountTargets", type=Integer.class, parameters={})
    private Output<Integer> numberOfMountTargets;

    /**
     * @return The current number of mount targets that the file system has.
     * 
     */
    public Output<Integer> getNumberOfMountTargets() {
        return this.numberOfMountTargets;
    }
    /**
     * The AWS account that created the file system. If the file system was createdby an IAM user, the parent account to which the user belongs is the owner.
     * 
     */
    @Export(name="ownerId", type=String.class, parameters={})
    private Output<String> ownerId;

    /**
     * @return The AWS account that created the file system. If the file system was createdby an IAM user, the parent account to which the user belongs is the owner.
     * 
     */
    public Output<String> getOwnerId() {
        return this.ownerId;
    }
    /**
     * The file system performance mode. Can be either `"generalPurpose"` or `"maxIO"` (Default: `"generalPurpose"`).
     * 
     */
    @Export(name="performanceMode", type=String.class, parameters={})
    private Output<String> performanceMode;

    /**
     * @return The file system performance mode. Can be either `"generalPurpose"` or `"maxIO"` (Default: `"generalPurpose"`).
     * 
     */
    public Output<String> getPerformanceMode() {
        return this.performanceMode;
    }
    /**
     * The throughput, measured in MiB/s, that you want to provision for the file system. Only applicable with `throughput_mode` set to `provisioned`.
     * 
     */
    @Export(name="provisionedThroughputInMibps", type=Double.class, parameters={})
    private Output</* @Nullable */ Double> provisionedThroughputInMibps;

    /**
     * @return The throughput, measured in MiB/s, that you want to provision for the file system. Only applicable with `throughput_mode` set to `provisioned`.
     * 
     */
    public Output</* @Nullable */ Double> getProvisionedThroughputInMibps() {
        return this.provisionedThroughputInMibps;
    }
    /**
     * The latest known metered size (in bytes) of data stored in the file system, the value is not the exact size that the file system was at any point in time. See Size In Bytes.
     * 
     */
    @Export(name="sizeInBytes", type=List.class, parameters={FileSystemSizeInByte.class})
    private Output<List<FileSystemSizeInByte>> sizeInBytes;

    /**
     * @return The latest known metered size (in bytes) of data stored in the file system, the value is not the exact size that the file system was at any point in time. See Size In Bytes.
     * 
     */
    public Output<List<FileSystemSizeInByte>> getSizeInBytes() {
        return this.sizeInBytes;
    }
    /**
     * A map of tags to assign to the file system. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the file system. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
     * Throughput mode for the file system. Defaults to `bursting`. Valid values: `bursting`, `provisioned`. When using `provisioned`, also set `provisioned_throughput_in_mibps`.
     * 
     */
    @Export(name="throughputMode", type=String.class, parameters={})
    private Output</* @Nullable */ String> throughputMode;

    /**
     * @return Throughput mode for the file system. Defaults to `bursting`. Valid values: `bursting`, `provisioned`. When using `provisioned`, also set `provisioned_throughput_in_mibps`.
     * 
     */
    public Output</* @Nullable */ String> getThroughputMode() {
        return this.throughputMode;
    }

    public interface BuilderApplicator {
        public void apply(@Nullable FileSystemArgs.Builder a);
    }
    private static io.pulumi.aws.efs.FileSystemArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.efs.FileSystemArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public FileSystem(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public FileSystem(String name) {
        this(name, FileSystemArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public FileSystem(String name, @Nullable FileSystemArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public FileSystem(String name, @Nullable FileSystemArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:efs/fileSystem:FileSystem", name, args == null ? FileSystemArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private FileSystem(String name, Output<String> id, @Nullable FileSystemState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:efs/fileSystem:FileSystem", name, state, makeResourceOptions(options, id));
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
    public static FileSystem get(String name, Output<String> id, @Nullable FileSystemState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new FileSystem(name, id, state, options);
    }
}
