// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetLabelingJobArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetLabelingJobArgs Empty = new GetLabelingJobArgs();

    /**
     * Boolean value to indicate whether to include JobInstructions in response.
     * 
     */
    @InputImport(name="includeJobInstructions")
    private final @Nullable Boolean includeJobInstructions;

    public Optional<Boolean> getIncludeJobInstructions() {
        return this.includeJobInstructions == null ? Optional.empty() : Optional.ofNullable(this.includeJobInstructions);
    }

    /**
     * Boolean value to indicate whether to include LabelCategories in response.
     * 
     */
    @InputImport(name="includeLabelCategories")
    private final @Nullable Boolean includeLabelCategories;

    public Optional<Boolean> getIncludeLabelCategories() {
        return this.includeLabelCategories == null ? Optional.empty() : Optional.ofNullable(this.includeLabelCategories);
    }

    /**
     * Name and identifier for LabelingJob.
     * 
     */
    @InputImport(name="labelingJobId", required=true)
    private final String labelingJobId;

    public String getLabelingJobId() {
        return this.labelingJobId;
    }

    /**
     * Name of the resource group in which workspace is located.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Name of Azure Machine Learning workspace.
     * 
     */
    @InputImport(name="workspaceName", required=true)
    private final String workspaceName;

    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public GetLabelingJobArgs(
        @Nullable Boolean includeJobInstructions,
        @Nullable Boolean includeLabelCategories,
        String labelingJobId,
        String resourceGroupName,
        String workspaceName) {
        this.includeJobInstructions = includeJobInstructions;
        this.includeLabelCategories = includeLabelCategories;
        this.labelingJobId = Objects.requireNonNull(labelingJobId, "expected parameter 'labelingJobId' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.workspaceName = Objects.requireNonNull(workspaceName, "expected parameter 'workspaceName' to be non-null");
    }

    private GetLabelingJobArgs() {
        this.includeJobInstructions = null;
        this.includeLabelCategories = null;
        this.labelingJobId = null;
        this.resourceGroupName = null;
        this.workspaceName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLabelingJobArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean includeJobInstructions;
        private @Nullable Boolean includeLabelCategories;
        private String labelingJobId;
        private String resourceGroupName;
        private String workspaceName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLabelingJobArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.includeJobInstructions = defaults.includeJobInstructions;
    	      this.includeLabelCategories = defaults.includeLabelCategories;
    	      this.labelingJobId = defaults.labelingJobId;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.workspaceName = defaults.workspaceName;
        }

        public Builder setIncludeJobInstructions(@Nullable Boolean includeJobInstructions) {
            this.includeJobInstructions = includeJobInstructions;
            return this;
        }

        public Builder setIncludeLabelCategories(@Nullable Boolean includeLabelCategories) {
            this.includeLabelCategories = includeLabelCategories;
            return this;
        }

        public Builder setLabelingJobId(String labelingJobId) {
            this.labelingJobId = Objects.requireNonNull(labelingJobId);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setWorkspaceName(String workspaceName) {
            this.workspaceName = Objects.requireNonNull(workspaceName);
            return this;
        }

        public GetLabelingJobArgs build() {
            return new GetLabelingJobArgs(includeJobInstructions, includeLabelCategories, labelingJobId, resourceGroupName, workspaceName);
        }
    }
}
