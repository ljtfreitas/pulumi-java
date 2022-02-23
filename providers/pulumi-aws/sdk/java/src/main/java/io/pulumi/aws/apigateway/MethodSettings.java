// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.apigateway;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.apigateway.MethodSettingsArgs;
import io.pulumi.aws.apigateway.inputs.MethodSettingsState;
import io.pulumi.aws.apigateway.outputs.MethodSettingsSettings;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Manages API Gateway Stage Method Settings. For example, CloudWatch logging and metrics.
 * 
 * > **NOTE:** It is recommended to use this resource in conjunction with the `aws.apigateway.Stage` resource instead of a stage managed by the `aws.apigateway.Deployment` resource optional `stage_name` argument. Stages managed by the `aws.apigateway.Deployment` resource are recreated on redeployment and this resource will require a second apply to recreate the method settings.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * `aws_api_gateway_method_settings` can be imported using `REST-API-ID/STAGE-NAME/METHOD-PATH`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:apigateway/methodSettings:MethodSettings example 12345abcde/example/test/GET
 * ```
 * 
 */
@ResourceType(type="aws:apigateway/methodSettings:MethodSettings")
public class MethodSettings extends io.pulumi.resources.CustomResource {
    /**
     * Method path defined as `{resource_path}/{http_method}` for an individual method override, or `*{@literal /}*` for overriding all methods in the stage. Ensure to trim any leading forward slashes in the path (e.g., `trimprefix(aws_api_gateway_resource.example.path, "/")`).
     * 
     */
    @OutputExport(name="methodPath", type=String.class, parameters={})
    private Output<String> methodPath;

    /**
     * @return Method path defined as `{resource_path}/{http_method}` for an individual method override, or `*{@literal /}*` for overriding all methods in the stage. Ensure to trim any leading forward slashes in the path (e.g., `trimprefix(aws_api_gateway_resource.example.path, "/")`).
     * 
     */
    public Output<String> getMethodPath() {
        return this.methodPath;
    }
    /**
     * The ID of the REST API
     * 
     */
    @OutputExport(name="restApi", type=String.class, parameters={})
    private Output<String> restApi;

    /**
     * @return The ID of the REST API
     * 
     */
    public Output<String> getRestApi() {
        return this.restApi;
    }
    /**
     * The settings block, see below.
     * 
     */
    @OutputExport(name="settings", type=MethodSettingsSettings.class, parameters={})
    private Output<MethodSettingsSettings> settings;

    /**
     * @return The settings block, see below.
     * 
     */
    public Output<MethodSettingsSettings> getSettings() {
        return this.settings;
    }
    /**
     * The name of the stage
     * 
     */
    @OutputExport(name="stageName", type=String.class, parameters={})
    private Output<String> stageName;

    /**
     * @return The name of the stage
     * 
     */
    public Output<String> getStageName() {
        return this.stageName;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public MethodSettings(String name, MethodSettingsArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:apigateway/methodSettings:MethodSettings", name, args == null ? MethodSettingsArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private MethodSettings(String name, Input<String> id, @Nullable MethodSettingsState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:apigateway/methodSettings:MethodSettings", name, state, makeResourceOptions(options, id));
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
    public static MethodSettings get(String name, Input<String> id, @Nullable MethodSettingsState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new MethodSettings(name, id, state, options);
    }
}
