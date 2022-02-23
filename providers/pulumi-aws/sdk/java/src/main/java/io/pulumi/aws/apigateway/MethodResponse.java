// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.apigateway;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.apigateway.MethodResponseArgs;
import io.pulumi.aws.apigateway.inputs.MethodResponseState;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides an HTTP Method Response for an API Gateway Resource.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * `aws_api_gateway_method_response` can be imported using `REST-API-ID/RESOURCE-ID/HTTP-METHOD/STATUS-CODE`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:apigateway/methodResponse:MethodResponse example 12345abcde/67890fghij/GET/200
 * ```
 * 
 */
@ResourceType(type="aws:apigateway/methodResponse:MethodResponse")
public class MethodResponse extends io.pulumi.resources.CustomResource {
    /**
     * The HTTP Method (`GET`, `POST`, `PUT`, `DELETE`, `HEAD`, `OPTIONS`, `ANY`)
     * 
     */
    @OutputExport(name="httpMethod", type=String.class, parameters={})
    private Output<String> httpMethod;

    /**
     * @return The HTTP Method (`GET`, `POST`, `PUT`, `DELETE`, `HEAD`, `OPTIONS`, `ANY`)
     * 
     */
    public Output<String> getHttpMethod() {
        return this.httpMethod;
    }
    /**
     * The API resource ID
     * 
     */
    @OutputExport(name="resourceId", type=String.class, parameters={})
    private Output<String> resourceId;

    /**
     * @return The API resource ID
     * 
     */
    public Output<String> getResourceId() {
        return this.resourceId;
    }
    /**
     * A map of the API models used for the response's content type
     * 
     */
    @OutputExport(name="responseModels", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> responseModels;

    /**
     * @return A map of the API models used for the response's content type
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getResponseModels() {
        return this.responseModels;
    }
    /**
     * A map of response parameters that can be sent to the caller.
     * For example: `response_parameters = { "method.response.header.X-Some-Header" = true }`
     * would define that the header `X-Some-Header` can be provided on the response.
     * 
     */
    @OutputExport(name="responseParameters", type=Map.class, parameters={String.class, Boolean.class})
    private Output</* @Nullable */ Map<String,Boolean>> responseParameters;

    /**
     * @return A map of response parameters that can be sent to the caller.
     * For example: `response_parameters = { "method.response.header.X-Some-Header" = true }`
     * would define that the header `X-Some-Header` can be provided on the response.
     * 
     */
    public Output</* @Nullable */ Map<String,Boolean>> getResponseParameters() {
        return this.responseParameters;
    }
    /**
     * The ID of the associated REST API
     * 
     */
    @OutputExport(name="restApi", type=String.class, parameters={})
    private Output<String> restApi;

    /**
     * @return The ID of the associated REST API
     * 
     */
    public Output<String> getRestApi() {
        return this.restApi;
    }
    /**
     * The HTTP status code
     * 
     */
    @OutputExport(name="statusCode", type=String.class, parameters={})
    private Output<String> statusCode;

    /**
     * @return The HTTP status code
     * 
     */
    public Output<String> getStatusCode() {
        return this.statusCode;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public MethodResponse(String name, MethodResponseArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:apigateway/methodResponse:MethodResponse", name, args == null ? MethodResponseArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private MethodResponse(String name, Input<String> id, @Nullable MethodResponseState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:apigateway/methodResponse:MethodResponse", name, state, makeResourceOptions(options, id));
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
    public static MethodResponse get(String name, Input<String> id, @Nullable MethodResponseState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new MethodResponse(name, id, state, options);
    }
}
