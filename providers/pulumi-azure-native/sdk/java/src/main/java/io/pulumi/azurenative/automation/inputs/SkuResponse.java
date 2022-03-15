// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.automation.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The account SKU.
 * 
 */
public final class SkuResponse extends io.pulumi.resources.InvokeArgs {

    public static final SkuResponse Empty = new SkuResponse();

    /**
     * Gets or sets the SKU capacity.
     * 
     */
    @Import(name="capacity")
      private final @Nullable Integer capacity;

    public Optional<Integer> getCapacity() {
        return this.capacity == null ? Optional.empty() : Optional.ofNullable(this.capacity);
    }

    /**
     * Gets or sets the SKU family.
     * 
     */
    @Import(name="family")
      private final @Nullable String family;

    public Optional<String> getFamily() {
        return this.family == null ? Optional.empty() : Optional.ofNullable(this.family);
    }

    /**
     * Gets or sets the SKU name of the account.
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    public SkuResponse(
        @Nullable Integer capacity,
        @Nullable String family,
        String name) {
        this.capacity = capacity;
        this.family = family;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private SkuResponse() {
        this.capacity = null;
        this.family = null;
        this.name = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SkuResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer capacity;
        private @Nullable String family;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(SkuResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capacity = defaults.capacity;
    	      this.family = defaults.family;
    	      this.name = defaults.name;
        }

        public Builder capacity(@Nullable Integer capacity) {
            this.capacity = capacity;
            return this;
        }

        public Builder family(@Nullable String family) {
            this.family = family;
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public SkuResponse build() {
            return new SkuResponse(capacity, family, name);
        }
    }
}
