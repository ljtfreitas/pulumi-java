// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databox.outputs;

import io.pulumi.azurenative.databox.outputs.AzureFileFilterDetailsResponse;
import io.pulumi.azurenative.databox.outputs.BlobFilterDetailsResponse;
import io.pulumi.azurenative.databox.outputs.FilterFileDetailsResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TransferFilterDetailsResponse {
    /**
     * Filter details to transfer Azure files.
     * 
     */
    private final @Nullable AzureFileFilterDetailsResponse azureFileFilterDetails;
    /**
     * Filter details to transfer blobs.
     * 
     */
    private final @Nullable BlobFilterDetailsResponse blobFilterDetails;
    /**
     * Type of the account of data.
     * 
     */
    private final String dataAccountType;
    /**
     * Details of the filter files to be used for data transfer.
     * 
     */
    private final @Nullable List<FilterFileDetailsResponse> filterFileDetails;

    @CustomType.Constructor
    private TransferFilterDetailsResponse(
        @CustomType.Parameter("azureFileFilterDetails") @Nullable AzureFileFilterDetailsResponse azureFileFilterDetails,
        @CustomType.Parameter("blobFilterDetails") @Nullable BlobFilterDetailsResponse blobFilterDetails,
        @CustomType.Parameter("dataAccountType") String dataAccountType,
        @CustomType.Parameter("filterFileDetails") @Nullable List<FilterFileDetailsResponse> filterFileDetails) {
        this.azureFileFilterDetails = azureFileFilterDetails;
        this.blobFilterDetails = blobFilterDetails;
        this.dataAccountType = dataAccountType;
        this.filterFileDetails = filterFileDetails;
    }

    /**
     * Filter details to transfer Azure files.
     * 
    */
    public Optional<AzureFileFilterDetailsResponse> getAzureFileFilterDetails() {
        return Optional.ofNullable(this.azureFileFilterDetails);
    }
    /**
     * Filter details to transfer blobs.
     * 
    */
    public Optional<BlobFilterDetailsResponse> getBlobFilterDetails() {
        return Optional.ofNullable(this.blobFilterDetails);
    }
    /**
     * Type of the account of data.
     * 
    */
    public String getDataAccountType() {
        return this.dataAccountType;
    }
    /**
     * Details of the filter files to be used for data transfer.
     * 
    */
    public List<FilterFileDetailsResponse> getFilterFileDetails() {
        return this.filterFileDetails == null ? List.of() : this.filterFileDetails;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TransferFilterDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable AzureFileFilterDetailsResponse azureFileFilterDetails;
        private @Nullable BlobFilterDetailsResponse blobFilterDetails;
        private String dataAccountType;
        private @Nullable List<FilterFileDetailsResponse> filterFileDetails;

        public Builder() {
    	      // Empty
        }

        public Builder(TransferFilterDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.azureFileFilterDetails = defaults.azureFileFilterDetails;
    	      this.blobFilterDetails = defaults.blobFilterDetails;
    	      this.dataAccountType = defaults.dataAccountType;
    	      this.filterFileDetails = defaults.filterFileDetails;
        }

        public Builder azureFileFilterDetails(@Nullable AzureFileFilterDetailsResponse azureFileFilterDetails) {
            this.azureFileFilterDetails = azureFileFilterDetails;
            return this;
        }

        public Builder blobFilterDetails(@Nullable BlobFilterDetailsResponse blobFilterDetails) {
            this.blobFilterDetails = blobFilterDetails;
            return this;
        }

        public Builder dataAccountType(String dataAccountType) {
            this.dataAccountType = Objects.requireNonNull(dataAccountType);
            return this;
        }

        public Builder filterFileDetails(@Nullable List<FilterFileDetailsResponse> filterFileDetails) {
            this.filterFileDetails = filterFileDetails;
            return this;
        }
        public TransferFilterDetailsResponse build() {
            return new TransferFilterDetailsResponse(azureFileFilterDetails, blobFilterDetails, dataAccountType, filterFileDetails);
        }
    }
}
