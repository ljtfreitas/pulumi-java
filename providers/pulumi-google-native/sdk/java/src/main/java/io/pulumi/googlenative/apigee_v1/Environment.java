// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigee_v1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.apigee_v1.EnvironmentArgs;
import io.pulumi.googlenative.apigee_v1.outputs.GoogleCloudApigeeV1PropertiesResponse;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Creates an environment in an organization.
 * 
 */
@ResourceType(type="google-native:apigee/v1:Environment")
public class Environment extends io.pulumi.resources.CustomResource {
    /**
     * Optional. API Proxy type supported by the environment. The type can be set when creating the Environment and cannot be changed.
     * 
     */
    @Export(name="apiProxyType", type=String.class, parameters={})
    private Output<String> apiProxyType;

    /**
     * @return Optional. API Proxy type supported by the environment. The type can be set when creating the Environment and cannot be changed.
     * 
     */
    public Output<String> getApiProxyType() {
        return this.apiProxyType;
    }
    /**
     * Creation time of this environment as milliseconds since epoch.
     * 
     */
    @Export(name="createdAt", type=String.class, parameters={})
    private Output<String> createdAt;

    /**
     * @return Creation time of this environment as milliseconds since epoch.
     * 
     */
    public Output<String> getCreatedAt() {
        return this.createdAt;
    }
    /**
     * Optional. Deployment type supported by the environment. The deployment type can be set when creating the environment and cannot be changed. When you enable archive deployment, you will be **prevented from performing** a [subset of actions](/apigee/docs/api-platform/local-development/overview#prevented-actions) within the environment, including: * Managing the deployment of API proxy or shared flow revisions * Creating, updating, or deleting resource files * Creating, updating, or deleting target servers
     * 
     */
    @Export(name="deploymentType", type=String.class, parameters={})
    private Output<String> deploymentType;

    /**
     * @return Optional. Deployment type supported by the environment. The deployment type can be set when creating the environment and cannot be changed. When you enable archive deployment, you will be **prevented from performing** a [subset of actions](/apigee/docs/api-platform/local-development/overview#prevented-actions) within the environment, including: * Managing the deployment of API proxy or shared flow revisions * Creating, updating, or deleting resource files * Creating, updating, or deleting target servers
     * 
     */
    public Output<String> getDeploymentType() {
        return this.deploymentType;
    }
    /**
     * Optional. Description of the environment.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return Optional. Description of the environment.
     * 
     */
    public Output<String> getDescription() {
        return this.description;
    }
    /**
     * Optional. Display name for this environment.
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return Optional. Display name for this environment.
     * 
     */
    public Output<String> getDisplayName() {
        return this.displayName;
    }
    /**
     * Last modification time of this environment as milliseconds since epoch.
     * 
     */
    @Export(name="lastModifiedAt", type=String.class, parameters={})
    private Output<String> lastModifiedAt;

    /**
     * @return Last modification time of this environment as milliseconds since epoch.
     * 
     */
    public Output<String> getLastModifiedAt() {
        return this.lastModifiedAt;
    }
    /**
     * Name of the environment. Values must match the regular expression `^[.\\p{Alnum}-_]{1,255}$`
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the environment. Values must match the regular expression `^[.\\p{Alnum}-_]{1,255}$`
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Optional. Key-value pairs that may be used for customizing the environment.
     * 
     */
    @Export(name="properties", type=GoogleCloudApigeeV1PropertiesResponse.class, parameters={})
    private Output<GoogleCloudApigeeV1PropertiesResponse> properties;

    /**
     * @return Optional. Key-value pairs that may be used for customizing the environment.
     * 
     */
    public Output<GoogleCloudApigeeV1PropertiesResponse> getProperties() {
        return this.properties;
    }
    /**
     * State of the environment. Values other than ACTIVE means the resource is not ready to use.
     * 
     */
    @Export(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return State of the environment. Values other than ACTIVE means the resource is not ready to use.
     * 
     */
    public Output<String> getState() {
        return this.state;
    }

    public interface BuilderApplicator {
        public void apply(EnvironmentArgs.Builder a);
    }
    private static io.pulumi.googlenative.apigee_v1.EnvironmentArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.googlenative.apigee_v1.EnvironmentArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Environment(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Environment(String name) {
        this(name, EnvironmentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Environment(String name, EnvironmentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Environment(String name, EnvironmentArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:apigee/v1:Environment", name, args == null ? EnvironmentArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private Environment(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:apigee/v1:Environment", name, null, makeResourceOptions(options, id));
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
    public static Environment get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Environment(name, id, options);
    }
}
