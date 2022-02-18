// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.edgeorder.outputs;

import io.pulumi.azurenative.edgeorder.outputs.AvailabilityInformationResponse;
import io.pulumi.azurenative.edgeorder.outputs.CostInformationResponse;
import io.pulumi.azurenative.edgeorder.outputs.DescriptionResponse;
import io.pulumi.azurenative.edgeorder.outputs.DimensionsResponse;
import io.pulumi.azurenative.edgeorder.outputs.FilterablePropertyResponse;
import io.pulumi.azurenative.edgeorder.outputs.HierarchyInformationResponse;
import io.pulumi.azurenative.edgeorder.outputs.ImageInformationResponse;
import io.pulumi.azurenative.edgeorder.outputs.SpecificationResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class ConfigurationResponse {
    /**
     * Availability information of the product system.
     * 
     */
    private final AvailabilityInformationResponse availabilityInformation;
    /**
     * Cost information for the product system.
     * 
     */
    private final CostInformationResponse costInformation;
    /**
     * Description related to the product system.
     * 
     */
    private final DescriptionResponse description;
    /**
     * Dimensions of the configuration
     * 
     */
    private final DimensionsResponse dimensions;
    /**
     * Display Name for the product system.
     * 
     */
    private final String displayName;
    /**
     * list of filters supported for a product
     * 
     */
    private final List<FilterablePropertyResponse> filterableProperties;
    /**
     * Hierarchy information of a product.
     * 
     */
    private final HierarchyInformationResponse hierarchyInformation;
    /**
     * Image information for the product system.
     * 
     */
    private final List<ImageInformationResponse> imageInformation;
    /**
     * Specifications of the configuration
     * 
     */
    private final List<SpecificationResponse> specifications;

    @OutputCustomType.Constructor({"availabilityInformation","costInformation","description","dimensions","displayName","filterableProperties","hierarchyInformation","imageInformation","specifications"})
    private ConfigurationResponse(
        AvailabilityInformationResponse availabilityInformation,
        CostInformationResponse costInformation,
        DescriptionResponse description,
        DimensionsResponse dimensions,
        String displayName,
        List<FilterablePropertyResponse> filterableProperties,
        HierarchyInformationResponse hierarchyInformation,
        List<ImageInformationResponse> imageInformation,
        List<SpecificationResponse> specifications) {
        this.availabilityInformation = Objects.requireNonNull(availabilityInformation);
        this.costInformation = Objects.requireNonNull(costInformation);
        this.description = Objects.requireNonNull(description);
        this.dimensions = Objects.requireNonNull(dimensions);
        this.displayName = Objects.requireNonNull(displayName);
        this.filterableProperties = Objects.requireNonNull(filterableProperties);
        this.hierarchyInformation = Objects.requireNonNull(hierarchyInformation);
        this.imageInformation = Objects.requireNonNull(imageInformation);
        this.specifications = Objects.requireNonNull(specifications);
    }

    /**
     * Availability information of the product system.
     * 
     */
    public AvailabilityInformationResponse getAvailabilityInformation() {
        return this.availabilityInformation;
    }
    /**
     * Cost information for the product system.
     * 
     */
    public CostInformationResponse getCostInformation() {
        return this.costInformation;
    }
    /**
     * Description related to the product system.
     * 
     */
    public DescriptionResponse getDescription() {
        return this.description;
    }
    /**
     * Dimensions of the configuration
     * 
     */
    public DimensionsResponse getDimensions() {
        return this.dimensions;
    }
    /**
     * Display Name for the product system.
     * 
     */
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * list of filters supported for a product
     * 
     */
    public List<FilterablePropertyResponse> getFilterableProperties() {
        return this.filterableProperties;
    }
    /**
     * Hierarchy information of a product.
     * 
     */
    public HierarchyInformationResponse getHierarchyInformation() {
        return this.hierarchyInformation;
    }
    /**
     * Image information for the product system.
     * 
     */
    public List<ImageInformationResponse> getImageInformation() {
        return this.imageInformation;
    }
    /**
     * Specifications of the configuration
     * 
     */
    public List<SpecificationResponse> getSpecifications() {
        return this.specifications;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AvailabilityInformationResponse availabilityInformation;
        private CostInformationResponse costInformation;
        private DescriptionResponse description;
        private DimensionsResponse dimensions;
        private String displayName;
        private List<FilterablePropertyResponse> filterableProperties;
        private HierarchyInformationResponse hierarchyInformation;
        private List<ImageInformationResponse> imageInformation;
        private List<SpecificationResponse> specifications;

        public Builder() {
    	      // Empty
        }

        public Builder(ConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availabilityInformation = defaults.availabilityInformation;
    	      this.costInformation = defaults.costInformation;
    	      this.description = defaults.description;
    	      this.dimensions = defaults.dimensions;
    	      this.displayName = defaults.displayName;
    	      this.filterableProperties = defaults.filterableProperties;
    	      this.hierarchyInformation = defaults.hierarchyInformation;
    	      this.imageInformation = defaults.imageInformation;
    	      this.specifications = defaults.specifications;
        }

        public Builder setAvailabilityInformation(AvailabilityInformationResponse availabilityInformation) {
            this.availabilityInformation = Objects.requireNonNull(availabilityInformation);
            return this;
        }

        public Builder setCostInformation(CostInformationResponse costInformation) {
            this.costInformation = Objects.requireNonNull(costInformation);
            return this;
        }

        public Builder setDescription(DescriptionResponse description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setDimensions(DimensionsResponse dimensions) {
            this.dimensions = Objects.requireNonNull(dimensions);
            return this;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder setFilterableProperties(List<FilterablePropertyResponse> filterableProperties) {
            this.filterableProperties = Objects.requireNonNull(filterableProperties);
            return this;
        }

        public Builder setHierarchyInformation(HierarchyInformationResponse hierarchyInformation) {
            this.hierarchyInformation = Objects.requireNonNull(hierarchyInformation);
            return this;
        }

        public Builder setImageInformation(List<ImageInformationResponse> imageInformation) {
            this.imageInformation = Objects.requireNonNull(imageInformation);
            return this;
        }

        public Builder setSpecifications(List<SpecificationResponse> specifications) {
            this.specifications = Objects.requireNonNull(specifications);
            return this;
        }

        public ConfigurationResponse build() {
            return new ConfigurationResponse(availabilityInformation, costInformation, description, dimensions, displayName, filterableProperties, hierarchyInformation, imageInformation, specifications);
        }
    }
}
