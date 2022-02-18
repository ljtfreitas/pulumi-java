// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.edgeorder.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class StageDetailsResponse {
    /**
     * Display name of the resource stage.
     * 
     */
    private final String displayName;
    /**
     * Stage name
     * 
     */
    private final String stageName;
    /**
     * Stage status.
     * 
     */
    private final String stageStatus;
    /**
     * Stage start time
     * 
     */
    private final String startTime;

    @OutputCustomType.Constructor({"displayName","stageName","stageStatus","startTime"})
    private StageDetailsResponse(
        String displayName,
        String stageName,
        String stageStatus,
        String startTime) {
        this.displayName = Objects.requireNonNull(displayName);
        this.stageName = Objects.requireNonNull(stageName);
        this.stageStatus = Objects.requireNonNull(stageStatus);
        this.startTime = Objects.requireNonNull(startTime);
    }

    /**
     * Display name of the resource stage.
     * 
     */
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * Stage name
     * 
     */
    public String getStageName() {
        return this.stageName;
    }
    /**
     * Stage status.
     * 
     */
    public String getStageStatus() {
        return this.stageStatus;
    }
    /**
     * Stage start time
     * 
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StageDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String displayName;
        private String stageName;
        private String stageStatus;
        private String startTime;

        public Builder() {
    	      // Empty
        }

        public Builder(StageDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
    	      this.stageName = defaults.stageName;
    	      this.stageStatus = defaults.stageStatus;
    	      this.startTime = defaults.startTime;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder setStageName(String stageName) {
            this.stageName = Objects.requireNonNull(stageName);
            return this;
        }

        public Builder setStageStatus(String stageStatus) {
            this.stageStatus = Objects.requireNonNull(stageStatus);
            return this;
        }

        public Builder setStartTime(String startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }

        public StageDetailsResponse build() {
            return new StageDetailsResponse(displayName, stageName, stageStatus, startTime);
        }
    }
}
