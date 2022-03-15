// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.sagemaker.DeviceFleetArgs;
import io.pulumi.awsnative.sagemaker.outputs.DeviceFleetEdgeOutputConfig;
import io.pulumi.awsnative.sagemaker.outputs.DeviceFleetTag;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Resource schema for AWS::SageMaker::DeviceFleet
 * 
 */
@ResourceType(type="aws-native:sagemaker:DeviceFleet")
public class DeviceFleet extends io.pulumi.resources.CustomResource {
    /**
     * Description for the edge device fleet
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return Description for the edge device fleet
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * The name of the edge device fleet
     * 
     */
    @Export(name="deviceFleetName", type=String.class, parameters={})
    private Output<String> deviceFleetName;

    /**
     * @return The name of the edge device fleet
     * 
     */
    public Output<String> getDeviceFleetName() {
        return this.deviceFleetName;
    }
    /**
     * S3 bucket and an ecryption key id (if available) to store outputs for the fleet
     * 
     */
    @Export(name="outputConfig", type=DeviceFleetEdgeOutputConfig.class, parameters={})
    private Output<DeviceFleetEdgeOutputConfig> outputConfig;

    /**
     * @return S3 bucket and an ecryption key id (if available) to store outputs for the fleet
     * 
     */
    public Output<DeviceFleetEdgeOutputConfig> getOutputConfig() {
        return this.outputConfig;
    }
    /**
     * Role associated with the device fleet
     * 
     */
    @Export(name="roleArn", type=String.class, parameters={})
    private Output<String> roleArn;

    /**
     * @return Role associated with the device fleet
     * 
     */
    public Output<String> getRoleArn() {
        return this.roleArn;
    }
    /**
     * Associate tags with the resource
     * 
     */
    @Export(name="tags", type=List.class, parameters={DeviceFleetTag.class})
    private Output</* @Nullable */ List<DeviceFleetTag>> tags;

    /**
     * @return Associate tags with the resource
     * 
     */
    public Output</* @Nullable */ List<DeviceFleetTag>> getTags() {
        return this.tags;
    }

    public interface BuilderApplicator {
        public void apply(DeviceFleetArgs.Builder a);
    }
    private static io.pulumi.awsnative.sagemaker.DeviceFleetArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.awsnative.sagemaker.DeviceFleetArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public DeviceFleet(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DeviceFleet(String name) {
        this(name, DeviceFleetArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DeviceFleet(String name, DeviceFleetArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DeviceFleet(String name, DeviceFleetArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:sagemaker:DeviceFleet", name, args == null ? DeviceFleetArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private DeviceFleet(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:sagemaker:DeviceFleet", name, null, makeResourceOptions(options, id));
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
    public static DeviceFleet get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new DeviceFleet(name, id, options);
    }
}
