// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.vmmigration_v1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.vmmigration_v1.enums.UtilizationReportTimeFrame;
import io.pulumi.googlenative.vmmigration_v1.inputs.VmUtilizationInfoArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class UtilizationReportArgs extends io.pulumi.resources.ResourceArgs {

    public static final UtilizationReportArgs Empty = new UtilizationReportArgs();

    /**
     * The report display name, as assigned by the user.
     * 
     */
    @Import(name="displayName")
      private final @Nullable Output<String> displayName;

    public Output<String> getDisplayName() {
        return this.displayName == null ? Output.empty() : this.displayName;
    }

    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Output.empty() : this.location;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    @Import(name="requestId")
      private final @Nullable Output<String> requestId;

    public Output<String> getRequestId() {
        return this.requestId == null ? Output.empty() : this.requestId;
    }

    @Import(name="sourceId", required=true)
      private final Output<String> sourceId;

    public Output<String> getSourceId() {
        return this.sourceId;
    }

    /**
     * Time frame of the report.
     * 
     */
    @Import(name="timeFrame")
      private final @Nullable Output<UtilizationReportTimeFrame> timeFrame;

    public Output<UtilizationReportTimeFrame> getTimeFrame() {
        return this.timeFrame == null ? Output.empty() : this.timeFrame;
    }

    @Import(name="utilizationReportId", required=true)
      private final Output<String> utilizationReportId;

    public Output<String> getUtilizationReportId() {
        return this.utilizationReportId;
    }

    /**
     * List of utilization information per VM. When sent as part of the request, the "vm_id" field is used in order to specify which VMs to include in the report. In that case all other fields are ignored.
     * 
     */
    @Import(name="vms")
      private final @Nullable Output<List<VmUtilizationInfoArgs>> vms;

    public Output<List<VmUtilizationInfoArgs>> getVms() {
        return this.vms == null ? Output.empty() : this.vms;
    }

    public UtilizationReportArgs(
        @Nullable Output<String> displayName,
        @Nullable Output<String> location,
        @Nullable Output<String> project,
        @Nullable Output<String> requestId,
        Output<String> sourceId,
        @Nullable Output<UtilizationReportTimeFrame> timeFrame,
        Output<String> utilizationReportId,
        @Nullable Output<List<VmUtilizationInfoArgs>> vms) {
        this.displayName = displayName;
        this.location = location;
        this.project = project;
        this.requestId = requestId;
        this.sourceId = Objects.requireNonNull(sourceId, "expected parameter 'sourceId' to be non-null");
        this.timeFrame = timeFrame;
        this.utilizationReportId = Objects.requireNonNull(utilizationReportId, "expected parameter 'utilizationReportId' to be non-null");
        this.vms = vms;
    }

    private UtilizationReportArgs() {
        this.displayName = Output.empty();
        this.location = Output.empty();
        this.project = Output.empty();
        this.requestId = Output.empty();
        this.sourceId = Output.empty();
        this.timeFrame = Output.empty();
        this.utilizationReportId = Output.empty();
        this.vms = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UtilizationReportArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> displayName;
        private @Nullable Output<String> location;
        private @Nullable Output<String> project;
        private @Nullable Output<String> requestId;
        private Output<String> sourceId;
        private @Nullable Output<UtilizationReportTimeFrame> timeFrame;
        private Output<String> utilizationReportId;
        private @Nullable Output<List<VmUtilizationInfoArgs>> vms;

        public Builder() {
    	      // Empty
        }

        public Builder(UtilizationReportArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
    	      this.location = defaults.location;
    	      this.project = defaults.project;
    	      this.requestId = defaults.requestId;
    	      this.sourceId = defaults.sourceId;
    	      this.timeFrame = defaults.timeFrame;
    	      this.utilizationReportId = defaults.utilizationReportId;
    	      this.vms = defaults.vms;
        }

        public Builder displayName(@Nullable Output<String> displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder displayName(@Nullable String displayName) {
            this.displayName = Output.ofNullable(displayName);
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

        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = Output.ofNullable(project);
            return this;
        }

        public Builder requestId(@Nullable Output<String> requestId) {
            this.requestId = requestId;
            return this;
        }

        public Builder requestId(@Nullable String requestId) {
            this.requestId = Output.ofNullable(requestId);
            return this;
        }

        public Builder sourceId(Output<String> sourceId) {
            this.sourceId = Objects.requireNonNull(sourceId);
            return this;
        }

        public Builder sourceId(String sourceId) {
            this.sourceId = Output.of(Objects.requireNonNull(sourceId));
            return this;
        }

        public Builder timeFrame(@Nullable Output<UtilizationReportTimeFrame> timeFrame) {
            this.timeFrame = timeFrame;
            return this;
        }

        public Builder timeFrame(@Nullable UtilizationReportTimeFrame timeFrame) {
            this.timeFrame = Output.ofNullable(timeFrame);
            return this;
        }

        public Builder utilizationReportId(Output<String> utilizationReportId) {
            this.utilizationReportId = Objects.requireNonNull(utilizationReportId);
            return this;
        }

        public Builder utilizationReportId(String utilizationReportId) {
            this.utilizationReportId = Output.of(Objects.requireNonNull(utilizationReportId));
            return this;
        }

        public Builder vms(@Nullable Output<List<VmUtilizationInfoArgs>> vms) {
            this.vms = vms;
            return this;
        }

        public Builder vms(@Nullable List<VmUtilizationInfoArgs> vms) {
            this.vms = Output.ofNullable(vms);
            return this;
        }
        public UtilizationReportArgs build() {
            return new UtilizationReportArgs(displayName, location, project, requestId, sourceId, timeFrame, utilizationReportId, vms);
        }
    }
}
