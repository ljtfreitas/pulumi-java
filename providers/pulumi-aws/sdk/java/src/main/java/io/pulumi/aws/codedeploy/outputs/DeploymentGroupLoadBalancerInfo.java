// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.codedeploy.outputs;

import io.pulumi.aws.codedeploy.outputs.DeploymentGroupLoadBalancerInfoElbInfo;
import io.pulumi.aws.codedeploy.outputs.DeploymentGroupLoadBalancerInfoTargetGroupInfo;
import io.pulumi.aws.codedeploy.outputs.DeploymentGroupLoadBalancerInfoTargetGroupPairInfo;
import io.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DeploymentGroupLoadBalancerInfo {
    /**
     * The Classic Elastic Load Balancer to use in a deployment. Conflicts with `target_group_info` and `target_group_pair_info`.
     * 
     */
    private final @Nullable List<DeploymentGroupLoadBalancerInfoElbInfo> elbInfos;
    /**
     * The (Application/Network Load Balancer) target group to use in a deployment. Conflicts with `elb_info` and `target_group_pair_info`.
     * 
     */
    private final @Nullable List<DeploymentGroupLoadBalancerInfoTargetGroupInfo> targetGroupInfos;
    /**
     * The (Application/Network Load Balancer) target group pair to use in a deployment. Conflicts with `elb_info` and `target_group_info`.
     * 
     */
    private final @Nullable DeploymentGroupLoadBalancerInfoTargetGroupPairInfo targetGroupPairInfo;

    @CustomType.Constructor
    private DeploymentGroupLoadBalancerInfo(
        @CustomType.Parameter("elbInfos") @Nullable List<DeploymentGroupLoadBalancerInfoElbInfo> elbInfos,
        @CustomType.Parameter("targetGroupInfos") @Nullable List<DeploymentGroupLoadBalancerInfoTargetGroupInfo> targetGroupInfos,
        @CustomType.Parameter("targetGroupPairInfo") @Nullable DeploymentGroupLoadBalancerInfoTargetGroupPairInfo targetGroupPairInfo) {
        this.elbInfos = elbInfos;
        this.targetGroupInfos = targetGroupInfos;
        this.targetGroupPairInfo = targetGroupPairInfo;
    }

    /**
     * The Classic Elastic Load Balancer to use in a deployment. Conflicts with `target_group_info` and `target_group_pair_info`.
     * 
    */
    public List<DeploymentGroupLoadBalancerInfoElbInfo> getElbInfos() {
        return this.elbInfos == null ? List.of() : this.elbInfos;
    }
    /**
     * The (Application/Network Load Balancer) target group to use in a deployment. Conflicts with `elb_info` and `target_group_pair_info`.
     * 
    */
    public List<DeploymentGroupLoadBalancerInfoTargetGroupInfo> getTargetGroupInfos() {
        return this.targetGroupInfos == null ? List.of() : this.targetGroupInfos;
    }
    /**
     * The (Application/Network Load Balancer) target group pair to use in a deployment. Conflicts with `elb_info` and `target_group_info`.
     * 
    */
    public Optional<DeploymentGroupLoadBalancerInfoTargetGroupPairInfo> getTargetGroupPairInfo() {
        return Optional.ofNullable(this.targetGroupPairInfo);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeploymentGroupLoadBalancerInfo defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<DeploymentGroupLoadBalancerInfoElbInfo> elbInfos;
        private @Nullable List<DeploymentGroupLoadBalancerInfoTargetGroupInfo> targetGroupInfos;
        private @Nullable DeploymentGroupLoadBalancerInfoTargetGroupPairInfo targetGroupPairInfo;

        public Builder() {
    	      // Empty
        }

        public Builder(DeploymentGroupLoadBalancerInfo defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.elbInfos = defaults.elbInfos;
    	      this.targetGroupInfos = defaults.targetGroupInfos;
    	      this.targetGroupPairInfo = defaults.targetGroupPairInfo;
        }

        public Builder elbInfos(@Nullable List<DeploymentGroupLoadBalancerInfoElbInfo> elbInfos) {
            this.elbInfos = elbInfos;
            return this;
        }

        public Builder targetGroupInfos(@Nullable List<DeploymentGroupLoadBalancerInfoTargetGroupInfo> targetGroupInfos) {
            this.targetGroupInfos = targetGroupInfos;
            return this;
        }

        public Builder targetGroupPairInfo(@Nullable DeploymentGroupLoadBalancerInfoTargetGroupPairInfo targetGroupPairInfo) {
            this.targetGroupPairInfo = targetGroupPairInfo;
            return this;
        }
        public DeploymentGroupLoadBalancerInfo build() {
            return new DeploymentGroupLoadBalancerInfo(elbInfos, targetGroupInfos, targetGroupPairInfo);
        }
    }
}
