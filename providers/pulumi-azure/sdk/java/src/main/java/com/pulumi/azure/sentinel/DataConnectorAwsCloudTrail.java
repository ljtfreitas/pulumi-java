// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.sentinel;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.sentinel.DataConnectorAwsCloudTrailArgs;
import com.pulumi.azure.sentinel.inputs.DataConnectorAwsCloudTrailState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Manages a AWS CloudTrail Data Connector.
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
 *         var exampleAnalyticsWorkspace = new AnalyticsWorkspace(&#34;exampleAnalyticsWorkspace&#34;, AnalyticsWorkspaceArgs.builder()        
 *             .location(exampleResourceGroup.getLocation())
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .sku(&#34;PerGB2018&#34;)
 *             .build());
 * 
 *         var exampleAnalyticsSolution = new AnalyticsSolution(&#34;exampleAnalyticsSolution&#34;, AnalyticsSolutionArgs.builder()        
 *             .solutionName(&#34;SecurityInsights&#34;)
 *             .location(exampleResourceGroup.getLocation())
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .workspaceResourceId(exampleAnalyticsWorkspace.getId())
 *             .workspaceName(exampleAnalyticsWorkspace.getName())
 *             .plan(AnalyticsSolutionPlan.builder()
 *                 .publisher(&#34;Microsoft&#34;)
 *                 .product(&#34;OMSGallery/SecurityInsights&#34;)
 *                 .build())
 *             .build());
 * 
 *         var exampleDataConnectorAwsCloudTrail = new DataConnectorAwsCloudTrail(&#34;exampleDataConnectorAwsCloudTrail&#34;, DataConnectorAwsCloudTrailArgs.builder()        
 *             .logAnalyticsWorkspaceId(exampleAnalyticsSolution.getWorkspaceResourceId())
 *             .awsRoleArn(&#34;arn:aws:iam::000000000000:role/role1&#34;)
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * AWS CloudTrail Data Connectors can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:sentinel/dataConnectorAwsCloudTrail:DataConnectorAwsCloudTrail example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.OperationalInsights/workspaces/workspace1/providers/Microsoft.SecurityInsights/dataConnectors/dc1
 * ```
 * 
 */
@ResourceType(type="azure:sentinel/dataConnectorAwsCloudTrail:DataConnectorAwsCloudTrail")
public class DataConnectorAwsCloudTrail extends com.pulumi.resources.CustomResource {
    /**
     * The ARN of the AWS CloudTrail role, which is connected to this AWS CloudTrail Data Connector.
     * 
     */
    @Export(name="awsRoleArn", type=String.class, parameters={})
    private Output<String> awsRoleArn;

    /**
     * @return The ARN of the AWS CloudTrail role, which is connected to this AWS CloudTrail Data Connector.
     * 
     */
    public Output<String> awsRoleArn() {
        return this.awsRoleArn;
    }
    /**
     * The ID of the Log Analytics Workspace that this AWS CloudTrail Data Connector resides in. Changing this forces a new AWS CloudTrail Data Connector to be created.
     * 
     */
    @Export(name="logAnalyticsWorkspaceId", type=String.class, parameters={})
    private Output<String> logAnalyticsWorkspaceId;

    /**
     * @return The ID of the Log Analytics Workspace that this AWS CloudTrail Data Connector resides in. Changing this forces a new AWS CloudTrail Data Connector to be created.
     * 
     */
    public Output<String> logAnalyticsWorkspaceId() {
        return this.logAnalyticsWorkspaceId;
    }
    /**
     * The name which should be used for this AWS CloudTrail Data Connector. Changing this forces a new AWS CloudTrail Data Connector to be created.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name which should be used for this AWS CloudTrail Data Connector. Changing this forces a new AWS CloudTrail Data Connector to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DataConnectorAwsCloudTrail(String name) {
        this(name, DataConnectorAwsCloudTrailArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DataConnectorAwsCloudTrail(String name, DataConnectorAwsCloudTrailArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DataConnectorAwsCloudTrail(String name, DataConnectorAwsCloudTrailArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:sentinel/dataConnectorAwsCloudTrail:DataConnectorAwsCloudTrail", name, args == null ? DataConnectorAwsCloudTrailArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DataConnectorAwsCloudTrail(String name, Output<String> id, @Nullable DataConnectorAwsCloudTrailState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:sentinel/dataConnectorAwsCloudTrail:DataConnectorAwsCloudTrail", name, state, makeResourceOptions(options, id));
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
    public static DataConnectorAwsCloudTrail get(String name, Output<String> id, @Nullable DataConnectorAwsCloudTrailState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DataConnectorAwsCloudTrail(name, id, state, options);
    }
}
