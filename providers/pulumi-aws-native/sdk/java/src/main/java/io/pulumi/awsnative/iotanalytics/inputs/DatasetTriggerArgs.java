// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotanalytics.inputs;

import io.pulumi.awsnative.iotanalytics.inputs.DatasetScheduleArgs;
import io.pulumi.awsnative.iotanalytics.inputs.DatasetTriggeringDatasetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DatasetTriggerArgs extends io.pulumi.resources.ResourceArgs {

    public static final DatasetTriggerArgs Empty = new DatasetTriggerArgs();

    @Import(name="schedule")
      private final @Nullable Output<DatasetScheduleArgs> schedule;

    public Output<DatasetScheduleArgs> getSchedule() {
        return this.schedule == null ? Output.empty() : this.schedule;
    }

    @Import(name="triggeringDataset")
      private final @Nullable Output<DatasetTriggeringDatasetArgs> triggeringDataset;

    public Output<DatasetTriggeringDatasetArgs> getTriggeringDataset() {
        return this.triggeringDataset == null ? Output.empty() : this.triggeringDataset;
    }

    public DatasetTriggerArgs(
        @Nullable Output<DatasetScheduleArgs> schedule,
        @Nullable Output<DatasetTriggeringDatasetArgs> triggeringDataset) {
        this.schedule = schedule;
        this.triggeringDataset = triggeringDataset;
    }

    private DatasetTriggerArgs() {
        this.schedule = Output.empty();
        this.triggeringDataset = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatasetTriggerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<DatasetScheduleArgs> schedule;
        private @Nullable Output<DatasetTriggeringDatasetArgs> triggeringDataset;

        public Builder() {
    	      // Empty
        }

        public Builder(DatasetTriggerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.schedule = defaults.schedule;
    	      this.triggeringDataset = defaults.triggeringDataset;
        }

        public Builder schedule(@Nullable Output<DatasetScheduleArgs> schedule) {
            this.schedule = schedule;
            return this;
        }

        public Builder schedule(@Nullable DatasetScheduleArgs schedule) {
            this.schedule = Output.ofNullable(schedule);
            return this;
        }

        public Builder triggeringDataset(@Nullable Output<DatasetTriggeringDatasetArgs> triggeringDataset) {
            this.triggeringDataset = triggeringDataset;
            return this;
        }

        public Builder triggeringDataset(@Nullable DatasetTriggeringDatasetArgs triggeringDataset) {
            this.triggeringDataset = Output.ofNullable(triggeringDataset);
            return this;
        }
        public DatasetTriggerArgs build() {
            return new DatasetTriggerArgs(schedule, triggeringDataset);
        }
    }
}
