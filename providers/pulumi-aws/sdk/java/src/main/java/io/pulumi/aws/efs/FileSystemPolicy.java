// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.efs;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.efs.FileSystemPolicyArgs;
import io.pulumi.aws.efs.inputs.FileSystemPolicyState;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides an Elastic File System (EFS) File System Policy resource.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * The EFS file system policies can be imported using the `id`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:efs/fileSystemPolicy:FileSystemPolicy foo fs-6fa144c6
 * ```
 * 
 */
@ResourceType(type="aws:efs/fileSystemPolicy:FileSystemPolicy")
public class FileSystemPolicy extends io.pulumi.resources.CustomResource {
    /**
     * A flag to indicate whether to bypass the `aws.efs.FileSystemPolicy` lockout safety check. The policy lockout safety check determines whether the policy in the request will prevent the principal making the request will be locked out from making future `PutFileSystemPolicy` requests on the file system. Set `bypass_policy_lockout_safety_check` to `true` only when you intend to prevent the principal that is making the request from making a subsequent `PutFileSystemPolicy` request on the file system. The default value is `false`.
     * 
     */
    @OutputExport(name="bypassPolicyLockoutSafetyCheck", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> bypassPolicyLockoutSafetyCheck;

    /**
     * @return A flag to indicate whether to bypass the `aws.efs.FileSystemPolicy` lockout safety check. The policy lockout safety check determines whether the policy in the request will prevent the principal making the request will be locked out from making future `PutFileSystemPolicy` requests on the file system. Set `bypass_policy_lockout_safety_check` to `true` only when you intend to prevent the principal that is making the request from making a subsequent `PutFileSystemPolicy` request on the file system. The default value is `false`.
     * 
     */
    public Output</* @Nullable */ Boolean> getBypassPolicyLockoutSafetyCheck() {
        return this.bypassPolicyLockoutSafetyCheck;
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
     * The JSON formatted file system policy for the EFS file system. see [Docs](https://docs.aws.amazon.com/efs/latest/ug/access-control-overview.html#access-control-manage-access-intro-resource-policies) for more info.
     * 
     */
    @OutputExport(name="policy", type=String.class, parameters={})
    private Output<String> policy;

    /**
     * @return The JSON formatted file system policy for the EFS file system. see [Docs](https://docs.aws.amazon.com/efs/latest/ug/access-control-overview.html#access-control-manage-access-intro-resource-policies) for more info.
     * 
     */
    public Output<String> getPolicy() {
        return this.policy;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public FileSystemPolicy(String name, FileSystemPolicyArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:efs/fileSystemPolicy:FileSystemPolicy", name, args == null ? FileSystemPolicyArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private FileSystemPolicy(String name, Input<String> id, @Nullable FileSystemPolicyState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:efs/fileSystemPolicy:FileSystemPolicy", name, state, makeResourceOptions(options, id));
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
    public static FileSystemPolicy get(String name, Input<String> id, @Nullable FileSystemPolicyState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new FileSystemPolicy(name, id, state, options);
    }
}
