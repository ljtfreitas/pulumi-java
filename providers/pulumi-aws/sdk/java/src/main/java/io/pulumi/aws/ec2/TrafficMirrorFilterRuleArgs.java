// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2;

import io.pulumi.aws.ec2.inputs.TrafficMirrorFilterRuleDestinationPortRangeArgs;
import io.pulumi.aws.ec2.inputs.TrafficMirrorFilterRuleSourcePortRangeArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TrafficMirrorFilterRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final TrafficMirrorFilterRuleArgs Empty = new TrafficMirrorFilterRuleArgs();

    /**
     * Description of the traffic mirror filter rule.
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Destination CIDR block to assign to the Traffic Mirror rule.
     * 
     */
    @InputImport(name="destinationCidrBlock", required=true)
    private final Input<String> destinationCidrBlock;

    public Input<String> getDestinationCidrBlock() {
        return this.destinationCidrBlock;
    }

    /**
     * Destination port range. Supported only when the protocol is set to TCP(6) or UDP(17). See Traffic mirror port range documented below
     * 
     */
    @InputImport(name="destinationPortRange")
    private final @Nullable Input<TrafficMirrorFilterRuleDestinationPortRangeArgs> destinationPortRange;

    public Input<TrafficMirrorFilterRuleDestinationPortRangeArgs> getDestinationPortRange() {
        return this.destinationPortRange == null ? Input.empty() : this.destinationPortRange;
    }

    /**
     * Protocol number, for example 17 (UDP), to assign to the Traffic Mirror rule. For information about the protocol value, see [Protocol Numbers](https://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml) on the Internet Assigned Numbers Authority (IANA) website.
     * 
     */
    @InputImport(name="protocol")
    private final @Nullable Input<Integer> protocol;

    public Input<Integer> getProtocol() {
        return this.protocol == null ? Input.empty() : this.protocol;
    }

    /**
     * Action to take (accept | reject) on the filtered traffic. Valid values are `accept` and `reject`
     * 
     */
    @InputImport(name="ruleAction", required=true)
    private final Input<String> ruleAction;

    public Input<String> getRuleAction() {
        return this.ruleAction;
    }

    /**
     * Number of the Traffic Mirror rule. This number must be unique for each Traffic Mirror rule in a given direction. The rules are processed in ascending order by rule number.
     * 
     */
    @InputImport(name="ruleNumber", required=true)
    private final Input<Integer> ruleNumber;

    public Input<Integer> getRuleNumber() {
        return this.ruleNumber;
    }

    /**
     * Source CIDR block to assign to the Traffic Mirror rule.
     * 
     */
    @InputImport(name="sourceCidrBlock", required=true)
    private final Input<String> sourceCidrBlock;

    public Input<String> getSourceCidrBlock() {
        return this.sourceCidrBlock;
    }

    /**
     * Source port range. Supported only when the protocol is set to TCP(6) or UDP(17). See Traffic mirror port range documented below
     * 
     */
    @InputImport(name="sourcePortRange")
    private final @Nullable Input<TrafficMirrorFilterRuleSourcePortRangeArgs> sourcePortRange;

    public Input<TrafficMirrorFilterRuleSourcePortRangeArgs> getSourcePortRange() {
        return this.sourcePortRange == null ? Input.empty() : this.sourcePortRange;
    }

    /**
     * Direction of traffic to be captured. Valid values are `ingress` and `egress`
     * 
     */
    @InputImport(name="trafficDirection", required=true)
    private final Input<String> trafficDirection;

    public Input<String> getTrafficDirection() {
        return this.trafficDirection;
    }

    /**
     * ID of the traffic mirror filter to which this rule should be added
     * 
     */
    @InputImport(name="trafficMirrorFilterId", required=true)
    private final Input<String> trafficMirrorFilterId;

    public Input<String> getTrafficMirrorFilterId() {
        return this.trafficMirrorFilterId;
    }

    public TrafficMirrorFilterRuleArgs(
        @Nullable Input<String> description,
        Input<String> destinationCidrBlock,
        @Nullable Input<TrafficMirrorFilterRuleDestinationPortRangeArgs> destinationPortRange,
        @Nullable Input<Integer> protocol,
        Input<String> ruleAction,
        Input<Integer> ruleNumber,
        Input<String> sourceCidrBlock,
        @Nullable Input<TrafficMirrorFilterRuleSourcePortRangeArgs> sourcePortRange,
        Input<String> trafficDirection,
        Input<String> trafficMirrorFilterId) {
        this.description = description;
        this.destinationCidrBlock = Objects.requireNonNull(destinationCidrBlock, "expected parameter 'destinationCidrBlock' to be non-null");
        this.destinationPortRange = destinationPortRange;
        this.protocol = protocol;
        this.ruleAction = Objects.requireNonNull(ruleAction, "expected parameter 'ruleAction' to be non-null");
        this.ruleNumber = Objects.requireNonNull(ruleNumber, "expected parameter 'ruleNumber' to be non-null");
        this.sourceCidrBlock = Objects.requireNonNull(sourceCidrBlock, "expected parameter 'sourceCidrBlock' to be non-null");
        this.sourcePortRange = sourcePortRange;
        this.trafficDirection = Objects.requireNonNull(trafficDirection, "expected parameter 'trafficDirection' to be non-null");
        this.trafficMirrorFilterId = Objects.requireNonNull(trafficMirrorFilterId, "expected parameter 'trafficMirrorFilterId' to be non-null");
    }

    private TrafficMirrorFilterRuleArgs() {
        this.description = Input.empty();
        this.destinationCidrBlock = Input.empty();
        this.destinationPortRange = Input.empty();
        this.protocol = Input.empty();
        this.ruleAction = Input.empty();
        this.ruleNumber = Input.empty();
        this.sourceCidrBlock = Input.empty();
        this.sourcePortRange = Input.empty();
        this.trafficDirection = Input.empty();
        this.trafficMirrorFilterId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TrafficMirrorFilterRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private Input<String> destinationCidrBlock;
        private @Nullable Input<TrafficMirrorFilterRuleDestinationPortRangeArgs> destinationPortRange;
        private @Nullable Input<Integer> protocol;
        private Input<String> ruleAction;
        private Input<Integer> ruleNumber;
        private Input<String> sourceCidrBlock;
        private @Nullable Input<TrafficMirrorFilterRuleSourcePortRangeArgs> sourcePortRange;
        private Input<String> trafficDirection;
        private Input<String> trafficMirrorFilterId;

        public Builder() {
    	      // Empty
        }

        public Builder(TrafficMirrorFilterRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.destinationCidrBlock = defaults.destinationCidrBlock;
    	      this.destinationPortRange = defaults.destinationPortRange;
    	      this.protocol = defaults.protocol;
    	      this.ruleAction = defaults.ruleAction;
    	      this.ruleNumber = defaults.ruleNumber;
    	      this.sourceCidrBlock = defaults.sourceCidrBlock;
    	      this.sourcePortRange = defaults.sourcePortRange;
    	      this.trafficDirection = defaults.trafficDirection;
    	      this.trafficMirrorFilterId = defaults.trafficMirrorFilterId;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setDestinationCidrBlock(Input<String> destinationCidrBlock) {
            this.destinationCidrBlock = Objects.requireNonNull(destinationCidrBlock);
            return this;
        }

        public Builder setDestinationCidrBlock(String destinationCidrBlock) {
            this.destinationCidrBlock = Input.of(Objects.requireNonNull(destinationCidrBlock));
            return this;
        }

        public Builder setDestinationPortRange(@Nullable Input<TrafficMirrorFilterRuleDestinationPortRangeArgs> destinationPortRange) {
            this.destinationPortRange = destinationPortRange;
            return this;
        }

        public Builder setDestinationPortRange(@Nullable TrafficMirrorFilterRuleDestinationPortRangeArgs destinationPortRange) {
            this.destinationPortRange = Input.ofNullable(destinationPortRange);
            return this;
        }

        public Builder setProtocol(@Nullable Input<Integer> protocol) {
            this.protocol = protocol;
            return this;
        }

        public Builder setProtocol(@Nullable Integer protocol) {
            this.protocol = Input.ofNullable(protocol);
            return this;
        }

        public Builder setRuleAction(Input<String> ruleAction) {
            this.ruleAction = Objects.requireNonNull(ruleAction);
            return this;
        }

        public Builder setRuleAction(String ruleAction) {
            this.ruleAction = Input.of(Objects.requireNonNull(ruleAction));
            return this;
        }

        public Builder setRuleNumber(Input<Integer> ruleNumber) {
            this.ruleNumber = Objects.requireNonNull(ruleNumber);
            return this;
        }

        public Builder setRuleNumber(Integer ruleNumber) {
            this.ruleNumber = Input.of(Objects.requireNonNull(ruleNumber));
            return this;
        }

        public Builder setSourceCidrBlock(Input<String> sourceCidrBlock) {
            this.sourceCidrBlock = Objects.requireNonNull(sourceCidrBlock);
            return this;
        }

        public Builder setSourceCidrBlock(String sourceCidrBlock) {
            this.sourceCidrBlock = Input.of(Objects.requireNonNull(sourceCidrBlock));
            return this;
        }

        public Builder setSourcePortRange(@Nullable Input<TrafficMirrorFilterRuleSourcePortRangeArgs> sourcePortRange) {
            this.sourcePortRange = sourcePortRange;
            return this;
        }

        public Builder setSourcePortRange(@Nullable TrafficMirrorFilterRuleSourcePortRangeArgs sourcePortRange) {
            this.sourcePortRange = Input.ofNullable(sourcePortRange);
            return this;
        }

        public Builder setTrafficDirection(Input<String> trafficDirection) {
            this.trafficDirection = Objects.requireNonNull(trafficDirection);
            return this;
        }

        public Builder setTrafficDirection(String trafficDirection) {
            this.trafficDirection = Input.of(Objects.requireNonNull(trafficDirection));
            return this;
        }

        public Builder setTrafficMirrorFilterId(Input<String> trafficMirrorFilterId) {
            this.trafficMirrorFilterId = Objects.requireNonNull(trafficMirrorFilterId);
            return this;
        }

        public Builder setTrafficMirrorFilterId(String trafficMirrorFilterId) {
            this.trafficMirrorFilterId = Input.of(Objects.requireNonNull(trafficMirrorFilterId));
            return this;
        }
        public TrafficMirrorFilterRuleArgs build() {
            return new TrafficMirrorFilterRuleArgs(description, destinationCidrBlock, destinationPortRange, protocol, ruleAction, ruleNumber, sourceCidrBlock, sourcePortRange, trafficDirection, trafficMirrorFilterId);
        }
    }
}
