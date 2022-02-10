// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.engagementfabric;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.engagementfabric.ChannelArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:engagementfabric:Channel")
public class Channel extends io.pulumi.resources.CustomResource {
    @OutputExport(name="channelFunctions", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> channelFunctions;

    public Output</* @Nullable */ List<String>> getChannelFunctions() {
        return this.channelFunctions;
    }
    @OutputExport(name="channelType", type=String.class, parameters={})
    private Output<String> channelType;

    public Output<String> getChannelType() {
        return this.channelType;
    }
    @OutputExport(name="credentials", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> credentials;

    public Output</* @Nullable */ Map<String,String>> getCredentials() {
        return this.credentials;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public Channel(String name, ChannelArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:engagementfabric:Channel", name, args == null ? ChannelArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Channel(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:engagementfabric:Channel", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:engagementfabric/v20180901preview:Channel").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static Channel get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Channel(name, id, options);
    }
}