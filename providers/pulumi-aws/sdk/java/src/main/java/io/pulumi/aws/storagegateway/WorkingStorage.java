// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.storagegateway;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.storagegateway.WorkingStorageArgs;
import io.pulumi.aws.storagegateway.inputs.WorkingStorageState;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Manages an AWS Storage Gateway working storage.
 * 
 * > **NOTE:** The Storage Gateway API provides no method to remove a working storage disk. Destroying this resource does not perform any Storage Gateway actions.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * `aws_storagegateway_working_storage` can be imported by using the gateway Amazon Resource Name (ARN) and local disk identifier separated with a colon (`:`), e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:storagegateway/workingStorage:WorkingStorage example arn:aws:storagegateway:us-east-1:123456789012:gateway/sgw-12345678:pci-0000:03:00.0-scsi-0:0:0:0
 * ```
 * 
 */
@ResourceType(type="aws:storagegateway/workingStorage:WorkingStorage")
public class WorkingStorage extends io.pulumi.resources.CustomResource {
    /**
     * Local disk identifier. For example, `pci-0000:03:00.0-scsi-0:0:0:0`.
     * 
     */
    @OutputExport(name="diskId", type=String.class, parameters={})
    private Output<String> diskId;

    /**
     * @return Local disk identifier. For example, `pci-0000:03:00.0-scsi-0:0:0:0`.
     * 
     */
    public Output<String> getDiskId() {
        return this.diskId;
    }
    /**
     * The Amazon Resource Name (ARN) of the gateway.
     * 
     */
    @OutputExport(name="gatewayArn", type=String.class, parameters={})
    private Output<String> gatewayArn;

    /**
     * @return The Amazon Resource Name (ARN) of the gateway.
     * 
     */
    public Output<String> getGatewayArn() {
        return this.gatewayArn;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public WorkingStorage(String name, WorkingStorageArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:storagegateway/workingStorage:WorkingStorage", name, args == null ? WorkingStorageArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private WorkingStorage(String name, Input<String> id, @Nullable WorkingStorageState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:storagegateway/workingStorage:WorkingStorage", name, state, makeResourceOptions(options, id));
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
    public static WorkingStorage get(String name, Input<String> id, @Nullable WorkingStorageState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new WorkingStorage(name, id, state, options);
    }
}
