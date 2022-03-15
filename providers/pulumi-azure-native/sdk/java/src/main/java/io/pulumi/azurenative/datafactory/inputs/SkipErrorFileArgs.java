// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
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
    @Import(name="dataInconsistency")
      private final @Nullable Output<Object> dataInconsistency;

    public Output<Object> getDataInconsistency() {
        return this.dataInconsistency == null ? Output.empty() : this.dataInconsistency;
    }

    /**
     * Skip if file is deleted by other client during copy. Default is true. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @Import(name="fileMissing")
      private final @Nullable Output<Object> fileMissing;

    public Output<Object> getFileMissing() {
        return this.fileMissing == null ? Output.empty() : this.fileMissing;
    }

    public SkipErrorFileArgs(
        @Nullable Output<Object> dataInconsistency,
        @Nullable Output<Object> fileMissing) {
        this.dataInconsistency = dataInconsistency;
        this.fileMissing = fileMissing;
    }

    private SkipErrorFileArgs() {
        this.dataInconsistency = Output.empty();
        this.fileMissing = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SkipErrorFileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Object> dataInconsistency;
        private @Nullable Output<Object> fileMissing;

        public Builder() {
    	      // Empty
        }

        public Builder(SkipErrorFileArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataInconsistency = defaults.dataInconsistency;
    	      this.fileMissing = defaults.fileMissing;
        }

        public Builder dataInconsistency(@Nullable Output<Object> dataInconsistency) {
            this.dataInconsistency = dataInconsistency;
            return this;
        }

        public Builder dataInconsistency(@Nullable Object dataInconsistency) {
            this.dataInconsistency = Output.ofNullable(dataInconsistency);
            return this;
        }

        public Builder fileMissing(@Nullable Output<Object> fileMissing) {
            this.fileMissing = fileMissing;
            return this;
        }

        public Builder fileMissing(@Nullable Object fileMissing) {
            this.fileMissing = Output.ofNullable(fileMissing);
            return this;
        }
        public SkipErrorFileArgs build() {
            return new SkipErrorFileArgs(dataInconsistency, fileMissing);
        }
    }
}
