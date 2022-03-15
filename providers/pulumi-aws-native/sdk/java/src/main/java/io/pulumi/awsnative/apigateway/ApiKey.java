// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.apigateway;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.apigateway.ApiKeyArgs;
import io.pulumi.awsnative.apigateway.outputs.ApiKeyStageKey;
import io.pulumi.awsnative.apigateway.outputs.ApiKeyTag;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Resource Type definition for AWS::ApiGateway::ApiKey
 * 
 * ## Example Usage
 * 
 */
@ResourceType(type="aws-native:apigateway:ApiKey")
public class ApiKey extends io.pulumi.resources.CustomResource {
    /**
     * A Unique Key ID which identifies the API Key. Generated by the Create API and returned by the Read and List APIs
     * 
     */
    @Export(name="aPIKeyId", type=String.class, parameters={})
    private Output<String> aPIKeyId;

    /**
     * @return A Unique Key ID which identifies the API Key. Generated by the Create API and returned by the Read and List APIs
     * 
     */
    public Output<String> getAPIKeyId() {
        return this.aPIKeyId;
    }
    /**
     * An AWS Marketplace customer identifier to use when integrating with the AWS SaaS Marketplace.
     * 
     */
    @Export(name="customerId", type=String.class, parameters={})
    private Output</* @Nullable */ String> customerId;

    /**
     * @return An AWS Marketplace customer identifier to use when integrating with the AWS SaaS Marketplace.
     * 
     */
    public Output</* @Nullable */ String> getCustomerId() {
        return this.customerId;
    }
    /**
     * A description of the purpose of the API key.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return A description of the purpose of the API key.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * Indicates whether the API key can be used by clients.
     * 
     */
    @Export(name="enabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enabled;

    /**
     * @return Indicates whether the API key can be used by clients.
     * 
     */
    public Output</* @Nullable */ Boolean> getEnabled() {
        return this.enabled;
    }
    /**
     * Specifies whether the key identifier is distinct from the created API key value. This parameter is deprecated and should not be used.
     * 
     */
    @Export(name="generateDistinctId", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> generateDistinctId;

    /**
     * @return Specifies whether the key identifier is distinct from the created API key value. This parameter is deprecated and should not be used.
     * 
     */
    public Output</* @Nullable */ Boolean> getGenerateDistinctId() {
        return this.generateDistinctId;
    }
    /**
     * A name for the API key. If you don't specify a name, AWS CloudFormation generates a unique physical ID and uses that ID for the API key name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output</* @Nullable */ String> name;

    /**
     * @return A name for the API key. If you don't specify a name, AWS CloudFormation generates a unique physical ID and uses that ID for the API key name.
     * 
     */
    public Output</* @Nullable */ String> getName() {
        return this.name;
    }
    /**
     * A list of stages to associate with this API key.
     * 
     */
    @Export(name="stageKeys", type=List.class, parameters={ApiKeyStageKey.class})
    private Output</* @Nullable */ List<ApiKeyStageKey>> stageKeys;

    /**
     * @return A list of stages to associate with this API key.
     * 
     */
    public Output</* @Nullable */ List<ApiKeyStageKey>> getStageKeys() {
        return this.stageKeys;
    }
    /**
     * An array of arbitrary tags (key-value pairs) to associate with the API key.
     * 
     */
    @Export(name="tags", type=List.class, parameters={ApiKeyTag.class})
    private Output</* @Nullable */ List<ApiKeyTag>> tags;

    /**
     * @return An array of arbitrary tags (key-value pairs) to associate with the API key.
     * 
     */
    public Output</* @Nullable */ List<ApiKeyTag>> getTags() {
        return this.tags;
    }
    /**
     * The value of the API key. Must be at least 20 characters long.
     * 
     */
    @Export(name="value", type=String.class, parameters={})
    private Output</* @Nullable */ String> value;

    /**
     * @return The value of the API key. Must be at least 20 characters long.
     * 
     */
    public Output</* @Nullable */ String> getValue() {
        return this.value;
    }

    public interface BuilderApplicator {
        public void apply(@Nullable ApiKeyArgs.Builder a);
    }
    private static io.pulumi.awsnative.apigateway.ApiKeyArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.awsnative.apigateway.ApiKeyArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public ApiKey(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ApiKey(String name) {
        this(name, ApiKeyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ApiKey(String name, @Nullable ApiKeyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ApiKey(String name, @Nullable ApiKeyArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:apigateway:ApiKey", name, args == null ? ApiKeyArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private ApiKey(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:apigateway:ApiKey", name, null, makeResourceOptions(options, id));
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
    public static ApiKey get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ApiKey(name, id, options);
    }
}
