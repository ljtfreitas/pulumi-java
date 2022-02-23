// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudfront.inputs;

import io.pulumi.aws.cloudfront.inputs.DistributionOriginCustomHeaderGetArgs;
import io.pulumi.aws.cloudfront.inputs.DistributionOriginCustomOriginConfigGetArgs;
import io.pulumi.aws.cloudfront.inputs.DistributionOriginOriginShieldGetArgs;
import io.pulumi.aws.cloudfront.inputs.DistributionOriginS3OriginConfigGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DistributionOriginGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final DistributionOriginGetArgs Empty = new DistributionOriginGetArgs();

    /**
     * The number of times that CloudFront attempts to connect to the origin. Must be between 1-3. Defaults to 3.
     * 
     */
    @InputImport(name="connectionAttempts")
    private final @Nullable Input<Integer> connectionAttempts;

    public Input<Integer> getConnectionAttempts() {
        return this.connectionAttempts == null ? Input.empty() : this.connectionAttempts;
    }

    /**
     * The number of seconds that CloudFront waits when trying to establish a connection to the origin. Must be between 1-10. Defaults to 10.
     * 
     */
    @InputImport(name="connectionTimeout")
    private final @Nullable Input<Integer> connectionTimeout;

    public Input<Integer> getConnectionTimeout() {
        return this.connectionTimeout == null ? Input.empty() : this.connectionTimeout;
    }

    /**
     * One or more sub-resources with `name` and
     * `value` parameters that specify header data that will be sent to the origin
     * (multiples allowed).
     * 
     */
    @InputImport(name="customHeaders")
    private final @Nullable Input<List<DistributionOriginCustomHeaderGetArgs>> customHeaders;

    public Input<List<DistributionOriginCustomHeaderGetArgs>> getCustomHeaders() {
        return this.customHeaders == null ? Input.empty() : this.customHeaders;
    }

    /**
     * The CloudFront custom
     * origin configuration information. If an S3
     * origin is required, use `s3_origin_config` instead.
     * 
     */
    @InputImport(name="customOriginConfig")
    private final @Nullable Input<DistributionOriginCustomOriginConfigGetArgs> customOriginConfig;

    public Input<DistributionOriginCustomOriginConfigGetArgs> getCustomOriginConfig() {
        return this.customOriginConfig == null ? Input.empty() : this.customOriginConfig;
    }

    /**
     * The DNS domain name of either the S3 bucket, or
     * web site of your custom origin.
     * 
     */
    @InputImport(name="domainName", required=true)
    private final Input<String> domainName;

    public Input<String> getDomainName() {
        return this.domainName;
    }

    /**
     * The unique identifier of the member origin
     * 
     */
    @InputImport(name="originId", required=true)
    private final Input<String> originId;

    public Input<String> getOriginId() {
        return this.originId;
    }

    /**
     * An optional element that causes CloudFront to
     * request your content from a directory in your Amazon S3 bucket or your
     * custom origin.
     * 
     */
    @InputImport(name="originPath")
    private final @Nullable Input<String> originPath;

    public Input<String> getOriginPath() {
        return this.originPath == null ? Input.empty() : this.originPath;
    }

    /**
     * The CloudFront Origin Shield
     * configuration information. Using Origin Shield can help reduce the load on your origin. For more information, see [Using Origin Shield](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/origin-shield.html) in the Amazon CloudFront Developer Guide.
     * 
     */
    @InputImport(name="originShield")
    private final @Nullable Input<DistributionOriginOriginShieldGetArgs> originShield;

    public Input<DistributionOriginOriginShieldGetArgs> getOriginShield() {
        return this.originShield == null ? Input.empty() : this.originShield;
    }

    /**
     * The CloudFront S3 origin
     * configuration information. If a custom origin is required, use
     * `custom_origin_config` instead.
     * 
     */
    @InputImport(name="s3OriginConfig")
    private final @Nullable Input<DistributionOriginS3OriginConfigGetArgs> s3OriginConfig;

    public Input<DistributionOriginS3OriginConfigGetArgs> getS3OriginConfig() {
        return this.s3OriginConfig == null ? Input.empty() : this.s3OriginConfig;
    }

    public DistributionOriginGetArgs(
        @Nullable Input<Integer> connectionAttempts,
        @Nullable Input<Integer> connectionTimeout,
        @Nullable Input<List<DistributionOriginCustomHeaderGetArgs>> customHeaders,
        @Nullable Input<DistributionOriginCustomOriginConfigGetArgs> customOriginConfig,
        Input<String> domainName,
        Input<String> originId,
        @Nullable Input<String> originPath,
        @Nullable Input<DistributionOriginOriginShieldGetArgs> originShield,
        @Nullable Input<DistributionOriginS3OriginConfigGetArgs> s3OriginConfig) {
        this.connectionAttempts = connectionAttempts;
        this.connectionTimeout = connectionTimeout;
        this.customHeaders = customHeaders;
        this.customOriginConfig = customOriginConfig;
        this.domainName = Objects.requireNonNull(domainName, "expected parameter 'domainName' to be non-null");
        this.originId = Objects.requireNonNull(originId, "expected parameter 'originId' to be non-null");
        this.originPath = originPath;
        this.originShield = originShield;
        this.s3OriginConfig = s3OriginConfig;
    }

    private DistributionOriginGetArgs() {
        this.connectionAttempts = Input.empty();
        this.connectionTimeout = Input.empty();
        this.customHeaders = Input.empty();
        this.customOriginConfig = Input.empty();
        this.domainName = Input.empty();
        this.originId = Input.empty();
        this.originPath = Input.empty();
        this.originShield = Input.empty();
        this.s3OriginConfig = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DistributionOriginGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> connectionAttempts;
        private @Nullable Input<Integer> connectionTimeout;
        private @Nullable Input<List<DistributionOriginCustomHeaderGetArgs>> customHeaders;
        private @Nullable Input<DistributionOriginCustomOriginConfigGetArgs> customOriginConfig;
        private Input<String> domainName;
        private Input<String> originId;
        private @Nullable Input<String> originPath;
        private @Nullable Input<DistributionOriginOriginShieldGetArgs> originShield;
        private @Nullable Input<DistributionOriginS3OriginConfigGetArgs> s3OriginConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(DistributionOriginGetArgs defaults) {
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

        public Builder setConnectionAttempts(@Nullable Input<Integer> connectionAttempts) {
            this.connectionAttempts = connectionAttempts;
            return this;
        }

        public Builder setConnectionAttempts(@Nullable Integer connectionAttempts) {
            this.connectionAttempts = Input.ofNullable(connectionAttempts);
            return this;
        }

        public Builder setConnectionTimeout(@Nullable Input<Integer> connectionTimeout) {
            this.connectionTimeout = connectionTimeout;
            return this;
        }

        public Builder setConnectionTimeout(@Nullable Integer connectionTimeout) {
            this.connectionTimeout = Input.ofNullable(connectionTimeout);
            return this;
        }

        public Builder setCustomHeaders(@Nullable Input<List<DistributionOriginCustomHeaderGetArgs>> customHeaders) {
            this.customHeaders = customHeaders;
            return this;
        }

        public Builder setCustomHeaders(@Nullable List<DistributionOriginCustomHeaderGetArgs> customHeaders) {
            this.customHeaders = Input.ofNullable(customHeaders);
            return this;
        }

        public Builder setCustomOriginConfig(@Nullable Input<DistributionOriginCustomOriginConfigGetArgs> customOriginConfig) {
            this.customOriginConfig = customOriginConfig;
            return this;
        }

        public Builder setCustomOriginConfig(@Nullable DistributionOriginCustomOriginConfigGetArgs customOriginConfig) {
            this.customOriginConfig = Input.ofNullable(customOriginConfig);
            return this;
        }

        public Builder setDomainName(Input<String> domainName) {
            this.domainName = Objects.requireNonNull(domainName);
            return this;
        }

        public Builder setDomainName(String domainName) {
            this.domainName = Input.of(Objects.requireNonNull(domainName));
            return this;
        }

        public Builder setOriginId(Input<String> originId) {
            this.originId = Objects.requireNonNull(originId);
            return this;
        }

        public Builder setOriginId(String originId) {
            this.originId = Input.of(Objects.requireNonNull(originId));
            return this;
        }

        public Builder setOriginPath(@Nullable Input<String> originPath) {
            this.originPath = originPath;
            return this;
        }

        public Builder setOriginPath(@Nullable String originPath) {
            this.originPath = Input.ofNullable(originPath);
            return this;
        }

        public Builder setOriginShield(@Nullable Input<DistributionOriginOriginShieldGetArgs> originShield) {
            this.originShield = originShield;
            return this;
        }

        public Builder setOriginShield(@Nullable DistributionOriginOriginShieldGetArgs originShield) {
            this.originShield = Input.ofNullable(originShield);
            return this;
        }

        public Builder setS3OriginConfig(@Nullable Input<DistributionOriginS3OriginConfigGetArgs> s3OriginConfig) {
            this.s3OriginConfig = s3OriginConfig;
            return this;
        }

        public Builder setS3OriginConfig(@Nullable DistributionOriginS3OriginConfigGetArgs s3OriginConfig) {
            this.s3OriginConfig = Input.ofNullable(s3OriginConfig);
            return this;
        }
        public DistributionOriginGetArgs build() {
            return new DistributionOriginGetArgs(connectionAttempts, connectionTimeout, customHeaders, customOriginConfig, domainName, originId, originPath, originShield, s3OriginConfig);
        }
    }
}
