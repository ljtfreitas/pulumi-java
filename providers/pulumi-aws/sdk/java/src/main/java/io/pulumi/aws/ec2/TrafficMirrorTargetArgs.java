// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TrafficMirrorTargetArgs extends io.pulumi.resources.ResourceArgs {

    public static final TrafficMirrorTargetArgs Empty = new TrafficMirrorTargetArgs();

    /**
     * A description of the traffic mirror session.
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The network interface ID that is associated with the target.
     * 
     */
    @InputImport(name="networkInterfaceId")
    private final @Nullable Input<String> networkInterfaceId;

    public Input<String> getNetworkInterfaceId() {
        return this.networkInterfaceId == null ? Input.empty() : this.networkInterfaceId;
    }

    /**
     * The Amazon Resource Name (ARN) of the Network Load Balancer that is associated with the target.
     * 
     */
    @InputImport(name="networkLoadBalancerArn")
    private final @Nullable Input<String> networkLoadBalancerArn;

    public Input<String> getNetworkLoadBalancerArn() {
        return this.networkLoadBalancerArn == null ? Input.empty() : this.networkLoadBalancerArn;
    }

    /**
     * Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public TrafficMirrorTargetArgs(
        @Nullable Input<String> description,
        @Nullable Input<String> networkInterfaceId,
        @Nullable Input<String> networkLoadBalancerArn,
        @Nullable Input<Map<String,String>> tags) {
        this.description = description;
        this.networkInterfaceId = networkInterfaceId;
        this.networkLoadBalancerArn = networkLoadBalancerArn;
        this.tags = tags;
    }

    private TrafficMirrorTargetArgs() {
        this.description = Input.empty();
        this.networkInterfaceId = Input.empty();
        this.networkLoadBalancerArn = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TrafficMirrorTargetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private @Nullable Input<String> networkInterfaceId;
        private @Nullable Input<String> networkLoadBalancerArn;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(TrafficMirrorTargetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.networkInterfaceId = defaults.networkInterfaceId;
    	      this.networkLoadBalancerArn = defaults.networkLoadBalancerArn;
    	      this.tags = defaults.tags;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setNetworkInterfaceId(@Nullable Input<String> networkInterfaceId) {
            this.networkInterfaceId = networkInterfaceId;
            return this;
        }

        public Builder setNetworkInterfaceId(@Nullable String networkInterfaceId) {
            this.networkInterfaceId = Input.ofNullable(networkInterfaceId);
            return this;
        }

        public Builder setNetworkLoadBalancerArn(@Nullable Input<String> networkLoadBalancerArn) {
            this.networkLoadBalancerArn = networkLoadBalancerArn;
            return this;
        }

        public Builder setNetworkLoadBalancerArn(@Nullable String networkLoadBalancerArn) {
            this.networkLoadBalancerArn = Input.ofNullable(networkLoadBalancerArn);
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
        public TrafficMirrorTargetArgs build() {
            return new TrafficMirrorTargetArgs(description, networkInterfaceId, networkLoadBalancerArn, tags);
        }
    }
}
