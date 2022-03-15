// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datapipelines_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.datapipelines_v1.outputs.GoogleCloudDatapipelinesV1RuntimeEnvironmentResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GoogleCloudDatapipelinesV1LaunchTemplateParametersResponse {
    /**
     * The runtime environment for the job.
     * 
     */
    private final GoogleCloudDatapipelinesV1RuntimeEnvironmentResponse environment;
    /**
     * The job name to use for the created job.
     * 
     */
    private final String jobName;
    /**
     * The runtime parameters to pass to the job.
     * 
     */
    private final Map<String,String> parameters;
    /**
     * Map of transform name prefixes of the job to be replaced to the corresponding name prefixes of the new job. Only applicable when updating a pipeline.
     * 
     */
    private final Map<String,String> transformNameMapping;
    /**
     * If set, replace the existing pipeline with the name specified by jobName with this pipeline, preserving state.
     * 
     */
    private final Boolean update;

    @CustomType.Constructor
    private GoogleCloudDatapipelinesV1LaunchTemplateParametersResponse(
        @CustomType.Parameter("environment") GoogleCloudDatapipelinesV1RuntimeEnvironmentResponse environment,
        @CustomType.Parameter("jobName") String jobName,
        @CustomType.Parameter("parameters") Map<String,String> parameters,
        @CustomType.Parameter("transformNameMapping") Map<String,String> transformNameMapping,
        @CustomType.Parameter("update") Boolean update) {
        this.environment = environment;
        this.jobName = jobName;
        this.parameters = parameters;
        this.transformNameMapping = transformNameMapping;
        this.update = update;
    }

    /**
     * The runtime environment for the job.
     * 
    */
    public GoogleCloudDatapipelinesV1RuntimeEnvironmentResponse getEnvironment() {
        return this.environment;
    }
    /**
     * The job name to use for the created job.
     * 
    */
    public String getJobName() {
        return this.jobName;
    }
    /**
     * The runtime parameters to pass to the job.
     * 
    */
    public Map<String,String> getParameters() {
        return this.parameters;
    }
    /**
     * Map of transform name prefixes of the job to be replaced to the corresponding name prefixes of the new job. Only applicable when updating a pipeline.
     * 
    */
    public Map<String,String> getTransformNameMapping() {
        return this.transformNameMapping;
    }
    /**
     * If set, replace the existing pipeline with the name specified by jobName with this pipeline, preserving state.
     * 
    */
    public Boolean getUpdate() {
        return this.update;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDatapipelinesV1LaunchTemplateParametersResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDatapipelinesV1RuntimeEnvironmentResponse environment;
        private String jobName;
        private Map<String,String> parameters;
        private Map<String,String> transformNameMapping;
        private Boolean update;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDatapipelinesV1LaunchTemplateParametersResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.environment = defaults.environment;
    	      this.jobName = defaults.jobName;
    	      this.parameters = defaults.parameters;
    	      this.transformNameMapping = defaults.transformNameMapping;
    	      this.update = defaults.update;
        }

        public Builder environment(GoogleCloudDatapipelinesV1RuntimeEnvironmentResponse environment) {
            this.environment = Objects.requireNonNull(environment);
            return this;
        }

        public Builder jobName(String jobName) {
            this.jobName = Objects.requireNonNull(jobName);
            return this;
        }

        public Builder parameters(Map<String,String> parameters) {
            this.parameters = Objects.requireNonNull(parameters);
            return this;
        }

        public Builder transformNameMapping(Map<String,String> transformNameMapping) {
            this.transformNameMapping = Objects.requireNonNull(transformNameMapping);
            return this;
        }

        public Builder update(Boolean update) {
            this.update = Objects.requireNonNull(update);
            return this;
        }
        public GoogleCloudDatapipelinesV1LaunchTemplateParametersResponse build() {
            return new GoogleCloudDatapipelinesV1LaunchTemplateParametersResponse(environment, jobName, parameters, transformNameMapping, update);
        }
    }
}
