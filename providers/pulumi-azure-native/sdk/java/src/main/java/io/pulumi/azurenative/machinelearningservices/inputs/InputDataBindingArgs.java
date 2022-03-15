// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.azurenative.machinelearningservices.enums.DataBindingMode;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InputDataBindingArgs extends io.pulumi.resources.ResourceArgs {

    public static final InputDataBindingArgs Empty = new InputDataBindingArgs();

    /**
     * ARM resource ID of the registered dataVersion.
     * 
     */
    @Import(name="dataId")
      private final @Nullable Output<String> dataId;

    public Output<String> getDataId() {
        return this.dataId == null ? Output.empty() : this.dataId;
    }

    /**
     * Mechanism for accessing the data artifact.
     * 
     */
    @Import(name="mode")
      private final @Nullable Output<Either<String,DataBindingMode>> mode;

    public Output<Either<String,DataBindingMode>> getMode() {
        return this.mode == null ? Output.empty() : this.mode;
    }

    /**
     * Location of data inside the container process.
     * 
     */
    @Import(name="pathOnCompute")
      private final @Nullable Output<String> pathOnCompute;

    public Output<String> getPathOnCompute() {
        return this.pathOnCompute == null ? Output.empty() : this.pathOnCompute;
    }

    public InputDataBindingArgs(
        @Nullable Output<String> dataId,
        @Nullable Output<Either<String,DataBindingMode>> mode,
        @Nullable Output<String> pathOnCompute) {
        this.dataId = dataId;
        this.mode = mode;
        this.pathOnCompute = pathOnCompute;
    }

    private InputDataBindingArgs() {
        this.dataId = Output.empty();
        this.mode = Output.empty();
        this.pathOnCompute = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InputDataBindingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> dataId;
        private @Nullable Output<Either<String,DataBindingMode>> mode;
        private @Nullable Output<String> pathOnCompute;

        public Builder() {
    	      // Empty
        }

        public Builder(InputDataBindingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataId = defaults.dataId;
    	      this.mode = defaults.mode;
    	      this.pathOnCompute = defaults.pathOnCompute;
        }

        public Builder dataId(@Nullable Output<String> dataId) {
            this.dataId = dataId;
            return this;
        }

        public Builder dataId(@Nullable String dataId) {
            this.dataId = Output.ofNullable(dataId);
            return this;
        }

        public Builder mode(@Nullable Output<Either<String,DataBindingMode>> mode) {
            this.mode = mode;
            return this;
        }

        public Builder mode(@Nullable Either<String,DataBindingMode> mode) {
            this.mode = Output.ofNullable(mode);
            return this;
        }

        public Builder pathOnCompute(@Nullable Output<String> pathOnCompute) {
            this.pathOnCompute = pathOnCompute;
            return this;
        }

        public Builder pathOnCompute(@Nullable String pathOnCompute) {
            this.pathOnCompute = Output.ofNullable(pathOnCompute);
            return this;
        }
        public InputDataBindingArgs build() {
            return new InputDataBindingArgs(dataId, mode, pathOnCompute);
        }
    }
}
