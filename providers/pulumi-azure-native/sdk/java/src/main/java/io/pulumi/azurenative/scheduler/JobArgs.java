// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.scheduler;

import io.pulumi.azurenative.scheduler.inputs.JobPropertiesArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class JobArgs extends io.pulumi.resources.ResourceArgs {

    public static final JobArgs Empty = new JobArgs();

    @InputImport(name="jobCollectionName", required=true)
    private final Input<String> jobCollectionName;

    public Input<String> getJobCollectionName() {
        return this.jobCollectionName;
    }

    @InputImport(name="jobName")
    private final @Nullable Input<String> jobName;

    public Input<String> getJobName() {
        return this.jobName == null ? Input.empty() : this.jobName;
    }

    @InputImport(name="properties")
    private final @Nullable Input<JobPropertiesArgs> properties;

    public Input<JobPropertiesArgs> getProperties() {
        return this.properties == null ? Input.empty() : this.properties;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    public JobArgs(
        Input<String> jobCollectionName,
        @Nullable Input<String> jobName,
        @Nullable Input<JobPropertiesArgs> properties,
        Input<String> resourceGroupName) {
        this.jobCollectionName = Objects.requireNonNull(jobCollectionName, "expected parameter 'jobCollectionName' to be non-null");
        this.jobName = jobName;
        this.properties = properties;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private JobArgs() {
        this.jobCollectionName = Input.empty();
        this.jobName = Input.empty();
        this.properties = Input.empty();
        this.resourceGroupName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> jobCollectionName;
        private @Nullable Input<String> jobName;
        private @Nullable Input<JobPropertiesArgs> properties;
        private Input<String> resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(JobArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.jobCollectionName = defaults.jobCollectionName;
    	      this.jobName = defaults.jobName;
    	      this.properties = defaults.properties;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setJobCollectionName(Input<String> jobCollectionName) {
            this.jobCollectionName = Objects.requireNonNull(jobCollectionName);
            return this;
        }

        public Builder setJobCollectionName(String jobCollectionName) {
            this.jobCollectionName = Input.of(Objects.requireNonNull(jobCollectionName));
            return this;
        }

        public Builder setJobName(@Nullable Input<String> jobName) {
            this.jobName = jobName;
            return this;
        }

        public Builder setJobName(@Nullable String jobName) {
            this.jobName = Input.ofNullable(jobName);
            return this;
        }

        public Builder setProperties(@Nullable Input<JobPropertiesArgs> properties) {
            this.properties = properties;
            return this;
        }

        public Builder setProperties(@Nullable JobPropertiesArgs properties) {
            this.properties = Input.ofNullable(properties);
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

        public JobArgs build() {
            return new JobArgs(jobCollectionName, jobName, properties, resourceGroupName);
        }
    }
}