// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityinsights.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class InsightsTableResultResponseColumns {
    /**
     * the name of the colum
     * 
     */
    private final @Nullable String name;
    /**
     * the type of the colum
     * 
     */
    private final @Nullable String type;

    @OutputCustomType.Constructor({"name","type"})
    private InsightsTableResultResponseColumns(
        @Nullable String name,
        @Nullable String type) {
        this.name = name;
        this.type = type;
    }

    /**
     * the name of the colum
     * 
     */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * the type of the colum
     * 
     */
    public Optional<String> getType() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InsightsTableResultResponseColumns defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String name;
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(InsightsTableResultResponseColumns defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.type = defaults.type;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = type;
            return this;
        }
        public InsightsTableResultResponseColumns build() {
            return new InsightsTableResultResponseColumns(name, type);
        }
    }
}
