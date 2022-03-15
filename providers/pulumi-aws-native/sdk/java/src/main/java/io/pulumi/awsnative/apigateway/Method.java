// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.apigateway;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.apigateway.MethodArgs;
import io.pulumi.awsnative.apigateway.enums.MethodAuthorizationType;
import io.pulumi.awsnative.apigateway.outputs.MethodIntegration;
import io.pulumi.awsnative.apigateway.outputs.MethodResponse;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Resource Type definition for AWS::ApiGateway::Method
 * 
 */
@ResourceType(type="aws-native:apigateway:Method")
public class Method extends io.pulumi.resources.CustomResource {
    /**
     * Indicates whether the method requires clients to submit a valid API key.
     * 
     */
    @Export(name="apiKeyRequired", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> apiKeyRequired;

    /**
     * @return Indicates whether the method requires clients to submit a valid API key.
     * 
     */
    public Output</* @Nullable */ Boolean> getApiKeyRequired() {
        return this.apiKeyRequired;
    }
    /**
     * A list of authorization scopes configured on the method.
     * 
     */
    @Export(name="authorizationScopes", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> authorizationScopes;

    /**
     * @return A list of authorization scopes configured on the method.
     * 
     */
    public Output</* @Nullable */ List<String>> getAuthorizationScopes() {
        return this.authorizationScopes;
    }
    /**
     * The method's authorization type.
     * 
     */
    @Export(name="authorizationType", type=MethodAuthorizationType.class, parameters={})
    private Output</* @Nullable */ MethodAuthorizationType> authorizationType;

    /**
     * @return The method's authorization type.
     * 
     */
    public Output</* @Nullable */ MethodAuthorizationType> getAuthorizationType() {
        return this.authorizationType;
    }
    /**
     * The identifier of the authorizer to use on this method.
     * 
     */
    @Export(name="authorizerId", type=String.class, parameters={})
    private Output</* @Nullable */ String> authorizerId;

    /**
     * @return The identifier of the authorizer to use on this method.
     * 
     */
    public Output</* @Nullable */ String> getAuthorizerId() {
        return this.authorizerId;
    }
    /**
     * The backend system that the method calls when it receives a request.
     * 
     */
    @Export(name="httpMethod", type=String.class, parameters={})
    private Output<String> httpMethod;

    /**
     * @return The backend system that the method calls when it receives a request.
     * 
     */
    public Output<String> getHttpMethod() {
        return this.httpMethod;
    }
    /**
     * The backend system that the method calls when it receives a request.
     * 
     */
    @Export(name="integration", type=MethodIntegration.class, parameters={})
    private Output</* @Nullable */ MethodIntegration> integration;

    /**
     * @return The backend system that the method calls when it receives a request.
     * 
     */
    public Output</* @Nullable */ MethodIntegration> getIntegration() {
        return this.integration;
    }
    /**
     * The responses that can be sent to the client who calls the method.
     * 
     */
    @Export(name="methodResponses", type=List.class, parameters={MethodResponse.class})
    private Output</* @Nullable */ List<MethodResponse>> methodResponses;

    /**
     * @return The responses that can be sent to the client who calls the method.
     * 
     */
    public Output</* @Nullable */ List<MethodResponse>> getMethodResponses() {
        return this.methodResponses;
    }
    /**
     * A friendly operation name for the method.
     * 
     */
    @Export(name="operationName", type=String.class, parameters={})
    private Output</* @Nullable */ String> operationName;

    /**
     * @return A friendly operation name for the method.
     * 
     */
    public Output</* @Nullable */ String> getOperationName() {
        return this.operationName;
    }
    /**
     * The resources that are used for the request's content type. Specify request models as key-value pairs (string-to-string mapping), with a content type as the key and a Model resource name as the value.
     * 
     */
    @Export(name="requestModels", type=Object.class, parameters={})
    private Output</* @Nullable */ Object> requestModels;

    /**
     * @return The resources that are used for the request's content type. Specify request models as key-value pairs (string-to-string mapping), with a content type as the key and a Model resource name as the value.
     * 
     */
    public Output</* @Nullable */ Object> getRequestModels() {
        return this.requestModels;
    }
    /**
     * The request parameters that API Gateway accepts. Specify request parameters as key-value pairs (string-to-Boolean mapping), with a source as the key and a Boolean as the value.
     * 
     */
    @Export(name="requestParameters", type=Object.class, parameters={})
    private Output</* @Nullable */ Object> requestParameters;

    /**
     * @return The request parameters that API Gateway accepts. Specify request parameters as key-value pairs (string-to-Boolean mapping), with a source as the key and a Boolean as the value.
     * 
     */
    public Output</* @Nullable */ Object> getRequestParameters() {
        return this.requestParameters;
    }
    /**
     * The ID of the associated request validator.
     * 
     */
    @Export(name="requestValidatorId", type=String.class, parameters={})
    private Output</* @Nullable */ String> requestValidatorId;

    /**
     * @return The ID of the associated request validator.
     * 
     */
    public Output</* @Nullable */ String> getRequestValidatorId() {
        return this.requestValidatorId;
    }
    /**
     * The ID of an API Gateway resource.
     * 
     */
    @Export(name="resourceId", type=String.class, parameters={})
    private Output<String> resourceId;

    /**
     * @return The ID of an API Gateway resource.
     * 
     */
    public Output<String> getResourceId() {
        return this.resourceId;
    }
    /**
     * The ID of the RestApi resource in which API Gateway creates the method.
     * 
     */
    @Export(name="restApiId", type=String.class, parameters={})
    private Output<String> restApiId;

    /**
     * @return The ID of the RestApi resource in which API Gateway creates the method.
     * 
     */
    public Output<String> getRestApiId() {
        return this.restApiId;
    }

    public interface BuilderApplicator {
        public void apply(MethodArgs.Builder a);
    }
    private static io.pulumi.awsnative.apigateway.MethodArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.awsnative.apigateway.MethodArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Method(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Method(String name) {
        this(name, MethodArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Method(String name, MethodArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Method(String name, MethodArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:apigateway:Method", name, args == null ? MethodArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private Method(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:apigateway:Method", name, null, makeResourceOptions(options, id));
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
    public static Method get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Method(name, id, options);
    }
}
