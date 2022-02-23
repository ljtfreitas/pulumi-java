// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.codedeploy.inputs;

import io.pulumi.aws.codedeploy.inputs.DeploymentGroupLoadBalancerInfoElbInfoArgs;
import io.pulumi.aws.codedeploy.inputs.DeploymentGroupLoadBalancerInfoTargetGroupInfoArgs;
import io.pulumi.aws.codedeploy.inputs.DeploymentGroupLoadBalancerInfoTargetGroupPairInfoArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DeploymentGroupLoadBalancerInfoArgs extends io.pulumi.resources.ResourceArgs {

    public static final DeploymentGroupLoadBalancerInfoArgs Empty = new DeploymentGroupLoadBalancerInfoArgs();

    /**
     * The Classic Elastic Load Balancer to use in a deployment. Conflicts with `target_group_info` and `target_group_pair_info`.
     * 
     */
    @InputImport(name="elbInfos")
    private final @Nullable Input<List<DeploymentGroupLoadBalancerInfoElbInfoArgs>> elbInfos;

    public Input<List<DeploymentGroupLoadBalancerInfoElbInfoArgs>> getElbInfos() {
        return this.elbInfos == null ? Input.empty() : this.elbInfos;
    }

    /**
     * The (Application/Network Load Balancer) target group to use in a deployment. Conflicts with `elb_info` and `target_group_pair_info`.
     * 
     */
    @InputImport(name="targetGroupInfos")
    private final @Nullable Input<List<DeploymentGroupLoadBalancerInfoTargetGroupInfoArgs>> targetGroupInfos;

    public Input<List<DeploymentGroupLoadBalancerInfoTargetGroupInfoArgs>> getTargetGroupInfos() {
        return this.targetGroupInfos == null ? Input.empty() : this.targetGroupInfos;
    }

    /**
     * The (Application/Network Load Balancer) target group pair to use in a deployment. Conflicts with `elb_info` and `target_group_info`.
     * 
     */
    @InputImport(name="targetGroupPairInfo")
    private final @Nullable Input<DeploymentGroupLoadBalancerInfoTargetGroupPairInfoArgs> targetGroupPairInfo;

    public Input<DeploymentGroupLoadBalancerInfoTargetGroupPairInfoArgs> getTargetGroupPairInfo() {
        return this.targetGroupPairInfo == null ? Input.empty() : this.targetGroupPairInfo;
    }

    public DeploymentGroupLoadBalancerInfoArgs(
        @Nullable Input<List<DeploymentGroupLoadBalancerInfoElbInfoArgs>> elbInfos,
        @Nullable Input<List<DeploymentGroupLoadBalancerInfoTargetGroupInfoArgs>> targetGroupInfos,
        @Nullable Input<DeploymentGroupLoadBalancerInfoTargetGroupPairInfoArgs> targetGroupPairInfo) {
        this.elbInfos = elbInfos;
        this.targetGroupInfos = targetGroupInfos;
        this.targetGroupPairInfo = targetGroupPairInfo;
    }

    private DeploymentGroupLoadBalancerInfoArgs() {
        this.elbInfos = Input.empty();
        this.targetGroupInfos = Input.empty();
        this.targetGroupPairInfo = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeploymentGroupLoadBalancerInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<DeploymentGroupLoadBalancerInfoElbInfoArgs>> elbInfos;
        private @Nullable Input<List<DeploymentGroupLoadBalancerInfoTargetGroupInfoArgs>> targetGroupInfos;
        private @Nullable Input<DeploymentGroupLoadBalancerInfoTargetGroupPairInfoArgs> targetGroupPairInfo;

        public Builder() {
    	      // Empty
        }

        public Builder(DeploymentGroupLoadBalancerInfoArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.elbInfos = defaults.elbInfos;
    	      this.targetGroupInfos = defaults.targetGroupInfos;
    	      this.targetGroupPairInfo = defaults.targetGroupPairInfo;
        }

        public Builder setElbInfos(@Nullable Input<List<DeploymentGroupLoadBalancerInfoElbInfoArgs>> elbInfos) {
            this.elbInfos = elbInfos;
            return this;
        }

        public Builder setElbInfos(@Nullable List<DeploymentGroupLoadBalancerInfoElbInfoArgs> elbInfos) {
            this.elbInfos = Input.ofNullable(elbInfos);
            return this;
        }

        public Builder setTargetGroupInfos(@Nullable Input<List<DeploymentGroupLoadBalancerInfoTargetGroupInfoArgs>> targetGroupInfos) {
            this.targetGroupInfos = targetGroupInfos;
            return this;
        }

        public Builder setTargetGroupInfos(@Nullable List<DeploymentGroupLoadBalancerInfoTargetGroupInfoArgs> targetGroupInfos) {
            this.targetGroupInfos = Input.ofNullable(targetGroupInfos);
            return this;
        }

        public Builder setTargetGroupPairInfo(@Nullable Input<DeploymentGroupLoadBalancerInfoTargetGroupPairInfoArgs> targetGroupPairInfo) {
            this.targetGroupPairInfo = targetGroupPairInfo;
            return this;
        }

        public Builder setTargetGroupPairInfo(@Nullable DeploymentGroupLoadBalancerInfoTargetGroupPairInfoArgs targetGroupPairInfo) {
            this.targetGroupPairInfo = Input.ofNullable(targetGroupPairInfo);
            return this;
        }
        public DeploymentGroupLoadBalancerInfoArgs build() {
            return new DeploymentGroupLoadBalancerInfoArgs(elbInfos, targetGroupInfos, targetGroupPairInfo);
        }
    }
}
