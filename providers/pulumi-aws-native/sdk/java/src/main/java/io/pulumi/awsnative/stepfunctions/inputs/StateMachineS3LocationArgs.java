// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.stepfunctions.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class StateMachineS3LocationArgs extends io.pulumi.resources.ResourceArgs {

    public static final StateMachineS3LocationArgs Empty = new StateMachineS3LocationArgs();

    @InputImport(name="bucket", required=true)
        private final Input<String> bucket;

    public Input<String> getBucket() {
        return this.bucket;
    }

    @InputImport(name="key", required=true)
        private final Input<String> key;

    public Input<String> getKey() {
        return this.key;
    }

    @InputImport(name="version")
        private final @Nullable Input<String> version;

    public Input<String> getVersion() {
        return this.version == null ? Input.empty() : this.version;
    }

    public StateMachineS3LocationArgs(
        Input<String> bucket,
        Input<String> key,
        @Nullable Input<String> version) {
        this.bucket = Objects.requireNonNull(bucket, "expected parameter 'bucket' to be non-null");
        this.key = Objects.requireNonNull(key, "expected parameter 'key' to be non-null");
        this.version = version;
    }

    private StateMachineS3LocationArgs() {
        this.bucket = Input.empty();
        this.key = Input.empty();
        this.version = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StateMachineS3LocationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> bucket;
        private Input<String> key;
        private @Nullable Input<String> version;

        public Builder() {
    	      // Empty
        }

        public Builder(StateMachineS3LocationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucket = defaults.bucket;
    	      this.key = defaults.key;
    	      this.version = defaults.version;
        }

        public Builder setBucket(Input<String> bucket) {
            this.bucket = Objects.requireNonNull(bucket);
            return this;
        }

        public Builder setBucket(String bucket) {
            this.bucket = Input.of(Objects.requireNonNull(bucket));
            return this;
        }

        public Builder setKey(Input<String> key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }

        public Builder setKey(String key) {
            this.key = Input.of(Objects.requireNonNull(key));
            return this;
        }

        public Builder setVersion(@Nullable Input<String> version) {
            this.version = version;
            return this;
        }

        public Builder setVersion(@Nullable String version) {
            this.version = Input.ofNullable(version);
            return this;
        }
        public StateMachineS3LocationArgs build() {
            return new StateMachineS3LocationArgs(bucket, key, version);
        }
    }
}
