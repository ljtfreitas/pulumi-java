// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ListConnectionKeysResult {
    /**
     * Connection Key
     * 
     */
    private final @Nullable String connectionKey;
    /**
     * Tokens/Claim
     * 
     */
    private final @Nullable Map<String,Object> parameterValues;

    @OutputCustomType.Constructor({"connectionKey","parameterValues"})
    private ListConnectionKeysResult(
        @Nullable String connectionKey,
        @Nullable Map<String,Object> parameterValues) {
        this.connectionKey = connectionKey;
        this.parameterValues = parameterValues;
    }

    /**
     * Connection Key
     * 
     */
    public Optional<String> getConnectionKey() {
        return Optional.ofNullable(this.connectionKey);
    }
    /**
     * Tokens/Claim
     * 
     */
    public Map<String,Object> getParameterValues() {
        return this.parameterValues == null ? Map.of() : this.parameterValues;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListConnectionKeysResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String connectionKey;
        private @Nullable Map<String,Object> parameterValues;

        public Builder() {
    	      // Empty
        }

        public Builder(ListConnectionKeysResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectionKey = defaults.connectionKey;
    	      this.parameterValues = defaults.parameterValues;
        }

        public Builder setConnectionKey(@Nullable String connectionKey) {
            this.connectionKey = connectionKey;
            return this;
        }

        public Builder setParameterValues(@Nullable Map<String,Object> parameterValues) {
            this.parameterValues = parameterValues;
            return this;
        }

        public ListConnectionKeysResult build() {
            return new ListConnectionKeysResult(connectionKey, parameterValues);
        }
    }
}
