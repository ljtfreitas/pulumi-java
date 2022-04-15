// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.osconfig.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.osconfig.inputs.PatchDeploymentInstanceFilterGetArgs;
import io.pulumi.gcp.osconfig.inputs.PatchDeploymentOneTimeScheduleGetArgs;
import io.pulumi.gcp.osconfig.inputs.PatchDeploymentPatchConfigGetArgs;
import io.pulumi.gcp.osconfig.inputs.PatchDeploymentRecurringScheduleGetArgs;
import io.pulumi.gcp.osconfig.inputs.PatchDeploymentRolloutGetArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PatchDeploymentState extends io.pulumi.resources.ResourceArgs {

    public static final PatchDeploymentState Empty = new PatchDeploymentState();

    /**
     * Time the patch deployment was created. Timestamp is in RFC3339 text format. A timestamp in RFC3339 UTC "Zulu" format,
     * accurate to nanoseconds. Example: "2014-10-02T15:01:23.045123456Z".
     * 
     */
    @Import(name="createTime")
      private final @Nullable Output<String> createTime;

    public Output<String> createTime() {
        return this.createTime == null ? Codegen.empty() : this.createTime;
    }

    /**
     * Description of the patch deployment. Length of the description is limited to 1024 characters.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * Duration of the patch. After the duration ends, the patch times out.
     * A duration in seconds with up to nine fractional digits, terminated by 's'. Example: "3.5s"
     * 
     */
    @Import(name="duration")
      private final @Nullable Output<String> duration;

    public Output<String> duration() {
        return this.duration == null ? Codegen.empty() : this.duration;
    }

    /**
     * VM instances to patch.
     * Structure is documented below.
     * 
     */
    @Import(name="instanceFilter")
      private final @Nullable Output<PatchDeploymentInstanceFilterGetArgs> instanceFilter;

    public Output<PatchDeploymentInstanceFilterGetArgs> instanceFilter() {
        return this.instanceFilter == null ? Codegen.empty() : this.instanceFilter;
    }

    /**
     * - 
     * The time the last patch job ran successfully.
     * A timestamp in RFC3339 UTC "Zulu" format, accurate to nanoseconds. Example: "2014-10-02T15:01:23.045123456Z".
     * 
     */
    @Import(name="lastExecuteTime")
      private final @Nullable Output<String> lastExecuteTime;

    public Output<String> lastExecuteTime() {
        return this.lastExecuteTime == null ? Codegen.empty() : this.lastExecuteTime;
    }

    /**
     * Unique name for the patch deployment resource in a project. The patch deployment name is in the form:
     * projects/{project_id}/patchDeployments/{patchDeploymentId}.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * Schedule a one-time execution.
     * Structure is documented below.
     * 
     */
    @Import(name="oneTimeSchedule")
      private final @Nullable Output<PatchDeploymentOneTimeScheduleGetArgs> oneTimeSchedule;

    public Output<PatchDeploymentOneTimeScheduleGetArgs> oneTimeSchedule() {
        return this.oneTimeSchedule == null ? Codegen.empty() : this.oneTimeSchedule;
    }

    /**
     * Patch configuration that is applied.
     * Structure is documented below.
     * 
     */
    @Import(name="patchConfig")
      private final @Nullable Output<PatchDeploymentPatchConfigGetArgs> patchConfig;

    public Output<PatchDeploymentPatchConfigGetArgs> patchConfig() {
        return this.patchConfig == null ? Codegen.empty() : this.patchConfig;
    }

    /**
     * A name for the patch deployment in the project. When creating a name the following rules apply:
     * * Must contain only lowercase letters, numbers, and hyphens.
     * * Must start with a letter.
     * * Must be between 1-63 characters.
     * * Must end with a number or a letter.
     * * Must be unique within the project.
     * 
     */
    @Import(name="patchDeploymentId")
      private final @Nullable Output<String> patchDeploymentId;

    public Output<String> patchDeploymentId() {
        return this.patchDeploymentId == null ? Codegen.empty() : this.patchDeploymentId;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> project() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    /**
     * Schedule recurring executions.
     * Structure is documented below.
     * 
     */
    @Import(name="recurringSchedule")
      private final @Nullable Output<PatchDeploymentRecurringScheduleGetArgs> recurringSchedule;

    public Output<PatchDeploymentRecurringScheduleGetArgs> recurringSchedule() {
        return this.recurringSchedule == null ? Codegen.empty() : this.recurringSchedule;
    }

    /**
     * Rollout strategy of the patch job.
     * Structure is documented below.
     * 
     */
    @Import(name="rollout")
      private final @Nullable Output<PatchDeploymentRolloutGetArgs> rollout;

    public Output<PatchDeploymentRolloutGetArgs> rollout() {
        return this.rollout == null ? Codegen.empty() : this.rollout;
    }

    /**
     * Time the patch deployment was last updated. Timestamp is in RFC3339 text format. A timestamp in RFC3339 UTC "Zulu"
     * format, accurate to nanoseconds. Example: "2014-10-02T15:01:23.045123456Z".
     * 
     */
    @Import(name="updateTime")
      private final @Nullable Output<String> updateTime;

    public Output<String> updateTime() {
        return this.updateTime == null ? Codegen.empty() : this.updateTime;
    }

    public PatchDeploymentState(
        @Nullable Output<String> createTime,
        @Nullable Output<String> description,
        @Nullable Output<String> duration,
        @Nullable Output<PatchDeploymentInstanceFilterGetArgs> instanceFilter,
        @Nullable Output<String> lastExecuteTime,
        @Nullable Output<String> name,
        @Nullable Output<PatchDeploymentOneTimeScheduleGetArgs> oneTimeSchedule,
        @Nullable Output<PatchDeploymentPatchConfigGetArgs> patchConfig,
        @Nullable Output<String> patchDeploymentId,
        @Nullable Output<String> project,
        @Nullable Output<PatchDeploymentRecurringScheduleGetArgs> recurringSchedule,
        @Nullable Output<PatchDeploymentRolloutGetArgs> rollout,
        @Nullable Output<String> updateTime) {
        this.createTime = createTime;
        this.description = description;
        this.duration = duration;
        this.instanceFilter = instanceFilter;
        this.lastExecuteTime = lastExecuteTime;
        this.name = name;
        this.oneTimeSchedule = oneTimeSchedule;
        this.patchConfig = patchConfig;
        this.patchDeploymentId = patchDeploymentId;
        this.project = project;
        this.recurringSchedule = recurringSchedule;
        this.rollout = rollout;
        this.updateTime = updateTime;
    }

    private PatchDeploymentState() {
        this.createTime = Codegen.empty();
        this.description = Codegen.empty();
        this.duration = Codegen.empty();
        this.instanceFilter = Codegen.empty();
        this.lastExecuteTime = Codegen.empty();
        this.name = Codegen.empty();
        this.oneTimeSchedule = Codegen.empty();
        this.patchConfig = Codegen.empty();
        this.patchDeploymentId = Codegen.empty();
        this.project = Codegen.empty();
        this.recurringSchedule = Codegen.empty();
        this.rollout = Codegen.empty();
        this.updateTime = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PatchDeploymentState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> createTime;
        private @Nullable Output<String> description;
        private @Nullable Output<String> duration;
        private @Nullable Output<PatchDeploymentInstanceFilterGetArgs> instanceFilter;
        private @Nullable Output<String> lastExecuteTime;
        private @Nullable Output<String> name;
        private @Nullable Output<PatchDeploymentOneTimeScheduleGetArgs> oneTimeSchedule;
        private @Nullable Output<PatchDeploymentPatchConfigGetArgs> patchConfig;
        private @Nullable Output<String> patchDeploymentId;
        private @Nullable Output<String> project;
        private @Nullable Output<PatchDeploymentRecurringScheduleGetArgs> recurringSchedule;
        private @Nullable Output<PatchDeploymentRolloutGetArgs> rollout;
        private @Nullable Output<String> updateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(PatchDeploymentState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.description = defaults.description;
    	      this.duration = defaults.duration;
    	      this.instanceFilter = defaults.instanceFilter;
    	      this.lastExecuteTime = defaults.lastExecuteTime;
    	      this.name = defaults.name;
    	      this.oneTimeSchedule = defaults.oneTimeSchedule;
    	      this.patchConfig = defaults.patchConfig;
    	      this.patchDeploymentId = defaults.patchDeploymentId;
    	      this.project = defaults.project;
    	      this.recurringSchedule = defaults.recurringSchedule;
    	      this.rollout = defaults.rollout;
    	      this.updateTime = defaults.updateTime;
        }

        public Builder createTime(@Nullable Output<String> createTime) {
            this.createTime = createTime;
            return this;
        }
        public Builder createTime(@Nullable String createTime) {
            this.createTime = Codegen.ofNullable(createTime);
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder duration(@Nullable Output<String> duration) {
            this.duration = duration;
            return this;
        }
        public Builder duration(@Nullable String duration) {
            this.duration = Codegen.ofNullable(duration);
            return this;
        }
        public Builder instanceFilter(@Nullable Output<PatchDeploymentInstanceFilterGetArgs> instanceFilter) {
            this.instanceFilter = instanceFilter;
            return this;
        }
        public Builder instanceFilter(@Nullable PatchDeploymentInstanceFilterGetArgs instanceFilter) {
            this.instanceFilter = Codegen.ofNullable(instanceFilter);
            return this;
        }
        public Builder lastExecuteTime(@Nullable Output<String> lastExecuteTime) {
            this.lastExecuteTime = lastExecuteTime;
            return this;
        }
        public Builder lastExecuteTime(@Nullable String lastExecuteTime) {
            this.lastExecuteTime = Codegen.ofNullable(lastExecuteTime);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder oneTimeSchedule(@Nullable Output<PatchDeploymentOneTimeScheduleGetArgs> oneTimeSchedule) {
            this.oneTimeSchedule = oneTimeSchedule;
            return this;
        }
        public Builder oneTimeSchedule(@Nullable PatchDeploymentOneTimeScheduleGetArgs oneTimeSchedule) {
            this.oneTimeSchedule = Codegen.ofNullable(oneTimeSchedule);
            return this;
        }
        public Builder patchConfig(@Nullable Output<PatchDeploymentPatchConfigGetArgs> patchConfig) {
            this.patchConfig = patchConfig;
            return this;
        }
        public Builder patchConfig(@Nullable PatchDeploymentPatchConfigGetArgs patchConfig) {
            this.patchConfig = Codegen.ofNullable(patchConfig);
            return this;
        }
        public Builder patchDeploymentId(@Nullable Output<String> patchDeploymentId) {
            this.patchDeploymentId = patchDeploymentId;
            return this;
        }
        public Builder patchDeploymentId(@Nullable String patchDeploymentId) {
            this.patchDeploymentId = Codegen.ofNullable(patchDeploymentId);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }
        public Builder recurringSchedule(@Nullable Output<PatchDeploymentRecurringScheduleGetArgs> recurringSchedule) {
            this.recurringSchedule = recurringSchedule;
            return this;
        }
        public Builder recurringSchedule(@Nullable PatchDeploymentRecurringScheduleGetArgs recurringSchedule) {
            this.recurringSchedule = Codegen.ofNullable(recurringSchedule);
            return this;
        }
        public Builder rollout(@Nullable Output<PatchDeploymentRolloutGetArgs> rollout) {
            this.rollout = rollout;
            return this;
        }
        public Builder rollout(@Nullable PatchDeploymentRolloutGetArgs rollout) {
            this.rollout = Codegen.ofNullable(rollout);
            return this;
        }
        public Builder updateTime(@Nullable Output<String> updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Builder updateTime(@Nullable String updateTime) {
            this.updateTime = Codegen.ofNullable(updateTime);
            return this;
        }        public PatchDeploymentState build() {
            return new PatchDeploymentState(createTime, description, duration, instanceFilter, lastExecuteTime, name, oneTimeSchedule, patchConfig, patchDeploymentId, project, recurringSchedule, rollout, updateTime);
        }
    }
}
