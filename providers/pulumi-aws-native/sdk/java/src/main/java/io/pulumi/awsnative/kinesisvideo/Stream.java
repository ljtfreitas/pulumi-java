// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kinesisvideo;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.kinesisvideo.StreamArgs;
import io.pulumi.awsnative.kinesisvideo.outputs.StreamTag;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Resource Type Definition for AWS::KinesisVideo::Stream
 * 
 */
@ResourceType(type="aws-native:kinesisvideo:Stream")
public class Stream extends io.pulumi.resources.CustomResource {
    /**
     * The Amazon Resource Name (ARN) of the Kinesis Video stream.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) of the Kinesis Video stream.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * The number of hours till which Kinesis Video will retain the data in the stream
     * 
     */
    @Export(name="dataRetentionInHours", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> dataRetentionInHours;

    /**
     * @return The number of hours till which Kinesis Video will retain the data in the stream
     * 
     */
    public Output</* @Nullable */ Integer> getDataRetentionInHours() {
        return this.dataRetentionInHours;
    }
    /**
     * The name of the device that is writing to the stream.
     * 
     */
    @Export(name="deviceName", type=String.class, parameters={})
    private Output</* @Nullable */ String> deviceName;

    /**
     * @return The name of the device that is writing to the stream.
     * 
     */
    public Output</* @Nullable */ String> getDeviceName() {
        return this.deviceName;
    }
    /**
     * AWS KMS key ID that Kinesis Video Streams uses to encrypt stream data.
     * 
     */
    @Export(name="kmsKeyId", type=String.class, parameters={})
    private Output</* @Nullable */ String> kmsKeyId;

    /**
     * @return AWS KMS key ID that Kinesis Video Streams uses to encrypt stream data.
     * 
     */
    public Output</* @Nullable */ String> getKmsKeyId() {
        return this.kmsKeyId;
    }
    /**
     * The media type of the stream. Consumers of the stream can use this information when processing the stream.
     * 
     */
    @Export(name="mediaType", type=String.class, parameters={})
    private Output</* @Nullable */ String> mediaType;

    /**
     * @return The media type of the stream. Consumers of the stream can use this information when processing the stream.
     * 
     */
    public Output</* @Nullable */ String> getMediaType() {
        return this.mediaType;
    }
    /**
     * The name of the Kinesis Video stream.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output</* @Nullable */ String> name;

    /**
     * @return The name of the Kinesis Video stream.
     * 
     */
    public Output</* @Nullable */ String> getName() {
        return this.name;
    }
    /**
     * An array of key-value pairs associated with the Kinesis Video Stream.
     * 
     */
    @Export(name="tags", type=List.class, parameters={StreamTag.class})
    private Output</* @Nullable */ List<StreamTag>> tags;

    /**
     * @return An array of key-value pairs associated with the Kinesis Video Stream.
     * 
     */
    public Output</* @Nullable */ List<StreamTag>> getTags() {
        return this.tags;
    }

    public interface BuilderApplicator {
        public void apply(@Nullable StreamArgs.Builder a);
    }
    private static io.pulumi.awsnative.kinesisvideo.StreamArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.awsnative.kinesisvideo.StreamArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Stream(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
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
    public Stream(String name, @Nullable StreamArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Stream(String name, @Nullable StreamArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:kinesisvideo:Stream", name, args == null ? StreamArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private Stream(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:kinesisvideo:Stream", name, null, makeResourceOptions(options, id));
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
    public static Stream get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Stream(name, id, options);
    }
}
