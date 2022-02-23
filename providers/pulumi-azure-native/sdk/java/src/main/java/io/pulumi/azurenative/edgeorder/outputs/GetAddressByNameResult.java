// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.edgeorder.outputs;

import io.pulumi.azurenative.edgeorder.outputs.ContactDetailsResponse;
import io.pulumi.azurenative.edgeorder.outputs.ShippingAddressResponse;
import io.pulumi.azurenative.edgeorder.outputs.SystemDataResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetAddressByNameResult {
    /**
     * Status of address validation
     * 
     */
    private final String addressValidationStatus;
    /**
     * Contact details for the address
     * 
     */
    private final ContactDetailsResponse contactDetails;
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    private final String id;
    /**
     * The geo-location where the resource lives
     * 
     */
    private final String location;
    /**
     * The name of the resource
     * 
     */
    private final String name;
    /**
     * Shipping details for the address
     * 
     */
    private final @Nullable ShippingAddressResponse shippingAddress;
    /**
     * Represents resource creation and update time
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * Resource tags.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"addressValidationStatus","contactDetails","id","location","name","shippingAddress","systemData","tags","type"})
    private GetAddressByNameResult(
        String addressValidationStatus,
        ContactDetailsResponse contactDetails,
        String id,
        String location,
        String name,
        @Nullable ShippingAddressResponse shippingAddress,
        SystemDataResponse systemData,
        @Nullable Map<String,String> tags,
        String type) {
        this.addressValidationStatus = Objects.requireNonNull(addressValidationStatus);
        this.contactDetails = Objects.requireNonNull(contactDetails);
        this.id = Objects.requireNonNull(id);
        this.location = Objects.requireNonNull(location);
        this.name = Objects.requireNonNull(name);
        this.shippingAddress = shippingAddress;
        this.systemData = Objects.requireNonNull(systemData);
        this.tags = tags;
        this.type = Objects.requireNonNull(type);
    }

    /**
     * Status of address validation
     * 
     */
    public String getAddressValidationStatus() {
        return this.addressValidationStatus;
    }
    /**
     * Contact details for the address
     * 
     */
    public ContactDetailsResponse getContactDetails() {
        return this.contactDetails;
    }
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * The geo-location where the resource lives
     * 
     */
    public String getLocation() {
        return this.location;
    }
    /**
     * The name of the resource
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * Shipping details for the address
     * 
     */
    public Optional<ShippingAddressResponse> getShippingAddress() {
        return Optional.ofNullable(this.shippingAddress);
    }
    /**
     * Represents resource creation and update time
     * 
     */
    public SystemDataResponse getSystemData() {
        return this.systemData;
    }
    /**
     * Resource tags.
     * 
     */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAddressByNameResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String addressValidationStatus;
        private ContactDetailsResponse contactDetails;
        private String id;
        private String location;
        private String name;
        private @Nullable ShippingAddressResponse shippingAddress;
        private SystemDataResponse systemData;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAddressByNameResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addressValidationStatus = defaults.addressValidationStatus;
    	      this.contactDetails = defaults.contactDetails;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.shippingAddress = defaults.shippingAddress;
    	      this.systemData = defaults.systemData;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder setAddressValidationStatus(String addressValidationStatus) {
            this.addressValidationStatus = Objects.requireNonNull(addressValidationStatus);
            return this;
        }

        public Builder setContactDetails(ContactDetailsResponse contactDetails) {
            this.contactDetails = Objects.requireNonNull(contactDetails);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
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

        public Builder setShippingAddress(@Nullable ShippingAddressResponse shippingAddress) {
            this.shippingAddress = shippingAddress;
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

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetAddressByNameResult build() {
            return new GetAddressByNameResult(addressValidationStatus, contactDetails, id, location, name, shippingAddress, systemData, tags, type);
        }
    }
}
