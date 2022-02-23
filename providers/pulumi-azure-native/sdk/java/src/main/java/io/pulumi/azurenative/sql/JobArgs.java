// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql;

import io.pulumi.azurenative.sql.inputs.JobScheduleArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class JobArgs extends io.pulumi.resources.ResourceArgs {

    public static final JobArgs Empty = new JobArgs();

    /**
     * User-defined description of the job.
     * 
     */
    @InputImport(name="description")
        private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The name of the job agent.
     * 
     */
    @InputImport(name="jobAgentName", required=true)
        private final Input<String> jobAgentName;

    public Input<String> getJobAgentName() {
        return this.jobAgentName;
    }

    /**
     * The name of the job to get.
     * 
     */
    @InputImport(name="jobName")
        private final @Nullable Input<String> jobName;

    public Input<String> getJobName() {
        return this.jobName == null ? Input.empty() : this.jobName;
    }

    /**
     * The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
        private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Schedule properties of the job.
     * 
     */
    @InputImport(name="schedule")
        private final @Nullable Input<JobScheduleArgs> schedule;

    public Input<JobScheduleArgs> getSchedule() {
        return this.schedule == null ? Input.empty() : this.schedule;
    }

    /**
     * The name of the server.
     * 
     */
    @InputImport(name="serverName", required=true)
        private final Input<String> serverName;

    public Input<String> getServerName() {
        return this.serverName;
    }

    public JobArgs(
        @Nullable Input<String> description,
        Input<String> jobAgentName,
        @Nullable Input<String> jobName,
        Input<String> resourceGroupName,
        @Nullable Input<JobScheduleArgs> schedule,
        Input<String> serverName) {
        this.description = description == null ? Input.ofNullable("") : description;
        this.jobAgentName = Objects.requireNonNull(jobAgentName, "expected parameter 'jobAgentName' to be non-null");
        this.jobName = jobName;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.schedule = schedule;
        this.serverName = Objects.requireNonNull(serverName, "expected parameter 'serverName' to be non-null");
    }

    private JobArgs() {
        this.description = Input.empty();
        this.jobAgentName = Input.empty();
        this.jobName = Input.empty();
        this.resourceGroupName = Input.empty();
        this.schedule = Input.empty();
        this.serverName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private Input<String> jobAgentName;
        private @Nullable Input<String> jobName;
        private Input<String> resourceGroupName;
        private @Nullable Input<JobScheduleArgs> schedule;
        private Input<String> serverName;

        public Builder() {
    	      // Empty
        }

        public Builder(JobArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.jobAgentName = defaults.jobAgentName;
    	      this.jobName = defaults.jobName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.schedule = defaults.schedule;
    	      this.serverName = defaults.serverName;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setJobAgentName(Input<String> jobAgentName) {
            this.jobAgentName = Objects.requireNonNull(jobAgentName);
            return this;
        }

        public Builder setJobAgentName(String jobAgentName) {
            this.jobAgentName = Input.of(Objects.requireNonNull(jobAgentName));
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

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setSchedule(@Nullable Input<JobScheduleArgs> schedule) {
            this.schedule = schedule;
            return this;
        }

        public Builder setSchedule(@Nullable JobScheduleArgs schedule) {
            this.schedule = Input.ofNullable(schedule);
            return this;
        }

        public Builder setServerName(Input<String> serverName) {
            this.serverName = Objects.requireNonNull(serverName);
            return this;
        }

        public Builder setServerName(String serverName) {
            this.serverName = Input.of(Objects.requireNonNull(serverName));
            return this;
        }
        public JobArgs build() {
            return new JobArgs(description, jobAgentName, jobName, resourceGroupName, schedule, serverName);
        }
    }
}
