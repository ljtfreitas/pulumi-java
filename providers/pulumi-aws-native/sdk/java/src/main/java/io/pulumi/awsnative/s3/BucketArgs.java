// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3;

import io.pulumi.awsnative.s3.enums.BucketAccessControl;
import io.pulumi.awsnative.s3.inputs.BucketAccelerateConfigurationArgs;
import io.pulumi.awsnative.s3.inputs.BucketAnalyticsConfigurationArgs;
import io.pulumi.awsnative.s3.inputs.BucketCorsConfigurationArgs;
import io.pulumi.awsnative.s3.inputs.BucketEncryptionArgs;
import io.pulumi.awsnative.s3.inputs.BucketIntelligentTieringConfigurationArgs;
import io.pulumi.awsnative.s3.inputs.BucketInventoryConfigurationArgs;
import io.pulumi.awsnative.s3.inputs.BucketLifecycleConfigurationArgs;
import io.pulumi.awsnative.s3.inputs.BucketLoggingConfigurationArgs;
import io.pulumi.awsnative.s3.inputs.BucketMetricsConfigurationArgs;
import io.pulumi.awsnative.s3.inputs.BucketNotificationConfigurationArgs;
import io.pulumi.awsnative.s3.inputs.BucketObjectLockConfigurationArgs;
import io.pulumi.awsnative.s3.inputs.BucketOwnershipControlsArgs;
import io.pulumi.awsnative.s3.inputs.BucketPublicAccessBlockConfigurationArgs;
import io.pulumi.awsnative.s3.inputs.BucketReplicationConfigurationArgs;
import io.pulumi.awsnative.s3.inputs.BucketTagArgs;
import io.pulumi.awsnative.s3.inputs.BucketVersioningConfigurationArgs;
import io.pulumi.awsnative.s3.inputs.BucketWebsiteConfigurationArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BucketArgs extends io.pulumi.resources.ResourceArgs {

    public static final BucketArgs Empty = new BucketArgs();

    /**
     * Configuration for the transfer acceleration state.
     * 
     */
    @Import(name="accelerateConfiguration")
      private final @Nullable Output<BucketAccelerateConfigurationArgs> accelerateConfiguration;

    public Output<BucketAccelerateConfigurationArgs> getAccelerateConfiguration() {
        return this.accelerateConfiguration == null ? Output.empty() : this.accelerateConfiguration;
    }

    /**
     * A canned access control list (ACL) that grants predefined permissions to the bucket.
     * 
     */
    @Import(name="accessControl")
      private final @Nullable Output<BucketAccessControl> accessControl;

    public Output<BucketAccessControl> getAccessControl() {
        return this.accessControl == null ? Output.empty() : this.accessControl;
    }

    /**
     * The configuration and any analyses for the analytics filter of an Amazon S3 bucket.
     * 
     */
    @Import(name="analyticsConfigurations")
      private final @Nullable Output<List<BucketAnalyticsConfigurationArgs>> analyticsConfigurations;

    public Output<List<BucketAnalyticsConfigurationArgs>> getAnalyticsConfigurations() {
        return this.analyticsConfigurations == null ? Output.empty() : this.analyticsConfigurations;
    }

    @Import(name="bucketEncryption")
      private final @Nullable Output<BucketEncryptionArgs> bucketEncryption;

    public Output<BucketEncryptionArgs> getBucketEncryption() {
        return this.bucketEncryption == null ? Output.empty() : this.bucketEncryption;
    }

    /**
     * A name for the bucket. If you don't specify a name, AWS CloudFormation generates a unique physical ID and uses that ID for the bucket name.
     * 
     */
    @Import(name="bucketName")
      private final @Nullable Output<String> bucketName;

    public Output<String> getBucketName() {
        return this.bucketName == null ? Output.empty() : this.bucketName;
    }

    /**
     * Rules that define cross-origin resource sharing of objects in this bucket.
     * 
     */
    @Import(name="corsConfiguration")
      private final @Nullable Output<BucketCorsConfigurationArgs> corsConfiguration;

    public Output<BucketCorsConfigurationArgs> getCorsConfiguration() {
        return this.corsConfiguration == null ? Output.empty() : this.corsConfiguration;
    }

    /**
     * Specifies the S3 Intelligent-Tiering configuration for an Amazon S3 bucket.
     * 
     */
    @Import(name="intelligentTieringConfigurations")
      private final @Nullable Output<List<BucketIntelligentTieringConfigurationArgs>> intelligentTieringConfigurations;

    public Output<List<BucketIntelligentTieringConfigurationArgs>> getIntelligentTieringConfigurations() {
        return this.intelligentTieringConfigurations == null ? Output.empty() : this.intelligentTieringConfigurations;
    }

    /**
     * The inventory configuration for an Amazon S3 bucket.
     * 
     */
    @Import(name="inventoryConfigurations")
      private final @Nullable Output<List<BucketInventoryConfigurationArgs>> inventoryConfigurations;

    public Output<List<BucketInventoryConfigurationArgs>> getInventoryConfigurations() {
        return this.inventoryConfigurations == null ? Output.empty() : this.inventoryConfigurations;
    }

    /**
     * Rules that define how Amazon S3 manages objects during their lifetime.
     * 
     */
    @Import(name="lifecycleConfiguration")
      private final @Nullable Output<BucketLifecycleConfigurationArgs> lifecycleConfiguration;

    public Output<BucketLifecycleConfigurationArgs> getLifecycleConfiguration() {
        return this.lifecycleConfiguration == null ? Output.empty() : this.lifecycleConfiguration;
    }

    /**
     * Settings that define where logs are stored.
     * 
     */
    @Import(name="loggingConfiguration")
      private final @Nullable Output<BucketLoggingConfigurationArgs> loggingConfiguration;

    public Output<BucketLoggingConfigurationArgs> getLoggingConfiguration() {
        return this.loggingConfiguration == null ? Output.empty() : this.loggingConfiguration;
    }

    /**
     * Settings that define a metrics configuration for the CloudWatch request metrics from the bucket.
     * 
     */
    @Import(name="metricsConfigurations")
      private final @Nullable Output<List<BucketMetricsConfigurationArgs>> metricsConfigurations;

    public Output<List<BucketMetricsConfigurationArgs>> getMetricsConfigurations() {
        return this.metricsConfigurations == null ? Output.empty() : this.metricsConfigurations;
    }

    /**
     * Configuration that defines how Amazon S3 handles bucket notifications.
     * 
     */
    @Import(name="notificationConfiguration")
      private final @Nullable Output<BucketNotificationConfigurationArgs> notificationConfiguration;

    public Output<BucketNotificationConfigurationArgs> getNotificationConfiguration() {
        return this.notificationConfiguration == null ? Output.empty() : this.notificationConfiguration;
    }

    /**
     * Places an Object Lock configuration on the specified bucket.
     * 
     */
    @Import(name="objectLockConfiguration")
      private final @Nullable Output<BucketObjectLockConfigurationArgs> objectLockConfiguration;

    public Output<BucketObjectLockConfigurationArgs> getObjectLockConfiguration() {
        return this.objectLockConfiguration == null ? Output.empty() : this.objectLockConfiguration;
    }

    /**
     * Indicates whether this bucket has an Object Lock configuration enabled.
     * 
     */
    @Import(name="objectLockEnabled")
      private final @Nullable Output<Boolean> objectLockEnabled;

    public Output<Boolean> getObjectLockEnabled() {
        return this.objectLockEnabled == null ? Output.empty() : this.objectLockEnabled;
    }

    /**
     * Specifies the container element for object ownership rules.
     * 
     */
    @Import(name="ownershipControls")
      private final @Nullable Output<BucketOwnershipControlsArgs> ownershipControls;

    public Output<BucketOwnershipControlsArgs> getOwnershipControls() {
        return this.ownershipControls == null ? Output.empty() : this.ownershipControls;
    }

    @Import(name="publicAccessBlockConfiguration")
      private final @Nullable Output<BucketPublicAccessBlockConfigurationArgs> publicAccessBlockConfiguration;

    public Output<BucketPublicAccessBlockConfigurationArgs> getPublicAccessBlockConfiguration() {
        return this.publicAccessBlockConfiguration == null ? Output.empty() : this.publicAccessBlockConfiguration;
    }

    /**
     * Configuration for replicating objects in an S3 bucket.
     * 
     */
    @Import(name="replicationConfiguration")
      private final @Nullable Output<BucketReplicationConfigurationArgs> replicationConfiguration;

    public Output<BucketReplicationConfigurationArgs> getReplicationConfiguration() {
        return this.replicationConfiguration == null ? Output.empty() : this.replicationConfiguration;
    }

    /**
     * An arbitrary set of tags (key-value pairs) for this S3 bucket.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<List<BucketTagArgs>> tags;

    public Output<List<BucketTagArgs>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    @Import(name="versioningConfiguration")
      private final @Nullable Output<BucketVersioningConfigurationArgs> versioningConfiguration;

    public Output<BucketVersioningConfigurationArgs> getVersioningConfiguration() {
        return this.versioningConfiguration == null ? Output.empty() : this.versioningConfiguration;
    }

    @Import(name="websiteConfiguration")
      private final @Nullable Output<BucketWebsiteConfigurationArgs> websiteConfiguration;

    public Output<BucketWebsiteConfigurationArgs> getWebsiteConfiguration() {
        return this.websiteConfiguration == null ? Output.empty() : this.websiteConfiguration;
    }

    public BucketArgs(
        @Nullable Output<BucketAccelerateConfigurationArgs> accelerateConfiguration,
        @Nullable Output<BucketAccessControl> accessControl,
        @Nullable Output<List<BucketAnalyticsConfigurationArgs>> analyticsConfigurations,
        @Nullable Output<BucketEncryptionArgs> bucketEncryption,
        @Nullable Output<String> bucketName,
        @Nullable Output<BucketCorsConfigurationArgs> corsConfiguration,
        @Nullable Output<List<BucketIntelligentTieringConfigurationArgs>> intelligentTieringConfigurations,
        @Nullable Output<List<BucketInventoryConfigurationArgs>> inventoryConfigurations,
        @Nullable Output<BucketLifecycleConfigurationArgs> lifecycleConfiguration,
        @Nullable Output<BucketLoggingConfigurationArgs> loggingConfiguration,
        @Nullable Output<List<BucketMetricsConfigurationArgs>> metricsConfigurations,
        @Nullable Output<BucketNotificationConfigurationArgs> notificationConfiguration,
        @Nullable Output<BucketObjectLockConfigurationArgs> objectLockConfiguration,
        @Nullable Output<Boolean> objectLockEnabled,
        @Nullable Output<BucketOwnershipControlsArgs> ownershipControls,
        @Nullable Output<BucketPublicAccessBlockConfigurationArgs> publicAccessBlockConfiguration,
        @Nullable Output<BucketReplicationConfigurationArgs> replicationConfiguration,
        @Nullable Output<List<BucketTagArgs>> tags,
        @Nullable Output<BucketVersioningConfigurationArgs> versioningConfiguration,
        @Nullable Output<BucketWebsiteConfigurationArgs> websiteConfiguration) {
        this.accelerateConfiguration = accelerateConfiguration;
        this.accessControl = accessControl;
        this.analyticsConfigurations = analyticsConfigurations;
        this.bucketEncryption = bucketEncryption;
        this.bucketName = bucketName;
        this.corsConfiguration = corsConfiguration;
        this.intelligentTieringConfigurations = intelligentTieringConfigurations;
        this.inventoryConfigurations = inventoryConfigurations;
        this.lifecycleConfiguration = lifecycleConfiguration;
        this.loggingConfiguration = loggingConfiguration;
        this.metricsConfigurations = metricsConfigurations;
        this.notificationConfiguration = notificationConfiguration;
        this.objectLockConfiguration = objectLockConfiguration;
        this.objectLockEnabled = objectLockEnabled;
        this.ownershipControls = ownershipControls;
        this.publicAccessBlockConfiguration = publicAccessBlockConfiguration;
        this.replicationConfiguration = replicationConfiguration;
        this.tags = tags;
        this.versioningConfiguration = versioningConfiguration;
        this.websiteConfiguration = websiteConfiguration;
    }

    private BucketArgs() {
        this.accelerateConfiguration = Output.empty();
        this.accessControl = Output.empty();
        this.analyticsConfigurations = Output.empty();
        this.bucketEncryption = Output.empty();
        this.bucketName = Output.empty();
        this.corsConfiguration = Output.empty();
        this.intelligentTieringConfigurations = Output.empty();
        this.inventoryConfigurations = Output.empty();
        this.lifecycleConfiguration = Output.empty();
        this.loggingConfiguration = Output.empty();
        this.metricsConfigurations = Output.empty();
        this.notificationConfiguration = Output.empty();
        this.objectLockConfiguration = Output.empty();
        this.objectLockEnabled = Output.empty();
        this.ownershipControls = Output.empty();
        this.publicAccessBlockConfiguration = Output.empty();
        this.replicationConfiguration = Output.empty();
        this.tags = Output.empty();
        this.versioningConfiguration = Output.empty();
        this.websiteConfiguration = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<BucketAccelerateConfigurationArgs> accelerateConfiguration;
        private @Nullable Output<BucketAccessControl> accessControl;
        private @Nullable Output<List<BucketAnalyticsConfigurationArgs>> analyticsConfigurations;
        private @Nullable Output<BucketEncryptionArgs> bucketEncryption;
        private @Nullable Output<String> bucketName;
        private @Nullable Output<BucketCorsConfigurationArgs> corsConfiguration;
        private @Nullable Output<List<BucketIntelligentTieringConfigurationArgs>> intelligentTieringConfigurations;
        private @Nullable Output<List<BucketInventoryConfigurationArgs>> inventoryConfigurations;
        private @Nullable Output<BucketLifecycleConfigurationArgs> lifecycleConfiguration;
        private @Nullable Output<BucketLoggingConfigurationArgs> loggingConfiguration;
        private @Nullable Output<List<BucketMetricsConfigurationArgs>> metricsConfigurations;
        private @Nullable Output<BucketNotificationConfigurationArgs> notificationConfiguration;
        private @Nullable Output<BucketObjectLockConfigurationArgs> objectLockConfiguration;
        private @Nullable Output<Boolean> objectLockEnabled;
        private @Nullable Output<BucketOwnershipControlsArgs> ownershipControls;
        private @Nullable Output<BucketPublicAccessBlockConfigurationArgs> publicAccessBlockConfiguration;
        private @Nullable Output<BucketReplicationConfigurationArgs> replicationConfiguration;
        private @Nullable Output<List<BucketTagArgs>> tags;
        private @Nullable Output<BucketVersioningConfigurationArgs> versioningConfiguration;
        private @Nullable Output<BucketWebsiteConfigurationArgs> websiteConfiguration;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accelerateConfiguration = defaults.accelerateConfiguration;
    	      this.accessControl = defaults.accessControl;
    	      this.analyticsConfigurations = defaults.analyticsConfigurations;
    	      this.bucketEncryption = defaults.bucketEncryption;
    	      this.bucketName = defaults.bucketName;
    	      this.corsConfiguration = defaults.corsConfiguration;
    	      this.intelligentTieringConfigurations = defaults.intelligentTieringConfigurations;
    	      this.inventoryConfigurations = defaults.inventoryConfigurations;
    	      this.lifecycleConfiguration = defaults.lifecycleConfiguration;
    	      this.loggingConfiguration = defaults.loggingConfiguration;
    	      this.metricsConfigurations = defaults.metricsConfigurations;
    	      this.notificationConfiguration = defaults.notificationConfiguration;
    	      this.objectLockConfiguration = defaults.objectLockConfiguration;
    	      this.objectLockEnabled = defaults.objectLockEnabled;
    	      this.ownershipControls = defaults.ownershipControls;
    	      this.publicAccessBlockConfiguration = defaults.publicAccessBlockConfiguration;
    	      this.replicationConfiguration = defaults.replicationConfiguration;
    	      this.tags = defaults.tags;
    	      this.versioningConfiguration = defaults.versioningConfiguration;
    	      this.websiteConfiguration = defaults.websiteConfiguration;
        }

        public Builder accelerateConfiguration(@Nullable Output<BucketAccelerateConfigurationArgs> accelerateConfiguration) {
            this.accelerateConfiguration = accelerateConfiguration;
            return this;
        }

        public Builder accelerateConfiguration(@Nullable BucketAccelerateConfigurationArgs accelerateConfiguration) {
            this.accelerateConfiguration = Output.ofNullable(accelerateConfiguration);
            return this;
        }

        public Builder accessControl(@Nullable Output<BucketAccessControl> accessControl) {
            this.accessControl = accessControl;
            return this;
        }

        public Builder accessControl(@Nullable BucketAccessControl accessControl) {
            this.accessControl = Output.ofNullable(accessControl);
            return this;
        }

        public Builder analyticsConfigurations(@Nullable Output<List<BucketAnalyticsConfigurationArgs>> analyticsConfigurations) {
            this.analyticsConfigurations = analyticsConfigurations;
            return this;
        }

        public Builder analyticsConfigurations(@Nullable List<BucketAnalyticsConfigurationArgs> analyticsConfigurations) {
            this.analyticsConfigurations = Output.ofNullable(analyticsConfigurations);
            return this;
        }

        public Builder bucketEncryption(@Nullable Output<BucketEncryptionArgs> bucketEncryption) {
            this.bucketEncryption = bucketEncryption;
            return this;
        }

        public Builder bucketEncryption(@Nullable BucketEncryptionArgs bucketEncryption) {
            this.bucketEncryption = Output.ofNullable(bucketEncryption);
            return this;
        }

        public Builder bucketName(@Nullable Output<String> bucketName) {
            this.bucketName = bucketName;
            return this;
        }

        public Builder bucketName(@Nullable String bucketName) {
            this.bucketName = Output.ofNullable(bucketName);
            return this;
        }

        public Builder corsConfiguration(@Nullable Output<BucketCorsConfigurationArgs> corsConfiguration) {
            this.corsConfiguration = corsConfiguration;
            return this;
        }

        public Builder corsConfiguration(@Nullable BucketCorsConfigurationArgs corsConfiguration) {
            this.corsConfiguration = Output.ofNullable(corsConfiguration);
            return this;
        }

        public Builder intelligentTieringConfigurations(@Nullable Output<List<BucketIntelligentTieringConfigurationArgs>> intelligentTieringConfigurations) {
            this.intelligentTieringConfigurations = intelligentTieringConfigurations;
            return this;
        }

        public Builder intelligentTieringConfigurations(@Nullable List<BucketIntelligentTieringConfigurationArgs> intelligentTieringConfigurations) {
            this.intelligentTieringConfigurations = Output.ofNullable(intelligentTieringConfigurations);
            return this;
        }

        public Builder inventoryConfigurations(@Nullable Output<List<BucketInventoryConfigurationArgs>> inventoryConfigurations) {
            this.inventoryConfigurations = inventoryConfigurations;
            return this;
        }

        public Builder inventoryConfigurations(@Nullable List<BucketInventoryConfigurationArgs> inventoryConfigurations) {
            this.inventoryConfigurations = Output.ofNullable(inventoryConfigurations);
            return this;
        }

        public Builder lifecycleConfiguration(@Nullable Output<BucketLifecycleConfigurationArgs> lifecycleConfiguration) {
            this.lifecycleConfiguration = lifecycleConfiguration;
            return this;
        }

        public Builder lifecycleConfiguration(@Nullable BucketLifecycleConfigurationArgs lifecycleConfiguration) {
            this.lifecycleConfiguration = Output.ofNullable(lifecycleConfiguration);
            return this;
        }

        public Builder loggingConfiguration(@Nullable Output<BucketLoggingConfigurationArgs> loggingConfiguration) {
            this.loggingConfiguration = loggingConfiguration;
            return this;
        }

        public Builder loggingConfiguration(@Nullable BucketLoggingConfigurationArgs loggingConfiguration) {
            this.loggingConfiguration = Output.ofNullable(loggingConfiguration);
            return this;
        }

        public Builder metricsConfigurations(@Nullable Output<List<BucketMetricsConfigurationArgs>> metricsConfigurations) {
            this.metricsConfigurations = metricsConfigurations;
            return this;
        }

        public Builder metricsConfigurations(@Nullable List<BucketMetricsConfigurationArgs> metricsConfigurations) {
            this.metricsConfigurations = Output.ofNullable(metricsConfigurations);
            return this;
        }

        public Builder notificationConfiguration(@Nullable Output<BucketNotificationConfigurationArgs> notificationConfiguration) {
            this.notificationConfiguration = notificationConfiguration;
            return this;
        }

        public Builder notificationConfiguration(@Nullable BucketNotificationConfigurationArgs notificationConfiguration) {
            this.notificationConfiguration = Output.ofNullable(notificationConfiguration);
            return this;
        }

        public Builder objectLockConfiguration(@Nullable Output<BucketObjectLockConfigurationArgs> objectLockConfiguration) {
            this.objectLockConfiguration = objectLockConfiguration;
            return this;
        }

        public Builder objectLockConfiguration(@Nullable BucketObjectLockConfigurationArgs objectLockConfiguration) {
            this.objectLockConfiguration = Output.ofNullable(objectLockConfiguration);
            return this;
        }

        public Builder objectLockEnabled(@Nullable Output<Boolean> objectLockEnabled) {
            this.objectLockEnabled = objectLockEnabled;
            return this;
        }

        public Builder objectLockEnabled(@Nullable Boolean objectLockEnabled) {
            this.objectLockEnabled = Output.ofNullable(objectLockEnabled);
            return this;
        }

        public Builder ownershipControls(@Nullable Output<BucketOwnershipControlsArgs> ownershipControls) {
            this.ownershipControls = ownershipControls;
            return this;
        }

        public Builder ownershipControls(@Nullable BucketOwnershipControlsArgs ownershipControls) {
            this.ownershipControls = Output.ofNullable(ownershipControls);
            return this;
        }

        public Builder publicAccessBlockConfiguration(@Nullable Output<BucketPublicAccessBlockConfigurationArgs> publicAccessBlockConfiguration) {
            this.publicAccessBlockConfiguration = publicAccessBlockConfiguration;
            return this;
        }

        public Builder publicAccessBlockConfiguration(@Nullable BucketPublicAccessBlockConfigurationArgs publicAccessBlockConfiguration) {
            this.publicAccessBlockConfiguration = Output.ofNullable(publicAccessBlockConfiguration);
            return this;
        }

        public Builder replicationConfiguration(@Nullable Output<BucketReplicationConfigurationArgs> replicationConfiguration) {
            this.replicationConfiguration = replicationConfiguration;
            return this;
        }

        public Builder replicationConfiguration(@Nullable BucketReplicationConfigurationArgs replicationConfiguration) {
            this.replicationConfiguration = Output.ofNullable(replicationConfiguration);
            return this;
        }

        public Builder tags(@Nullable Output<List<BucketTagArgs>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable List<BucketTagArgs> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }

        public Builder versioningConfiguration(@Nullable Output<BucketVersioningConfigurationArgs> versioningConfiguration) {
            this.versioningConfiguration = versioningConfiguration;
            return this;
        }

        public Builder versioningConfiguration(@Nullable BucketVersioningConfigurationArgs versioningConfiguration) {
            this.versioningConfiguration = Output.ofNullable(versioningConfiguration);
            return this;
        }

        public Builder websiteConfiguration(@Nullable Output<BucketWebsiteConfigurationArgs> websiteConfiguration) {
            this.websiteConfiguration = websiteConfiguration;
            return this;
        }

        public Builder websiteConfiguration(@Nullable BucketWebsiteConfigurationArgs websiteConfiguration) {
            this.websiteConfiguration = Output.ofNullable(websiteConfiguration);
            return this;
        }
        public BucketArgs build() {
            return new BucketArgs(accelerateConfiguration, accessControl, analyticsConfigurations, bucketEncryption, bucketName, corsConfiguration, intelligentTieringConfigurations, inventoryConfigurations, lifecycleConfiguration, loggingConfiguration, metricsConfigurations, notificationConfiguration, objectLockConfiguration, objectLockEnabled, ownershipControls, publicAccessBlockConfiguration, replicationConfiguration, tags, versioningConfiguration, websiteConfiguration);
        }
    }
}
