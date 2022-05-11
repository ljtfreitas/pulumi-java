// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.timeseriesinsights;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.timeseriesinsights.EventHubEventSourceArgs;
import com.pulumi.azurenative.timeseriesinsights.outputs.LocalTimestampResponse;
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
 * An event source that receives its data from an Azure EventHub.
 * API Version: 2020-05-15.
 * 
 * ## Example Usage
 * ### CreateEventHubEventSource
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
 *         var eventHubEventSource = new EventHubEventSource(&#34;eventHubEventSource&#34;, EventHubEventSourceArgs.builder()        
 *             .consumerGroupName(&#34;cgn&#34;)
 *             .environmentName(&#34;env1&#34;)
 *             .eventHubName(&#34;ehn&#34;)
 *             .eventSourceName(&#34;es1&#34;)
 *             .eventSourceResourceId(&#34;somePathInArm&#34;)
 *             .keyName(&#34;managementKey&#34;)
 *             .kind(&#34;Microsoft.EventHub&#34;)
 *             .location(&#34;West US&#34;)
 *             .resourceGroupName(&#34;rg1&#34;)
 *             .serviceBusNamespace(&#34;sbn&#34;)
 *             .sharedAccessKey(&#34;someSecretvalue&#34;)
 *             .timestampPropertyName(&#34;someTimestampProperty&#34;)
 *             .type(&#34;EarliestAvailable&#34;)
 *             .build());
 * 
 *         }
 * }
 * 
 * ```
 * ### EventSourcesCreateEventHubWithCustomEnquedTime
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
 *         var eventHubEventSource = new EventHubEventSource(&#34;eventHubEventSource&#34;, EventHubEventSourceArgs.builder()        
 *             .consumerGroupName(&#34;cgn&#34;)
 *             .environmentName(&#34;env1&#34;)
 *             .eventHubName(&#34;ehn&#34;)
 *             .eventSourceName(&#34;es1&#34;)
 *             .eventSourceResourceId(&#34;somePathInArm&#34;)
 *             .keyName(&#34;managementKey&#34;)
 *             .kind(&#34;Microsoft.EventHub&#34;)
 *             .location(&#34;West US&#34;)
 *             .resourceGroupName(&#34;rg1&#34;)
 *             .serviceBusNamespace(&#34;sbn&#34;)
 *             .sharedAccessKey(&#34;someSecretvalue&#34;)
 *             .time(&#34;2017-04-01T19:20:33.2288820Z&#34;)
 *             .timestampPropertyName(&#34;someTimestampProperty&#34;)
 *             .type(&#34;CustomEnqueuedTime&#34;)
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
 * $ pulumi import azure-native:timeseriesinsights:EventHubEventSource es1 /subscriptions/subid/resourceGroups/rg1/providers/Microsoft.TimeSeriesInsights/Environments/env1/eventSources/es1 
 * ```
 * 
 */
@ResourceType(type="azure-native:timeseriesinsights:EventHubEventSource")
public class EventHubEventSource extends com.pulumi.resources.CustomResource {
    /**
     * The name of the event hub&#39;s consumer group that holds the partitions from which events will be read.
     * 
     */
    @Export(name="consumerGroupName", type=String.class, parameters={})
    private Output<String> consumerGroupName;

    /**
     * @return The name of the event hub&#39;s consumer group that holds the partitions from which events will be read.
     * 
     */
    public Output<String> consumerGroupName() {
        return this.consumerGroupName;
    }
    /**
     * The time the resource was created.
     * 
     */
    @Export(name="creationTime", type=String.class, parameters={})
    private Output<String> creationTime;

    /**
     * @return The time the resource was created.
     * 
     */
    public Output<String> creationTime() {
        return this.creationTime;
    }
    /**
     * The name of the event hub.
     * 
     */
    @Export(name="eventHubName", type=String.class, parameters={})
    private Output<String> eventHubName;

    /**
     * @return The name of the event hub.
     * 
     */
    public Output<String> eventHubName() {
        return this.eventHubName;
    }
    /**
     * The resource id of the event source in Azure Resource Manager.
     * 
     */
    @Export(name="eventSourceResourceId", type=String.class, parameters={})
    private Output<String> eventSourceResourceId;

    /**
     * @return The resource id of the event source in Azure Resource Manager.
     * 
     */
    public Output<String> eventSourceResourceId() {
        return this.eventSourceResourceId;
    }
    /**
     * The name of the SAS key that grants the Time Series Insights service access to the event hub. The shared access policies for this key must grant &#39;Listen&#39; permissions to the event hub.
     * 
     */
    @Export(name="keyName", type=String.class, parameters={})
    private Output<String> keyName;

    /**
     * @return The name of the SAS key that grants the Time Series Insights service access to the event hub. The shared access policies for this key must grant &#39;Listen&#39; permissions to the event hub.
     * 
     */
    public Output<String> keyName() {
        return this.keyName;
    }
    /**
     * The kind of the event source.
     * Expected value is &#39;Microsoft.EventHub&#39;.
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return The kind of the event source.
     * Expected value is &#39;Microsoft.EventHub&#39;.
     * 
     */
    public Output<String> kind() {
        return this.kind;
    }
    /**
     * An object that represents the local timestamp property. It contains the format of local timestamp that needs to be used and the corresponding timezone offset information. If a value isn&#39;t specified for localTimestamp, or if null, then the local timestamp will not be ingressed with the events.
     * 
     */
    @Export(name="localTimestamp", type=LocalTimestampResponse.class, parameters={})
    private Output</* @Nullable */ LocalTimestampResponse> localTimestamp;

    /**
     * @return An object that represents the local timestamp property. It contains the format of local timestamp that needs to be used and the corresponding timezone offset information. If a value isn&#39;t specified for localTimestamp, or if null, then the local timestamp will not be ingressed with the events.
     * 
     */
    public Output<Optional<LocalTimestampResponse>> localTimestamp() {
        return Codegen.optional(this.localTimestamp);
    }
    /**
     * Resource location
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return Resource location
     * 
     */
    public Output<String> location() {
        return this.location;
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
     * Provisioning state of the resource.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return Provisioning state of the resource.
     * 
     */
    public Output<String> provisioningState() {
        return this.provisioningState;
    }
    /**
     * The name of the service bus that contains the event hub.
     * 
     */
    @Export(name="serviceBusNamespace", type=String.class, parameters={})
    private Output<String> serviceBusNamespace;

    /**
     * @return The name of the service bus that contains the event hub.
     * 
     */
    public Output<String> serviceBusNamespace() {
        return this.serviceBusNamespace;
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
     * ISO8601 UTC datetime with seconds precision (milliseconds are optional), specifying the date and time that will be the starting point for Events to be consumed.
     * 
     */
    @Export(name="time", type=String.class, parameters={})
    private Output</* @Nullable */ String> time;

    /**
     * @return ISO8601 UTC datetime with seconds precision (milliseconds are optional), specifying the date and time that will be the starting point for Events to be consumed.
     * 
     */
    public Output<Optional<String>> time() {
        return Codegen.optional(this.time);
    }
    /**
     * The event property that will be used as the event source&#39;s timestamp. If a value isn&#39;t specified for timestampPropertyName, or if null or empty-string is specified, the event creation time will be used.
     * 
     */
    @Export(name="timestampPropertyName", type=String.class, parameters={})
    private Output</* @Nullable */ String> timestampPropertyName;

    /**
     * @return The event property that will be used as the event source&#39;s timestamp. If a value isn&#39;t specified for timestampPropertyName, or if null or empty-string is specified, the event creation time will be used.
     * 
     */
    public Output<Optional<String>> timestampPropertyName() {
        return Codegen.optional(this.timestampPropertyName);
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
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public EventHubEventSource(String name) {
        this(name, EventHubEventSourceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public EventHubEventSource(String name, EventHubEventSourceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public EventHubEventSource(String name, EventHubEventSourceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:timeseriesinsights:EventHubEventSource", name, makeArgs(args), makeResourceOptions(options, Codegen.empty()));
    }

    private EventHubEventSource(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:timeseriesinsights:EventHubEventSource", name, null, makeResourceOptions(options, id));
    }

    private static EventHubEventSourceArgs makeArgs(EventHubEventSourceArgs args) {
        var builder = args == null ? EventHubEventSourceArgs.builder() : EventHubEventSourceArgs.builder(args);
        return builder
            .kind("Microsoft.EventHub")
            .build();
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:timeseriesinsights/v20170228preview:EventHubEventSource").build()),
                Output.of(Alias.builder().type("azure-native:timeseriesinsights/v20171115:EventHubEventSource").build()),
                Output.of(Alias.builder().type("azure-native:timeseriesinsights/v20180815preview:EventHubEventSource").build()),
                Output.of(Alias.builder().type("azure-native:timeseriesinsights/v20200515:EventHubEventSource").build()),
                Output.of(Alias.builder().type("azure-native:timeseriesinsights/v20210331preview:EventHubEventSource").build()),
                Output.of(Alias.builder().type("azure-native:timeseriesinsights/v20210630preview:EventHubEventSource").build())
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
    public static EventHubEventSource get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new EventHubEventSource(name, id, options);
    }
}
