// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.projects;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.projects.IAMCustomRoleArgs;
import io.pulumi.gcp.projects.inputs.IAMCustomRoleState;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Allows management of a customized Cloud IAM project role. For more information see
 * [the official documentation](https://cloud.google.com/iam/docs/understanding-custom-roles)
 * and
 * [API](https://cloud.google.com/iam/reference/rest/v1/projects.roles).
 * 
 * > **Warning:** Note that custom roles in GCP have the concept of a soft-delete. There are two issues that may arise
 *  from this and how roles are propagated. 1) creating a role may involve undeleting and then updating a role with the
 *  same name, possibly causing confusing behavior between undelete and update. 2) A deleted role is permanently deleted
 *  after 7 days, but it can take up to 30 more days (i.e. between 7 and 37 days after deletion) before the role name is
 *  made available again. This means a deleted role that has been deleted for more than 7 days cannot be changed at all
 *  by the provider, and new roles cannot share that name.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Custom Roles can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:projects/iAMCustomRole:IAMCustomRole default projects/{{project}}/roles/{{role_id}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:projects/iAMCustomRole:IAMCustomRole default {{project}}/{{role_id}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:projects/iAMCustomRole:IAMCustomRole default {{role_id}}
 * ```
 * 
 */
@ResourceType(type="gcp:projects/iAMCustomRole:IAMCustomRole")
public class IAMCustomRole extends io.pulumi.resources.CustomResource {
    /**
     * (Optional) The current deleted state of the role.
     * 
     */
    @Export(name="deleted", type=Boolean.class, parameters={})
    private Output<Boolean> deleted;

    /**
     * @return (Optional) The current deleted state of the role.
     * 
     */
    public Output<Boolean> deleted() {
        return this.deleted;
    }
    /**
     * A human-readable description for the role.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return A human-readable description for the role.
     * 
     */
    public Output</* @Nullable */ String> description() {
        return this.description;
    }
    /**
     * The name of the role in the format `projects/{{project}}/roles/{{role_id}}`. Like `id`, this field can be used as a reference in other resources such as IAM role bindings.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the role in the format `projects/{{project}}/roles/{{role_id}}`. Like `id`, this field can be used as a reference in other resources such as IAM role bindings.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The names of the permissions this role grants when bound in an IAM policy. At least one permission must be specified.
     * 
     */
    @Export(name="permissions", type=List.class, parameters={String.class})
    private Output<List<String>> permissions;

    /**
     * @return The names of the permissions this role grants when bound in an IAM policy. At least one permission must be specified.
     * 
     */
    public Output<List<String>> permissions() {
        return this.permissions;
    }
    /**
     * The project that the service account will be created in.
     * Defaults to the provider project configuration.
     * 
     */
    @Export(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The project that the service account will be created in.
     * Defaults to the provider project configuration.
     * 
     */
    public Output<String> project() {
        return this.project;
    }
    /**
     * The camel case role id to use for this role. Cannot contain `-` characters.
     * 
     */
    @Export(name="roleId", type=String.class, parameters={})
    private Output<String> roleId;

    /**
     * @return The camel case role id to use for this role. Cannot contain `-` characters.
     * 
     */
    public Output<String> roleId() {
        return this.roleId;
    }
    /**
     * The current launch stage of the role.
     * Defaults to `GA`.
     * List of possible stages is [here](https://cloud.google.com/iam/reference/rest/v1/organizations.roles#Role.RoleLaunchStage).
     * 
     */
    @Export(name="stage", type=String.class, parameters={})
    private Output</* @Nullable */ String> stage;

    /**
     * @return The current launch stage of the role.
     * Defaults to `GA`.
     * List of possible stages is [here](https://cloud.google.com/iam/reference/rest/v1/organizations.roles#Role.RoleLaunchStage).
     * 
     */
    public Output</* @Nullable */ String> stage() {
        return this.stage;
    }
    /**
     * A human-readable title for the role.
     * 
     */
    @Export(name="title", type=String.class, parameters={})
    private Output<String> title;

    /**
     * @return A human-readable title for the role.
     * 
     */
    public Output<String> title() {
        return this.title;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public IAMCustomRole(String name) {
        this(name, IAMCustomRoleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public IAMCustomRole(String name, IAMCustomRoleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public IAMCustomRole(String name, IAMCustomRoleArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:projects/iAMCustomRole:IAMCustomRole", name, args == null ? IAMCustomRoleArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private IAMCustomRole(String name, Output<String> id, @Nullable IAMCustomRoleState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:projects/iAMCustomRole:IAMCustomRole", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
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
    public static IAMCustomRole get(String name, Output<String> id, @Nullable IAMCustomRoleState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new IAMCustomRole(name, id, state, options);
    }
}
