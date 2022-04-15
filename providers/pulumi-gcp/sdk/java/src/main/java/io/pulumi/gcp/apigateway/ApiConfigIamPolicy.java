// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.apigateway;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.apigateway.ApiConfigIamPolicyArgs;
import io.pulumi.gcp.apigateway.inputs.ApiConfigIamPolicyState;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Three different resources help you manage your IAM policy for API Gateway ApiConfig. Each of these resources serves a different use case:
 * 
 * * `gcp.apigateway.ApiConfigIamPolicy`: Authoritative. Sets the IAM policy for the apiconfig and replaces any existing policy already attached.
 * * `gcp.apigateway.ApiConfigIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the apiconfig are preserved.
 * * `gcp.apigateway.ApiConfigIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the apiconfig are preserved.
 * 
 * > **Note:** `gcp.apigateway.ApiConfigIamPolicy` **cannot** be used in conjunction with `gcp.apigateway.ApiConfigIamBinding` and `gcp.apigateway.ApiConfigIamMember` or they will fight over what your policy should be.
 * 
 * > **Note:** `gcp.apigateway.ApiConfigIamBinding` resources **can be** used in conjunction with `gcp.apigateway.ApiConfigIamMember` resources **only if** they do not grant privilege to the same role.
 * 
 * ## google\_api\_gateway\_api\_config\_iam\_policy
 * 
 * ## google\_api\_gateway\_api\_config\_iam\_binding
 * 
 * ## google\_api\_gateway\_api\_config\_iam\_member
 * 
 * ## Import
 * 
 * For all import syntaxes, the "resource in question" can take any of the following forms* projects/{{project}}/locations/global/apis/{{api}}/configs/{{api_config}} * {{project}}/{{api}}/{{api_config}} * {{api}}/{{api_config}} * {{api_config}} Any variables not passed in the import command will be taken from the provider configuration. API Gateway apiconfig IAM resources can be imported using the resource identifiers, role, and member. IAM member imports use space-delimited identifiersthe resource in question, the role, and the member identity, e.g.
 * 
 * ```sh
 *  $ pulumi import gcp:apigateway/apiConfigIamPolicy:ApiConfigIamPolicy editor "projects/{{project}}/locations/global/apis/{{api}}/configs/{{api_config}} roles/apigateway.viewer user:jane@example.com"
 * ```
 * 
 *  IAM binding imports use space-delimited identifiersthe resource in question and the role, e.g.
 * 
 * ```sh
 *  $ pulumi import gcp:apigateway/apiConfigIamPolicy:ApiConfigIamPolicy editor "projects/{{project}}/locations/global/apis/{{api}}/configs/{{api_config}} roles/apigateway.viewer"
 * ```
 * 
 *  IAM policy imports use the identifier of the resource in question, e.g.
 * 
 * ```sh
 *  $ pulumi import gcp:apigateway/apiConfigIamPolicy:ApiConfigIamPolicy editor projects/{{project}}/locations/global/apis/{{api}}/configs/{{api_config}}
 * ```
 * 
 *  -> **Custom Roles**If you're importing a IAM resource with a custom role, make sure to use the
 * 
 * full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
 * 
 */
@ResourceType(type="gcp:apigateway/apiConfigIamPolicy:ApiConfigIamPolicy")
public class ApiConfigIamPolicy extends io.pulumi.resources.CustomResource {
    /**
     * The API to attach the config to.
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    @Export(name="api", type=String.class, parameters={})
    private Output<String> api;

    /**
     * @return The API to attach the config to.
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    public Output<String> api() {
        return this.api;
    }
    @Export(name="apiConfig", type=String.class, parameters={})
    private Output<String> apiConfig;

    public Output<String> apiConfig() {
        return this.apiConfig;
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
    public Output<String> etag() {
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
    public Output<String> policyData() {
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
    public Output<String> project() {
        return this.project;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ApiConfigIamPolicy(String name) {
        this(name, ApiConfigIamPolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ApiConfigIamPolicy(String name, ApiConfigIamPolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ApiConfigIamPolicy(String name, ApiConfigIamPolicyArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:apigateway/apiConfigIamPolicy:ApiConfigIamPolicy", name, args == null ? ApiConfigIamPolicyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ApiConfigIamPolicy(String name, Output<String> id, @Nullable ApiConfigIamPolicyState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:apigateway/apiConfigIamPolicy:ApiConfigIamPolicy", name, state, makeResourceOptions(options, id));
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
    public static ApiConfigIamPolicy get(String name, Output<String> id, @Nullable ApiConfigIamPolicyState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ApiConfigIamPolicy(name, id, state, options);
    }
}
