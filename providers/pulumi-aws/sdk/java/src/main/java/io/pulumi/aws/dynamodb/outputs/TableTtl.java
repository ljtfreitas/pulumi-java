// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.dynamodb.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class TableTtl {
    /**
     * The name of the table attribute to store the TTL timestamp in.
     * 
     */
    private final String attributeName;
    /**
     * Indicates whether ttl is enabled (true) or disabled (false).
     * 
     */
    private final @Nullable Boolean enabled;

    @OutputCustomType.Constructor({"attributeName","enabled"})
    private TableTtl(
        String attributeName,
        @Nullable Boolean enabled) {
        this.attributeName = Objects.requireNonNull(attributeName);
        this.enabled = enabled;
    }

    /**
     * The name of the table attribute to store the TTL timestamp in.
     * 
     */
    public String getAttributeName() {
        return this.attributeName;
    }
    /**
     * Indicates whether ttl is enabled (true) or disabled (false).
     * 
     */
    public Optional<Boolean> getEnabled() {
        return Optional.ofNullable(this.enabled);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TableTtl defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String attributeName;
        private @Nullable Boolean enabled;

        public Builder() {
    	      // Empty
        }

        public Builder(TableTtl defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attributeName = defaults.attributeName;
    	      this.enabled = defaults.enabled;
        }

        public Builder setAttributeName(String attributeName) {
            this.attributeName = Objects.requireNonNull(attributeName);
            return this;
        }

        public Builder setEnabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public TableTtl build() {
            return new TableTtl(attributeName, enabled);
        }
    }
}
