// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningservices;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.machinelearningservices.JobArgs;
import com.pulumi.azurenative.machinelearningservices.outputs.CommandJobResponse;
import com.pulumi.azurenative.machinelearningservices.outputs.SweepJobResponse;
import com.pulumi.azurenative.machinelearningservices.outputs.SystemDataResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Azure Resource Manager resource envelope.
 * API Version: 2021-03-01-preview.
 * 
 * ## Example Usage
 * ### CreateOrUpdate Command Job.
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
 *         var job = new Job(&#34;job&#34;, JobArgs.builder()        
 *             .id(&#34;testJob&#34;)
 *             .properties(Map.ofEntries(
 *                 Map.entry(&#34;codeId&#34;, &#34;/subscriptions/00000000-1111-2222-3333-444444444444/resourceGroups/resourceGroup-1234/providers/Microsoft.MachineLearningServices/workspaces/testworkspace/codes/mycode/versions/1&#34;),
 *                 Map.entry(&#34;command&#34;, &#34;python file.py test&#34;),
 *                 Map.entry(&#34;compute&#34;, Map.ofEntries(
 *                     Map.entry(&#34;instanceCount&#34;, 1),
 *                     Map.entry(&#34;target&#34;, &#34;/subscriptions/00000000-1111-2222-3333-444444444444/resourceGroups/resourceGroup-1234/providers/Microsoft.MachineLearningServices/workspaces/testworkspace/computes/mycompute&#34;)
 *                 )),
 *                 Map.entry(&#34;description&#34;, &#34;string&#34;),
 *                 Map.entry(&#34;distribution&#34;, Map.ofEntries(
 *                     Map.entry(&#34;distributionType&#34;, &#34;PyTorch&#34;),
 *                     Map.entry(&#34;processCount&#34;, 2)
 *                 )),
 *                 Map.entry(&#34;environmentId&#34;, &#34;/subscriptions/00000000-1111-2222-3333-444444444444/resourceGroups/resourceGroup-1234/providers/Microsoft.MachineLearningServices/workspaces/testworkspace/environments/AzureML-Tutorial/versions/1&#34;),
 *                 Map.entry(&#34;environmentVariables&#34;, Map.ofEntries(
 *                     Map.entry(&#34;MY_ENV_VAR1&#34;, &#34;string&#34;),
 *                     Map.entry(&#34;MY_ENV_VAR2&#34;, &#34;string&#34;)
 *                 )),
 *                 Map.entry(&#34;experimentName&#34;, &#34;myExperiment&#34;),
 *                 Map.entry(&#34;identity&#34;, Map.of(&#34;identityType&#34;, &#34;AMLToken&#34;)),
 *                 Map.entry(&#34;inputDataBindings&#34;, Map.of(&#34;test&#34;, Map.ofEntries(
 *                     Map.entry(&#34;dataId&#34;, &#34;/subscriptions/00000000-1111-2222-3333-444444444444/resourceGroups/resourceGroup-1234/providers/Microsoft.MachineLearningServices/workspaces/testworkspace/data/mydataset/versions/1&#34;),
 *                     Map.entry(&#34;pathOnCompute&#34;, &#34;path/on/compute&#34;)
 *                 ))),
 *                 Map.entry(&#34;jobType&#34;, &#34;Command&#34;),
 *                 Map.entry(&#34;outputDataBindings&#34;, Map.of(&#34;test&#34;, Map.ofEntries(
 *                     Map.entry(&#34;datastoreId&#34;, &#34;/subscriptions/00000000-1111-2222-3333-444444444444/resourceGroups/resourceGroup-1234/providers/Microsoft.MachineLearningServices/workspaces/testworkspace/datastore/mydatastore&#34;),
 *                     Map.entry(&#34;pathOnCompute&#34;, &#34;path/on/compute&#34;)
 *                 ))),
 *                 Map.entry(&#34;properties&#34;, Map.ofEntries(
 *                     Map.entry(&#34;additionalProp1&#34;, &#34;string&#34;),
 *                     Map.entry(&#34;additionalProp2&#34;, &#34;string&#34;),
 *                     Map.entry(&#34;additionalProp3&#34;, &#34;string&#34;)
 *                 )),
 *                 Map.entry(&#34;tags&#34;, Map.ofEntries(
 *                     Map.entry(&#34;additionalProp1&#34;, &#34;string&#34;),
 *                     Map.entry(&#34;additionalProp2&#34;, &#34;string&#34;),
 *                     Map.entry(&#34;additionalProp3&#34;, &#34;string&#34;)
 *                 )),
 *                 Map.entry(&#34;timeout&#34;, &#34;PT1M&#34;)
 *             ))
 *             .resourceGroupName(&#34;testrg123&#34;)
 *             .workspaceName(&#34;testworkspace&#34;)
 *             .build());
 * 
 *         }
 * }
 * 
 * ```
 * ### CreateOrUpdate Sweep Job.
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
 *         var job = new Job(&#34;job&#34;, JobArgs.builder()        
 *             .id(&#34;testJob&#34;)
 *             .properties(Map.ofEntries(
 *                 Map.entry(&#34;algorithm&#34;, &#34;Grid&#34;),
 *                 Map.entry(&#34;compute&#34;, Map.ofEntries(
 *                     Map.entry(&#34;instanceCount&#34;, 1),
 *                     Map.entry(&#34;target&#34;, &#34;/subscriptions/00000000-1111-2222-3333-444444444444/resourceGroups/resourceGroup-1234/providers/Microsoft.MachineLearningServices/workspaces/testworkspace/computes/mycompute&#34;)
 *                 )),
 *                 Map.entry(&#34;description&#34;, &#34;string&#34;),
 *                 Map.entry(&#34;identity&#34;, Map.of(&#34;identityType&#34;, &#34;AMLToken&#34;)),
 *                 Map.entry(&#34;jobType&#34;, &#34;Sweep&#34;),
 *                 Map.entry(&#34;maxConcurrentTrials&#34;, 1),
 *                 Map.entry(&#34;maxTotalTrials&#34;, 1),
 *                 Map.entry(&#34;objective&#34;, Map.ofEntries(
 *                     Map.entry(&#34;goal&#34;, &#34;Minimize&#34;),
 *                     Map.entry(&#34;primaryMetric&#34;, &#34;string&#34;)
 *                 )),
 *                 Map.entry(&#34;properties&#34;, Map.ofEntries(
 *                     Map.entry(&#34;additionalProp1&#34;, &#34;string&#34;),
 *                     Map.entry(&#34;additionalProp2&#34;, &#34;string&#34;),
 *                     Map.entry(&#34;additionalProp3&#34;, &#34;string&#34;)
 *                 )),
 *                 Map.entry(&#34;searchSpace&#34;, Map.of(&#34;name&#34;, )),
 *                 Map.entry(&#34;tags&#34;, Map.ofEntries(
 *                     Map.entry(&#34;additionalProp1&#34;, &#34;string&#34;),
 *                     Map.entry(&#34;additionalProp2&#34;, &#34;string&#34;),
 *                     Map.entry(&#34;additionalProp3&#34;, &#34;string&#34;)
 *                 )),
 *                 Map.entry(&#34;timeout&#34;, &#34;PT1M&#34;),
 *                 Map.entry(&#34;trial&#34;, Map.ofEntries(
 *                     Map.entry(&#34;codeId&#34;, &#34;/subscriptions/00000000-1111-2222-3333-444444444444/resourceGroups/resourceGroup-1234/providers/Microsoft.MachineLearningServices/workspaces/testworkspace/codes/mycode/versions/1&#34;),
 *                     Map.entry(&#34;command&#34;, &#34;python file.py test&#34;),
 *                     Map.entry(&#34;distribution&#34;, Map.ofEntries(
 *                         Map.entry(&#34;distributionType&#34;, &#34;PyTorch&#34;),
 *                         Map.entry(&#34;processCount&#34;, 2)
 *                     )),
 *                     Map.entry(&#34;environmentId&#34;, &#34;/subscriptions/00000000-1111-2222-3333-444444444444/resourceGroups/resourceGroup-1234/providers/Microsoft.MachineLearningServices/workspaces/testworkspace/environments/AzureML-Tutorial/versions/1&#34;),
 *                     Map.entry(&#34;environmentVariables&#34;, CommandJob.builder()
 *                         .mY_ENV_VAR1(&#34;string&#34;)
 *                         .mY_ENV_VAR2(&#34;string&#34;)
 *                         .build()),
 *                     Map.entry(&#34;inputDataBindings&#34;, Map.of(&#34;test&#34;, Map.ofEntries(
 *                         Map.entry(&#34;dataId&#34;, &#34;/subscriptions/00000000-1111-2222-3333-444444444444/resourceGroups/resourceGroup-1234/providers/Microsoft.MachineLearningServices/workspaces/testworkspace/data/mydataset/versions/1&#34;),
 *                         Map.entry(&#34;pathOnCompute&#34;, &#34;path/on/compute&#34;)
 *                     ))),
 *                     Map.entry(&#34;outputDataBindings&#34;, Map.of(&#34;test&#34;, Map.ofEntries(
 *                         Map.entry(&#34;datastoreId&#34;, &#34;/subscriptions/00000000-1111-2222-3333-444444444444/resourceGroups/resourceGroup-1234/providers/Microsoft.MachineLearningServices/workspaces/testworkspace/datastore/mydatastore&#34;),
 *                         Map.entry(&#34;pathOnCompute&#34;, &#34;path/on/compute&#34;)
 *                     ))),
 *                     Map.entry(&#34;timeout&#34;, &#34;PT1M&#34;)
 *                 ))
 *             ))
 *             .resourceGroupName(&#34;testrg123&#34;)
 *             .workspaceName(&#34;testworkspace&#34;)
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
 * $ pulumi import azure-native:machinelearningservices:Job string string 
 * ```
 * 
 */
@ResourceType(type="azure-native:machinelearningservices:Job")
public class Job extends com.pulumi.resources.CustomResource {
    /**
     * The name of the resource
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the resource
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * [Required] Additional attributes of the entity.
     * 
     */
    @Export(name="properties", type=Either.class, parameters={CommandJobResponse.class, SweepJobResponse.class})
    private Output<Either<CommandJobResponse,SweepJobResponse>> properties;

    /**
     * @return [Required] Additional attributes of the entity.
     * 
     */
    public Output<Either<CommandJobResponse,SweepJobResponse>> properties() {
        return this.properties;
    }
    /**
     * System data associated with resource provider
     * 
     */
    @Export(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return System data associated with resource provider
     * 
     */
    public Output<SystemDataResponse> systemData() {
        return this.systemData;
    }
    /**
     * The type of the resource. E.g. &#34;Microsoft.Compute/virtualMachines&#34; or &#34;Microsoft.Storage/storageAccounts&#34;
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource. E.g. &#34;Microsoft.Compute/virtualMachines&#34; or &#34;Microsoft.Storage/storageAccounts&#34;
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Job(String name) {
        this(name, JobArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Job(String name, JobArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Job(String name, JobArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:machinelearningservices:Job", name, args == null ? JobArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Job(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:machinelearningservices:Job", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:machinelearningservices/v20210301preview:Job").build())
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
    public static Job get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Job(name, id, options);
    }
}
