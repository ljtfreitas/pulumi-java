// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.compute_v1.outputs.AutoscalerStatusDetailsResponse;
import io.pulumi.googlenative.compute_v1.outputs.AutoscalingPolicyResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class GetRegionAutoscalerResult {
    /**
     * The configuration parameters for the autoscaling algorithm. You can define one or more signals for an autoscaler: cpuUtilization, customMetricUtilizations, and loadBalancingUtilization. If none of these are specified, the default will be to autoscale based on cpuUtilization to 0.6 or 60%.
     * 
     */
    private final AutoscalingPolicyResponse autoscalingPolicy;
    /**
     * Creation timestamp in RFC3339 text format.
     * 
     */
    private final String creationTimestamp;
    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    private final String description;
    /**
     * Type of the resource. Always compute#autoscaler for autoscalers.
     * 
     */
    private final String kind;
    /**
     * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    private final String name;
    /**
     * Target recommended MIG size (number of instances) computed by autoscaler. Autoscaler calculates the recommended MIG size even when the autoscaling policy mode is different from ON. This field is empty when autoscaler is not connected to an existing managed instance group or autoscaler did not generate its prediction.
     * 
     */
    private final Integer recommendedSize;
    /**
     * URL of the region where the instance group resides (for autoscalers living in regional scope).
     * 
     */
    private final String region;
    /**
     * Status information of existing scaling schedules.
     * 
     */
    private final Map<String,String> scalingScheduleStatus;
    /**
     * Server-defined URL for the resource.
     * 
     */
    private final String selfLink;
    /**
     * The status of the autoscaler configuration. Current set of possible values: - PENDING: Autoscaler backend hasn't read new/updated configuration. - DELETING: Configuration is being deleted. - ACTIVE: Configuration is acknowledged to be effective. Some warnings might be present in the statusDetails field. - ERROR: Configuration has errors. Actionable for users. Details are present in the statusDetails field. New values might be added in the future.
     * 
     */
    private final String status;
    /**
     * Human-readable details about the current state of the autoscaler. Read the documentation for Commonly returned status messages for examples of status messages you might encounter.
     * 
     */
    private final List<AutoscalerStatusDetailsResponse> statusDetails;
    /**
     * URL of the managed instance group that this autoscaler will scale. This field is required when creating an autoscaler.
     * 
     */
    private final String target;
    /**
     * URL of the zone where the instance group resides (for autoscalers living in zonal scope).
     * 
     */
    private final String zone;

    @OutputCustomType.Constructor({"autoscalingPolicy","creationTimestamp","description","kind","name","recommendedSize","region","scalingScheduleStatus","selfLink","status","statusDetails","target","zone"})
    private GetRegionAutoscalerResult(
        AutoscalingPolicyResponse autoscalingPolicy,
        String creationTimestamp,
        String description,
        String kind,
        String name,
        Integer recommendedSize,
        String region,
        Map<String,String> scalingScheduleStatus,
        String selfLink,
        String status,
        List<AutoscalerStatusDetailsResponse> statusDetails,
        String target,
        String zone) {
        this.autoscalingPolicy = Objects.requireNonNull(autoscalingPolicy);
        this.creationTimestamp = Objects.requireNonNull(creationTimestamp);
        this.description = Objects.requireNonNull(description);
        this.kind = Objects.requireNonNull(kind);
        this.name = Objects.requireNonNull(name);
        this.recommendedSize = Objects.requireNonNull(recommendedSize);
        this.region = Objects.requireNonNull(region);
        this.scalingScheduleStatus = Objects.requireNonNull(scalingScheduleStatus);
        this.selfLink = Objects.requireNonNull(selfLink);
        this.status = Objects.requireNonNull(status);
        this.statusDetails = Objects.requireNonNull(statusDetails);
        this.target = Objects.requireNonNull(target);
        this.zone = Objects.requireNonNull(zone);
    }

    /**
     * The configuration parameters for the autoscaling algorithm. You can define one or more signals for an autoscaler: cpuUtilization, customMetricUtilizations, and loadBalancingUtilization. If none of these are specified, the default will be to autoscale based on cpuUtilization to 0.6 or 60%.
     * 
     */
    public AutoscalingPolicyResponse getAutoscalingPolicy() {
        return this.autoscalingPolicy;
    }
    /**
     * Creation timestamp in RFC3339 text format.
     * 
     */
    public String getCreationTimestamp() {
        return this.creationTimestamp;
    }
    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    public String getDescription() {
        return this.description;
    }
    /**
     * Type of the resource. Always compute#autoscaler for autoscalers.
     * 
     */
    public String getKind() {
        return this.kind;
    }
    /**
     * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * Target recommended MIG size (number of instances) computed by autoscaler. Autoscaler calculates the recommended MIG size even when the autoscaling policy mode is different from ON. This field is empty when autoscaler is not connected to an existing managed instance group or autoscaler did not generate its prediction.
     * 
     */
    public Integer getRecommendedSize() {
        return this.recommendedSize;
    }
    /**
     * URL of the region where the instance group resides (for autoscalers living in regional scope).
     * 
     */
    public String getRegion() {
        return this.region;
    }
    /**
     * Status information of existing scaling schedules.
     * 
     */
    public Map<String,String> getScalingScheduleStatus() {
        return this.scalingScheduleStatus;
    }
    /**
     * Server-defined URL for the resource.
     * 
     */
    public String getSelfLink() {
        return this.selfLink;
    }
    /**
     * The status of the autoscaler configuration. Current set of possible values: - PENDING: Autoscaler backend hasn't read new/updated configuration. - DELETING: Configuration is being deleted. - ACTIVE: Configuration is acknowledged to be effective. Some warnings might be present in the statusDetails field. - ERROR: Configuration has errors. Actionable for users. Details are present in the statusDetails field. New values might be added in the future.
     * 
     */
    public String getStatus() {
        return this.status;
    }
    /**
     * Human-readable details about the current state of the autoscaler. Read the documentation for Commonly returned status messages for examples of status messages you might encounter.
     * 
     */
    public List<AutoscalerStatusDetailsResponse> getStatusDetails() {
        return this.statusDetails;
    }
    /**
     * URL of the managed instance group that this autoscaler will scale. This field is required when creating an autoscaler.
     * 
     */
    public String getTarget() {
        return this.target;
    }
    /**
     * URL of the zone where the instance group resides (for autoscalers living in zonal scope).
     * 
     */
    public String getZone() {
        return this.zone;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRegionAutoscalerResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AutoscalingPolicyResponse autoscalingPolicy;
        private String creationTimestamp;
        private String description;
        private String kind;
        private String name;
        private Integer recommendedSize;
        private String region;
        private Map<String,String> scalingScheduleStatus;
        private String selfLink;
        private String status;
        private List<AutoscalerStatusDetailsResponse> statusDetails;
        private String target;
        private String zone;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRegionAutoscalerResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoscalingPolicy = defaults.autoscalingPolicy;
    	      this.creationTimestamp = defaults.creationTimestamp;
    	      this.description = defaults.description;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.recommendedSize = defaults.recommendedSize;
    	      this.region = defaults.region;
    	      this.scalingScheduleStatus = defaults.scalingScheduleStatus;
    	      this.selfLink = defaults.selfLink;
    	      this.status = defaults.status;
    	      this.statusDetails = defaults.statusDetails;
    	      this.target = defaults.target;
    	      this.zone = defaults.zone;
        }

        public Builder setAutoscalingPolicy(AutoscalingPolicyResponse autoscalingPolicy) {
            this.autoscalingPolicy = Objects.requireNonNull(autoscalingPolicy);
            return this;
        }

        public Builder setCreationTimestamp(String creationTimestamp) {
            this.creationTimestamp = Objects.requireNonNull(creationTimestamp);
            return this;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setRecommendedSize(Integer recommendedSize) {
            this.recommendedSize = Objects.requireNonNull(recommendedSize);
            return this;
        }

        public Builder setRegion(String region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }

        public Builder setScalingScheduleStatus(Map<String,String> scalingScheduleStatus) {
            this.scalingScheduleStatus = Objects.requireNonNull(scalingScheduleStatus);
            return this;
        }

        public Builder setSelfLink(String selfLink) {
            this.selfLink = Objects.requireNonNull(selfLink);
            return this;
        }

        public Builder setStatus(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public Builder setStatusDetails(List<AutoscalerStatusDetailsResponse> statusDetails) {
            this.statusDetails = Objects.requireNonNull(statusDetails);
            return this;
        }

        public Builder setTarget(String target) {
            this.target = Objects.requireNonNull(target);
            return this;
        }

        public Builder setZone(String zone) {
            this.zone = Objects.requireNonNull(zone);
            return this;
        }
        public GetRegionAutoscalerResult build() {
            return new GetRegionAutoscalerResult(autoscalingPolicy, creationTimestamp, description, kind, name, recommendedSize, region, scalingScheduleStatus, selfLink, status, statusDetails, target, zone);
        }
    }
}
