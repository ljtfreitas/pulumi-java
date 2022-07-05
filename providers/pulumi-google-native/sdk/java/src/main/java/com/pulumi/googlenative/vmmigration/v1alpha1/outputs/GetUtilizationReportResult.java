// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.vmmigration.v1alpha1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.vmmigration.v1alpha1.outputs.StatusResponse;
import com.pulumi.googlenative.vmmigration.v1alpha1.outputs.VmUtilizationInfoResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetUtilizationReportResult {
    /**
     * @return The time the report was created (this refers to the time of the request, not the time the report creation completed).
     * 
     */
    private final String createTime;
    /**
     * @return The report display name, as assigned by the user.
     * 
     */
    private final String displayName;
    /**
     * @return Provides details on the state of the report in case of an error.
     * 
     */
    private final StatusResponse error;
    /**
     * @return The point in time when the time frame ends. Notice that the time frame is counted backwards. For instance if the &#34;frame_end_time&#34; value is 2021/01/20 and the time frame is WEEK then the report covers the week between 2021/01/20 and 2021/01/14.
     * 
     */
    private final String frameEndTime;
    /**
     * @return The report unique name.
     * 
     */
    private final String name;
    /**
     * @return Current state of the report.
     * 
     */
    private final String state;
    /**
     * @return The time the state was last set.
     * 
     */
    private final String stateTime;
    /**
     * @return Time frame of the report.
     * 
     */
    private final String timeFrame;
    /**
     * @return Total number of VMs included in the report.
     * 
     */
    private final Integer vmCount;
    /**
     * @return List of utilization information per VM. When sent as part of the request, the &#34;vm_id&#34; field is used in order to specify which VMs to include in the report. In that case all other fields are ignored.
     * 
     */
    private final List<VmUtilizationInfoResponse> vms;
    /**
     * @return Total number of VMs included in the report.
     * 
     */
    private final Integer vmsCount;

    @CustomType.Constructor
    private GetUtilizationReportResult(
        @CustomType.Parameter("createTime") String createTime,
        @CustomType.Parameter("displayName") String displayName,
        @CustomType.Parameter("error") StatusResponse error,
        @CustomType.Parameter("frameEndTime") String frameEndTime,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("state") String state,
        @CustomType.Parameter("stateTime") String stateTime,
        @CustomType.Parameter("timeFrame") String timeFrame,
        @CustomType.Parameter("vmCount") Integer vmCount,
        @CustomType.Parameter("vms") List<VmUtilizationInfoResponse> vms,
        @CustomType.Parameter("vmsCount") Integer vmsCount) {
        this.createTime = createTime;
        this.displayName = displayName;
        this.error = error;
        this.frameEndTime = frameEndTime;
        this.name = name;
        this.state = state;
        this.stateTime = stateTime;
        this.timeFrame = timeFrame;
        this.vmCount = vmCount;
        this.vms = vms;
        this.vmsCount = vmsCount;
    }

    /**
     * @return The time the report was created (this refers to the time of the request, not the time the report creation completed).
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    /**
     * @return The report display name, as assigned by the user.
     * 
     */
    public String displayName() {
        return this.displayName;
    }
    /**
     * @return Provides details on the state of the report in case of an error.
     * 
     */
    public StatusResponse error() {
        return this.error;
    }
    /**
     * @return The point in time when the time frame ends. Notice that the time frame is counted backwards. For instance if the &#34;frame_end_time&#34; value is 2021/01/20 and the time frame is WEEK then the report covers the week between 2021/01/20 and 2021/01/14.
     * 
     */
    public String frameEndTime() {
        return this.frameEndTime;
    }
    /**
     * @return The report unique name.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Current state of the report.
     * 
     */
    public String state() {
        return this.state;
    }
    /**
     * @return The time the state was last set.
     * 
     */
    public String stateTime() {
        return this.stateTime;
    }
    /**
     * @return Time frame of the report.
     * 
     */
    public String timeFrame() {
        return this.timeFrame;
    }
    /**
     * @return Total number of VMs included in the report.
     * 
     */
    public Integer vmCount() {
        return this.vmCount;
    }
    /**
     * @return List of utilization information per VM. When sent as part of the request, the &#34;vm_id&#34; field is used in order to specify which VMs to include in the report. In that case all other fields are ignored.
     * 
     */
    public List<VmUtilizationInfoResponse> vms() {
        return this.vms;
    }
    /**
     * @return Total number of VMs included in the report.
     * 
     */
    public Integer vmsCount() {
        return this.vmsCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetUtilizationReportResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createTime;
        private String displayName;
        private StatusResponse error;
        private String frameEndTime;
        private String name;
        private String state;
        private String stateTime;
        private String timeFrame;
        private Integer vmCount;
        private List<VmUtilizationInfoResponse> vms;
        private Integer vmsCount;

        public Builder() {
    	      // Empty
        }

        public Builder(GetUtilizationReportResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.displayName = defaults.displayName;
    	      this.error = defaults.error;
    	      this.frameEndTime = defaults.frameEndTime;
    	      this.name = defaults.name;
    	      this.state = defaults.state;
    	      this.stateTime = defaults.stateTime;
    	      this.timeFrame = defaults.timeFrame;
    	      this.vmCount = defaults.vmCount;
    	      this.vms = defaults.vms;
    	      this.vmsCount = defaults.vmsCount;
        }

        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public Builder error(StatusResponse error) {
            this.error = Objects.requireNonNull(error);
            return this;
        }
        public Builder frameEndTime(String frameEndTime) {
            this.frameEndTime = Objects.requireNonNull(frameEndTime);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public Builder stateTime(String stateTime) {
            this.stateTime = Objects.requireNonNull(stateTime);
            return this;
        }
        public Builder timeFrame(String timeFrame) {
            this.timeFrame = Objects.requireNonNull(timeFrame);
            return this;
        }
        public Builder vmCount(Integer vmCount) {
            this.vmCount = Objects.requireNonNull(vmCount);
            return this;
        }
        public Builder vms(List<VmUtilizationInfoResponse> vms) {
            this.vms = Objects.requireNonNull(vms);
            return this;
        }
        public Builder vms(VmUtilizationInfoResponse... vms) {
            return vms(List.of(vms));
        }
        public Builder vmsCount(Integer vmsCount) {
            this.vmsCount = Objects.requireNonNull(vmsCount);
            return this;
        }        public GetUtilizationReportResult build() {
            return new GetUtilizationReportResult(createTime, displayName, error, frameEndTime, name, state, stateTime, timeFrame, vmCount, vms, vmsCount);
        }
    }
}
