// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devices;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.devices.IotHubResourceEventHubConsumerGroupArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * The properties of the EventHubConsumerGroupInfo object.
 * API Version: 2020-08-31.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:devices:IotHubResourceEventHubConsumerGroup test /subscriptions/cmd-sub-1/resourceGroups/cmd-rg-1/providers/Microsoft.Devices/IotHubs/test-hub-2/eventHubEndpoints/events/ConsumerGroups/%24Default 
 * ```
 * 
 */
@ResourceType(type="azure-native:devices:IotHubResourceEventHubConsumerGroup")
public class IotHubResourceEventHubConsumerGroup extends io.pulumi.resources.CustomResource {
    /**
     * The etag.
     * 
     */
    @Export(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return The etag.
     * 
     */
    public Output<String> getEtag() {
        return this.etag;
    }
    /**
     * The Event Hub-compatible consumer group name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The Event Hub-compatible consumer group name.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The tags.
     * 
     */
    @Export(name="properties", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> properties;

    /**
     * @return The tags.
     * 
     */
    public Output<Map<String,String>> getProperties() {
        return this.properties;
    }
    /**
     * the resource type.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return the resource type.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    public interface BuilderApplicator {
        public void apply(IotHubResourceEventHubConsumerGroupArgs.Builder a);
    }
    private static io.pulumi.azurenative.devices.IotHubResourceEventHubConsumerGroupArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.devices.IotHubResourceEventHubConsumerGroupArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public IotHubResourceEventHubConsumerGroup(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public IotHubResourceEventHubConsumerGroup(String name) {
        this(name, IotHubResourceEventHubConsumerGroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public IotHubResourceEventHubConsumerGroup(String name, IotHubResourceEventHubConsumerGroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public IotHubResourceEventHubConsumerGroup(String name, IotHubResourceEventHubConsumerGroupArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:devices:IotHubResourceEventHubConsumerGroup", name, args == null ? IotHubResourceEventHubConsumerGroupArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private IotHubResourceEventHubConsumerGroup(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:devices:IotHubResourceEventHubConsumerGroup", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Output.of(Alias.builder().setType("azure-native:devices/v20160203:IotHubResourceEventHubConsumerGroup").build()),
                Output.of(Alias.builder().setType("azure-native:devices/v20170119:IotHubResourceEventHubConsumerGroup").build()),
                Output.of(Alias.builder().setType("azure-native:devices/v20170701:IotHubResourceEventHubConsumerGroup").build()),
                Output.of(Alias.builder().setType("azure-native:devices/v20180122:IotHubResourceEventHubConsumerGroup").build()),
                Output.of(Alias.builder().setType("azure-native:devices/v20180401:IotHubResourceEventHubConsumerGroup").build()),
                Output.of(Alias.builder().setType("azure-native:devices/v20181201preview:IotHubResourceEventHubConsumerGroup").build()),
                Output.of(Alias.builder().setType("azure-native:devices/v20190322:IotHubResourceEventHubConsumerGroup").build()),
                Output.of(Alias.builder().setType("azure-native:devices/v20190322preview:IotHubResourceEventHubConsumerGroup").build()),
                Output.of(Alias.builder().setType("azure-native:devices/v20190701preview:IotHubResourceEventHubConsumerGroup").build()),
                Output.of(Alias.builder().setType("azure-native:devices/v20191104:IotHubResourceEventHubConsumerGroup").build()),
                Output.of(Alias.builder().setType("azure-native:devices/v20200301:IotHubResourceEventHubConsumerGroup").build()),
                Output.of(Alias.builder().setType("azure-native:devices/v20200401:IotHubResourceEventHubConsumerGroup").build()),
                Output.of(Alias.builder().setType("azure-native:devices/v20200615:IotHubResourceEventHubConsumerGroup").build()),
                Output.of(Alias.builder().setType("azure-native:devices/v20200710preview:IotHubResourceEventHubConsumerGroup").build()),
                Output.of(Alias.builder().setType("azure-native:devices/v20200801:IotHubResourceEventHubConsumerGroup").build()),
                Output.of(Alias.builder().setType("azure-native:devices/v20200831:IotHubResourceEventHubConsumerGroup").build()),
                Output.of(Alias.builder().setType("azure-native:devices/v20200831preview:IotHubResourceEventHubConsumerGroup").build()),
                Output.of(Alias.builder().setType("azure-native:devices/v20210201preview:IotHubResourceEventHubConsumerGroup").build()),
                Output.of(Alias.builder().setType("azure-native:devices/v20210303preview:IotHubResourceEventHubConsumerGroup").build()),
                Output.of(Alias.builder().setType("azure-native:devices/v20210331:IotHubResourceEventHubConsumerGroup").build()),
                Output.of(Alias.builder().setType("azure-native:devices/v20210701:IotHubResourceEventHubConsumerGroup").build()),
                Output.of(Alias.builder().setType("azure-native:devices/v20210701preview:IotHubResourceEventHubConsumerGroup").build()),
                Output.of(Alias.builder().setType("azure-native:devices/v20210702:IotHubResourceEventHubConsumerGroup").build()),
                Output.of(Alias.builder().setType("azure-native:devices/v20210702preview:IotHubResourceEventHubConsumerGroup").build())
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
    public static IotHubResourceEventHubConsumerGroup get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new IotHubResourceEventHubConsumerGroup(name, id, options);
    }
}
