// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.deploymentmanager;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.deploymentmanager.ArtifactSourceArgs;
import io.pulumi.azurenative.deploymentmanager.outputs.SasAuthenticationResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * The resource that defines the source location where the artifacts are located.
 * API Version: 2019-11-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:deploymentmanager:ArtifactSource myArtifactSource /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.DeploymentManager/artifactSources/{artifactSourceName} 
 * ```
 * 
 */
@ResourceType(type="azure-native:deploymentmanager:ArtifactSource")
public class ArtifactSource extends io.pulumi.resources.CustomResource {
    /**
     * The path from the location that the 'authentication' property [say, a SAS URI to the blob container] refers to, to the location of the artifacts. This can be used to differentiate different versions of the artifacts. Or, different types of artifacts like binaries or templates. The location referenced by the authentication property concatenated with this optional artifactRoot path forms the artifact source location where the artifacts are expected to be found.
     * 
     */
    @OutputExport(name="artifactRoot", type=String.class, parameters={})
    private Output</* @Nullable */ String> artifactRoot;

    /**
     * @return The path from the location that the 'authentication' property [say, a SAS URI to the blob container] refers to, to the location of the artifacts. This can be used to differentiate different versions of the artifacts. Or, different types of artifacts like binaries or templates. The location referenced by the authentication property concatenated with this optional artifactRoot path forms the artifact source location where the artifacts are expected to be found.
     * 
     */
    public Output</* @Nullable */ String> getArtifactRoot() {
        return this.artifactRoot;
    }
    /**
     * The authentication method to use to access the artifact source.
     * 
     */
    @OutputExport(name="authentication", type=SasAuthenticationResponse.class, parameters={})
    private Output<SasAuthenticationResponse> authentication;

    /**
     * @return The authentication method to use to access the artifact source.
     * 
     */
    public Output<SasAuthenticationResponse> getAuthentication() {
        return this.authentication;
    }
    /**
     * The geo-location where the resource lives
     * 
     */
    @OutputExport(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return The geo-location where the resource lives
     * 
     */
    public Output<String> getLocation() {
        return this.location;
    }
    /**
     * The name of the resource
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the resource
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The type of artifact source used.
     * 
     */
    @OutputExport(name="sourceType", type=String.class, parameters={})
    private Output<String> sourceType;

    /**
     * @return The type of artifact source used.
     * 
     */
    public Output<String> getSourceType() {
        return this.sourceType;
    }
    /**
     * Resource tags.
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Resource tags.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
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
    public ArtifactSource(String name, ArtifactSourceArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:deploymentmanager:ArtifactSource", name, args == null ? ArtifactSourceArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private ArtifactSource(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:deploymentmanager:ArtifactSource", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:deploymentmanager/v20180901preview:ArtifactSource").build()),
                Input.of(Alias.builder().setType("azure-native:deploymentmanager/v20191101preview:ArtifactSource").build())
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
    public static ArtifactSource get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ArtifactSource(name, id, options);
    }
}
