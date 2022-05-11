// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.automation;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.automation.ConnectionServicePrincipalArgs;
import com.pulumi.azure.automation.inputs.ConnectionServicePrincipalState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages an Automation Connection with type `AzureServicePrincipal`.
 * 
 * ## Example Usage
 * 
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
 *         var exampleResourceGroup = new ResourceGroup(&#34;exampleResourceGroup&#34;, ResourceGroupArgs.builder()        
 *             .location(&#34;West Europe&#34;)
 *             .build());
 * 
 *         final var exampleClientConfig = Output.of(CoreFunctions.getClientConfig());
 * 
 *         var exampleAccount = new Account(&#34;exampleAccount&#34;, AccountArgs.builder()        
 *             .location(exampleResourceGroup.getLocation())
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .sku(Map.of(&#34;name&#34;, &#34;Basic&#34;))
 *             .build());
 * 
 *         var exampleConnectionServicePrincipal = new ConnectionServicePrincipal(&#34;exampleConnectionServicePrincipal&#34;, ConnectionServicePrincipalArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .automationAccountName(exampleAccount.getName())
 *             .applicationId(&#34;00000000-0000-0000-0000-000000000000&#34;)
 *             .tenantId(exampleClientConfig.apply(getClientConfigResult -&gt; getClientConfigResult.getTenantId()))
 *             .subscriptionId(exampleClientConfig.apply(getClientConfigResult -&gt; getClientConfigResult.getSubscriptionId()))
 *             .certificateThumbprint(Files.readString(&#34;automation_certificate_test.thumb&#34;))
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * Automation Connection can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:automation/connectionServicePrincipal:ConnectionServicePrincipal conn1 /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.Automation/automationAccounts/account1/connections/conn1
 * ```
 * 
 */
@ResourceType(type="azure:automation/connectionServicePrincipal:ConnectionServicePrincipal")
public class ConnectionServicePrincipal extends com.pulumi.resources.CustomResource {
    /**
     * The (Client) ID of the Service Principal.
     * 
     */
    @Export(name="applicationId", type=String.class, parameters={})
    private Output<String> applicationId;

    /**
     * @return The (Client) ID of the Service Principal.
     * 
     */
    public Output<String> applicationId() {
        return this.applicationId;
    }
    /**
     * The name of the automation account in which the Connection is created. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="automationAccountName", type=String.class, parameters={})
    private Output<String> automationAccountName;

    /**
     * @return The name of the automation account in which the Connection is created. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> automationAccountName() {
        return this.automationAccountName;
    }
    /**
     * The thumbprint of the Service Principal Certificate.
     * 
     */
    @Export(name="certificateThumbprint", type=String.class, parameters={})
    private Output<String> certificateThumbprint;

    /**
     * @return The thumbprint of the Service Principal Certificate.
     * 
     */
    public Output<String> certificateThumbprint() {
        return this.certificateThumbprint;
    }
    /**
     * A description for this Connection.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return A description for this Connection.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Specifies the name of the Connection. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Specifies the name of the Connection. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The name of the resource group in which the Connection is created. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="resourceGroupName", type=String.class, parameters={})
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group in which the Connection is created. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * The subscription GUID.
     * 
     */
    @Export(name="subscriptionId", type=String.class, parameters={})
    private Output<String> subscriptionId;

    /**
     * @return The subscription GUID.
     * 
     */
    public Output<String> subscriptionId() {
        return this.subscriptionId;
    }
    /**
     * The ID of the Tenant the Service Principal is assigned in.
     * 
     */
    @Export(name="tenantId", type=String.class, parameters={})
    private Output<String> tenantId;

    /**
     * @return The ID of the Tenant the Service Principal is assigned in.
     * 
     */
    public Output<String> tenantId() {
        return this.tenantId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ConnectionServicePrincipal(String name) {
        this(name, ConnectionServicePrincipalArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ConnectionServicePrincipal(String name, ConnectionServicePrincipalArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ConnectionServicePrincipal(String name, ConnectionServicePrincipalArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:automation/connectionServicePrincipal:ConnectionServicePrincipal", name, args == null ? ConnectionServicePrincipalArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ConnectionServicePrincipal(String name, Output<String> id, @Nullable ConnectionServicePrincipalState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:automation/connectionServicePrincipal:ConnectionServicePrincipal", name, state, makeResourceOptions(options, id));
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
    public static ConnectionServicePrincipal get(String name, Output<String> id, @Nullable ConnectionServicePrincipalState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ConnectionServicePrincipal(name, id, state, options);
    }
}
