// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.apigateway;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.apigateway.DeploymentArgs;
import io.pulumi.awsnative.apigateway.outputs.DeploymentCanarySettings;
import io.pulumi.awsnative.apigateway.outputs.DeploymentStageDescription;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Resource Type definition for AWS::ApiGateway::Deployment
 * 
 */
@ResourceType(type="aws-native:apigateway:Deployment")
public class Deployment extends io.pulumi.resources.CustomResource {
    /**
     * Specifies settings for the canary deployment.
     * 
     */
    @Export(name="deploymentCanarySettings", type=DeploymentCanarySettings.class, parameters={})
    private Output</* @Nullable */ DeploymentCanarySettings> deploymentCanarySettings;

    /**
     * @return Specifies settings for the canary deployment.
     * 
     */
    public Output</* @Nullable */ DeploymentCanarySettings> getDeploymentCanarySettings() {
        return this.deploymentCanarySettings;
    }
    /**
     * Primary Id for this resource
     * 
     */
    @Export(name="deploymentId", type=String.class, parameters={})
    private Output<String> deploymentId;

    /**
     * @return Primary Id for this resource
     * 
     */
    public Output<String> getDeploymentId() {
        return this.deploymentId;
    }
    /**
     * A description of the purpose of the API Gateway deployment.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return A description of the purpose of the API Gateway deployment.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * The ID of the RestApi resource to deploy.
     * 
     */
    @Export(name="restApiId", type=String.class, parameters={})
    private Output<String> restApiId;

    /**
     * @return The ID of the RestApi resource to deploy.
     * 
     */
    public Output<String> getRestApiId() {
        return this.restApiId;
    }
    /**
     * Configures the stage that API Gateway creates with this deployment.
     * 
     */
    @Export(name="stageDescription", type=DeploymentStageDescription.class, parameters={})
    private Output</* @Nullable */ DeploymentStageDescription> stageDescription;

    /**
     * @return Configures the stage that API Gateway creates with this deployment.
     * 
     */
    public Output</* @Nullable */ DeploymentStageDescription> getStageDescription() {
        return this.stageDescription;
    }
    /**
     * A name for the stage that API Gateway creates with this deployment. Use only alphanumeric characters.
     * 
     */
    @Export(name="stageName", type=String.class, parameters={})
    private Output</* @Nullable */ String> stageName;

    /**
     * @return A name for the stage that API Gateway creates with this deployment. Use only alphanumeric characters.
     * 
     */
    public Output</* @Nullable */ String> getStageName() {
        return this.stageName;
    }

    public interface BuilderApplicator {
        public void apply(DeploymentArgs.Builder a);
    }
    private static io.pulumi.awsnative.apigateway.DeploymentArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.awsnative.apigateway.DeploymentArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Deployment(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Deployment(String name) {
        this(name, DeploymentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Deployment(String name, DeploymentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Deployment(String name, DeploymentArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:apigateway:Deployment", name, args == null ? DeploymentArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private Deployment(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:apigateway:Deployment", name, null, makeResourceOptions(options, id));
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
    public static Deployment get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Deployment(name, id, options);
    }
}
