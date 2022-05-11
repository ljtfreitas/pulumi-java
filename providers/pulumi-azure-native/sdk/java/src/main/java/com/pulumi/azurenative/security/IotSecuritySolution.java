// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.security;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.security.IotSecuritySolutionArgs;
import com.pulumi.azurenative.security.outputs.AdditionalWorkspacesPropertiesResponse;
import com.pulumi.azurenative.security.outputs.RecommendationConfigurationPropertiesResponse;
import com.pulumi.azurenative.security.outputs.SystemDataResponse;
import com.pulumi.azurenative.security.outputs.UserDefinedResourcesPropertiesResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * IoT Security solution configuration and resource information.
 * API Version: 2019-08-01.
 * 
 * ## Example Usage
 * ### Create or update a IoT security solution
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
 *         var iotSecuritySolution = new IotSecuritySolution(&#34;iotSecuritySolution&#34;, IotSecuritySolutionArgs.builder()        
 *             .disabledDataSources()
 *             .displayName(&#34;Solution Default&#34;)
 *             .export()
 *             .iotHubs(&#34;/subscriptions/075423e9-7d33-4166-8bdf-3920b04e3735/resourceGroups/myRg/providers/Microsoft.Devices/IotHubs/FirstIotHub&#34;)
 *             .location(&#34;East Us&#34;)
 *             .recommendationsConfiguration(            
 *                 Map.ofEntries(
 *                     Map.entry(&#34;recommendationType&#34;, &#34;IoT_OpenPorts&#34;),
 *                     Map.entry(&#34;status&#34;, &#34;Disabled&#34;)
 *                 ),
 *                 Map.ofEntries(
 *                     Map.entry(&#34;recommendationType&#34;, &#34;IoT_SharedCredentials&#34;),
 *                     Map.entry(&#34;status&#34;, &#34;Disabled&#34;)
 *                 ))
 *             .resourceGroupName(&#34;MyGroup&#34;)
 *             .solutionName(&#34;default&#34;)
 *             .status(&#34;Enabled&#34;)
 *             .tags()
 *             .unmaskedIpLoggingStatus(&#34;Enabled&#34;)
 *             .userDefinedResources(Map.ofEntries(
 *                 Map.entry(&#34;query&#34;, &#34;where type != \&#34;microsoft.devices/iothubs\&#34; | where name contains \&#34;iot\&#34;&#34;),
 *                 Map.entry(&#34;querySubscriptions&#34;, &#34;075423e9-7d33-4166-8bdf-3920b04e3735&#34;)
 *             ))
 *             .workspace(&#34;/subscriptions/c4930e90-cd72-4aa5-93e9-2d081d129569/resourceGroups/myRg/providers/Microsoft.OperationalInsights/workspaces/myWorkspace1&#34;)
 *             .build());
 * 
 *         }
 * }
 * 
 * ```
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:security:IotSecuritySolution default /subscriptions/20ff7fc3-e762-44dd-bd96-b71116dcdc23/resourceGroups/MyGroup/providers/Microsoft.Security/Locations/eastus/IoTSecuritySolutions/default 
 * ```
 * 
 */
@ResourceType(type="azure-native:security:IotSecuritySolution")
public class IotSecuritySolution extends com.pulumi.resources.CustomResource {
    /**
     * List of additional workspaces
     * 
     */
    @Export(name="additionalWorkspaces", type=List.class, parameters={AdditionalWorkspacesPropertiesResponse.class})
    private Output</* @Nullable */ List<AdditionalWorkspacesPropertiesResponse>> additionalWorkspaces;

    /**
     * @return List of additional workspaces
     * 
     */
    public Output<Optional<List<AdditionalWorkspacesPropertiesResponse>>> additionalWorkspaces() {
        return Codegen.optional(this.additionalWorkspaces);
    }
    /**
     * List of resources that were automatically discovered as relevant to the security solution.
     * 
     */
    @Export(name="autoDiscoveredResources", type=List.class, parameters={String.class})
    private Output<List<String>> autoDiscoveredResources;

    /**
     * @return List of resources that were automatically discovered as relevant to the security solution.
     * 
     */
    public Output<List<String>> autoDiscoveredResources() {
        return this.autoDiscoveredResources;
    }
    /**
     * Disabled data sources. Disabling these data sources compromises the system.
     * 
     */
    @Export(name="disabledDataSources", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> disabledDataSources;

    /**
     * @return Disabled data sources. Disabling these data sources compromises the system.
     * 
     */
    public Output<Optional<List<String>>> disabledDataSources() {
        return Codegen.optional(this.disabledDataSources);
    }
    /**
     * Resource display name.
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return Resource display name.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }
    /**
     * List of additional options for exporting to workspace data.
     * 
     */
    @Export(name="export", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> export;

    /**
     * @return List of additional options for exporting to workspace data.
     * 
     */
    public Output<Optional<List<String>>> export() {
        return Codegen.optional(this.export);
    }
    /**
     * IoT Hub resource IDs
     * 
     */
    @Export(name="iotHubs", type=List.class, parameters={String.class})
    private Output<List<String>> iotHubs;

    /**
     * @return IoT Hub resource IDs
     * 
     */
    public Output<List<String>> iotHubs() {
        return this.iotHubs;
    }
    /**
     * The resource location.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return The resource location.
     * 
     */
    public Output<Optional<String>> location() {
        return Codegen.optional(this.location);
    }
    /**
     * Resource name
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * List of the configuration status for each recommendation type.
     * 
     */
    @Export(name="recommendationsConfiguration", type=List.class, parameters={RecommendationConfigurationPropertiesResponse.class})
    private Output</* @Nullable */ List<RecommendationConfigurationPropertiesResponse>> recommendationsConfiguration;

    /**
     * @return List of the configuration status for each recommendation type.
     * 
     */
    public Output<Optional<List<RecommendationConfigurationPropertiesResponse>>> recommendationsConfiguration() {
        return Codegen.optional(this.recommendationsConfiguration);
    }
    /**
     * Status of the IoT Security solution.
     * 
     */
    @Export(name="status", type=String.class, parameters={})
    private Output</* @Nullable */ String> status;

    /**
     * @return Status of the IoT Security solution.
     * 
     */
    public Output<Optional<String>> status() {
        return Codegen.optional(this.status);
    }
    /**
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     */
    @Export(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     */
    public Output<SystemDataResponse> systemData() {
        return this.systemData;
    }
    /**
     * Resource tags
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Resource tags
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * Resource type
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    /**
     * Unmasked IP address logging status
     * 
     */
    @Export(name="unmaskedIpLoggingStatus", type=String.class, parameters={})
    private Output</* @Nullable */ String> unmaskedIpLoggingStatus;

    /**
     * @return Unmasked IP address logging status
     * 
     */
    public Output<Optional<String>> unmaskedIpLoggingStatus() {
        return Codegen.optional(this.unmaskedIpLoggingStatus);
    }
    /**
     * Properties of the IoT Security solution&#39;s user defined resources.
     * 
     */
    @Export(name="userDefinedResources", type=UserDefinedResourcesPropertiesResponse.class, parameters={})
    private Output</* @Nullable */ UserDefinedResourcesPropertiesResponse> userDefinedResources;

    /**
     * @return Properties of the IoT Security solution&#39;s user defined resources.
     * 
     */
    public Output<Optional<UserDefinedResourcesPropertiesResponse>> userDefinedResources() {
        return Codegen.optional(this.userDefinedResources);
    }
    /**
     * Workspace resource ID
     * 
     */
    @Export(name="workspace", type=String.class, parameters={})
    private Output</* @Nullable */ String> workspace;

    /**
     * @return Workspace resource ID
     * 
     */
    public Output<Optional<String>> workspace() {
        return Codegen.optional(this.workspace);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public IotSecuritySolution(String name) {
        this(name, IotSecuritySolutionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public IotSecuritySolution(String name, IotSecuritySolutionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public IotSecuritySolution(String name, IotSecuritySolutionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:security:IotSecuritySolution", name, args == null ? IotSecuritySolutionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private IotSecuritySolution(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:security:IotSecuritySolution", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:security/v20170801preview:IotSecuritySolution").build()),
                Output.of(Alias.builder().type("azure-native:security/v20190801:IotSecuritySolution").build())
            ))
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static IotSecuritySolution get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new IotSecuritySolution(name, id, options);
    }
}
