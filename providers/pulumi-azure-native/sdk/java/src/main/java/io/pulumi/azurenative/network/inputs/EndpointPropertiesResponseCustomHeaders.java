// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Custom header name and value.
 * 
 */
public final class EndpointPropertiesResponseCustomHeaders extends io.pulumi.resources.InvokeArgs {

    public static final EndpointPropertiesResponseCustomHeaders Empty = new EndpointPropertiesResponseCustomHeaders();

    /**
     * Header name.
     * 
     */
    @Import(name="name")
      private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    /**
     * Header value.
     * 
     */
    @Import(name="value")
      private final @Nullable String value;

    public Optional<String> getValue() {
        return this.value == null ? Optional.empty() : Optional.ofNullable(this.value);
    }

    public EndpointPropertiesResponseCustomHeaders(
        @Nullable String name,
        @Nullable String value) {
        this.name = name;
        this.value = value;
    }

    private EndpointPropertiesResponseCustomHeaders() {
        this.name = null;
        this.value = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointPropertiesResponseCustomHeaders defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String name;
        private @Nullable String value;

        public Builder() {
    	      // Empty
        }

        public Builder(EndpointPropertiesResponseCustomHeaders defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.value = defaults.value;
        }

        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder value(@Nullable String value) {
            this.value = value;
            return this;
        }
        public EndpointPropertiesResponseCustomHeaders build() {
            return new EndpointPropertiesResponseCustomHeaders(name, value);
        }
    }
}
