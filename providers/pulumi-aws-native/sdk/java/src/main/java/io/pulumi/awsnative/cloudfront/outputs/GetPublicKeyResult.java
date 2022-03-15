// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudfront.outputs;

import io.pulumi.awsnative.cloudfront.outputs.PublicKeyConfig;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetPublicKeyResult {
    private final @Nullable String createdTime;
    private final @Nullable String id;
    private final @Nullable PublicKeyConfig publicKeyConfig;

    @CustomType.Constructor
    private GetPublicKeyResult(
        @CustomType.Parameter("createdTime") @Nullable String createdTime,
        @CustomType.Parameter("id") @Nullable String id,
        @CustomType.Parameter("publicKeyConfig") @Nullable PublicKeyConfig publicKeyConfig) {
        this.createdTime = createdTime;
        this.id = id;
        this.publicKeyConfig = publicKeyConfig;
    }

    public Optional<String> getCreatedTime() {
        return Optional.ofNullable(this.createdTime);
    }
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    public Optional<PublicKeyConfig> getPublicKeyConfig() {
        return Optional.ofNullable(this.publicKeyConfig);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPublicKeyResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String createdTime;
        private @Nullable String id;
        private @Nullable PublicKeyConfig publicKeyConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPublicKeyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createdTime = defaults.createdTime;
    	      this.id = defaults.id;
    	      this.publicKeyConfig = defaults.publicKeyConfig;
        }

        public Builder createdTime(@Nullable String createdTime) {
            this.createdTime = createdTime;
            return this;
        }

        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder publicKeyConfig(@Nullable PublicKeyConfig publicKeyConfig) {
            this.publicKeyConfig = publicKeyConfig;
            return this;
        }
        public GetPublicKeyResult build() {
            return new GetPublicKeyResult(createdTime, id, publicKeyConfig);
        }
    }
}
