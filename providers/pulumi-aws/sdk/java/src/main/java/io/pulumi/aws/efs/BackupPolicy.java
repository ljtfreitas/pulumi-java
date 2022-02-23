// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.efs;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.efs.BackupPolicyArgs;
import io.pulumi.aws.efs.inputs.BackupPolicyState;
import io.pulumi.aws.efs.outputs.BackupPolicyBackupPolicy;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides an Elastic File System (EFS) Backup Policy resource.
 * Backup policies turn automatic backups on or off for an existing file system.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * The EFS backup policies can be imported using the `id`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:efs/backupPolicy:BackupPolicy example fs-6fa144c6
 * ```
 * 
 */
@ResourceType(type="aws:efs/backupPolicy:BackupPolicy")
public class BackupPolicy extends io.pulumi.resources.CustomResource {
    /**
     * A backup_policy object (documented below).
     * 
     */
    @OutputExport(name="backupPolicy", type=BackupPolicyBackupPolicy.class, parameters={})
    private Output<BackupPolicyBackupPolicy> backupPolicy;

    /**
     * @return A backup_policy object (documented below).
     * 
     */
    public Output<BackupPolicyBackupPolicy> getBackupPolicy() {
        return this.backupPolicy;
    }
    /**
     * The ID of the EFS file system.
     * 
     */
    @OutputExport(name="fileSystemId", type=String.class, parameters={})
    private Output<String> fileSystemId;

    /**
     * @return The ID of the EFS file system.
     * 
     */
    public Output<String> getFileSystemId() {
        return this.fileSystemId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public BackupPolicy(String name, BackupPolicyArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:efs/backupPolicy:BackupPolicy", name, args == null ? BackupPolicyArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private BackupPolicy(String name, Input<String> id, @Nullable BackupPolicyState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:efs/backupPolicy:BackupPolicy", name, state, makeResourceOptions(options, id));
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
    public static BackupPolicy get(String name, Input<String> id, @Nullable BackupPolicyState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new BackupPolicy(name, id, state, options);
    }
}
