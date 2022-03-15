// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.apigateway;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.apigateway.StageArgs;
import io.pulumi.awsnative.apigateway.outputs.StageAccessLogSetting;
import io.pulumi.awsnative.apigateway.outputs.StageCanarySetting;
import io.pulumi.awsnative.apigateway.outputs.StageMethodSetting;
import io.pulumi.awsnative.apigateway.outputs.StageTag;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Resource Type definition for AWS::ApiGateway::Stage
 * 
 */
@ResourceType(type="aws-native:apigateway:Stage")
public class Stage extends io.pulumi.resources.CustomResource {
    /**
     * Specifies settings for logging access in this stage.
     * 
     */
    @Export(name="accessLogSetting", type=StageAccessLogSetting.class, parameters={})
    private Output</* @Nullable */ StageAccessLogSetting> accessLogSetting;

    /**
     * @return Specifies settings for logging access in this stage.
     * 
     */
    public Output</* @Nullable */ StageAccessLogSetting> getAccessLogSetting() {
        return this.accessLogSetting;
    }
    /**
     * Indicates whether cache clustering is enabled for the stage.
     * 
     */
    @Export(name="cacheClusterEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> cacheClusterEnabled;

    /**
     * @return Indicates whether cache clustering is enabled for the stage.
     * 
     */
    public Output</* @Nullable */ Boolean> getCacheClusterEnabled() {
        return this.cacheClusterEnabled;
    }
    /**
     * The stage's cache cluster size.
     * 
     */
    @Export(name="cacheClusterSize", type=String.class, parameters={})
    private Output</* @Nullable */ String> cacheClusterSize;

    /**
     * @return The stage's cache cluster size.
     * 
     */
    public Output</* @Nullable */ String> getCacheClusterSize() {
        return this.cacheClusterSize;
    }
    /**
     * Specifies settings for the canary deployment in this stage.
     * 
     */
    @Export(name="canarySetting", type=StageCanarySetting.class, parameters={})
    private Output</* @Nullable */ StageCanarySetting> canarySetting;

    /**
     * @return Specifies settings for the canary deployment in this stage.
     * 
     */
    public Output</* @Nullable */ StageCanarySetting> getCanarySetting() {
        return this.canarySetting;
    }
    /**
     * The ID of the client certificate that API Gateway uses to call your integration endpoints in the stage.
     * 
     */
    @Export(name="clientCertificateId", type=String.class, parameters={})
    private Output</* @Nullable */ String> clientCertificateId;

    /**
     * @return The ID of the client certificate that API Gateway uses to call your integration endpoints in the stage.
     * 
     */
    public Output</* @Nullable */ String> getClientCertificateId() {
        return this.clientCertificateId;
    }
    /**
     * The ID of the deployment that the stage is associated with. This parameter is required to create a stage.
     * 
     */
    @Export(name="deploymentId", type=String.class, parameters={})
    private Output</* @Nullable */ String> deploymentId;

    /**
     * @return The ID of the deployment that the stage is associated with. This parameter is required to create a stage.
     * 
     */
    public Output</* @Nullable */ String> getDeploymentId() {
        return this.deploymentId;
    }
    /**
     * A description of the stage.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return A description of the stage.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * The version ID of the API documentation snapshot.
     * 
     */
    @Export(name="documentationVersion", type=String.class, parameters={})
    private Output</* @Nullable */ String> documentationVersion;

    /**
     * @return The version ID of the API documentation snapshot.
     * 
     */
    public Output</* @Nullable */ String> getDocumentationVersion() {
        return this.documentationVersion;
    }
    /**
     * Settings for all methods in the stage.
     * 
     */
    @Export(name="methodSettings", type=List.class, parameters={StageMethodSetting.class})
    private Output</* @Nullable */ List<StageMethodSetting>> methodSettings;

    /**
     * @return Settings for all methods in the stage.
     * 
     */
    public Output</* @Nullable */ List<StageMethodSetting>> getMethodSettings() {
        return this.methodSettings;
    }
    /**
     * The ID of the RestApi resource that you're deploying with this stage.
     * 
     */
    @Export(name="restApiId", type=String.class, parameters={})
    private Output<String> restApiId;

    /**
     * @return The ID of the RestApi resource that you're deploying with this stage.
     * 
     */
    public Output<String> getRestApiId() {
        return this.restApiId;
    }
    /**
     * The name of the stage, which API Gateway uses as the first path segment in the invoked Uniform Resource Identifier (URI).
     * 
     */
    @Export(name="stageName", type=String.class, parameters={})
    private Output</* @Nullable */ String> stageName;

    /**
     * @return The name of the stage, which API Gateway uses as the first path segment in the invoked Uniform Resource Identifier (URI).
     * 
     */
    public Output</* @Nullable */ String> getStageName() {
        return this.stageName;
    }
    /**
     * An array of arbitrary tags (key-value pairs) to associate with the stage.
     * 
     */
    @Export(name="tags", type=List.class, parameters={StageTag.class})
    private Output</* @Nullable */ List<StageTag>> tags;

    /**
     * @return An array of arbitrary tags (key-value pairs) to associate with the stage.
     * 
     */
    public Output</* @Nullable */ List<StageTag>> getTags() {
        return this.tags;
    }
    /**
     * Specifies whether active X-Ray tracing is enabled for this stage.
     * 
     */
    @Export(name="tracingEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> tracingEnabled;

    /**
     * @return Specifies whether active X-Ray tracing is enabled for this stage.
     * 
     */
    public Output</* @Nullable */ Boolean> getTracingEnabled() {
        return this.tracingEnabled;
    }
    /**
     * A map (string-to-string map) that defines the stage variables, where the variable name is the key and the variable value is the value.
     * 
     */
    @Export(name="variables", type=Object.class, parameters={})
    private Output</* @Nullable */ Object> variables;

    /**
     * @return A map (string-to-string map) that defines the stage variables, where the variable name is the key and the variable value is the value.
     * 
     */
    public Output</* @Nullable */ Object> getVariables() {
        return this.variables;
    }

    public interface BuilderApplicator {
        public void apply(StageArgs.Builder a);
    }
    private static io.pulumi.awsnative.apigateway.StageArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.awsnative.apigateway.StageArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Stage(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Stage(String name) {
        this(name, StageArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Stage(String name, StageArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Stage(String name, StageArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:apigateway:Stage", name, args == null ? StageArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private Stage(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:apigateway:Stage", name, null, makeResourceOptions(options, id));
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
    public static Stage get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Stage(name, id, options);
    }
}
