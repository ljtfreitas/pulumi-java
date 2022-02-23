// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databox.outputs;

import io.pulumi.azurenative.databox.outputs.TransferConfigurationResponseTransferAllDetails;
import io.pulumi.azurenative.databox.outputs.TransferConfigurationResponseTransferFilterDetails;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class TransferConfigurationResponse {
    /**
     * Map of filter type and the details to transfer all data. This field is required only if the TransferConfigurationType is given as TransferAll
     * 
     */
    private final @Nullable TransferConfigurationResponseTransferAllDetails transferAllDetails;
    /**
     * Type of the configuration for transfer.
     * 
     */
    private final String transferConfigurationType;
    /**
     * Map of filter type and the details to filter. This field is required only if the TransferConfigurationType is given as TransferUsingFilter.
     * 
     */
    private final @Nullable TransferConfigurationResponseTransferFilterDetails transferFilterDetails;

    @OutputCustomType.Constructor({"transferAllDetails","transferConfigurationType","transferFilterDetails"})
    private TransferConfigurationResponse(
        @Nullable TransferConfigurationResponseTransferAllDetails transferAllDetails,
        String transferConfigurationType,
        @Nullable TransferConfigurationResponseTransferFilterDetails transferFilterDetails) {
        this.transferAllDetails = transferAllDetails;
        this.transferConfigurationType = Objects.requireNonNull(transferConfigurationType);
        this.transferFilterDetails = transferFilterDetails;
    }

    /**
     * Map of filter type and the details to transfer all data. This field is required only if the TransferConfigurationType is given as TransferAll
     * 
     */
    public Optional<TransferConfigurationResponseTransferAllDetails> getTransferAllDetails() {
        return Optional.ofNullable(this.transferAllDetails);
    }
    /**
     * Type of the configuration for transfer.
     * 
     */
    public String getTransferConfigurationType() {
        return this.transferConfigurationType;
    }
    /**
     * Map of filter type and the details to filter. This field is required only if the TransferConfigurationType is given as TransferUsingFilter.
     * 
     */
    public Optional<TransferConfigurationResponseTransferFilterDetails> getTransferFilterDetails() {
        return Optional.ofNullable(this.transferFilterDetails);
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
