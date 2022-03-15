// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.guardduty;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.guardduty.PublishingDestinationArgs;
import io.pulumi.aws.guardduty.inputs.PublishingDestinationState;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a resource to manage a GuardDuty PublishingDestination. Requires an existing GuardDuty Detector.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * GuardDuty PublishingDestination can be imported using the the master GuardDuty detector ID and PublishingDestinationID, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:guardduty/publishingDestination:PublishingDestination test a4b86f26fa42e7e7cf0d1c333ea77777:a4b86f27a0e464e4a7e0516d242f1234
 * ```
 * 
 */
@ResourceType(type="aws:guardduty/publishingDestination:PublishingDestination")
public class PublishingDestination extends io.pulumi.resources.CustomResource {
    /**
     * The bucket arn and prefix under which the findings get exported. Bucket-ARN is required, the prefix is optional and will be `AWSLogs/[Account-ID]/GuardDuty/[Region]/` if not provided
     * 
     */
    @Export(name="destinationArn", type=String.class, parameters={})
    private Output<String> destinationArn;

    /**
     * @return The bucket arn and prefix under which the findings get exported. Bucket-ARN is required, the prefix is optional and will be `AWSLogs/[Account-ID]/GuardDuty/[Region]/` if not provided
     * 
     */
    public Output<String> getDestinationArn() {
        return this.destinationArn;
    }
    /**
     * Currently there is only "S3" available as destination type which is also the default value
     * 
     */
    @Export(name="destinationType", type=String.class, parameters={})
    private Output</* @Nullable */ String> destinationType;

    /**
     * @return Currently there is only "S3" available as destination type which is also the default value
     * 
     */
    public Output</* @Nullable */ String> getDestinationType() {
        return this.destinationType;
    }
    /**
     * The detector ID of the GuardDuty.
     * 
     */
    @Export(name="detectorId", type=String.class, parameters={})
    private Output<String> detectorId;

    /**
     * @return The detector ID of the GuardDuty.
     * 
     */
    public Output<String> getDetectorId() {
        return this.detectorId;
    }
    /**
     * The ARN of the KMS key used to encrypt GuardDuty findings. GuardDuty enforces this to be encrypted.
     * 
     */
    @Export(name="kmsKeyArn", type=String.class, parameters={})
    private Output<String> kmsKeyArn;

    /**
     * @return The ARN of the KMS key used to encrypt GuardDuty findings. GuardDuty enforces this to be encrypted.
     * 
     */
    public Output<String> getKmsKeyArn() {
        return this.kmsKeyArn;
    }

    public interface BuilderApplicator {
        public void apply(PublishingDestinationArgs.Builder a);
    }
    private static io.pulumi.aws.guardduty.PublishingDestinationArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.guardduty.PublishingDestinationArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public PublishingDestination(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public PublishingDestination(String name) {
        this(name, PublishingDestinationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public PublishingDestination(String name, PublishingDestinationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public PublishingDestination(String name, PublishingDestinationArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:guardduty/publishingDestination:PublishingDestination", name, args == null ? PublishingDestinationArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private PublishingDestination(String name, Output<String> id, @Nullable PublishingDestinationState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:guardduty/publishingDestination:PublishingDestination", name, state, makeResourceOptions(options, id));
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
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static PublishingDestination get(String name, Output<String> id, @Nullable PublishingDestinationState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new PublishingDestination(name, id, state, options);
    }
}
