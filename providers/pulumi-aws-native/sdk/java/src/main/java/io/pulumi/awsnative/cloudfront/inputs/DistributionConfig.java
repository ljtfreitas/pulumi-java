// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudfront.inputs;

import io.pulumi.awsnative.cloudfront.inputs.DistributionCacheBehavior;
import io.pulumi.awsnative.cloudfront.inputs.DistributionCustomErrorResponse;
import io.pulumi.awsnative.cloudfront.inputs.DistributionDefaultCacheBehavior;
import io.pulumi.awsnative.cloudfront.inputs.DistributionLegacyCustomOrigin;
import io.pulumi.awsnative.cloudfront.inputs.DistributionLegacyS3Origin;
import io.pulumi.awsnative.cloudfront.inputs.DistributionLogging;
import io.pulumi.awsnative.cloudfront.inputs.DistributionOrigin;
import io.pulumi.awsnative.cloudfront.inputs.DistributionOriginGroups;
import io.pulumi.awsnative.cloudfront.inputs.DistributionRestrictions;
import io.pulumi.awsnative.cloudfront.inputs.DistributionViewerCertificate;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DistributionConfig extends io.pulumi.resources.InvokeArgs {

    public static final DistributionConfig Empty = new DistributionConfig();

    @Import(name="aliases")
      private final @Nullable List<String> aliases;

    public List<String> getAliases() {
        return this.aliases == null ? List.of() : this.aliases;
    }

    @Import(name="cNAMEs")
      private final @Nullable List<String> cNAMEs;

    public List<String> getCNAMEs() {
        return this.cNAMEs == null ? List.of() : this.cNAMEs;
    }

    @Import(name="cacheBehaviors")
      private final @Nullable List<DistributionCacheBehavior> cacheBehaviors;

    public List<DistributionCacheBehavior> getCacheBehaviors() {
        return this.cacheBehaviors == null ? List.of() : this.cacheBehaviors;
    }

    @Import(name="comment")
      private final @Nullable String comment;

    public Optional<String> getComment() {
        return this.comment == null ? Optional.empty() : Optional.ofNullable(this.comment);
    }

    @Import(name="customErrorResponses")
      private final @Nullable List<DistributionCustomErrorResponse> customErrorResponses;

    public List<DistributionCustomErrorResponse> getCustomErrorResponses() {
        return this.customErrorResponses == null ? List.of() : this.customErrorResponses;
    }

    @Import(name="customOrigin")
      private final @Nullable DistributionLegacyCustomOrigin customOrigin;

    public Optional<DistributionLegacyCustomOrigin> getCustomOrigin() {
        return this.customOrigin == null ? Optional.empty() : Optional.ofNullable(this.customOrigin);
    }

    @Import(name="defaultCacheBehavior")
      private final @Nullable DistributionDefaultCacheBehavior defaultCacheBehavior;

    public Optional<DistributionDefaultCacheBehavior> getDefaultCacheBehavior() {
        return this.defaultCacheBehavior == null ? Optional.empty() : Optional.ofNullable(this.defaultCacheBehavior);
    }

    @Import(name="defaultRootObject")
      private final @Nullable String defaultRootObject;

    public Optional<String> getDefaultRootObject() {
        return this.defaultRootObject == null ? Optional.empty() : Optional.ofNullable(this.defaultRootObject);
    }

    @Import(name="enabled", required=true)
      private final Boolean enabled;

    public Boolean getEnabled() {
        return this.enabled;
    }

    @Import(name="httpVersion")
      private final @Nullable String httpVersion;

    public Optional<String> getHttpVersion() {
        return this.httpVersion == null ? Optional.empty() : Optional.ofNullable(this.httpVersion);
    }

    @Import(name="iPV6Enabled")
      private final @Nullable Boolean iPV6Enabled;

    public Optional<Boolean> getIPV6Enabled() {
        return this.iPV6Enabled == null ? Optional.empty() : Optional.ofNullable(this.iPV6Enabled);
    }

    @Import(name="logging")
      private final @Nullable DistributionLogging logging;

    public Optional<DistributionLogging> getLogging() {
        return this.logging == null ? Optional.empty() : Optional.ofNullable(this.logging);
    }

    @Import(name="originGroups")
      private final @Nullable DistributionOriginGroups originGroups;

    public Optional<DistributionOriginGroups> getOriginGroups() {
        return this.originGroups == null ? Optional.empty() : Optional.ofNullable(this.originGroups);
    }

    @Import(name="origins")
      private final @Nullable List<DistributionOrigin> origins;

    public List<DistributionOrigin> getOrigins() {
        return this.origins == null ? List.of() : this.origins;
    }

    @Import(name="priceClass")
      private final @Nullable String priceClass;

    public Optional<String> getPriceClass() {
        return this.priceClass == null ? Optional.empty() : Optional.ofNullable(this.priceClass);
    }

    @Import(name="restrictions")
      private final @Nullable DistributionRestrictions restrictions;

    public Optional<DistributionRestrictions> getRestrictions() {
        return this.restrictions == null ? Optional.empty() : Optional.ofNullable(this.restrictions);
    }

    @Import(name="s3Origin")
      private final @Nullable DistributionLegacyS3Origin s3Origin;

    public Optional<DistributionLegacyS3Origin> getS3Origin() {
        return this.s3Origin == null ? Optional.empty() : Optional.ofNullable(this.s3Origin);
    }

    @Import(name="viewerCertificate")
      private final @Nullable DistributionViewerCertificate viewerCertificate;

    public Optional<DistributionViewerCertificate> getViewerCertificate() {
        return this.viewerCertificate == null ? Optional.empty() : Optional.ofNullable(this.viewerCertificate);
    }

    @Import(name="webACLId")
      private final @Nullable String webACLId;

    public Optional<String> getWebACLId() {
        return this.webACLId == null ? Optional.empty() : Optional.ofNullable(this.webACLId);
    }

    public DistributionConfig(
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
        this.enabled = Objects.requireNonNull(enabled, "expected parameter 'enabled' to be non-null");
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

    private DistributionConfig() {
        this.aliases = List.of();
        this.cNAMEs = List.of();
        this.cacheBehaviors = List.of();
        this.comment = null;
        this.customErrorResponses = List.of();
        this.customOrigin = null;
        this.defaultCacheBehavior = null;
        this.defaultRootObject = null;
        this.enabled = null;
        this.httpVersion = null;
        this.iPV6Enabled = null;
        this.logging = null;
        this.originGroups = null;
        this.origins = List.of();
        this.priceClass = null;
        this.restrictions = null;
        this.s3Origin = null;
        this.viewerCertificate = null;
        this.webACLId = null;
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

        public Builder aliases(@Nullable List<String> aliases) {
            this.aliases = aliases;
            return this;
        }

        public Builder cNAMEs(@Nullable List<String> cNAMEs) {
            this.cNAMEs = cNAMEs;
            return this;
        }

        public Builder cacheBehaviors(@Nullable List<DistributionCacheBehavior> cacheBehaviors) {
            this.cacheBehaviors = cacheBehaviors;
            return this;
        }

        public Builder comment(@Nullable String comment) {
            this.comment = comment;
            return this;
        }

        public Builder customErrorResponses(@Nullable List<DistributionCustomErrorResponse> customErrorResponses) {
            this.customErrorResponses = customErrorResponses;
            return this;
        }

        public Builder customOrigin(@Nullable DistributionLegacyCustomOrigin customOrigin) {
            this.customOrigin = customOrigin;
            return this;
        }

        public Builder defaultCacheBehavior(@Nullable DistributionDefaultCacheBehavior defaultCacheBehavior) {
            this.defaultCacheBehavior = defaultCacheBehavior;
            return this;
        }

        public Builder defaultRootObject(@Nullable String defaultRootObject) {
            this.defaultRootObject = defaultRootObject;
            return this;
        }

        public Builder enabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }

        public Builder httpVersion(@Nullable String httpVersion) {
            this.httpVersion = httpVersion;
            return this;
        }

        public Builder iPV6Enabled(@Nullable Boolean iPV6Enabled) {
            this.iPV6Enabled = iPV6Enabled;
            return this;
        }

        public Builder logging(@Nullable DistributionLogging logging) {
            this.logging = logging;
            return this;
        }

        public Builder originGroups(@Nullable DistributionOriginGroups originGroups) {
            this.originGroups = originGroups;
            return this;
        }

        public Builder origins(@Nullable List<DistributionOrigin> origins) {
            this.origins = origins;
            return this;
        }

        public Builder priceClass(@Nullable String priceClass) {
            this.priceClass = priceClass;
            return this;
        }

        public Builder restrictions(@Nullable DistributionRestrictions restrictions) {
            this.restrictions = restrictions;
            return this;
        }

        public Builder s3Origin(@Nullable DistributionLegacyS3Origin s3Origin) {
            this.s3Origin = s3Origin;
            return this;
        }

        public Builder viewerCertificate(@Nullable DistributionViewerCertificate viewerCertificate) {
            this.viewerCertificate = viewerCertificate;
            return this;
        }

        public Builder webACLId(@Nullable String webACLId) {
            this.webACLId = webACLId;
            return this;
        }
        public DistributionConfig build() {
            return new DistributionConfig(aliases, cNAMEs, cacheBehaviors, comment, customErrorResponses, customOrigin, defaultCacheBehavior, defaultRootObject, enabled, httpVersion, iPV6Enabled, logging, originGroups, origins, priceClass, restrictions, s3Origin, viewerCertificate, webACLId);
        }
    }
}
