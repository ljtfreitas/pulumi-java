// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.servicecatalog;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.servicecatalog.OrganizationsAccessArgs;
import com.pulumi.aws.servicecatalog.inputs.OrganizationsAccessState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import javax.annotation.Nullable;

/**
 * Manages Service Catalog AWS Organizations Access, a portfolio sharing feature through AWS Organizations. This allows Service Catalog to receive updates on your organization in order to sync your shares with the current structure. This resource will prompt AWS to set `organizations:EnableAWSServiceAccess` on your behalf so that your shares can be in sync with any changes in your AWS Organizations structure.
 * 
 * &gt; **NOTE:** This resource can only be used by the management account in the organization. In other words, a delegated administrator is not authorized to use the resource.
 * 
 * ## Example Usage
 * ### Basic Usage
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
 *         var example = new OrganizationsAccess(&#34;example&#34;, OrganizationsAccessArgs.builder()        
 *             .enabled(&#34;true&#34;)
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 */
@ResourceType(type="aws:servicecatalog/organizationsAccess:OrganizationsAccess")
public class OrganizationsAccess extends com.pulumi.resources.CustomResource {
    /**
     * Whether to enable AWS Organizations access.
     * 
     */
    @Export(name="enabled", type=Boolean.class, parameters={})
    private Output<Boolean> enabled;

    /**
     * @return Whether to enable AWS Organizations access.
     * 
     */
    public Output<Boolean> enabled() {
        return this.enabled;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public OrganizationsAccess(String name) {
        this(name, OrganizationsAccessArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public OrganizationsAccess(String name, OrganizationsAccessArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public OrganizationsAccess(String name, OrganizationsAccessArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:servicecatalog/organizationsAccess:OrganizationsAccess", name, args == null ? OrganizationsAccessArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private OrganizationsAccess(String name, Output<String> id, @Nullable OrganizationsAccessState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:servicecatalog/organizationsAccess:OrganizationsAccess", name, state, makeResourceOptions(options, id));
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
    public static OrganizationsAccess get(String name, Output<String> id, @Nullable OrganizationsAccessState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new OrganizationsAccess(name, id, state, options);
    }
}
