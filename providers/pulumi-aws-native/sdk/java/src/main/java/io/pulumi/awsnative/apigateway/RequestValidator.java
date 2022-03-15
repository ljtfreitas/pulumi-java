// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.apigateway;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.apigateway.RequestValidatorArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Resource Type definition for AWS::ApiGateway::RequestValidator
 * 
 */
@ResourceType(type="aws-native:apigateway:RequestValidator")
public class RequestValidator extends io.pulumi.resources.CustomResource {
    /**
     * Name of the request validator.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output</* @Nullable */ String> name;

    /**
     * @return Name of the request validator.
     * 
     */
    public Output</* @Nullable */ String> getName() {
        return this.name;
    }
    /**
     * ID of the request validator.
     * 
     */
    @Export(name="requestValidatorId", type=String.class, parameters={})
    private Output<String> requestValidatorId;

    /**
     * @return ID of the request validator.
     * 
     */
    public Output<String> getRequestValidatorId() {
        return this.requestValidatorId;
    }
    /**
     * The identifier of the targeted API entity.
     * 
     */
    @Export(name="restApiId", type=String.class, parameters={})
    private Output<String> restApiId;

    /**
     * @return The identifier of the targeted API entity.
     * 
     */
    public Output<String> getRestApiId() {
        return this.restApiId;
    }
    /**
     * Indicates whether to validate the request body according to the configured schema for the targeted API and method.
     * 
     */
    @Export(name="validateRequestBody", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> validateRequestBody;

    /**
     * @return Indicates whether to validate the request body according to the configured schema for the targeted API and method.
     * 
     */
    public Output</* @Nullable */ Boolean> getValidateRequestBody() {
        return this.validateRequestBody;
    }
    /**
     * Indicates whether to validate request parameters.
     * 
     */
    @Export(name="validateRequestParameters", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> validateRequestParameters;

    /**
     * @return Indicates whether to validate request parameters.
     * 
     */
    public Output</* @Nullable */ Boolean> getValidateRequestParameters() {
        return this.validateRequestParameters;
    }

    public interface BuilderApplicator {
        public void apply(RequestValidatorArgs.Builder a);
    }
    private static io.pulumi.awsnative.apigateway.RequestValidatorArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.awsnative.apigateway.RequestValidatorArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public RequestValidator(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public RequestValidator(String name) {
        this(name, RequestValidatorArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public RequestValidator(String name, RequestValidatorArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RequestValidator(String name, RequestValidatorArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:apigateway:RequestValidator", name, args == null ? RequestValidatorArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private RequestValidator(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:apigateway:RequestValidator", name, null, makeResourceOptions(options, id));
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
    public static RequestValidator get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new RequestValidator(name, id, options);
    }
}
