// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FeatureGroupOnlineStoreSecurityConfig {
    private final @Nullable String kmsKeyId;

    @CustomType.Constructor
    private FeatureGroupOnlineStoreSecurityConfig(@CustomType.Parameter("kmsKeyId") @Nullable String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    public Optional<String> getKmsKeyId() {
        return Optional.ofNullable(this.kmsKeyId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FeatureGroupOnlineStoreSecurityConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String kmsKeyId;

        public Builder() {
    	      // Empty
        }

        public Builder(FeatureGroupOnlineStoreSecurityConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kmsKeyId = defaults.kmsKeyId;
        }

        public Builder kmsKeyId(@Nullable String kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            return this;
        }
        public FeatureGroupOnlineStoreSecurityConfig build() {
            return new FeatureGroupOnlineStoreSecurityConfig(kmsKeyId);
        }
    }
}
