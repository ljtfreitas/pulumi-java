// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class NameValuePairResponse {
    /**
     * Pair name.
     * 
     */
    private final @Nullable String name;
    /**
     * Pair value.
     * 
     */
    private final @Nullable String value;

    @OutputCustomType.Constructor({"name","value"})
    private NameValuePairResponse(
        @Nullable String name,
        @Nullable String value) {
        this.name = name;
        this.value = value;
    }

    /**
     * Pair name.
     * 
     */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * Pair value.
     * 
     */
    public Optional<String> getValue() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NameValuePairResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String name;
        private @Nullable String value;

        public Builder() {
    	      // Empty
        }

        public Builder(NameValuePairResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.value = defaults.value;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setValue(@Nullable String value) {
            this.value = value;
            return this;
        }

        public NameValuePairResponse build() {
            return new NameValuePairResponse(name, value);
        }
    }
}
