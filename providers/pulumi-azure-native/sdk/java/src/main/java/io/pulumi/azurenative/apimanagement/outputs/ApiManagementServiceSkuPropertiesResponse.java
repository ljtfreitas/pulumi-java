// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ApiManagementServiceSkuPropertiesResponse {
    /**
     * Capacity of the SKU (number of deployed units of the SKU). For Consumption SKU capacity must be specified as 0.
     * 
     */
    private final Integer capacity;
    /**
     * Name of the Sku.
     * 
     */
    private final String name;

    @OutputCustomType.Constructor({"capacity","name"})
    private ApiManagementServiceSkuPropertiesResponse(
        Integer capacity,
        String name) {
        this.capacity = Objects.requireNonNull(capacity);
        this.name = Objects.requireNonNull(name);
    }

    /**
     * Capacity of the SKU (number of deployed units of the SKU). For Consumption SKU capacity must be specified as 0.
     * 
     */
    public Integer getCapacity() {
        return this.capacity;
    }
    /**
     * Name of the Sku.
     * 
     */
    public String getName() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApiManagementServiceSkuPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer capacity;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(ApiManagementServiceSkuPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capacity = defaults.capacity;
    	      this.name = defaults.name;
        }

        public Builder setCapacity(Integer capacity) {
            this.capacity = Objects.requireNonNull(capacity);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public ApiManagementServiceSkuPropertiesResponse build() {
            return new ApiManagementServiceSkuPropertiesResponse(capacity, name);
        }
    }
}
