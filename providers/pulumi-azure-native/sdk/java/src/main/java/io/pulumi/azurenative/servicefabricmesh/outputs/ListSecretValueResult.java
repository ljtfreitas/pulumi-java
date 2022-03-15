// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabricmesh.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ListSecretValueResult {
    /**
     * The actual value of the secret.
     * 
     */
    private final @Nullable String value;

    @CustomType.Constructor
    private ListSecretValueResult(@CustomType.Parameter("value") @Nullable String value) {
        this.value = value;
    }

    /**
     * The actual value of the secret.
     * 
    */
    public Optional<String> getValue() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListSecretValueResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String value;

        public Builder() {
    	      // Empty
        }

        public Builder(ListSecretValueResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.value = defaults.value;
        }

        public Builder value(@Nullable String value) {
            this.value = value;
            return this;
        }
        public ListSecretValueResult build() {
            return new ListSecretValueResult(value);
        }
    }
}
