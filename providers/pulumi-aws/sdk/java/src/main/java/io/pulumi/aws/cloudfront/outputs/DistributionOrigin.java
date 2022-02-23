// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudfront.outputs;

import io.pulumi.aws.cloudfront.outputs.DistributionOriginCustomHeader;
import io.pulumi.aws.cloudfront.outputs.DistributionOriginCustomOriginConfig;
import io.pulumi.aws.cloudfront.outputs.DistributionOriginOriginShield;
import io.pulumi.aws.cloudfront.outputs.DistributionOriginS3OriginConfig;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DistributionOrigin {
    /**
     * The number of times that CloudFront attempts to connect to the origin. Must be between 1-3. Defaults to 3.
     * 
     */
    private final @Nullable Integer connectionAttempts;
    /**
     * The number of seconds that CloudFront waits when trying to establish a connection to the origin. Must be between 1-10. Defaults to 10.
     * 
     */
    private final @Nullable Integer connectionTimeout;
    /**
     * One or more sub-resources with `name` and
     * `value` parameters that specify header data that will be sent to the origin
     * (multiples allowed).
     * 
     */
    private final @Nullable List<DistributionOriginCustomHeader> customHeaders;
    /**
     * The CloudFront custom
     * origin configuration information. If an S3
     * origin is required, use `s3_origin_config` instead.
     * 
     */
    private final @Nullable DistributionOriginCustomOriginConfig customOriginConfig;
    /**
     * The DNS domain name of either the S3 bucket, or
     * web site of your custom origin.
     * 
     */
    private final String domainName;
    /**
     * The unique identifier of the member origin
     * 
     */
    private final String originId;
    /**
     * An optional element that causes CloudFront to
     * request your content from a directory in your Amazon S3 bucket or your
     * custom origin.
     * 
     */
    private final @Nullable String originPath;
    /**
     * The CloudFront Origin Shield
     * configuration information. Using Origin Shield can help reduce the load on your origin. For more information, see [Using Origin Shield](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/origin-shield.html) in the Amazon CloudFront Developer Guide.
     * 
     */
    private final @Nullable DistributionOriginOriginShield originShield;
    /**
     * The CloudFront S3 origin
     * configuration information. If a custom origin is required, use
     * `custom_origin_config` instead.
     * 
     */
    private final @Nullable DistributionOriginS3OriginConfig s3OriginConfig;

    @OutputCustomType.Constructor({"connectionAttempts","connectionTimeout","customHeaders","customOriginConfig","domainName","originId","originPath","originShield","s3OriginConfig"})
    private DistributionOrigin(
        @Nullable Integer connectionAttempts,
        @Nullable Integer connectionTimeout,
        @Nullable List<DistributionOriginCustomHeader> customHeaders,
        @Nullable DistributionOriginCustomOriginConfig customOriginConfig,
        String domainName,
        String originId,
        @Nullable String originPath,
        @Nullable DistributionOriginOriginShield originShield,
        @Nullable DistributionOriginS3OriginConfig s3OriginConfig) {
        this.connectionAttempts = connectionAttempts;
        this.connectionTimeout = connectionTimeout;
        this.customHeaders = customHeaders;
        this.customOriginConfig = customOriginConfig;
        this.domainName = Objects.requireNonNull(domainName);
        this.originId = Objects.requireNonNull(originId);
        this.originPath = originPath;
        this.originShield = originShield;
        this.s3OriginConfig = s3OriginConfig;
    }

    /**
     * The number of times that CloudFront attempts to connect to the origin. Must be between 1-3. Defaults to 3.
     * 
     */
    public Optional<Integer> getConnectionAttempts() {
        return Optional.ofNullable(this.connectionAttempts);
    }
    /**
     * The number of seconds that CloudFront waits when trying to establish a connection to the origin. Must be between 1-10. Defaults to 10.
     * 
     */
    public Optional<Integer> getConnectionTimeout() {
        return Optional.ofNullable(this.connectionTimeout);
    }
    /**
     * One or more sub-resources with `name` and
     * `value` parameters that specify header data that will be sent to the origin
     * (multiples allowed).
     * 
     */
    public List<DistributionOriginCustomHeader> getCustomHeaders() {
        return this.customHeaders == null ? List.of() : this.customHeaders;
    }
    /**
     * The CloudFront custom
     * origin configuration information. If an S3
     * origin is required, use `s3_origin_config` instead.
     * 
     */
    public Optional<DistributionOriginCustomOriginConfig> getCustomOriginConfig() {
        return Optional.ofNullable(this.customOriginConfig);
    }
    /**
     * The DNS domain name of either the S3 bucket, or
     * web site of your custom origin.
     * 
     */
    public String getDomainName() {
        return this.domainName;
    }
    /**
     * The unique identifier of the member origin
     * 
     */
    public String getOriginId() {
        return this.originId;
    }
    /**
     * An optional element that causes CloudFront to
     * request your content from a directory in your Amazon S3 bucket or your
     * custom origin.
     * 
     */
    public Optional<String> getOriginPath() {
        return Optional.ofNullable(this.originPath);
    }
    /**
     * The CloudFront Origin Shield
     * configuration information. Using Origin Shield can help reduce the load on your origin. For more information, see [Using Origin Shield](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/origin-shield.html) in the Amazon CloudFront Developer Guide.
     * 
     */
    public Optional<DistributionOriginOriginShield> getOriginShield() {
        return Optional.ofNullable(this.originShield);
    }
    /**
     * The CloudFront S3 origin
     * configuration information. If a custom origin is required, use
     * `custom_origin_config` instead.
     * 
     */
    public Optional<DistributionOriginS3OriginConfig> getS3OriginConfig() {
        return Optional.ofNullable(this.s3OriginConfig);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DistributionOrigin defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer connectionAttempts;
        private @Nullable Integer connectionTimeout;
        private @Nullable List<DistributionOriginCustomHeader> customHeaders;
        private @Nullable DistributionOriginCustomOriginConfig customOriginConfig;
        private String domainName;
        private String originId;
        private @Nullable String originPath;
        private @Nullable DistributionOriginOriginShield originShield;
        private @Nullable DistributionOriginS3OriginConfig s3OriginConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(DistributionOrigin defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectionAttempts = defaults.connectionAttempts;
    	      this.connectionTimeout = defaults.connectionTimeout;
    	      this.customHeaders = defaults.customHeaders;
    	      this.customOriginConfig = defaults.customOriginConfig;
    	      this.domainName = defaults.domainName;
    	      this.originId = defaults.originId;
    	      this.originPath = defaults.originPath;
    	      this.originShield = defaults.originShield;
    	      this.s3OriginConfig = defaults.s3OriginConfig;
        }

        public Builder setConnectionAttempts(@Nullable Integer connectionAttempts) {
            this.connectionAttempts = connectionAttempts;
            return this;
        }

        public Builder setConnectionTimeout(@Nullable Integer connectionTimeout) {
            this.connectionTimeout = connectionTimeout;
            return this;
        }

        public Builder setCustomHeaders(@Nullable List<DistributionOriginCustomHeader> customHeaders) {
            this.customHeaders = customHeaders;
            return this;
        }

        public Builder setCustomOriginConfig(@Nullable DistributionOriginCustomOriginConfig customOriginConfig) {
            this.customOriginConfig = customOriginConfig;
            return this;
        }

        public Builder setDomainName(String domainName) {
            this.domainName = Objects.requireNonNull(domainName);
            return this;
        }

        public Builder setOriginId(String originId) {
            this.originId = Objects.requireNonNull(originId);
            return this;
        }

        public Builder setOriginPath(@Nullable String originPath) {
            this.originPath = originPath;
            return this;
        }

        public Builder setOriginShield(@Nullable DistributionOriginOriginShield originShield) {
            this.originShield = originShield;
            return this;
        }

        public Builder setS3OriginConfig(@Nullable DistributionOriginS3OriginConfig s3OriginConfig) {
            this.s3OriginConfig = s3OriginConfig;
            return this;
        }
        public DistributionOrigin build() {
            return new DistributionOrigin(connectionAttempts, connectionTimeout, customHeaders, customOriginConfig, domainName, originId, originPath, originShield, s3OriginConfig);
        }
    }
}