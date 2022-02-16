// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudfront.outputs;

import io.pulumi.awsnative.cloudfront.outputs.DistributionCacheBehavior;
import io.pulumi.awsnative.cloudfront.outputs.DistributionCustomErrorResponse;
import io.pulumi.awsnative.cloudfront.outputs.DistributionDefaultCacheBehavior;
import io.pulumi.awsnative.cloudfront.outputs.DistributionLegacyCustomOrigin;
import io.pulumi.awsnative.cloudfront.outputs.DistributionLegacyS3Origin;
import io.pulumi.awsnative.cloudfront.outputs.DistributionLogging;
import io.pulumi.awsnative.cloudfront.outputs.DistributionOrigin;
import io.pulumi.awsnative.cloudfront.outputs.DistributionOriginGroups;
import io.pulumi.awsnative.cloudfront.outputs.DistributionRestrictions;
import io.pulumi.awsnative.cloudfront.outputs.DistributionViewerCertificate;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DistributionConfig {
    private final @Nullable List<String> aliases;
    private final @Nullable List<String> cNAMEs;
    private final @Nullable List<DistributionCacheBehavior> cacheBehaviors;
    private final @Nullable String comment;
    private final @Nullable List<DistributionCustomErrorResponse> customErrorResponses;
    private final @Nullable DistributionLegacyCustomOrigin customOrigin;
    private final @Nullable DistributionDefaultCacheBehavior defaultCacheBehavior;
    private final @Nullable String defaultRootObject;
    private final Boolean enabled;
    private final @Nullable String httpVersion;
    private final @Nullable Boolean iPV6Enabled;
    private final @Nullable DistributionLogging logging;
    private final @Nullable DistributionOriginGroups originGroups;
    private final @Nullable List<DistributionOrigin> origins;
    private final @Nullable String priceClass;
    private final @Nullable DistributionRestrictions restrictions;
    private final @Nullable DistributionLegacyS3Origin s3Origin;
    private final @Nullable DistributionViewerCertificate viewerCertificate;
    private final @Nullable String webACLId;

    @OutputCustomType.Constructor({"aliases","cNAMEs","cacheBehaviors","comment","customErrorResponses","customOrigin","defaultCacheBehavior","defaultRootObject","enabled","httpVersion","iPV6Enabled","logging","originGroups","origins","priceClass","restrictions","s3Origin","viewerCertificate","webACLId"})
    private DistributionConfig(
        @Nullable List<String> aliases,
        @Nullable List<String> cNAMEs,
        @Nullable List<DistributionCacheBehavior> cacheBehaviors,
        @Nullable String comment,
        @Nullable List<DistributionCustomErrorResponse> customErrorResponses,
        @Nullable DistributionLegacyCustomOrigin customOrigin,
        @Nullable DistributionDefaultCacheBehavior defaultCacheBehavior,
        @Nullable String defaultRootObject,
        Boolean enabled,
        @Nullable String httpVersion,
        @Nullable Boolean iPV6Enabled,
        @Nullable DistributionLogging logging,
        @Nullable DistributionOriginGroups originGroups,
        @Nullable List<DistributionOrigin> origins,
        @Nullable String priceClass,
        @Nullable DistributionRestrictions restrictions,
        @Nullable DistributionLegacyS3Origin s3Origin,
        @Nullable DistributionViewerCertificate viewerCertificate,
        @Nullable String webACLId) {
        this.aliases = aliases;
        this.cNAMEs = cNAMEs;
        this.cacheBehaviors = cacheBehaviors;
        this.comment = comment;
        this.customErrorResponses = customErrorResponses;
        this.customOrigin = customOrigin;
        this.defaultCacheBehavior = defaultCacheBehavior;
        this.defaultRootObject = defaultRootObject;
        this.enabled = Objects.requireNonNull(enabled);
        this.httpVersion = httpVersion;
        this.iPV6Enabled = iPV6Enabled;
        this.logging = logging;
        this.originGroups = originGroups;
        this.origins = origins;
        this.priceClass = priceClass;
        this.restrictions = restrictions;
        this.s3Origin = s3Origin;
        this.viewerCertificate = viewerCertificate;
        this.webACLId = webACLId;
    }

    public List<String> getAliases() {
        return this.aliases == null ? List.of() : this.aliases;
    }
    public List<String> getCNAMEs() {
        return this.cNAMEs == null ? List.of() : this.cNAMEs;
    }
    public List<DistributionCacheBehavior> getCacheBehaviors() {
        return this.cacheBehaviors == null ? List.of() : this.cacheBehaviors;
    }
    public Optional<String> getComment() {
        return Optional.ofNullable(this.comment);
    }
    public List<DistributionCustomErrorResponse> getCustomErrorResponses() {
        return this.customErrorResponses == null ? List.of() : this.customErrorResponses;
    }
    public Optional<DistributionLegacyCustomOrigin> getCustomOrigin() {
        return Optional.ofNullable(this.customOrigin);
    }
    public Optional<DistributionDefaultCacheBehavior> getDefaultCacheBehavior() {
        return Optional.ofNullable(this.defaultCacheBehavior);
    }
    public Optional<String> getDefaultRootObject() {
        return Optional.ofNullable(this.defaultRootObject);
    }
    public Boolean getEnabled() {
        return this.enabled;
    }
    public Optional<String> getHttpVersion() {
        return Optional.ofNullable(this.httpVersion);
    }
    public Optional<Boolean> getIPV6Enabled() {
        return Optional.ofNullable(this.iPV6Enabled);
    }
    public Optional<DistributionLogging> getLogging() {
        return Optional.ofNullable(this.logging);
    }
    public Optional<DistributionOriginGroups> getOriginGroups() {
        return Optional.ofNullable(this.originGroups);
    }
    public List<DistributionOrigin> getOrigins() {
        return this.origins == null ? List.of() : this.origins;
    }
    public Optional<String> getPriceClass() {
        return Optional.ofNullable(this.priceClass);
    }
    public Optional<DistributionRestrictions> getRestrictions() {
        return Optional.ofNullable(this.restrictions);
    }
    public Optional<DistributionLegacyS3Origin> getS3Origin() {
        return Optional.ofNullable(this.s3Origin);
    }
    public Optional<DistributionViewerCertificate> getViewerCertificate() {
        return Optional.ofNullable(this.viewerCertificate);
    }
    public Optional<String> getWebACLId() {
        return Optional.ofNullable(this.webACLId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DistributionConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> aliases;
        private @Nullable List<String> cNAMEs;
        private @Nullable List<DistributionCacheBehavior> cacheBehaviors;
        private @Nullable String comment;
        private @Nullable List<DistributionCustomErrorResponse> customErrorResponses;
        private @Nullable DistributionLegacyCustomOrigin customOrigin;
        private @Nullable DistributionDefaultCacheBehavior defaultCacheBehavior;
        private @Nullable String defaultRootObject;
        private Boolean enabled;
        private @Nullable String httpVersion;
        private @Nullable Boolean iPV6Enabled;
        private @Nullable DistributionLogging logging;
        private @Nullable DistributionOriginGroups originGroups;
        private @Nullable List<DistributionOrigin> origins;
        private @Nullable String priceClass;
        private @Nullable DistributionRestrictions restrictions;
        private @Nullable DistributionLegacyS3Origin s3Origin;
        private @Nullable DistributionViewerCertificate viewerCertificate;
        private @Nullable String webACLId;

        public Builder() {
    	      // Empty
        }

        public Builder(DistributionConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aliases = defaults.aliases;
    	      this.cNAMEs = defaults.cNAMEs;
    	      this.cacheBehaviors = defaults.cacheBehaviors;
    	      this.comment = defaults.comment;
    	      this.customErrorResponses = defaults.customErrorResponses;
    	      this.customOrigin = defaults.customOrigin;
    	      this.defaultCacheBehavior = defaults.defaultCacheBehavior;
    	      this.defaultRootObject = defaults.defaultRootObject;
    	      this.enabled = defaults.enabled;
    	      this.httpVersion = defaults.httpVersion;
    	      this.iPV6Enabled = defaults.iPV6Enabled;
    	      this.logging = defaults.logging;
    	      this.originGroups = defaults.originGroups;
    	      this.origins = defaults.origins;
    	      this.priceClass = defaults.priceClass;
    	      this.restrictions = defaults.restrictions;
    	      this.s3Origin = defaults.s3Origin;
    	      this.viewerCertificate = defaults.viewerCertificate;
    	      this.webACLId = defaults.webACLId;
        }

        public Builder setAliases(@Nullable List<String> aliases) {
            this.aliases = aliases;
            return this;
        }

        public Builder setCNAMEs(@Nullable List<String> cNAMEs) {
            this.cNAMEs = cNAMEs;
            return this;
        }

        public Builder setCacheBehaviors(@Nullable List<DistributionCacheBehavior> cacheBehaviors) {
            this.cacheBehaviors = cacheBehaviors;
            return this;
        }

        public Builder setComment(@Nullable String comment) {
            this.comment = comment;
            return this;
        }

        public Builder setCustomErrorResponses(@Nullable List<DistributionCustomErrorResponse> customErrorResponses) {
            this.customErrorResponses = customErrorResponses;
            return this;
        }

        public Builder setCustomOrigin(@Nullable DistributionLegacyCustomOrigin customOrigin) {
            this.customOrigin = customOrigin;
            return this;
        }

        public Builder setDefaultCacheBehavior(@Nullable DistributionDefaultCacheBehavior defaultCacheBehavior) {
            this.defaultCacheBehavior = defaultCacheBehavior;
            return this;
        }

        public Builder setDefaultRootObject(@Nullable String defaultRootObject) {
            this.defaultRootObject = defaultRootObject;
            return this;
        }

        public Builder setEnabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }

        public Builder setHttpVersion(@Nullable String httpVersion) {
            this.httpVersion = httpVersion;
            return this;
        }

        public Builder setIPV6Enabled(@Nullable Boolean iPV6Enabled) {
            this.iPV6Enabled = iPV6Enabled;
            return this;
        }

        public Builder setLogging(@Nullable DistributionLogging logging) {
            this.logging = logging;
            return this;
        }

        public Builder setOriginGroups(@Nullable DistributionOriginGroups originGroups) {
            this.originGroups = originGroups;
            return this;
        }

        public Builder setOrigins(@Nullable List<DistributionOrigin> origins) {
            this.origins = origins;
            return this;
        }

        public Builder setPriceClass(@Nullable String priceClass) {
            this.priceClass = priceClass;
            return this;
        }

        public Builder setRestrictions(@Nullable DistributionRestrictions restrictions) {
            this.restrictions = restrictions;
            return this;
        }

        public Builder setS3Origin(@Nullable DistributionLegacyS3Origin s3Origin) {
            this.s3Origin = s3Origin;
            return this;
        }

        public Builder setViewerCertificate(@Nullable DistributionViewerCertificate viewerCertificate) {
            this.viewerCertificate = viewerCertificate;
            return this;
        }

        public Builder setWebACLId(@Nullable String webACLId) {
            this.webACLId = webACLId;
            return this;
        }

        public DistributionConfig build() {
            return new DistributionConfig(aliases, cNAMEs, cacheBehaviors, comment, customErrorResponses, customOrigin, defaultCacheBehavior, defaultRootObject, enabled, httpVersion, iPV6Enabled, logging, originGroups, origins, priceClass, restrictions, s3Origin, viewerCertificate, webACLId);
        }
    }
}