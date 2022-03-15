// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.migrate.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Gets or sets the tags.
 * 
 */
public final class MigrateProjectResponseTags extends io.pulumi.resources.InvokeArgs {

    public static final MigrateProjectResponseTags Empty = new MigrateProjectResponseTags();

    @Import(name="additionalProperties")
      private final @Nullable String additionalProperties;

    public Optional<String> getAdditionalProperties() {
        return this.additionalProperties == null ? Optional.empty() : Optional.ofNullable(this.additionalProperties);
    }

    public MigrateProjectResponseTags(@Nullable String additionalProperties) {
        this.additionalProperties = additionalProperties;
    }

    private MigrateProjectResponseTags() {
        this.additionalProperties = null;
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
