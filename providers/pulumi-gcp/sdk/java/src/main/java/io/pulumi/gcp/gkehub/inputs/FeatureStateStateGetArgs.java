// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.gkehub.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FeatureStateStateGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final FeatureStateStateGetArgs Empty = new FeatureStateStateGetArgs();

    @Import(name="code")
      private final @Nullable Output<String> code;

    public Output<String> getCode() {
        return this.code == null ? Output.empty() : this.code;
    }

    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    @Import(name="updateTime")
      private final @Nullable Output<String> updateTime;

    public Output<String> getUpdateTime() {
        return this.updateTime == null ? Output.empty() : this.updateTime;
    }

    public FeatureStateStateGetArgs(
        @Nullable Output<String> code,
        @Nullable Output<String> description,
        @Nullable Output<String> updateTime) {
        this.code = code;
        this.description = description;
        this.updateTime = updateTime;
    }

    private FeatureStateStateGetArgs() {
        this.code = Output.empty();
        this.description = Output.empty();
        this.updateTime = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FeatureStateStateGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> code;
        private @Nullable Output<String> description;
        private @Nullable Output<String> updateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(FeatureStateStateGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.code = defaults.code;
    	      this.description = defaults.description;
    	      this.updateTime = defaults.updateTime;
        }

        public Builder code(@Nullable Output<String> code) {
            this.code = code;
            return this;
        }

        public Builder code(@Nullable String code) {
            this.code = Output.ofNullable(code);
            return this;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }

        public Builder updateTime(@Nullable Output<String> updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        public Builder updateTime(@Nullable String updateTime) {
            this.updateTime = Output.ofNullable(updateTime);
            return this;
        }
        public FeatureStateStateGetArgs build() {
            return new FeatureStateStateGetArgs(code, description, updateTime);
        }
    }
}
