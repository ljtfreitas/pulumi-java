// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotsitewise;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.iotsitewise.GatewayArgs;
import io.pulumi.awsnative.iotsitewise.outputs.GatewayCapabilitySummary;
import io.pulumi.awsnative.iotsitewise.outputs.GatewayPlatform;
import io.pulumi.awsnative.iotsitewise.outputs.GatewayTag;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Resource schema for AWS::IoTSiteWise::Gateway
 * 
 */
@ResourceType(type="aws-native:iotsitewise:Gateway")
public class Gateway extends io.pulumi.resources.CustomResource {
    /**
     * A list of gateway capability summaries that each contain a namespace and status.
     * 
     */
    @Export(name="gatewayCapabilitySummaries", type=List.class, parameters={GatewayCapabilitySummary.class})
    private Output</* @Nullable */ List<GatewayCapabilitySummary>> gatewayCapabilitySummaries;

    /**
     * @return A list of gateway capability summaries that each contain a namespace and status.
     * 
     */
    public Output</* @Nullable */ List<GatewayCapabilitySummary>> getGatewayCapabilitySummaries() {
        return this.gatewayCapabilitySummaries;
    }
    /**
     * The ID of the gateway device.
     * 
     */
    @Export(name="gatewayId", type=String.class, parameters={})
    private Output<String> gatewayId;

    /**
     * @return The ID of the gateway device.
     * 
     */
    public Output<String> getGatewayId() {
        return this.gatewayId;
    }
    /**
     * A unique, friendly name for the gateway.
     * 
     */
    @Export(name="gatewayName", type=String.class, parameters={})
    private Output<String> gatewayName;

    /**
     * @return A unique, friendly name for the gateway.
     * 
     */
    public Output<String> getGatewayName() {
        return this.gatewayName;
    }
    /**
     * The gateway's platform. You can only specify one platform in a gateway.
     * 
     */
    @Export(name="gatewayPlatform", type=GatewayPlatform.class, parameters={})
    private Output<GatewayPlatform> gatewayPlatform;

    /**
     * @return The gateway's platform. You can only specify one platform in a gateway.
     * 
     */
    public Output<GatewayPlatform> getGatewayPlatform() {
        return this.gatewayPlatform;
    }
    /**
     * A list of key-value pairs that contain metadata for the gateway.
     * 
     */
    @Export(name="tags", type=List.class, parameters={GatewayTag.class})
    private Output</* @Nullable */ List<GatewayTag>> tags;

    /**
     * @return A list of key-value pairs that contain metadata for the gateway.
     * 
     */
    public Output</* @Nullable */ List<GatewayTag>> getTags() {
        return this.tags;
    }

    public interface BuilderApplicator {
        public void apply(GatewayArgs.Builder a);
    }
    private static io.pulumi.awsnative.iotsitewise.GatewayArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.awsnative.iotsitewise.GatewayArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Gateway(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Gateway(String name) {
        this(name, GatewayArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Gateway(String name, GatewayArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Gateway(String name, GatewayArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:iotsitewise:Gateway", name, args == null ? GatewayArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private Gateway(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:iotsitewise:Gateway", name, null, makeResourceOptions(options, id));
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
    public static Gateway get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Gateway(name, id, options);
    }
}
