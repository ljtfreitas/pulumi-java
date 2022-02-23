// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.databrew.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DatasetS3Location {
    private final String bucket;
    private final @Nullable String key;

    @OutputCustomType.Constructor({"bucket","key"})
    private DatasetS3Location(
        String bucket,
        @Nullable String key) {
        this.bucket = Objects.requireNonNull(bucket);
        this.key = key;
    }

    public String getBucket() {
        return this.bucket;
    }
    public Optional<String> getKey() {
        return Optional.ofNullable(this.key);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatasetS3Location defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String bucket;
        private @Nullable String key;

        public Builder() {
    	      // Empty
        }

        public Builder(DatasetS3Location defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucket = defaults.bucket;
    	      this.key = defaults.key;
        }

        public Builder setBucket(String bucket) {
            this.bucket = Objects.requireNonNull(bucket);
            return this;
        }

        public Builder setKey(@Nullable String key) {
            this.key = key;
            return this;
        }
        public DatasetS3Location build() {
            return new DatasetS3Location(bucket, key);
        }
    }
}
