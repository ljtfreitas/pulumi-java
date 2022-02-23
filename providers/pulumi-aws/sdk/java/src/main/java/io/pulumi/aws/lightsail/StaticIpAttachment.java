// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.lightsail;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.lightsail.StaticIpAttachmentArgs;
import io.pulumi.aws.lightsail.inputs.StaticIpAttachmentState;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a static IP address attachment - relationship between a Lightsail static IP & Lightsail instance.
 * 
 * > **Note:** Lightsail is currently only supported in a limited number of AWS Regions, please see ["Regions and Availability Zones in Amazon Lightsail"](https://lightsail.aws.amazon.com/ls/docs/overview/article/understanding-regions-and-availability-zones-in-amazon-lightsail) for more details
 * 
 * ## Example Usage
 * 
 */
@ResourceType(type="aws:lightsail/staticIpAttachment:StaticIpAttachment")
public class StaticIpAttachment extends io.pulumi.resources.CustomResource {
    /**
     * The name of the Lightsail instance to attach the IP to
     * 
     */
    @OutputExport(name="instanceName", type=String.class, parameters={})
    private Output<String> instanceName;

    /**
     * @return The name of the Lightsail instance to attach the IP to
     * 
     */
    public Output<String> getInstanceName() {
        return this.instanceName;
    }
    /**
     * The allocated static IP address
     * 
     */
    @OutputExport(name="ipAddress", type=String.class, parameters={})
    private Output<String> ipAddress;

    /**
     * @return The allocated static IP address
     * 
     */
    public Output<String> getIpAddress() {
        return this.ipAddress;
    }
    /**
     * The name of the allocated static IP
     * 
     */
    @OutputExport(name="staticIpName", type=String.class, parameters={})
    private Output<String> staticIpName;

    /**
     * @return The name of the allocated static IP
     * 
     */
    public Output<String> getStaticIpName() {
        return this.staticIpName;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public StaticIpAttachment(String name, StaticIpAttachmentArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:lightsail/staticIpAttachment:StaticIpAttachment", name, args == null ? StaticIpAttachmentArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private StaticIpAttachment(String name, Input<String> id, @Nullable StaticIpAttachmentState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:lightsail/staticIpAttachment:StaticIpAttachment", name, state, makeResourceOptions(options, id));
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
    public static StaticIpAttachment get(String name, Input<String> id, @Nullable StaticIpAttachmentState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new StaticIpAttachment(name, id, state, options);
    }
}