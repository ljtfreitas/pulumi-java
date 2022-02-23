// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class StoredProcedureParameterResponse {
    /**
     * Stored procedure parameter type.
     * 
     */
    private final @Nullable String type;
    /**
     * Stored procedure parameter value. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object value;

    @OutputCustomType.Constructor({"type","value"})
    private StoredProcedureParameterResponse(
        @Nullable String type,
        @Nullable Object value) {
        this.type = type;
        this.value = value;
    }

    /**
     * Stored procedure parameter type.
     * 
     */
    public Optional<String> getType() {
        return Optional.ofNullable(this.type);
    }
    /**
     * Stored procedure parameter value. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Object> getValue() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StoredProcedureParameterResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String type;
        private @Nullable Object value;

        public Builder() {
    	      // Empty
        }

        public Builder(StoredProcedureParameterResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
    	      this.value = defaults.value;
        }

        public Builder setType(@Nullable String type) {
            this.type = type;
            return this;
        }

        public Builder setValue(@Nullable Object value) {
            this.value = value;
            return this;
        }
        public StoredProcedureParameterResponse build() {
            return new StoredProcedureParameterResponse(type, value);
        }
    }
}
