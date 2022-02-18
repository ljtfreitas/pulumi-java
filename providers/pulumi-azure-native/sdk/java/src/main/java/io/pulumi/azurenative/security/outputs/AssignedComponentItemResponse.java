// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AssignedComponentItemResponse {
    /**
     * unique key to a security assessment object
     * 
     */
    private final @Nullable String key;

    @OutputCustomType.Constructor({"key"})
    private AssignedComponentItemResponse(@Nullable String key) {
        this.key = key;
    }

    /**
     * unique key to a security assessment object
     * 
     */
    public Optional<String> getKey() {
        return Optional.ofNullable(this.key);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AssignedComponentItemResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String key;

        public Builder() {
    	      // Empty
        }

        public Builder(AssignedComponentItemResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
        }

        public Builder setKey(@Nullable String key) {
            this.key = key;
            return this;
        }

        public AssignedComponentItemResponse build() {
            return new AssignedComponentItemResponse(key);
        }
    }
}
