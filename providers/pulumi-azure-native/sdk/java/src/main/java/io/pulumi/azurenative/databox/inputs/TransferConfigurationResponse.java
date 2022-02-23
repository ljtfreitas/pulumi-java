// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databox.inputs;

import io.pulumi.azurenative.databox.inputs.TransferConfigurationResponseTransferAllDetails;
import io.pulumi.azurenative.databox.inputs.TransferConfigurationResponseTransferFilterDetails;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Configuration for defining the transfer of data.
 * 
 */
public final class TransferConfigurationResponse extends io.pulumi.resources.InvokeArgs {

    public static final TransferConfigurationResponse Empty = new TransferConfigurationResponse();

    /**
     * Map of filter type and the details to transfer all data. This field is required only if the TransferConfigurationType is given as TransferAll
     * 
     */
    @InputImport(name="transferAllDetails")
        private final @Nullable TransferConfigurationResponseTransferAllDetails transferAllDetails;

    public Optional<TransferConfigurationResponseTransferAllDetails> getTransferAllDetails() {
        return this.transferAllDetails == null ? Optional.empty() : Optional.ofNullable(this.transferAllDetails);
    }

    /**
     * Type of the configuration for transfer.
     * 
     */
    @InputImport(name="transferConfigurationType", required=true)
        private final String transferConfigurationType;

    public String getTransferConfigurationType() {
        return this.transferConfigurationType;
    }

    /**
     * Map of filter type and the details to filter. This field is required only if the TransferConfigurationType is given as TransferUsingFilter.
     * 
     */
    @InputImport(name="transferFilterDetails")
        private final @Nullable TransferConfigurationResponseTransferFilterDetails transferFilterDetails;

    public Optional<TransferConfigurationResponseTransferFilterDetails> getTransferFilterDetails() {
        return this.transferFilterDetails == null ? Optional.empty() : Optional.ofNullable(this.transferFilterDetails);
    }

    public TransferConfigurationResponse(
        @Nullable TransferConfigurationResponseTransferAllDetails transferAllDetails,
        String transferConfigurationType,
        @Nullable TransferConfigurationResponseTransferFilterDetails transferFilterDetails) {
        this.transferAllDetails = transferAllDetails;
        this.transferConfigurationType = Objects.requireNonNull(transferConfigurationType, "expected parameter 'transferConfigurationType' to be non-null");
        this.transferFilterDetails = transferFilterDetails;
    }

    private TransferConfigurationResponse() {
        this.transferAllDetails = null;
        this.transferConfigurationType = null;
        this.transferFilterDetails = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TransferConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable TransferConfigurationResponseTransferAllDetails transferAllDetails;
        private String transferConfigurationType;
        private @Nullable TransferConfigurationResponseTransferFilterDetails transferFilterDetails;

        public Builder() {
    	      // Empty
        }

        public Builder(TransferConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.transferAllDetails = defaults.transferAllDetails;
    	      this.transferConfigurationType = defaults.transferConfigurationType;
    	      this.transferFilterDetails = defaults.transferFilterDetails;
        }

        public Builder setTransferAllDetails(@Nullable TransferConfigurationResponseTransferAllDetails transferAllDetails) {
            this.transferAllDetails = transferAllDetails;
            return this;
        }

        public Builder setTransferConfigurationType(String transferConfigurationType) {
            this.transferConfigurationType = Objects.requireNonNull(transferConfigurationType);
            return this;
        }

        public Builder setTransferFilterDetails(@Nullable TransferConfigurationResponseTransferFilterDetails transferFilterDetails) {
            this.transferFilterDetails = transferFilterDetails;
            return this;
        }
        public TransferConfigurationResponse build() {
            return new TransferConfigurationResponse(transferAllDetails, transferConfigurationType, transferFilterDetails);
        }
    }
}
