// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databox.outputs;

import io.pulumi.azurenative.databox.outputs.CloudErrorResponse;
import io.pulumi.azurenative.databox.outputs.DataBoxDiskJobDetailsResponse;
import io.pulumi.azurenative.databox.outputs.DataBoxHeavyJobDetailsResponse;
import io.pulumi.azurenative.databox.outputs.DataBoxJobDetailsResponse;
import io.pulumi.azurenative.databox.outputs.JobDeliveryInfoResponse;
import io.pulumi.azurenative.databox.outputs.ResourceIdentityResponse;
import io.pulumi.azurenative.databox.outputs.SkuResponse;
import io.pulumi.azurenative.databox.outputs.SystemDataResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetJobResult {
    /**
     * Reason for cancellation.
     * 
     */
    private final String cancellationReason;
    /**
     * Delivery Info of Job.
     * 
     */
    private final @Nullable JobDeliveryInfoResponse deliveryInfo;
    /**
     * Delivery type of Job.
     * 
     */
    private final @Nullable String deliveryType;
    /**
     * Details of a job run. This field will only be sent for expand details filter.
     * 
     */
    private final @Nullable Object details;
    /**
     * Top level error for the job.
     * 
     */
    private final CloudErrorResponse error;
    /**
     * Id of the object.
     * 
     */
    private final String id;
    /**
     * Msi identity of the resource
     * 
     */
    private final @Nullable ResourceIdentityResponse identity;
    /**
     * Describes whether the job is cancellable or not.
     * 
     */
    private final Boolean isCancellable;
    /**
     * Flag to indicate cancellation of scheduled job.
     * 
     */
    private final Boolean isCancellableWithoutFee;
    /**
     * Describes whether the job is deletable or not.
     * 
     */
    private final Boolean isDeletable;
    /**
     * Is Prepare To Ship Enabled on this job
     * 
     */
    private final Boolean isPrepareToShipEnabled;
    /**
     * Describes whether the shipping address is editable or not.
     * 
     */
    private final Boolean isShippingAddressEditable;
    /**
     * The location of the resource. This will be one of the supported and registered Azure Regions (e.g. West US, East US, Southeast Asia, etc.). The region of a resource cannot be changed once it is created, but if an identical region is specified on update the request will succeed.
     * 
     */
    private final String location;
    /**
     * Name of the object.
     * 
     */
    private final String name;
    /**
     * The sku type.
     * 
     */
    private final SkuResponse sku;
    /**
     * Time at which the job was started in UTC ISO 8601 format.
     * 
     */
    private final String startTime;
    /**
     * Name of the stage which is in progress.
     * 
     */
    private final String status;
    /**
     * Metadata pertaining to creation and last modification of the resource.
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * The list of key value pairs that describe the resource. These tags can be used in viewing and grouping this resource (across resource groups).
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * Type of the data transfer.
     * 
     */
    private final String transferType;
    /**
     * Type of the object.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"cancellationReason","deliveryInfo","deliveryType","details","error","id","identity","isCancellable","isCancellableWithoutFee","isDeletable","isPrepareToShipEnabled","isShippingAddressEditable","location","name","sku","startTime","status","systemData","tags","transferType","type"})
    private GetJobResult(
        String cancellationReason,
        @Nullable JobDeliveryInfoResponse deliveryInfo,
        @Nullable String deliveryType,
        @Nullable Object details,
        CloudErrorResponse error,
        String id,
        @Nullable ResourceIdentityResponse identity,
        Boolean isCancellable,
        Boolean isCancellableWithoutFee,
        Boolean isDeletable,
        Boolean isPrepareToShipEnabled,
        Boolean isShippingAddressEditable,
        String location,
        String name,
        SkuResponse sku,
        String startTime,
        String status,
        SystemDataResponse systemData,
        @Nullable Map<String,String> tags,
        String transferType,
        String type) {
        this.cancellationReason = Objects.requireNonNull(cancellationReason);
        this.deliveryInfo = deliveryInfo;
        this.deliveryType = deliveryType;
        this.details = details;
        this.error = Objects.requireNonNull(error);
        this.id = Objects.requireNonNull(id);
        this.identity = identity;
        this.isCancellable = Objects.requireNonNull(isCancellable);
        this.isCancellableWithoutFee = Objects.requireNonNull(isCancellableWithoutFee);
        this.isDeletable = Objects.requireNonNull(isDeletable);
        this.isPrepareToShipEnabled = Objects.requireNonNull(isPrepareToShipEnabled);
        this.isShippingAddressEditable = Objects.requireNonNull(isShippingAddressEditable);
        this.location = Objects.requireNonNull(location);
        this.name = Objects.requireNonNull(name);
        this.sku = Objects.requireNonNull(sku);
        this.startTime = Objects.requireNonNull(startTime);
        this.status = Objects.requireNonNull(status);
        this.systemData = Objects.requireNonNull(systemData);
        this.tags = tags;
        this.transferType = Objects.requireNonNull(transferType);
        this.type = Objects.requireNonNull(type);
    }

    /**
     * Reason for cancellation.
     * 
     */
    public String getCancellationReason() {
        return this.cancellationReason;
    }
    /**
     * Delivery Info of Job.
     * 
     */
    public Optional<JobDeliveryInfoResponse> getDeliveryInfo() {
        return Optional.ofNullable(this.deliveryInfo);
    }
    /**
     * Delivery type of Job.
     * 
     */
    public Optional<String> getDeliveryType() {
        return Optional.ofNullable(this.deliveryType);
    }
    /**
     * Details of a job run. This field will only be sent for expand details filter.
     * 
     */
    public Optional<Object> getDetails() {
        return Optional.ofNullable(this.details);
    }
    /**
     * Top level error for the job.
     * 
     */
    public CloudErrorResponse getError() {
        return this.error;
    }
    /**
     * Id of the object.
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * Msi identity of the resource
     * 
     */
    public Optional<ResourceIdentityResponse> getIdentity() {
        return Optional.ofNullable(this.identity);
    }
    /**
     * Describes whether the job is cancellable or not.
     * 
     */
    public Boolean getIsCancellable() {
        return this.isCancellable;
    }
    /**
     * Flag to indicate cancellation of scheduled job.
     * 
     */
    public Boolean getIsCancellableWithoutFee() {
        return this.isCancellableWithoutFee;
    }
    /**
     * Describes whether the job is deletable or not.
     * 
     */
    public Boolean getIsDeletable() {
        return this.isDeletable;
    }
    /**
     * Is Prepare To Ship Enabled on this job
     * 
     */
    public Boolean getIsPrepareToShipEnabled() {
        return this.isPrepareToShipEnabled;
    }
    /**
     * Describes whether the shipping address is editable or not.
     * 
     */
    public Boolean getIsShippingAddressEditable() {
        return this.isShippingAddressEditable;
    }
    /**
     * The location of the resource. This will be one of the supported and registered Azure Regions (e.g. West US, East US, Southeast Asia, etc.). The region of a resource cannot be changed once it is created, but if an identical region is specified on update the request will succeed.
     * 
     */
    public String getLocation() {
        return this.location;
    }
    /**
     * Name of the object.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * The sku type.
     * 
     */
    public SkuResponse getSku() {
        return this.sku;
    }
    /**
     * Time at which the job was started in UTC ISO 8601 format.
     * 
     */
    public String getStartTime() {
        return this.startTime;
    }
    /**
     * Name of the stage which is in progress.
     * 
     */
    public String getStatus() {
        return this.status;
    }
    /**
     * Metadata pertaining to creation and last modification of the resource.
     * 
     */
    public SystemDataResponse getSystemData() {
        return this.systemData;
    }
    /**
     * The list of key value pairs that describe the resource. These tags can be used in viewing and grouping this resource (across resource groups).
     * 
     */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * Type of the data transfer.
     * 
     */
    public String getTransferType() {
        return this.transferType;
    }
    /**
     * Type of the object.
     * 
     */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetJobResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String cancellationReason;
        private @Nullable JobDeliveryInfoResponse deliveryInfo;
        private @Nullable String deliveryType;
        private @Nullable Object details;
        private CloudErrorResponse error;
        private String id;
        private @Nullable ResourceIdentityResponse identity;
        private Boolean isCancellable;
        private Boolean isCancellableWithoutFee;
        private Boolean isDeletable;
        private Boolean isPrepareToShipEnabled;
        private Boolean isShippingAddressEditable;
        private String location;
        private String name;
        private SkuResponse sku;
        private String startTime;
        private String status;
        private SystemDataResponse systemData;
        private @Nullable Map<String,String> tags;
        private String transferType;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetJobResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cancellationReason = defaults.cancellationReason;
    	      this.deliveryInfo = defaults.deliveryInfo;
    	      this.deliveryType = defaults.deliveryType;
    	      this.details = defaults.details;
    	      this.error = defaults.error;
    	      this.id = defaults.id;
    	      this.identity = defaults.identity;
    	      this.isCancellable = defaults.isCancellable;
    	      this.isCancellableWithoutFee = defaults.isCancellableWithoutFee;
    	      this.isDeletable = defaults.isDeletable;
    	      this.isPrepareToShipEnabled = defaults.isPrepareToShipEnabled;
    	      this.isShippingAddressEditable = defaults.isShippingAddressEditable;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.sku = defaults.sku;
    	      this.startTime = defaults.startTime;
    	      this.status = defaults.status;
    	      this.systemData = defaults.systemData;
    	      this.tags = defaults.tags;
    	      this.transferType = defaults.transferType;
    	      this.type = defaults.type;
        }

        public Builder setCancellationReason(String cancellationReason) {
            this.cancellationReason = Objects.requireNonNull(cancellationReason);
            return this;
        }

        public Builder setDeliveryInfo(@Nullable JobDeliveryInfoResponse deliveryInfo) {
            this.deliveryInfo = deliveryInfo;
            return this;
        }

        public Builder setDeliveryType(@Nullable String deliveryType) {
            this.deliveryType = deliveryType;
            return this;
        }

        public Builder setDetails(@Nullable Object details) {
            this.details = details;
            return this;
        }

        public Builder setError(CloudErrorResponse error) {
            this.error = Objects.requireNonNull(error);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setIdentity(@Nullable ResourceIdentityResponse identity) {
            this.identity = identity;
            return this;
        }

        public Builder setIsCancellable(Boolean isCancellable) {
            this.isCancellable = Objects.requireNonNull(isCancellable);
            return this;
        }

        public Builder setIsCancellableWithoutFee(Boolean isCancellableWithoutFee) {
            this.isCancellableWithoutFee = Objects.requireNonNull(isCancellableWithoutFee);
            return this;
        }

        public Builder setIsDeletable(Boolean isDeletable) {
            this.isDeletable = Objects.requireNonNull(isDeletable);
            return this;
        }

        public Builder setIsPrepareToShipEnabled(Boolean isPrepareToShipEnabled) {
            this.isPrepareToShipEnabled = Objects.requireNonNull(isPrepareToShipEnabled);
            return this;
        }

        public Builder setIsShippingAddressEditable(Boolean isShippingAddressEditable) {
            this.isShippingAddressEditable = Objects.requireNonNull(isShippingAddressEditable);
            return this;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setSku(SkuResponse sku) {
            this.sku = Objects.requireNonNull(sku);
            return this;
        }

        public Builder setStartTime(String startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }

        public Builder setStatus(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public Builder setSystemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTransferType(String transferType) {
            this.transferType = Objects.requireNonNull(transferType);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetJobResult build() {
            return new GetJobResult(cancellationReason, deliveryInfo, deliveryType, details, error, id, identity, isCancellable, isCancellableWithoutFee, isDeletable, isPrepareToShipEnabled, isShippingAddressEditable, location, name, sku, startTime, status, systemData, tags, transferType, type);
        }
    }
}
