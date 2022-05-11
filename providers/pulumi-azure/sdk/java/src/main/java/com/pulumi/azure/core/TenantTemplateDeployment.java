// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.core;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.core.TenantTemplateDeploymentArgs;
import com.pulumi.azure.core.inputs.TenantTemplateDeploymentState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import java.util.*;
 * import java.io.*;
 * import java.nio.*;
 * import com.pulumi.*;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         final var exampleTemplateSpecVersion = Output.of(CoreFunctions.getTemplateSpecVersion(GetTemplateSpecVersionArgs.builder()
 *             .name(&#34;myTemplateForTenant&#34;)
 *             .resourceGroupName(&#34;myResourceGroup&#34;)
 *             .version(&#34;v0.1&#34;)
 *             .build()));
 * 
 *         var exampleTenantTemplateDeployment = new TenantTemplateDeployment(&#34;exampleTenantTemplateDeployment&#34;, TenantTemplateDeploymentArgs.builder()        
 *             .location(&#34;West Europe&#34;)
 *             .templateSpecVersionId(exampleTemplateSpecVersion.apply(getTemplateSpecVersionResult -&gt; getTemplateSpecVersionResult.getId()))
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * Tenant Template Deployments can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:core/tenantTemplateDeployment:TenantTemplateDeployment example /providers/Microsoft.Resources/deployments/deploy1
 * ```
 * 
 */
@ResourceType(type="azure:core/tenantTemplateDeployment:TenantTemplateDeployment")
public class TenantTemplateDeployment extends com.pulumi.resources.CustomResource {
    /**
     * The Debug Level which should be used for this Resource Group Template Deployment. Possible values are `none`, `requestContent`, `responseContent` and `requestContent, responseContent`.
     * 
     */
    @Export(name="debugLevel", type=String.class, parameters={})
    private Output</* @Nullable */ String> debugLevel;

    /**
     * @return The Debug Level which should be used for this Resource Group Template Deployment. Possible values are `none`, `requestContent`, `responseContent` and `requestContent, responseContent`.
     * 
     */
    public Output<Optional<String>> debugLevel() {
        return Codegen.optional(this.debugLevel);
    }
    /**
     * The Azure Region where the Template should exist. Changing this forces a new Template to be created.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return The Azure Region where the Template should exist. Changing this forces a new Template to be created.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * The name which should be used for this Template. Changing this forces a new Template to be created.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name which should be used for this Template. Changing this forces a new Template to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The JSON Content of the Outputs of the ARM Template Deployment.
     * 
     */
    @Export(name="outputContent", type=String.class, parameters={})
    private Output<String> outputContent;

    /**
     * @return The JSON Content of the Outputs of the ARM Template Deployment.
     * 
     */
    public Output<String> outputContent() {
        return this.outputContent;
    }
    /**
     * The contents of the ARM Template parameters file - containing a JSON list of parameters.
     * 
     */
    @Export(name="parametersContent", type=String.class, parameters={})
    private Output<String> parametersContent;

    /**
     * @return The contents of the ARM Template parameters file - containing a JSON list of parameters.
     * 
     */
    public Output<String> parametersContent() {
        return this.parametersContent;
    }
    /**
     * A mapping of tags which should be assigned to the Template.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A mapping of tags which should be assigned to the Template.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * The contents of the ARM Template which should be deployed into this Resource Group. Cannot be specified with `template_spec_version_id`.
     * 
     */
    @Export(name="templateContent", type=String.class, parameters={})
    private Output<String> templateContent;

    /**
     * @return The contents of the ARM Template which should be deployed into this Resource Group. Cannot be specified with `template_spec_version_id`.
     * 
     */
    public Output<String> templateContent() {
        return this.templateContent;
    }
    /**
     * The ID of the Template Spec Version to deploy. Cannot be specified with `template_content`.
     * 
     */
    @Export(name="templateSpecVersionId", type=String.class, parameters={})
    private Output</* @Nullable */ String> templateSpecVersionId;

    /**
     * @return The ID of the Template Spec Version to deploy. Cannot be specified with `template_content`.
     * 
     */
    public Output<Optional<String>> templateSpecVersionId() {
        return Codegen.optional(this.templateSpecVersionId);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public TenantTemplateDeployment(String name) {
        this(name, TenantTemplateDeploymentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public TenantTemplateDeployment(String name, @Nullable TenantTemplateDeploymentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public TenantTemplateDeployment(String name, @Nullable TenantTemplateDeploymentArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:core/tenantTemplateDeployment:TenantTemplateDeployment", name, args == null ? TenantTemplateDeploymentArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private TenantTemplateDeployment(String name, Output<String> id, @Nullable TenantTemplateDeploymentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:core/tenantTemplateDeployment:TenantTemplateDeployment", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
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
    public static TenantTemplateDeployment get(String name, Output<String> id, @Nullable TenantTemplateDeploymentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new TenantTemplateDeployment(name, id, state, options);
    }
}
