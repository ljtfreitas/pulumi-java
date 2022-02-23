// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.directconnect;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.directconnect.GatewayArgs;
import io.pulumi.aws.directconnect.inputs.GatewayState;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a Direct Connect Gateway.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Direct Connect Gateways can be imported using the `gateway id`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:directconnect/gateway:Gateway test abcd1234-dcba-5678-be23-cdef9876ab45
 * ```
 * 
 */
@ResourceType(type="aws:directconnect/gateway:Gateway")
public class Gateway extends io.pulumi.resources.CustomResource {
    /**
     * The ASN to be configured on the Amazon side of the connection. The ASN must be in the private range of 64,512 to 65,534 or 4,200,000,000 to 4,294,967,294.
     * 
     */
    @OutputExport(name="amazonSideAsn", type=String.class, parameters={})
    private Output<String> amazonSideAsn;

    /**
     * @return The ASN to be configured on the Amazon side of the connection. The ASN must be in the private range of 64,512 to 65,534 or 4,200,000,000 to 4,294,967,294.
     * 
     */
    public Output<String> getAmazonSideAsn() {
        return this.amazonSideAsn;
    }
    /**
     * The name of the connection.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the connection.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * AWS Account ID of the gateway.
     * 
     */
    @OutputExport(name="ownerAccountId", type=String.class, parameters={})
    private Output<String> ownerAccountId;

    /**
     * @return AWS Account ID of the gateway.
     * 
     */
    public Output<String> getOwnerAccountId() {
        return this.ownerAccountId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Gateway(String name, GatewayArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:directconnect/gateway:Gateway", name, args == null ? GatewayArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Gateway(String name, Input<String> id, @Nullable GatewayState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:directconnect/gateway:Gateway", name, state, makeResourceOptions(options, id));
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
    public static Gateway get(String name, Input<String> id, @Nullable GatewayState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Gateway(name, id, state, options);
    }
}
