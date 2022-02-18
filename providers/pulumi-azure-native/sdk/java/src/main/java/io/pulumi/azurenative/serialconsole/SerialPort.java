// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.serialconsole;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.serialconsole.SerialPortArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Represents the serial port of the parent resource.
 * API Version: 2018-05-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:serialconsole:SerialPort 0 /subscriptions/00000000-00000-0000-0000-000000000000/resourcegroups/myResourceGroup/providers/Microsoft.Compute/virtualMachines/myVM/providers/Microsoft.SerialConsole/serialPorts/0 
 * ```
 * 
 */
@ResourceType(type="azure-native:serialconsole:SerialPort")
public class SerialPort extends io.pulumi.resources.CustomResource {
    /**
     * Resource name
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Specifies whether the port is enabled for a serial console connection.
     * 
     */
    @OutputExport(name="state", type=String.class, parameters={})
    private Output</* @Nullable */ String> state;

    /**
     * @return Specifies whether the port is enabled for a serial console connection.
     * 
     */
    public Output</* @Nullable */ String> getState() {
        return this.state;
    }
    /**
     * Resource type
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SerialPort(String name, SerialPortArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:serialconsole:SerialPort", name, args == null ? SerialPortArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private SerialPort(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:serialconsole:SerialPort", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:serialconsole/v20180501:SerialPort").build())
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
    public static SerialPort get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new SerialPort(name, id, options);
    }
}
