// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotanalytics;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.iotanalytics.ChannelArgs;
import io.pulumi.awsnative.iotanalytics.outputs.ChannelRetentionPeriod;
import io.pulumi.awsnative.iotanalytics.outputs.ChannelStorage;
import io.pulumi.awsnative.iotanalytics.outputs.ChannelTag;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Resource Type definition for AWS::IoTAnalytics::Channel
 * 
 * ## Example Usage
 * 
 */
@ResourceType(type="aws-native:iotanalytics:Channel")
public class Channel extends io.pulumi.resources.CustomResource {
    @Export(name="channelName", type=String.class, parameters={})
    private Output</* @Nullable */ String> channelName;

    public Output</* @Nullable */ String> getChannelName() {
        return this.channelName;
    }
    @Export(name="channelStorage", type=ChannelStorage.class, parameters={})
    private Output</* @Nullable */ ChannelStorage> channelStorage;

    public Output</* @Nullable */ ChannelStorage> getChannelStorage() {
        return this.channelStorage;
    }
    @Export(name="retentionPeriod", type=ChannelRetentionPeriod.class, parameters={})
    private Output</* @Nullable */ ChannelRetentionPeriod> retentionPeriod;

    public Output</* @Nullable */ ChannelRetentionPeriod> getRetentionPeriod() {
        return this.retentionPeriod;
    }
    @Export(name="tags", type=List.class, parameters={ChannelTag.class})
    private Output</* @Nullable */ List<ChannelTag>> tags;

    public Output</* @Nullable */ List<ChannelTag>> getTags() {
        return this.tags;
    }

    public interface BuilderApplicator {
        public void apply(@Nullable ChannelArgs.Builder a);
    }
    private static io.pulumi.awsnative.iotanalytics.ChannelArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.awsnative.iotanalytics.ChannelArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Channel(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Channel(String name) {
        this(name, ChannelArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Channel(String name, @Nullable ChannelArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Channel(String name, @Nullable ChannelArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:iotanalytics:Channel", name, args == null ? ChannelArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private Channel(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:iotanalytics:Channel", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
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
    public static Channel get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Channel(name, id, options);
    }
}
