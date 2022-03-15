// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.codedeploy.outputs;

import io.pulumi.aws.codedeploy.outputs.DeploymentGroupLoadBalancerInfoTargetGroupPairInfoProdTrafficRoute;
import io.pulumi.aws.codedeploy.outputs.DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTargetGroup;
import io.pulumi.aws.codedeploy.outputs.DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTestTrafficRoute;
import io.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DeploymentGroupLoadBalancerInfoTargetGroupPairInfo {
    /**
     * Configuration block for the production traffic route (documented below).
     * 
     */
    private final DeploymentGroupLoadBalancerInfoTargetGroupPairInfoProdTrafficRoute prodTrafficRoute;
    /**
     * Configuration blocks for a target group within a target group pair (documented below).
     * 
     */
    private final List<DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTargetGroup> targetGroups;
    /**
     * Configuration block for the test traffic route (documented below).
     * 
     */
    private final @Nullable DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTestTrafficRoute testTrafficRoute;

    @CustomType.Constructor
    private DeploymentGroupLoadBalancerInfoTargetGroupPairInfo(
        @CustomType.Parameter("prodTrafficRoute") DeploymentGroupLoadBalancerInfoTargetGroupPairInfoProdTrafficRoute prodTrafficRoute,
        @CustomType.Parameter("targetGroups") List<DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTargetGroup> targetGroups,
        @CustomType.Parameter("testTrafficRoute") @Nullable DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTestTrafficRoute testTrafficRoute) {
        this.prodTrafficRoute = prodTrafficRoute;
        this.targetGroups = targetGroups;
        this.testTrafficRoute = testTrafficRoute;
    }

    /**
     * Configuration block for the production traffic route (documented below).
     * 
    */
    public DeploymentGroupLoadBalancerInfoTargetGroupPairInfoProdTrafficRoute getProdTrafficRoute() {
        return this.prodTrafficRoute;
    }
    /**
     * Configuration blocks for a target group within a target group pair (documented below).
     * 
    */
    public List<DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTargetGroup> getTargetGroups() {
        return this.targetGroups;
    }
    /**
     * Configuration block for the test traffic route (documented below).
     * 
    */
    public Optional<DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTestTrafficRoute> getTestTrafficRoute() {
        return Optional.ofNullable(this.testTrafficRoute);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeploymentGroupLoadBalancerInfoTargetGroupPairInfo defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeploymentGroupLoadBalancerInfoTargetGroupPairInfoProdTrafficRoute prodTrafficRoute;
        private List<DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTargetGroup> targetGroups;
        private @Nullable DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTestTrafficRoute testTrafficRoute;

        public Builder() {
    	      // Empty
        }

        public Builder(DeploymentGroupLoadBalancerInfoTargetGroupPairInfo defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.prodTrafficRoute = defaults.prodTrafficRoute;
    	      this.targetGroups = defaults.targetGroups;
    	      this.testTrafficRoute = defaults.testTrafficRoute;
        }

        public Builder prodTrafficRoute(DeploymentGroupLoadBalancerInfoTargetGroupPairInfoProdTrafficRoute prodTrafficRoute) {
            this.prodTrafficRoute = Objects.requireNonNull(prodTrafficRoute);
            return this;
        }

        public Builder targetGroups(List<DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTargetGroup> targetGroups) {
            this.targetGroups = Objects.requireNonNull(targetGroups);
            return this;
        }

        public Builder testTrafficRoute(@Nullable DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTestTrafficRoute testTrafficRoute) {
            this.testTrafficRoute = testTrafficRoute;
            return this;
        }
        public DeploymentGroupLoadBalancerInfoTargetGroupPairInfo build() {
            return new DeploymentGroupLoadBalancerInfoTargetGroupPairInfo(prodTrafficRoute, targetGroups, testTrafficRoute);
        }
    }
}
