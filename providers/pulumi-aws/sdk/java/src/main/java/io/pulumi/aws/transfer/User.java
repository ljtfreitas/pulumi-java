// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.transfer;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.transfer.UserArgs;
import io.pulumi.aws.transfer.inputs.UserState;
import io.pulumi.aws.transfer.outputs.UserHomeDirectoryMapping;
import io.pulumi.aws.transfer.outputs.UserPosixProfile;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides a AWS Transfer User resource. Managing SSH keys can be accomplished with the `aws.transfer.SshKey` resource.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Transfer Users can be imported using the `server_id` and `user_name` separated by `/`.
 * 
 * ```sh
 *  $ pulumi import aws:transfer/user:User bar s-12345678/test-username
 * ```
 * 
 */
@ResourceType(type="aws:transfer/user:User")
public class User extends io.pulumi.resources.CustomResource {
    /**
     * Amazon Resource Name (ARN) of Transfer User
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return Amazon Resource Name (ARN) of Transfer User
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * The landing directory (folder) for a user when they log in to the server using their SFTP client.  It should begin with a `/`.  The first item in the path is the name of the home bucket (accessible as `${Transfer:HomeBucket}` in the policy) and the rest is the home directory (accessible as `${Transfer:HomeDirectory}` in the policy). For example, `/example-bucket-1234/username` would set the home bucket to `example-bucket-1234` and the home directory to `username`.
     * 
     */
    @Export(name="homeDirectory", type=String.class, parameters={})
    private Output</* @Nullable */ String> homeDirectory;

    /**
     * @return The landing directory (folder) for a user when they log in to the server using their SFTP client.  It should begin with a `/`.  The first item in the path is the name of the home bucket (accessible as `${Transfer:HomeBucket}` in the policy) and the rest is the home directory (accessible as `${Transfer:HomeDirectory}` in the policy). For example, `/example-bucket-1234/username` would set the home bucket to `example-bucket-1234` and the home directory to `username`.
     * 
     */
    public Output</* @Nullable */ String> getHomeDirectory() {
        return this.homeDirectory;
    }
    /**
     * Logical directory mappings that specify what S3 paths and keys should be visible to your user and how you want to make them visible. See Home Directory Mappings below.
     * 
     */
    @Export(name="homeDirectoryMappings", type=List.class, parameters={UserHomeDirectoryMapping.class})
    private Output</* @Nullable */ List<UserHomeDirectoryMapping>> homeDirectoryMappings;

    /**
     * @return Logical directory mappings that specify what S3 paths and keys should be visible to your user and how you want to make them visible. See Home Directory Mappings below.
     * 
     */
    public Output</* @Nullable */ List<UserHomeDirectoryMapping>> getHomeDirectoryMappings() {
        return this.homeDirectoryMappings;
    }
    /**
     * The type of landing directory (folder) you mapped for your users' home directory. Valid values are `PATH` and `LOGICAL`.
     * 
     */
    @Export(name="homeDirectoryType", type=String.class, parameters={})
    private Output</* @Nullable */ String> homeDirectoryType;

    /**
     * @return The type of landing directory (folder) you mapped for your users' home directory. Valid values are `PATH` and `LOGICAL`.
     * 
     */
    public Output</* @Nullable */ String> getHomeDirectoryType() {
        return this.homeDirectoryType;
    }
    /**
     * An IAM JSON policy document that scopes down user access to portions of their Amazon S3 bucket. IAM variables you can use inside this policy include `${Transfer:UserName}`, `${Transfer:HomeDirectory}`, and `${Transfer:HomeBucket}`. These are evaluated on-the-fly when navigating the bucket.
     * 
     */
    @Export(name="policy", type=String.class, parameters={})
    private Output</* @Nullable */ String> policy;

    /**
     * @return An IAM JSON policy document that scopes down user access to portions of their Amazon S3 bucket. IAM variables you can use inside this policy include `${Transfer:UserName}`, `${Transfer:HomeDirectory}`, and `${Transfer:HomeBucket}`. These are evaluated on-the-fly when navigating the bucket.
     * 
     */
    public Output</* @Nullable */ String> getPolicy() {
        return this.policy;
    }
    /**
     * Specifies the full POSIX identity, including user ID (Uid), group ID (Gid), and any secondary groups IDs (SecondaryGids), that controls your users' access to your Amazon EFS file systems. See Posix Profile below.
     * 
     */
    @Export(name="posixProfile", type=UserPosixProfile.class, parameters={})
    private Output</* @Nullable */ UserPosixProfile> posixProfile;

    /**
     * @return Specifies the full POSIX identity, including user ID (Uid), group ID (Gid), and any secondary groups IDs (SecondaryGids), that controls your users' access to your Amazon EFS file systems. See Posix Profile below.
     * 
     */
    public Output</* @Nullable */ UserPosixProfile> getPosixProfile() {
        return this.posixProfile;
    }
    /**
     * Amazon Resource Name (ARN) of an IAM role that allows the service to controls your user’s access to your Amazon S3 bucket.
     * 
     */
    @Export(name="role", type=String.class, parameters={})
    private Output<String> role;

    /**
     * @return Amazon Resource Name (ARN) of an IAM role that allows the service to controls your user’s access to your Amazon S3 bucket.
     * 
     */
    public Output<String> getRole() {
        return this.role;
    }
    /**
     * The Server ID of the Transfer Server (e.g., `s-12345678`)
     * 
     */
    @Export(name="serverId", type=String.class, parameters={})
    private Output<String> serverId;

    /**
     * @return The Server ID of the Transfer Server (e.g., `s-12345678`)
     * 
     */
    public Output<String> getServerId() {
        return this.serverId;
    }
    /**
     * A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider.
     * 
     */
    @Export(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider.
     * 
     */
    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll;
    }
    /**
     * The name used for log in to your SFTP server.
     * 
     */
    @Export(name="userName", type=String.class, parameters={})
    private Output<String> userName;

    /**
     * @return The name used for log in to your SFTP server.
     * 
     */
    public Output<String> getUserName() {
        return this.userName;
    }

    public interface BuilderApplicator {
        public void apply(UserArgs.Builder a);
    }
    private static io.pulumi.aws.transfer.UserArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.transfer.UserArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public User(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public User(String name) {
        this(name, UserArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public User(String name, UserArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public User(String name, UserArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:transfer/user:User", name, args == null ? UserArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private User(String name, Output<String> id, @Nullable UserState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:transfer/user:User", name, state, makeResourceOptions(options, id));
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
    public static User get(String name, Output<String> id, @Nullable UserState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new User(name, id, state, options);
    }
}
