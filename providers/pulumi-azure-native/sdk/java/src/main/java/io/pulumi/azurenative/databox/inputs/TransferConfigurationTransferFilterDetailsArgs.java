// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databox.inputs;

import io.pulumi.azurenative.databox.inputs.TransferFilterDetailsArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Map of filter type and the details to filter. This field is required only if the TransferConfigurationType is given as TransferUsingFilter.
 * 
 */
public final class TransferConfigurationTransferFilterDetailsArgs extends io.pulumi.resources.ResourceArgs {

    public static final TransferConfigurationTransferFilterDetailsArgs Empty = new TransferConfigurationTransferFilterDetailsArgs();

    /**
     * Details of the filtering the transfer of data.
     * 
     */
    @InputImport(name="include")
    private final @Nullable Input<TransferFilterDetailsArgs> include;

    public Input<TransferFilterDetailsArgs> getInclude() {
        return this.include == null ? Input.empty() : this.include;
    }

    public TransferConfigurationTransferFilterDetailsArgs(@Nullable Input<TransferFilterDetailsArgs> include) {
        this.include = include;
    }

    private TransferConfigurationTransferFilterDetailsArgs() {
        this.include = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TransferConfigurationTransferFilterDetailsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<TransferFilterDetailsArgs> include;

        public Builder() {
    	      // Empty
        }

        public Builder(TransferConfigurationTransferFilterDetailsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.include = defaults.include;
        }

        public Builder setInclude(@Nullable Input<TransferFilterDetailsArgs> include) {
            this.include = include;
            return this;
        }

        public Builder setInclude(@Nullable TransferFilterDetailsArgs include) {
            this.include = Input.ofNullable(include);
            return this;
        }

        public TransferConfigurationTransferFilterDetailsArgs build() {
            return new TransferConfigurationTransferFilterDetailsArgs(include);
        }
    }
}
