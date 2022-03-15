// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.providerhub;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.providerhub.DefaultRolloutArgs;
import io.pulumi.azurenative.providerhub.outputs.DefaultRolloutResponseProperties;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Default rollout definition.
 * API Version: 2020-11-20.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:providerhub:DefaultRollout Microsoft.Contoso/2020week10 /subscriptions/ab7a8701-f7ef-471a-a2f4-d0ebbf494f77providers/Microsoft.ProviderHub/providerRegistrations/Microsoft.Contoso/defaultRollouts/2020week10 
 * ```
 * 
 */
@ResourceType(type="azure-native:providerhub:DefaultRollout")
public class DefaultRollout extends io.pulumi.resources.CustomResource {
    /**
     * The name of the resource
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the resource
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Properties of the rollout.
     * 
     */
    @Export(name="properties", type=DefaultRolloutResponseProperties.class, parameters={})
    private Output<DefaultRolloutResponseProperties> properties;

    /**
     * @return Properties of the rollout.
     * 
     */
    public Output<DefaultRolloutResponseProperties> getProperties() {
        return this.properties;
    }
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    public interface BuilderApplicator {
        public void apply(DefaultRolloutArgs.Builder a);
    }
    private static io.pulumi.azurenative.providerhub.DefaultRolloutArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.providerhub.DefaultRolloutArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public DefaultRollout(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DefaultRollout(String name) {
        this(name, DefaultRolloutArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DefaultRollout(String name, DefaultRolloutArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DefaultRollout(String name, DefaultRolloutArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:providerhub:DefaultRollout", name, args == null ? DefaultRolloutArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private DefaultRollout(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:providerhub:DefaultRollout", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Output.of(Alias.builder().setType("azure-native:providerhub/v20201120:DefaultRollout").build()),
                Output.of(Alias.builder().setType("azure-native:providerhub/v20210501preview:DefaultRollout").build()),
                Output.of(Alias.builder().setType("azure-native:providerhub/v20210601preview:DefaultRollout").build()),
                Output.of(Alias.builder().setType("azure-native:providerhub/v20210901preview:DefaultRollout").build())
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
    public static DefaultRollout get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new DefaultRollout(name, id, options);
    }
}
