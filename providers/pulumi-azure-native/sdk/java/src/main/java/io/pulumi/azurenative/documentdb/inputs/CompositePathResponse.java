// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CompositePathResponse extends io.pulumi.resources.InvokeArgs {

    public static final CompositePathResponse Empty = new CompositePathResponse();

    /**
     * Sort order for composite paths.
     * 
     */
    @InputImport(name="order")
    private final @Nullable String order;

    public Optional<String> getOrder() {
        return this.order == null ? Optional.empty() : Optional.ofNullable(this.order);
    }

    /**
     * The path for which the indexing behavior applies to. Index paths typically start with root and end with wildcard (/path/*)
     * 
     */
    @InputImport(name="path")
    private final @Nullable String path;

    public Optional<String> getPath() {
        return this.path == null ? Optional.empty() : Optional.ofNullable(this.path);
    }

    public CompositePathResponse(
        @Nullable String order,
        @Nullable String path) {
        this.order = order;
        this.path = path;
    }

    private CompositePathResponse() {
        this.order = null;
        this.path = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CompositePathResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String order;
        private @Nullable String path;

        public Builder() {
    	      // Empty
        }

        public Builder(CompositePathResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.order = defaults.order;
    	      this.path = defaults.path;
        }

        public Builder setOrder(@Nullable String order) {
            this.order = order;
            return this;
        }

        public Builder setPath(@Nullable String path) {
            this.path = path;
            return this;
        }

        public CompositePathResponse build() {
            return new CompositePathResponse(order, path);
        }
    }
}
