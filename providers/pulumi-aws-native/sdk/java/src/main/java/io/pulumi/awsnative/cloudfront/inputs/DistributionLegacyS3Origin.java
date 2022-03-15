// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudfront.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DistributionLegacyS3Origin extends io.pulumi.resources.InvokeArgs {

    public static final DistributionLegacyS3Origin Empty = new DistributionLegacyS3Origin();

    @Import(name="dNSName", required=true)
      private final String dNSName;

    public String getDNSName() {
        return this.dNSName;
    }

    @Import(name="originAccessIdentity")
      private final @Nullable String originAccessIdentity;

    public Optional<String> getOriginAccessIdentity() {
        return this.originAccessIdentity == null ? Optional.empty() : Optional.ofNullable(this.originAccessIdentity);
    }

    public DistributionLegacyS3Origin(
        String dNSName,
        @Nullable String originAccessIdentity) {
        this.dNSName = Objects.requireNonNull(dNSName, "expected parameter 'dNSName' to be non-null");
        this.originAccessIdentity = originAccessIdentity;
    }

    private DistributionLegacyS3Origin() {
        this.dNSName = null;
        this.originAccessIdentity = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DistributionLegacyS3Origin defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String dNSName;
        private @Nullable String originAccessIdentity;

        public Builder() {
    	      // Empty
        }

        public Builder(DistributionLegacyS3Origin defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dNSName = defaults.dNSName;
    	      this.originAccessIdentity = defaults.originAccessIdentity;
        }

        public Builder dNSName(String dNSName) {
            this.dNSName = Objects.requireNonNull(dNSName);
            return this;
        }

        public Builder originAccessIdentity(@Nullable String originAccessIdentity) {
            this.originAccessIdentity = originAccessIdentity;
            return this;
        }
        public DistributionLegacyS3Origin build() {
            return new DistributionLegacyS3Origin(dNSName, originAccessIdentity);
        }
    }
}
