// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cfg;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.cfg.RecorderStatusArgs;
import io.pulumi.aws.cfg.inputs.RecorderStatusState;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Manages status (recording / stopped) of an AWS Config Configuration Recorder.
 * 
 * > **Note:** Starting Configuration Recorder requires a `Delivery Channel` to be present. Use of `depends_on` (as shown below) is recommended to avoid race conditions.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Configuration Recorder Status can be imported using the name of the Configuration Recorder, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:cfg/recorderStatus:RecorderStatus foo example
 * ```
 * 
 */
@ResourceType(type="aws:cfg/recorderStatus:RecorderStatus")
public class RecorderStatus extends io.pulumi.resources.CustomResource {
    /**
     * Whether the configuration recorder should be enabled or disabled.
     * 
     */
    @OutputExport(name="isEnabled", type=Boolean.class, parameters={})
    private Output<Boolean> isEnabled;

    /**
     * @return Whether the configuration recorder should be enabled or disabled.
     * 
     */
    public Output<Boolean> getIsEnabled() {
        return this.isEnabled;
    }
    /**
     * The name of the recorder
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the recorder
     * 
     */
    public Output<String> getName() {
        return this.name;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RecorderStatus(String name, RecorderStatusArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:cfg/recorderStatus:RecorderStatus", name, args == null ? RecorderStatusArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private RecorderStatus(String name, Input<String> id, @Nullable RecorderStatusState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:cfg/recorderStatus:RecorderStatus", name, state, makeResourceOptions(options, id));
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
    public static RecorderStatus get(String name, Input<String> id, @Nullable RecorderStatusState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new RecorderStatus(name, id, state, options);
    }
}
