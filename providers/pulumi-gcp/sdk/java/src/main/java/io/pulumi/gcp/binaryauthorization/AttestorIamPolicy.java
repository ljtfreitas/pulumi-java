// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.binaryauthorization;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.binaryauthorization.AttestorIamPolicyArgs;
import io.pulumi.gcp.binaryauthorization.inputs.AttestorIamPolicyState;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Three different resources help you manage your IAM policy for Binary Authorization Attestor. Each of these resources serves a different use case:
 * 
 * * `gcp.binaryauthorization.AttestorIamPolicy`: Authoritative. Sets the IAM policy for the attestor and replaces any existing policy already attached.
 * * `gcp.binaryauthorization.AttestorIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the attestor are preserved.
 * * `gcp.binaryauthorization.AttestorIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the attestor are preserved.
 * 
 * > **Note:** `gcp.binaryauthorization.AttestorIamPolicy` **cannot** be used in conjunction with `gcp.binaryauthorization.AttestorIamBinding` and `gcp.binaryauthorization.AttestorIamMember` or they will fight over what your policy should be.
 * 
 * > **Note:** `gcp.binaryauthorization.AttestorIamBinding` resources **can be** used in conjunction with `gcp.binaryauthorization.AttestorIamMember` resources **only if** they do not grant privilege to the same role.
 * 
 * ## google\_binary\_authorization\_attestor\_iam\_policy
 * 
 * ## google\_binary\_authorization\_attestor\_iam\_binding
 * 
 * ## google\_binary\_authorization\_attestor\_iam\_member
 * 
 * ## Import
 * 
 * For all import syntaxes, the "resource in question" can take any of the following forms* projects/{{project}}/attestors/{{name}} * {{project}}/{{name}} * {{name}} Any variables not passed in the import command will be taken from the provider configuration. Binary Authorization attestor IAM resources can be imported using the resource identifiers, role, and member. IAM member imports use space-delimited identifiersthe resource in question, the role, and the member identity, e.g.
 * 
 * ```sh
 *  $ pulumi import gcp:binaryauthorization/attestorIamPolicy:AttestorIamPolicy editor "projects/{{project}}/attestors/{{attestor}} roles/viewer user:jane@example.com"
 * ```
 * 
 *  IAM binding imports use space-delimited identifiersthe resource in question and the role, e.g.
 * 
 * ```sh
 *  $ pulumi import gcp:binaryauthorization/attestorIamPolicy:AttestorIamPolicy editor "projects/{{project}}/attestors/{{attestor}} roles/viewer"
 * ```
 * 
 *  IAM policy imports use the identifier of the resource in question, e.g.
 * 
 * ```sh
 *  $ pulumi import gcp:binaryauthorization/attestorIamPolicy:AttestorIamPolicy editor projects/{{project}}/attestors/{{attestor}}
 * ```
 * 
 *  -> **Custom Roles**If you're importing a IAM resource with a custom role, make sure to use the
 * 
 * full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
 * 
 */
@ResourceType(type="gcp:binaryauthorization/attestorIamPolicy:AttestorIamPolicy")
public class AttestorIamPolicy extends io.pulumi.resources.CustomResource {
    /**
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    @Export(name="attestor", type=String.class, parameters={})
    private Output<String> attestor;

    /**
     * @return Used to find the parent resource to bind the IAM policy to
     * 
     */
    public Output<String> getAttestor() {
        return this.attestor;
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
    /**
     * The policy data generated by
     * a `gcp.organizations.getIAMPolicy` data source.
     * 
     */
    @Export(name="policyData", type=String.class, parameters={})
    private Output<String> policyData;

    /**
     * @return The policy data generated by
     * a `gcp.organizations.getIAMPolicy` data source.
     * 
     */
    public Output<String> getPolicyData() {
        return this.policyData;
    }
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
     * 
     */
    @Export(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
     * 
     */
    public Output<String> getProject() {
        return this.project;
    }

    public interface BuilderApplicator {
        public void apply(AttestorIamPolicyArgs.Builder a);
    }
    private static io.pulumi.gcp.binaryauthorization.AttestorIamPolicyArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.gcp.binaryauthorization.AttestorIamPolicyArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public AttestorIamPolicy(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AttestorIamPolicy(String name) {
        this(name, AttestorIamPolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AttestorIamPolicy(String name, AttestorIamPolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AttestorIamPolicy(String name, AttestorIamPolicyArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:binaryauthorization/attestorIamPolicy:AttestorIamPolicy", name, args == null ? AttestorIamPolicyArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private AttestorIamPolicy(String name, Output<String> id, @Nullable AttestorIamPolicyState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:binaryauthorization/attestorIamPolicy:AttestorIamPolicy", name, state, makeResourceOptions(options, id));
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
    public static AttestorIamPolicy get(String name, Output<String> id, @Nullable AttestorIamPolicyState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new AttestorIamPolicy(name, id, state, options);
    }
}
