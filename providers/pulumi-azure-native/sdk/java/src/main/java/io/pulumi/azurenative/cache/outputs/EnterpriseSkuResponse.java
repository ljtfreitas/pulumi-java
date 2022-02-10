// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cache.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class EnterpriseSkuResponse {
    private final @Nullable Integer capacity;
    private final String name;

    @OutputCustomType.Constructor({"capacity","name"})
    private EnterpriseSkuResponse(
        @Nullable Integer capacity,
        String name) {
        this.capacity = capacity;
        this.name = Objects.requireNonNull(name);
    }

    public Optional<Integer> getCapacity() {
        return Optional.ofNullable(this.capacity);
    }
    public String getName() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnterpriseSkuResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer capacity;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(EnterpriseSkuResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capacity = defaults.capacity;
    	      this.name = defaults.name;
        }

        public Builder setCapacity(@Nullable Integer capacity) {
            this.capacity = capacity;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public EnterpriseSkuResponse build() {
            return new EnterpriseSkuResponse(capacity, name);
        }
    }
}