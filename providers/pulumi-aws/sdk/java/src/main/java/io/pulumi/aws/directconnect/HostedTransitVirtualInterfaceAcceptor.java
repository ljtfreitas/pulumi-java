// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.directconnect;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.directconnect.HostedTransitVirtualInterfaceAcceptorArgs;
import io.pulumi.aws.directconnect.inputs.HostedTransitVirtualInterfaceAcceptorState;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides a resource to manage the accepter's side of a Direct Connect hosted transit virtual interface.
 * This resource accepts ownership of a transit virtual interface created by another AWS account.
 * 
 * > **NOTE:** AWS allows a Direct Connect hosted transit virtual interface to be deleted from either the allocator's or accepter's side. However, this provider only allows the Direct Connect hosted transit virtual interface to be deleted from the allocator's side by removing the corresponding `aws.directconnect.HostedTransitVirtualInterface` resource from your configuration. Removing a `aws.directconnect.HostedTransitVirtualInterfaceAcceptor` resource from your configuration will remove it from your statefile and management, **but will not delete the Direct Connect virtual interface.**
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Direct Connect hosted transit virtual interfaces can be imported using the `vif id`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:directconnect/hostedTransitVirtualInterfaceAcceptor:HostedTransitVirtualInterfaceAcceptor test dxvif-33cc44dd
 * ```
 * 
 */
@ResourceType(type="aws:directconnect/hostedTransitVirtualInterfaceAcceptor:HostedTransitVirtualInterfaceAcceptor")
public class HostedTransitVirtualInterfaceAcceptor extends io.pulumi.resources.CustomResource {
    /**
     * The ARN of the virtual interface.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The ARN of the virtual interface.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * The ID of the Direct Connect gateway to which to connect the virtual interface.
     * 
     */
    @Export(name="dxGatewayId", type=String.class, parameters={})
    private Output<String> dxGatewayId;

    /**
     * @return The ID of the Direct Connect gateway to which to connect the virtual interface.
     * 
     */
    public Output<String> getDxGatewayId() {
        return this.dxGatewayId;
    }
    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Export(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll;
    }
    /**
     * The ID of the Direct Connect virtual interface to accept.
     * 
     */
    @Export(name="virtualInterfaceId", type=String.class, parameters={})
    private Output<String> virtualInterfaceId;

    /**
     * @return The ID of the Direct Connect virtual interface to accept.
     * 
     */
    public Output<String> getVirtualInterfaceId() {
        return this.virtualInterfaceId;
    }

    public interface BuilderApplicator {
        public void apply(HostedTransitVirtualInterfaceAcceptorArgs.Builder a);
    }
    private static io.pulumi.aws.directconnect.HostedTransitVirtualInterfaceAcceptorArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.directconnect.HostedTransitVirtualInterfaceAcceptorArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public HostedTransitVirtualInterfaceAcceptor(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public HostedTransitVirtualInterfaceAcceptor(String name) {
        this(name, HostedTransitVirtualInterfaceAcceptorArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public HostedTransitVirtualInterfaceAcceptor(String name, HostedTransitVirtualInterfaceAcceptorArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public HostedTransitVirtualInterfaceAcceptor(String name, HostedTransitVirtualInterfaceAcceptorArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:directconnect/hostedTransitVirtualInterfaceAcceptor:HostedTransitVirtualInterfaceAcceptor", name, args == null ? HostedTransitVirtualInterfaceAcceptorArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private HostedTransitVirtualInterfaceAcceptor(String name, Output<String> id, @Nullable HostedTransitVirtualInterfaceAcceptorState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:directconnect/hostedTransitVirtualInterfaceAcceptor:HostedTransitVirtualInterfaceAcceptor", name, state, makeResourceOptions(options, id));
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
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static HostedTransitVirtualInterfaceAcceptor get(String name, Output<String> id, @Nullable HostedTransitVirtualInterfaceAcceptorState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new HostedTransitVirtualInterfaceAcceptor(name, id, state, options);
    }
}
