// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudfront.inputs;

import io.pulumi.awsnative.cloudfront.inputs.DistributionCustomOriginConfig;
import io.pulumi.awsnative.cloudfront.inputs.DistributionOriginCustomHeader;
import io.pulumi.awsnative.cloudfront.inputs.DistributionOriginShield;
import io.pulumi.awsnative.cloudfront.inputs.DistributionS3OriginConfig;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DistributionOrigin extends io.pulumi.resources.InvokeArgs {

    public static final DistributionOrigin Empty = new DistributionOrigin();

    @InputImport(name="connectionAttempts")
        private final @Nullable Integer connectionAttempts;

    public Optional<Integer> getConnectionAttempts() {
        return this.connectionAttempts == null ? Optional.empty() : Optional.ofNullable(this.connectionAttempts);
    }

    @InputImport(name="connectionTimeout")
        private final @Nullable Integer connectionTimeout;

    public Optional<Integer> getConnectionTimeout() {
        return this.connectionTimeout == null ? Optional.empty() : Optional.ofNullable(this.connectionTimeout);
    }

    @InputImport(name="customOriginConfig")
        private final @Nullable DistributionCustomOriginConfig customOriginConfig;

    public Optional<DistributionCustomOriginConfig> getCustomOriginConfig() {
        return this.customOriginConfig == null ? Optional.empty() : Optional.ofNullable(this.customOriginConfig);
    }

    @InputImport(name="domainName", required=true)
        private final String domainName;

    public String getDomainName() {
        return this.domainName;
    }

    @InputImport(name="id", required=true)
        private final String id;

    public String getId() {
        return this.id;
    }

    @InputImport(name="originCustomHeaders")
        private final @Nullable List<DistributionOriginCustomHeader> originCustomHeaders;

    public List<DistributionOriginCustomHeader> getOriginCustomHeaders() {
        return this.originCustomHeaders == null ? List.of() : this.originCustomHeaders;
    }

    @InputImport(name="originPath")
        private final @Nullable String originPath;

    public Optional<String> getOriginPath() {
        return this.originPath == null ? Optional.empty() : Optional.ofNullable(this.originPath);
    }

    @InputImport(name="originShield")
        private final @Nullable DistributionOriginShield originShield;

    public Optional<DistributionOriginShield> getOriginShield() {
        return this.originShield == null ? Optional.empty() : Optional.ofNullable(this.originShield);
    }

    @InputImport(name="s3OriginConfig")
        private final @Nullable DistributionS3OriginConfig s3OriginConfig;

    public Optional<DistributionS3OriginConfig> getS3OriginConfig() {
        return this.s3OriginConfig == null ? Optional.empty() : Optional.ofNullable(this.s3OriginConfig);
    }

    public DistributionOrigin(
        @Nullable Integer connectionAttempts,
        @Nullable Integer connectionTimeout,
        @Nullable DistributionCustomOriginConfig customOriginConfig,
        String domainName,
        String id,
        @Nullable List<DistributionOriginCustomHeader> originCustomHeaders,
        @Nullable String originPath,
        @Nullable DistributionOriginShield originShield,
        @Nullable DistributionS3OriginConfig s3OriginConfig) {
        this.connectionAttempts = connectionAttempts;
        this.connectionTimeout = connectionTimeout;
        this.customOriginConfig = customOriginConfig;
        this.domainName = Objects.requireNonNull(domainName, "expected parameter 'domainName' to be non-null");
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.originCustomHeaders = originCustomHeaders;
        this.originPath = originPath;
        this.originShield = originShield;
        this.s3OriginConfig = s3OriginConfig;
    }

    private DistributionOrigin() {
        this.connectionAttempts = null;
        this.connectionTimeout = null;
        this.customOriginConfig = null;
        this.domainName = null;
        this.id = null;
        this.originCustomHeaders = List.of();
        this.originPath = null;
        this.originShield = null;
        this.s3OriginConfig = null;
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
        private @Nullable DistributionCustomOriginConfig customOriginConfig;
        private String domainName;
        private String id;
        private @Nullable List<DistributionOriginCustomHeader> originCustomHeaders;
        private @Nullable String originPath;
        private @Nullable DistributionOriginShield originShield;
        private @Nullable DistributionS3OriginConfig s3OriginConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(DistributionOrigin defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectionAttempts = defaults.connectionAttempts;
    	      this.connectionTimeout = defaults.connectionTimeout;
    	      this.customOriginConfig = defaults.customOriginConfig;
    	      this.domainName = defaults.domainName;
    	      this.id = defaults.id;
    	      this.originCustomHeaders = defaults.originCustomHeaders;
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

        public Builder setCustomOriginConfig(@Nullable DistributionCustomOriginConfig customOriginConfig) {
            this.customOriginConfig = customOriginConfig;
            return this;
        }

        public Builder setDomainName(String domainName) {
            this.domainName = Objects.requireNonNull(domainName);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setOriginCustomHeaders(@Nullable List<DistributionOriginCustomHeader> originCustomHeaders) {
            this.originCustomHeaders = originCustomHeaders;
            return this;
        }

        public Builder setOriginPath(@Nullable String originPath) {
            this.originPath = originPath;
            return this;
        }

        public Builder setOriginShield(@Nullable DistributionOriginShield originShield) {
            this.originShield = originShield;
            return this;
        }

        public Builder setS3OriginConfig(@Nullable DistributionS3OriginConfig s3OriginConfig) {
            this.s3OriginConfig = s3OriginConfig;
            return this;
        }
        public DistributionOrigin build() {
            return new DistributionOrigin(connectionAttempts, connectionTimeout, customOriginConfig, domainName, id, originCustomHeaders, originPath, originShield, s3OriginConfig);
        }
    }
}
