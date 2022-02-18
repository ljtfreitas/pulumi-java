// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearning.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Asset input port
 * 
 */
public final class InputPortResponse extends io.pulumi.resources.InvokeArgs {

    public static final InputPortResponse Empty = new InputPortResponse();

    /**
     * Port data type.
     * 
     */
    @InputImport(name="type")
    private final @Nullable String type;

    public Optional<String> getType() {
        return this.type == null ? Optional.empty() : Optional.ofNullable(this.type);
    }

    public InputPortResponse(@Nullable String type) {
        this.type = type == null ? "Dataset" : type;
    }

    private InputPortResponse() {
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InputPortResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(InputPortResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
        }

        public Builder setType(@Nullable String type) {
            this.type = type;
            return this;
        }

        public InputPortResponse build() {
            return new InputPortResponse(type);
        }
    }
}
