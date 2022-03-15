// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.s3;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.s3.BucketIntelligentTieringConfigurationArgs;
import io.pulumi.aws.s3.inputs.BucketIntelligentTieringConfigurationState;
import io.pulumi.aws.s3.outputs.BucketIntelligentTieringConfigurationFilter;
import io.pulumi.aws.s3.outputs.BucketIntelligentTieringConfigurationTiering;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Provides an [S3 Intelligent-Tiering](https://docs.aws.amazon.com/AmazonS3/latest/userguide/intelligent-tiering.html) configuration resource.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * S3 bucket intelligent tiering configurations can be imported using `bucket:name`, e.g.
 * 
 * ```sh
 *  $ pulumi import aws:s3/bucketIntelligentTieringConfiguration:BucketIntelligentTieringConfiguration my-bucket-entire-bucket my-bucket:EntireBucket
 * ```
 * 
 */
@ResourceType(type="aws:s3/bucketIntelligentTieringConfiguration:BucketIntelligentTieringConfiguration")
public class BucketIntelligentTieringConfiguration extends io.pulumi.resources.CustomResource {
    /**
     * The name of the bucket this intelligent tiering configuration is associated with.
     * 
     */
    @Export(name="bucket", type=String.class, parameters={})
    private Output<String> bucket;

    /**
     * @return The name of the bucket this intelligent tiering configuration is associated with.
     * 
     */
    public Output<String> getBucket() {
        return this.bucket;
    }
    /**
     * A bucket filter. The configuration only includes objects that meet the filter's criteria (documented below).
     * 
     */
    @Export(name="filter", type=BucketIntelligentTieringConfigurationFilter.class, parameters={})
    private Output</* @Nullable */ BucketIntelligentTieringConfigurationFilter> filter;

    /**
     * @return A bucket filter. The configuration only includes objects that meet the filter's criteria (documented below).
     * 
     */
    public Output</* @Nullable */ BucketIntelligentTieringConfigurationFilter> getFilter() {
        return this.filter;
    }
    /**
     * The unique name used to identify the S3 Intelligent-Tiering configuration for the bucket.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The unique name used to identify the S3 Intelligent-Tiering configuration for the bucket.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Specifies the status of the configuration. Valid values: `Enabled`, `Disabled`.
     * 
     */
    @Export(name="status", type=String.class, parameters={})
    private Output</* @Nullable */ String> status;

    /**
     * @return Specifies the status of the configuration. Valid values: `Enabled`, `Disabled`.
     * 
     */
    public Output</* @Nullable */ String> getStatus() {
        return this.status;
    }
    /**
     * The S3 Intelligent-Tiering storage class tiers of the configuration (documented below).
     * 
     */
    @Export(name="tierings", type=List.class, parameters={BucketIntelligentTieringConfigurationTiering.class})
    private Output<List<BucketIntelligentTieringConfigurationTiering>> tierings;

    /**
     * @return The S3 Intelligent-Tiering storage class tiers of the configuration (documented below).
     * 
     */
    public Output<List<BucketIntelligentTieringConfigurationTiering>> getTierings() {
        return this.tierings;
    }

    public interface BuilderApplicator {
        public void apply(BucketIntelligentTieringConfigurationArgs.Builder a);
    }
    private static io.pulumi.aws.s3.BucketIntelligentTieringConfigurationArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.s3.BucketIntelligentTieringConfigurationArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public BucketIntelligentTieringConfiguration(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public BucketIntelligentTieringConfiguration(String name) {
        this(name, BucketIntelligentTieringConfigurationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public BucketIntelligentTieringConfiguration(String name, BucketIntelligentTieringConfigurationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public BucketIntelligentTieringConfiguration(String name, BucketIntelligentTieringConfigurationArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:s3/bucketIntelligentTieringConfiguration:BucketIntelligentTieringConfiguration", name, args == null ? BucketIntelligentTieringConfigurationArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private BucketIntelligentTieringConfiguration(String name, Output<String> id, @Nullable BucketIntelligentTieringConfigurationState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:s3/bucketIntelligentTieringConfiguration:BucketIntelligentTieringConfiguration", name, state, makeResourceOptions(options, id));
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
    public static BucketIntelligentTieringConfiguration get(String name, Output<String> id, @Nullable BucketIntelligentTieringConfigurationState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new BucketIntelligentTieringConfiguration(name, id, state, options);
    }
}
