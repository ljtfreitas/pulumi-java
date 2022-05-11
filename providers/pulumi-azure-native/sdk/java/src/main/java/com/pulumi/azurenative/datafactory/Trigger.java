// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.datafactory.TriggerArgs;
import com.pulumi.azurenative.datafactory.outputs.BlobEventsTriggerResponse;
import com.pulumi.azurenative.datafactory.outputs.BlobTriggerResponse;
import com.pulumi.azurenative.datafactory.outputs.ChainingTriggerResponse;
import com.pulumi.azurenative.datafactory.outputs.CustomEventsTriggerResponse;
import com.pulumi.azurenative.datafactory.outputs.MultiplePipelineTriggerResponse;
import com.pulumi.azurenative.datafactory.outputs.RerunTumblingWindowTriggerResponse;
import com.pulumi.azurenative.datafactory.outputs.ScheduleTriggerResponse;
import com.pulumi.azurenative.datafactory.outputs.TumblingWindowTriggerResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Trigger resource type.
 * API Version: 2018-06-01.
 * 
 * ## Example Usage
 * ### Triggers_Create
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
 *         var trigger = new Trigger(&#34;trigger&#34;, TriggerArgs.builder()        
 *             .factoryName(&#34;exampleFactoryName&#34;)
 *             .properties(Map.ofEntries(
 *                 Map.entry(&#34;pipelines&#34;, Map.ofEntries(
 *                     Map.entry(&#34;parameters&#34;, BlobEventsTrigger.builder()
 *                         .outputBlobNameList(&#34;exampleoutput.csv&#34;)
 *                         .build()),
 *                     Map.entry(&#34;pipelineReference&#34;, Map.ofEntries(
 *                         Map.entry(&#34;referenceName&#34;, &#34;examplePipeline&#34;),
 *                         Map.entry(&#34;type&#34;, &#34;PipelineReference&#34;)
 *                     ))
 *                 )),
 *                 Map.entry(&#34;recurrence&#34;, Map.ofEntries(
 *                     Map.entry(&#34;endTime&#34;, &#34;2018-06-16T00:55:13.8441801Z&#34;),
 *                     Map.entry(&#34;frequency&#34;, &#34;Minute&#34;),
 *                     Map.entry(&#34;interval&#34;, 4),
 *                     Map.entry(&#34;startTime&#34;, &#34;2018-06-16T00:39:13.8441801Z&#34;),
 *                     Map.entry(&#34;timeZone&#34;, &#34;UTC&#34;)
 *                 )),
 *                 Map.entry(&#34;type&#34;, &#34;ScheduleTrigger&#34;)
 *             ))
 *             .resourceGroupName(&#34;exampleResourceGroup&#34;)
 *             .triggerName(&#34;exampleTrigger&#34;)
 *             .build());
 * 
 *         }
 * }
 * 
 * ```
 * ### Triggers_Update
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
 *         var trigger = new Trigger(&#34;trigger&#34;, TriggerArgs.builder()        
 *             .factoryName(&#34;exampleFactoryName&#34;)
 *             .properties(Map.ofEntries(
 *                 Map.entry(&#34;description&#34;, &#34;Example description&#34;),
 *                 Map.entry(&#34;pipelines&#34;, Map.ofEntries(
 *                     Map.entry(&#34;parameters&#34;, BlobEventsTrigger.builder()
 *                         .outputBlobNameList(&#34;exampleoutput.csv&#34;)
 *                         .build()),
 *                     Map.entry(&#34;pipelineReference&#34;, Map.ofEntries(
 *                         Map.entry(&#34;referenceName&#34;, &#34;examplePipeline&#34;),
 *                         Map.entry(&#34;type&#34;, &#34;PipelineReference&#34;)
 *                     ))
 *                 )),
 *                 Map.entry(&#34;recurrence&#34;, Map.ofEntries(
 *                     Map.entry(&#34;endTime&#34;, &#34;2018-06-16T00:55:14.905167Z&#34;),
 *                     Map.entry(&#34;frequency&#34;, &#34;Minute&#34;),
 *                     Map.entry(&#34;interval&#34;, 4),
 *                     Map.entry(&#34;startTime&#34;, &#34;2018-06-16T00:39:14.905167Z&#34;),
 *                     Map.entry(&#34;timeZone&#34;, &#34;UTC&#34;)
 *                 )),
 *                 Map.entry(&#34;type&#34;, &#34;ScheduleTrigger&#34;)
 *             ))
 *             .resourceGroupName(&#34;exampleResourceGroup&#34;)
 *             .triggerName(&#34;exampleTrigger&#34;)
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
 * $ pulumi import azure-native:datafactory:Trigger exampleTrigger /subscriptions/12345678-1234-1234-1234-12345678abc/resourceGroups/exampleResourceGroup/providers/Microsoft.DataFactory/factories/exampleFactoryName/triggers/exampleTrigger 
 * ```
 * 
 */
@ResourceType(type="azure-native:datafactory:Trigger")
public class Trigger extends com.pulumi.resources.CustomResource {
    /**
     * Etag identifies change in the resource.
     * 
     */
    @Export(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return Etag identifies change in the resource.
     * 
     */
    public Output<String> etag() {
        return this.etag;
    }
    /**
     * The resource name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The resource name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Properties of the trigger.
     * 
     */
    @Export(name="properties", type=Object.class, parameters={})
    private Output<Object> properties;

    /**
     * @return Properties of the trigger.
     * 
     */
    public Output<Object> properties() {
        return this.properties;
    }
    /**
     * The resource type.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The resource type.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Trigger(String name) {
        this(name, TriggerArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Trigger(String name, TriggerArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Trigger(String name, TriggerArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:datafactory:Trigger", name, args == null ? TriggerArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Trigger(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:datafactory:Trigger", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:datafactory/v20170901preview:Trigger").build()),
                Output.of(Alias.builder().type("azure-native:datafactory/v20180601:Trigger").build())
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
    public static Trigger get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Trigger(name, id, options);
    }
}
