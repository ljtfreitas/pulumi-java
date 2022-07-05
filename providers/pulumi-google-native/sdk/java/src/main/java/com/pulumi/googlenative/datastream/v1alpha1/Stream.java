// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datastream.v1alpha1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.datastream.v1alpha1.StreamArgs;
import com.pulumi.googlenative.datastream.v1alpha1.outputs.BackfillAllStrategyResponse;
import com.pulumi.googlenative.datastream.v1alpha1.outputs.BackfillNoneStrategyResponse;
import com.pulumi.googlenative.datastream.v1alpha1.outputs.DestinationConfigResponse;
import com.pulumi.googlenative.datastream.v1alpha1.outputs.ErrorResponse;
import com.pulumi.googlenative.datastream.v1alpha1.outputs.SourceConfigResponse;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Use this method to create a stream.
 * Auto-naming is currently not supported for this resource.
 * 
 */
@ResourceType(type="google-native:datastream/v1alpha1:Stream")
public class Stream extends com.pulumi.resources.CustomResource {
    /**
     * Automatically backfill objects included in the stream source configuration. Specific objects can be excluded.
     * 
     */
    @Export(name="backfillAll", type=BackfillAllStrategyResponse.class, parameters={})
    private Output<BackfillAllStrategyResponse> backfillAll;

    /**
     * @return Automatically backfill objects included in the stream source configuration. Specific objects can be excluded.
     * 
     */
    public Output<BackfillAllStrategyResponse> backfillAll() {
        return this.backfillAll;
    }
    /**
     * Do not automatically backfill any objects.
     * 
     */
    @Export(name="backfillNone", type=BackfillNoneStrategyResponse.class, parameters={})
    private Output<BackfillNoneStrategyResponse> backfillNone;

    /**
     * @return Do not automatically backfill any objects.
     * 
     */
    public Output<BackfillNoneStrategyResponse> backfillNone() {
        return this.backfillNone;
    }
    /**
     * The creation time of the stream.
     * 
     */
    @Export(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return The creation time of the stream.
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * Immutable. A reference to a KMS encryption key. If provided, it will be used to encrypt the data. If left blank, data will be encrypted using an internal Stream-specific encryption key provisioned through KMS.
     * 
     */
    @Export(name="customerManagedEncryptionKey", type=String.class, parameters={})
    private Output<String> customerManagedEncryptionKey;

    /**
     * @return Immutable. A reference to a KMS encryption key. If provided, it will be used to encrypt the data. If left blank, data will be encrypted using an internal Stream-specific encryption key provisioned through KMS.
     * 
     */
    public Output<String> customerManagedEncryptionKey() {
        return this.customerManagedEncryptionKey;
    }
    /**
     * Destination connection profile configuration.
     * 
     */
    @Export(name="destinationConfig", type=DestinationConfigResponse.class, parameters={})
    private Output<DestinationConfigResponse> destinationConfig;

    /**
     * @return Destination connection profile configuration.
     * 
     */
    public Output<DestinationConfigResponse> destinationConfig() {
        return this.destinationConfig;
    }
    /**
     * Display name.
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return Display name.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }
    /**
     * Errors on the Stream.
     * 
     */
    @Export(name="errors", type=List.class, parameters={ErrorResponse.class})
    private Output<List<ErrorResponse>> errors;

    /**
     * @return Errors on the Stream.
     * 
     */
    public Output<List<ErrorResponse>> errors() {
        return this.errors;
    }
    /**
     * Optional. Create the stream without validating it.
     * 
     */
    @Export(name="force", type=String.class, parameters={})
    private Output</* @Nullable */ String> force;

    /**
     * @return Optional. Create the stream without validating it.
     * 
     */
    public Output<Optional<String>> force() {
        return Codegen.optional(this.force);
    }
    /**
     * Labels.
     * 
     */
    @Export(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> labels;

    /**
     * @return Labels.
     * 
     */
    public Output<Map<String,String>> labels() {
        return this.labels;
    }
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    public Output<String> location() {
        return this.location;
    }
    /**
     * The stream&#39;s name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The stream&#39;s name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    @Export(name="project", type=String.class, parameters={})
    private Output<String> project;

    public Output<String> project() {
        return this.project;
    }
    /**
     * Optional. A request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
     * 
     */
    @Export(name="requestId", type=String.class, parameters={})
    private Output</* @Nullable */ String> requestId;

    /**
     * @return Optional. A request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
     * 
     */
    public Output<Optional<String>> requestId() {
        return Codegen.optional(this.requestId);
    }
    /**
     * Source connection profile configuration.
     * 
     */
    @Export(name="sourceConfig", type=SourceConfigResponse.class, parameters={})
    private Output<SourceConfigResponse> sourceConfig;

    /**
     * @return Source connection profile configuration.
     * 
     */
    public Output<SourceConfigResponse> sourceConfig() {
        return this.sourceConfig;
    }
    /**
     * The state of the stream.
     * 
     */
    @Export(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return The state of the stream.
     * 
     */
    public Output<String> state() {
        return this.state;
    }
    /**
     * Required. The stream identifier.
     * 
     */
    @Export(name="streamId", type=String.class, parameters={})
    private Output<String> streamId;

    /**
     * @return Required. The stream identifier.
     * 
     */
    public Output<String> streamId() {
        return this.streamId;
    }
    /**
     * The last update time of the stream.
     * 
     */
    @Export(name="updateTime", type=String.class, parameters={})
    private Output<String> updateTime;

    /**
     * @return The last update time of the stream.
     * 
     */
    public Output<String> updateTime() {
        return this.updateTime;
    }
    /**
     * Optional. Only validate the stream, but do not create any resources. The default is false.
     * 
     */
    @Export(name="validateOnly", type=String.class, parameters={})
    private Output</* @Nullable */ String> validateOnly;

    /**
     * @return Optional. Only validate the stream, but do not create any resources. The default is false.
     * 
     */
    public Output<Optional<String>> validateOnly() {
        return Codegen.optional(this.validateOnly);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Stream(String name) {
        this(name, StreamArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Stream(String name, StreamArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Stream(String name, StreamArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:datastream/v1alpha1:Stream", name, args == null ? StreamArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Stream(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:datastream/v1alpha1:Stream", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Stream get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Stream(name, id, options);
    }
}
