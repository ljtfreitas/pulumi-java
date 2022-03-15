// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.migrate.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class MigrateProjectResponseTags {
    private final @Nullable String additionalProperties;

    @CustomType.Constructor
    private MigrateProjectResponseTags(@CustomType.Parameter("additionalProperties") @Nullable String additionalProperties) {
        this.additionalProperties = additionalProperties;
    }

    public Optional<String> getAdditionalProperties() {
        return Optional.ofNullable(this.additionalProperties);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MigrateProjectResponseTags defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String additionalProperties;

        public Builder() {
    	      // Empty
        }

        public Builder(MigrateProjectResponseTags defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalProperties = defaults.additionalProperties;
        }

        public Builder additionalProperties(@Nullable String additionalProperties) {
            this.additionalProperties = additionalProperties;
            return this;
        }
        public MigrateProjectResponseTags build() {
            return new MigrateProjectResponseTags(additionalProperties);
        }
    }
}
