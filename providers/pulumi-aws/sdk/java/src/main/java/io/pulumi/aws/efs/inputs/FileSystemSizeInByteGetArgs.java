// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.efs.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FileSystemSizeInByteGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final FileSystemSizeInByteGetArgs Empty = new FileSystemSizeInByteGetArgs();

    /**
     * The latest known metered size (in bytes) of data stored in the file system.
     * 
     */
    @Import(name="value")
      private final @Nullable Output<Integer> value;

    public Output<Integer> getValue() {
        return this.value == null ? Output.empty() : this.value;
    }

    /**
     * The latest known metered size (in bytes) of data stored in the Infrequent Access storage class.
     * 
     */
    @Import(name="valueInIa")
      private final @Nullable Output<Integer> valueInIa;

    public Output<Integer> getValueInIa() {
        return this.valueInIa == null ? Output.empty() : this.valueInIa;
    }

    /**
     * The latest known metered size (in bytes) of data stored in the Standard storage class.
     * 
     */
    @Import(name="valueInStandard")
      private final @Nullable Output<Integer> valueInStandard;

    public Output<Integer> getValueInStandard() {
        return this.valueInStandard == null ? Output.empty() : this.valueInStandard;
    }

    public FileSystemSizeInByteGetArgs(
        @Nullable Output<Integer> value,
        @Nullable Output<Integer> valueInIa,
        @Nullable Output<Integer> valueInStandard) {
        this.value = value;
        this.valueInIa = valueInIa;
        this.valueInStandard = valueInStandard;
    }

    private FileSystemSizeInByteGetArgs() {
        this.value = Output.empty();
        this.valueInIa = Output.empty();
        this.valueInStandard = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FileSystemSizeInByteGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> value;
        private @Nullable Output<Integer> valueInIa;
        private @Nullable Output<Integer> valueInStandard;

        public Builder() {
    	      // Empty
        }

        public Builder(FileSystemSizeInByteGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.value = defaults.value;
    	      this.valueInIa = defaults.valueInIa;
    	      this.valueInStandard = defaults.valueInStandard;
        }

        public Builder value(@Nullable Output<Integer> value) {
            this.value = value;
            return this;
        }

        public Builder value(@Nullable Integer value) {
            this.value = Output.ofNullable(value);
            return this;
        }

        public Builder valueInIa(@Nullable Output<Integer> valueInIa) {
            this.valueInIa = valueInIa;
            return this;
        }

        public Builder valueInIa(@Nullable Integer valueInIa) {
            this.valueInIa = Output.ofNullable(valueInIa);
            return this;
        }

        public Builder valueInStandard(@Nullable Output<Integer> valueInStandard) {
            this.valueInStandard = valueInStandard;
            return this;
        }

        public Builder valueInStandard(@Nullable Integer valueInStandard) {
            this.valueInStandard = Output.ofNullable(valueInStandard);
            return this;
        }
        public FileSystemSizeInByteGetArgs build() {
            return new FileSystemSizeInByteGetArgs(value, valueInIa, valueInStandard);
        }
    }
}
