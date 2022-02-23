// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.azurenative.machinelearningservices.inputs.LabelCategoryResponse;
import io.pulumi.azurenative.machinelearningservices.inputs.LabelingDatasetConfigurationResponse;
import io.pulumi.azurenative.machinelearningservices.inputs.LabelingJobImagePropertiesResponse;
import io.pulumi.azurenative.machinelearningservices.inputs.LabelingJobInstructionsResponse;
import io.pulumi.azurenative.machinelearningservices.inputs.MLAssistConfigurationResponse;
import io.pulumi.azurenative.machinelearningservices.inputs.ProgressMetricsResponse;
import io.pulumi.azurenative.machinelearningservices.inputs.StatusMessageResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Definition of a labeling job.
 * 
 */
public final class LabelingJobPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final LabelingJobPropertiesResponse Empty = new LabelingJobPropertiesResponse();

    /**
     * Created time of the job in UTC timezone.
     * 
     */
    @InputImport(name="createdTimeUtc", required=true)
        private final String createdTimeUtc;

    public String getCreatedTimeUtc() {
        return this.createdTimeUtc;
    }

    /**
     * Dataset configuration for the job.
     * 
     */
    @InputImport(name="datasetConfiguration", required=true)
        private final LabelingDatasetConfigurationResponse datasetConfiguration;

    public LabelingDatasetConfigurationResponse getDatasetConfiguration() {
        return this.datasetConfiguration;
    }

    /**
     * Instructions for the job.
     * 
     */
    @InputImport(name="jobInstructions", required=true)
        private final LabelingJobInstructionsResponse jobInstructions;

    public LabelingJobInstructionsResponse getJobInstructions() {
        return this.jobInstructions;
    }

    /**
     * Label categories of the job.
     * 
     */
    @InputImport(name="labelCategories", required=true)
        private final Map<String,LabelCategoryResponse> labelCategories;

    public Map<String,LabelCategoryResponse> getLabelCategories() {
        return this.labelCategories;
    }

    /**
     * Media specific properties in a labeling job.
     * 
     */
    @InputImport(name="labelingJobMediaProperties", required=true)
        private final LabelingJobImagePropertiesResponse labelingJobMediaProperties;

    public LabelingJobImagePropertiesResponse getLabelingJobMediaProperties() {
        return this.labelingJobMediaProperties;
    }

    /**
     * Machine learning assisted configuration for the job.
     * 
     */
    @InputImport(name="mlAssistConfiguration")
        private final @Nullable MLAssistConfigurationResponse mlAssistConfiguration;

    public Optional<MLAssistConfigurationResponse> getMlAssistConfiguration() {
        return this.mlAssistConfiguration == null ? Optional.empty() : Optional.ofNullable(this.mlAssistConfiguration);
    }

    /**
     * Progress metrics of the job.
     * 
     */
    @InputImport(name="progressMetrics", required=true)
        private final ProgressMetricsResponse progressMetrics;

    public ProgressMetricsResponse getProgressMetrics() {
        return this.progressMetrics;
    }

    /**
     * Internal id of the job(Previously called project).
     * 
     */
    @InputImport(name="projectId", required=true)
        private final String projectId;

    public String getProjectId() {
        return this.projectId;
    }

    /**
     * The job property dictionary. Properties can be added, but not removed or altered.
     * 
     */
    @InputImport(name="properties")
        private final @Nullable Map<String,String> properties;

    public Map<String,String> getProperties() {
        return this.properties == null ? Map.of() : this.properties;
    }

    /**
     * Status of the job.
     * 
     */
    @InputImport(name="status", required=true)
        private final String status;

    public String getStatus() {
        return this.status;
    }

    /**
     * Status messages of the job.
     * 
     */
    @InputImport(name="statusMessages", required=true)
        private final List<StatusMessageResponse> statusMessages;

    public List<StatusMessageResponse> getStatusMessages() {
        return this.statusMessages;
    }

    /**
     * The job tag dictionary. Tags can be added, removed, and updated.
     * 
     */
    @InputImport(name="tags")
        private final @Nullable Map<String,String> tags;

    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }

    public LabelingJobPropertiesResponse(
        String createdTimeUtc,
        LabelingDatasetConfigurationResponse datasetConfiguration,
        LabelingJobInstructionsResponse jobInstructions,
        Map<String,LabelCategoryResponse> labelCategories,
        LabelingJobImagePropertiesResponse labelingJobMediaProperties,
        @Nullable MLAssistConfigurationResponse mlAssistConfiguration,
        ProgressMetricsResponse progressMetrics,
        String projectId,
        @Nullable Map<String,String> properties,
        String status,
        List<StatusMessageResponse> statusMessages,
        @Nullable Map<String,String> tags) {
        this.createdTimeUtc = Objects.requireNonNull(createdTimeUtc, "expected parameter 'createdTimeUtc' to be non-null");
        this.datasetConfiguration = Objects.requireNonNull(datasetConfiguration, "expected parameter 'datasetConfiguration' to be non-null");
        this.jobInstructions = Objects.requireNonNull(jobInstructions, "expected parameter 'jobInstructions' to be non-null");
        this.labelCategories = Objects.requireNonNull(labelCategories, "expected parameter 'labelCategories' to be non-null");
        this.labelingJobMediaProperties = Objects.requireNonNull(labelingJobMediaProperties, "expected parameter 'labelingJobMediaProperties' to be non-null");
        this.mlAssistConfiguration = mlAssistConfiguration;
        this.progressMetrics = Objects.requireNonNull(progressMetrics, "expected parameter 'progressMetrics' to be non-null");
        this.projectId = Objects.requireNonNull(projectId, "expected parameter 'projectId' to be non-null");
        this.properties = properties;
        this.status = Objects.requireNonNull(status, "expected parameter 'status' to be non-null");
        this.statusMessages = Objects.requireNonNull(statusMessages, "expected parameter 'statusMessages' to be non-null");
        this.tags = tags;
    }

    private LabelingJobPropertiesResponse() {
        this.createdTimeUtc = null;
        this.datasetConfiguration = null;
        this.jobInstructions = null;
        this.labelCategories = Map.of();
        this.labelingJobMediaProperties = null;
        this.mlAssistConfiguration = null;
        this.progressMetrics = null;
        this.projectId = null;
        this.properties = Map.of();
        this.status = null;
        this.statusMessages = List.of();
        this.tags = Map.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LabelingJobPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createdTimeUtc;
        private LabelingDatasetConfigurationResponse datasetConfiguration;
        private LabelingJobInstructionsResponse jobInstructions;
        private Map<String,LabelCategoryResponse> labelCategories;
        private LabelingJobImagePropertiesResponse labelingJobMediaProperties;
        private @Nullable MLAssistConfigurationResponse mlAssistConfiguration;
        private ProgressMetricsResponse progressMetrics;
        private String projectId;
        private @Nullable Map<String,String> properties;
        private String status;
        private List<StatusMessageResponse> statusMessages;
        private @Nullable Map<String,String> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(LabelingJobPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createdTimeUtc = defaults.createdTimeUtc;
    	      this.datasetConfiguration = defaults.datasetConfiguration;
    	      this.jobInstructions = defaults.jobInstructions;
    	      this.labelCategories = defaults.labelCategories;
    	      this.labelingJobMediaProperties = defaults.labelingJobMediaProperties;
    	      this.mlAssistConfiguration = defaults.mlAssistConfiguration;
    	      this.progressMetrics = defaults.progressMetrics;
    	      this.projectId = defaults.projectId;
    	      this.properties = defaults.properties;
    	      this.status = defaults.status;
    	      this.statusMessages = defaults.statusMessages;
    	      this.tags = defaults.tags;
        }

        public Builder setCreatedTimeUtc(String createdTimeUtc) {
            this.createdTimeUtc = Objects.requireNonNull(createdTimeUtc);
            return this;
        }

        public Builder setDatasetConfiguration(LabelingDatasetConfigurationResponse datasetConfiguration) {
            this.datasetConfiguration = Objects.requireNonNull(datasetConfiguration);
            return this;
        }

        public Builder setJobInstructions(LabelingJobInstructionsResponse jobInstructions) {
            this.jobInstructions = Objects.requireNonNull(jobInstructions);
            return this;
        }

        public Builder setLabelCategories(Map<String,LabelCategoryResponse> labelCategories) {
            this.labelCategories = Objects.requireNonNull(labelCategories);
            return this;
        }

        public Builder setLabelingJobMediaProperties(LabelingJobImagePropertiesResponse labelingJobMediaProperties) {
            this.labelingJobMediaProperties = Objects.requireNonNull(labelingJobMediaProperties);
            return this;
        }

        public Builder setMlAssistConfiguration(@Nullable MLAssistConfigurationResponse mlAssistConfiguration) {
            this.mlAssistConfiguration = mlAssistConfiguration;
            return this;
        }

        public Builder setProgressMetrics(ProgressMetricsResponse progressMetrics) {
            this.progressMetrics = Objects.requireNonNull(progressMetrics);
            return this;
        }

        public Builder setProjectId(String projectId) {
            this.projectId = Objects.requireNonNull(projectId);
            return this;
        }

        public Builder setProperties(@Nullable Map<String,String> properties) {
            this.properties = properties;
            return this;
        }

        public Builder setStatus(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public Builder setStatusMessages(List<StatusMessageResponse> statusMessages) {
            this.statusMessages = Objects.requireNonNull(statusMessages);
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public LabelingJobPropertiesResponse build() {
            return new LabelingJobPropertiesResponse(createdTimeUtc, datasetConfiguration, jobInstructions, labelCategories, labelingJobMediaProperties, mlAssistConfiguration, progressMetrics, projectId, properties, status, statusMessages, tags);
        }
    }
}
