// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.route53recoverycontrol;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RoutingControlArgs extends io.pulumi.resources.ResourceArgs {

    public static final RoutingControlArgs Empty = new RoutingControlArgs();

    /**
     * ARN of the cluster in which this routing control will reside.
     * 
     */
    @Import(name="clusterArn", required=true)
      private final Output<String> clusterArn;

    public Output<String> getClusterArn() {
        return this.clusterArn;
    }

    /**
     * ARN of the control panel in which this routing control will reside.
     * 
     */
    @Import(name="controlPanelArn")
      private final @Nullable Output<String> controlPanelArn;

    public Output<String> getControlPanelArn() {
        return this.controlPanelArn == null ? Output.empty() : this.controlPanelArn;
    }

    /**
     * The name describing the routing control.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    public RoutingControlArgs(
        Output<String> clusterArn,
        @Nullable Output<String> controlPanelArn,
        @Nullable Output<String> name) {
        this.clusterArn = Objects.requireNonNull(clusterArn, "expected parameter 'clusterArn' to be non-null");
        this.controlPanelArn = controlPanelArn;
        this.name = name;
    }

    private RoutingControlArgs() {
        this.clusterArn = Output.empty();
        this.controlPanelArn = Output.empty();
        this.name = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RoutingControlArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> clusterArn;
        private @Nullable Output<String> controlPanelArn;
        private @Nullable Output<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(RoutingControlArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterArn = defaults.clusterArn;
    	      this.controlPanelArn = defaults.controlPanelArn;
    	      this.name = defaults.name;
        }

        public Builder clusterArn(Output<String> clusterArn) {
            this.clusterArn = Objects.requireNonNull(clusterArn);
            return this;
        }

        public Builder clusterArn(String clusterArn) {
            this.clusterArn = Output.of(Objects.requireNonNull(clusterArn));
            return this;
        }

        public Builder controlPanelArn(@Nullable Output<String> controlPanelArn) {
            this.controlPanelArn = controlPanelArn;
            return this;
        }

        public Builder controlPanelArn(@Nullable String controlPanelArn) {
            this.controlPanelArn = Output.ofNullable(controlPanelArn);
            return this;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }
        public RoutingControlArgs build() {
            return new RoutingControlArgs(clusterArn, controlPanelArn, name);
        }
    }
}
