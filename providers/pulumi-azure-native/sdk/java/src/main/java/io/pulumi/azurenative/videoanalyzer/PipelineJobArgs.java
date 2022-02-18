// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.videoanalyzer;

import io.pulumi.azurenative.videoanalyzer.inputs.ParameterDefinitionArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PipelineJobArgs extends io.pulumi.resources.ResourceArgs {

    public static final PipelineJobArgs Empty = new PipelineJobArgs();

    /**
     * The Azure Video Analyzer account name.
     * 
     */
    @InputImport(name="accountName", required=true)
    private final Input<String> accountName;

    public Input<String> getAccountName() {
        return this.accountName;
    }

    /**
     * An optional description for the pipeline.
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * List of the instance level parameter values for the user-defined topology parameters. A pipeline can only define or override parameters values for parameters which have been declared in the referenced topology. Topology parameters without a default value must be defined. Topology parameters with a default value can be optionally be overridden.
     * 
     */
    @InputImport(name="parameters")
    private final @Nullable Input<List<ParameterDefinitionArgs>> parameters;

    public Input<List<ParameterDefinitionArgs>> getParameters() {
        return this.parameters == null ? Input.empty() : this.parameters;
    }

    /**
     * The pipeline job name.
     * 
     */
    @InputImport(name="pipelineJobName")
    private final @Nullable Input<String> pipelineJobName;

    public Input<String> getPipelineJobName() {
        return this.pipelineJobName == null ? Input.empty() : this.pipelineJobName;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Reference to an existing pipeline topology. When activated, this pipeline job will process content according to the pipeline topology definition.
     * 
     */
    @InputImport(name="topologyName", required=true)
    private final Input<String> topologyName;

    public Input<String> getTopologyName() {
        return this.topologyName;
    }

    public PipelineJobArgs(
        Input<String> accountName,
        @Nullable Input<String> description,
        @Nullable Input<List<ParameterDefinitionArgs>> parameters,
        @Nullable Input<String> pipelineJobName,
        Input<String> resourceGroupName,
        Input<String> topologyName) {
        this.accountName = Objects.requireNonNull(accountName, "expected parameter 'accountName' to be non-null");
        this.description = description;
        this.parameters = parameters;
        this.pipelineJobName = pipelineJobName;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.topologyName = Objects.requireNonNull(topologyName, "expected parameter 'topologyName' to be non-null");
    }

    private PipelineJobArgs() {
        this.accountName = Input.empty();
        this.description = Input.empty();
        this.parameters = Input.empty();
        this.pipelineJobName = Input.empty();
        this.resourceGroupName = Input.empty();
        this.topologyName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PipelineJobArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> accountName;
        private @Nullable Input<String> description;
        private @Nullable Input<List<ParameterDefinitionArgs>> parameters;
        private @Nullable Input<String> pipelineJobName;
        private Input<String> resourceGroupName;
        private Input<String> topologyName;

        public Builder() {
    	      // Empty
        }

        public Builder(PipelineJobArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.description = defaults.description;
    	      this.parameters = defaults.parameters;
    	      this.pipelineJobName = defaults.pipelineJobName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.topologyName = defaults.topologyName;
        }

        public Builder setAccountName(Input<String> accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }

        public Builder setAccountName(String accountName) {
            this.accountName = Input.of(Objects.requireNonNull(accountName));
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setParameters(@Nullable Input<List<ParameterDefinitionArgs>> parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder setParameters(@Nullable List<ParameterDefinitionArgs> parameters) {
            this.parameters = Input.ofNullable(parameters);
            return this;
        }

        public Builder setPipelineJobName(@Nullable Input<String> pipelineJobName) {
            this.pipelineJobName = pipelineJobName;
            return this;
        }

        public Builder setPipelineJobName(@Nullable String pipelineJobName) {
            this.pipelineJobName = Input.ofNullable(pipelineJobName);
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setTopologyName(Input<String> topologyName) {
            this.topologyName = Objects.requireNonNull(topologyName);
            return this;
        }

        public Builder setTopologyName(String topologyName) {
            this.topologyName = Input.of(Objects.requireNonNull(topologyName));
            return this;
        }

        public PipelineJobArgs build() {
            return new PipelineJobArgs(accountName, description, parameters, pipelineJobName, resourceGroupName, topologyName);
        }
    }
}
