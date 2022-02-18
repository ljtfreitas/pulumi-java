// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Skip error file.
 * 
 */
public final class SkipErrorFileArgs extends io.pulumi.resources.ResourceArgs {

    public static final SkipErrorFileArgs Empty = new SkipErrorFileArgs();

    /**
     * Skip if source/sink file changed by other concurrent write. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @InputImport(name="dataInconsistency")
    private final @Nullable Input<Object> dataInconsistency;

    public Input<Object> getDataInconsistency() {
        return this.dataInconsistency == null ? Input.empty() : this.dataInconsistency;
    }

    /**
     * Skip if file is deleted by other client during copy. Default is true. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @InputImport(name="fileMissing")
    private final @Nullable Input<Object> fileMissing;

    public Input<Object> getFileMissing() {
        return this.fileMissing == null ? Input.empty() : this.fileMissing;
    }

    public SkipErrorFileArgs(
        @Nullable Input<Object> dataInconsistency,
        @Nullable Input<Object> fileMissing) {
        this.dataInconsistency = dataInconsistency;
        this.fileMissing = fileMissing;
    }

    private SkipErrorFileArgs() {
        this.dataInconsistency = Input.empty();
        this.fileMissing = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SkipErrorFileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Object> dataInconsistency;
        private @Nullable Input<Object> fileMissing;

        public Builder() {
    	      // Empty
        }

        public Builder(SkipErrorFileArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataInconsistency = defaults.dataInconsistency;
    	      this.fileMissing = defaults.fileMissing;
        }

        public Builder setDataInconsistency(@Nullable Input<Object> dataInconsistency) {
            this.dataInconsistency = dataInconsistency;
            return this;
        }

        public Builder setDataInconsistency(@Nullable Object dataInconsistency) {
            this.dataInconsistency = Input.ofNullable(dataInconsistency);
            return this;
        }

        public Builder setFileMissing(@Nullable Input<Object> fileMissing) {
            this.fileMissing = fileMissing;
            return this;
        }

        public Builder setFileMissing(@Nullable Object fileMissing) {
            this.fileMissing = Input.ofNullable(fileMissing);
            return this;
        }

        public SkipErrorFileArgs build() {
            return new SkipErrorFileArgs(dataInconsistency, fileMissing);
        }
    }
}
