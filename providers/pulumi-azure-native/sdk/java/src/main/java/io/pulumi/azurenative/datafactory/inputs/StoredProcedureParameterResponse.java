// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * SQL stored procedure parameter.
 * 
 */
public final class StoredProcedureParameterResponse extends io.pulumi.resources.InvokeArgs {

    public static final StoredProcedureParameterResponse Empty = new StoredProcedureParameterResponse();

    /**
     * Stored procedure parameter type.
     * 
     */
    @InputImport(name="type")
        private final @Nullable String type;

    public Optional<String> getType() {
        return this.type == null ? Optional.empty() : Optional.ofNullable(this.type);
    }

    /**
     * Stored procedure parameter value. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="value")
        private final @Nullable Object value;

    public Optional<Object> getValue() {
        return this.value == null ? Optional.empty() : Optional.ofNullable(this.value);
    }

    public StoredProcedureParameterResponse(
        @Nullable String type,
        @Nullable Object value) {
        this.type = type;
        this.value = value;
    }

    private StoredProcedureParameterResponse() {
        this.type = null;
        this.value = null;
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
