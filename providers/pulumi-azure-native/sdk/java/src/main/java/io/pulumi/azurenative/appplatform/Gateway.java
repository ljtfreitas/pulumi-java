// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.appplatform;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.appplatform.GatewayArgs;
import io.pulumi.azurenative.appplatform.outputs.GatewayPropertiesResponse;
import io.pulumi.azurenative.appplatform.outputs.SkuResponse;
import io.pulumi.azurenative.appplatform.outputs.SystemDataResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Spring Cloud Gateway resource
 * API Version: 2022-01-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:appplatform:Gateway default /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/myResourceGroup/providers/Microsoft.AppPlatform/Spring/myservice/gateways/default 
 * ```
 * 
 */
@ResourceType(type="azure-native:appplatform:Gateway")
public class Gateway extends io.pulumi.resources.CustomResource {
    /**
     * The name of the resource.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the resource.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Spring Cloud Gateway properties payload
     * 
     */
    @Export(name="properties", type=GatewayPropertiesResponse.class, parameters={})
    private Output<GatewayPropertiesResponse> properties;

    /**
     * @return Spring Cloud Gateway properties payload
     * 
     */
    public Output<GatewayPropertiesResponse> getProperties() {
        return this.properties;
    }
    /**
     * Sku of the Spring Cloud Gateway resource
     * 
     */
    @Export(name="sku", type=SkuResponse.class, parameters={})
    private Output</* @Nullable */ SkuResponse> sku;

    /**
     * @return Sku of the Spring Cloud Gateway resource
     * 
     */
    public Output</* @Nullable */ SkuResponse> getSku() {
        return this.sku;
    }
    /**
     * Metadata pertaining to creation and last modification of the resource.
     * 
     */
    @Export(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return Metadata pertaining to creation and last modification of the resource.
     * 
     */
    public Output<SystemDataResponse> getSystemData() {
        return this.systemData;
    }
    /**
     * The type of the resource.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    public interface BuilderApplicator {
        public void apply(GatewayArgs.Builder a);
    }
    private static io.pulumi.azurenative.appplatform.GatewayArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.appplatform.GatewayArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Gateway(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Gateway(String name) {
        this(name, GatewayArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Gateway(String name, GatewayArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Gateway(String name, GatewayArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:appplatform:Gateway", name, args == null ? GatewayArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private Gateway(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:appplatform:Gateway", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Output.of(Alias.builder().setType("azure-native:appplatform/v20220101preview:Gateway").build())
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
    public static Gateway get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Gateway(name, id, options);
    }
}
