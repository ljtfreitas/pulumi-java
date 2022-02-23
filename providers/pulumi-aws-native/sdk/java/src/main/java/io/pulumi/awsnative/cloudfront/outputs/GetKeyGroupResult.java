// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudfront.outputs;

import io.pulumi.awsnative.cloudfront.outputs.KeyGroupConfig;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetKeyGroupResult {
    private final @Nullable String id;
    private final @Nullable KeyGroupConfig keyGroupConfig;
    private final @Nullable String lastModifiedTime;

    @OutputCustomType.Constructor({"id","keyGroupConfig","lastModifiedTime"})
    private GetKeyGroupResult(
        @Nullable String id,
        @Nullable KeyGroupConfig keyGroupConfig,
        @Nullable String lastModifiedTime) {
        this.id = id;
        this.keyGroupConfig = keyGroupConfig;
        this.lastModifiedTime = lastModifiedTime;
    }

    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    public Optional<KeyGroupConfig> getKeyGroupConfig() {
        return Optional.ofNullable(this.keyGroupConfig);
    }
    public Optional<String> getLastModifiedTime() {
        return Optional.ofNullable(this.lastModifiedTime);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetKeyGroupResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String id;
        private @Nullable KeyGroupConfig keyGroupConfig;
        private @Nullable String lastModifiedTime;

        public Builder() {
    	      // Empty
        }

        public Builder(GetKeyGroupResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.keyGroupConfig = defaults.keyGroupConfig;
    	      this.lastModifiedTime = defaults.lastModifiedTime;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setKeyGroupConfig(@Nullable KeyGroupConfig keyGroupConfig) {
            this.keyGroupConfig = keyGroupConfig;
            return this;
        }

        public Builder setLastModifiedTime(@Nullable String lastModifiedTime) {
            this.lastModifiedTime = lastModifiedTime;
            return this;
        }
        public GetKeyGroupResult build() {
            return new GetKeyGroupResult(id, keyGroupConfig, lastModifiedTime);
        }
    }
}
