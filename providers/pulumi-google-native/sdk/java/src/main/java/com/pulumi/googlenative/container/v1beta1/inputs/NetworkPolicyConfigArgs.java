// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.container.v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Configuration for NetworkPolicy. This only tracks whether the addon is enabled or not on the Master, it does not track whether network policy is enabled for the nodes.
 * 
 */
public final class NetworkPolicyConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final NetworkPolicyConfigArgs Empty = new NetworkPolicyConfigArgs();

    /**
     * Whether NetworkPolicy is enabled for this cluster.
     * 
     */
    @Import(name="disabled")
    private @Nullable Output<Boolean> disabled;

    /**
     * @return Whether NetworkPolicy is enabled for this cluster.
     * 
     */
    public Optional<Output<Boolean>> disabled() {
        return Optional.ofNullable(this.disabled);
    }

    private NetworkPolicyConfigArgs() {}

    private NetworkPolicyConfigArgs(NetworkPolicyConfigArgs $) {
        this.disabled = $.disabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NetworkPolicyConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NetworkPolicyConfigArgs $;

        public Builder() {
            $ = new NetworkPolicyConfigArgs();
        }

        public Builder(NetworkPolicyConfigArgs defaults) {
            $ = new NetworkPolicyConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param disabled Whether NetworkPolicy is enabled for this cluster.
         * 
         * @return builder
         * 
         */
        public Builder disabled(@Nullable Output<Boolean> disabled) {
            $.disabled = disabled;
            return this;
        }

        /**
         * @param disabled Whether NetworkPolicy is enabled for this cluster.
         * 
         * @return builder
         * 
         */
        public Builder disabled(Boolean disabled) {
            return disabled(Output.of(disabled));
        }

        public NetworkPolicyConfigArgs build() {
            return $;
        }
    }

}
