// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotsitewise.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AssetModelAttribute {
    private final @Nullable String defaultValue;

    @OutputCustomType.Constructor({"defaultValue"})
    private AssetModelAttribute(@Nullable String defaultValue) {
        this.defaultValue = defaultValue;
    }

    public Optional<String> getDefaultValue() {
        return Optional.ofNullable(this.defaultValue);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AssetModelAttribute defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String defaultValue;

        public Builder() {
    	      // Empty
        }

        public Builder(AssetModelAttribute defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultValue = defaults.defaultValue;
        }

        public Builder setDefaultValue(@Nullable String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }

        public AssetModelAttribute build() {
            return new AssetModelAttribute(defaultValue);
        }
    }
}