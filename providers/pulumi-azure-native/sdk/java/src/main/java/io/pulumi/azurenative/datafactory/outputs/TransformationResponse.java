// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.azurenative.datafactory.outputs.DataFlowReferenceResponse;
import io.pulumi.azurenative.datafactory.outputs.DatasetReferenceResponse;
import io.pulumi.azurenative.datafactory.outputs.LinkedServiceReferenceResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TransformationResponse {
    /**
     * Dataset reference.
     * 
     */
    private final @Nullable DatasetReferenceResponse dataset;
    /**
     * Transformation description.
     * 
     */
    private final @Nullable String description;
    /**
     * Flowlet Reference
     * 
     */
    private final @Nullable DataFlowReferenceResponse flowlet;
    /**
     * Linked service reference.
     * 
     */
    private final @Nullable LinkedServiceReferenceResponse linkedService;
    /**
     * Transformation name.
     * 
     */
    private final String name;

    @CustomType.Constructor
    private TransformationResponse(
        @CustomType.Parameter("dataset") @Nullable DatasetReferenceResponse dataset,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("flowlet") @Nullable DataFlowReferenceResponse flowlet,
        @CustomType.Parameter("linkedService") @Nullable LinkedServiceReferenceResponse linkedService,
        @CustomType.Parameter("name") String name) {
        this.dataset = dataset;
        this.description = description;
        this.flowlet = flowlet;
        this.linkedService = linkedService;
        this.name = name;
    }

    /**
     * Dataset reference.
     * 
    */
    public Optional<DatasetReferenceResponse> getDataset() {
        return Optional.ofNullable(this.dataset);
    }
    /**
     * Transformation description.
     * 
    */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * Flowlet Reference
     * 
    */
    public Optional<DataFlowReferenceResponse> getFlowlet() {
        return Optional.ofNullable(this.flowlet);
    }
    /**
     * Linked service reference.
     * 
    */
    public Optional<LinkedServiceReferenceResponse> getLinkedService() {
        return Optional.ofNullable(this.linkedService);
    }
    /**
     * Transformation name.
     * 
    */
    public String getName() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TransformationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable DatasetReferenceResponse dataset;
        private @Nullable String description;
        private @Nullable DataFlowReferenceResponse flowlet;
        private @Nullable LinkedServiceReferenceResponse linkedService;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(TransformationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataset = defaults.dataset;
    	      this.description = defaults.description;
    	      this.flowlet = defaults.flowlet;
    	      this.linkedService = defaults.linkedService;
    	      this.name = defaults.name;
        }

        public Builder dataset(@Nullable DatasetReferenceResponse dataset) {
            this.dataset = dataset;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder flowlet(@Nullable DataFlowReferenceResponse flowlet) {
            this.flowlet = flowlet;
            return this;
        }

        public Builder linkedService(@Nullable LinkedServiceReferenceResponse linkedService) {
            this.linkedService = linkedService;
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public TransformationResponse build() {
            return new TransformationResponse(dataset, description, flowlet, linkedService, name);
        }
    }
}
