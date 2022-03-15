// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storsimple;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.storsimple.BackupPolicyArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * The backup policy.
 * API Version: 2017-06-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:storsimple:BackupPolicy BkUpPolicy01ForSDKTest /subscriptions/4385cf00-2d3a-425a-832f-f4285b1c9dce/resourceGroups/ResourceGroupForSDKTest/providers/Microsoft.StorSimple/managers/ManagerForSDKTest1/devices/Device05ForSDKTest/backupPolicies/BkUpPolicy01ForSDKTest 
 * ```
 * 
 */
@ResourceType(type="azure-native:storsimple:BackupPolicy")
public class BackupPolicy extends io.pulumi.resources.CustomResource {
    /**
     * The backup policy creation type. Indicates whether this was created through SaaS or through StorSimple Snapshot Manager.
     * 
     */
    @Export(name="backupPolicyCreationType", type=String.class, parameters={})
    private Output<String> backupPolicyCreationType;

    /**
     * @return The backup policy creation type. Indicates whether this was created through SaaS or through StorSimple Snapshot Manager.
     * 
     */
    public Output<String> getBackupPolicyCreationType() {
        return this.backupPolicyCreationType;
    }
    /**
     * The Kind of the object. Currently only Series8000 is supported
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output</* @Nullable */ String> kind;

    /**
     * @return The Kind of the object. Currently only Series8000 is supported
     * 
     */
    public Output</* @Nullable */ String> getKind() {
        return this.kind;
    }
    /**
     * The time of the last backup for the backup policy.
     * 
     */
    @Export(name="lastBackupTime", type=String.class, parameters={})
    private Output<String> lastBackupTime;

    /**
     * @return The time of the last backup for the backup policy.
     * 
     */
    public Output<String> getLastBackupTime() {
        return this.lastBackupTime;
    }
    /**
     * The name of the object.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the object.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The time of the next backup for the backup policy.
     * 
     */
    @Export(name="nextBackupTime", type=String.class, parameters={})
    private Output<String> nextBackupTime;

    /**
     * @return The time of the next backup for the backup policy.
     * 
     */
    public Output<String> getNextBackupTime() {
        return this.nextBackupTime;
    }
    /**
     * Indicates whether at least one of the schedules in the backup policy is active or not.
     * 
     */
    @Export(name="scheduledBackupStatus", type=String.class, parameters={})
    private Output<String> scheduledBackupStatus;

    /**
     * @return Indicates whether at least one of the schedules in the backup policy is active or not.
     * 
     */
    public Output<String> getScheduledBackupStatus() {
        return this.scheduledBackupStatus;
    }
    /**
     * The count of schedules the backup policy contains.
     * 
     */
    @Export(name="schedulesCount", type=Double.class, parameters={})
    private Output<Double> schedulesCount;

    /**
     * @return The count of schedules the backup policy contains.
     * 
     */
    public Output<Double> getSchedulesCount() {
        return this.schedulesCount;
    }
    /**
     * If the backup policy was created by StorSimple Snapshot Manager, then this field indicates the hostname of the StorSimple Snapshot Manager.
     * 
     */
    @Export(name="ssmHostName", type=String.class, parameters={})
    private Output<String> ssmHostName;

    /**
     * @return If the backup policy was created by StorSimple Snapshot Manager, then this field indicates the hostname of the StorSimple Snapshot Manager.
     * 
     */
    public Output<String> getSsmHostName() {
        return this.ssmHostName;
    }
    /**
     * The hierarchical type of the object.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The hierarchical type of the object.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }
    /**
     * The path IDs of the volumes which are part of the backup policy.
     * 
     */
    @Export(name="volumeIds", type=List.class, parameters={String.class})
    private Output<List<String>> volumeIds;

    /**
     * @return The path IDs of the volumes which are part of the backup policy.
     * 
     */
    public Output<List<String>> getVolumeIds() {
        return this.volumeIds;
    }

    public interface BuilderApplicator {
        public void apply(BackupPolicyArgs.Builder a);
    }
    private static io.pulumi.azurenative.storsimple.BackupPolicyArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.storsimple.BackupPolicyArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public BackupPolicy(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public BackupPolicy(String name) {
        this(name, BackupPolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public BackupPolicy(String name, BackupPolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public BackupPolicy(String name, BackupPolicyArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:storsimple:BackupPolicy", name, args == null ? BackupPolicyArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private BackupPolicy(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:storsimple:BackupPolicy", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Output.of(Alias.builder().setType("azure-native:storsimple/v20170601:BackupPolicy").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static BackupPolicy get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new BackupPolicy(name, id, options);
    }
}
