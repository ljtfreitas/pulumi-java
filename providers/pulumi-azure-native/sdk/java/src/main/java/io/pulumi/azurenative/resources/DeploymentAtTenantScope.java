// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.resources;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.resources.DeploymentAtTenantScopeArgs;
import io.pulumi.azurenative.resources.outputs.DeploymentPropertiesExtendedResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Deployment information.
 * API Version: 2021-01-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:resources:DeploymentAtTenantScope tenant-dep01 /providers/Microsoft.Resources/deployments/tenant-dep01 
 * ```
 * 
 */
@ResourceType(type="azure-native:resources:DeploymentAtTenantScope")
public class DeploymentAtTenantScope extends io.pulumi.resources.CustomResource {
    /**
     * the location of the deployment.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return the location of the deployment.
     * 
     */
    public Output</* @Nullable */ String> getLocation() {
        return this.location;
    }
    /**
     * The name of the deployment.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the deployment.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Deployment properties.
     * 
     */
    @Export(name="properties", type=DeploymentPropertiesExtendedResponse.class, parameters={})
    private Output<DeploymentPropertiesExtendedResponse> properties;

    /**
     * @return Deployment properties.
     * 
     */
    public Output<DeploymentPropertiesExtendedResponse> getProperties() {
        return this.properties;
    }
    /**
     * Deployment tags
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Deployment tags
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * The type of the deployment.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the deployment.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    public interface BuilderApplicator {
        public void apply(DeploymentAtTenantScopeArgs.Builder a);
    }
    private static io.pulumi.azurenative.resources.DeploymentAtTenantScopeArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.resources.DeploymentAtTenantScopeArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public DeploymentAtTenantScope(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DeploymentAtTenantScope(String name) {
        this(name, DeploymentAtTenantScopeArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DeploymentAtTenantScope(String name, DeploymentAtTenantScopeArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DeploymentAtTenantScope(String name, DeploymentAtTenantScopeArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:resources:DeploymentAtTenantScope", name, args == null ? DeploymentAtTenantScopeArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private DeploymentAtTenantScope(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:resources:DeploymentAtTenantScope", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Output.of(Alias.builder().setType("azure-native:resources/v20190701:DeploymentAtTenantScope").build()),
                Output.of(Alias.builder().setType("azure-native:resources/v20190801:DeploymentAtTenantScope").build()),
                Output.of(Alias.builder().setType("azure-native:resources/v20191001:DeploymentAtTenantScope").build()),
                Output.of(Alias.builder().setType("azure-native:resources/v20200601:DeploymentAtTenantScope").build()),
                Output.of(Alias.builder().setType("azure-native:resources/v20200801:DeploymentAtTenantScope").build()),
                Output.of(Alias.builder().setType("azure-native:resources/v20201001:DeploymentAtTenantScope").build()),
                Output.of(Alias.builder().setType("azure-native:resources/v20210101:DeploymentAtTenantScope").build()),
                Output.of(Alias.builder().setType("azure-native:resources/v20210401:DeploymentAtTenantScope").build())
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
    public static DeploymentAtTenantScope get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new DeploymentAtTenantScope(name, id, options);
    }
}
