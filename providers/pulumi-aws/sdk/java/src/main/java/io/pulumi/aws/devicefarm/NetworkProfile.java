// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.devicefarm;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.devicefarm.NetworkProfileArgs;
import io.pulumi.aws.devicefarm.inputs.NetworkProfileState;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides a resource to manage AWS Device Farm Network Profiles.
 * ∂
 * > **NOTE:** AWS currently has limited regional support for Device Farm (e.g., `us-west-2`). See [AWS Device Farm endpoints and quotas](https://docs.aws.amazon.com/general/latest/gr/devicefarm.html) for information on supported regions.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * DeviceFarm Network Profiles can be imported by their arn
 * 
 * ```sh
 *  $ pulumi import aws:devicefarm/networkProfile:NetworkProfile example arn:aws:devicefarm:us-west-2:123456789012:networkprofile:4fa784c7-ccb4-4dbf-ba4f-02198320daa1
 * ```
 * 
 */
@ResourceType(type="aws:devicefarm/networkProfile:NetworkProfile")
public class NetworkProfile extends io.pulumi.resources.CustomResource {
    /**
     * The Amazon Resource Name of this network profile.
     * 
     */
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The Amazon Resource Name of this network profile.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * The description of the network profile.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of the network profile.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * The data throughput rate in bits per second, as an integer from `0` to `104857600`. Default value is `104857600`.
     * 
     */
    @OutputExport(name="downlinkBandwidthBits", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> downlinkBandwidthBits;

    /**
     * @return The data throughput rate in bits per second, as an integer from `0` to `104857600`. Default value is `104857600`.
     * 
     */
    public Output</* @Nullable */ Integer> getDownlinkBandwidthBits() {
        return this.downlinkBandwidthBits;
    }
    /**
     * Delay time for all packets to destination in milliseconds as an integer from `0` to `2000`.
     * 
     */
    @OutputExport(name="downlinkDelayMs", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> downlinkDelayMs;

    /**
     * @return Delay time for all packets to destination in milliseconds as an integer from `0` to `2000`.
     * 
     */
    public Output</* @Nullable */ Integer> getDownlinkDelayMs() {
        return this.downlinkDelayMs;
    }
    /**
     * Time variation in the delay of received packets in milliseconds as an integer from `0` to `2000`.
     * 
     */
    @OutputExport(name="downlinkJitterMs", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> downlinkJitterMs;

    /**
     * @return Time variation in the delay of received packets in milliseconds as an integer from `0` to `2000`.
     * 
     */
    public Output</* @Nullable */ Integer> getDownlinkJitterMs() {
        return this.downlinkJitterMs;
    }
    /**
     * Proportion of received packets that fail to arrive from `0` to `100` percent.
     * 
     */
    @OutputExport(name="downlinkLossPercent", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> downlinkLossPercent;

    /**
     * @return Proportion of received packets that fail to arrive from `0` to `100` percent.
     * 
     */
    public Output</* @Nullable */ Integer> getDownlinkLossPercent() {
        return this.downlinkLossPercent;
    }
    /**
     * The name for the network profile.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name for the network profile.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The ARN of the project for the network profile.
     * 
     */
    @OutputExport(name="projectArn", type=String.class, parameters={})
    private Output<String> projectArn;

    /**
     * @return The ARN of the project for the network profile.
     * 
     */
    public Output<String> getProjectArn() {
        return this.projectArn;
    }
    /**
     * A map of tags to assign to the resource. If configured with a provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource. If configured with a provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block).
     * 
     */
    @OutputExport(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block).
     * 
     */
    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll;
    }
    /**
     * The type of network profile to create. Valid values are listed are `PRIVATE` and `CURATED`.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output</* @Nullable */ String> type;

    /**
     * @return The type of network profile to create. Valid values are listed are `PRIVATE` and `CURATED`.
     * 
     */
    public Output</* @Nullable */ String> getType() {
        return this.type;
    }
    /**
     * The data throughput rate in bits per second, as an integer from `0` to `104857600`. Default value is `104857600`.
     * 
     */
    @OutputExport(name="uplinkBandwidthBits", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> uplinkBandwidthBits;

    /**
     * @return The data throughput rate in bits per second, as an integer from `0` to `104857600`. Default value is `104857600`.
     * 
     */
    public Output</* @Nullable */ Integer> getUplinkBandwidthBits() {
        return this.uplinkBandwidthBits;
    }
    /**
     * Delay time for all packets to destination in milliseconds as an integer from `0` to `2000`.
     * 
     */
    @OutputExport(name="uplinkDelayMs", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> uplinkDelayMs;

    /**
     * @return Delay time for all packets to destination in milliseconds as an integer from `0` to `2000`.
     * 
     */
    public Output</* @Nullable */ Integer> getUplinkDelayMs() {
        return this.uplinkDelayMs;
    }
    /**
     * Time variation in the delay of received packets in milliseconds as an integer from `0` to `2000`.
     * 
     */
    @OutputExport(name="uplinkJitterMs", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> uplinkJitterMs;

    /**
     * @return Time variation in the delay of received packets in milliseconds as an integer from `0` to `2000`.
     * 
     */
    public Output</* @Nullable */ Integer> getUplinkJitterMs() {
        return this.uplinkJitterMs;
    }
    /**
     * Proportion of received packets that fail to arrive from `0` to `100` percent.
     * 
     */
    @OutputExport(name="uplinkLossPercent", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> uplinkLossPercent;

    /**
     * @return Proportion of received packets that fail to arrive from `0` to `100` percent.
     * 
     */
    public Output</* @Nullable */ Integer> getUplinkLossPercent() {
        return this.uplinkLossPercent;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public NetworkProfile(String name, NetworkProfileArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:devicefarm/networkProfile:NetworkProfile", name, args == null ? NetworkProfileArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private NetworkProfile(String name, Input<String> id, @Nullable NetworkProfileState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:devicefarm/networkProfile:NetworkProfile", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
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
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static NetworkProfile get(String name, Input<String> id, @Nullable NetworkProfileState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new NetworkProfile(name, id, state, options);
    }
}
