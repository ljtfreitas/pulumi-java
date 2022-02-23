// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker;

import io.pulumi.awsnative.sagemaker.inputs.DataQualityJobDefinitionDataQualityAppSpecificationArgs;
import io.pulumi.awsnative.sagemaker.inputs.DataQualityJobDefinitionDataQualityBaselineConfigArgs;
import io.pulumi.awsnative.sagemaker.inputs.DataQualityJobDefinitionDataQualityJobInputArgs;
import io.pulumi.awsnative.sagemaker.inputs.DataQualityJobDefinitionMonitoringOutputConfigArgs;
import io.pulumi.awsnative.sagemaker.inputs.DataQualityJobDefinitionMonitoringResourcesArgs;
import io.pulumi.awsnative.sagemaker.inputs.DataQualityJobDefinitionNetworkConfigArgs;
import io.pulumi.awsnative.sagemaker.inputs.DataQualityJobDefinitionStoppingConditionArgs;
import io.pulumi.awsnative.sagemaker.inputs.DataQualityJobDefinitionTagArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DataQualityJobDefinitionArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataQualityJobDefinitionArgs Empty = new DataQualityJobDefinitionArgs();

    @InputImport(name="dataQualityAppSpecification", required=true)
        private final Input<DataQualityJobDefinitionDataQualityAppSpecificationArgs> dataQualityAppSpecification;

    public Input<DataQualityJobDefinitionDataQualityAppSpecificationArgs> getDataQualityAppSpecification() {
        return this.dataQualityAppSpecification;
    }

    @InputImport(name="dataQualityBaselineConfig")
        private final @Nullable Input<DataQualityJobDefinitionDataQualityBaselineConfigArgs> dataQualityBaselineConfig;

    public Input<DataQualityJobDefinitionDataQualityBaselineConfigArgs> getDataQualityBaselineConfig() {
        return this.dataQualityBaselineConfig == null ? Input.empty() : this.dataQualityBaselineConfig;
    }

    @InputImport(name="dataQualityJobInput", required=true)
        private final Input<DataQualityJobDefinitionDataQualityJobInputArgs> dataQualityJobInput;

    public Input<DataQualityJobDefinitionDataQualityJobInputArgs> getDataQualityJobInput() {
        return this.dataQualityJobInput;
    }

    @InputImport(name="dataQualityJobOutputConfig", required=true)
        private final Input<DataQualityJobDefinitionMonitoringOutputConfigArgs> dataQualityJobOutputConfig;

    public Input<DataQualityJobDefinitionMonitoringOutputConfigArgs> getDataQualityJobOutputConfig() {
        return this.dataQualityJobOutputConfig;
    }

    @InputImport(name="jobDefinitionName")
        private final @Nullable Input<String> jobDefinitionName;

    public Input<String> getJobDefinitionName() {
        return this.jobDefinitionName == null ? Input.empty() : this.jobDefinitionName;
    }

    @InputImport(name="jobResources", required=true)
        private final Input<DataQualityJobDefinitionMonitoringResourcesArgs> jobResources;

    public Input<DataQualityJobDefinitionMonitoringResourcesArgs> getJobResources() {
        return this.jobResources;
    }

    @InputImport(name="networkConfig")
        private final @Nullable Input<DataQualityJobDefinitionNetworkConfigArgs> networkConfig;

    public Input<DataQualityJobDefinitionNetworkConfigArgs> getNetworkConfig() {
        return this.networkConfig == null ? Input.empty() : this.networkConfig;
    }

    /**
     * The Amazon Resource Name (ARN) of an IAM role that Amazon SageMaker can assume to perform tasks on your behalf.
     * 
     */
    @InputImport(name="roleArn", required=true)
        private final Input<String> roleArn;

    public Input<String> getRoleArn() {
        return this.roleArn;
    }

    @InputImport(name="stoppingCondition")
        private final @Nullable Input<DataQualityJobDefinitionStoppingConditionArgs> stoppingCondition;

    public Input<DataQualityJobDefinitionStoppingConditionArgs> getStoppingCondition() {
        return this.stoppingCondition == null ? Input.empty() : this.stoppingCondition;
    }

    /**
     * An array of key-value pairs to apply to this resource.
     * 
     */
    @InputImport(name="tags")
        private final @Nullable Input<List<DataQualityJobDefinitionTagArgs>> tags;

    public Input<List<DataQualityJobDefinitionTagArgs>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public DataQualityJobDefinitionArgs(
        Input<DataQualityJobDefinitionDataQualityAppSpecificationArgs> dataQualityAppSpecification,
        @Nullable Input<DataQualityJobDefinitionDataQualityBaselineConfigArgs> dataQualityBaselineConfig,
        Input<DataQualityJobDefinitionDataQualityJobInputArgs> dataQualityJobInput,
        Input<DataQualityJobDefinitionMonitoringOutputConfigArgs> dataQualityJobOutputConfig,
        @Nullable Input<String> jobDefinitionName,
        Input<DataQualityJobDefinitionMonitoringResourcesArgs> jobResources,
        @Nullable Input<DataQualityJobDefinitionNetworkConfigArgs> networkConfig,
        Input<String> roleArn,
        @Nullable Input<DataQualityJobDefinitionStoppingConditionArgs> stoppingCondition,
        @Nullable Input<List<DataQualityJobDefinitionTagArgs>> tags) {
        this.dataQualityAppSpecification = Objects.requireNonNull(dataQualityAppSpecification, "expected parameter 'dataQualityAppSpecification' to be non-null");
        this.dataQualityBaselineConfig = dataQualityBaselineConfig;
        this.dataQualityJobInput = Objects.requireNonNull(dataQualityJobInput, "expected parameter 'dataQualityJobInput' to be non-null");
        this.dataQualityJobOutputConfig = Objects.requireNonNull(dataQualityJobOutputConfig, "expected parameter 'dataQualityJobOutputConfig' to be non-null");
        this.jobDefinitionName = jobDefinitionName;
        this.jobResources = Objects.requireNonNull(jobResources, "expected parameter 'jobResources' to be non-null");
        this.networkConfig = networkConfig;
        this.roleArn = Objects.requireNonNull(roleArn, "expected parameter 'roleArn' to be non-null");
        this.stoppingCondition = stoppingCondition;
        this.tags = tags;
    }

    private DataQualityJobDefinitionArgs() {
        this.dataQualityAppSpecification = Input.empty();
        this.dataQualityBaselineConfig = Input.empty();
        this.dataQualityJobInput = Input.empty();
        this.dataQualityJobOutputConfig = Input.empty();
        this.jobDefinitionName = Input.empty();
        this.jobResources = Input.empty();
        this.networkConfig = Input.empty();
        this.roleArn = Input.empty();
        this.stoppingCondition = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataQualityJobDefinitionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<DataQualityJobDefinitionDataQualityAppSpecificationArgs> dataQualityAppSpecification;
        private @Nullable Input<DataQualityJobDefinitionDataQualityBaselineConfigArgs> dataQualityBaselineConfig;
        private Input<DataQualityJobDefinitionDataQualityJobInputArgs> dataQualityJobInput;
        private Input<DataQualityJobDefinitionMonitoringOutputConfigArgs> dataQualityJobOutputConfig;
        private @Nullable Input<String> jobDefinitionName;
        private Input<DataQualityJobDefinitionMonitoringResourcesArgs> jobResources;
        private @Nullable Input<DataQualityJobDefinitionNetworkConfigArgs> networkConfig;
        private Input<String> roleArn;
        private @Nullable Input<DataQualityJobDefinitionStoppingConditionArgs> stoppingCondition;
        private @Nullable Input<List<DataQualityJobDefinitionTagArgs>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(DataQualityJobDefinitionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataQualityAppSpecification = defaults.dataQualityAppSpecification;
    	      this.dataQualityBaselineConfig = defaults.dataQualityBaselineConfig;
    	      this.dataQualityJobInput = defaults.dataQualityJobInput;
    	      this.dataQualityJobOutputConfig = defaults.dataQualityJobOutputConfig;
    	      this.jobDefinitionName = defaults.jobDefinitionName;
    	      this.jobResources = defaults.jobResources;
    	      this.networkConfig = defaults.networkConfig;
    	      this.roleArn = defaults.roleArn;
    	      this.stoppingCondition = defaults.stoppingCondition;
    	      this.tags = defaults.tags;
        }

        public Builder setDataQualityAppSpecification(Input<DataQualityJobDefinitionDataQualityAppSpecificationArgs> dataQualityAppSpecification) {
            this.dataQualityAppSpecification = Objects.requireNonNull(dataQualityAppSpecification);
            return this;
        }

        public Builder setDataQualityAppSpecification(DataQualityJobDefinitionDataQualityAppSpecificationArgs dataQualityAppSpecification) {
            this.dataQualityAppSpecification = Input.of(Objects.requireNonNull(dataQualityAppSpecification));
            return this;
        }

        public Builder setDataQualityBaselineConfig(@Nullable Input<DataQualityJobDefinitionDataQualityBaselineConfigArgs> dataQualityBaselineConfig) {
            this.dataQualityBaselineConfig = dataQualityBaselineConfig;
            return this;
        }

        public Builder setDataQualityBaselineConfig(@Nullable DataQualityJobDefinitionDataQualityBaselineConfigArgs dataQualityBaselineConfig) {
            this.dataQualityBaselineConfig = Input.ofNullable(dataQualityBaselineConfig);
            return this;
        }

        public Builder setDataQualityJobInput(Input<DataQualityJobDefinitionDataQualityJobInputArgs> dataQualityJobInput) {
            this.dataQualityJobInput = Objects.requireNonNull(dataQualityJobInput);
            return this;
        }

        public Builder setDataQualityJobInput(DataQualityJobDefinitionDataQualityJobInputArgs dataQualityJobInput) {
            this.dataQualityJobInput = Input.of(Objects.requireNonNull(dataQualityJobInput));
            return this;
        }

        public Builder setDataQualityJobOutputConfig(Input<DataQualityJobDefinitionMonitoringOutputConfigArgs> dataQualityJobOutputConfig) {
            this.dataQualityJobOutputConfig = Objects.requireNonNull(dataQualityJobOutputConfig);
            return this;
        }

        public Builder setDataQualityJobOutputConfig(DataQualityJobDefinitionMonitoringOutputConfigArgs dataQualityJobOutputConfig) {
            this.dataQualityJobOutputConfig = Input.of(Objects.requireNonNull(dataQualityJobOutputConfig));
            return this;
        }

        public Builder setJobDefinitionName(@Nullable Input<String> jobDefinitionName) {
            this.jobDefinitionName = jobDefinitionName;
            return this;
        }

        public Builder setJobDefinitionName(@Nullable String jobDefinitionName) {
            this.jobDefinitionName = Input.ofNullable(jobDefinitionName);
            return this;
        }

        public Builder setJobResources(Input<DataQualityJobDefinitionMonitoringResourcesArgs> jobResources) {
            this.jobResources = Objects.requireNonNull(jobResources);
            return this;
        }

        public Builder setJobResources(DataQualityJobDefinitionMonitoringResourcesArgs jobResources) {
            this.jobResources = Input.of(Objects.requireNonNull(jobResources));
            return this;
        }

        public Builder setNetworkConfig(@Nullable Input<DataQualityJobDefinitionNetworkConfigArgs> networkConfig) {
            this.networkConfig = networkConfig;
            return this;
        }

        public Builder setNetworkConfig(@Nullable DataQualityJobDefinitionNetworkConfigArgs networkConfig) {
            this.networkConfig = Input.ofNullable(networkConfig);
            return this;
        }

        public Builder setRoleArn(Input<String> roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }

        public Builder setRoleArn(String roleArn) {
            this.roleArn = Input.of(Objects.requireNonNull(roleArn));
            return this;
        }

        public Builder setStoppingCondition(@Nullable Input<DataQualityJobDefinitionStoppingConditionArgs> stoppingCondition) {
            this.stoppingCondition = stoppingCondition;
            return this;
        }

        public Builder setStoppingCondition(@Nullable DataQualityJobDefinitionStoppingConditionArgs stoppingCondition) {
            this.stoppingCondition = Input.ofNullable(stoppingCondition);
            return this;
        }

        public Builder setTags(@Nullable Input<List<DataQualityJobDefinitionTagArgs>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable List<DataQualityJobDefinitionTagArgs> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }
        public DataQualityJobDefinitionArgs build() {
            return new DataQualityJobDefinitionArgs(dataQualityAppSpecification, dataQualityBaselineConfig, dataQualityJobInput, dataQualityJobOutputConfig, jobDefinitionName, jobResources, networkConfig, roleArn, stoppingCondition, tags);
        }
    }
}
