// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databox.inputs;

import io.pulumi.azurenative.databox.inputs.TransferAllDetailsArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Map of filter type and the details to transfer all data. This field is required only if the TransferConfigurationType is given as TransferAll
 * 
 */
public final class TransferConfigurationTransferAllDetailsArgs extends io.pulumi.resources.ResourceArgs {

    public static final TransferConfigurationTransferAllDetailsArgs Empty = new TransferConfigurationTransferAllDetailsArgs();

    /**
     * Details to transfer all data.
     * 
     */
    @InputImport(name="include")
        private final @Nullable Input<TransferAllDetailsArgs> include;

    public Input<TransferAllDetailsArgs> getInclude() {
        return this.include == null ? Input.empty() : this.include;
    }

    public TransferConfigurationTransferAllDetailsArgs(@Nullable Input<TransferAllDetailsArgs> include) {
        this.include = include;
    }

    private TransferConfigurationTransferAllDetailsArgs() {
        this.include = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TransferConfigurationTransferAllDetailsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<TransferAllDetailsArgs> include;

        public Builder() {
    	      // Empty
        }

        public Builder(TransferConfigurationTransferAllDetailsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.include = defaults.include;
        }

        public Builder setInclude(@Nullable Input<TransferAllDetailsArgs> include) {
            this.include = include;
            return this;
        }

        public Builder setInclude(@Nullable TransferAllDetailsArgs include) {
            this.include = Input.ofNullable(include);
            return this;
        }
        public TransferConfigurationTransferAllDetailsArgs build() {
            return new TransferConfigurationTransferAllDetailsArgs(include);
        }
    }
}
