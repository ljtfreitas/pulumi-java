// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.dlp_v2.enums.JobTriggerStatus;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2InspectJobConfigArgs;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2TriggerArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class JobTriggerArgs extends io.pulumi.resources.ResourceArgs {

    public static final JobTriggerArgs Empty = new JobTriggerArgs();

    /**
     * User provided description (max 256 chars)
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * Display name (max 100 chars)
     * 
     */
    @Import(name="displayName")
      private final @Nullable Output<String> displayName;

    public Output<String> getDisplayName() {
        return this.displayName == null ? Output.empty() : this.displayName;
    }

    /**
     * For inspect jobs, a snapshot of the configuration.
     * 
     */
    @Import(name="inspectJob")
      private final @Nullable Output<GooglePrivacyDlpV2InspectJobConfigArgs> inspectJob;

    public Output<GooglePrivacyDlpV2InspectJobConfigArgs> getInspectJob() {
        return this.inspectJob == null ? Output.empty() : this.inspectJob;
    }

    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Output.empty() : this.location;
    }

    /**
     * Unique resource name for the triggeredJob, assigned by the service when the triggeredJob is created, for example `projects/dlp-test-project/jobTriggers/53234423`.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    /**
     * A status for this trigger.
     * 
     */
    @Import(name="status", required=true)
      private final Output<JobTriggerStatus> status;

    public Output<JobTriggerStatus> getStatus() {
        return this.status;
    }

    /**
     * The trigger id can contain uppercase and lowercase letters, numbers, and hyphens; that is, it must match the regular expression: `[a-zA-Z\d-_]+`. The maximum length is 100 characters. Can be empty to allow the system to generate one.
     * 
     */
    @Import(name="triggerId")
      private final @Nullable Output<String> triggerId;

    public Output<String> getTriggerId() {
        return this.triggerId == null ? Output.empty() : this.triggerId;
    }

    /**
     * A list of triggers which will be OR'ed together. Only one in the list needs to trigger for a job to be started. The list may contain only a single Schedule trigger and must have at least one object.
     * 
     */
    @Import(name="triggers")
      private final @Nullable Output<List<GooglePrivacyDlpV2TriggerArgs>> triggers;

    public Output<List<GooglePrivacyDlpV2TriggerArgs>> getTriggers() {
        return this.triggers == null ? Output.empty() : this.triggers;
    }

    public JobTriggerArgs(
        @Nullable Output<String> description,
        @Nullable Output<String> displayName,
        @Nullable Output<GooglePrivacyDlpV2InspectJobConfigArgs> inspectJob,
        @Nullable Output<String> location,
        @Nullable Output<String> name,
        @Nullable Output<String> project,
        Output<JobTriggerStatus> status,
        @Nullable Output<String> triggerId,
        @Nullable Output<List<GooglePrivacyDlpV2TriggerArgs>> triggers) {
        this.description = description;
        this.displayName = displayName;
        this.inspectJob = inspectJob;
        this.location = location;
        this.name = name;
        this.project = project;
        this.status = Objects.requireNonNull(status, "expected parameter 'status' to be non-null");
        this.triggerId = triggerId;
        this.triggers = triggers;
    }

    private JobTriggerArgs() {
        this.description = Output.empty();
        this.displayName = Output.empty();
        this.inspectJob = Output.empty();
        this.location = Output.empty();
        this.name = Output.empty();
        this.project = Output.empty();
        this.status = Output.empty();
        this.triggerId = Output.empty();
        this.triggers = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobTriggerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private @Nullable Output<String> displayName;
        private @Nullable Output<GooglePrivacyDlpV2InspectJobConfigArgs> inspectJob;
        private @Nullable Output<String> location;
        private @Nullable Output<String> name;
        private @Nullable Output<String> project;
        private Output<JobTriggerStatus> status;
        private @Nullable Output<String> triggerId;
        private @Nullable Output<List<GooglePrivacyDlpV2TriggerArgs>> triggers;

        public Builder() {
    	      // Empty
        }

        public Builder(JobTriggerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.inspectJob = defaults.inspectJob;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.status = defaults.status;
    	      this.triggerId = defaults.triggerId;
    	      this.triggers = defaults.triggers;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }

        public Builder displayName(@Nullable Output<String> displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder displayName(@Nullable String displayName) {
            this.displayName = Output.ofNullable(displayName);
            return this;
        }

        public Builder inspectJob(@Nullable Output<GooglePrivacyDlpV2InspectJobConfigArgs> inspectJob) {
            this.inspectJob = inspectJob;
            return this;
        }

        public Builder inspectJob(@Nullable GooglePrivacyDlpV2InspectJobConfigArgs inspectJob) {
            this.inspectJob = Output.ofNullable(inspectJob);
            return this;
        }

        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }

        public Builder location(@Nullable String location) {
            this.location = Output.ofNullable(location);
            return this;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }

        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = Output.ofNullable(project);
            return this;
        }

        public Builder status(Output<JobTriggerStatus> status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public Builder status(JobTriggerStatus status) {
            this.status = Output.of(Objects.requireNonNull(status));
            return this;
        }

        public Builder triggerId(@Nullable Output<String> triggerId) {
            this.triggerId = triggerId;
            return this;
        }

        public Builder triggerId(@Nullable String triggerId) {
            this.triggerId = Output.ofNullable(triggerId);
            return this;
        }

        public Builder triggers(@Nullable Output<List<GooglePrivacyDlpV2TriggerArgs>> triggers) {
            this.triggers = triggers;
            return this;
        }

        public Builder triggers(@Nullable List<GooglePrivacyDlpV2TriggerArgs> triggers) {
            this.triggers = Output.ofNullable(triggers);
            return this;
        }
        public JobTriggerArgs build() {
            return new JobTriggerArgs(description, displayName, inspectJob, location, name, project, status, triggerId, triggers);
        }
    }
}
