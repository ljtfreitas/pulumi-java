// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A reference to a another resource
 * 
 */
public final class SubResource extends io.pulumi.resources.InvokeArgs {

    public static final SubResource Empty = new SubResource();

    /**
     * Resource Id.
     * 
     */
    @InputImport(name="id")
    private final @Nullable String id;

    public Optional<String> getId() {
        return this.id == null ? Optional.empty() : Optional.ofNullable(this.id);
    }

    public SubResource(@Nullable String id) {
        this.id = id;
    }

    private SubResource() {
        this.id = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SubResource defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String id;

        public Builder() {
    	      // Empty
        }

        public Builder(SubResource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public SubResource build() {
            return new SubResource(id);
        }
    }
}
