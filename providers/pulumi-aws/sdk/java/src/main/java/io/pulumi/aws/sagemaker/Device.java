// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sagemaker;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.sagemaker.DeviceArgs;
import io.pulumi.aws.sagemaker.inputs.DeviceState;
import io.pulumi.aws.sagemaker.outputs.DeviceDevice;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a Sagemaker Device resource.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Sagemaker Devices can be imported using the `device-fleet-name/device-name`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:sagemaker/device:Device example my-fleet/my-device
 * ```
 * 
 */
@ResourceType(type="aws:sagemaker/device:Device")
public class Device extends io.pulumi.resources.CustomResource {
    @OutputExport(name="agentVersion", type=String.class, parameters={})
    private Output<String> agentVersion;

    public Output<String> getAgentVersion() {
        return this.agentVersion;
    }
    /**
     * The Amazon Resource Name (ARN) assigned by AWS to this Device.
     * 
     */
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) assigned by AWS to this Device.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * The device to register with SageMaker Edge Manager. See Device details below.
     * 
     */
    @OutputExport(name="device", type=DeviceDevice.class, parameters={})
    private Output<DeviceDevice> device;

    /**
     * @return The device to register with SageMaker Edge Manager. See Device details below.
     * 
     */
    public Output<DeviceDevice> getDevice() {
        return this.device;
    }
    /**
     * The name of the Device Fleet.
     * 
     */
    @OutputExport(name="deviceFleetName", type=String.class, parameters={})
    private Output<String> deviceFleetName;

    /**
     * @return The name of the Device Fleet.
     * 
     */
    public Output<String> getDeviceFleetName() {
        return this.deviceFleetName;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Device(String name, DeviceArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:sagemaker/device:Device", name, args == null ? DeviceArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Device(String name, Input<String> id, @Nullable DeviceState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:sagemaker/device:Device", name, state, makeResourceOptions(options, id));
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
    public static Device get(String name, Input<String> id, @Nullable DeviceState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Device(name, id, state, options);
    }
}
