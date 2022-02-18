// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.DataFlowReferenceResponse;
import io.pulumi.azurenative.datafactory.inputs.DatasetReferenceResponse;
import io.pulumi.azurenative.datafactory.inputs.LinkedServiceReferenceResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Power query sink.
 * 
 */
public final class PowerQuerySinkResponse extends io.pulumi.resources.InvokeArgs {

    public static final PowerQuerySinkResponse Empty = new PowerQuerySinkResponse();

    /**
     * Dataset reference.
     * 
     */
    @InputImport(name="dataset")
    private final @Nullable DatasetReferenceResponse dataset;

    public Optional<DatasetReferenceResponse> getDataset() {
        return this.dataset == null ? Optional.empty() : Optional.ofNullable(this.dataset);
    }

    /**
     * Transformation description.
     * 
     */
    @InputImport(name="description")
    private final @Nullable String description;

    public Optional<String> getDescription() {
        return this.description == null ? Optional.empty() : Optional.ofNullable(this.description);
    }

    /**
     * Flowlet Reference
     * 
     */
    @InputImport(name="flowlet")
    private final @Nullable DataFlowReferenceResponse flowlet;

    public Optional<DataFlowReferenceResponse> getFlowlet() {
        return this.flowlet == null ? Optional.empty() : Optional.ofNullable(this.flowlet);
    }

    /**
     * Linked service reference.
     * 
     */
    @InputImport(name="linkedService")
    private final @Nullable LinkedServiceReferenceResponse linkedService;

    public Optional<LinkedServiceReferenceResponse> getLinkedService() {
        return this.linkedService == null ? Optional.empty() : Optional.ofNullable(this.linkedService);
    }

    /**
     * Transformation name.
     * 
     */
    @InputImport(name="name", required=true)
    private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * Schema linked service reference.
     * 
     */
    @InputImport(name="schemaLinkedService")
    private final @Nullable LinkedServiceReferenceResponse schemaLinkedService;

    public Optional<LinkedServiceReferenceResponse> getSchemaLinkedService() {
        return this.schemaLinkedService == null ? Optional.empty() : Optional.ofNullable(this.schemaLinkedService);
    }

    /**
     * sink script.
     * 
     */
    @InputImport(name="script")
    private final @Nullable String script;

    public Optional<String> getScript() {
        return this.script == null ? Optional.empty() : Optional.ofNullable(this.script);
    }

    public PowerQuerySinkResponse(
        @Nullable DatasetReferenceResponse dataset,
        @Nullable String description,
        @Nullable DataFlowReferenceResponse flowlet,
        @Nullable LinkedServiceReferenceResponse linkedService,
        String name,
        @Nullable LinkedServiceReferenceResponse schemaLinkedService,
        @Nullable String script) {
        this.dataset = dataset;
        this.description = description;
        this.flowlet = flowlet;
        this.linkedService = linkedService;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.schemaLinkedService = schemaLinkedService;
        this.script = script;
    }

    private PowerQuerySinkResponse() {
        this.dataset = null;
        this.description = null;
        this.flowlet = null;
        this.linkedService = null;
        this.name = null;
        this.schemaLinkedService = null;
        this.script = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PowerQuerySinkResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable DatasetReferenceResponse dataset;
        private @Nullable String description;
        private @Nullable DataFlowReferenceResponse flowlet;
        private @Nullable LinkedServiceReferenceResponse linkedService;
        private String name;
        private @Nullable LinkedServiceReferenceResponse schemaLinkedService;
        private @Nullable String script;

        public Builder() {
    	      // Empty
        }

        public Builder(PowerQuerySinkResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataset = defaults.dataset;
    	      this.description = defaults.description;
    	      this.flowlet = defaults.flowlet;
    	      this.linkedService = defaults.linkedService;
    	      this.name = defaults.name;
    	      this.schemaLinkedService = defaults.schemaLinkedService;
    	      this.script = defaults.script;
        }

        public Builder setDataset(@Nullable DatasetReferenceResponse dataset) {
            this.dataset = dataset;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setFlowlet(@Nullable DataFlowReferenceResponse flowlet) {
            this.flowlet = flowlet;
            return this;
        }

        public Builder setLinkedService(@Nullable LinkedServiceReferenceResponse linkedService) {
            this.linkedService = linkedService;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setSchemaLinkedService(@Nullable LinkedServiceReferenceResponse schemaLinkedService) {
            this.schemaLinkedService = schemaLinkedService;
            return this;
        }

        public Builder setScript(@Nullable String script) {
            this.script = script;
            return this;
        }

        public PowerQuerySinkResponse build() {
            return new PowerQuerySinkResponse(dataset, description, flowlet, linkedService, name, schemaLinkedService, script);
        }
    }
}
