// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.inputs;

import io.pulumi.aws.ec2.inputs.FlowLogDestinationOptionsGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FlowLogState extends io.pulumi.resources.ResourceArgs {

    public static final FlowLogState Empty = new FlowLogState();

    /**
     * The ARN of the Flow Log.
     * 
     */
    @InputImport(name="arn")
    private final @Nullable Input<String> arn;

    public Input<String> getArn() {
        return this.arn == null ? Input.empty() : this.arn;
    }

    /**
     * Describes the destination options for a flow log. More details below.
     * 
     */
    @InputImport(name="destinationOptions")
    private final @Nullable Input<FlowLogDestinationOptionsGetArgs> destinationOptions;

    public Input<FlowLogDestinationOptionsGetArgs> getDestinationOptions() {
        return this.destinationOptions == null ? Input.empty() : this.destinationOptions;
    }

    /**
     * Elastic Network Interface ID to attach to
     * 
     */
    @InputImport(name="eniId")
    private final @Nullable Input<String> eniId;

    public Input<String> getEniId() {
        return this.eniId == null ? Input.empty() : this.eniId;
    }

    /**
     * The ARN for the IAM role that's used to post flow logs to a CloudWatch Logs log group
     * 
     */
    @InputImport(name="iamRoleArn")
    private final @Nullable Input<String> iamRoleArn;

    public Input<String> getIamRoleArn() {
        return this.iamRoleArn == null ? Input.empty() : this.iamRoleArn;
    }

    /**
     * The ARN of the logging destination.
     * 
     */
    @InputImport(name="logDestination")
    private final @Nullable Input<String> logDestination;

    public Input<String> getLogDestination() {
        return this.logDestination == null ? Input.empty() : this.logDestination;
    }

    /**
     * The type of the logging destination. Valid values: `cloud-watch-logs`, `s3`. Default: `cloud-watch-logs`.
     * 
     */
    @InputImport(name="logDestinationType")
    private final @Nullable Input<String> logDestinationType;

    public Input<String> getLogDestinationType() {
        return this.logDestinationType == null ? Input.empty() : this.logDestinationType;
    }

    /**
     * The fields to include in the flow log record, in the order in which they should appear.
     * 
     */
    @InputImport(name="logFormat")
    private final @Nullable Input<String> logFormat;

    public Input<String> getLogFormat() {
        return this.logFormat == null ? Input.empty() : this.logFormat;
    }

    /**
     * *Deprecated:* Use `log_destination` instead. The name of the CloudWatch log group.
     * 
     * @deprecated
     * use 'log_destination' argument instead
     * 
     */
    @Deprecated /* use 'log_destination' argument instead */
    @InputImport(name="logGroupName")
    private final @Nullable Input<String> logGroupName;

    @Deprecated /* use 'log_destination' argument instead */
    public Input<String> getLogGroupName() {
        return this.logGroupName == null ? Input.empty() : this.logGroupName;
    }

    /**
     * The maximum interval of time
     * during which a flow of packets is captured and aggregated into a flow
     * log record. Valid Values: `60` seconds (1 minute) or `600` seconds (10
     * minutes). Default: `600`.
     * 
     */
    @InputImport(name="maxAggregationInterval")
    private final @Nullable Input<Integer> maxAggregationInterval;

    public Input<Integer> getMaxAggregationInterval() {
        return this.maxAggregationInterval == null ? Input.empty() : this.maxAggregationInterval;
    }

    /**
     * Subnet ID to attach to
     * 
     */
    @InputImport(name="subnetId")
    private final @Nullable Input<String> subnetId;

    public Input<String> getSubnetId() {
        return this.subnetId == null ? Input.empty() : this.subnetId;
    }

    /**
     * Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @InputImport(name="tagsAll")
    private final @Nullable Input<Map<String,String>> tagsAll;

    public Input<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Input.empty() : this.tagsAll;
    }

    /**
     * The type of traffic to capture. Valid values: `ACCEPT`,`REJECT`, `ALL`.
     * 
     */
    @InputImport(name="trafficType")
    private final @Nullable Input<String> trafficType;

    public Input<String> getTrafficType() {
        return this.trafficType == null ? Input.empty() : this.trafficType;
    }

    /**
     * VPC ID to attach to
     * 
     */
    @InputImport(name="vpcId")
    private final @Nullable Input<String> vpcId;

    public Input<String> getVpcId() {
        return this.vpcId == null ? Input.empty() : this.vpcId;
    }

    public FlowLogState(
        @Nullable Input<String> arn,
        @Nullable Input<FlowLogDestinationOptionsGetArgs> destinationOptions,
        @Nullable Input<String> eniId,
        @Nullable Input<String> iamRoleArn,
        @Nullable Input<String> logDestination,
        @Nullable Input<String> logDestinationType,
        @Nullable Input<String> logFormat,
        @Nullable Input<String> logGroupName,
        @Nullable Input<Integer> maxAggregationInterval,
        @Nullable Input<String> subnetId,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<Map<String,String>> tagsAll,
        @Nullable Input<String> trafficType,
        @Nullable Input<String> vpcId) {
        this.arn = arn;
        this.destinationOptions = destinationOptions;
        this.eniId = eniId;
        this.iamRoleArn = iamRoleArn;
        this.logDestination = logDestination;
        this.logDestinationType = logDestinationType;
        this.logFormat = logFormat;
        this.logGroupName = logGroupName;
        this.maxAggregationInterval = maxAggregationInterval;
        this.subnetId = subnetId;
        this.tags = tags;
        this.tagsAll = tagsAll;
        this.trafficType = trafficType;
        this.vpcId = vpcId;
    }

    private FlowLogState() {
        this.arn = Input.empty();
        this.destinationOptions = Input.empty();
        this.eniId = Input.empty();
        this.iamRoleArn = Input.empty();
        this.logDestination = Input.empty();
        this.logDestinationType = Input.empty();
        this.logFormat = Input.empty();
        this.logGroupName = Input.empty();
        this.maxAggregationInterval = Input.empty();
        this.subnetId = Input.empty();
        this.tags = Input.empty();
        this.tagsAll = Input.empty();
        this.trafficType = Input.empty();
        this.vpcId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlowLogState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> arn;
        private @Nullable Input<FlowLogDestinationOptionsGetArgs> destinationOptions;
        private @Nullable Input<String> eniId;
        private @Nullable Input<String> iamRoleArn;
        private @Nullable Input<String> logDestination;
        private @Nullable Input<String> logDestinationType;
        private @Nullable Input<String> logFormat;
        private @Nullable Input<String> logGroupName;
        private @Nullable Input<Integer> maxAggregationInterval;
        private @Nullable Input<String> subnetId;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<Map<String,String>> tagsAll;
        private @Nullable Input<String> trafficType;
        private @Nullable Input<String> vpcId;

        public Builder() {
    	      // Empty
        }

        public Builder(FlowLogState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.destinationOptions = defaults.destinationOptions;
    	      this.eniId = defaults.eniId;
    	      this.iamRoleArn = defaults.iamRoleArn;
    	      this.logDestination = defaults.logDestination;
    	      this.logDestinationType = defaults.logDestinationType;
    	      this.logFormat = defaults.logFormat;
    	      this.logGroupName = defaults.logGroupName;
    	      this.maxAggregationInterval = defaults.maxAggregationInterval;
    	      this.subnetId = defaults.subnetId;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
    	      this.trafficType = defaults.trafficType;
    	      this.vpcId = defaults.vpcId;
        }

        public Builder setArn(@Nullable Input<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = Input.ofNullable(arn);
            return this;
        }

        public Builder setDestinationOptions(@Nullable Input<FlowLogDestinationOptionsGetArgs> destinationOptions) {
            this.destinationOptions = destinationOptions;
            return this;
        }

        public Builder setDestinationOptions(@Nullable FlowLogDestinationOptionsGetArgs destinationOptions) {
            this.destinationOptions = Input.ofNullable(destinationOptions);
            return this;
        }

        public Builder setEniId(@Nullable Input<String> eniId) {
            this.eniId = eniId;
            return this;
        }

        public Builder setEniId(@Nullable String eniId) {
            this.eniId = Input.ofNullable(eniId);
            return this;
        }

        public Builder setIamRoleArn(@Nullable Input<String> iamRoleArn) {
            this.iamRoleArn = iamRoleArn;
            return this;
        }

        public Builder setIamRoleArn(@Nullable String iamRoleArn) {
            this.iamRoleArn = Input.ofNullable(iamRoleArn);
            return this;
        }

        public Builder setLogDestination(@Nullable Input<String> logDestination) {
            this.logDestination = logDestination;
            return this;
        }

        public Builder setLogDestination(@Nullable String logDestination) {
            this.logDestination = Input.ofNullable(logDestination);
            return this;
        }

        public Builder setLogDestinationType(@Nullable Input<String> logDestinationType) {
            this.logDestinationType = logDestinationType;
            return this;
        }

        public Builder setLogDestinationType(@Nullable String logDestinationType) {
            this.logDestinationType = Input.ofNullable(logDestinationType);
            return this;
        }

        public Builder setLogFormat(@Nullable Input<String> logFormat) {
            this.logFormat = logFormat;
            return this;
        }

        public Builder setLogFormat(@Nullable String logFormat) {
            this.logFormat = Input.ofNullable(logFormat);
            return this;
        }

        public Builder setLogGroupName(@Nullable Input<String> logGroupName) {
            this.logGroupName = logGroupName;
            return this;
        }

        public Builder setLogGroupName(@Nullable String logGroupName) {
            this.logGroupName = Input.ofNullable(logGroupName);
            return this;
        }

        public Builder setMaxAggregationInterval(@Nullable Input<Integer> maxAggregationInterval) {
            this.maxAggregationInterval = maxAggregationInterval;
            return this;
        }

        public Builder setMaxAggregationInterval(@Nullable Integer maxAggregationInterval) {
            this.maxAggregationInterval = Input.ofNullable(maxAggregationInterval);
            return this;
        }

        public Builder setSubnetId(@Nullable Input<String> subnetId) {
            this.subnetId = subnetId;
            return this;
        }

        public Builder setSubnetId(@Nullable String subnetId) {
            this.subnetId = Input.ofNullable(subnetId);
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setTagsAll(@Nullable Input<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }

        public Builder setTagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Input.ofNullable(tagsAll);
            return this;
        }

        public Builder setTrafficType(@Nullable Input<String> trafficType) {
            this.trafficType = trafficType;
            return this;
        }

        public Builder setTrafficType(@Nullable String trafficType) {
            this.trafficType = Input.ofNullable(trafficType);
            return this;
        }

        public Builder setVpcId(@Nullable Input<String> vpcId) {
            this.vpcId = vpcId;
            return this;
        }

        public Builder setVpcId(@Nullable String vpcId) {
            this.vpcId = Input.ofNullable(vpcId);
            return this;
        }
        public FlowLogState build() {
            return new FlowLogState(arn, destinationOptions, eniId, iamRoleArn, logDestination, logDestinationType, logFormat, logGroupName, maxAggregationInterval, subnetId, tags, tagsAll, trafficType, vpcId);
        }
    }
}
