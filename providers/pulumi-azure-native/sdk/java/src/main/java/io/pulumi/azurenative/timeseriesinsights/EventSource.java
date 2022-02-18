// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.timeseriesinsights;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.timeseriesinsights.EventSourceArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * An environment receives data from one or more event sources. Each event source has associated connection info that allows the Time Series Insights ingress pipeline to connect to and pull data from the event source
 * API Version: 2020-05-15.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:timeseriesinsights:EventSource es1 /subscriptions/subid/resourceGroups/rg1/providers/Microsoft.TimeSeriesInsights/Environments/env1/eventSources/es1 
 * ```
 * 
 * @deprecated
 * Please use one of the variants: EventHubEventSource, IoTHubEventSource.
 * 
 */
@Deprecated /* Please use one of the variants: EventHubEventSource, IoTHubEventSource. */
@ResourceType(type="azure-native:timeseriesinsights:EventSource")
public class EventSource extends io.pulumi.resources.CustomResource {
    /**
     * The kind of the event source.
     * 
     */
    @OutputExport(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return The kind of the event source.
     * 
     */
    public Output<String> getKind() {
        return this.kind;
    }
    /**
     * Resource location
     * 
     */
    @OutputExport(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return Resource location
     * 
     */
    public Output<String> getLocation() {
        return this.location;
    }
    /**
     * Resource name
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Resource tags
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Resource tags
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * Resource type
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public EventSource(String name, EventSourceArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:timeseriesinsights:EventSource", name, args == null ? EventSourceArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private EventSource(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:timeseriesinsights:EventSource", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:timeseriesinsights/v20170228preview:EventSource").build()),
                Input.of(Alias.builder().setType("azure-native:timeseriesinsights/v20171115:EventSource").build()),
                Input.of(Alias.builder().setType("azure-native:timeseriesinsights/v20180815preview:EventSource").build()),
                Input.of(Alias.builder().setType("azure-native:timeseriesinsights/v20200515:EventSource").build()),
                Input.of(Alias.builder().setType("azure-native:timeseriesinsights/v20210331preview:EventSource").build()),
                Input.of(Alias.builder().setType("azure-native:timeseriesinsights/v20210630preview:EventSource").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static EventSource get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new EventSource(name, id, options);
    }
}
