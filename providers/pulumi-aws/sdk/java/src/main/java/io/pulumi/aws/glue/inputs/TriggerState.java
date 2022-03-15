// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.glue.inputs;

import io.pulumi.aws.glue.inputs.TriggerActionGetArgs;
import io.pulumi.aws.glue.inputs.TriggerPredicateGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TriggerState extends io.pulumi.resources.ResourceArgs {

    public static final TriggerState Empty = new TriggerState();

    /**
     * List of actions initiated by this trigger when it fires. See Actions Below.
     * 
     */
    @Import(name="actions")
      private final @Nullable Output<List<TriggerActionGetArgs>> actions;

    public Output<List<TriggerActionGetArgs>> getActions() {
        return this.actions == null ? Output.empty() : this.actions;
    }

    /**
     * Amazon Resource Name (ARN) of Glue Trigger
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> getArn() {
        return this.arn == null ? Output.empty() : this.arn;
    }

    /**
     * A description of the new trigger.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * Start the trigger. Defaults to `true`.
     * 
     */
    @Import(name="enabled")
      private final @Nullable Output<Boolean> enabled;

    public Output<Boolean> getEnabled() {
        return this.enabled == null ? Output.empty() : this.enabled;
    }

    /**
     * The name of the trigger.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * A predicate to specify when the new trigger should fire. Required when trigger type is `CONDITIONAL`. See Predicate Below.
     * 
     */
    @Import(name="predicate")
      private final @Nullable Output<TriggerPredicateGetArgs> predicate;

    public Output<TriggerPredicateGetArgs> getPredicate() {
        return this.predicate == null ? Output.empty() : this.predicate;
    }

    /**
     * A cron expression used to specify the schedule. [Time-Based Schedules for Jobs and Crawlers](https://docs.aws.amazon.com/glue/latest/dg/monitor-data-warehouse-schedule.html)
     * 
     */
    @Import(name="schedule")
      private final @Nullable Output<String> schedule;

    public Output<String> getSchedule() {
        return this.schedule == null ? Output.empty() : this.schedule;
    }

    /**
     * Set to true to start `SCHEDULED` and `CONDITIONAL` triggers when created. True is not supported for `ON_DEMAND` triggers.
     * 
     */
    @Import(name="startOnCreation")
      private final @Nullable Output<Boolean> startOnCreation;

    public Output<Boolean> getStartOnCreation() {
        return this.startOnCreation == null ? Output.empty() : this.startOnCreation;
    }

    /**
     * The condition job state. Currently, the values supported are `SUCCEEDED`, `STOPPED`, `TIMEOUT` and `FAILED`. If this is specified, `job_name` must also be specified. Conflicts with `crawler_state`.
     * 
     */
    @Import(name="state")
      private final @Nullable Output<String> state;

    public Output<String> getState() {
        return this.state == null ? Output.empty() : this.state;
    }

    /**
     * Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @Import(name="tagsAll")
      private final @Nullable Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Output.empty() : this.tagsAll;
    }

    /**
     * The type of trigger. Valid values are `CONDITIONAL`, `ON_DEMAND`, and `SCHEDULED`.
     * 
     */
    @Import(name="type")
      private final @Nullable Output<String> type;

    public Output<String> getType() {
        return this.type == null ? Output.empty() : this.type;
    }

    /**
     * A workflow to which the trigger should be associated to. Every workflow graph (DAG) needs a starting trigger (`ON_DEMAND` or `SCHEDULED` type) and can contain multiple additional `CONDITIONAL` triggers.
     * 
     */
    @Import(name="workflowName")
      private final @Nullable Output<String> workflowName;

    public Output<String> getWorkflowName() {
        return this.workflowName == null ? Output.empty() : this.workflowName;
    }

    public TriggerState(
        @Nullable Output<List<TriggerActionGetArgs>> actions,
        @Nullable Output<String> arn,
        @Nullable Output<String> description,
        @Nullable Output<Boolean> enabled,
        @Nullable Output<String> name,
        @Nullable Output<TriggerPredicateGetArgs> predicate,
        @Nullable Output<String> schedule,
        @Nullable Output<Boolean> startOnCreation,
        @Nullable Output<String> state,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll,
        @Nullable Output<String> type,
        @Nullable Output<String> workflowName) {
        this.actions = actions;
        this.arn = arn;
        this.description = description;
        this.enabled = enabled;
        this.name = name;
        this.predicate = predicate;
        this.schedule = schedule;
        this.startOnCreation = startOnCreation;
        this.state = state;
        this.tags = tags;
        this.tagsAll = tagsAll;
        this.type = type;
        this.workflowName = workflowName;
    }

    private TriggerState() {
        this.actions = Output.empty();
        this.arn = Output.empty();
        this.description = Output.empty();
        this.enabled = Output.empty();
        this.name = Output.empty();
        this.predicate = Output.empty();
        this.schedule = Output.empty();
        this.startOnCreation = Output.empty();
        this.state = Output.empty();
        this.tags = Output.empty();
        this.tagsAll = Output.empty();
        this.type = Output.empty();
        this.workflowName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TriggerState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<TriggerActionGetArgs>> actions;
        private @Nullable Output<String> arn;
        private @Nullable Output<String> description;
        private @Nullable Output<Boolean> enabled;
        private @Nullable Output<String> name;
        private @Nullable Output<TriggerPredicateGetArgs> predicate;
        private @Nullable Output<String> schedule;
        private @Nullable Output<Boolean> startOnCreation;
        private @Nullable Output<String> state;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;
        private @Nullable Output<String> type;
        private @Nullable Output<String> workflowName;

        public Builder() {
    	      // Empty
        }

        public Builder(TriggerState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actions = defaults.actions;
    	      this.arn = defaults.arn;
    	      this.description = defaults.description;
    	      this.enabled = defaults.enabled;
    	      this.name = defaults.name;
    	      this.predicate = defaults.predicate;
    	      this.schedule = defaults.schedule;
    	      this.startOnCreation = defaults.startOnCreation;
    	      this.state = defaults.state;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
    	      this.type = defaults.type;
    	      this.workflowName = defaults.workflowName;
        }

        public Builder actions(@Nullable Output<List<TriggerActionGetArgs>> actions) {
            this.actions = actions;
            return this;
        }

        public Builder actions(@Nullable List<TriggerActionGetArgs> actions) {
            this.actions = Output.ofNullable(actions);
            return this;
        }

        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = Output.ofNullable(arn);
            return this;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }

        public Builder enabled(@Nullable Output<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = Output.ofNullable(enabled);
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

        public Builder predicate(@Nullable Output<TriggerPredicateGetArgs> predicate) {
            this.predicate = predicate;
            return this;
        }

        public Builder predicate(@Nullable TriggerPredicateGetArgs predicate) {
            this.predicate = Output.ofNullable(predicate);
            return this;
        }

        public Builder schedule(@Nullable Output<String> schedule) {
            this.schedule = schedule;
            return this;
        }

        public Builder schedule(@Nullable String schedule) {
            this.schedule = Output.ofNullable(schedule);
            return this;
        }

        public Builder startOnCreation(@Nullable Output<Boolean> startOnCreation) {
            this.startOnCreation = startOnCreation;
            return this;
        }

        public Builder startOnCreation(@Nullable Boolean startOnCreation) {
            this.startOnCreation = Output.ofNullable(startOnCreation);
            return this;
        }

        public Builder state(@Nullable Output<String> state) {
            this.state = state;
            return this;
        }

        public Builder state(@Nullable String state) {
            this.state = Output.ofNullable(state);
            return this;
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }

        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }

        public Builder tagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Output.ofNullable(tagsAll);
            return this;
        }

        public Builder type(@Nullable Output<String> type) {
            this.type = type;
            return this;
        }

        public Builder type(@Nullable String type) {
            this.type = Output.ofNullable(type);
            return this;
        }

        public Builder workflowName(@Nullable Output<String> workflowName) {
            this.workflowName = workflowName;
            return this;
        }

        public Builder workflowName(@Nullable String workflowName) {
            this.workflowName = Output.ofNullable(workflowName);
            return this;
        }
        public TriggerState build() {
            return new TriggerState(actions, arn, description, enabled, name, predicate, schedule, startOnCreation, state, tags, tagsAll, type, workflowName);
        }
    }
}
