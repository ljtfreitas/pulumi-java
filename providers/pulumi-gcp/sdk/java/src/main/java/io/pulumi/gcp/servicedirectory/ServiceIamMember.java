// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.servicedirectory;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.servicedirectory.ServiceIamMemberArgs;
import io.pulumi.gcp.servicedirectory.inputs.ServiceIamMemberState;
import io.pulumi.gcp.servicedirectory.outputs.ServiceIamMemberCondition;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Three different resources help you manage your IAM policy for Service Directory Service. Each of these resources serves a different use case:
 * 
 * * `gcp.servicedirectory.ServiceIamPolicy`: Authoritative. Sets the IAM policy for the service and replaces any existing policy already attached.
 * * `gcp.servicedirectory.ServiceIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the service are preserved.
 * * `gcp.servicedirectory.ServiceIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the service are preserved.
 * 
 * > **Note:** `gcp.servicedirectory.ServiceIamPolicy` **cannot** be used in conjunction with `gcp.servicedirectory.ServiceIamBinding` and `gcp.servicedirectory.ServiceIamMember` or they will fight over what your policy should be.
 * 
 * > **Note:** `gcp.servicedirectory.ServiceIamBinding` resources **can be** used in conjunction with `gcp.servicedirectory.ServiceIamMember` resources **only if** they do not grant privilege to the same role.
 * 
 * ## google\_service\_directory\_service\_iam\_policy
 * 
 * ## google\_service\_directory\_service\_iam\_binding
 * 
 * ## google\_service\_directory\_service\_iam\_member
 * 
 * ## Import
 * 
 * For all import syntaxes, the "resource in question" can take any of the following forms* projects/{{project}}/locations/{{location}}/namespaces/{{namespace_id}}/services/{{service_id}} * {{project}}/{{location}}/{{namespace_id}}/{{service_id}} * {{location}}/{{namespace_id}}/{{service_id}} Any variables not passed in the import command will be taken from the provider configuration. Service Directory service IAM resources can be imported using the resource identifiers, role, and member. IAM member imports use space-delimited identifiersthe resource in question, the role, and the member identity, e.g.
 * 
 * ```sh
 *  $ pulumi import gcp:servicedirectory/serviceIamMember:ServiceIamMember editor "projects/{{project}}/locations/{{location}}/namespaces/{{namespace_id}}/services/{{service_id}} roles/viewer user:jane@example.com"
 * ```
 * 
 *  IAM binding imports use space-delimited identifiersthe resource in question and the role, e.g.
 * 
 * ```sh
 *  $ pulumi import gcp:servicedirectory/serviceIamMember:ServiceIamMember editor "projects/{{project}}/locations/{{location}}/namespaces/{{namespace_id}}/services/{{service_id}} roles/viewer"
 * ```
 * 
 *  IAM policy imports use the identifier of the resource in question, e.g.
 * 
 * ```sh
 *  $ pulumi import gcp:servicedirectory/serviceIamMember:ServiceIamMember editor projects/{{project}}/locations/{{location}}/namespaces/{{namespace_id}}/services/{{service_id}}
 * ```
 * 
 *  -> **Custom Roles**If you're importing a IAM resource with a custom role, make sure to use the
 * 
 * full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
 * 
 */
@ResourceType(type="gcp:servicedirectory/serviceIamMember:ServiceIamMember")
public class ServiceIamMember extends io.pulumi.resources.CustomResource {
    @Export(name="condition", type=ServiceIamMemberCondition.class, parameters={})
    private Output</* @Nullable */ ServiceIamMemberCondition> condition;

    public Output</* @Nullable */ ServiceIamMemberCondition> getCondition() {
        return this.condition;
    }
    /**
     * (Computed) The etag of the IAM policy.
     * 
     */
    @Export(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return (Computed) The etag of the IAM policy.
     * 
     */
    public Output<String> getEtag() {
        return this.etag;
    }
    @Export(name="member", type=String.class, parameters={})
    private Output<String> member;

    public Output<String> getMember() {
        return this.member;
    }
    /**
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Used to find the parent resource to bind the IAM policy to
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The role that should be applied. Only one
     * `gcp.servicedirectory.ServiceIamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    @Export(name="role", type=String.class, parameters={})
    private Output<String> role;

    /**
     * @return The role that should be applied. Only one
     * `gcp.servicedirectory.ServiceIamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    public Output<String> getRole() {
        return this.role;
    }

    public interface BuilderApplicator {
        public void apply(ServiceIamMemberArgs.Builder a);
    }
    private static io.pulumi.gcp.servicedirectory.ServiceIamMemberArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.gcp.servicedirectory.ServiceIamMemberArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public ServiceIamMember(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ServiceIamMember(String name) {
        this(name, ServiceIamMemberArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ServiceIamMember(String name, ServiceIamMemberArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ServiceIamMember(String name, ServiceIamMemberArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:servicedirectory/serviceIamMember:ServiceIamMember", name, args == null ? ServiceIamMemberArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private ServiceIamMember(String name, Output<String> id, @Nullable ServiceIamMemberState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:servicedirectory/serviceIamMember:ServiceIamMember", name, state, makeResourceOptions(options, id));
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
    public static ServiceIamMember get(String name, Output<String> id, @Nullable ServiceIamMemberState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ServiceIamMember(name, id, state, options);
    }
}
