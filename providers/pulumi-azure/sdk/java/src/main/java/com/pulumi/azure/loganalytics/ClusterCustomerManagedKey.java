// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.loganalytics;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.loganalytics.ClusterCustomerManagedKeyArgs;
import com.pulumi.azure.loganalytics.inputs.ClusterCustomerManagedKeyState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Manages a Log Analytics Cluster Customer Managed Key.
 * 
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
 *         var exampleResourceGroup = new ResourceGroup(&#34;exampleResourceGroup&#34;, ResourceGroupArgs.builder()        
 *             .location(&#34;West Europe&#34;)
 *             .build());
 * 
 *         var exampleCluster = new Cluster(&#34;exampleCluster&#34;, ClusterArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .location(exampleResourceGroup.getLocation())
 *             .identity(ClusterIdentity.builder()
 *                 .type(&#34;SystemAssigned&#34;)
 *                 .build())
 *             .build());
 * 
 *         var exampleKeyVault = new KeyVault(&#34;exampleKeyVault&#34;, KeyVaultArgs.builder()        
 *             .location(exampleResourceGroup.getLocation())
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .tenantId(data.getAzurerm_client_config().getCurrent().getTenant_id())
 *             .skuName(&#34;premium&#34;)
 *             .accessPolicies(            
 *                 KeyVaultAccessPolicy.builder()
 *                     .tenantId(data.getAzurerm_client_config().getCurrent().getTenant_id())
 *                     .objectId(data.getAzurerm_client_config().getCurrent().getObject_id())
 *                     .keyPermissions(                    
 *                         &#34;create&#34;,
 *                         &#34;get&#34;)
 *                     .secretPermissions(&#34;set&#34;)
 *                     .build(),
 *                 KeyVaultAccessPolicy.builder()
 *                     .tenantId(exampleCluster.getIdentity().apply(identity -&gt; identity.getTenantId()))
 *                     .objectId(exampleCluster.getIdentity().apply(identity -&gt; identity.getPrincipalId()))
 *                     .keyPermissions(                    
 *                         &#34;get&#34;,
 *                         &#34;unwrapkey&#34;,
 *                         &#34;wrapkey&#34;)
 *                     .build())
 *             .tags(Map.of(&#34;environment&#34;, &#34;Production&#34;))
 *             .build());
 * 
 *         var exampleKey = new Key(&#34;exampleKey&#34;, KeyArgs.builder()        
 *             .keyVaultId(exampleKeyVault.getId())
 *             .keyType(&#34;RSA&#34;)
 *             .keySize(2048)
 *             .keyOpts(            
 *                 &#34;decrypt&#34;,
 *                 &#34;encrypt&#34;,
 *                 &#34;sign&#34;,
 *                 &#34;unwrapKey&#34;,
 *                 &#34;verify&#34;,
 *                 &#34;wrapKey&#34;)
 *             .build());
 * 
 *         var exampleClusterCustomerManagedKey = new ClusterCustomerManagedKey(&#34;exampleClusterCustomerManagedKey&#34;, ClusterCustomerManagedKeyArgs.builder()        
 *             .logAnalyticsClusterId(exampleCluster.getId())
 *             .keyVaultKeyId(exampleKey.getId())
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * Log Analytics Cluster Customer Managed Keys can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:loganalytics/clusterCustomerManagedKey:ClusterCustomerManagedKey example /subscriptions/00000000-0000-0000-0000-000000000000/resourcegroups/group1/providers/Microsoft.OperationalInsights/clusters/cluster1
 * ```
 * 
 */
@ResourceType(type="azure:loganalytics/clusterCustomerManagedKey:ClusterCustomerManagedKey")
public class ClusterCustomerManagedKey extends com.pulumi.resources.CustomResource {
    /**
     * The ID of the Key Vault Key to use for encryption.
     * 
     */
    @Export(name="keyVaultKeyId", type=String.class, parameters={})
    private Output<String> keyVaultKeyId;

    /**
     * @return The ID of the Key Vault Key to use for encryption.
     * 
     */
    public Output<String> keyVaultKeyId() {
        return this.keyVaultKeyId;
    }
    /**
     * The ID of the Log Analytics Cluster. Changing this forces a new Log Analytics Cluster Customer Managed Key to be created.
     * 
     */
    @Export(name="logAnalyticsClusterId", type=String.class, parameters={})
    private Output<String> logAnalyticsClusterId;

    /**
     * @return The ID of the Log Analytics Cluster. Changing this forces a new Log Analytics Cluster Customer Managed Key to be created.
     * 
     */
    public Output<String> logAnalyticsClusterId() {
        return this.logAnalyticsClusterId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ClusterCustomerManagedKey(String name) {
        this(name, ClusterCustomerManagedKeyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ClusterCustomerManagedKey(String name, ClusterCustomerManagedKeyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ClusterCustomerManagedKey(String name, ClusterCustomerManagedKeyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:loganalytics/clusterCustomerManagedKey:ClusterCustomerManagedKey", name, args == null ? ClusterCustomerManagedKeyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ClusterCustomerManagedKey(String name, Output<String> id, @Nullable ClusterCustomerManagedKeyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:loganalytics/clusterCustomerManagedKey:ClusterCustomerManagedKey", name, state, makeResourceOptions(options, id));
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
    public static ClusterCustomerManagedKey get(String name, Output<String> id, @Nullable ClusterCustomerManagedKeyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ClusterCustomerManagedKey(name, id, state, options);
    }
}
