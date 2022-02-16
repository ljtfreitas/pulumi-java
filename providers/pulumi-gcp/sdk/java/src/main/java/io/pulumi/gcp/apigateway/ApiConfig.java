// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.apigateway;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.apigateway.ApiConfigArgs;
import io.pulumi.gcp.apigateway.inputs.ApiConfigState;
import io.pulumi.gcp.apigateway.outputs.ApiConfigGatewayConfig;
import io.pulumi.gcp.apigateway.outputs.ApiConfigOpenapiDocument;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

@ResourceType(type="gcp:apigateway/apiConfig:ApiConfig")
public class ApiConfig extends io.pulumi.resources.CustomResource {
    @OutputExport(name="api", type=String.class, parameters={})
    private Output<String> api;

    public Output<String> getApi() {
        return this.api;
    }
    @OutputExport(name="apiConfigId", type=String.class, parameters={})
    private Output<String> apiConfigId;

    public Output<String> getApiConfigId() {
        return this.apiConfigId;
    }
    @OutputExport(name="apiConfigIdPrefix", type=String.class, parameters={})
    private Output<String> apiConfigIdPrefix;

    public Output<String> getApiConfigIdPrefix() {
        return this.apiConfigIdPrefix;
    }
    @OutputExport(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    public Output<String> getDisplayName() {
        return this.displayName;
    }
    @OutputExport(name="gatewayConfig", type=ApiConfigGatewayConfig.class, parameters={})
    private Output</* @Nullable */ ApiConfigGatewayConfig> gatewayConfig;

    public Output</* @Nullable */ ApiConfigGatewayConfig> getGatewayConfig() {
        return this.gatewayConfig;
    }
    @OutputExport(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> labels;

    public Output</* @Nullable */ Map<String,String>> getLabels() {
        return this.labels;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="openapiDocuments", type=List.class, parameters={ApiConfigOpenapiDocument.class})
    private Output<List<ApiConfigOpenapiDocument>> openapiDocuments;

    public Output<List<ApiConfigOpenapiDocument>> getOpenapiDocuments() {
        return this.openapiDocuments;
    }
    @OutputExport(name="project", type=String.class, parameters={})
    private Output<String> project;

    public Output<String> getProject() {
        return this.project;
    }
    @OutputExport(name="serviceConfigId", type=String.class, parameters={})
    private Output<String> serviceConfigId;

    public Output<String> getServiceConfigId() {
        return this.serviceConfigId;
    }

    public ApiConfig(String name, ApiConfigArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:apigateway/apiConfig:ApiConfig", name, args == null ? ApiConfigArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private ApiConfig(String name, Input<String> id, @Nullable ApiConfigState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:apigateway/apiConfig:ApiConfig", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static ApiConfig get(String name, Input<String> id, @Nullable ApiConfigState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ApiConfig(name, id, state, options);
    }
}