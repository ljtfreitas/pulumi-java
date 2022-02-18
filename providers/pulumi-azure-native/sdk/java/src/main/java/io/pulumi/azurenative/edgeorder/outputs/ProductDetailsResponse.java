// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.edgeorder.outputs;

import io.pulumi.azurenative.edgeorder.outputs.DeviceDetailsResponse;
import io.pulumi.azurenative.edgeorder.outputs.DisplayInfoResponse;
import io.pulumi.azurenative.edgeorder.outputs.HierarchyInformationResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ProductDetailsResponse {
    /**
     * Quantity of the product
     * 
     */
    private final Integer count;
    /**
     * list of device details
     * 
     */
    private final List<DeviceDetailsResponse> deviceDetails;
    /**
     * Display details of the product
     * 
     */
    private final @Nullable DisplayInfoResponse displayInfo;
    /**
     * Hierarchy of the product which uniquely identifies the product
     * 
     */
    private final HierarchyInformationResponse hierarchyInformation;
    /**
     * Double encryption status of the configuration. Read-only field.
     * 
     */
    private final String productDoubleEncryptionStatus;

    @OutputCustomType.Constructor({"count","deviceDetails","displayInfo","hierarchyInformation","productDoubleEncryptionStatus"})
    private ProductDetailsResponse(
        Integer count,
        List<DeviceDetailsResponse> deviceDetails,
        @Nullable DisplayInfoResponse displayInfo,
        HierarchyInformationResponse hierarchyInformation,
        String productDoubleEncryptionStatus) {
        this.count = Objects.requireNonNull(count);
        this.deviceDetails = Objects.requireNonNull(deviceDetails);
        this.displayInfo = displayInfo;
        this.hierarchyInformation = Objects.requireNonNull(hierarchyInformation);
        this.productDoubleEncryptionStatus = Objects.requireNonNull(productDoubleEncryptionStatus);
    }

    /**
     * Quantity of the product
     * 
     */
    public Integer getCount() {
        return this.count;
    }
    /**
     * list of device details
     * 
     */
    public List<DeviceDetailsResponse> getDeviceDetails() {
        return this.deviceDetails;
    }
    /**
     * Display details of the product
     * 
     */
    public Optional<DisplayInfoResponse> getDisplayInfo() {
        return Optional.ofNullable(this.displayInfo);
    }
    /**
     * Hierarchy of the product which uniquely identifies the product
     * 
     */
    public HierarchyInformationResponse getHierarchyInformation() {
        return this.hierarchyInformation;
    }
    /**
     * Double encryption status of the configuration. Read-only field.
     * 
     */
    public String getProductDoubleEncryptionStatus() {
        return this.productDoubleEncryptionStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProductDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer count;
        private List<DeviceDetailsResponse> deviceDetails;
        private @Nullable DisplayInfoResponse displayInfo;
        private HierarchyInformationResponse hierarchyInformation;
        private String productDoubleEncryptionStatus;

        public Builder() {
    	      // Empty
        }

        public Builder(ProductDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.count = defaults.count;
    	      this.deviceDetails = defaults.deviceDetails;
    	      this.displayInfo = defaults.displayInfo;
    	      this.hierarchyInformation = defaults.hierarchyInformation;
    	      this.productDoubleEncryptionStatus = defaults.productDoubleEncryptionStatus;
        }

        public Builder setCount(Integer count) {
            this.count = Objects.requireNonNull(count);
            return this;
        }

        public Builder setDeviceDetails(List<DeviceDetailsResponse> deviceDetails) {
            this.deviceDetails = Objects.requireNonNull(deviceDetails);
            return this;
        }

        public Builder setDisplayInfo(@Nullable DisplayInfoResponse displayInfo) {
            this.displayInfo = displayInfo;
            return this;
        }

        public Builder setHierarchyInformation(HierarchyInformationResponse hierarchyInformation) {
            this.hierarchyInformation = Objects.requireNonNull(hierarchyInformation);
            return this;
        }

        public Builder setProductDoubleEncryptionStatus(String productDoubleEncryptionStatus) {
            this.productDoubleEncryptionStatus = Objects.requireNonNull(productDoubleEncryptionStatus);
            return this;
        }

        public ProductDetailsResponse build() {
            return new ProductDetailsResponse(count, deviceDetails, displayInfo, hierarchyInformation, productDoubleEncryptionStatus);
        }
    }
}
